// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/build_status.proto

package com.google.devtools.build.v1;

public interface BuildStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.build.v1.BuildStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The end result.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <pre>
   * The end result.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
   * @return The result.
   */
  com.google.devtools.build.v1.BuildStatus.Result getResult();

  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   * @return The details.
   */
  com.google.protobuf.Any getDetails();
  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getDetailsOrBuilder();
}