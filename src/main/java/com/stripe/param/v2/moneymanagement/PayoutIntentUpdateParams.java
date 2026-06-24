// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PayoutIntentUpdateParams extends ApiRequestParams {
  /** The monetary amount to be sent. */
  @SerializedName("amount")
  Amount amount;

  /** An arbitrary string attached to the PayoutIntent. Often useful for displaying to users. */
  @SerializedName("description")
  Object description;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** From which FinancialAccount to pull funds. */
  @SerializedName("from")
  From from;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Details about the OutboundPayment notification settings for recipient. Only applicable to
   * OutboundPayment.
   */
  @SerializedName("recipient_notification")
  RecipientNotification recipientNotification;

  /** Scheduling options for the payout. If this is nil, we assume immediate execution. */
  @SerializedName("schedule_options")
  ScheduleOptions scheduleOptions;

  /**
   * The description that appears on the receiving end for the payout (for example, on a bank
   * statement).
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /** To which payout method the payout is sent. */
  @SerializedName("to")
  To to;

  private PayoutIntentUpdateParams(
      Amount amount,
      Object description,
      Map<String, Object> extraParams,
      From from,
      Map<String, String> metadata,
      RecipientNotification recipientNotification,
      ScheduleOptions scheduleOptions,
      Object statementDescriptor,
      To to) {
    this.amount = amount;
    this.description = description;
    this.extraParams = extraParams;
    this.from = from;
    this.metadata = metadata;
    this.recipientNotification = recipientNotification;
    this.scheduleOptions = scheduleOptions;
    this.statementDescriptor = statementDescriptor;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Object description;

    private Map<String, Object> extraParams;

    private From from;

    private Map<String, String> metadata;

    private RecipientNotification recipientNotification;

    private ScheduleOptions scheduleOptions;

    private Object statementDescriptor;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public PayoutIntentUpdateParams build() {
      return new PayoutIntentUpdateParams(
          this.amount,
          this.description,
          this.extraParams,
          this.from,
          this.metadata,
          this.recipientNotification,
          this.scheduleOptions,
          this.statementDescriptor,
          this.to);
    }

    /** The monetary amount to be sent. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** An arbitrary string attached to the PayoutIntent. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** An arbitrary string attached to the PayoutIntent. Often useful for displaying to users. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PayoutIntentUpdateParams#extraParams} for the field documentation.
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
     * See {@link PayoutIntentUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** From which FinancialAccount to pull funds. */
    public Builder setFrom(PayoutIntentUpdateParams.From from) {
      this.from = from;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PayoutIntentUpdateParams#metadata} for the field documentation.
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
     * See {@link PayoutIntentUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Details about the OutboundPayment notification settings for recipient. Only applicable to
     * OutboundPayment.
     */
    public Builder setRecipientNotification(
        PayoutIntentUpdateParams.RecipientNotification recipientNotification) {
      this.recipientNotification = recipientNotification;
      return this;
    }

    /** Scheduling options for the payout. If this is nil, we assume immediate execution. */
    public Builder setScheduleOptions(PayoutIntentUpdateParams.ScheduleOptions scheduleOptions) {
      this.scheduleOptions = scheduleOptions;
      return this;
    }

    /**
     * The description that appears on the receiving end for the payout (for example, on a bank
     * statement).
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The description that appears on the receiving end for the payout (for example, on a bank
     * statement).
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** To which payout method the payout is sent. */
    public Builder setTo(PayoutIntentUpdateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class From {
    /** <strong>Required.</strong> The currency of the financial account. */
    @SerializedName("currency")
    Object currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The FinancialAccount that funds are pulled from. */
    @SerializedName("financial_account")
    Object financialAccount;

    private From(Object currency, Map<String, Object> extraParams, Object financialAccount) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object currency;

      private Map<String, Object> extraParams;

      private Object financialAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public PayoutIntentUpdateParams.From build() {
        return new PayoutIntentUpdateParams.From(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> The currency of the financial account. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** <strong>Required.</strong> The currency of the financial account. */
      public Builder setCurrency(EmptyParam currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutIntentUpdateParams.From#extraParams} for the field documentation.
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
       * See {@link PayoutIntentUpdateParams.From#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The FinancialAccount that funds are pulled from. */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /** <strong>Required.</strong> The FinancialAccount that funds are pulled from. */
      public Builder setFinancialAccount(EmptyParam financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RecipientNotification {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Closed Enum. Configuration option to enable or disable
     * notifications to recipients. Do not send notifications when setting is NONE. Default to
     * account setting when setting is CONFIGURED or not set.
     */
    @SerializedName("setting")
    Setting setting;

    private RecipientNotification(Map<String, Object> extraParams, Setting setting) {
      this.extraParams = extraParams;
      this.setting = setting;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Setting setting;

      /** Finalize and obtain parameter instance from this builder. */
      public PayoutIntentUpdateParams.RecipientNotification build() {
        return new PayoutIntentUpdateParams.RecipientNotification(this.extraParams, this.setting);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutIntentUpdateParams.RecipientNotification#extraParams} for the field documentation.
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
       * See {@link PayoutIntentUpdateParams.RecipientNotification#extraParams} for the field
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
       * <strong>Required.</strong> Closed Enum. Configuration option to enable or disable
       * notifications to recipients. Do not send notifications when setting is NONE. Default to
       * account setting when setting is CONFIGURED or not set.
       */
      public Builder setSetting(PayoutIntentUpdateParams.RecipientNotification.Setting setting) {
        this.setting = setting;
        return this;
      }
    }

    public enum Setting implements ApiRequestParams.EnumParam {
      @SerializedName("configured")
      CONFIGURED("configured"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Setting(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ScheduleOptions {
    /** The date when the payout should be executed, in YYYY-MM-DD format. */
    @SerializedName("execute_on")
    Object executeOn;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ScheduleOptions(Object executeOn, Map<String, Object> extraParams) {
      this.executeOn = executeOn;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object executeOn;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PayoutIntentUpdateParams.ScheduleOptions build() {
        return new PayoutIntentUpdateParams.ScheduleOptions(this.executeOn, this.extraParams);
      }

      /** The date when the payout should be executed, in YYYY-MM-DD format. */
      public Builder setExecuteOn(String executeOn) {
        this.executeOn = executeOn;
        return this;
      }

      /** The date when the payout should be executed, in YYYY-MM-DD format. */
      public Builder setExecuteOn(EmptyParam executeOn) {
        this.executeOn = executeOn;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutIntentUpdateParams.ScheduleOptions#extraParams} for the field documentation.
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
       * See {@link PayoutIntentUpdateParams.ScheduleOptions#extraParams} for the field
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class To {
    /** The currency to send to the recipient. */
    @SerializedName("currency")
    Object currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The payout method ID. Optional for OutboundPayment if recipient has default payment method.
     * Required for OutboundTransfer.
     */
    @SerializedName("payout_method")
    Object payoutMethod;

    /** Payout method options for the PayoutIntent. */
    @SerializedName("payout_method_options")
    PayoutMethodOptions payoutMethodOptions;

    /** The recipient ID. Only relevant for OutboundPayment. */
    @SerializedName("recipient")
    Object recipient;

    private To(
        Object currency,
        Map<String, Object> extraParams,
        Object payoutMethod,
        PayoutMethodOptions payoutMethodOptions,
        Object recipient) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.payoutMethod = payoutMethod;
      this.payoutMethodOptions = payoutMethodOptions;
      this.recipient = recipient;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object currency;

      private Map<String, Object> extraParams;

      private Object payoutMethod;

      private PayoutMethodOptions payoutMethodOptions;

      private Object recipient;

      /** Finalize and obtain parameter instance from this builder. */
      public PayoutIntentUpdateParams.To build() {
        return new PayoutIntentUpdateParams.To(
            this.currency,
            this.extraParams,
            this.payoutMethod,
            this.payoutMethodOptions,
            this.recipient);
      }

      /** The currency to send to the recipient. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** The currency to send to the recipient. */
      public Builder setCurrency(EmptyParam currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutIntentUpdateParams.To#extraParams} for the field documentation.
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
       * See {@link PayoutIntentUpdateParams.To#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The payout method ID. Optional for OutboundPayment if recipient has default payment method.
       * Required for OutboundTransfer.
       */
      public Builder setPayoutMethod(String payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }

      /**
       * The payout method ID. Optional for OutboundPayment if recipient has default payment method.
       * Required for OutboundTransfer.
       */
      public Builder setPayoutMethod(EmptyParam payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }

      /** Payout method options for the PayoutIntent. */
      public Builder setPayoutMethodOptions(
          PayoutIntentUpdateParams.To.PayoutMethodOptions payoutMethodOptions) {
        this.payoutMethodOptions = payoutMethodOptions;
        return this;
      }

      /** The recipient ID. Only relevant for OutboundPayment. */
      public Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
      }

      /** The recipient ID. Only relevant for OutboundPayment. */
      public Builder setRecipient(EmptyParam recipient) {
        this.recipient = recipient;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutMethodOptions {
      /** Options for bank account payout methods. */
      @SerializedName("bank_account")
      BankAccount bankAccount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayoutMethodOptions(BankAccount bankAccount, Map<String, Object> extraParams) {
        this.bankAccount = bankAccount;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BankAccount bankAccount;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PayoutIntentUpdateParams.To.PayoutMethodOptions build() {
          return new PayoutIntentUpdateParams.To.PayoutMethodOptions(
              this.bankAccount, this.extraParams);
        }

        /** Options for bank account payout methods. */
        public Builder setBankAccount(
            PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount bankAccount) {
          this.bankAccount = bankAccount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PayoutIntentUpdateParams.To.PayoutMethodOptions#extraParams} for the
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
         * map. See {@link PayoutIntentUpdateParams.To.PayoutMethodOptions#extraParams} for the
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
      public static class BankAccount {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Per-network configuration options. */
        @SerializedName("preferred_network_options")
        PreferredNetworkOptions preferredNetworkOptions;

        /** <strong>Required.</strong> The preferred networks to use for this PayoutIntent. */
        @SerializedName("preferred_networks")
        List<PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
            preferredNetworks;

        private BankAccount(
            Map<String, Object> extraParams,
            PreferredNetworkOptions preferredNetworkOptions,
            List<PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
                preferredNetworks) {
          this.extraParams = extraParams;
          this.preferredNetworkOptions = preferredNetworkOptions;
          this.preferredNetworks = preferredNetworks;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PreferredNetworkOptions preferredNetworkOptions;

          private List<PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
              preferredNetworks;

          /** Finalize and obtain parameter instance from this builder. */
          public PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount build() {
            return new PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount(
                this.extraParams, this.preferredNetworkOptions, this.preferredNetworks);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount#extraParams} for the field
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
           * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Per-network configuration options. */
          public Builder setPreferredNetworkOptions(
              PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions
                  preferredNetworkOptions) {
            this.preferredNetworkOptions = preferredNetworkOptions;
            return this;
          }

          /**
           * Add an element to `preferredNetworks` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount#preferredNetworks} for the
           * field documentation.
           */
          public Builder addPreferredNetwork(
              PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork
                  element) {
            if (this.preferredNetworks == null) {
              this.preferredNetworks = new ArrayList<>();
            }
            this.preferredNetworks.add(element);
            return this;
          }

          /**
           * Add all elements to `preferredNetworks` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount#preferredNetworks} for the
           * field documentation.
           */
          public Builder addAllPreferredNetwork(
              List<PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
                  elements) {
            if (this.preferredNetworks == null) {
              this.preferredNetworks = new ArrayList<>();
            }
            this.preferredNetworks.addAll(elements);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PreferredNetworkOptions {
          /** ACH-specific network options. */
          @SerializedName("ach")
          Ach ach;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private PreferredNetworkOptions(Ach ach, Map<String, Object> extraParams) {
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
            public PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                    .PreferredNetworkOptions
                build() {
              return new PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                  .PreferredNetworkOptions(this.ach, this.extraParams);
            }

            /** ACH-specific network options. */
            public Builder setAch(
                PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions
                        .Ach
                    ach) {
              this.ach = ach;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions#extraParams}
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

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Ach {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Open Enum. ACH submission timing. */
            @SerializedName("submission")
            Submission submission;

            /** The transaction purpose for this ACH payment. */
            @SerializedName("transaction_purpose")
            TransactionPurpose transactionPurpose;

            private Ach(
                Map<String, Object> extraParams,
                Submission submission,
                TransactionPurpose transactionPurpose) {
              this.extraParams = extraParams;
              this.submission = submission;
              this.transactionPurpose = transactionPurpose;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Submission submission;

              private TransactionPurpose transactionPurpose;

              /** Finalize and obtain parameter instance from this builder. */
              public PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                      .PreferredNetworkOptions.Ach
                  build() {
                return new PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                    .PreferredNetworkOptions.Ach(
                    this.extraParams, this.submission, this.transactionPurpose);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions.Ach#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions.Ach#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Open Enum. ACH submission timing. */
              public Builder setSubmission(
                  PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                          .PreferredNetworkOptions.Ach.Submission
                      submission) {
                this.submission = submission;
                return this;
              }

              /** The transaction purpose for this ACH payment. */
              public Builder setTransactionPurpose(
                  PayoutIntentUpdateParams.To.PayoutMethodOptions.BankAccount
                          .PreferredNetworkOptions.Ach.TransactionPurpose
                      transactionPurpose) {
                this.transactionPurpose = transactionPurpose;
                return this;
              }
            }

            public enum Submission implements ApiRequestParams.EnumParam {
              @SerializedName("next_day")
              NEXT_DAY("next_day"),

              @SerializedName("same_day")
              SAME_DAY("same_day");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Submission(String value) {
                this.value = value;
              }
            }

            public enum TransactionPurpose implements ApiRequestParams.EnumParam {
              @SerializedName("payroll")
              PAYROLL("payroll");

              @Getter(onMethod_ = {@Override})
              private final String value;

              TransactionPurpose(String value) {
                this.value = value;
              }
            }
          }
        }

        public enum PreferredNetwork implements ApiRequestParams.EnumParam {
          @SerializedName("ach")
          ACH("ach"),

          @SerializedName("becs")
          BECS("becs"),

          @SerializedName("eft")
          EFT("eft"),

          @SerializedName("fedwire")
          FEDWIRE("fedwire"),

          @SerializedName("fps")
          FPS("fps"),

          @SerializedName("npp")
          NPP("npp"),

          @SerializedName("rtp")
          RTP("rtp"),

          @SerializedName("sepa_credit")
          SEPA_CREDIT("sepa_credit"),

          @SerializedName("sepa_instant")
          SEPA_INSTANT("sepa_instant"),

          @SerializedName("swift")
          SWIFT("swift");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PreferredNetwork(String value) {
            this.value = value;
          }
        }
      }
    }
  }
}
