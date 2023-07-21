package com.grpc.role;

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
    comments = "Source: role.proto")
public final class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.role.RoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getListRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getListRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getListRoleMethod;
    if ((getListRoleMethod = RoleServiceGrpc.getListRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getListRoleMethod = RoleServiceGrpc.getListRoleMethod) == null) {
          RoleServiceGrpc.getListRoleMethod = getListRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "listRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("listRole"))
                  .build();
          }
        }
     }
     return getListRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getAddRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getAddRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getAddRoleMethod;
    if ((getAddRoleMethod = RoleServiceGrpc.getAddRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getAddRoleMethod = RoleServiceGrpc.getAddRoleMethod) == null) {
          RoleServiceGrpc.getAddRoleMethod = getAddRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "addRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("addRole"))
                  .build();
          }
        }
     }
     return getAddRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getRemoveRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getRemoveRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getRemoveRoleMethod;
    if ((getRemoveRoleMethod = RoleServiceGrpc.getRemoveRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getRemoveRoleMethod = RoleServiceGrpc.getRemoveRoleMethod) == null) {
          RoleServiceGrpc.getRemoveRoleMethod = getRemoveRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "removeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("removeRole"))
                  .build();
          }
        }
     }
     return getRemoveRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getModifyRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getModifyRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getModifyRoleMethod;
    if ((getModifyRoleMethod = RoleServiceGrpc.getModifyRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getModifyRoleMethod = RoleServiceGrpc.getModifyRoleMethod) == null) {
          RoleServiceGrpc.getModifyRoleMethod = getModifyRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "modifyRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("modifyRole"))
                  .build();
          }
        }
     }
     return getModifyRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getChangeMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getChangeMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getChangeMenuMethod;
    if ((getChangeMenuMethod = RoleServiceGrpc.getChangeMenuMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getChangeMenuMethod = RoleServiceGrpc.getChangeMenuMethod) == null) {
          RoleServiceGrpc.getChangeMenuMethod = getChangeMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "changeMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("changeMenu"))
                  .build();
          }
        }
     }
     return getChangeMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getGetRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role.RoleRequest,
      com.grpc.role.RoleResponse> getGetRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse> getGetRoleMethod;
    if ((getGetRoleMethod = RoleServiceGrpc.getGetRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetRoleMethod = RoleServiceGrpc.getGetRoleMethod) == null) {
          RoleServiceGrpc.getGetRoleMethod = getGetRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role.RoleRequest, com.grpc.role.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role.RoleService", "getRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role.RoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("getRole"))
                  .build();
          }
        }
     }
     return getGetRoleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    return new RoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRoleMethod(), responseObserver);
    }

    /**
     */
    public void addRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRoleMethod(), responseObserver);
    }

    /**
     */
    public void removeRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRoleMethod(), responseObserver);
    }

    /**
     */
    public void modifyRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyRoleMethod(), responseObserver);
    }

    /**
     */
    public void changeMenu(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeMenuMethod(), responseObserver);
    }

    /**
     */
    public void getRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_LIST_ROLE)))
          .addMethod(
            getAddRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_ADD_ROLE)))
          .addMethod(
            getRemoveRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_REMOVE_ROLE)))
          .addMethod(
            getModifyRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_MODIFY_ROLE)))
          .addMethod(
            getChangeMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_CHANGE_MENU)))
          .addMethod(
            getGetRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role.RoleRequest,
                com.grpc.role.RoleResponse>(
                  this, METHODID_GET_ROLE)))
          .build();
    }
  }

  /**
   */
  public static final class RoleServiceStub extends io.grpc.stub.AbstractStub<RoleServiceStub> {
    private RoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void listRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeMenu(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRole(com.grpc.role.RoleRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoleServiceBlockingStub extends io.grpc.stub.AbstractStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.role.RoleResponse listRole(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role.RoleResponse addRole(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role.RoleResponse removeRole(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role.RoleResponse modifyRole(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role.RoleResponse changeMenu(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role.RoleResponse getRole(com.grpc.role.RoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoleServiceFutureStub extends io.grpc.stub.AbstractStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> listRole(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> addRole(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> removeRole(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> modifyRole(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> changeMenu(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeMenuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role.RoleResponse> getRole(
        com.grpc.role.RoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ROLE = 0;
  private static final int METHODID_ADD_ROLE = 1;
  private static final int METHODID_REMOVE_ROLE = 2;
  private static final int METHODID_MODIFY_ROLE = 3;
  private static final int METHODID_CHANGE_MENU = 4;
  private static final int METHODID_GET_ROLE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ROLE:
          serviceImpl.listRole((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
          break;
        case METHODID_ADD_ROLE:
          serviceImpl.addRole((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE:
          serviceImpl.removeRole((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
          break;
        case METHODID_MODIFY_ROLE:
          serviceImpl.modifyRole((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
          break;
        case METHODID_CHANGE_MENU:
          serviceImpl.changeMenu((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE:
          serviceImpl.getRole((com.grpc.role.RoleRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role.RoleResponse>) responseObserver);
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

  private static abstract class RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.role.RoleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleService");
    }
  }

  private static final class RoleServiceFileDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier {
    RoleServiceFileDescriptorSupplier() {}
  }

  private static final class RoleServiceMethodDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleServiceFileDescriptorSupplier())
              .addMethod(getListRoleMethod())
              .addMethod(getAddRoleMethod())
              .addMethod(getRemoveRoleMethod())
              .addMethod(getModifyRoleMethod())
              .addMethod(getChangeMenuMethod())
              .addMethod(getGetRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
