// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cv.proto

package ru.itis.hrservice.grpc.pb.cv;

public final class Cv {
  private Cv() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CVRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CVRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CVResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CVResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllCVsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllCVsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllCVsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllCVsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010cv.proto\"\027\n\tCVRequest\022\n\n\002id\030\001 \001(\t\"\'\n\nC" +
      "VResponse\022\n\n\002id\030\001 \001(\t\022\r\n\005skill\030\002 \001(\t\"\022\n\020" +
      "GetAllCVsRequest\"-\n\021GetAllCVsResponse\022\030\n" +
      "\003cvs\030\001 \003(\0132\013.CVResponse2A\n\tCVService\0224\n\t" +
      "GetAllCVs\022\021.GetAllCVsRequest\032\022.GetAllCVs" +
      "Response\"\000B \n\034ru.itis.hrservice.grpc.pb." +
      "cvP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CVRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CVRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CVRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_CVResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CVResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CVResponse_descriptor,
        new java.lang.String[] { "Id", "Skill", });
    internal_static_GetAllCVsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetAllCVsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllCVsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetAllCVsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetAllCVsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllCVsResponse_descriptor,
        new java.lang.String[] { "Cvs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
