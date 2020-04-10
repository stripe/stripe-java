// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class FileCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> A file to upload. Make sure that the specifications follow RFC 2388,
   * which defines file transfers for the {@code multipart/form-data} protocol.
   */
  @SerializedName("file")
  transient Object file;

  /**
   * Optional parameters that automatically create a <a
   * href="https://stripe.com/docs/api#file_links">file link</a> for the newly created file.
   */
  @SerializedName("file_link_data")
  FileLinkData fileLinkData;

  /**
   * <strong>Required.</strong> The <a
   * href="https://stripe.com/docs/file-upload#uploading-a-file">purpose</a> of the uploaded file.
   */
  @SerializedName("purpose")
  Purpose purpose;

  private FileCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Object file,
      FileLinkData fileLinkData,
      Purpose purpose) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.file = file;
    this.fileLinkData = fileLinkData;
    this.purpose = purpose;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object file;

    private FileLinkData fileLinkData;

    private Purpose purpose;

    /** Finalize and obtain parameter instance from this builder. */
    public FileCreateParams build() {
      return new FileCreateParams(
          this.expand, this.extraParams, this.file, this.fileLinkData, this.purpose);
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
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FileCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link FileCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> A file to upload. Make sure that the specifications follow RFC
     * 2388, which defines file transfers for the {@code multipart/form-data} protocol.
     */
    public Builder setFile(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * <strong>Required.</strong> A file to upload. Make sure that the specifications follow RFC
     * 2388, which defines file transfers for the {@code multipart/form-data} protocol.
     */
    public Builder setFile(File file) {
      this.file = file;
      return this;
    }

    /**
     * Optional parameters that automatically create a <a
     * href="https://stripe.com/docs/api#file_links">file link</a> for the newly created file.
     */
    public Builder setFileLinkData(FileCreateParams.FileLinkData fileLinkData) {
      this.fileLinkData = fileLinkData;
      return this;
    }

    /**
     * <strong>Required.</strong> The <a
     * href="https://stripe.com/docs/file-upload#uploading-a-file">purpose</a> of the uploaded file.
     */
    public Builder setPurpose(FileCreateParams.Purpose purpose) {
      this.purpose = purpose;
      return this;
    }
  }

  @Getter
  public static class FileLinkData {
    /**
     * <strong>Required.</strong> Set this to {@code true} to create a file link for the newly
     * created file. Creating a link is only possible when the file's {@code purpose} is one of the
     * following: {@code business_icon}, {@code business_logo}, {@code customer_signature}, {@code
     * dispute_evidence}, {@code issuing_regulatory_reporting}, {@code pci_document}, {@code
     * tax_document_user_upload}, or {@code terminal_reader_splashscreen}.
     */
    @SerializedName("create")
    Boolean create;

    /** The link isn't available after this future timestamp. */
    @SerializedName("expires_at")
    Long expiresAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    private FileLinkData(
        Boolean create, Long expiresAt, Map<String, Object> extraParams, Object metadata) {
      this.create = create;
      this.expiresAt = expiresAt;
      this.extraParams = extraParams;
      this.metadata = metadata;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean create;

      private Long expiresAt;

      private Map<String, Object> extraParams;

      private Object metadata;

      /** Finalize and obtain parameter instance from this builder. */
      public FileCreateParams.FileLinkData build() {
        return new FileCreateParams.FileLinkData(
            this.create, this.expiresAt, this.extraParams, this.metadata);
      }

      /**
       * <strong>Required.</strong> Set this to {@code true} to create a file link for the newly
       * created file. Creating a link is only possible when the file's {@code purpose} is one of
       * the following: {@code business_icon}, {@code business_logo}, {@code customer_signature},
       * {@code dispute_evidence}, {@code issuing_regulatory_reporting}, {@code pci_document},
       * {@code tax_document_user_upload}, or {@code terminal_reader_splashscreen}.
       */
      public Builder setCreate(Boolean create) {
        this.create = create;
        return this;
      }

      /** The link isn't available after this future timestamp. */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FileCreateParams.FileLinkData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link FileCreateParams.FileLinkData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FileCreateParams.FileLinkData#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link FileCreateParams.FileLinkData#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).putAll(map);
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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

    @SerializedName("issuing_regulatory_reporting")
    ISSUING_REGULATORY_REPORTING("issuing_regulatory_reporting"),

    @SerializedName("pci_document")
    PCI_DOCUMENT("pci_document"),

    @SerializedName("issuing_logo")
    ISSUING_LOGO("issuing_logo"),

    @SerializedName("tax_document_user_upload")
    TAX_DOCUMENT_USER_UPLOAD("tax_document_user_upload"),

    @SerializedName("terminal_reader_splashscreen")
    TERMINAL_READER_SPLASHSCREEN("terminal_reader_splashscreen");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Purpose(String value) {
      this.value = value;
    }
  }

  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> baseMap = super.toMap();
    baseMap.put("file", this.file);
    return baseMap;
  }
}
