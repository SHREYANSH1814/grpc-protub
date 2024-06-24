package org.example;

import io.grpc.stub.StreamObserver;
import org.example.bookstore.*;

import javax.lang.model.type.NullType;
import java.util.HashMap;
import java.util.Map;

public class BookService extends BookServiceGrpc.BookServiceImplBase {
    public final Map<String, Book> bookStorage = new HashMap<>();

    @Override
    public void addBook(AddBookRequest request, StreamObserver<AddBookResponse> responseObserver) {
        Book book = request.getBook();
        String isbn = book.getIsbn();
        if (bookStorage.containsKey(isbn)) {
            responseObserver.onNext(AddBookResponse.newBuilder().setSuccess(false).setMessage("Book already exists").build());
        } else {
            bookStorage.put(isbn, book);
            responseObserver.onNext(AddBookResponse.newBuilder().setSuccess(true).setMessage("Book added successfully").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void updateBook(UpdateBookRequest request, StreamObserver<UpdateBookResponse> responseObserver) {
        Book book = request.getBook();
        String isbn = book.getIsbn();
        if (bookStorage.containsKey(isbn)) {
            bookStorage.put(isbn, book);
            responseObserver.onNext(UpdateBookResponse.newBuilder().setSuccess(true).setMessage("Book updated successfully").build());
        } else {
            responseObserver.onNext(UpdateBookResponse.newBuilder().setSuccess(false).setMessage("Book not found").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteBook(DeleteBookRequest request, StreamObserver<DeleteBookResponse> responseObserver) {
        String isbn = request.getIsbn();
        if (bookStorage.containsKey(isbn)) {
            bookStorage.remove(isbn);
            responseObserver.onNext(DeleteBookResponse.newBuilder().setSuccess(true).setMessage("Book deleted successfully").build());
        } else {
            responseObserver.onNext(DeleteBookResponse.newBuilder().setSuccess(false).setMessage("Book not found").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getBooks(GetBooksRequest request, StreamObserver<GetBooksResponse> responseObserver) {
        GetBooksResponse.Builder responseBuilder = GetBooksResponse.newBuilder();
        responseBuilder.addAllBooks(bookStorage.values());
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    //method for inserting data into database
    public void insert(AddBookRequest request) {
        Book book = request.getBook();
        String isbn = book.getIsbn();
        if (!bookStorage.containsKey(isbn)) {
            bookStorage.put(isbn, book);
        }
    }

    //method for deleting data into database

    public void delete(String key) {
        if (bookStorage.containsKey(key)) {
            bookStorage.remove(key);

        }

    }
    // method for searching in database

     public Book  Search(String key){
        if(bookStorage.containsKey(key)){
            return bookStorage.get(key);
        }
        return null;

    }

}

