// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job.proto

package ru.itis.hrservice.grpc.pb.job;

public interface GetAllJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .JobResponse jobs = 1;</code>
   */
  java.util.List<ru.itis.hrservice.grpc.pb.job.JobResponse> 
      getJobsList();
  /**
   * <code>repeated .JobResponse jobs = 1;</code>
   */
  ru.itis.hrservice.grpc.pb.job.JobResponse getJobs(int index);
  /**
   * <code>repeated .JobResponse jobs = 1;</code>
   */
  int getJobsCount();
  /**
   * <code>repeated .JobResponse jobs = 1;</code>
   */
  java.util.List<? extends ru.itis.hrservice.grpc.pb.job.JobResponseOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <code>repeated .JobResponse jobs = 1;</code>
   */
  ru.itis.hrservice.grpc.pb.job.JobResponseOrBuilder getJobsOrBuilder(
      int index);
}