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
public class VerificationSessionCreateParams extends ApiRequestParams {
  /**
   * A string to reference this user. This can be a customer ID, a session ID, or similar, and can
   * be used to reconcile this verification with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

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

  /** The URL that the user will be redirected to upon completing the verification flow. */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * The type of <a href="https://stripe.com/docs/identity/verification-checks">verification
   * check</a> to be performed.
   */
  @SerializedName("type")
  Type type;

  /** The ID of a Verification Flow from the Dashboard. */
  @SerializedName("verification_flow")
  String verificationFlow;

  private VerificationSessionCreateParams(
      String clientReferenceId,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Options options,
      ProvidedDetails providedDetails,
      String returnUrl,
      Type type,
      String verificationFlow) {
    this.clientReferenceId = clientReferenceId;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.options = options;
    this.providedDetails = providedDetails;
    this.returnUrl = returnUrl;
    this.type = type;
    this.verificationFlow = verificationFlow;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String clientReferenceId;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Options options;

    private ProvidedDetails providedDetails;

    private String returnUrl;

    private Type type;

    private String verificationFlow;

    /** Finalize and obtain parameter instance from this builder. */
    public VerificationSessionCreateParams build() {
      return new VerificationSessionCreateParams(
          this.clientReferenceId,
          this.expand,
          this.extraParams,
          this.metadata,
          this.options,
          this.providedDetails,
          this.returnUrl,
          this.type,
          this.verificationFlow);
    }

    /**
     * A string to reference this user. This can be a customer ID, a session ID, or similar, and can
     * be used to reconcile this verification with your internal systems.
     */
    public Builder setClientReferenceId(String clientReferenceId) {
      this.clientReferenceId = clientReferenceId;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * VerificationSessionCreateParams#expand} for the field documentation.
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
     * VerificationSessionCreateParams#expand} for the field documentation.
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
     * VerificationSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link VerificationSessionCreateParams#extraParams} for the field documentation.
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
     * VerificationSessionCreateParams#metadata} for the field documentation.
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
     * See {@link VerificationSessionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** A set of options for the session’s verification checks. */
    public Builder setOptions(VerificationSessionCreateParams.Options options) {
      this.options = options;
      return this;
    }

    /** Details provided about the user being verified. These details may be shown to the user. */
    public Builder setProvidedDetails(
        VerificationSessionCreateParams.ProvidedDetails providedDetails) {
      this.providedDetails = providedDetails;
      return this;
    }

    /** The URL that the user will be redirected to upon completing the verification flow. */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * The type of <a href="https://stripe.com/docs/identity/verification-checks">verification
     * check</a> to be performed.
     */
    public Builder setType(VerificationSessionCreateParams.Type type) {
      this.type = type;
      return this;
    }

    /** The ID of a Verification Flow from the Dashboard. */
    public Builder setVerificationFlow(String verificationFlow) {
      this.verificationFlow = verificationFlow;
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

    /** Options that apply to the email check. */
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

    /** Options that apply to the phone check. */
    @SerializedName("phone")
    Object phone;

    private Options(Object document, Object email, Map<String, Object> extraParams, Object phone) {
      this.document = document;
      this.email = email;
      this.extraParams = extraParams;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object document;

      private Object email;

      private Map<String, Object> extraParams;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public VerificationSessionCreateParams.Options build() {
        return new VerificationSessionCreateParams.Options(
            this.document, this.email, this.extraParams, this.phone);
      }

      /**
       * Options that apply to the <a
       * href="https://stripe.com/docs/identity/verification-checks?type=document">document
       * check</a>.
       */
      public Builder setDocument(VerificationSessionCreateParams.Options.Document document) {
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

      /** Options that apply to the email check. */
      public Builder setEmail(VerificationSessionCreateParams.Options.Email email) {
        this.email = email;
        return this;
      }

      /** Options that apply to the email check. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * VerificationSessionCreateParams.Options#extraParams} for the field documentation.
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
       * See {@link VerificationSessionCreateParams.Options#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Options that apply to the phone check. */
      public Builder setPhone(VerificationSessionCreateParams.Options.Phone phone) {
        this.phone = phone;
        return this;
      }

      /** Options that apply to the phone check. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
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
      List<VerificationSessionCreateParams.Options.Document.AllowedType> allowedTypes;

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
          List<VerificationSessionCreateParams.Options.Document.AllowedType> allowedTypes,
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
        private List<VerificationSessionCreateParams.Options.Document.AllowedType> allowedTypes;

        private Map<String, Object> extraParams;

        private Boolean requireIdNumber;

        private Boolean requireLiveCapture;

        private Boolean requireMatchingSelfie;

        /** Finalize and obtain parameter instance from this builder. */
        public VerificationSessionCreateParams.Options.Document build() {
          return new VerificationSessionCreateParams.Options.Document(
              this.allowedTypes,
              this.extraParams,
              this.requireIdNumber,
              this.requireLiveCapture,
              this.requireMatchingSelfie);
        }

        /**
         * Add an element to `allowedTypes` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * VerificationSessionCreateParams.Options.Document#allowedTypes} for the field
         * documentation.
         */
        public Builder addAllowedType(
            VerificationSessionCreateParams.Options.Document.AllowedType element) {
          if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>();
          }
          this.allowedTypes.add(element);
          return this;
        }

        /**
         * Add all elements to `allowedTypes` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * VerificationSessionCreateParams.Options.Document#allowedTypes} for the field
         * documentation.
         */
        public Builder addAllAllowedType(
            List<VerificationSessionCreateParams.Options.Document.AllowedType> elements) {
          if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>();
          }
          this.allowedTypes.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link VerificationSessionCreateParams.Options.Document#extraParams} for the
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
         * map. See {@link VerificationSessionCreateParams.Options.Document#extraParams} for the
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

    @Getter
    public static class Email {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Request one time password verification of {@code provided_details.email}. */
      @SerializedName("require_verification")
      Boolean requireVerification;

      private Email(Map<String, Object> extraParams, Boolean requireVerification) {
        this.extraParams = extraParams;
        this.requireVerification = requireVerification;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requireVerification;

        /** Finalize and obtain parameter instance from this builder. */
        public VerificationSessionCreateParams.Options.Email build() {
          return new VerificationSessionCreateParams.Options.Email(
              this.extraParams, this.requireVerification);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link VerificationSessionCreateParams.Options.Email#extraParams} for the field
         * documentation.
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
         * map. See {@link VerificationSessionCreateParams.Options.Email#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Request one time password verification of {@code provided_details.email}. */
        public Builder setRequireVerification(Boolean requireVerification) {
          this.requireVerification = requireVerification;
          return this;
        }
      }
    }

    @Getter
    public static class Phone {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Request one time password verification of {@code provided_details.phone}. */
      @SerializedName("require_verification")
      Boolean requireVerification;

      private Phone(Map<String, Object> extraParams, Boolean requireVerification) {
        this.extraParams = extraParams;
        this.requireVerification = requireVerification;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requireVerification;

        /** Finalize and obtain parameter instance from this builder. */
        public VerificationSessionCreateParams.Options.Phone build() {
          return new VerificationSessionCreateParams.Options.Phone(
              this.extraParams, this.requireVerification);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link VerificationSessionCreateParams.Options.Phone#extraParams} for the field
         * documentation.
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
         * map. See {@link VerificationSessionCreateParams.Options.Phone#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Request one time password verification of {@code provided_details.phone}. */
        public Builder setRequireVerification(Boolean requireVerification) {
          this.requireVerification = requireVerification;
          return this;
        }
      }
    }
  }

  @Getter
  public static class ProvidedDetails {
    /** Email of user being verified. */
    @SerializedName("email")
    String email;

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
    String phone;

    private ProvidedDetails(String email, Map<String, Object> extraParams, String phone) {
      this.email = email;
      this.extraParams = extraParams;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String email;

      private Map<String, Object> extraParams;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public VerificationSessionCreateParams.ProvidedDetails build() {
        return new VerificationSessionCreateParams.ProvidedDetails(
            this.email, this.extraParams, this.phone);
      }

      /** Email of user being verified. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * VerificationSessionCreateParams.ProvidedDetails#extraParams} for the field documentation.
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
       * See {@link VerificationSessionCreateParams.ProvidedDetails#extraParams} for the field
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
