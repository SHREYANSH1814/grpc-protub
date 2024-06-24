
import io.grpc.stub.StreamObserver;
import org.example.BookService;
import org.example.bookstore.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    private BookService bookService;

    //Insert some Test data into db
    @BeforeEach
    public void setUp() {
        bookService = new BookService();
        AddBookRequest request1 = AddBookRequest.newBuilder()
                .setBook(Book.newBuilder().setIsbn("1234567890").setTitle("Test Book 1").build())
                .build();
        AddBookRequest request2 = AddBookRequest.newBuilder()
                .setBook(Book.newBuilder().setIsbn("1234567899").setTitle("Test Book 2").build())
                .build();
        bookService.insert(request1);
        bookService.insert(request2);


    }
    //delete the test data from db
    @AfterEach
    public void unsetUp(){
        bookService.delete("1234567890");
        bookService.delete("1234567899");


    }


    @Test
    public void addbooktest() {
        @SuppressWarnings("unchecked")
        StreamObserver<AddBookResponse> responseObserver = Mockito.mock(StreamObserver.class);

        // Create a test AddBookRequest
        AddBookRequest request = AddBookRequest.newBuilder()
                .setBook(Book.newBuilder().setIsbn("1234567891").setTitle("Test Book").build())
                .build();


        bookService.addBook(request, responseObserver);

        // Verify the response
        ArgumentCaptor<AddBookResponse> responseCaptor = ArgumentCaptor.forClass(AddBookResponse.class);
        Mockito.verify(responseObserver).onNext(responseCaptor.capture());
        AddBookResponse response = responseCaptor.getValue();
        assertTrue(response.getSuccess());
        assertEquals("Book added successfully", response.getMessage());

        assertNotNull(bookService.Search("1234567891"),"add bookservice get failed");

    }

    @Test
    public void updateBooktest() {
        
        @SuppressWarnings("unchecked")
        StreamObserver<UpdateBookResponse> responseObserver = Mockito.mock(StreamObserver.class);


        UpdateBookRequest request = UpdateBookRequest.newBuilder()
                .setBook(Book.newBuilder().setIsbn("1234567890").setTitle("Updated Title").build())
                .build();

        bookService.updateBook(request, responseObserver);

        ArgumentCaptor<UpdateBookResponse> responseCaptor = ArgumentCaptor.forClass(UpdateBookResponse.class);
        Mockito.verify(responseObserver).onNext(responseCaptor.capture());
        UpdateBookResponse response = responseCaptor.getValue();
        assertTrue(response.getSuccess());
        assertEquals("Book updated successfully", response.getMessage(),"update test  bookservice failed");

        // Verify that the book was updated
        assertEquals("Updated Title", bookService.Search("1234567890").getTitle());
    }

    @Test
    public void testDeleteBook() {
        // Add a book to delete later


        // Create a mock StreamObserver for DeleteBookResponse
        @SuppressWarnings("unchecked")
        StreamObserver<DeleteBookResponse> responseObserver = Mockito.mock(StreamObserver.class);

        // Create a test DeleteBookRequest
        DeleteBookRequest request = DeleteBookRequest.newBuilder().setIsbn("1234567890").build();

        // Call the deleteBook method
        bookService.deleteBook(request, responseObserver);

        // Verify the response
        ArgumentCaptor<DeleteBookResponse> responseCaptor = ArgumentCaptor.forClass(DeleteBookResponse.class);
        Mockito.verify(responseObserver).onNext(responseCaptor.capture());
        DeleteBookResponse response = responseCaptor.getValue();
        assertTrue(response.getSuccess());
        assertEquals("Book deleted successfully", response.getMessage());

        // Verify that the book was deleted
        assertNull(bookService.Search("1234567890"),"delete bookservice get failed");
    }

    @Test
    public void getBookstest() {
        // Add some books to the service



        @SuppressWarnings("unchecked")
        StreamObserver<GetBooksResponse> responseObserver = Mockito.mock(StreamObserver.class);


        GetBooksRequest request = GetBooksRequest.newBuilder().build();


        bookService.getBooks(request, responseObserver);

        // Verify the response
        ArgumentCaptor<GetBooksResponse> responseCaptor = ArgumentCaptor.forClass(GetBooksResponse.class);
        Mockito.verify(responseObserver).onNext(responseCaptor.capture());
        GetBooksResponse response = responseCaptor.getValue();
        assertEquals(2, response.getBooksCount(),"getBook Bookservice get failed"); // Assuming we added 2 books
        // Verify books content if needed
    }
}
