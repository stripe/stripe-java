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
public class InboundTransferCreateParams extends ApiRequestParams {
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

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> The origin payment method to be debited for the InboundTransfer. */
  @SerializedName("origin_payment_method")
  String originPaymentMethod;

  /** Additional options about the origin PaymentMethod. */
  @SerializedName("origin_payment_method_options")
  OriginPaymentMethodOptions originPaymentMethodOptions;

  /**
   * The complete description that appears on your customers' statements. Maximum 10 characters. Can
   * only include -#.$&amp;*, spaces, and alphanumeric characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private InboundTransferCreateParams(
      Long amount,
      String currency,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Map<String, String> metadata,
      String originPaymentMethod,
      OriginPaymentMethodOptions originPaymentMethodOptions,
      String statementDescriptor) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.metadata = metadata;
    this.originPaymentMethod = originPaymentMethod;
    this.originPaymentMethodOptions = originPaymentMethodOptions;
    this.statementDescriptor = statementDescriptor;
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

    private Map<String, String> metadata;

    private String originPaymentMethod;

    private OriginPaymentMethodOptions originPaymentMethodOptions;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public InboundTransferCreateParams build() {
      return new InboundTransferCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.metadata,
          this.originPaymentMethod,
          this.originPaymentMethodOptions,
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

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InboundTransferCreateParams#expand} for the field documentation.
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
     * InboundTransferCreateParams#expand} for the field documentation.
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
     * InboundTransferCreateParams#extraParams} for the field documentation.
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
     * See {@link InboundTransferCreateParams#extraParams} for the field documentation.
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

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InboundTransferCreateParams#metadata} for the field documentation.
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
     * See {@link InboundTransferCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The origin payment method to be debited for the InboundTransfer.
     */
    public Builder setOriginPaymentMethod(String originPaymentMethod) {
      this.originPaymentMethod = originPaymentMethod;
      return this;
    }

    /** Additional options about the origin PaymentMethod. */
    public Builder setOriginPaymentMethodOptions(
        InboundTransferCreateParams.OriginPaymentMethodOptions originPaymentMethodOptions) {
      this.originPaymentMethodOptions = originPaymentMethodOptions;
      return this;
    }

    /**
     * The complete description that appears on your customers' statements. Maximum 10 characters.
     * Can only include -#.$&amp;*, spaces, and alphanumeric characters.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class OriginPaymentMethodOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Includes additional payment method options if the destination is a us_bank_account. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    private OriginPaymentMethodOptions(
        Map<String, Object> extraParams, UsBankAccount usBankAccount) {
      this.extraParams = extraParams;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private UsBankAccount usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferCreateParams.OriginPaymentMethodOptions build() {
        return new InboundTransferCreateParams.OriginPaymentMethodOptions(
            this.extraParams, this.usBankAccount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferCreateParams.OriginPaymentMethodOptions#extraParams} for the field
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
       * See {@link InboundTransferCreateParams.OriginPaymentMethodOptions#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Includes additional payment method options if the destination is a us_bank_account. */
      public Builder setUsBankAccount(
          InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount {
      /** Specify details about the ACH transaction. */
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

      private UsBankAccount(Ach ach, Map<String, Object> extraParams) {
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
        public InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount build() {
          return new InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount(
              this.ach, this.extraParams);
        }

        /** Specify details about the ACH transaction. */
        public Builder setAch(
            InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount.Ach ach) {
          this.ach = ach;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount#extraParams} for the
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
         * InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount#extraParams} for the
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
      public static class Ach {
        /**
         * Freeform payment-related information to transmit in the ACH addenda record. Maximum 80
         * characters, ACH character set. Applied only when the payment routes over ACH. Immutable
         * after creation.
         */
        @SerializedName("addenda")
        String addenda;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount.Ach build() {
            return new InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount.Ach(
                this.addenda, this.extraParams);
          }

          /**
           * Freeform payment-related information to transmit in the ACH addenda record. Maximum 80
           * characters, ACH character set. Applied only when the payment routes over ACH. Immutable
           * after creation.
           */
          public Builder setAddenda(String addenda) {
            this.addenda = addenda;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount.Ach#extraParams}
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
           * InboundTransferCreateParams.OriginPaymentMethodOptions.UsBankAccount.Ach#extraParams}
           * for the field documentation.
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
    }
  }
}
