// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: role.proto

package com.role.grpc;

public interface RoleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.role.grpc.RoleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 manager_id = 10;</code>
   */
  int getManagerId();

  /**
   * <code>repeated int32 id = 7;</code>
   */
  java.util.List<java.lang.Integer> getIdList();
  /**
   * <code>repeated int32 id = 7;</code>
   */
  int getIdCount();
  /**
   * <code>repeated int32 id = 7;</code>
   */
  int getId(int index);

  /**
   * <code>int32 role_id = 4;</code>
   */
  int getRoleId();

  /**
   * <code>string role_name = 1;</code>
   */
  java.lang.String getRoleName();
  /**
   * <code>string role_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getRoleNameBytes();

  /**
   * <code>repeated .com.role.grpc.Role role = 5;</code>
   */
  java.util.List<com.role.grpc.Role> 
      getRoleList();
  /**
   * <code>repeated .com.role.grpc.Role role = 5;</code>
   */
  com.role.grpc.Role getRole(int index);
  /**
   * <code>repeated .com.role.grpc.Role role = 5;</code>
   */
  int getRoleCount();
  /**
   * <code>repeated .com.role.grpc.Role role = 5;</code>
   */
  java.util.List<? extends com.role.grpc.RoleOrBuilder> 
      getRoleOrBuilderList();
  /**
   * <code>repeated .com.role.grpc.Role role = 5;</code>
   */
  com.role.grpc.RoleOrBuilder getRoleOrBuilder(
      int index);

  /**
   * <code>int32 status_id = 6;</code>
   */
  int getStatusId();
}
