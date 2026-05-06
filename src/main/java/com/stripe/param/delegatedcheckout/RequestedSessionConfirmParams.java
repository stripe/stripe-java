// File generated from our OpenAPI spec
package com.stripe.param.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RequestedSessionConfirmParams extends ApiRequestParams {
  /** Affiliate attribution data associated with this requested session. */
  @SerializedName("affiliate_attribution")
  AffiliateAttribution affiliateAttribution;

  /** The buyer's consent choices for marketing communications. */
  @SerializedName("buyer_consents")
  BuyerConsents buyerConsents;

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

  /** The metadata for this requested session. */
  @SerializedName("metadata")
  Object metadata;

  /** The PaymentMethod to use with the requested session. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * The URL to redirect your customer back to after they authenticate or complete a payment action.
   * Required for redirect-based payment methods such as Affirm or Klarna.
   */
  @SerializedName("return_url")
  String returnUrl;

  /** Risk details/signals associated with the requested session. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  private RequestedSessionConfirmParams(
      AffiliateAttribution affiliateAttribution,
      BuyerConsents buyerConsents,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      String paymentMethod,
      String returnUrl,
      RiskDetails riskDetails) {
    this.affiliateAttribution = affiliateAttribution;
    this.buyerConsents = buyerConsents;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.returnUrl = returnUrl;
    this.riskDetails = riskDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AffiliateAttribution affiliateAttribution;

    private BuyerConsents buyerConsents;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private String paymentMethod;

    private String returnUrl;

    private RiskDetails riskDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionConfirmParams build() {
      return new RequestedSessionConfirmParams(
          this.affiliateAttribution,
          this.buyerConsents,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentMethod,
          this.returnUrl,
          this.riskDetails);
    }

    /** Affiliate attribution data associated with this requested session. */
    public Builder setAffiliateAttribution(
        RequestedSessionConfirmParams.AffiliateAttribution affiliateAttribution) {
      this.affiliateAttribution = affiliateAttribution;
      return this;
    }

    /** The buyer's consent choices for marketing communications. */
    public Builder setBuyerConsents(RequestedSessionConfirmParams.BuyerConsents buyerConsents) {
      this.buyerConsents = buyerConsents;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#extraParams} for the field documentation.
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
     * See {@link RequestedSessionConfirmParams#extraParams} for the field documentation.
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
     * RequestedSessionConfirmParams#metadata} for the field documentation.
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
     * See {@link RequestedSessionConfirmParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /** The metadata for this requested session. */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The metadata for this requested session. */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The PaymentMethod to use with the requested session. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or complete a payment
     * action. Required for redirect-based payment methods such as Affirm or Klarna.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /** Risk details/signals associated with the requested session. */
    public Builder setRiskDetails(RequestedSessionConfirmParams.RiskDetails riskDetails) {
      this.riskDetails = riskDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AffiliateAttribution {
    /** Agent-scoped campaign identifier. */
    @SerializedName("campaign_id")
    String campaignId;

    /** Agent-scoped creative identifier. */
    @SerializedName("creative_id")
    String creativeId;

    /** <strong>Required.</strong> Timestamp when the attribution token expires. */
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
     * <strong>Required.</strong> Agent-issued secret to validate the legitimacy of the source of
     * this data.
     */
    @SerializedName("identification_token")
    String identificationToken;

    /** <strong>Required.</strong> Timestamp for when the attribution token was issued. */
    @SerializedName("issued_at")
    Long issuedAt;

    /**
     * <strong>Required.</strong> Identifier for the attribution agent / affiliate network
     * namespace.
     */
    @SerializedName("provider")
    String provider;

    /** Agent-scoped affiliate/publisher identifier. */
    @SerializedName("publisher_id")
    String publisherId;

    /** Freeform key/value pairs for additional non-sensitive per-agent data. */
    @SerializedName("shared_metadata")
    Map<String, String> sharedMetadata;

    /** Context about where the attribution originated. */
    @SerializedName("source")
    Source source;

    /** Agent-scoped sub-tracking identifier. */
    @SerializedName("sub_id")
    String subId;

    /** <strong>Required.</strong> Whether this is the first or last touchpoint. */
    @SerializedName("touchpoint")
    Touchpoint touchpoint;

    private AffiliateAttribution(
        String campaignId,
        String creativeId,
        Long expiresAt,
        Map<String, Object> extraParams,
        String identificationToken,
        Long issuedAt,
        String provider,
        String publisherId,
        Map<String, String> sharedMetadata,
        Source source,
        String subId,
        Touchpoint touchpoint) {
      this.campaignId = campaignId;
      this.creativeId = creativeId;
      this.expiresAt = expiresAt;
      this.extraParams = extraParams;
      this.identificationToken = identificationToken;
      this.issuedAt = issuedAt;
      this.provider = provider;
      this.publisherId = publisherId;
      this.sharedMetadata = sharedMetadata;
      this.source = source;
      this.subId = subId;
      this.touchpoint = touchpoint;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String campaignId;

      private String creativeId;

      private Long expiresAt;

      private Map<String, Object> extraParams;

      private String identificationToken;

      private Long issuedAt;

      private String provider;

      private String publisherId;

      private Map<String, String> sharedMetadata;

      private Source source;

      private String subId;

      private Touchpoint touchpoint;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.AffiliateAttribution build() {
        return new RequestedSessionConfirmParams.AffiliateAttribution(
            this.campaignId,
            this.creativeId,
            this.expiresAt,
            this.extraParams,
            this.identificationToken,
            this.issuedAt,
            this.provider,
            this.publisherId,
            this.sharedMetadata,
            this.source,
            this.subId,
            this.touchpoint);
      }

      /** Agent-scoped campaign identifier. */
      public Builder setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
      }

      /** Agent-scoped creative identifier. */
      public Builder setCreativeId(String creativeId) {
        this.creativeId = creativeId;
        return this;
      }

      /** <strong>Required.</strong> Timestamp when the attribution token expires. */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.AffiliateAttribution#extraParams} for the field
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
       * See {@link RequestedSessionConfirmParams.AffiliateAttribution#extraParams} for the field
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
       * <strong>Required.</strong> Agent-issued secret to validate the legitimacy of the source of
       * this data.
       */
      public Builder setIdentificationToken(String identificationToken) {
        this.identificationToken = identificationToken;
        return this;
      }

      /** <strong>Required.</strong> Timestamp for when the attribution token was issued. */
      public Builder setIssuedAt(Long issuedAt) {
        this.issuedAt = issuedAt;
        return this;
      }

      /**
       * <strong>Required.</strong> Identifier for the attribution agent / affiliate network
       * namespace.
       */
      public Builder setProvider(String provider) {
        this.provider = provider;
        return this;
      }

      /** Agent-scoped affiliate/publisher identifier. */
      public Builder setPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
      }

      /**
       * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link RequestedSessionConfirmParams.AffiliateAttribution#sharedMetadata} for the field
       * documentation.
       */
      public Builder putSharedMetadata(String key, String value) {
        if (this.sharedMetadata == null) {
          this.sharedMetadata = new HashMap<>();
        }
        this.sharedMetadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `sharedMetadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link RequestedSessionConfirmParams.AffiliateAttribution#sharedMetadata} for the field
       * documentation.
       */
      public Builder putAllSharedMetadata(Map<String, String> map) {
        if (this.sharedMetadata == null) {
          this.sharedMetadata = new HashMap<>();
        }
        this.sharedMetadata.putAll(map);
        return this;
      }

      /** Context about where the attribution originated. */
      public Builder setSource(RequestedSessionConfirmParams.AffiliateAttribution.Source source) {
        this.source = source;
        return this;
      }

      /** Agent-scoped sub-tracking identifier. */
      public Builder setSubId(String subId) {
        this.subId = subId;
        return this;
      }

      /** <strong>Required.</strong> Whether this is the first or last touchpoint. */
      public Builder setTouchpoint(
          RequestedSessionConfirmParams.AffiliateAttribution.Touchpoint touchpoint) {
        this.touchpoint = touchpoint;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Source {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The platform where the attribution originated. */
      @SerializedName("platform")
      String platform;

      /** <strong>Required.</strong> The type of the attribution source. */
      @SerializedName("type")
      Type type;

      /** The URL where the attribution originated. */
      @SerializedName("url")
      String url;

      private Source(Map<String, Object> extraParams, String platform, Type type, String url) {
        this.extraParams = extraParams;
        this.platform = platform;
        this.type = type;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String platform;

        private Type type;

        private String url;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.AffiliateAttribution.Source build() {
          return new RequestedSessionConfirmParams.AffiliateAttribution.Source(
              this.extraParams, this.platform, this.type, this.url);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestedSessionConfirmParams.AffiliateAttribution.Source#extraParams}
         * for the field documentation.
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
         * map. See {@link RequestedSessionConfirmParams.AffiliateAttribution.Source#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The platform where the attribution originated. */
        public Builder setPlatform(String platform) {
          this.platform = platform;
          return this;
        }

        /** <strong>Required.</strong> The type of the attribution source. */
        public Builder setType(
            RequestedSessionConfirmParams.AffiliateAttribution.Source.Type type) {
          this.type = type;
          return this;
        }

        /** The URL where the attribution originated. */
        public Builder setUrl(String url) {
          this.url = url;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("platform")
        PLATFORM("platform"),

        @SerializedName("url")
        URL("url");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Touchpoint implements ApiRequestParams.EnumParam {
      @SerializedName("first")
      FIRST("first"),

      @SerializedName("last")
      LAST("last");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Touchpoint(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BuyerConsents {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The marketing consent data for the buyer. */
    @SerializedName("marketing")
    Marketing marketing;

    private BuyerConsents(Map<String, Object> extraParams, Marketing marketing) {
      this.extraParams = extraParams;
      this.marketing = marketing;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Marketing marketing;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.BuyerConsents build() {
        return new RequestedSessionConfirmParams.BuyerConsents(this.extraParams, this.marketing);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.BuyerConsents#extraParams} for the field documentation.
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
       * See {@link RequestedSessionConfirmParams.BuyerConsents#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The marketing consent data for the buyer. */
      public Builder setMarketing(RequestedSessionConfirmParams.BuyerConsents.Marketing marketing) {
        this.marketing = marketing;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Marketing {
      /** The list of marketing consent entries. */
      @SerializedName("consents")
      List<RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent> consents;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Marketing(
          List<RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent> consents,
          Map<String, Object> extraParams) {
        this.consents = consents;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent> consents;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.BuyerConsents.Marketing build() {
          return new RequestedSessionConfirmParams.BuyerConsents.Marketing(
              this.consents, this.extraParams);
        }

        /**
         * Add an element to `consents` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * RequestedSessionConfirmParams.BuyerConsents.Marketing#consents} for the field
         * documentation.
         */
        public Builder addConsent(
            RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent element) {
          if (this.consents == null) {
            this.consents = new ArrayList<>();
          }
          this.consents.add(element);
          return this;
        }

        /**
         * Add all elements to `consents` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * RequestedSessionConfirmParams.BuyerConsents.Marketing#consents} for the field
         * documentation.
         */
        public Builder addAllConsent(
            List<RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent> elements) {
          if (this.consents == null) {
            this.consents = new ArrayList<>();
          }
          this.consents.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestedSessionConfirmParams.BuyerConsents.Marketing#extraParams} for
         * the field documentation.
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
         * map. See {@link RequestedSessionConfirmParams.BuyerConsents.Marketing#extraParams} for
         * the field documentation.
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
      @EqualsAndHashCode(callSuper = false)
      public static class Consent {
        /** <strong>Required.</strong> The marketing consent channel. */
        @SerializedName("channel")
        Channel channel;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The consent status. Use 'granted' to indicate the buyer has
         * opted in.
         */
        @SerializedName("status")
        Status status;

        private Consent(Channel channel, Map<String, Object> extraParams, Status status) {
          this.channel = channel;
          this.extraParams = extraParams;
          this.status = status;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Channel channel;

          private Map<String, Object> extraParams;

          private Status status;

          /** Finalize and obtain parameter instance from this builder. */
          public RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent build() {
            return new RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent(
                this.channel, this.extraParams, this.status);
          }

          /** <strong>Required.</strong> The marketing consent channel. */
          public Builder setChannel(
              RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent.Channel channel) {
            this.channel = channel;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent#extraParams} for the
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
           * map. See {@link
           * RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent#extraParams} for the
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
           * <strong>Required.</strong> The consent status. Use 'granted' to indicate the buyer has
           * opted in.
           */
          public Builder setStatus(
              RequestedSessionConfirmParams.BuyerConsents.Marketing.Consent.Status status) {
            this.status = status;
            return this;
          }
        }

        public enum Channel implements ApiRequestParams.EnumParam {
          @SerializedName("email")
          EMAIL("email"),

          @SerializedName("sms")
          SMS("sms");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Channel(String value) {
            this.value = value;
          }
        }

        public enum Status implements ApiRequestParams.EnumParam {
          @SerializedName("granted")
          GRANTED("granted"),

          @SerializedName("none")
          NONE("none");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Status(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskDetails {
    /** The client device metadata details for this requested session. */
    @SerializedName("client_device_metadata_details")
    ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RiskDetails(
        ClientDeviceMetadataDetails clientDeviceMetadataDetails, Map<String, Object> extraParams) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.RiskDetails build() {
        return new RequestedSessionConfirmParams.RiskDetails(
            this.clientDeviceMetadataDetails, this.extraParams);
      }

      /** The client device metadata details for this requested session. */
      public Builder setClientDeviceMetadataDetails(
          RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails
              clientDeviceMetadataDetails) {
        this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.RiskDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionConfirmParams.RiskDetails#extraParams} for the field
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
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDeviceMetadataDetails {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The radar session. */
      @SerializedName("radar_session")
      String radarSession;

      /** The referrer of the client device. */
      @SerializedName("referrer")
      String referrer;

      /** The remote IP address of the client device. */
      @SerializedName("remote_ip")
      String remoteIp;

      /** The time on page in milliseconds. */
      @SerializedName("time_on_page_ms")
      Long timeOnPageMs;

      /** The user agent of the client device. */
      @SerializedName("user_agent")
      String userAgent;

      private ClientDeviceMetadataDetails(
          Map<String, Object> extraParams,
          String radarSession,
          String referrer,
          String remoteIp,
          Long timeOnPageMs,
          String userAgent) {
        this.extraParams = extraParams;
        this.radarSession = radarSession;
        this.referrer = referrer;
        this.remoteIp = remoteIp;
        this.timeOnPageMs = timeOnPageMs;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String radarSession;

        private String referrer;

        private String remoteIp;

        private Long timeOnPageMs;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails build() {
          return new RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails(
              this.extraParams,
              this.radarSession,
              this.referrer,
              this.remoteIp,
              this.timeOnPageMs,
              this.userAgent);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
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
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The radar session. */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }

        /** The referrer of the client device. */
        public Builder setReferrer(String referrer) {
          this.referrer = referrer;
          return this;
        }

        /** The remote IP address of the client device. */
        public Builder setRemoteIp(String remoteIp) {
          this.remoteIp = remoteIp;
          return this;
        }

        /** The time on page in milliseconds. */
        public Builder setTimeOnPageMs(Long timeOnPageMs) {
          this.timeOnPageMs = timeOnPageMs;
          return this;
        }

        /** The user agent of the client device. */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }
  }
}
