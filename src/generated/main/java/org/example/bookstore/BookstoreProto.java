// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bookstore.proto

// Protobuf Java Version: 3.25.1
package org.example.bookstore;

public final class BookstoreProto {
  private BookstoreProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddBookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddBookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddBookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddBookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateBookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateBookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateBookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateBookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteBookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteBookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteBookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteBookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBooksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBooksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBooksResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017bookstore.proto\"H\n\004Book\022\014\n\004isbn\030\001 \001(\t\022" +
      "\r\n\005title\030\002 \001(\t\022\017\n\007authors\030\003 \003(\t\022\022\n\npage_" +
      "count\030\004 \001(\005\"%\n\016AddBookRequest\022\023\n\004book\030\001 " +
      "\001(\0132\005.Book\"3\n\017AddBookResponse\022\017\n\007success" +
      "\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\"(\n\021UpdateBookReq" +
      "uest\022\023\n\004book\030\001 \001(\0132\005.Book\"6\n\022UpdateBookR" +
      "esponse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002 \001(" +
      "\t\"!\n\021DeleteBookRequest\022\014\n\004isbn\030\001 \001(\t\"6\n\022" +
      "DeleteBookResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007m" +
      "essage\030\002 \001(\t\"\021\n\017GetBooksRequest\"(\n\020GetBo" +
      "oksResponse\022\024\n\005books\030\001 \003(\0132\005.Book2\342\001\n\013Bo" +
      "okService\022.\n\007AddBook\022\017.AddBookRequest\032\020." +
      "AddBookResponse\"\000\0227\n\nUpdateBook\022\022.Update" +
      "BookRequest\032\023.UpdateBookResponse\"\000\0227\n\nDe" +
      "leteBook\022\022.DeleteBookRequest\032\023.DeleteBoo" +
      "kResponse\"\000\0221\n\010GetBooks\022\020.GetBooksReques" +
      "t\032\021.GetBooksResponse\"\000B)\n\025org.example.bo" +
      "okstoreB\016BookstoreProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Book_descriptor,
        new java.lang.String[] { "Isbn", "Title", "Authors", "PageCount", });
    internal_static_AddBookRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AddBookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddBookRequest_descriptor,
        new java.lang.String[] { "Book", });
    internal_static_AddBookResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AddBookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddBookResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_UpdateBookRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UpdateBookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateBookRequest_descriptor,
        new java.lang.String[] { "Book", });
    internal_static_UpdateBookResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UpdateBookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateBookResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_DeleteBookRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DeleteBookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteBookRequest_descriptor,
        new java.lang.String[] { "Isbn", });
    internal_static_DeleteBookResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DeleteBookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteBookResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_GetBooksRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetBooksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBooksRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetBooksResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GetBooksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBooksResponse_descriptor,
        new java.lang.String[] { "Books", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}