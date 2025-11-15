// File generated from our OpenAPI spec
package com.stripe.param.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountFeaturesUpdateParams extends ApiRequestParams {
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

  private FinancialAccountFeaturesUpdateParams(
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
    public FinancialAccountFeaturesUpdateParams build() {
      return new FinancialAccountFeaturesUpdateParams(
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
    public Builder setCardIssuing(FinancialAccountFeaturesUpdateParams.CardIssuing cardIssuing) {
      this.cardIssuing = cardIssuing;
      return this;
    }

    /**
     * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors
     * determine the insurance amount.
     */
    public Builder setDepositInsurance(
        FinancialAccountFeaturesUpdateParams.DepositInsurance depositInsurance) {
      this.depositInsurance = depositInsurance;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountFeaturesUpdateParams#expand} for the field documentation.
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
     * FinancialAccountFeaturesUpdateParams#expand} for the field documentation.
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
     * FinancialAccountFeaturesUpdateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountFeaturesUpdateParams#extraParams} for the field documentation.
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
        FinancialAccountFeaturesUpdateParams.FinancialAddresses financialAddresses) {
      this.financialAddresses = financialAddresses;
      return this;
    }

    /**
     * Contains settings related to adding funds to a FinancialAccount from another Account with the
     * same owner.
     */
    public Builder setInboundTransfers(
        FinancialAccountFeaturesUpdateParams.InboundTransfers inboundTransfers) {
      this.inboundTransfers = inboundTransfers;
      return this;
    }

    /**
     * Represents the ability for the FinancialAccount to send money to, or receive money from other
     * FinancialAccounts (for example, via OutboundPayment).
     */
    public Builder setIntraStripeFlows(
        FinancialAccountFeaturesUpdateParams.IntraStripeFlows intraStripeFlows) {
      this.intraStripeFlows = intraStripeFlows;
      return this;
    }

    /**
     * Includes Features related to initiating money movement out of the FinancialAccount to someone
     * else's bucket of money.
     */
    public Builder setOutboundPayments(
        FinancialAccountFeaturesUpdateParams.OutboundPayments outboundPayments) {
      this.outboundPayments = outboundPayments;
      return this;
    }

    /**
     * Contains a Feature and settings related to moving money out of the FinancialAccount into
     * another Account with the same owner.
     */
    public Builder setOutboundTransfers(
        FinancialAccountFeaturesUpdateParams.OutboundTransfers outboundTransfers) {
      this.outboundTransfers = outboundTransfers;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
      public FinancialAccountFeaturesUpdateParams.CardIssuing build() {
        return new FinancialAccountFeaturesUpdateParams.CardIssuing(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.CardIssuing#extraParams} for the field documentation.
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
       * See {@link FinancialAccountFeaturesUpdateParams.CardIssuing#extraParams} for the field
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
      public FinancialAccountFeaturesUpdateParams.DepositInsurance build() {
        return new FinancialAccountFeaturesUpdateParams.DepositInsurance(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.DepositInsurance#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.DepositInsurance#extraParams} for the field
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
      public FinancialAccountFeaturesUpdateParams.FinancialAddresses build() {
        return new FinancialAccountFeaturesUpdateParams.FinancialAddresses(
            this.aba, this.extraParams);
      }

      /** Adds an ABA FinancialAddress to the FinancialAccount. */
      public Builder setAba(FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba aba) {
        this.aba = aba;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.FinancialAddresses#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.FinancialAddresses#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Aba {
      /** Requested bank partner. */
      @SerializedName("bank")
      Bank bank;

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

      private Aba(Bank bank, Map<String, Object> extraParams, Boolean requested) {
        this.bank = bank;
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Bank bank;

        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba build() {
          return new FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba(
              this.bank, this.extraParams, this.requested);
        }

        /** Requested bank partner. */
        public Builder setBank(
            FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba#extraParams}
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
         * map. See {@link FinancialAccountFeaturesUpdateParams.FinancialAddresses.Aba#extraParams}
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

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("evolve")
        EVOLVE("evolve"),

        @SerializedName("fifth_third")
        FIFTH_THIRD("fifth_third"),

        @SerializedName("goldman_sachs")
        GOLDMAN_SACHS("goldman_sachs");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
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
      public FinancialAccountFeaturesUpdateParams.InboundTransfers build() {
        return new FinancialAccountFeaturesUpdateParams.InboundTransfers(
            this.ach, this.extraParams);
      }

      /** Enables ACH Debits via the InboundTransfers API. */
      public Builder setAch(FinancialAccountFeaturesUpdateParams.InboundTransfers.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.InboundTransfers#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.InboundTransfers#extraParams} for the field
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
        public FinancialAccountFeaturesUpdateParams.InboundTransfers.Ach build() {
          return new FinancialAccountFeaturesUpdateParams.InboundTransfers.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesUpdateParams.InboundTransfers.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesUpdateParams.InboundTransfers.Ach#extraParams}
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
      public FinancialAccountFeaturesUpdateParams.IntraStripeFlows build() {
        return new FinancialAccountFeaturesUpdateParams.IntraStripeFlows(
            this.extraParams, this.requested);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.IntraStripeFlows#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.IntraStripeFlows#extraParams} for the field
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
      public FinancialAccountFeaturesUpdateParams.OutboundPayments build() {
        return new FinancialAccountFeaturesUpdateParams.OutboundPayments(
            this.ach, this.extraParams, this.usDomesticWire);
      }

      /** Enables ACH transfers via the OutboundPayments API. */
      public Builder setAch(FinancialAccountFeaturesUpdateParams.OutboundPayments.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.OutboundPayments#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.OutboundPayments#extraParams} for the field
       * documentation.
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
          FinancialAccountFeaturesUpdateParams.OutboundPayments.UsDomesticWire usDomesticWire) {
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
        public FinancialAccountFeaturesUpdateParams.OutboundPayments.Ach build() {
          return new FinancialAccountFeaturesUpdateParams.OutboundPayments.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesUpdateParams.OutboundPayments.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesUpdateParams.OutboundPayments.Ach#extraParams}
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
        public FinancialAccountFeaturesUpdateParams.OutboundPayments.UsDomesticWire build() {
          return new FinancialAccountFeaturesUpdateParams.OutboundPayments.UsDomesticWire(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FinancialAccountFeaturesUpdateParams.OutboundPayments.UsDomesticWire#extraParams} for the
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
         * FinancialAccountFeaturesUpdateParams.OutboundPayments.UsDomesticWire#extraParams} for the
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
  @EqualsAndHashCode(callSuper = false)
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
      public FinancialAccountFeaturesUpdateParams.OutboundTransfers build() {
        return new FinancialAccountFeaturesUpdateParams.OutboundTransfers(
            this.ach, this.extraParams, this.usDomesticWire);
      }

      /** Enables ACH transfers via the OutboundTransfers API. */
      public Builder setAch(FinancialAccountFeaturesUpdateParams.OutboundTransfers.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountFeaturesUpdateParams.OutboundTransfers#extraParams} for the field
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
       * See {@link FinancialAccountFeaturesUpdateParams.OutboundTransfers#extraParams} for the
       * field documentation.
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
          FinancialAccountFeaturesUpdateParams.OutboundTransfers.UsDomesticWire usDomesticWire) {
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
        public FinancialAccountFeaturesUpdateParams.OutboundTransfers.Ach build() {
          return new FinancialAccountFeaturesUpdateParams.OutboundTransfers.Ach(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountFeaturesUpdateParams.OutboundTransfers.Ach#extraParams}
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
         * map. See {@link FinancialAccountFeaturesUpdateParams.OutboundTransfers.Ach#extraParams}
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
        public FinancialAccountFeaturesUpdateParams.OutboundTransfers.UsDomesticWire build() {
          return new FinancialAccountFeaturesUpdateParams.OutboundTransfers.UsDomesticWire(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FinancialAccountFeaturesUpdateParams.OutboundTransfers.UsDomesticWire#extraParams} for
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
         * FinancialAccountFeaturesUpdateParams.OutboundTransfers.UsDomesticWire#extraParams} for
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
