// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OutboundSetupIntentCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * If provided, the existing payout method resource to link to this setup intent. Any
   * payout_method_data provided is used to update information on this linked payout method
   * resource.
   */
  @SerializedName("payout_method")
  String payoutMethod;

  /**
   * If no payout_method provided, used to create the underlying credential that is set up for
   * outbound money movement. If a payout_method provided, used to update data on the credential
   * linked to this setup intent.
   */
  @SerializedName("payout_method_data")
  PayoutMethodData payoutMethodData;

  /**
   * Specify which type of outbound money movement this credential should be set up for (payment |
   * transfer). If not provided, defaults to payment.
   */
  @SerializedName("usage_intent")
  UsageIntent usageIntent;

  private OutboundSetupIntentCreateParams(
      Map<String, Object> extraParams,
      String payoutMethod,
      PayoutMethodData payoutMethodData,
      UsageIntent usageIntent) {
    this.extraParams = extraParams;
    this.payoutMethod = payoutMethod;
    this.payoutMethodData = payoutMethodData;
    this.usageIntent = usageIntent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String payoutMethod;

    private PayoutMethodData payoutMethodData;

    private UsageIntent usageIntent;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundSetupIntentCreateParams build() {
      return new OutboundSetupIntentCreateParams(
          this.extraParams, this.payoutMethod, this.payoutMethodData, this.usageIntent);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundSetupIntentCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundSetupIntentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If provided, the existing payout method resource to link to this setup intent. Any
     * payout_method_data provided is used to update information on this linked payout method
     * resource.
     */
    public Builder setPayoutMethod(String payoutMethod) {
      this.payoutMethod = payoutMethod;
      return this;
    }

    /**
     * If no payout_method provided, used to create the underlying credential that is set up for
     * outbound money movement. If a payout_method provided, used to update data on the credential
     * linked to this setup intent.
     */
    public Builder setPayoutMethodData(
        OutboundSetupIntentCreateParams.PayoutMethodData payoutMethodData) {
      this.payoutMethodData = payoutMethodData;
      return this;
    }

    /**
     * Specify which type of outbound money movement this credential should be set up for (payment |
     * transfer). If not provided, defaults to payment.
     */
    public Builder setUsageIntent(OutboundSetupIntentCreateParams.UsageIntent usageIntent) {
      this.usageIntent = usageIntent;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PayoutMethodData {
    /** The type specific details of the bank account payout method. */
    @SerializedName("bank_account")
    BankAccount bankAccount;

    /** The type specific details of the card payout method. */
    @SerializedName("card")
    Card card;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Closed Enum. The type of payout method to be created. */
    @SerializedName("type")
    Type type;

    private PayoutMethodData(
        BankAccount bankAccount, Card card, Map<String, Object> extraParams, Type type) {
      this.bankAccount = bankAccount;
      this.card = card;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccount bankAccount;

      private Card card;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundSetupIntentCreateParams.PayoutMethodData build() {
        return new OutboundSetupIntentCreateParams.PayoutMethodData(
            this.bankAccount, this.card, this.extraParams, this.type);
      }

      /** The type specific details of the bank account payout method. */
      public Builder setBankAccount(
          OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
      }

      /** The type specific details of the card payout method. */
      public Builder setCard(OutboundSetupIntentCreateParams.PayoutMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundSetupIntentCreateParams.PayoutMethodData#extraParams} for the field documentation.
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
       * See {@link OutboundSetupIntentCreateParams.PayoutMethodData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Closed Enum. The type of payout method to be created. */
      public Builder setType(OutboundSetupIntentCreateParams.PayoutMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BankAccount {
      /** <strong>Required.</strong> The account number or IBAN of the bank account. */
      @SerializedName("account_number")
      String accountNumber;

      /** Closed Enum. The type of the bank account (checking or savings). */
      @SerializedName("bank_account_type")
      BankAccountType bankAccountType;

      /** The branch number of the bank account, if present. */
      @SerializedName("branch_number")
      String branchNumber;

      /** <strong>Required.</strong> The country code of the bank account. */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The routing number of the bank account, if present. */
      @SerializedName("routing_number")
      String routingNumber;

      /** The swift code of the bank account, if present. */
      @SerializedName("swift_code")
      String swiftCode;

      private BankAccount(
          String accountNumber,
          BankAccountType bankAccountType,
          String branchNumber,
          String country,
          Map<String, Object> extraParams,
          String routingNumber,
          String swiftCode) {
        this.accountNumber = accountNumber;
        this.bankAccountType = bankAccountType;
        this.branchNumber = branchNumber;
        this.country = country;
        this.extraParams = extraParams;
        this.routingNumber = routingNumber;
        this.swiftCode = swiftCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountNumber;

        private BankAccountType bankAccountType;

        private String branchNumber;

        private String country;

        private Map<String, Object> extraParams;

        private String routingNumber;

        private String swiftCode;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount build() {
          return new OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount(
              this.accountNumber,
              this.bankAccountType,
              this.branchNumber,
              this.country,
              this.extraParams,
              this.routingNumber,
              this.swiftCode);
        }

        /** <strong>Required.</strong> The account number or IBAN of the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Closed Enum. The type of the bank account (checking or savings). */
        public Builder setBankAccountType(
            OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount.BankAccountType
                bankAccountType) {
          this.bankAccountType = bankAccountType;
          return this;
        }

        /** The branch number of the bank account, if present. */
        public Builder setBranchNumber(String branchNumber) {
          this.branchNumber = branchNumber;
          return this;
        }

        /** <strong>Required.</strong> The country code of the bank account. */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount#extraParams}
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
         * map. See {@link OutboundSetupIntentCreateParams.PayoutMethodData.BankAccount#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The routing number of the bank account, if present. */
        public Builder setRoutingNumber(String routingNumber) {
          this.routingNumber = routingNumber;
          return this;
        }

        /** The swift code of the bank account, if present. */
        public Builder setSwiftCode(String swiftCode) {
          this.swiftCode = swiftCode;
          return this;
        }
      }

      public enum BankAccountType implements ApiRequestParams.EnumParam {
        @SerializedName("checking")
        CHECKING("checking"),

        @SerializedName("savings")
        SAVINGS("savings");

        @Getter(onMethod_ = {@Override})
        private final String value;

        BankAccountType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /** <strong>Required.</strong> The expiration month of the card. */
      @SerializedName("exp_month")
      String expMonth;

      /** <strong>Required.</strong> The expiration year of the card. */
      @SerializedName("exp_year")
      String expYear;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The card number. */
      @SerializedName("number")
      String number;

      private Card(
          String expMonth, String expYear, Map<String, Object> extraParams, String number) {
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.extraParams = extraParams;
        this.number = number;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String expMonth;

        private String expYear;

        private Map<String, Object> extraParams;

        private String number;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundSetupIntentCreateParams.PayoutMethodData.Card build() {
          return new OutboundSetupIntentCreateParams.PayoutMethodData.Card(
              this.expMonth, this.expYear, this.extraParams, this.number);
        }

        /** <strong>Required.</strong> The expiration month of the card. */
        public Builder setExpMonth(String expMonth) {
          this.expMonth = expMonth;
          return this;
        }

        /** <strong>Required.</strong> The expiration year of the card. */
        public Builder setExpYear(String expYear) {
          this.expYear = expYear;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundSetupIntentCreateParams.PayoutMethodData.Card#extraParams} for
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
         * map. See {@link OutboundSetupIntentCreateParams.PayoutMethodData.Card#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The card number. */
        public Builder setNumber(String number) {
          this.number = number;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("bank_account")
      BANK_ACCOUNT("bank_account"),

      @SerializedName("card")
      CARD("card"),

      @SerializedName("crypto_wallet")
      CRYPTO_WALLET("crypto_wallet");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum UsageIntent implements ApiRequestParams.EnumParam {
    @SerializedName("payment")
    PAYMENT("payment"),

    @SerializedName("transfer")
    TRANSFER("transfer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    UsageIntent(String value) {
      this.value = value;
    }
  }
}
