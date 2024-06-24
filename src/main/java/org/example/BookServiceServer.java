package org.example;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


public class BookServiceServer {
    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.printf("Hello and welcome!");

        Server server = ServerBuilder.forPort(8080).addService(new BookService()).build();

        System.out.println("Server started at port 8080");
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down server...");
            if (server != null) {
                server.shutdown();
            }
        }));

        server.awaitTermination();
    }
}

