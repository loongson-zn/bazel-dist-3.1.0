// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * Describes the server/instance capabilities for updating the action cache.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities}
 */
public  final class ActionCacheUpdateCapabilities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)
    ActionCacheUpdateCapabilitiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActionCacheUpdateCapabilities.newBuilder() to construct.
  private ActionCacheUpdateCapabilities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActionCacheUpdateCapabilities() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActionCacheUpdateCapabilities();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActionCacheUpdateCapabilities(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            updateEnabled_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ActionCacheUpdateCapabilities_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ActionCacheUpdateCapabilities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.class, build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.Builder.class);
  }

  public static final int UPDATE_ENABLED_FIELD_NUMBER = 1;
  private boolean updateEnabled_;
  /**
   * <code>bool update_enabled = 1;</code>
   * @return The updateEnabled.
   */
  public boolean getUpdateEnabled() {
    return updateEnabled_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (updateEnabled_ != false) {
      output.writeBool(1, updateEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, updateEnabled_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities other = (build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities) obj;

    if (getUpdateEnabled()
        != other.getUpdateEnabled()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UPDATE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUpdateEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes the server/instance capabilities for updating the action cache.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)
      build.bazel.remote.execution.v2.ActionCacheUpdateCapabilitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ActionCacheUpdateCapabilities_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ActionCacheUpdateCapabilities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.class, build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      updateEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ActionCacheUpdateCapabilities_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities build() {
      build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities buildPartial() {
      build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities result = new build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities(this);
      result.updateEnabled_ = updateEnabled_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities) {
        return mergeFrom((build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities other) {
      if (other == build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities.getDefaultInstance()) return this;
      if (other.getUpdateEnabled() != false) {
        setUpdateEnabled(other.getUpdateEnabled());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean updateEnabled_ ;
    /**
     * <code>bool update_enabled = 1;</code>
     * @return The updateEnabled.
     */
    public boolean getUpdateEnabled() {
      return updateEnabled_;
    }
    /**
     * <code>bool update_enabled = 1;</code>
     * @param value The updateEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateEnabled(boolean value) {
      
      updateEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool update_enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateEnabled() {
      
      updateEnabled_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities)
  private static final build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities();
  }

  public static build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionCacheUpdateCapabilities>
      PARSER = new com.google.protobuf.AbstractParser<ActionCacheUpdateCapabilities>() {
    @java.lang.Override
    public ActionCacheUpdateCapabilities parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ActionCacheUpdateCapabilities(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActionCacheUpdateCapabilities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionCacheUpdateCapabilities> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.ActionCacheUpdateCapabilities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

