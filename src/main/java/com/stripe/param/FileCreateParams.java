package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class FileCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
   * transfers for the `multipart/form-data` protocol).
   *
   * <p>Note this field is marked as transient to avoid JSON deserializer. Override {@link
   * FileCreateParams#toMap()} makes sure that the returned map has this same file instance.
   */
  transient Object file;

  /**
   * Optional parameters to automatically create a [file link](#file_links) for the newly created
   * file.
   */
  @SerializedName("file_link_data")
  FileLinkData fileLinkData;

  /**
   * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
   * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`, or
   * `tax_document_user_upload`
   */
  @SerializedName("purpose")
  Purpose purpose;

  private FileCreateParams(
      List<String> expand, Object file, FileLinkData fileLinkData, Purpose purpose) {
    this.expand = expand;
    this.file = file;
    this.fileLinkData = fileLinkData;
    this.purpose = purpose;
  }

  public static Builder builder() {
    return new com.stripe.param.FileCreateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Object file;

    private FileLinkData fileLinkData;

    private Purpose purpose;

    /** Finalize and obtain parameter instance from this builder. */
    public FileCreateParams build() {
      return new FileCreateParams(this.expand, this.file, this.fileLinkData, this.purpose);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FileCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FileCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
     * transfers for the `multipart/form-data` protocol).
     */
    public Builder setFile(java.io.File file) {
      this.file = file;
      return this;
    }

    /**
     * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
     * transfers for the `multipart/form-data` protocol).
     */
    public Builder setFile(java.io.InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Optional parameters to automatically create a [file link](#file_links) for the newly created
     * file.
     */
    public Builder setFileLinkData(FileLinkData fileLinkData) {
      this.fileLinkData = fileLinkData;
      return this;
    }

    /**
     * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`, or
     * `tax_document_user_upload`
     */
    public Builder setPurpose(Purpose purpose) {
      this.purpose = purpose;
      return this;
    }
  }

  public static class FileLinkData {
    /** Set this to `true` to create a file link for the newly created file. */
    @SerializedName("create")
    Boolean create;

    /** A future timestamp after which the link will no longer be usable. */
    @SerializedName("expires_at")
    Long expiresAt;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    private FileLinkData(Boolean create, Long expiresAt, Map<String, String> metadata) {
      this.create = create;
      this.expiresAt = expiresAt;
      this.metadata = metadata;
    }

    public static Builder builder() {
      return new com.stripe.param.FileCreateParams.FileLinkData.Builder();
    }

    public static class Builder {
      private Boolean create;

      private Long expiresAt;

      private Map<String, String> metadata;

      /** Finalize and obtain parameter instance from this builder. */
      public FileLinkData build() {
        return new FileLinkData(this.create, this.expiresAt, this.metadata);
      }

      /** Set this to `true` to create a file link for the newly created file. */
      public Builder setCreate(Boolean create) {
        this.create = create;
        return this;
      }

      /** A future timestamp after which the link will no longer be usable. */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FileLinkData#metadata} for the field documentation.
       */
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link FileLinkData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }
    }
  }

  public enum Purpose implements ApiRequestParams.EnumParam {
    @SerializedName("account_requirement")
    ACCOUNT_REQUIREMENT("account_requirement"),

    @SerializedName("additional_verification")
    ADDITIONAL_VERIFICATION("additional_verification"),

    @SerializedName("business_icon")
    BUSINESS_ICON("business_icon"),

    @SerializedName("business_logo")
    BUSINESS_LOGO("business_logo"),

    @SerializedName("customer_signature")
    CUSTOMER_SIGNATURE("customer_signature"),

    @SerializedName("dispute_evidence")
    DISPUTE_EVIDENCE("dispute_evidence"),

    @SerializedName("identity_document")
    IDENTITY_DOCUMENT("identity_document"),

    @SerializedName("pci_document")
    PCI_DOCUMENT("pci_document"),

    @SerializedName("tax_document_user_upload")
    TAX_DOCUMENT_USER_UPLOAD("tax_document_user_upload");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Purpose(String value) {
      this.value = value;
    }
  }

  /**
   * Returns untyped parameters for file creation. Map value for {@code "file"} is the same instance
   * of value set in {@link Builder#setFile(File)} or {@link Builder#setFile(java.io.InputStream)};
   * the file is not transformed or serialized at this level.
   *
   * @return Untyped parameters containing file object set in the builder.
   */
  @Override
  public Map<String, Object> toMap() {
    Object fileObject = this.file;
    Map<String, Object> untypedParamWithPrimitiveTypes = super.toMap();
    untypedParamWithPrimitiveTypes.put("file", fileObject);
    return untypedParamWithPrimitiveTypes;
  }
}
