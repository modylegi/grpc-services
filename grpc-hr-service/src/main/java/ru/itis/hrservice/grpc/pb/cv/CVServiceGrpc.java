package ru.itis.hrservice.grpc.pb.cv;

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
    comments = "Source: cv.proto")
public final class CVServiceGrpc {

  private CVServiceGrpc() {}

  public static final String SERVICE_NAME = "CVService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllCVsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest,
      ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> METHOD_GET_ALL_CVS = getGetAllCVsMethod();

  private static volatile io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest,
      ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> getGetAllCVsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest,
      ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> getGetAllCVsMethod() {
    io.grpc.MethodDescriptor<ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest, ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> getGetAllCVsMethod;
    if ((getGetAllCVsMethod = CVServiceGrpc.getGetAllCVsMethod) == null) {
      synchronized (CVServiceGrpc.class) {
        if ((getGetAllCVsMethod = CVServiceGrpc.getGetAllCVsMethod) == null) {
          CVServiceGrpc.getGetAllCVsMethod = getGetAllCVsMethod = 
              io.grpc.MethodDescriptor.<ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest, ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CVService", "GetAllCVs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CVServiceMethodDescriptorSupplier("GetAllCVs"))
                  .build();
          }
        }
     }
     return getGetAllCVsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CVServiceStub newStub(io.grpc.Channel channel) {
    return new CVServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CVServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CVServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CVServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CVServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CVServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCVs(ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest request,
        io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCVsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCVsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest,
                ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse>(
                  this, METHODID_GET_ALL_CVS)))
          .build();
    }
  }

  /**
   */
  public static final class CVServiceStub extends io.grpc.stub.AbstractStub<CVServiceStub> {
    private CVServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CVServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CVServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CVServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCVs(ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest request,
        io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCVsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CVServiceBlockingStub extends io.grpc.stub.AbstractStub<CVServiceBlockingStub> {
    private CVServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CVServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CVServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CVServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse getAllCVs(ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCVsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CVServiceFutureStub extends io.grpc.stub.AbstractStub<CVServiceFutureStub> {
    private CVServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CVServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CVServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CVServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse> getAllCVs(
        ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCVsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CVS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CVServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CVServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CVS:
          serviceImpl.getAllCVs((ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest) request,
              (io.grpc.stub.StreamObserver<ru.itis.hrservice.grpc.pb.cv.GetAllCVsResponse>) responseObserver);
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

  private static abstract class CVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CVServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.itis.hrservice.grpc.pb.cv.Cv.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CVService");
    }
  }

  private static final class CVServiceFileDescriptorSupplier
      extends CVServiceBaseDescriptorSupplier {
    CVServiceFileDescriptorSupplier() {}
  }

  private static final class CVServiceMethodDescriptorSupplier
      extends CVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CVServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CVServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CVServiceFileDescriptorSupplier())
              .addMethod(getGetAllCVsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
