// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_area.proto

package com.grpc.user_area;

public final class UserAreaOuterClass {
  private UserAreaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_user_area_UserArea_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_user_area_UserArea_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_user_area_UserAreaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_user_area_UserAreaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_user_area_UserAreaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_user_area_UserAreaResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017user_area.proto\022\022com.grpc.user_area\"\277\003" +
      "\n\010UserArea\022\n\n\002id\030\001 \001(\005\022\016\n\006userId\030\002 \001(\005\022\020" +
      "\n\010areaType\030\003 \001(\005\022\024\n\014provinceCode\030\004 \001(\t\022\020" +
      "\n\010cityCode\030\005 \001(\t\022\022\n\ncountyCode\030\006 \001(\t\022\016\n\006" +
      "county\030\007 \001(\t\022\020\n\010townCode\030\010 \001(\t\022\014\n\004town\030\t" +
      " \001(\t\022\023\n\013villageCode\030\n \001(\t\022\017\n\007village\030\013 \001" +
      "(\t\022\017\n\007zipCode\030\014 \001(\t\022\025\n\rtelephoneCode\030\r \001" +
      "(\t\022\022\n\ndetailName\030\016 \001(\t\022\021\n\tshortName\030\017 \001(" +
      "\t\022\023\n\013merger_name\030\020 \001(\t\022\016\n\006pinyin\030\021 \001(\t\022\013" +
      "\n\003lng\030\022 \001(\002\022\013\n\003lat\030\023 \001(\002\022\021\n\tisDefault\030\024 " +
      "\001(\t\022\023\n\013create_time\030\025 \001(\005\022\023\n\013create_user\030" +
      "\026 \001(\005\022\023\n\013update_time\030\027 \001(\005\022\023\n\013update_use" +
      "r\030\030 \001(\005\"]\n\017UserAreaRequest\022\n\n\002id\030\001 \001(\005\022\016" +
      "\n\006userId\030\002 \001(\005\022.\n\010userArea\030\005 \003(\0132\034.com.g" +
      "rpc.user_area.UserArea\"\363\003\n\020UserAreaRespo" +
      "nse\022\n\n\002id\030\001 \001(\005\022\016\n\006userId\030\002 \001(\005\022\020\n\010areaT" +
      "ype\030\003 \001(\005\022\024\n\014provinceCode\030\004 \001(\t\022\020\n\010cityC" +
      "ode\030\005 \001(\t\022\022\n\ncountyCode\030\006 \001(\t\022\016\n\006county\030" +
      "\007 \001(\t\022\020\n\010townCode\030\010 \001(\t\022\014\n\004town\030\t \001(\t\022\023\n" +
      "\013villageCode\030\n \001(\t\022\017\n\007village\030\013 \001(\t\022\017\n\007z" +
      "ipCode\030\014 \001(\t\022\024\n\014telphoneCode\030\r \001(\t\022\022\n\nde" +
      "tailName\030\016 \001(\t\022\021\n\tshortName\030\017 \001(\t\022\022\n\nmer" +
      "gerName\030\020 \001(\t\022\016\n\006pinyin\030\021 \001(\t\022\013\n\003lng\030\022 \001" +
      "(\002\022\013\n\003lat\030\023 \001(\002\022\021\n\tisDefault\030\024 \001(\t\022\016\n\006st" +
      "atus\030\025 \001(\005\022\016\n\006remark\030\026 \001(\005\022\020\n\010statusId\030\027" +
      " \001(\005\022\022\n\ncreateTime\030\030 \001(\005\022\022\n\ncreateUser\030\031" +
      " \001(\005\022\022\n\nupdateTime\030\032 \001(\005\022\022\n\nupdateUser\030\033" +
      " \001(\0052\200\003\n\017UserAreaService\022Y\n\014listUserArea" +
      "\022#.com.grpc.user_area.UserAreaRequest\032$." +
      "com.grpc.user_area.UserAreaResponse\022X\n\013a" +
      "ddUserArea\022#.com.grpc.user_area.UserArea" +
      "Request\032$.com.grpc.user_area.UserAreaRes" +
      "ponse\022[\n\016removeUserArea\022#.com.grpc.user_" +
      "area.UserAreaRequest\032$.com.grpc.user_are" +
      "a.UserAreaResponse\022[\n\016modifyUserArea\022#.c" +
      "om.grpc.user_area.UserAreaRequest\032$.com." +
      "grpc.user_area.UserAreaResponseB\002P\001b\006pro" +
      "to3"
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
    internal_static_com_grpc_user_area_UserArea_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_user_area_UserArea_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_user_area_UserArea_descriptor,
        new java.lang.String[] { "Id", "UserId", "AreaType", "ProvinceCode", "CityCode", "CountyCode", "County", "TownCode", "Town", "VillageCode", "Village", "ZipCode", "TelephoneCode", "DetailName", "ShortName", "MergerName", "Pinyin", "Lng", "Lat", "IsDefault", "CreateTime", "CreateUser", "UpdateTime", "UpdateUser", });
    internal_static_com_grpc_user_area_UserAreaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_user_area_UserAreaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_user_area_UserAreaRequest_descriptor,
        new java.lang.String[] { "Id", "UserId", "UserArea", });
    internal_static_com_grpc_user_area_UserAreaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_user_area_UserAreaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_user_area_UserAreaResponse_descriptor,
        new java.lang.String[] { "Id", "UserId", "AreaType", "ProvinceCode", "CityCode", "CountyCode", "County", "TownCode", "Town", "VillageCode", "Village", "ZipCode", "TelphoneCode", "DetailName", "ShortName", "MergerName", "Pinyin", "Lng", "Lat", "IsDefault", "Status", "Remark", "StatusId", "CreateTime", "CreateUser", "UpdateTime", "UpdateUser", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
