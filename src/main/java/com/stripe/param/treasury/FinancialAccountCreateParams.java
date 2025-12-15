// File generated from our OpenAPI spec
package com.stripe.param.treasury;

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
public class FinancialAccountCreateParams extends ApiRequestParams {
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
   * Encodes whether a FinancialAccount has access to a particular feature. Stripe or the platform
   * can control features via the requested field.
   */
  @SerializedName("features")
  Features features;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The nickname for the FinancialAccount. */
  @SerializedName("nickname")
  Object nickname;

  /** The set of functionalities that the platform can restrict on the FinancialAccount. */
  @SerializedName("platform_restrictions")
  PlatformRestrictions platformRestrictions;

  /** <strong>Required.</strong> The currencies the FinancialAccount can hold a balance in. */
  @SerializedName("supported_currencies")
  List<String> supportedCurrencies;

  private FinancialAccountCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Features features,
      Map<String, String> metadata,
      Object nickname,
      PlatformRestrictions platformRestrictions,
      List<String> supportedCurrencies) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.features = features;
    this.metadata = metadata;
    this.nickname = nickname;
    this.platformRestrictions = platformRestrictions;
    this.supportedCurrencies = supportedCurrencies;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Features features;

    private Map<String, String> metadata;

    private Object nickname;

    private PlatformRestrictions platformRestrictions;

    private List<String> supportedCurrencies;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountCreateParams build() {
      return new FinancialAccountCreateParams(
          this.expand,
          this.extraParams,
          this.features,
          this.metadata,
          this.nickname,
          this.platformRestrictions,
          this.supportedCurrencies);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountCreateParams#expand} for the field documentation.
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
     * FinancialAccountCreateParams#expand} for the field documentation.
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
     * FinancialAccountCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Encodes whether a FinancialAccount has access to a particular feature. Stripe or the platform
     * can control features via the requested field.
     */
    public Builder setFeatures(FinancialAccountCreateParams.Features features) {
      this.features = features;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountCreateParams#metadata} for the field documentation.
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
     * See {@link FinancialAccountCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The nickname for the FinancialAccount. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** The nickname for the FinancialAccount. */
    public Builder setNickname(EmptyParam nickname) {
      this.nickname = nickname;
      return this;
    }

    /** The set of functionalities that the platform can restrict on the FinancialAccount. */
    public Builder setPlatformRestrictions(
        FinancialAccountCreateParams.PlatformRestrictions platformRestrictions) {
      this.platformRestrictions = platformRestrictions;
      return this;
    }

    /**
     * Add an element to `supportedCurrencies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link FinancialAccountCreateParams#supportedCurrencies} for the field documentation.
     */
    public Builder addSupportedCurrency(String element) {
      if (this.supportedCurrencies == null) {
        this.supportedCurrencies = new ArrayList<>();
      }
      this.supportedCurrencies.add(element);
      return this;
    }

    /**
     * Add all elements to `supportedCurrencies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link FinancialAccountCreateParams#supportedCurrencies} for the field documentation.
     */
    public Builder addAllSupportedCurrency(List<String> elements) {
      if (this.supportedCurrencies == null) {
        this.supportedCurrencies = new ArrayList<>();
      }
      this.supportedCurrencies.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Features {
    /**
     * Encodes the FinancialAccount's ability to be used with the Issuing product, including
     * attaching cards to and drawing funds from the FinancialAccount.
     */
    @SerializedName("card_issuing")
    CardIssuing cardIssuing;

    /**
     * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors
     * determine the insurance amount.
     */
    @SerializedName("deposit_insurance")
    DepositInsurance depositInsurance;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Contains Features that add FinancialAddresses to the FinancialAccount. */
    @SerializedName("financial_addresses")
    FinancialAddresses financialAddresses;

    /**
     * Contains settings related to adding funds to a FinancialAccount from another Account with the
     * same owner.
     */
    @SerializedName("inbound_transfers")
    InboundTransfers inboundTransfers;

    /**
     * Represents the ability for the FinancialAccount to send money to, or receive money from other
     * FinancialAccounts (for example, via OutboundPayment).
     */
    @SerializedName("intra_stripe_flows")
    IntraStripeFlows intraStripeFlows;

    /**
     * Includes Features related to initiating money movement out of the FinancialAccount to someone
     * else's bucket of money.
     */
    @SerializedName("outbound_payments")
    OutboundPayments outboundPayments;

    /**
     * Contains a Feature and settings related to moving money out of the FinancialAccount into
     * another Account with the same owner.
     */
    @SerializedName("outbound_transfers")
    OutboundTransfers outboundTransfers;

    private Features(
        CardIssuing cardIssuing,
        DepositInsurance depositInsurance,
        Map<String, Object> extraParams,
        FinancialAddresses financialAddresses,
        InboundTransfers inboundTransfers,
        IntraStripeFlows intraStripeFlows,
        OutboundPayments outboundPayments,
        OutboundTransfers outboundTransfers) {
      this.cardIssuing = cardIssuing;
      this.depositInsurance = depositInsurance;
      this.extraParams = extraParams;
      this.financialAddresses = financialAddresses;
      this.inboundTransfers = inboundTransfers;
      this.intraStripeFlows = intraStripeFlows;
      this.outboundPayments = outboundPayments;
      this.outboundTransfers = outboundTransfers;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CardIssuing cardIssuing;

      private DepositInsurance depositInsurance;

      private Map<String, Object> extraParams;

      private FinancialAddresses financialAddresses;

      private InboundTransfers inboundTransfers;

      private IntraStripeFlows intraStripeFlows;

      private OutboundPayments outboundPayments;

      private OutboundTransfers outboundTransfers;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountCreateParams.Features build() {
        return new FinancialAccountCreateParams.Features(
            this.cardIssuing,
            this.depositInsurance,
            this.extraParams,
            this.financialAddresses,
            this.inboundTransfers,
            this.intraStripeFlows,
            this.outboundPayments,
            this.outboundTransfers);
      }

      /**
       * Encodes the FinancialAccount's ability to be used with the Issuing product, including
       * attaching cards to and drawing funds from the FinancialAccount.
       */
      public Builder setCardIssuing(FinancialAccountCreateParams.Features.CardIssuing cardIssuing) {
        this.cardIssuing = cardIssuing;
        return this;
      }

      /**
       * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors
       * determine the insurance amount.
       */
      public Builder setDepositInsurance(
          FinancialAccountCreateParams.Features.DepositInsurance depositInsurance) {
        this.depositInsurance = depositInsurance;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountCreateParams.Features#extraParams} for the field documentation.
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
       * See {@link FinancialAccountCreateParams.Features#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Contains Features that add FinancialAddresses to the FinancialAccount. */
      public Builder setFinancialAddresses(
          FinancialAccountCreateParams.Features.FinancialAddresses financialAddresses) {
        this.financialAddresses = financialAddresses;
        return this;
      }

      /**
       * Contains settings related to adding funds to a FinancialAccount from another Account with
       * the same owner.
       */
      public Builder setInboundTransfers(
          FinancialAccountCreateParams.Features.InboundTransfers inboundTransfers) {
        this.inboundTransfers = inboundTransfers;
        return this;
      }

      /**
       * Represents the ability for the FinancialAccount to send money to, or receive money from
       * other FinancialAccounts (for example, via OutboundPayment).
       */
      public Builder setIntraStripeFlows(
          FinancialAccountCreateParams.Features.IntraStripeFlows intraStripeFlows) {
        this.intraStripeFlows = intraStripeFlows;
        return this;
      }

      /**
       * Includes Features related to initiating money movement out of the FinancialAccount to
       * someone else's bucket of money.
       */
      public Builder setOutboundPayments(
          FinancialAccountCreateParams.Features.OutboundPayments outboundPayments) {
        this.outboundPayments = outboundPayments;
        return this;
      }

      /**
       * Contains a Feature and settings related to moving money out of the FinancialAccount into
       * another Account with the same owner.
       */
      public Builder setOutboundTransfers(
          FinancialAccountCreateParams.Features.OutboundTransfers outboundTransfers) {
        this.outboundTransfers = outboundTransfers;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuing {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      private CardIssuing(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.CardIssuing build() {
          return new FinancialAccountCreateParams.Features.CardIssuing(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.CardIssuing#extraParams} for the
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
         * map. See {@link FinancialAccountCreateParams.Features.CardIssuing#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class DepositInsurance {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      private DepositInsurance(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.DepositInsurance build() {
          return new FinancialAccountCreateParams.Features.DepositInsurance(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.DepositInsurance#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.DepositInsurance#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAddresses {
      /** Adds an ABA FinancialAddress to the FinancialAccount. */
      @SerializedName("aba")
      Aba aba;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private FinancialAddresses(Aba aba, Map<String, Object> extraParams) {
        this.aba = aba;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Aba aba;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.FinancialAddresses build() {
          return new FinancialAccountCreateParams.Features.FinancialAddresses(
              this.aba, this.extraParams);
        }

        /** Adds an ABA FinancialAddress to the FinancialAccount. */
        public Builder setAba(FinancialAccountCreateParams.Features.FinancialAddresses.Aba aba) {
          this.aba = aba;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.FinancialAddresses#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.FinancialAddresses#extraParams} for
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
      public static class Aba {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private Aba(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.FinancialAddresses.Aba build() {
            return new FinancialAccountCreateParams.Features.FinancialAddresses.Aba(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * FinancialAccountCreateParams.Features.FinancialAddresses.Aba#extraParams} for the field
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
           * FinancialAccountCreateParams.Features.FinancialAddresses.Aba#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InboundTransfers {
      /** Enables ACH Debits via the InboundTransfers API. */
      @SerializedName("ach")
      Ach ach;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InboundTransfers(Ach ach, Map<String, Object> extraParams) {
        this.ach = ach;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Ach ach;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.InboundTransfers build() {
          return new FinancialAccountCreateParams.Features.InboundTransfers(
              this.ach, this.extraParams);
        }

        /** Enables ACH Debits via the InboundTransfers API. */
        public Builder setAch(FinancialAccountCreateParams.Features.InboundTransfers.Ach ach) {
          this.ach = ach;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.InboundTransfers#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.InboundTransfers#extraParams} for
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
      public static class Ach {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private Ach(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.InboundTransfers.Ach build() {
            return new FinancialAccountCreateParams.Features.InboundTransfers.Ach(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link FinancialAccountCreateParams.Features.InboundTransfers.Ach#extraParams}
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
           * map. See {@link FinancialAccountCreateParams.Features.InboundTransfers.Ach#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IntraStripeFlows {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      private IntraStripeFlows(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.IntraStripeFlows build() {
          return new FinancialAccountCreateParams.Features.IntraStripeFlows(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.IntraStripeFlows#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.IntraStripeFlows#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OutboundPayments {
      /** Enables ACH transfers via the OutboundPayments API. */
      @SerializedName("ach")
      Ach ach;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Enables US domestic wire transfers via the OutboundPayments API. */
      @SerializedName("us_domestic_wire")
      UsDomesticWire usDomesticWire;

      private OutboundPayments(
          Ach ach, Map<String, Object> extraParams, UsDomesticWire usDomesticWire) {
        this.ach = ach;
        this.extraParams = extraParams;
        this.usDomesticWire = usDomesticWire;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Ach ach;

        private Map<String, Object> extraParams;

        private UsDomesticWire usDomesticWire;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.OutboundPayments build() {
          return new FinancialAccountCreateParams.Features.OutboundPayments(
              this.ach, this.extraParams, this.usDomesticWire);
        }

        /** Enables ACH transfers via the OutboundPayments API. */
        public Builder setAch(FinancialAccountCreateParams.Features.OutboundPayments.Ach ach) {
          this.ach = ach;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.OutboundPayments#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.OutboundPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Enables US domestic wire transfers via the OutboundPayments API. */
        public Builder setUsDomesticWire(
            FinancialAccountCreateParams.Features.OutboundPayments.UsDomesticWire usDomesticWire) {
          this.usDomesticWire = usDomesticWire;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Ach {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private Ach(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.OutboundPayments.Ach build() {
            return new FinancialAccountCreateParams.Features.OutboundPayments.Ach(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link FinancialAccountCreateParams.Features.OutboundPayments.Ach#extraParams}
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
           * map. See {@link FinancialAccountCreateParams.Features.OutboundPayments.Ach#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class UsDomesticWire {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private UsDomesticWire(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.OutboundPayments.UsDomesticWire build() {
            return new FinancialAccountCreateParams.Features.OutboundPayments.UsDomesticWire(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * FinancialAccountCreateParams.Features.OutboundPayments.UsDomesticWire#extraParams} for
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
           * FinancialAccountCreateParams.Features.OutboundPayments.UsDomesticWire#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OutboundTransfers {
      /** Enables ACH transfers via the OutboundTransfers API. */
      @SerializedName("ach")
      Ach ach;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Enables US domestic wire transfers via the OutboundTransfers API. */
      @SerializedName("us_domestic_wire")
      UsDomesticWire usDomesticWire;

      private OutboundTransfers(
          Ach ach, Map<String, Object> extraParams, UsDomesticWire usDomesticWire) {
        this.ach = ach;
        this.extraParams = extraParams;
        this.usDomesticWire = usDomesticWire;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Ach ach;

        private Map<String, Object> extraParams;

        private UsDomesticWire usDomesticWire;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountCreateParams.Features.OutboundTransfers build() {
          return new FinancialAccountCreateParams.Features.OutboundTransfers(
              this.ach, this.extraParams, this.usDomesticWire);
        }

        /** Enables ACH transfers via the OutboundTransfers API. */
        public Builder setAch(FinancialAccountCreateParams.Features.OutboundTransfers.Ach ach) {
          this.ach = ach;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountCreateParams.Features.OutboundTransfers#extraParams} for
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
         * map. See {@link FinancialAccountCreateParams.Features.OutboundTransfers#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Enables US domestic wire transfers via the OutboundTransfers API. */
        public Builder setUsDomesticWire(
            FinancialAccountCreateParams.Features.OutboundTransfers.UsDomesticWire usDomesticWire) {
          this.usDomesticWire = usDomesticWire;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Ach {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private Ach(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.OutboundTransfers.Ach build() {
            return new FinancialAccountCreateParams.Features.OutboundTransfers.Ach(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * FinancialAccountCreateParams.Features.OutboundTransfers.Ach#extraParams} for the field
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
           * FinancialAccountCreateParams.Features.OutboundTransfers.Ach#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class UsDomesticWire {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
        @SerializedName("requested")
        Boolean requested;

        private UsDomesticWire(Map<String, Object> extraParams, Boolean requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean requested;

          /** Finalize and obtain parameter instance from this builder. */
          public FinancialAccountCreateParams.Features.OutboundTransfers.UsDomesticWire build() {
            return new FinancialAccountCreateParams.Features.OutboundTransfers.UsDomesticWire(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * FinancialAccountCreateParams.Features.OutboundTransfers.UsDomesticWire#extraParams} for
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
           * FinancialAccountCreateParams.Features.OutboundTransfers.UsDomesticWire#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Whether the FinancialAccount should have the Feature. */
          public Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PlatformRestrictions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Restricts all inbound money movement. */
    @SerializedName("inbound_flows")
    InboundFlows inboundFlows;

    /** Restricts all outbound money movement. */
    @SerializedName("outbound_flows")
    OutboundFlows outboundFlows;

    private PlatformRestrictions(
        Map<String, Object> extraParams, InboundFlows inboundFlows, OutboundFlows outboundFlows) {
      this.extraParams = extraParams;
      this.inboundFlows = inboundFlows;
      this.outboundFlows = outboundFlows;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private InboundFlows inboundFlows;

      private OutboundFlows outboundFlows;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountCreateParams.PlatformRestrictions build() {
        return new FinancialAccountCreateParams.PlatformRestrictions(
            this.extraParams, this.inboundFlows, this.outboundFlows);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountCreateParams.PlatformRestrictions#extraParams} for the field documentation.
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
       * See {@link FinancialAccountCreateParams.PlatformRestrictions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Restricts all inbound money movement. */
      public Builder setInboundFlows(
          FinancialAccountCreateParams.PlatformRestrictions.InboundFlows inboundFlows) {
        this.inboundFlows = inboundFlows;
        return this;
      }

      /** Restricts all outbound money movement. */
      public Builder setOutboundFlows(
          FinancialAccountCreateParams.PlatformRestrictions.OutboundFlows outboundFlows) {
        this.outboundFlows = outboundFlows;
        return this;
      }
    }

    public enum InboundFlows implements ApiRequestParams.EnumParam {
      @SerializedName("restricted")
      RESTRICTED("restricted"),

      @SerializedName("unrestricted")
      UNRESTRICTED("unrestricted");

      @Getter(onMethod_ = {@Override})
      private final String value;

      InboundFlows(String value) {
        this.value = value;
      }
    }

    public enum OutboundFlows implements ApiRequestParams.EnumParam {
      @SerializedName("restricted")
      RESTRICTED("restricted"),

      @SerializedName("unrestricted")
      UNRESTRICTED("unrestricted");

      @Getter(onMethod_ = {@Override})
      private final String value;

      OutboundFlows(String value) {
        this.value = value;
      }
    }
  }
}
