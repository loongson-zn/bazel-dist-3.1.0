// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * Details for the tool used to call the API.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.ToolDetails}
 */
public  final class ToolDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.ToolDetails)
    ToolDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ToolDetails.newBuilder() to construct.
  private ToolDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ToolDetails() {
    toolName_ = "";
    toolVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ToolDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ToolDetails(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            toolName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            toolVersion_ = s;
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
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ToolDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ToolDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.ToolDetails.class, build.bazel.remote.execution.v2.ToolDetails.Builder.class);
  }

  public static final int TOOL_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object toolName_;
  /**
   * <pre>
   * Name of the tool, e.g. bazel.
   * </pre>
   *
   * <code>string tool_name = 1;</code>
   * @return The toolName.
   */
  public java.lang.String getToolName() {
    java.lang.Object ref = toolName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toolName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the tool, e.g. bazel.
   * </pre>
   *
   * <code>string tool_name = 1;</code>
   * @return The bytes for toolName.
   */
  public com.google.protobuf.ByteString
      getToolNameBytes() {
    java.lang.Object ref = toolName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toolName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOOL_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object toolVersion_;
  /**
   * <pre>
   * Version of the tool used for the request, e.g. 5.0.3.
   * </pre>
   *
   * <code>string tool_version = 2;</code>
   * @return The toolVersion.
   */
  public java.lang.String getToolVersion() {
    java.lang.Object ref = toolVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toolVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Version of the tool used for the request, e.g. 5.0.3.
   * </pre>
   *
   * <code>string tool_version = 2;</code>
   * @return The bytes for toolVersion.
   */
  public com.google.protobuf.ByteString
      getToolVersionBytes() {
    java.lang.Object ref = toolVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toolVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getToolNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, toolName_);
    }
    if (!getToolVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toolVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getToolNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, toolName_);
    }
    if (!getToolVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toolVersion_);
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
    if (!(obj instanceof build.bazel.remote.execution.v2.ToolDetails)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.ToolDetails other = (build.bazel.remote.execution.v2.ToolDetails) obj;

    if (!getToolName()
        .equals(other.getToolName())) return false;
    if (!getToolVersion()
        .equals(other.getToolVersion())) return false;
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
    hash = (37 * hash) + TOOL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getToolName().hashCode();
    hash = (37 * hash) + TOOL_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getToolVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ToolDetails parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.ToolDetails prototype) {
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
   * Details for the tool used to call the API.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.ToolDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.ToolDetails)
      build.bazel.remote.execution.v2.ToolDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ToolDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ToolDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.ToolDetails.class, build.bazel.remote.execution.v2.ToolDetails.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.ToolDetails.newBuilder()
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
      toolName_ = "";

      toolVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ToolDetails_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ToolDetails getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.ToolDetails.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ToolDetails build() {
      build.bazel.remote.execution.v2.ToolDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ToolDetails buildPartial() {
      build.bazel.remote.execution.v2.ToolDetails result = new build.bazel.remote.execution.v2.ToolDetails(this);
      result.toolName_ = toolName_;
      result.toolVersion_ = toolVersion_;
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
      if (other instanceof build.bazel.remote.execution.v2.ToolDetails) {
        return mergeFrom((build.bazel.remote.execution.v2.ToolDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.ToolDetails other) {
      if (other == build.bazel.remote.execution.v2.ToolDetails.getDefaultInstance()) return this;
      if (!other.getToolName().isEmpty()) {
        toolName_ = other.toolName_;
        onChanged();
      }
      if (!other.getToolVersion().isEmpty()) {
        toolVersion_ = other.toolVersion_;
        onChanged();
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
      build.bazel.remote.execution.v2.ToolDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.ToolDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object toolName_ = "";
    /**
     * <pre>
     * Name of the tool, e.g. bazel.
     * </pre>
     *
     * <code>string tool_name = 1;</code>
     * @return The toolName.
     */
    public java.lang.String getToolName() {
      java.lang.Object ref = toolName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toolName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the tool, e.g. bazel.
     * </pre>
     *
     * <code>string tool_name = 1;</code>
     * @return The bytes for toolName.
     */
    public com.google.protobuf.ByteString
        getToolNameBytes() {
      java.lang.Object ref = toolName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toolName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the tool, e.g. bazel.
     * </pre>
     *
     * <code>string tool_name = 1;</code>
     * @param value The toolName to set.
     * @return This builder for chaining.
     */
    public Builder setToolName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toolName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the tool, e.g. bazel.
     * </pre>
     *
     * <code>string tool_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearToolName() {
      
      toolName_ = getDefaultInstance().getToolName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the tool, e.g. bazel.
     * </pre>
     *
     * <code>string tool_name = 1;</code>
     * @param value The bytes for toolName to set.
     * @return This builder for chaining.
     */
    public Builder setToolNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toolName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toolVersion_ = "";
    /**
     * <pre>
     * Version of the tool used for the request, e.g. 5.0.3.
     * </pre>
     *
     * <code>string tool_version = 2;</code>
     * @return The toolVersion.
     */
    public java.lang.String getToolVersion() {
      java.lang.Object ref = toolVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toolVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Version of the tool used for the request, e.g. 5.0.3.
     * </pre>
     *
     * <code>string tool_version = 2;</code>
     * @return The bytes for toolVersion.
     */
    public com.google.protobuf.ByteString
        getToolVersionBytes() {
      java.lang.Object ref = toolVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toolVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Version of the tool used for the request, e.g. 5.0.3.
     * </pre>
     *
     * <code>string tool_version = 2;</code>
     * @param value The toolVersion to set.
     * @return This builder for chaining.
     */
    public Builder setToolVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toolVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the tool used for the request, e.g. 5.0.3.
     * </pre>
     *
     * <code>string tool_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearToolVersion() {
      
      toolVersion_ = getDefaultInstance().getToolVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the tool used for the request, e.g. 5.0.3.
     * </pre>
     *
     * <code>string tool_version = 2;</code>
     * @param value The bytes for toolVersion to set.
     * @return This builder for chaining.
     */
    public Builder setToolVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toolVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.ToolDetails)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.ToolDetails)
  private static final build.bazel.remote.execution.v2.ToolDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.ToolDetails();
  }

  public static build.bazel.remote.execution.v2.ToolDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToolDetails>
      PARSER = new com.google.protobuf.AbstractParser<ToolDetails>() {
    @java.lang.Override
    public ToolDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ToolDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ToolDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToolDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.ToolDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

