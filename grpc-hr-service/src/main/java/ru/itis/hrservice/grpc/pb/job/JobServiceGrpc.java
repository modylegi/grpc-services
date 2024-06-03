package ru.itis.hrservice.grpc.pb.job;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: job.proto")
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "JobService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest,
      ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> METHOD_GET_ALL_JOBS = getGetAllJobsMethod();

  private static volatile io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest,
      ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> getGetAllJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest,
      ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> getGetAllJobsMethod() {
    io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest, ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> getGetAllJobsMethod;
    if ((getGetAllJobsMethod = JobServiceGrpc.getGetAllJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetAllJobsMethod = JobServiceGrpc.getGetAllJobsMethod) == null) {
          JobServiceGrpc.getGetAllJobsMethod = getGetAllJobsMethod = 
              io.grpc.MethodDescriptor.<ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest, ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "JobService", "GetAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetAllJobs"))
                  .build();
          }
        }
     }
     return getGetAllJobsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    return new JobServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllJobs(ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest request,
        io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllJobsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest,
                ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse>(
                  this, METHODID_GET_ALL_JOBS)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractStub<JobServiceStub> {
    private JobServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllJobs(ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest request,
        io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllJobsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse getAllJobs(ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllJobsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractStub<JobServiceFutureStub> {
    private JobServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse> getAllJobs(
        ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllJobsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_JOBS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_JOBS:
          serviceImpl.getAllJobs((ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest) request,
              (io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.job.GetAllJobsResponse>) responseObserver);
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

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.itis.hrservice.grpc.pb.job.Job.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getGetAllJobsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
