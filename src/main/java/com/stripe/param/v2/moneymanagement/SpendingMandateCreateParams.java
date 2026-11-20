// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SpendingMandateCreateParams extends ApiRequestParams {
  /** Bank transfer authorization details. Required when {@code type} is {@code bank_transfer}. */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The Financial Account to authorize debits against. */
  @SerializedName("financial_account")
  String financialAccount;

  /** <strong>Required.</strong> The mandate type. */
  @SerializedName("type")
  Type type;

  private SpendingMandateCreateParams(
      BankTransfer bankTransfer,
      Map<String, Object> extraParams,
      String financialAccount,
      Type type) {
    this.bankTransfer = bankTransfer;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankTransfer bankTransfer;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public SpendingMandateCreateParams build() {
      return new SpendingMandateCreateParams(
          this.bankTransfer, this.extraParams, this.financialAccount, this.type);
    }

    /** Bank transfer authorization details. Required when {@code type} is {@code bank_transfer}. */
    public Builder setBankTransfer(SpendingMandateCreateParams.BankTransfer bankTransfer) {
      this.bankTransfer = bankTransfer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SpendingMandateCreateParams#extraParams} for the field documentation.
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
     * See {@link SpendingMandateCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The Financial Account to authorize debits against. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** <strong>Required.</strong> The mandate type. */
    public Builder setType(SpendingMandateCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer {
    /** <strong>Required.</strong> Display name for the authorized originator. */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /** ACH authorization details. Required when {@code network} is {@code ach}. */
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

    /**
     * <strong>Required.</strong> An active US Financial Address belonging to the Financial Account.
     */
    @SerializedName("financial_address")
    String financialAddress;

    /** <strong>Required.</strong> The bank transfer network. Only ACH mandates can be created. */
    @SerializedName("network")
    Network network;

    private BankTransfer(
        String accountHolderName,
        Ach ach,
        Map<String, Object> extraParams,
        String financialAddress,
        Network network) {
      this.accountHolderName = accountHolderName;
      this.ach = ach;
      this.extraParams = extraParams;
      this.financialAddress = financialAddress;
      this.network = network;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountHolderName;

      private Ach ach;

      private Map<String, Object> extraParams;

      private String financialAddress;

      private Network network;

      /** Finalize and obtain parameter instance from this builder. */
      public SpendingMandateCreateParams.BankTransfer build() {
        return new SpendingMandateCreateParams.BankTransfer(
            this.accountHolderName,
            this.ach,
            this.extraParams,
            this.financialAddress,
            this.network);
      }

      /** <strong>Required.</strong> Display name for the authorized originator. */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /** ACH authorization details. Required when {@code network} is {@code ach}. */
      public Builder setAch(SpendingMandateCreateParams.BankTransfer.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SpendingMandateCreateParams.BankTransfer#extraParams} for the field documentation.
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
       * See {@link SpendingMandateCreateParams.BankTransfer#extraParams} for the field
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
       * <strong>Required.</strong> An active US Financial Address belonging to the Financial
       * Account.
       */
      public Builder setFinancialAddress(String financialAddress) {
        this.financialAddress = financialAddress;
        return this;
      }

      /** <strong>Required.</strong> The bank transfer network. Only ACH mandates can be created. */
      public Builder setNetwork(SpendingMandateCreateParams.BankTransfer.Network network) {
        this.network = network;
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

      /**
       * <strong>Required.</strong> ACH Company ID identifying the authorized originator. Must
       * contain exactly 10 alphanumeric characters.
       */
      @SerializedName("originator_company_id")
      String originatorCompanyId;

      /** Positive per-debit limit in USD. */
      @SerializedName("transaction_limit")
      Amount transactionLimit;

      private Ach(
          Map<String, Object> extraParams, String originatorCompanyId, Amount transactionLimit) {
        this.extraParams = extraParams;
        this.originatorCompanyId = originatorCompanyId;
        this.transactionLimit = transactionLimit;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String originatorCompanyId;

        private Amount transactionLimit;

        /** Finalize and obtain parameter instance from this builder. */
        public SpendingMandateCreateParams.BankTransfer.Ach build() {
          return new SpendingMandateCreateParams.BankTransfer.Ach(
              this.extraParams, this.originatorCompanyId, this.transactionLimit);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SpendingMandateCreateParams.BankTransfer.Ach#extraParams} for the field
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
         * map. See {@link SpendingMandateCreateParams.BankTransfer.Ach#extraParams} for the field
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
         * <strong>Required.</strong> ACH Company ID identifying the authorized originator. Must
         * contain exactly 10 alphanumeric characters.
         */
        public Builder setOriginatorCompanyId(String originatorCompanyId) {
          this.originatorCompanyId = originatorCompanyId;
          return this;
        }

        /** Positive per-debit limit in USD. */
        public Builder setTransactionLimit(Amount transactionLimit) {
          this.transactionLimit = transactionLimit;
          return this;
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("bank_transfer")
    BANK_TRANSFER("bank_transfer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
