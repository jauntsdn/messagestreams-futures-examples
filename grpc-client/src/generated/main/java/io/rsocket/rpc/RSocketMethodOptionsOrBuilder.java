// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rsocket/options.proto

// Protobuf Java Version: 3.25.3
package io.rsocket.rpc;

public interface RSocketMethodOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.rsocket.rpc.RSocketMethodOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool fire_and_forget = 1;</code>
   * @return The fireAndForget.
   */
  boolean getFireAndForget();

  /**
   * <code>int32 rank = 112;</code>
   * @return The rank.
   */
  int getRank();

  /**
   * <code>bool idempotent = 113;</code>
   * @return The idempotent.
   */
  boolean getIdempotent();
}
