// File generated from our OpenAPI spec
package com.stripe.param.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OutboundTransferCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Amount (in cents) to be transferred. */
  @SerializedName("amount")
  Long amount;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The PaymentMethod to use as the payment instrument for the OutboundTransfer. */
  @SerializedName("destination_payment_method")
  String destinationPaymentMethod;

  /**
   * Hash used to generate the PaymentMethod to be used for this OutboundTransfer. Exclusive with
   * {@code destination_payment_method}.
   */
  @SerializedName("destination_payment_method_data")
  DestinationPaymentMethodData destinationPaymentMethodData;

  /** Hash describing payment method configuration details. */
  @SerializedName("destination_payment_method_options")
  DestinationPaymentMethodOptions destinationPaymentMethodOptions;

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

  /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Statement descriptor to be shown on the receiving end of an OutboundTransfer. Maximum 10
   * characters for {@code ach} transfers or 140 characters for {@code us_domestic_wire} transfers.
   * The default value is &quot;transfer&quot;.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private OutboundTransferCreateParams(
      Long amount,
      String currency,
      String description,
      String destinationPaymentMethod,
      DestinationPaymentMethodData destinationPaymentMethodData,
      DestinationPaymentMethodOptions destinationPaymentMethodOptions,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Map<String, String> metadata,
      String statementDescriptor) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.destinationPaymentMethod = destinationPaymentMethod;
    this.destinationPaymentMethodData = destinationPaymentMethodData;
    this.destinationPaymentMethodOptions = destinationPaymentMethodOptions;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private String destinationPaymentMethod;

    private DestinationPaymentMethodData destinationPaymentMethodData;

    private DestinationPaymentMethodOptions destinationPaymentMethodOptions;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Map<String, String> metadata;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundTransferCreateParams build() {
      return new OutboundTransferCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.destinationPaymentMethod,
          this.destinationPaymentMethodData,
          this.destinationPaymentMethodOptions,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.metadata,
          this.statementDescriptor);
    }

    /** <strong>Required.</strong> Amount (in cents) to be transferred. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** The PaymentMethod to use as the payment instrument for the OutboundTransfer. */
    public Builder setDestinationPaymentMethod(String destinationPaymentMethod) {
      this.destinationPaymentMethod = destinationPaymentMethod;
      return this;
    }

    /**
     * Hash used to generate the PaymentMethod to be used for this OutboundTransfer. Exclusive with
     * {@code destination_payment_method}.
     */
    public Builder setDestinationPaymentMethodData(
        OutboundTransferCreateParams.DestinationPaymentMethodData destinationPaymentMethodData) {
      this.destinationPaymentMethodData = destinationPaymentMethodData;
      return this;
    }

    /** Hash describing payment method configuration details. */
    public Builder setDestinationPaymentMethodOptions(
        OutboundTransferCreateParams.DestinationPaymentMethodOptions
            destinationPaymentMethodOptions) {
      this.destinationPaymentMethodOptions = destinationPaymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundTransferCreateParams#expand} for the field documentation.
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
     * OutboundTransferCreateParams#expand} for the field documentation.
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
     * OutboundTransferCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundTransferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundTransferCreateParams#metadata} for the field documentation.
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
     * See {@link OutboundTransferCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Statement descriptor to be shown on the receiving end of an OutboundTransfer. Maximum 10
     * characters for {@code ach} transfers or 140 characters for {@code us_domestic_wire}
     * transfers. The default value is &quot;transfer&quot;.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  @Getter
  public static class DestinationPaymentMethodData {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Required if type is set to {@code financial_account}. The FinancialAccount ID to send funds
     * to.
     */
    @SerializedName("financial_account")
    String financialAccount;

    /** <strong>Required.</strong> The type of the destination. */
    @SerializedName("type")
    Type type;

    private DestinationPaymentMethodData(
        Map<String, Object> extraParams, String financialAccount, Type type) {
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String financialAccount;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferCreateParams.DestinationPaymentMethodData build() {
        return new OutboundTransferCreateParams.DestinationPaymentMethodData(
            this.extraParams, this.financialAccount, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferCreateParams.DestinationPaymentMethodData#extraParams} for the field
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
       * See {@link OutboundTransferCreateParams.DestinationPaymentMethodData#extraParams} for the
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
       * Required if type is set to {@code financial_account}. The FinancialAccount ID to send funds
       * to.
       */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /** <strong>Required.</strong> The type of the destination. */
      public Builder setType(OutboundTransferCreateParams.DestinationPaymentMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("financial_account")
      FINANCIAL_ACCOUNT("financial_account");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class DestinationPaymentMethodOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Optional fields for {@code us_bank_account}. */
    @SerializedName("us_bank_account")
    Object usBankAccount;

    private DestinationPaymentMethodOptions(Map<String, Object> extraParams, Object usBankAccount) {
      this.extraParams = extraParams;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferCreateParams.DestinationPaymentMethodOptions build() {
        return new OutboundTransferCreateParams.DestinationPaymentMethodOptions(
            this.extraParams, this.usBankAccount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferCreateParams.DestinationPaymentMethodOptions#extraParams} for the field
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
       * See {@link OutboundTransferCreateParams.DestinationPaymentMethodOptions#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(
          OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount
              usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(EmptyParam usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    public static class UsBankAccount {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Specifies the network rails to be used. If not set, will default to the PaymentMethod's
       * preferred network. See the <a
       * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more
       * about money movement timelines for each network type.
       */
      @SerializedName("network")
      Network network;

      private UsBankAccount(Map<String, Object> extraParams, Network network) {
        this.extraParams = extraParams;
        this.network = network;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Network network;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount build() {
          return new OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount(
              this.extraParams, this.network);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount#extraParams}
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
         * map. See {@link
         * OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Specifies the network rails to be used. If not set, will default to the PaymentMethod's
         * preferred network. See the <a
         * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more
         * about money movement timelines for each network type.
         */
        public Builder setNetwork(
            OutboundTransferCreateParams.DestinationPaymentMethodOptions.UsBankAccount.Network
                network) {
          this.network = network;
          return this;
        }
      }

      public enum Network implements ApiRequestParams.EnumParam {
        @SerializedName("ach")
        ACH("ach"),

        @SerializedName("us_domestic_wire")
        US_DOMESTIC_WIRE("us_domestic_wire");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Network(String value) {
          this.value = value;
        }
      }
    }
  }
}
