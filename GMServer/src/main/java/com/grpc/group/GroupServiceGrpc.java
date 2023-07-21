package com.grpc.group;

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
    comments = "Source: group.proto")
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.group.GroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getListGroupMethod;

  public static io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getListGroupMethod() {
    io.grpc.MethodDescriptor<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse> getListGroupMethod;
    if ((getListGroupMethod = GroupServiceGrpc.getListGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListGroupMethod = GroupServiceGrpc.getListGroupMethod) == null) {
          GroupServiceGrpc.getListGroupMethod = getListGroupMethod = 
              io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.group.GroupService", "listGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("listGroup"))
                  .build();
          }
        }
     }
     return getListGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getAddGroupMethod;

  public static io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getAddGroupMethod() {
    io.grpc.MethodDescriptor<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse> getAddGroupMethod;
    if ((getAddGroupMethod = GroupServiceGrpc.getAddGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getAddGroupMethod = GroupServiceGrpc.getAddGroupMethod) == null) {
          GroupServiceGrpc.getAddGroupMethod = getAddGroupMethod = 
              io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.group.GroupService", "addGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("addGroup"))
                  .build();
          }
        }
     }
     return getAddGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getRemoveGroupMethod;

  public static io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getRemoveGroupMethod() {
    io.grpc.MethodDescriptor<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse> getRemoveGroupMethod;
    if ((getRemoveGroupMethod = GroupServiceGrpc.getRemoveGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getRemoveGroupMethod = GroupServiceGrpc.getRemoveGroupMethod) == null) {
          GroupServiceGrpc.getRemoveGroupMethod = getRemoveGroupMethod = 
              io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.group.GroupService", "removeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("removeGroup"))
                  .build();
          }
        }
     }
     return getRemoveGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getModifyGroupMethod;

  public static io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> getModifyGroupMethod() {
    io.grpc.MethodDescriptor<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse> getModifyGroupMethod;
    if ((getModifyGroupMethod = GroupServiceGrpc.getModifyGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getModifyGroupMethod = GroupServiceGrpc.getModifyGroupMethod) == null) {
          GroupServiceGrpc.getModifyGroupMethod = getModifyGroupMethod = 
              io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.group.GroupService", "modifyGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.group.GroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("modifyGroup"))
                  .build();
          }
        }
     }
     return getModifyGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupMethod(), responseObserver);
    }

    /**
     */
    public void addGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGroupMethod(), responseObserver);
    }

    /**
     */
    public void removeGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveGroupMethod(), responseObserver);
    }

    /**
     */
    public void modifyGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_LIST_GROUP)))
          .addMethod(
            getAddGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_ADD_GROUP)))
          .addMethod(
            getRemoveGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_REMOVE_GROUP)))
          .addMethod(
            getModifyGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_MODIFY_GROUP)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void listGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.group.GroupResponse listGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse addGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse removeGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse modifyGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> listGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> addGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> removeGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> modifyGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUP = 0;
  private static final int METHODID_ADD_GROUP = 1;
  private static final int METHODID_REMOVE_GROUP = 2;
  private static final int METHODID_MODIFY_GROUP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GROUP:
          serviceImpl.listGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_ADD_GROUP:
          serviceImpl.addGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_GROUP:
          serviceImpl.removeGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_MODIFY_GROUP:
          serviceImpl.modifyGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
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

  private static abstract class GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.group.GroupOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupService");
    }
  }

  private static final class GroupServiceFileDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier {
    GroupServiceFileDescriptorSupplier() {}
  }

  private static final class GroupServiceMethodDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceFileDescriptorSupplier())
              .addMethod(getListGroupMethod())
              .addMethod(getAddGroupMethod())
              .addMethod(getRemoveGroupMethod())
              .addMethod(getModifyGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
