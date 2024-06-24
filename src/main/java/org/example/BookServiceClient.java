package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.example.bookstore.*;

import java.util.Iterator;
import java.util.Arrays;

public class BookServiceClient {
    private final ManagedChannel channel;
    private final BookServiceGrpc.BookServiceBlockingStub blockingStub;

    public BookServiceClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = BookServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        channel.shutdown();
    }

    public void addBook(String isbn, String title, String[] authors, int pageCount) {
        Book.Builder bookBuilder = Book.newBuilder().setIsbn(isbn).setTitle(title).setPageCount(pageCount);
        for (String author : authors) {
            bookBuilder.addAuthors(author);
        }
        AddBookRequest request = AddBookRequest.newBuilder().setBook(bookBuilder.build()).build();
        AddBookResponse response;
        try {
            response = blockingStub.addBook(request);
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(String isbn, String title, String[] authors, int pageCount) {
        Book.Builder bookBuilder = Book.newBuilder().setIsbn(isbn).setTitle(title).setPageCount(pageCount);
        for (String author : authors) {
            bookBuilder.addAuthors(author);
        }
        UpdateBookRequest request = UpdateBookRequest.newBuilder().setBook(bookBuilder.build()).build();
        UpdateBookResponse response;
        try {
            response = blockingStub.updateBook(request);
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(String isbn) {
        DeleteBookRequest request = DeleteBookRequest.newBuilder().setIsbn(isbn).build();
        DeleteBookResponse response;
        try {
            response = blockingStub.deleteBook(request);
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public void getBooks() {
        GetBooksRequest request = GetBooksRequest.newBuilder().build();
        GetBooksResponse response;
        try {
            response = blockingStub.getBooks(request);
            for (Book book : response.getBooksList()) {
                System.out.println("Book: " + book.getTitle() + " by " + String.join(", ", book.getAuthorsList()));
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BookServiceClient client = new BookServiceClient("localhost", 8080);

        client.addBook("1234567891", "Book One", new String[]{"Author One", "Author Two"}, 200);
        client.getBooks();
        client.updateBook("1234567891", "Updated Book One", new String[]{"Updated Author One", "Updated Author Two"}, 250);
        client.getBooks();
        client.deleteBook("1234567891");
        client.getBooks();

        client.shutdown();
    }
}
