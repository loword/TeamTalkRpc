package com.grpc.manager_role;

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
    value = "by gRPC proto compiler (version 1.13.2)",
    comments = "Source: manager_role.proto")
public final class MRServiceGrpc {

  private MRServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.manager_role.MRService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getListMRMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getListMRMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse> getListMRMethod;
    if ((getListMRMethod = MRServiceGrpc.getListMRMethod) == null) {
      synchronized (MRServiceGrpc.class) {
        if ((getListMRMethod = MRServiceGrpc.getListMRMethod) == null) {
          MRServiceGrpc.getListMRMethod = getListMRMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager_role.MRService", "listMR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MRServiceMethodDescriptorSupplier("listMR"))
                  .build();
          }
        }
     }
     return getListMRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getAddMRMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getAddMRMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse> getAddMRMethod;
    if ((getAddMRMethod = MRServiceGrpc.getAddMRMethod) == null) {
      synchronized (MRServiceGrpc.class) {
        if ((getAddMRMethod = MRServiceGrpc.getAddMRMethod) == null) {
          MRServiceGrpc.getAddMRMethod = getAddMRMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager_role.MRService", "addMR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MRServiceMethodDescriptorSupplier("addMR"))
                  .build();
          }
        }
     }
     return getAddMRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getRemoveMRMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getRemoveMRMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse> getRemoveMRMethod;
    if ((getRemoveMRMethod = MRServiceGrpc.getRemoveMRMethod) == null) {
      synchronized (MRServiceGrpc.class) {
        if ((getRemoveMRMethod = MRServiceGrpc.getRemoveMRMethod) == null) {
          MRServiceGrpc.getRemoveMRMethod = getRemoveMRMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager_role.MRService", "removeMR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MRServiceMethodDescriptorSupplier("removeMR"))
                  .build();
          }
        }
     }
     return getRemoveMRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getModifyMRMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest,
      com.grpc.manager_role.MRResponse> getModifyMRMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse> getModifyMRMethod;
    if ((getModifyMRMethod = MRServiceGrpc.getModifyMRMethod) == null) {
      synchronized (MRServiceGrpc.class) {
        if ((getModifyMRMethod = MRServiceGrpc.getModifyMRMethod) == null) {
          MRServiceGrpc.getModifyMRMethod = getModifyMRMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager_role.MRRequest, com.grpc.manager_role.MRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager_role.MRService", "modifyMR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager_role.MRResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MRServiceMethodDescriptorSupplier("modifyMR"))
                  .build();
          }
        }
     }
     return getModifyMRMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MRServiceStub newStub(io.grpc.Channel channel) {
    return new MRServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MRServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MRServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MRServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MRServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MRServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMRMethod(), responseObserver);
    }

    /**
     */
    public void addMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMRMethod(), responseObserver);
    }

    /**
     */
    public void removeMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMRMethod(), responseObserver);
    }

    /**
     */
    public void modifyMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyMRMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMRMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager_role.MRRequest,
                com.grpc.manager_role.MRResponse>(
                  this, METHODID_LIST_MR)))
          .addMethod(
            getAddMRMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager_role.MRRequest,
                com.grpc.manager_role.MRResponse>(
                  this, METHODID_ADD_MR)))
          .addMethod(
            getRemoveMRMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager_role.MRRequest,
                com.grpc.manager_role.MRResponse>(
                  this, METHODID_REMOVE_MR)))
          .addMethod(
            getModifyMRMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager_role.MRRequest,
                com.grpc.manager_role.MRResponse>(
                  this, METHODID_MODIFY_MR)))
          .build();
    }
  }

  /**
   */
  public static final class MRServiceStub extends io.grpc.stub.AbstractStub<MRServiceStub> {
    private MRServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MRServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MRServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MRServiceStub(channel, callOptions);
    }

    /**
     */
    public void listMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyMR(com.grpc.manager_role.MRRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyMRMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MRServiceBlockingStub extends io.grpc.stub.AbstractStub<MRServiceBlockingStub> {
    private MRServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MRServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MRServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MRServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.manager_role.MRResponse listMR(com.grpc.manager_role.MRRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMRMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager_role.MRResponse addMR(com.grpc.manager_role.MRRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMRMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager_role.MRResponse removeMR(com.grpc.manager_role.MRRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMRMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager_role.MRResponse modifyMR(com.grpc.manager_role.MRRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyMRMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MRServiceFutureStub extends io.grpc.stub.AbstractStub<MRServiceFutureStub> {
    private MRServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MRServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MRServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MRServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager_role.MRResponse> listMR(
        com.grpc.manager_role.MRRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager_role.MRResponse> addMR(
        com.grpc.manager_role.MRRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager_role.MRResponse> removeMR(
        com.grpc.manager_role.MRRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager_role.MRResponse> modifyMR(
        com.grpc.manager_role.MRRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyMRMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MR = 0;
  private static final int METHODID_ADD_MR = 1;
  private static final int METHODID_REMOVE_MR = 2;
  private static final int METHODID_MODIFY_MR = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MRServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MRServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MR:
          serviceImpl.listMR((com.grpc.manager_role.MRRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse>) responseObserver);
          break;
        case METHODID_ADD_MR:
          serviceImpl.addMR((com.grpc.manager_role.MRRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MR:
          serviceImpl.removeMR((com.grpc.manager_role.MRRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MR:
          serviceImpl.modifyMR((com.grpc.manager_role.MRRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager_role.MRResponse>) responseObserver);
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

  private static abstract class MRServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MRServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.manager_role.ManagerRole.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MRService");
    }
  }

  private static final class MRServiceFileDescriptorSupplier
      extends MRServiceBaseDescriptorSupplier {
    MRServiceFileDescriptorSupplier() {}
  }

  private static final class MRServiceMethodDescriptorSupplier
      extends MRServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MRServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MRServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MRServiceFileDescriptorSupplier())
              .addMethod(getListMRMethod())
              .addMethod(getAddMRMethod())
              .addMethod(getRemoveMRMethod())
              .addMethod(getModifyMRMethod())
              .build();
        }
      }
    }
    return result;
  }
}
