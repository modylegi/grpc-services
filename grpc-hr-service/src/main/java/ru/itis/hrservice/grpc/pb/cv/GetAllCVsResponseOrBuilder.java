// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cv.proto

package ru.itis.hrservice.grpc.pb.cv;

public interface GetAllCVsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllCVsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .CVResponse cvs = 1;</code>
   */
  java.util.List<ru.itis.hrservice.grpc.pb.cv.CVResponse> 
      getCvsList();
  /**
   * <code>repeated .CVResponse cvs = 1;</code>
   */
  ru.itis.hrservice.grpc.pb.cv.CVResponse getCvs(int index);
  /**
   * <code>repeated .CVResponse cvs = 1;</code>
   */
  int getCvsCount();
  /**
   * <code>repeated .CVResponse cvs = 1;</code>
   */
  java.util.List<? extends ru.itis.hrservice.grpc.pb.cv.CVResponseOrBuilder> 
      getCvsOrBuilderList();
  /**
   * <code>repeated .CVResponse cvs = 1;</code>
   */
  ru.itis.hrservice.grpc.pb.cv.CVResponseOrBuilder getCvsOrBuilder(
      int index);
}