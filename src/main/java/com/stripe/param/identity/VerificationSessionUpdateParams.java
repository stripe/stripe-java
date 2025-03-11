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

  /** A set of options for the session’s verification checks. */
  @SerializedName("options")
  Options options;

  /** Details provided about the user being verified. These details may be shown to the user. */
  @SerializedName("provided_details")
  ProvidedDetails providedDetails;

  /**
   * The type of <a href="https://stripe.com/docs/identity/verification-checks">verification
   * check</a> to be performed.
   */
  @SerializedName("type")
  Type type;

  private VerificationSessionUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Options options,
      ProvidedDetails providedDetails,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.options = options;
    this.providedDetails = providedDetails;
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

    private ProvidedDetails providedDetails;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public VerificationSessionUpdateParams build() {
      return new VerificationSessionUpdateParams(
          this.expand,
          this.extraParams,
          this.metadata,
          this.options,
          this.providedDetails,
          this.type);
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

    /** A set of options for the session’s verification checks. */
    public Builder setOptions(VerificationSessionUpdateParams.Options options) {
      this.options = options;
      return this;
    }

    /** Details provided about the user being verified. These details may be shown to the user. */
    public Builder setProvidedDetails(
        VerificationSessionUpdateParams.ProvidedDetails providedDetails) {
      this.providedDetails = providedDetails;
      return this;
    }

    /**
     * The type of <a href="https://stripe.com/docs/identity/verification-checks">verification
     * check</a> to be performed.
     */
    public Builder setType(VerificationSessionUpdateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Options {
    /**
     * Options that apply to the <a
     * href="https://stripe.com/docs/identity/verification-checks?type=document">document check</a>.
     */
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
      public VerificationSessionUpdateParams.Options build() {
        return new VerificationSessionUpdateParams.Options(this.document, this.extraParams);
      }

      /**
       * Options that apply to the <a
       * href="https://stripe.com/docs/identity/verification-checks?type=document">document
       * check</a>.
       */
      public Builder setDocument(VerificationSessionUpdateParams.Options.Document document) {
        this.document = document;
        return this;
      }

      /**
       * Options that apply to the <a
       * href="https://stripe.com/docs/identity/verification-checks?type=document">document
       * check</a>.
       */
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
      /**
       * Array of strings of allowed identity document types. If the provided identity document
       * isn’t one of the allowed types, the verification check will fail with a
       * document_type_not_allowed error code.
       */
      @SerializedName("allowed_types")
      List<VerificationSessionUpdateParams.Options.Document.AllowedType> allowedTypes;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Collect an ID number and perform an <a
       * href="https://stripe.com/docs/identity/verification-checks?type=id-number">ID number
       * check</a> with the document’s extracted name and date of birth.
       */
      @SerializedName("require_id_number")
      Boolean requireIdNumber;

      /**
       * Disable image uploads, identity document images have to be captured using the device’s
       * camera.
       */
      @SerializedName("require_live_capture")
      Boolean requireLiveCapture;

      /**
       * Capture a face image and perform a <a
       * href="https://stripe.com/docs/identity/verification-checks?type=selfie">selfie check</a>
       * comparing a photo ID and a picture of your user’s face. <a
       * href="https://stripe.com/docs/identity/selfie">Learn more</a>.
       */
      @SerializedName("require_matching_selfie")
      Boolean requireMatchingSelfie;

      private Document(
          List<VerificationSessionUpdateParams.Options.Document.AllowedType> allowedTypes,
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
        private List<VerificationSessionUpdateParams.Options.Document.AllowedType> allowedTypes;

        private Map<String, Object> extraParams;

        private Boolean requireIdNumber;

        private Boolean requireLiveCapture;

        private Boolean requireMatchingSelfie;

        /** Finalize and obtain parameter instance from this builder. */
        public VerificationSessionUpdateParams.Options.Document build() {
          return new VerificationSessionUpdateParams.Options.Document(
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
        public Builder addAllowedType(
            VerificationSessionUpdateParams.Options.Document.AllowedType element) {
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
        public Builder addAllAllowedType(
            List<VerificationSessionUpdateParams.Options.Document.AllowedType> elements) {
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

        /**
         * Collect an ID number and perform an <a
         * href="https://stripe.com/docs/identity/verification-checks?type=id-number">ID number
         * check</a> with the document’s extracted name and date of birth.
         */
        public Builder setRequireIdNumber(Boolean requireIdNumber) {
          this.requireIdNumber = requireIdNumber;
          return this;
        }

        /**
         * Disable image uploads, identity document images have to be captured using the device’s
         * camera.
         */
        public Builder setRequireLiveCapture(Boolean requireLiveCapture) {
          this.requireLiveCapture = requireLiveCapture;
          return this;
        }

        /**
         * Capture a face image and perform a <a
         * href="https://stripe.com/docs/identity/verification-checks?type=selfie">selfie check</a>
         * comparing a photo ID and a picture of your user’s face. <a
         * href="https://stripe.com/docs/identity/selfie">Learn more</a>.
         */
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

  @Getter
  public static class ProvidedDetails {
    /** Email of user being verified. */
    @SerializedName("email")
    Object email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Phone number of user being verified. */
    @SerializedName("phone")
    Object phone;

    private ProvidedDetails(Object email, Map<String, Object> extraParams, Object phone) {
      this.email = email;
      this.extraParams = extraParams;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object email;

      private Map<String, Object> extraParams;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public VerificationSessionUpdateParams.ProvidedDetails build() {
        return new VerificationSessionUpdateParams.ProvidedDetails(
            this.email, this.extraParams, this.phone);
      }

      /** Email of user being verified. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** Email of user being verified. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * VerificationSessionUpdateParams.ProvidedDetails#extraParams} for the field documentation.
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
       * See {@link VerificationSessionUpdateParams.ProvidedDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Phone number of user being verified. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Phone number of user being verified. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
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
