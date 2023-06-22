// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: role_menu.proto

package com.grpc.role_menu;

public final class RoleMenu {
  private RoleMenu() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_role_menu_RP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_role_menu_RP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_role_menu_RPRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_role_menu_RPRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_role_menu_RPResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_role_menu_RPResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017role_menu.proto\022\022com.grpc.role_menu\"2\n" +
      "\002RP\022\n\n\002id\030\004 \001(\005\022\017\n\007role_id\030\001 \001(\005\022\017\n\007menu" +
      "_id\030\002 \001(\005\"]\n\tRPRequest\022\n\n\002id\030\004 \001(\005\022\017\n\007ro" +
      "le_id\030\001 \001(\005\022\017\n\007menu_id\030\002 \001(\005\022\"\n\002rp\030\005 \003(\013" +
      "2\026.com.grpc.role_menu.RP\"q\n\nRPResponse\022\n" +
      "\n\002id\030\004 \001(\005\022\017\n\007role_id\030\001 \001(\005\022\017\n\007menu_id\030\002" +
      " \001(\005\022\"\n\002rp\030\005 \003(\0132\026.com.grpc.role_menu.RP" +
      "\022\021\n\tstatus_id\030\006 \001(\0052\262\002\n\tRPService\022G\n\006lis" +
      "tRP\022\035.com.grpc.role_menu.RPRequest\032\036.com" +
      ".grpc.role_menu.RPResponse\022F\n\005addRP\022\035.co" +
      "m.grpc.role_menu.RPRequest\032\036.com.grpc.ro" +
      "le_menu.RPResponse\022I\n\010removeRP\022\035.com.grp" +
      "c.role_menu.RPRequest\032\036.com.grpc.role_me" +
      "nu.RPResponse\022I\n\010modifyRP\022\035.com.grpc.rol" +
      "e_menu.RPRequest\032\036.com.grpc.role_menu.RP" +
      "ResponseB\002P\001b\006proto3"
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
    internal_static_com_grpc_role_menu_RP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_role_menu_RP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_role_menu_RP_descriptor,
        new java.lang.String[] { "Id", "RoleId", "MenuId", });
    internal_static_com_grpc_role_menu_RPRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_role_menu_RPRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_role_menu_RPRequest_descriptor,
        new java.lang.String[] { "Id", "RoleId", "MenuId", "Rp", });
    internal_static_com_grpc_role_menu_RPResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_role_menu_RPResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_role_menu_RPResponse_descriptor,
        new java.lang.String[] { "Id", "RoleId", "MenuId", "Rp", "StatusId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
