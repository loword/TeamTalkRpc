package com.grpc.menu;

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
    comments = "Source: menu.proto")
public final class MenuServiceGrpc {

  private MenuServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.menu.MenuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getListMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getListMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getListMenuMethod;
    if ((getListMenuMethod = MenuServiceGrpc.getListMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getListMenuMethod = MenuServiceGrpc.getListMenuMethod) == null) {
          MenuServiceGrpc.getListMenuMethod = getListMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "listMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("listMenu"))
                  .build();
          }
        }
     }
     return getListMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getAddMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getAddMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getAddMenuMethod;
    if ((getAddMenuMethod = MenuServiceGrpc.getAddMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getAddMenuMethod = MenuServiceGrpc.getAddMenuMethod) == null) {
          MenuServiceGrpc.getAddMenuMethod = getAddMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "addMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("addMenu"))
                  .build();
          }
        }
     }
     return getAddMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getRemoveMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getRemoveMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getRemoveMenuMethod;
    if ((getRemoveMenuMethod = MenuServiceGrpc.getRemoveMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getRemoveMenuMethod = MenuServiceGrpc.getRemoveMenuMethod) == null) {
          MenuServiceGrpc.getRemoveMenuMethod = getRemoveMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "removeMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("removeMenu"))
                  .build();
          }
        }
     }
     return getRemoveMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getModifyMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getModifyMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getModifyMenuMethod;
    if ((getModifyMenuMethod = MenuServiceGrpc.getModifyMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getModifyMenuMethod = MenuServiceGrpc.getModifyMenuMethod) == null) {
          MenuServiceGrpc.getModifyMenuMethod = getModifyMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "modifyMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("modifyMenu"))
                  .build();
          }
        }
     }
     return getModifyMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getGetRouteMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getGetRouteMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getGetRouteMethod;
    if ((getGetRouteMethod = MenuServiceGrpc.getGetRouteMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getGetRouteMethod = MenuServiceGrpc.getGetRouteMethod) == null) {
          MenuServiceGrpc.getGetRouteMethod = getGetRouteMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "getRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("getRoute"))
                  .build();
          }
        }
     }
     return getGetRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getGetMenuMethod;

  public static io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest,
      com.grpc.menu.MenuResponse> getGetMenuMethod() {
    io.grpc.MethodDescriptor<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse> getGetMenuMethod;
    if ((getGetMenuMethod = MenuServiceGrpc.getGetMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getGetMenuMethod = MenuServiceGrpc.getGetMenuMethod) == null) {
          MenuServiceGrpc.getGetMenuMethod = getGetMenuMethod = 
              io.grpc.MethodDescriptor.<com.grpc.menu.MenuRequest, com.grpc.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.menu.MenuService", "getMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("getMenu"))
                  .build();
          }
        }
     }
     return getGetMenuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuServiceStub newStub(io.grpc.Channel channel) {
    return new MenuServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MenuServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MenuServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MenuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMenuMethod(), responseObserver);
    }

    /**
     */
    public void addMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMenuMethod(), responseObserver);
    }

    /**
     */
    public void removeMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMenuMethod(), responseObserver);
    }

    /**
     */
    public void modifyMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyMenuMethod(), responseObserver);
    }

    /**
     */
    public void getRoute(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRouteMethod(), responseObserver);
    }

    /**
     */
    public void getMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMenuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_LIST_MENU)))
          .addMethod(
            getAddMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_ADD_MENU)))
          .addMethod(
            getRemoveMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_REMOVE_MENU)))
          .addMethod(
            getModifyMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_MODIFY_MENU)))
          .addMethod(
            getGetRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_GET_ROUTE)))
          .addMethod(
            getGetMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.menu.MenuRequest,
                com.grpc.menu.MenuResponse>(
                  this, METHODID_GET_MENU)))
          .build();
    }
  }

  /**
   */
  public static final class MenuServiceStub extends io.grpc.stub.AbstractStub<MenuServiceStub> {
    private MenuServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceStub(channel, callOptions);
    }

    /**
     */
    public void listMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoute(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMenu(com.grpc.menu.MenuRequest request,
        io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMenuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MenuServiceBlockingStub extends io.grpc.stub.AbstractStub<MenuServiceBlockingStub> {
    private MenuServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.menu.MenuResponse listMenu(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.menu.MenuResponse addMenu(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.menu.MenuResponse removeMenu(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.menu.MenuResponse modifyMenu(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.menu.MenuResponse getRoute(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.menu.MenuResponse getMenu(com.grpc.menu.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMenuMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MenuServiceFutureStub extends io.grpc.stub.AbstractStub<MenuServiceFutureStub> {
    private MenuServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> listMenu(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMenuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> addMenu(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMenuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> removeMenu(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMenuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> modifyMenu(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyMenuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> getRoute(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.menu.MenuResponse> getMenu(
        com.grpc.menu.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMenuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MENU = 0;
  private static final int METHODID_ADD_MENU = 1;
  private static final int METHODID_REMOVE_MENU = 2;
  private static final int METHODID_MODIFY_MENU = 3;
  private static final int METHODID_GET_ROUTE = 4;
  private static final int METHODID_GET_MENU = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MenuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MenuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MENU:
          serviceImpl.listMenu((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
          break;
        case METHODID_ADD_MENU:
          serviceImpl.addMenu((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MENU:
          serviceImpl.removeMenu((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MENU:
          serviceImpl.modifyMenu((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
          break;
        case METHODID_GET_MENU:
          serviceImpl.getMenu((com.grpc.menu.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.menu.MenuResponse>) responseObserver);
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

  private static abstract class MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MenuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.menu.MenuOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MenuService");
    }
  }

  private static final class MenuServiceFileDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier {
    MenuServiceFileDescriptorSupplier() {}
  }

  private static final class MenuServiceMethodDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MenuServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MenuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuServiceFileDescriptorSupplier())
              .addMethod(getListMenuMethod())
              .addMethod(getAddMenuMethod())
              .addMethod(getRemoveMenuMethod())
              .addMethod(getModifyMenuMethod())
              .addMethod(getGetRouteMethod())
              .addMethod(getGetMenuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
