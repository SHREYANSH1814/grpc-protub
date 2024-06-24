package org.example.bookstore;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: bookstore.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.bookstore.AddBookRequest,
      org.example.bookstore.AddBookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBook",
      requestType = org.example.bookstore.AddBookRequest.class,
      responseType = org.example.bookstore.AddBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.bookstore.AddBookRequest,
      org.example.bookstore.AddBookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<org.example.bookstore.AddBookRequest, org.example.bookstore.AddBookResponse> getAddBookMethod;
    if ((getAddBookMethod = BookServiceGrpc.getAddBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getAddBookMethod = BookServiceGrpc.getAddBookMethod) == null) {
          BookServiceGrpc.getAddBookMethod = getAddBookMethod =
              io.grpc.MethodDescriptor.<org.example.bookstore.AddBookRequest, org.example.bookstore.AddBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.AddBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.AddBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("AddBook"))
              .build();
        }
      }
    }
    return getAddBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.bookstore.UpdateBookRequest,
      org.example.bookstore.UpdateBookResponse> getUpdateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBook",
      requestType = org.example.bookstore.UpdateBookRequest.class,
      responseType = org.example.bookstore.UpdateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.bookstore.UpdateBookRequest,
      org.example.bookstore.UpdateBookResponse> getUpdateBookMethod() {
    io.grpc.MethodDescriptor<org.example.bookstore.UpdateBookRequest, org.example.bookstore.UpdateBookResponse> getUpdateBookMethod;
    if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
          BookServiceGrpc.getUpdateBookMethod = getUpdateBookMethod =
              io.grpc.MethodDescriptor.<org.example.bookstore.UpdateBookRequest, org.example.bookstore.UpdateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.UpdateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.UpdateBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("UpdateBook"))
              .build();
        }
      }
    }
    return getUpdateBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.bookstore.DeleteBookRequest,
      org.example.bookstore.DeleteBookResponse> getDeleteBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBook",
      requestType = org.example.bookstore.DeleteBookRequest.class,
      responseType = org.example.bookstore.DeleteBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.bookstore.DeleteBookRequest,
      org.example.bookstore.DeleteBookResponse> getDeleteBookMethod() {
    io.grpc.MethodDescriptor<org.example.bookstore.DeleteBookRequest, org.example.bookstore.DeleteBookResponse> getDeleteBookMethod;
    if ((getDeleteBookMethod = BookServiceGrpc.getDeleteBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getDeleteBookMethod = BookServiceGrpc.getDeleteBookMethod) == null) {
          BookServiceGrpc.getDeleteBookMethod = getDeleteBookMethod =
              io.grpc.MethodDescriptor.<org.example.bookstore.DeleteBookRequest, org.example.bookstore.DeleteBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.DeleteBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.DeleteBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("DeleteBook"))
              .build();
        }
      }
    }
    return getDeleteBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.bookstore.GetBooksRequest,
      org.example.bookstore.GetBooksResponse> getGetBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBooks",
      requestType = org.example.bookstore.GetBooksRequest.class,
      responseType = org.example.bookstore.GetBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.bookstore.GetBooksRequest,
      org.example.bookstore.GetBooksResponse> getGetBooksMethod() {
    io.grpc.MethodDescriptor<org.example.bookstore.GetBooksRequest, org.example.bookstore.GetBooksResponse> getGetBooksMethod;
    if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
          BookServiceGrpc.getGetBooksMethod = getGetBooksMethod =
              io.grpc.MethodDescriptor.<org.example.bookstore.GetBooksRequest, org.example.bookstore.GetBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.GetBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.bookstore.GetBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBooks"))
              .build();
        }
      }
    }
    return getGetBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addBook(org.example.bookstore.AddBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.AddBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     */
    default void updateBook(org.example.bookstore.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.UpdateBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBookMethod(), responseObserver);
    }

    /**
     */
    default void deleteBook(org.example.bookstore.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.DeleteBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBookMethod(), responseObserver);
    }

    /**
     */
    default void getBooks(org.example.bookstore.GetBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.GetBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBooksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookService.
   */
  public static abstract class BookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookService.
   */
  public static final class BookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void addBook(org.example.bookstore.AddBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.AddBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBook(org.example.bookstore.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.UpdateBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBook(org.example.bookstore.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.DeleteBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBooks(org.example.bookstore.GetBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.bookstore.GetBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookService.
   */
  public static final class BookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.bookstore.AddBookResponse addBook(org.example.bookstore.AddBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.bookstore.UpdateBookResponse updateBook(org.example.bookstore.UpdateBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.bookstore.DeleteBookResponse deleteBook(org.example.bookstore.DeleteBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.bookstore.GetBooksResponse getBooks(org.example.bookstore.GetBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookService.
   */
  public static final class BookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.bookstore.AddBookResponse> addBook(
        org.example.bookstore.AddBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.bookstore.UpdateBookResponse> updateBook(
        org.example.bookstore.UpdateBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.bookstore.DeleteBookResponse> deleteBook(
        org.example.bookstore.DeleteBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.bookstore.GetBooksResponse> getBooks(
        org.example.bookstore.GetBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOK = 0;
  private static final int METHODID_UPDATE_BOOK = 1;
  private static final int METHODID_DELETE_BOOK = 2;
  private static final int METHODID_GET_BOOKS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((org.example.bookstore.AddBookRequest) request,
              (io.grpc.stub.StreamObserver<org.example.bookstore.AddBookResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOOK:
          serviceImpl.updateBook((org.example.bookstore.UpdateBookRequest) request,
              (io.grpc.stub.StreamObserver<org.example.bookstore.UpdateBookResponse>) responseObserver);
          break;
        case METHODID_DELETE_BOOK:
          serviceImpl.deleteBook((org.example.bookstore.DeleteBookRequest) request,
              (io.grpc.stub.StreamObserver<org.example.bookstore.DeleteBookResponse>) responseObserver);
          break;
        case METHODID_GET_BOOKS:
          serviceImpl.getBooks((org.example.bookstore.GetBooksRequest) request,
              (io.grpc.stub.StreamObserver<org.example.bookstore.GetBooksResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.bookstore.AddBookRequest,
              org.example.bookstore.AddBookResponse>(
                service, METHODID_ADD_BOOK)))
        .addMethod(
          getUpdateBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.bookstore.UpdateBookRequest,
              org.example.bookstore.UpdateBookResponse>(
                service, METHODID_UPDATE_BOOK)))
        .addMethod(
          getDeleteBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.bookstore.DeleteBookRequest,
              org.example.bookstore.DeleteBookResponse>(
                service, METHODID_DELETE_BOOK)))
        .addMethod(
          getGetBooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.bookstore.GetBooksRequest,
              org.example.bookstore.GetBooksResponse>(
                service, METHODID_GET_BOOKS)))
        .build();
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.bookstore.BookstoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getAddBookMethod())
              .addMethod(getUpdateBookMethod())
              .addMethod(getDeleteBookMethod())
              .addMethod(getGetBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
