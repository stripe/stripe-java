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
public class ReceivedDebitCreateParams extends ApiRequestParams {
  /** Amount (in cents) to be transferred. */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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

  /** The FinancialAccount to pull funds from. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Initiating payment method details for the object. */
  @SerializedName("initiating_payment_method_details")
  InitiatingPaymentMethodDetails initiatingPaymentMethodDetails;

  /** The rails used for the object. */
  @SerializedName("network")
  Network network;

  private ReceivedDebitCreateParams(
      Long amount,
      String currency,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      InitiatingPaymentMethodDetails initiatingPaymentMethodDetails,
      Network network) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.initiatingPaymentMethodDetails = initiatingPaymentMethodDetails;
    this.network = network;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private InitiatingPaymentMethodDetails initiatingPaymentMethodDetails;

    private Network network;

    /** Finalize and obtain parameter instance from this builder. */
    public ReceivedDebitCreateParams build() {
      return new ReceivedDebitCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.initiatingPaymentMethodDetails,
          this.network);
    }

    /** Amount (in cents) to be transferred. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
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

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReceivedDebitCreateParams#expand} for the field documentation.
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
     * ReceivedDebitCreateParams#expand} for the field documentation.
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
     * ReceivedDebitCreateParams#extraParams} for the field documentation.
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
     * See {@link ReceivedDebitCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The FinancialAccount to pull funds from. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** Initiating payment method details for the object. */
    public Builder setInitiatingPaymentMethodDetails(
        ReceivedDebitCreateParams.InitiatingPaymentMethodDetails initiatingPaymentMethodDetails) {
      this.initiatingPaymentMethodDetails = initiatingPaymentMethodDetails;
      return this;
    }

    /** The rails used for the object. */
    public Builder setNetwork(ReceivedDebitCreateParams.Network network) {
      this.network = network;
      return this;
    }
  }

  @Getter
  public static class InitiatingPaymentMethodDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The source type. */
    @SerializedName("type")
    Type type;

    /** Optional fields for {@code us_bank_account}. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    private InitiatingPaymentMethodDetails(
        Map<String, Object> extraParams, Type type, UsBankAccount usBankAccount) {
      this.extraParams = extraParams;
      this.type = type;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Type type;

      private UsBankAccount usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public ReceivedDebitCreateParams.InitiatingPaymentMethodDetails build() {
        return new ReceivedDebitCreateParams.InitiatingPaymentMethodDetails(
            this.extraParams, this.type, this.usBankAccount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReceivedDebitCreateParams.InitiatingPaymentMethodDetails#extraParams} for the field
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
       * See {@link ReceivedDebitCreateParams.InitiatingPaymentMethodDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The source type. */
      public Builder setType(ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(
          ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    public static class UsBankAccount {
      /** The bank account holder's name. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The bank account number. */
      @SerializedName("account_number")
      String accountNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The bank account's routing number. */
      @SerializedName("routing_number")
      String routingNumber;

      private UsBankAccount(
          String accountHolderName,
          String accountNumber,
          Map<String, Object> extraParams,
          String routingNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.extraParams = extraParams;
        this.routingNumber = routingNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountHolderName;

        private String accountNumber;

        private Map<String, Object> extraParams;

        private String routingNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.UsBankAccount build() {
          return new ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.UsBankAccount(
              this.accountHolderName, this.accountNumber, this.extraParams, this.routingNumber);
        }

        /** The bank account holder's name. */
        public Builder setAccountHolderName(String accountHolderName) {
          this.accountHolderName = accountHolderName;
          return this;
        }

        /** The bank account number. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.UsBankAccount#extraParams} for
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
         * ReceivedDebitCreateParams.InitiatingPaymentMethodDetails.UsBankAccount#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The bank account's routing number. */
        public Builder setRoutingNumber(String routingNumber) {
          this.routingNumber = routingNumber;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("us_bank_account")
      US_BANK_ACCOUNT("us_bank_account");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Network implements ApiRequestParams.EnumParam {
    @SerializedName("ach")
    ACH("ach");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Network(String value) {
      this.value = value;
    }
  }
}
