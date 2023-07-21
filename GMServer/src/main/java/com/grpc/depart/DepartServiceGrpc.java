package com.grpc.depart;

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
    comments = "Source: depart.proto")
public final class DepartServiceGrpc {

  private DepartServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.depart.DepartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getListDepartMethod;

  public static io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getListDepartMethod() {
    io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse> getListDepartMethod;
    if ((getListDepartMethod = DepartServiceGrpc.getListDepartMethod) == null) {
      synchronized (DepartServiceGrpc.class) {
        if ((getListDepartMethod = DepartServiceGrpc.getListDepartMethod) == null) {
          DepartServiceGrpc.getListDepartMethod = getListDepartMethod = 
              io.grpc.MethodDescriptor.<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.depart.DepartService", "listDepart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartServiceMethodDescriptorSupplier("listDepart"))
                  .build();
          }
        }
     }
     return getListDepartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getAddDepartMethod;

  public static io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getAddDepartMethod() {
    io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse> getAddDepartMethod;
    if ((getAddDepartMethod = DepartServiceGrpc.getAddDepartMethod) == null) {
      synchronized (DepartServiceGrpc.class) {
        if ((getAddDepartMethod = DepartServiceGrpc.getAddDepartMethod) == null) {
          DepartServiceGrpc.getAddDepartMethod = getAddDepartMethod = 
              io.grpc.MethodDescriptor.<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.depart.DepartService", "addDepart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartServiceMethodDescriptorSupplier("addDepart"))
                  .build();
          }
        }
     }
     return getAddDepartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getRemoveDepartMethod;

  public static io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getRemoveDepartMethod() {
    io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse> getRemoveDepartMethod;
    if ((getRemoveDepartMethod = DepartServiceGrpc.getRemoveDepartMethod) == null) {
      synchronized (DepartServiceGrpc.class) {
        if ((getRemoveDepartMethod = DepartServiceGrpc.getRemoveDepartMethod) == null) {
          DepartServiceGrpc.getRemoveDepartMethod = getRemoveDepartMethod = 
              io.grpc.MethodDescriptor.<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.depart.DepartService", "removeDepart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartServiceMethodDescriptorSupplier("removeDepart"))
                  .build();
          }
        }
     }
     return getRemoveDepartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getModifyDepartMethod;

  public static io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest,
      com.grpc.depart.DepartResponse> getModifyDepartMethod() {
    io.grpc.MethodDescriptor<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse> getModifyDepartMethod;
    if ((getModifyDepartMethod = DepartServiceGrpc.getModifyDepartMethod) == null) {
      synchronized (DepartServiceGrpc.class) {
        if ((getModifyDepartMethod = DepartServiceGrpc.getModifyDepartMethod) == null) {
          DepartServiceGrpc.getModifyDepartMethod = getModifyDepartMethod = 
              io.grpc.MethodDescriptor.<com.grpc.depart.DepartRequest, com.grpc.depart.DepartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.depart.DepartService", "modifyDepart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.depart.DepartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartServiceMethodDescriptorSupplier("modifyDepart"))
                  .build();
          }
        }
     }
     return getModifyDepartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartServiceStub newStub(io.grpc.Channel channel) {
    return new DepartServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDepartMethod(), responseObserver);
    }

    /**
     */
    public void addDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDepartMethod(), responseObserver);
    }

    /**
     */
    public void removeDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveDepartMethod(), responseObserver);
    }

    /**
     */
    public void modifyDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyDepartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDepartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.depart.DepartRequest,
                com.grpc.depart.DepartResponse>(
                  this, METHODID_LIST_DEPART)))
          .addMethod(
            getAddDepartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.depart.DepartRequest,
                com.grpc.depart.DepartResponse>(
                  this, METHODID_ADD_DEPART)))
          .addMethod(
            getRemoveDepartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.depart.DepartRequest,
                com.grpc.depart.DepartResponse>(
                  this, METHODID_REMOVE_DEPART)))
          .addMethod(
            getModifyDepartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.depart.DepartRequest,
                com.grpc.depart.DepartResponse>(
                  this, METHODID_MODIFY_DEPART)))
          .build();
    }
  }

  /**
   */
  public static final class DepartServiceStub extends io.grpc.stub.AbstractStub<DepartServiceStub> {
    private DepartServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartServiceStub(channel, callOptions);
    }

    /**
     */
    public void listDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDepartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDepartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveDepartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyDepart(com.grpc.depart.DepartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyDepartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartServiceBlockingStub extends io.grpc.stub.AbstractStub<DepartServiceBlockingStub> {
    private DepartServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.depart.DepartResponse listDepart(com.grpc.depart.DepartRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDepartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.depart.DepartResponse addDepart(com.grpc.depart.DepartRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddDepartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.depart.DepartResponse removeDepart(com.grpc.depart.DepartRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveDepartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.depart.DepartResponse modifyDepart(com.grpc.depart.DepartRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyDepartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartServiceFutureStub extends io.grpc.stub.AbstractStub<DepartServiceFutureStub> {
    private DepartServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.depart.DepartResponse> listDepart(
        com.grpc.depart.DepartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDepartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.depart.DepartResponse> addDepart(
        com.grpc.depart.DepartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDepartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.depart.DepartResponse> removeDepart(
        com.grpc.depart.DepartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveDepartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.depart.DepartResponse> modifyDepart(
        com.grpc.depart.DepartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyDepartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DEPART = 0;
  private static final int METHODID_ADD_DEPART = 1;
  private static final int METHODID_REMOVE_DEPART = 2;
  private static final int METHODID_MODIFY_DEPART = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DEPART:
          serviceImpl.listDepart((com.grpc.depart.DepartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse>) responseObserver);
          break;
        case METHODID_ADD_DEPART:
          serviceImpl.addDepart((com.grpc.depart.DepartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DEPART:
          serviceImpl.removeDepart((com.grpc.depart.DepartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse>) responseObserver);
          break;
        case METHODID_MODIFY_DEPART:
          serviceImpl.modifyDepart((com.grpc.depart.DepartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.depart.DepartResponse>) responseObserver);
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

  private static abstract class DepartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.depart.DepartOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartService");
    }
  }

  private static final class DepartServiceFileDescriptorSupplier
      extends DepartServiceBaseDescriptorSupplier {
    DepartServiceFileDescriptorSupplier() {}
  }

  private static final class DepartServiceMethodDescriptorSupplier
      extends DepartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartServiceFileDescriptorSupplier())
              .addMethod(getListDepartMethod())
              .addMethod(getAddDepartMethod())
              .addMethod(getRemoveDepartMethod())
              .addMethod(getModifyDepartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
