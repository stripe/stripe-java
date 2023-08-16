// File generated from our OpenAPI spec
package com.stripe.param.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class FinancialAccountFeaturesCreateParams extends ApiRequestParams {
  /**
   * Encodes the FinancialAccount's ability to be used with the Issuing product, including attaching
   * cards to and drawing funds from the FinancialAccount.
   */
  @SerializedName("card_issuing")
  CardIssuing cardIssuing;

  /**
   * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors
   * determine the insurance amount.
   */
  @SerializedName("deposit_insurance")
  DepositInsurance depositInsurance;

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

  private FinancialAccountFeaturesCreateParams(
      CardIssuing cardIssuing,
      DepositInsurance depositInsurance,
      List<String> expand,
      Map<String, Object> extraParams,
      FinancialAddresses financialAddresses,
      InboundTransfers inboundTransfers,
      IntraStripeFlows intraStripeFlows,
      OutboundPayments outboundPayments,
      OutboundTransfers outboundTransfers) {
    this.cardIssuing = cardIssuing;
    this.depositInsurance = depositInsurance;
    this.expand = expand;
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

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FinancialAddresses financialAddresses;

    private InboundTransfers inboundTransfers;

    private IntraStripeFlows intraStripeFlows;

    private OutboundPayments outboundPayments;

    private OutboundTransfers outboundTransfers;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountFeaturesCreateParams build() {
      return new FinancialAccountFeaturesCreateParams(
          this.cardIssuing,
          this.depositInsurance,
          this.expand,
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
    public Builder setCardIssuing(FinancialAccountFeaturesCreateParams.CardIssuing cardIssuing) {
      this.cardIssuing = cardIssuing;
      return this;
    }

    /**
     * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors
     * determine the insurance amount.
     */
    public Builder setDepositInsurance(
        FinancialAccountFeaturesCreateParams.DepositInsurance depositInsurance) {
      this.depositInsurance = depositInsurance;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountFeaturesCreateParams#expand} for the field documentation.
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
     * FinancialAccountFeaturesCreateParams#expand} for the field documentation.
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
     * FinancialAccountFeaturesCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountFeaturesCreateParams#extraParams} for the field documentation.
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
        FinancialAccountFeaturesCreateParams.FinancialAddresses financialAddresses) {
      this.financialAddresses = financialAddresses;
      return this;
    }

    /**
     * Contains settings related to adding funds to a FinancialAccount from another Account with the
     * same owner.
     */
    public Builder setInboundTransfers(
        FinancialAccountFeaturesCreateParams.InboundTransfers inboundTransfers) {
      this.inboundTransfers = inboundTransfers;
      return this;
    }

    /**
     * Represents the ability for the FinancialAccount to send money to, or receive money from other
     * FinancialAccounts (for example, via OutboundPayment).
     */
    public Builder setIntraStripeFlows(
        FinancialAccountFeaturesCreateParams.IntraStripeFlows intraStripeFlows) {
      this.intraStripeFlows = intraStripeFlows;
      return this;
    }

    /**
     * Includes Features related to initiating money movement out of the FinancialAccount to someone
     * else's bucket of money.
     */
    public Builder setOutboundPayments(
        FinancialAccountFeaturesCreateParams.OutboundPayments outboundPayments) {
      this.outboundPayments = outboundPayments;
      return this;
    }

    /**
     * Contains a Feature and settings related to moving money out of the FinancialAccount into
     * another Account with the same owner.
     */
    public Builder setOutboundTransfers(
        FinancialAccountFeaturesCreateParams.OutboundTransfers outboundTransfers) {
      this.outboundTransfers = outboundTransfers;
      return this;
    }
  }

  @Getter
  public static class CardIssuing {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public FinancialAccountFeaturesCreateParams.CardIssuing build() {
        return new FinancialAccountFeaturesCreateParams.CardIssuing(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.CardIssuing#extraParams} for the field documentation.
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
       * See {@link FinancialAccountFeaturesCreateParams.CardIssuing#extraParams} for the field
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
  public static class DepositInsurance {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public FinancialAccountFeaturesCreateParams.DepositInsurance build() {
        return new FinancialAccountFeaturesCreateParams.DepositInsurance(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.DepositInsurance#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.DepositInsurance#extraParams} for the field
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
  public static class FinancialAddresses {
    /** Adds an ABA FinancialAddress to the FinancialAccount. */
    @SerializedName("aba")
    Aba aba;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public FinancialAccountFeaturesCreateParams.FinancialAddresses build() {
        return new FinancialAccountFeaturesCreateParams.FinancialAddresses(
            this.aba, this.extraParams);
      }

      /** Adds an ABA FinancialAddress to the FinancialAccount. */
      public Builder setAba(FinancialAccountFeaturesCreateParams.FinancialAddresses.Aba aba) {
        this.aba = aba;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.FinancialAddresses#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.FinancialAddresses#extraParams} for the
       * field documentation.
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
    public static class Aba {
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
        public FinancialAccountFeaturesCreateParams.FinancialAddresses.Aba build() {
          return new FinancialAccountFeaturesCreateParams.FinancialAddresses.Aba(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesCreateParams.FinancialAddresses.Aba#extraParams}
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
         * map. See {@link FinancialAccountFeaturesCreateParams.FinancialAddresses.Aba#extraParams}
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
  public static class InboundTransfers {
    /** Enables ACH Debits via the InboundTransfers API. */
    @SerializedName("ach")
    Ach ach;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public FinancialAccountFeaturesCreateParams.InboundTransfers build() {
        return new FinancialAccountFeaturesCreateParams.InboundTransfers(
            this.ach, this.extraParams);
      }

      /** Enables ACH Debits via the InboundTransfers API. */
      public Builder setAch(FinancialAccountFeaturesCreateParams.InboundTransfers.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.InboundTransfers#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.InboundTransfers#extraParams} for the field
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
    public static class Ach {
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
        public FinancialAccountFeaturesCreateParams.InboundTransfers.Ach build() {
          return new FinancialAccountFeaturesCreateParams.InboundTransfers.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesCreateParams.InboundTransfers.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesCreateParams.InboundTransfers.Ach#extraParams}
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
  public static class IntraStripeFlows {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public FinancialAccountFeaturesCreateParams.IntraStripeFlows build() {
        return new FinancialAccountFeaturesCreateParams.IntraStripeFlows(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.IntraStripeFlows#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.IntraStripeFlows#extraParams} for the field
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
  public static class OutboundPayments {
    /** Enables ACH transfers via the OutboundPayments API. */
    @SerializedName("ach")
    Ach ach;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Enables US domestic wire tranfers via the OutboundPayments API. */
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
      public FinancialAccountFeaturesCreateParams.OutboundPayments build() {
        return new FinancialAccountFeaturesCreateParams.OutboundPayments(
            this.ach, this.extraParams, this.usDomesticWire);
      }

      /** Enables ACH transfers via the OutboundPayments API. */
      public Builder setAch(FinancialAccountFeaturesCreateParams.OutboundPayments.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.OutboundPayments#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.OutboundPayments#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Enables US domestic wire tranfers via the OutboundPayments API. */
      public Builder setUsDomesticWire(
          FinancialAccountFeaturesCreateParams.OutboundPayments.UsDomesticWire usDomesticWire) {
        this.usDomesticWire = usDomesticWire;
        return this;
      }
    }

    @Getter
    public static class Ach {
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
        public FinancialAccountFeaturesCreateParams.OutboundPayments.Ach build() {
          return new FinancialAccountFeaturesCreateParams.OutboundPayments.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesCreateParams.OutboundPayments.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesCreateParams.OutboundPayments.Ach#extraParams}
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
    public static class UsDomesticWire {
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
        public FinancialAccountFeaturesCreateParams.OutboundPayments.UsDomesticWire build() {
          return new FinancialAccountFeaturesCreateParams.OutboundPayments.UsDomesticWire(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FinancialAccountFeaturesCreateParams.OutboundPayments.UsDomesticWire#extraParams} for the
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
         * FinancialAccountFeaturesCreateParams.OutboundPayments.UsDomesticWire#extraParams} for the
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
  }

  @Getter
  public static class OutboundTransfers {
    /** Enables ACH transfers via the OutboundTransfers API. */
    @SerializedName("ach")
    Ach ach;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Enables US domestic wire tranfers via the OutboundTransfers API. */
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
      public FinancialAccountFeaturesCreateParams.OutboundTransfers build() {
        return new FinancialAccountFeaturesCreateParams.OutboundTransfers(
            this.ach, this.extraParams, this.usDomesticWire);
      }

      /** Enables ACH transfers via the OutboundTransfers API. */
      public Builder setAch(FinancialAccountFeaturesCreateParams.OutboundTransfers.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesCreateParams.OutboundTransfers#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesCreateParams.OutboundTransfers#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Enables US domestic wire tranfers via the OutboundTransfers API. */
      public Builder setUsDomesticWire(
          FinancialAccountFeaturesCreateParams.OutboundTransfers.UsDomesticWire usDomesticWire) {
        this.usDomesticWire = usDomesticWire;
        return this;
      }
    }

    @Getter
    public static class Ach {
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
        public FinancialAccountFeaturesCreateParams.OutboundTransfers.Ach build() {
          return new FinancialAccountFeaturesCreateParams.OutboundTransfers.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesCreateParams.OutboundTransfers.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesCreateParams.OutboundTransfers.Ach#extraParams}
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
    public static class UsDomesticWire {
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
        public FinancialAccountFeaturesCreateParams.OutboundTransfers.UsDomesticWire build() {
          return new FinancialAccountFeaturesCreateParams.OutboundTransfers.UsDomesticWire(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FinancialAccountFeaturesCreateParams.OutboundTransfers.UsDomesticWire#extraParams} for
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
         * FinancialAccountFeaturesCreateParams.OutboundTransfers.UsDomesticWire#extraParams} for
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
