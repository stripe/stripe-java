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
public class OutboundPaymentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The &quot;presentment amount&quot; to be sent to the recipient. */
  @SerializedName("amount")
  Amount amount;

  /** Delivery options to be used to send the OutboundPayment. */
  @SerializedName("delivery_options")
  DeliveryOptions deliveryOptions;

  /**
   * An arbitrary string attached to the OutboundPayment. Often useful for displaying to users. The
   * description can not be longer than 100 characters and can only contain basic Latin characters
   * and spaces. The following special characters are not allowed: '&quot;* .
   */
  @SerializedName("description")
  String description;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> From which FinancialAccount and BalanceType to pull funds from. */
  @SerializedName("from")
  From from;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The quote for this OutboundPayment. Only required for countries with regulatory mandates to
   * display fee estimates before OutboundPayment creation.
   */
  @SerializedName("outbound_payment_quote")
  String outboundPaymentQuote;

  /** Details about the notification settings for the OutboundPayment recipient. */
  @SerializedName("recipient_notification")
  RecipientNotification recipientNotification;

  /** <strong>Required.</strong> To which payout method to send the OutboundPayment. */
  @SerializedName("to")
  To to;

  private OutboundPaymentCreateParams(
      Amount amount,
      DeliveryOptions deliveryOptions,
      String description,
      Map<String, Object> extraParams,
      From from,
      Map<String, String> metadata,
      String outboundPaymentQuote,
      RecipientNotification recipientNotification,
      To to) {
    this.amount = amount;
    this.deliveryOptions = deliveryOptions;
    this.description = description;
    this.extraParams = extraParams;
    this.from = from;
    this.metadata = metadata;
    this.outboundPaymentQuote = outboundPaymentQuote;
    this.recipientNotification = recipientNotification;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private DeliveryOptions deliveryOptions;

    private String description;

    private Map<String, Object> extraParams;

    private From from;

    private Map<String, String> metadata;

    private String outboundPaymentQuote;

    private RecipientNotification recipientNotification;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundPaymentCreateParams build() {
      return new OutboundPaymentCreateParams(
          this.amount,
          this.deliveryOptions,
          this.description,
          this.extraParams,
          this.from,
          this.metadata,
          this.outboundPaymentQuote,
          this.recipientNotification,
          this.to);
    }

    /**
     * <strong>Required.</strong> The &quot;presentment amount&quot; to be sent to the recipient.
     */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Delivery options to be used to send the OutboundPayment. */
    public Builder setDeliveryOptions(OutboundPaymentCreateParams.DeliveryOptions deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * An arbitrary string attached to the OutboundPayment. Often useful for displaying to users.
     * The description can not be longer than 100 characters and can only contain basic Latin
     * characters and spaces. The following special characters are not allowed: '&quot;* .
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundPaymentCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundPaymentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> From which FinancialAccount and BalanceType to pull funds from.
     */
    public Builder setFrom(OutboundPaymentCreateParams.From from) {
      this.from = from;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundPaymentCreateParams#metadata} for the field documentation.
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
     * See {@link OutboundPaymentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The quote for this OutboundPayment. Only required for countries with regulatory mandates to
     * display fee estimates before OutboundPayment creation.
     */
    public Builder setOutboundPaymentQuote(String outboundPaymentQuote) {
      this.outboundPaymentQuote = outboundPaymentQuote;
      return this;
    }

    /** Details about the notification settings for the OutboundPayment recipient. */
    public Builder setRecipientNotification(
        OutboundPaymentCreateParams.RecipientNotification recipientNotification) {
      this.recipientNotification = recipientNotification;
      return this;
    }

    /** <strong>Required.</strong> To which payout method to send the OutboundPayment. */
    public Builder setTo(OutboundPaymentCreateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryOptions {
    /** Open Enum. Method for bank account. */
    @SerializedName("bank_account")
    BankAccount bankAccount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private DeliveryOptions(BankAccount bankAccount, Map<String, Object> extraParams) {
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
      public OutboundPaymentCreateParams.DeliveryOptions build() {
        return new OutboundPaymentCreateParams.DeliveryOptions(this.bankAccount, this.extraParams);
      }

      /** Open Enum. Method for bank account. */
      public Builder setBankAccount(
          OutboundPaymentCreateParams.DeliveryOptions.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.DeliveryOptions#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentCreateParams.DeliveryOptions#extraParams} for the field
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

    public enum BankAccount implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("local")
      LOCAL("local"),

      @SerializedName("wire")
      WIRE("wire");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BankAccount(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class From {
    /** <strong>Required.</strong> Describes the FinancialAmount's currency drawn from. */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The FinancialAccount that funds were pulled from. */
    @SerializedName("financial_account")
    String financialAccount;

    private From(String currency, Map<String, Object> extraParams, String financialAccount) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String financialAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.From build() {
        return new OutboundPaymentCreateParams.From(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> Describes the FinancialAmount's currency drawn from. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.From#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentCreateParams.From#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The FinancialAccount that funds were pulled from. */
      public Builder setFinancialAccount(String financialAccount) {
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
      public OutboundPaymentCreateParams.RecipientNotification build() {
        return new OutboundPaymentCreateParams.RecipientNotification(
            this.extraParams, this.setting);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.RecipientNotification#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentCreateParams.RecipientNotification#extraParams} for the field
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
      public Builder setSetting(OutboundPaymentCreateParams.RecipientNotification.Setting setting) {
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
  public static class To {
    /**
     * Describes the currency to send to the recipient. If included, this currency must match a
     * currency supported by the destination. Can be omitted in the following cases: - destination
     * only supports one currency - destination supports multiple currencies and one of the
     * currencies matches the FA currency - destination supports multiple currencies and one of the
     * currencies matches the presentment currency Note - when both FA currency and presentment
     * currency are supported, we pick the FA currency to minimize FX.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The payout method which the OutboundPayment uses to send payout. */
    @SerializedName("payout_method")
    String payoutMethod;

    /** <strong>Required.</strong> To which account the OutboundPayment is sent. */
    @SerializedName("recipient")
    String recipient;

    private To(
        String currency, Map<String, Object> extraParams, String payoutMethod, String recipient) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.payoutMethod = payoutMethod;
      this.recipient = recipient;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String payoutMethod;

      private String recipient;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.To build() {
        return new OutboundPaymentCreateParams.To(
            this.currency, this.extraParams, this.payoutMethod, this.recipient);
      }

      /**
       * Describes the currency to send to the recipient. If included, this currency must match a
       * currency supported by the destination. Can be omitted in the following cases: - destination
       * only supports one currency - destination supports multiple currencies and one of the
       * currencies matches the FA currency - destination supports multiple currencies and one of
       * the currencies matches the presentment currency Note - when both FA currency and
       * presentment currency are supported, we pick the FA currency to minimize FX.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.To#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentCreateParams.To#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The payout method which the OutboundPayment uses to send payout. */
      public Builder setPayoutMethod(String payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }

      /** <strong>Required.</strong> To which account the OutboundPayment is sent. */
      public Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
      }
    }
  }
}
