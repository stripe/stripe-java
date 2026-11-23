// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SpendingMandateUpdateParams extends ApiRequestParams {
  /** Bank transfer fields to update. Omitted fields remain unchanged. */
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

  private SpendingMandateUpdateParams(BankTransfer bankTransfer, Map<String, Object> extraParams) {
    this.bankTransfer = bankTransfer;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankTransfer bankTransfer;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public SpendingMandateUpdateParams build() {
      return new SpendingMandateUpdateParams(this.bankTransfer, this.extraParams);
    }

    /** Bank transfer fields to update. Omitted fields remain unchanged. */
    public Builder setBankTransfer(SpendingMandateUpdateParams.BankTransfer bankTransfer) {
      this.bankTransfer = bankTransfer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SpendingMandateUpdateParams#extraParams} for the field documentation.
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
     * See {@link SpendingMandateUpdateParams#extraParams} for the field documentation.
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
  public static class BankTransfer {
    /** Display name for the authorized originator, up to 50 characters long. */
    @SerializedName("account_holder_name")
    Object accountHolderName;

    /** ACH authorization fields to update. */
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

    private BankTransfer(Object accountHolderName, Ach ach, Map<String, Object> extraParams) {
      this.accountHolderName = accountHolderName;
      this.ach = ach;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object accountHolderName;

      private Ach ach;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SpendingMandateUpdateParams.BankTransfer build() {
        return new SpendingMandateUpdateParams.BankTransfer(
            this.accountHolderName, this.ach, this.extraParams);
      }

      /** Display name for the authorized originator, up to 50 characters long. */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /** Display name for the authorized originator, up to 50 characters long. */
      public Builder setAccountHolderName(EmptyParam accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /** ACH authorization fields to update. */
      public Builder setAch(SpendingMandateUpdateParams.BankTransfer.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SpendingMandateUpdateParams.BankTransfer#extraParams} for the field documentation.
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
       * See {@link SpendingMandateUpdateParams.BankTransfer#extraParams} for the field
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

      /**
       * ACH Company ID identifying the authorized originator. Must contain exactly 10 alphanumeric
       * characters.
       */
      @SerializedName("originator_company_id")
      Object originatorCompanyId;

      /** Per-debit limit for originator. */
      @SerializedName("transaction_limit")
      Amount transactionLimit;

      private Ach(
          Map<String, Object> extraParams, Object originatorCompanyId, Amount transactionLimit) {
        this.extraParams = extraParams;
        this.originatorCompanyId = originatorCompanyId;
        this.transactionLimit = transactionLimit;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object originatorCompanyId;

        private Amount transactionLimit;

        /** Finalize and obtain parameter instance from this builder. */
        public SpendingMandateUpdateParams.BankTransfer.Ach build() {
          return new SpendingMandateUpdateParams.BankTransfer.Ach(
              this.extraParams, this.originatorCompanyId, this.transactionLimit);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SpendingMandateUpdateParams.BankTransfer.Ach#extraParams} for the field
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
         * map. See {@link SpendingMandateUpdateParams.BankTransfer.Ach#extraParams} for the field
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
         * ACH Company ID identifying the authorized originator. Must contain exactly 10
         * alphanumeric characters.
         */
        public Builder setOriginatorCompanyId(String originatorCompanyId) {
          this.originatorCompanyId = originatorCompanyId;
          return this;
        }

        /**
         * ACH Company ID identifying the authorized originator. Must contain exactly 10
         * alphanumeric characters.
         */
        public Builder setOriginatorCompanyId(EmptyParam originatorCompanyId) {
          this.originatorCompanyId = originatorCompanyId;
          return this;
        }

        /** Per-debit limit for originator. */
        public Builder setTransactionLimit(Amount transactionLimit) {
          this.transactionLimit = transactionLimit;
          return this;
        }
      }
    }
  }
}
