// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/build_events.proto

package com.google.devtools.build.v1;

public interface BuildEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.build.v1.BuildEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of this event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * The timestamp of this event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * The timestamp of this event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * An invocation attempt has started.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptStarted invocation_attempt_started = 51;</code>
   * @return Whether the invocationAttemptStarted field is set.
   */
  boolean hasInvocationAttemptStarted();
  /**
   * <pre>
   * An invocation attempt has started.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptStarted invocation_attempt_started = 51;</code>
   * @return The invocationAttemptStarted.
   */
  com.google.devtools.build.v1.BuildEvent.InvocationAttemptStarted getInvocationAttemptStarted();
  /**
   * <pre>
   * An invocation attempt has started.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptStarted invocation_attempt_started = 51;</code>
   */
  com.google.devtools.build.v1.BuildEvent.InvocationAttemptStartedOrBuilder getInvocationAttemptStartedOrBuilder();

  /**
   * <pre>
   * An invocation attempt has finished.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptFinished invocation_attempt_finished = 52;</code>
   * @return Whether the invocationAttemptFinished field is set.
   */
  boolean hasInvocationAttemptFinished();
  /**
   * <pre>
   * An invocation attempt has finished.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptFinished invocation_attempt_finished = 52;</code>
   * @return The invocationAttemptFinished.
   */
  com.google.devtools.build.v1.BuildEvent.InvocationAttemptFinished getInvocationAttemptFinished();
  /**
   * <pre>
   * An invocation attempt has finished.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.InvocationAttemptFinished invocation_attempt_finished = 52;</code>
   */
  com.google.devtools.build.v1.BuildEvent.InvocationAttemptFinishedOrBuilder getInvocationAttemptFinishedOrBuilder();

  /**
   * <pre>
   * The build is enqueued (just inserted to the build queue or put back
   * into the build queue due to a previous build failure).
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildEnqueued build_enqueued = 53;</code>
   * @return Whether the buildEnqueued field is set.
   */
  boolean hasBuildEnqueued();
  /**
   * <pre>
   * The build is enqueued (just inserted to the build queue or put back
   * into the build queue due to a previous build failure).
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildEnqueued build_enqueued = 53;</code>
   * @return The buildEnqueued.
   */
  com.google.devtools.build.v1.BuildEvent.BuildEnqueued getBuildEnqueued();
  /**
   * <pre>
   * The build is enqueued (just inserted to the build queue or put back
   * into the build queue due to a previous build failure).
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildEnqueued build_enqueued = 53;</code>
   */
  com.google.devtools.build.v1.BuildEvent.BuildEnqueuedOrBuilder getBuildEnqueuedOrBuilder();

  /**
   * <pre>
   * The build has finished. Set when the build is terminated.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildFinished build_finished = 55;</code>
   * @return Whether the buildFinished field is set.
   */
  boolean hasBuildFinished();
  /**
   * <pre>
   * The build has finished. Set when the build is terminated.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildFinished build_finished = 55;</code>
   * @return The buildFinished.
   */
  com.google.devtools.build.v1.BuildEvent.BuildFinished getBuildFinished();
  /**
   * <pre>
   * The build has finished. Set when the build is terminated.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildFinished build_finished = 55;</code>
   */
  com.google.devtools.build.v1.BuildEvent.BuildFinishedOrBuilder getBuildFinishedOrBuilder();

  /**
   * <pre>
   * An event containing printed text.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.ConsoleOutput console_output = 56;</code>
   * @return Whether the consoleOutput field is set.
   */
  boolean hasConsoleOutput();
  /**
   * <pre>
   * An event containing printed text.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.ConsoleOutput console_output = 56;</code>
   * @return The consoleOutput.
   */
  com.google.devtools.build.v1.BuildEvent.ConsoleOutput getConsoleOutput();
  /**
   * <pre>
   * An event containing printed text.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.ConsoleOutput console_output = 56;</code>
   */
  com.google.devtools.build.v1.BuildEvent.ConsoleOutputOrBuilder getConsoleOutputOrBuilder();

  /**
   * <pre>
   * Indicates the end of a build event stream (with the same StreamId) from
   * a build component executing the requested build task.
   * *** This field does not indicate the WatchBuild RPC is finished. ***
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildComponentStreamFinished component_stream_finished = 59;</code>
   * @return Whether the componentStreamFinished field is set.
   */
  boolean hasComponentStreamFinished();
  /**
   * <pre>
   * Indicates the end of a build event stream (with the same StreamId) from
   * a build component executing the requested build task.
   * *** This field does not indicate the WatchBuild RPC is finished. ***
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildComponentStreamFinished component_stream_finished = 59;</code>
   * @return The componentStreamFinished.
   */
  com.google.devtools.build.v1.BuildEvent.BuildComponentStreamFinished getComponentStreamFinished();
  /**
   * <pre>
   * Indicates the end of a build event stream (with the same StreamId) from
   * a build component executing the requested build task.
   * *** This field does not indicate the WatchBuild RPC is finished. ***
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent.BuildComponentStreamFinished component_stream_finished = 59;</code>
   */
  com.google.devtools.build.v1.BuildEvent.BuildComponentStreamFinishedOrBuilder getComponentStreamFinishedOrBuilder();

  /**
   * <pre>
   * Structured build event generated by Bazel about its execution progress.
   * </pre>
   *
   * <code>.google.protobuf.Any bazel_event = 60;</code>
   * @return Whether the bazelEvent field is set.
   */
  boolean hasBazelEvent();
  /**
   * <pre>
   * Structured build event generated by Bazel about its execution progress.
   * </pre>
   *
   * <code>.google.protobuf.Any bazel_event = 60;</code>
   * @return The bazelEvent.
   */
  com.google.protobuf.Any getBazelEvent();
  /**
   * <pre>
   * Structured build event generated by Bazel about its execution progress.
   * </pre>
   *
   * <code>.google.protobuf.Any bazel_event = 60;</code>
   */
  com.google.protobuf.AnyOrBuilder getBazelEventOrBuilder();

  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * build execution.
   * </pre>
   *
   * <code>.google.protobuf.Any build_execution_event = 61;</code>
   * @return Whether the buildExecutionEvent field is set.
   */
  boolean hasBuildExecutionEvent();
  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * build execution.
   * </pre>
   *
   * <code>.google.protobuf.Any build_execution_event = 61;</code>
   * @return The buildExecutionEvent.
   */
  com.google.protobuf.Any getBuildExecutionEvent();
  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * build execution.
   * </pre>
   *
   * <code>.google.protobuf.Any build_execution_event = 61;</code>
   */
  com.google.protobuf.AnyOrBuilder getBuildExecutionEventOrBuilder();

  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * source fetching.
   * </pre>
   *
   * <code>.google.protobuf.Any source_fetch_event = 62;</code>
   * @return Whether the sourceFetchEvent field is set.
   */
  boolean hasSourceFetchEvent();
  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * source fetching.
   * </pre>
   *
   * <code>.google.protobuf.Any source_fetch_event = 62;</code>
   * @return The sourceFetchEvent.
   */
  com.google.protobuf.Any getSourceFetchEvent();
  /**
   * <pre>
   * An event that contains supplemental tool-specific information about
   * source fetching.
   * </pre>
   *
   * <code>.google.protobuf.Any source_fetch_event = 62;</code>
   */
  com.google.protobuf.AnyOrBuilder getSourceFetchEventOrBuilder();

  public com.google.devtools.build.v1.BuildEvent.EventCase getEventCase();
}
