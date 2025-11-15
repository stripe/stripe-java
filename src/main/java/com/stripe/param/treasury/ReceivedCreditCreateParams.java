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
public class ReceivedCreditCreateParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The FinancialAccount to send funds to. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Initiating payment method details for the object. */
  @SerializedName("initiating_payment_method_details")
  InitiatingPaymentMethodDetails initiatingPaymentMethodDetails;

  /**
   * <strong>Required.</strong> Specifies the network rails to be used. If not set, will default to
   * the PaymentMethod's preferred network. See the <a
   * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more about
   * money movement timelines for each network type.
   */
  @SerializedName("network")
  Network network;

  /** Details about the network used for the ReceivedCredit. */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  private ReceivedCreditCreateParams(
      Long amount,
      String currency,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      InitiatingPaymentMethodDetails initiatingPaymentMethodDetails,
      Network network,
      NetworkDetails networkDetails) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.initiatingPaymentMethodDetails = initiatingPaymentMethodDetails;
    this.network = network;
    this.networkDetails = networkDetails;
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

    private NetworkDetails networkDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public ReceivedCreditCreateParams build() {
      return new ReceivedCreditCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.initiatingPaymentMethodDetails,
          this.network,
          this.networkDetails);
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

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReceivedCreditCreateParams#expand} for the field documentation.
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
     * ReceivedCreditCreateParams#expand} for the field documentation.
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
     * ReceivedCreditCreateParams#extraParams} for the field documentation.
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
     * See {@link ReceivedCreditCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount to send funds to. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** Initiating payment method details for the object. */
    public Builder setInitiatingPaymentMethodDetails(
        ReceivedCreditCreateParams.InitiatingPaymentMethodDetails initiatingPaymentMethodDetails) {
      this.initiatingPaymentMethodDetails = initiatingPaymentMethodDetails;
      return this;
    }

    /**
     * <strong>Required.</strong> Specifies the network rails to be used. If not set, will default
     * to the PaymentMethod's preferred network. See the <a
     * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more about
     * money movement timelines for each network type.
     */
    public Builder setNetwork(ReceivedCreditCreateParams.Network network) {
      this.network = network;
      return this;
    }

    /** Details about the network used for the ReceivedCredit. */
    public Builder setNetworkDetails(ReceivedCreditCreateParams.NetworkDetails networkDetails) {
      this.networkDetails = networkDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class InitiatingPaymentMethodDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The source type. */
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
      public ReceivedCreditCreateParams.InitiatingPaymentMethodDetails build() {
        return new ReceivedCreditCreateParams.InitiatingPaymentMethodDetails(
            this.extraParams, this.type, this.usBankAccount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReceivedCreditCreateParams.InitiatingPaymentMethodDetails#extraParams} for the field
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
       * See {@link ReceivedCreditCreateParams.InitiatingPaymentMethodDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The source type. */
      public Builder setType(ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(
          ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.UsBankAccount build() {
          return new ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.UsBankAccount(
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
         * ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.UsBankAccount#extraParams} for
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
         * ReceivedCreditCreateParams.InitiatingPaymentMethodDetails.UsBankAccount#extraParams} for
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails {
    /** Optional fields for {@code ach}. */
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

    /** <strong>Required.</strong> The type of flow that originated the ReceivedCredit. */
    @SerializedName("type")
    Type type;

    private NetworkDetails(Ach ach, Map<String, Object> extraParams, Type type) {
      this.ach = ach;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Ach ach;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ReceivedCreditCreateParams.NetworkDetails build() {
        return new ReceivedCreditCreateParams.NetworkDetails(this.ach, this.extraParams, this.type);
      }

      /** Optional fields for {@code ach}. */
      public Builder setAch(ReceivedCreditCreateParams.NetworkDetails.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReceivedCreditCreateParams.NetworkDetails#extraParams} for the field documentation.
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
       * See {@link ReceivedCreditCreateParams.NetworkDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The type of flow that originated the ReceivedCredit. */
      public Builder setType(ReceivedCreditCreateParams.NetworkDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach {
      /** ACH Addenda record. */
      @SerializedName("addenda")
      String addenda;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ach(String addenda, Map<String, Object> extraParams) {
        this.addenda = addenda;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String addenda;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ReceivedCreditCreateParams.NetworkDetails.Ach build() {
          return new ReceivedCreditCreateParams.NetworkDetails.Ach(this.addenda, this.extraParams);
        }

        /** ACH Addenda record. */
        public Builder setAddenda(String addenda) {
          this.addenda = addenda;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReceivedCreditCreateParams.NetworkDetails.Ach#extraParams} for the field
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
         * map. See {@link ReceivedCreditCreateParams.NetworkDetails.Ach#extraParams} for the field
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
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("ach")
      ACH("ach");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
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
