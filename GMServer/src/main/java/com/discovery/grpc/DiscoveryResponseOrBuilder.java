// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Discovery.proto

package com.discovery.grpc;

public interface DiscoveryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.discovery.grpc.DiscoveryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string itemname = 2;</code>
   */
  java.lang.String getItemname();
  /**
   * <code>string itemname = 2;</code>
   */
  com.google.protobuf.ByteString
      getItemnameBytes();

  /**
   * <code>string itemurl = 3;</code>
   */
  java.lang.String getItemurl();
  /**
   * <code>string itemurl = 3;</code>
   */
  com.google.protobuf.ByteString
      getItemurlBytes();

  /**
   * <code>int32 itempriority = 4;</code>
   */
  int getItempriority();

  /**
   * <code>int32 status_id = 5;</code>
   */
  int getStatusId();

  /**
   * <code>repeated .com.discovery.grpc.Discovery discovery = 6;</code>
   */
  java.util.List<com.discovery.grpc.Discovery> 
      getDiscoveryList();
  /**
   * <code>repeated .com.discovery.grpc.Discovery discovery = 6;</code>
   */
  com.discovery.grpc.Discovery getDiscovery(int index);
  /**
   * <code>repeated .com.discovery.grpc.Discovery discovery = 6;</code>
   */
  int getDiscoveryCount();
  /**
   * <code>repeated .com.discovery.grpc.Discovery discovery = 6;</code>
   */
  java.util.List<? extends com.discovery.grpc.DiscoveryOrBuilder> 
      getDiscoveryOrBuilderList();
  /**
   * <code>repeated .com.discovery.grpc.Discovery discovery = 6;</code>
   */
  com.discovery.grpc.DiscoveryOrBuilder getDiscoveryOrBuilder(
      int index);
}
