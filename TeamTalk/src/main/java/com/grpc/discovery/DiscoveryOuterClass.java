// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Discovery.proto

package com.grpc.discovery;

public final class DiscoveryOuterClass {
  private DiscoveryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_proto_discovery_grpc_Discovery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_proto_discovery_grpc_Discovery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_proto_discovery_grpc_DiscoveryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_proto_discovery_grpc_DiscoveryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_proto_discovery_grpc_DiscoveryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_proto_discovery_grpc_DiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Discovery.proto\022\030com.proto.discovery.g" +
      "rpc\"\202\001\n\tDiscovery\022\n\n\002id\030\001 \001(\005\022\020\n\010itemnam" +
      "e\030\002 \001(\t\022\017\n\007itemurl\030\003 \001(\t\022\024\n\014itempriority" +
      "\030\004 \001(\005\022\016\n\006status\030\005 \001(\005\022\017\n\007created\030\006 \001(\005\022" +
      "\017\n\007updated\030\007 \001(\005\"\217\001\n\020DiscoveryRequest\022\n\n" +
      "\002id\030\001 \001(\005\022\020\n\010itemname\030\002 \001(\t\022\017\n\007itemurl\030\003" +
      " \001(\t\022\024\n\014itempriority\030\004 \001(\005\0226\n\tdiscovery\030" +
      "\005 \003(\0132#.com.proto.discovery.grpc.Discove" +
      "ry\"\243\001\n\021DiscoveryResponse\022\n\n\002id\030\001 \001(\005\022\020\n\010" +
      "itemname\030\002 \001(\t\022\017\n\007itemurl\030\003 \001(\t\022\024\n\014itemp" +
      "riority\030\004 \001(\005\022\021\n\tstatus_id\030\005 \001(\005\0226\n\tdisc" +
      "overy\030\006 \003(\0132#.com.proto.discovery.grpc.D" +
      "iscovery2\275\003\n\020DiscoveryService\022h\n\rlistDis" +
      "covery\022*.com.proto.discovery.grpc.Discov" +
      "eryRequest\032+.com.proto.discovery.grpc.Di" +
      "scoveryResponse\022g\n\014addDiscovery\022*.com.pr" +
      "oto.discovery.grpc.DiscoveryRequest\032+.co" +
      "m.proto.discovery.grpc.DiscoveryResponse" +
      "\022j\n\017removeDiscovery\022*.com.proto.discover" +
      "y.grpc.DiscoveryRequest\032+.com.proto.disc" +
      "overy.grpc.DiscoveryResponse\022j\n\017modifyDi" +
      "scovery\022*.com.proto.discovery.grpc.Disco" +
      "veryRequest\032+.com.proto.discovery.grpc.D" +
      "iscoveryResponseB\002P\001b\006proto3"
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
    internal_static_com_proto_discovery_grpc_Discovery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_proto_discovery_grpc_Discovery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_proto_discovery_grpc_Discovery_descriptor,
        new java.lang.String[] { "Id", "Itemname", "Itemurl", "Itempriority", "Status", "Created", "Updated", });
    internal_static_com_proto_discovery_grpc_DiscoveryRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_proto_discovery_grpc_DiscoveryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_proto_discovery_grpc_DiscoveryRequest_descriptor,
        new java.lang.String[] { "Id", "Itemname", "Itemurl", "Itempriority", "Discovery", });
    internal_static_com_proto_discovery_grpc_DiscoveryResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_proto_discovery_grpc_DiscoveryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_proto_discovery_grpc_DiscoveryResponse_descriptor,
        new java.lang.String[] { "Id", "Itemname", "Itemurl", "Itempriority", "StatusId", "Discovery", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
