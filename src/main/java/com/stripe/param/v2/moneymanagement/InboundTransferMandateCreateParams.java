// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class InboundTransferMandateCreateParams extends ApiRequestParams {
  /** Optional Australian BECS-specific parameters. */
  @SerializedName("au_becs")
  AuBecs auBecs;

  /** Optional Bacs-specific parameters. */
  @SerializedName("bacs")
  Bacs bacs;

  /**
   * <strong>Required.</strong> The v2 credential (GB Bank Account or equivalent) this mandate is
   * created for. Must belong to the authenticated compartment.
   */
  @SerializedName("credential")
  String credential;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The mandate scheme type. */
  @SerializedName("type")
  Type type;

  /**
   * Optional acceptance evidence collected from the merchant. Direct account calls can omit details
   * that are derived from request metadata. Platform calls creating a mandate for a connected
   * account must provide accepted_at, online.ip_address, and online.user_agent.
   */
  @SerializedName("user_accepted_details")
  UserAcceptedDetails userAcceptedDetails;

  private InboundTransferMandateCreateParams(
      AuBecs auBecs,
      Bacs bacs,
      String credential,
      Map<String, Object> extraParams,
      Type type,
      UserAcceptedDetails userAcceptedDetails) {
    this.auBecs = auBecs;
    this.bacs = bacs;
    this.credential = credential;
    this.extraParams = extraParams;
    this.type = type;
    this.userAcceptedDetails = userAcceptedDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AuBecs auBecs;

    private Bacs bacs;

    private String credential;

    private Map<String, Object> extraParams;

    private Type type;

    private UserAcceptedDetails userAcceptedDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public InboundTransferMandateCreateParams build() {
      return new InboundTransferMandateCreateParams(
          this.auBecs,
          this.bacs,
          this.credential,
          this.extraParams,
          this.type,
          this.userAcceptedDetails);
    }

    /** Optional Australian BECS-specific parameters. */
    public Builder setAuBecs(InboundTransferMandateCreateParams.AuBecs auBecs) {
      this.auBecs = auBecs;
      return this;
    }

    /** Optional Bacs-specific parameters. */
    public Builder setBacs(InboundTransferMandateCreateParams.Bacs bacs) {
      this.bacs = bacs;
      return this;
    }

    /**
     * <strong>Required.</strong> The v2 credential (GB Bank Account or equivalent) this mandate is
     * created for. Must belong to the authenticated compartment.
     */
    public Builder setCredential(String credential) {
      this.credential = credential;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InboundTransferMandateCreateParams#extraParams} for the field documentation.
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
     * See {@link InboundTransferMandateCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The mandate scheme type. */
    public Builder setType(InboundTransferMandateCreateParams.Type type) {
      this.type = type;
      return this;
    }

    /**
     * Optional acceptance evidence collected from the merchant. Direct account calls can omit
     * details that are derived from request metadata. Platform calls creating a mandate for a
     * connected account must provide accepted_at, online.ip_address, and online.user_agent.
     */
    public Builder setUserAcceptedDetails(
        InboundTransferMandateCreateParams.UserAcceptedDetails userAcceptedDetails) {
      this.userAcceptedDetails = userAcceptedDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecs {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Optional prefix for the generated 18-character lodgement reference. The prefix is normalized
     * to uppercase and must be empty or contain 1-10 letters, digits, or underscores.
     */
    @SerializedName("lodgement_reference_prefix")
    String lodgementReferencePrefix;

    private AuBecs(Map<String, Object> extraParams, String lodgementReferencePrefix) {
      this.extraParams = extraParams;
      this.lodgementReferencePrefix = lodgementReferencePrefix;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String lodgementReferencePrefix;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferMandateCreateParams.AuBecs build() {
        return new InboundTransferMandateCreateParams.AuBecs(
            this.extraParams, this.lodgementReferencePrefix);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferMandateCreateParams.AuBecs#extraParams} for the field documentation.
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
       * See {@link InboundTransferMandateCreateParams.AuBecs#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Optional prefix for the generated 18-character lodgement reference. The prefix is
       * normalized to uppercase and must be empty or contain 1-10 letters, digits, or underscores.
       */
      public Builder setLodgementReferencePrefix(String lodgementReferencePrefix) {
        this.lodgementReferencePrefix = lodgementReferencePrefix;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Bacs {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Optional prefix for the generated mandate reference (max 10 chars). */
    @SerializedName("reference_prefix")
    String referencePrefix;

    private Bacs(Map<String, Object> extraParams, String referencePrefix) {
      this.extraParams = extraParams;
      this.referencePrefix = referencePrefix;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String referencePrefix;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferMandateCreateParams.Bacs build() {
        return new InboundTransferMandateCreateParams.Bacs(this.extraParams, this.referencePrefix);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferMandateCreateParams.Bacs#extraParams} for the field documentation.
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
       * See {@link InboundTransferMandateCreateParams.Bacs#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Optional prefix for the generated mandate reference (max 10 chars). */
      public Builder setReferencePrefix(String referencePrefix) {
        this.referencePrefix = referencePrefix;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UserAcceptedDetails {
    /**
     * When the merchant accepted the mandate. Must be a past timestamp. For direct account
     * requests, defaults to the mandate's creation time when not supplied.
     */
    @SerializedName("accepted_at")
    Instant acceptedAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Optional details for online acceptance. */
    @SerializedName("online")
    Online online;

    /** Channel through which acceptance was obtained. */
    @SerializedName("type")
    Type type;

    private UserAcceptedDetails(
        Instant acceptedAt, Map<String, Object> extraParams, Online online, Type type) {
      this.acceptedAt = acceptedAt;
      this.extraParams = extraParams;
      this.online = online;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Instant acceptedAt;

      private Map<String, Object> extraParams;

      private Online online;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferMandateCreateParams.UserAcceptedDetails build() {
        return new InboundTransferMandateCreateParams.UserAcceptedDetails(
            this.acceptedAt, this.extraParams, this.online, this.type);
      }

      /**
       * When the merchant accepted the mandate. Must be a past timestamp. For direct account
       * requests, defaults to the mandate's creation time when not supplied.
       */
      public Builder setAcceptedAt(Instant acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferMandateCreateParams.UserAcceptedDetails#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InboundTransferMandateCreateParams.UserAcceptedDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Optional details for online acceptance. */
      public Builder setOnline(
          InboundTransferMandateCreateParams.UserAcceptedDetails.Online online) {
        this.online = online;
        return this;
      }

      /** Channel through which acceptance was obtained. */
      public Builder setType(InboundTransferMandateCreateParams.UserAcceptedDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Online {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The IP address from which the merchant accepted the mandate. For direct account requests,
       * derived from the request when not supplied; rejected if obtainable from neither.
       */
      @SerializedName("ip_address")
      String ipAddress;

      /**
       * The user agent of the browser from which the merchant accepted the mandate. For direct
       * account requests, derived from the request when not supplied.
       */
      @SerializedName("user_agent")
      String userAgent;

      private Online(Map<String, Object> extraParams, String ipAddress, String userAgent) {
        this.extraParams = extraParams;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String ipAddress;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public InboundTransferMandateCreateParams.UserAcceptedDetails.Online build() {
          return new InboundTransferMandateCreateParams.UserAcceptedDetails.Online(
              this.extraParams, this.ipAddress, this.userAgent);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InboundTransferMandateCreateParams.UserAcceptedDetails.Online#extraParams} for the field
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
         * map. See {@link
         * InboundTransferMandateCreateParams.UserAcceptedDetails.Online#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The IP address from which the merchant accepted the mandate. For direct account requests,
         * derived from the request when not supplied; rejected if obtainable from neither.
         */
        public Builder setIpAddress(String ipAddress) {
          this.ipAddress = ipAddress;
          return this;
        }

        /**
         * The user agent of the browser from which the merchant accepted the mandate. For direct
         * account requests, derived from the request when not supplied.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("online")
      ONLINE("online");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("au_becs")
    AU_BECS("au_becs"),

    @SerializedName("bacs")
    BACS("bacs"),

    @SerializedName("nz_becs")
    NZ_BECS("nz_becs"),

    @SerializedName("sepa")
    SEPA("sepa");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
