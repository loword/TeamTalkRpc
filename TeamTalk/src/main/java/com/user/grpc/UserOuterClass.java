// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.user.grpc;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_user_grpc_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_user_grpc_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_user_grpc_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_user_grpc_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_user_grpc_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_user_grpc_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\rcom.user.grpc\"\214\002\n\004User\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013\n\003sex\030\003 \001(\005\022\016\n\006d" +
      "omain\030\004 \001(\t\022\014\n\004nick\030\005 \001(\t\022\020\n\010password\030\006 " +
      "\001(\t\022\014\n\004salt\030\007 \001(\t\022\r\n\005phone\030\010 \001(\t\022\r\n\005emai" +
      "l\030\t \001(\t\022\020\n\010departid\030\n \001(\005\022\016\n\006avatar\030\013 \001(" +
      "\t\022\016\n\006status\030\014 \001(\005\022\017\n\007created\030\r \001(\005\022\017\n\007up" +
      "dated\030\016 \001(\005\022\032\n\022push_shield_status\030\017 \001(\005\022" +
      "\021\n\tsign_info\030\020 \001(\t\"\265\001\n\013UserRequest\022\n\n\002id" +
      "\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013\n\003sex\030\t \001(\005\022\014\n\004nic" +
      "k\030\003 \001(\t\022\020\n\010password\030\004 \001(\t\022\014\n\004salt\030\005 \001(\t\022" +
      "\r\n\005phone\030\006 \001(\t\022\r\n\005email\030\007 \001(\t\022\020\n\010departi" +
      "d\030\010 \001(\005\022!\n\004user\030\n \003(\0132\023.com.user.grpc.Us" +
      "er\"\304\001\n\014UserResponse\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030" +
      "\002 \001(\t\022\013\n\003sex\030\n \001(\005\022\014\n\004nick\030\003 \001(\t\022\013\n\003pwd\030" +
      "\004 \001(\t\022\014\n\004salt\030\005 \001(\t\022\r\n\005phone\030\006 \001(\t\022\r\n\005em" +
      "ail\030\007 \001(\t\022\020\n\010departid\030\010 \001(\005\022\021\n\tstatus_id" +
      "\030\t \001(\005\022!\n\004user\030\013 \003(\0132\023.com.user.grpc.Use" +
      "r2\357\002\n\013UserService\022C\n\010listUser\022\032.com.user" +
      ".grpc.UserRequest\032\033.com.user.grpc.UserRe" +
      "sponse\022B\n\007addUser\022\032.com.user.grpc.UserRe" +
      "quest\032\033.com.user.grpc.UserResponse\022I\n\016mo" +
      "difyPassword\022\032.com.user.grpc.UserRequest" +
      "\032\033.com.user.grpc.UserResponse\022E\n\nremoveU" +
      "ser\022\032.com.user.grpc.UserRequest\032\033.com.us" +
      "er.grpc.UserResponse\022E\n\nmodifyUser\022\032.com" +
      ".user.grpc.UserRequest\032\033.com.user.grpc.U" +
      "serResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_user_grpc_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_user_grpc_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_user_grpc_User_descriptor,
        new java.lang.String[] { "Id", "Name", "Sex", "Domain", "Nick", "Password", "Salt", "Phone", "Email", "Departid", "Avatar", "Status", "Created", "Updated", "PushShieldStatus", "SignInfo", });
    internal_static_com_user_grpc_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_user_grpc_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_user_grpc_UserRequest_descriptor,
        new java.lang.String[] { "Id", "Name", "Sex", "Nick", "Password", "Salt", "Phone", "Email", "Departid", "User", });
    internal_static_com_user_grpc_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_user_grpc_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_user_grpc_UserResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Sex", "Nick", "Pwd", "Salt", "Phone", "Email", "Departid", "StatusId", "User", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
