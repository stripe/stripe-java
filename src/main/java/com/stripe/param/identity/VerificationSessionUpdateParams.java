// File generated from our OpenAPI spec
package com.stripe.param.identity;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class VerificationSessionUpdateParams extends ApiRequestParams {
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** New configuration options. */
  @SerializedName("options")
  Options options;

  /** New verification type. */
  @SerializedName("type")
  Type type;

  private VerificationSessionUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Options options,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.options = options;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Options options;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public VerificationSessionUpdateParams build() {
      return new VerificationSessionUpdateParams(
          this.expand, this.extraParams, this.metadata, this.options, this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * VerificationSessionUpdateParams#expand} for the field documentation.
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
     * VerificationSessionUpdateParams#expand} for the field documentation.
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
     * VerificationSessionUpdateParams#extraParams} for the field documentation.
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
     * See {@link VerificationSessionUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * VerificationSessionUpdateParams#metadata} for the field documentation.
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
     * See {@link VerificationSessionUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** New configuration options. */
    public Builder setOptions(Options options) {
      this.options = options;
      return this;
    }

    /** New verification type. */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Options {
    /** Verification configuration options for the {@code document} record_type. */
    @SerializedName("document")
    Object document;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Options(Object document, Map<String, Object> extraParams) {
      this.document = document;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object document;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Options build() {
        return new Options(this.document, this.extraParams);
      }

      /** Verification configuration options for the {@code document} record_type. */
      public Builder setDocument(Document document) {
        this.document = document;
        return this;
      }

      /** Verification configuration options for the {@code document} record_type. */
      public Builder setDocument(EmptyParam document) {
        this.document = document;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * VerificationSessionUpdateParams.Options#extraParams} for the field documentation.
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
       * See {@link VerificationSessionUpdateParams.Options#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    public static class Document {
      /** Restrict the list of allowed document type to these types. */
      @SerializedName("allowed_types")
      List<AllowedType> allowedTypes;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Require that the user provide an id number which will be verified. */
      @SerializedName("require_id_number")
      Boolean requireIdNumber;

      /** Require that the user capture documents live with their webcam or phone camera. */
      @SerializedName("require_live_capture")
      Boolean requireLiveCapture;

      /** Require that the user provide a selfie to compare against the document photo. */
      @SerializedName("require_matching_selfie")
      Boolean requireMatchingSelfie;

      private Document(
          List<AllowedType> allowedTypes,
          Map<String, Object> extraParams,
          Boolean requireIdNumber,
          Boolean requireLiveCapture,
          Boolean requireMatchingSelfie) {
        this.allowedTypes = allowedTypes;
        this.extraParams = extraParams;
        this.requireIdNumber = requireIdNumber;
        this.requireLiveCapture = requireLiveCapture;
        this.requireMatchingSelfie = requireMatchingSelfie;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<AllowedType> allowedTypes;

        private Map<String, Object> extraParams;

        private Boolean requireIdNumber;

        private Boolean requireLiveCapture;

        private Boolean requireMatchingSelfie;

        /** Finalize and obtain parameter instance from this builder. */
        public Document build() {
          return new Document(
              this.allowedTypes,
              this.extraParams,
              this.requireIdNumber,
              this.requireLiveCapture,
              this.requireMatchingSelfie);
        }

        /**
         * Add an element to `allowedTypes` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * VerificationSessionUpdateParams.Options.Document#allowedTypes} for the field
         * documentation.
         */
        public Builder addAllowedType(AllowedType element) {
          if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>();
          }
          this.allowedTypes.add(element);
          return this;
        }

        /**
         * Add all elements to `allowedTypes` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * VerificationSessionUpdateParams.Options.Document#allowedTypes} for the field
         * documentation.
         */
        public Builder addAllAllowedType(List<AllowedType> elements) {
          if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>();
          }
          this.allowedTypes.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link VerificationSessionUpdateParams.Options.Document#extraParams} for the
         * field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link VerificationSessionUpdateParams.Options.Document#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Require that the user provide an id number which will be verified. */
        public Builder setRequireIdNumber(Boolean requireIdNumber) {
          this.requireIdNumber = requireIdNumber;
          return this;
        }

        /** Require that the user capture documents live with their webcam or phone camera. */
        public Builder setRequireLiveCapture(Boolean requireLiveCapture) {
          this.requireLiveCapture = requireLiveCapture;
          return this;
        }

        /** Require that the user provide a selfie to compare against the document photo. */
        public Builder setRequireMatchingSelfie(Boolean requireMatchingSelfie) {
          this.requireMatchingSelfie = requireMatchingSelfie;
          return this;
        }
      }

      public enum AllowedType implements ApiRequestParams.EnumParam {
        @SerializedName("driving_license")
        DRIVING_LICENSE("driving_license"),

        @SerializedName("id_card")
        ID_CARD("id_card"),

        @SerializedName("passport")
        PASSPORT("passport");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AllowedType(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("document")
    DOCUMENT("document"),

    @SerializedName("id_number")
    ID_NUMBER("id_number");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
