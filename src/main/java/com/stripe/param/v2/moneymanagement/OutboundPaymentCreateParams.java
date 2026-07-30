// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

  /** An arbitrary string attached to the OutboundPayment. Often useful for displaying to users. */
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

  /** The purpose of the OutboundPayment. */
  @SerializedName("purpose")
  Purpose purpose;

  /** Details about the notification settings for the OutboundPayment recipient. */
  @SerializedName("recipient_notification")
  RecipientNotification recipientNotification;

  /**
   * The recipient verification id for this OutboundPayment. Only required for countries with
   * regulatory mandates to verify recipient names before OutboundPayment creation.
   */
  @SerializedName("recipient_verification")
  String recipientVerification;

  /**
   * The description that appears on the receiving end for an OutboundPayment (for example, on a
   * bank statement). Must be between 3 and 22 characters long for most destinations (500 for
   * FinancialAccount destinations), and not contain profanity.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

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
      Purpose purpose,
      RecipientNotification recipientNotification,
      String recipientVerification,
      String statementDescriptor,
      To to) {
    this.amount = amount;
    this.deliveryOptions = deliveryOptions;
    this.description = description;
    this.extraParams = extraParams;
    this.from = from;
    this.metadata = metadata;
    this.outboundPaymentQuote = outboundPaymentQuote;
    this.purpose = purpose;
    this.recipientNotification = recipientNotification;
    this.recipientVerification = recipientVerification;
    this.statementDescriptor = statementDescriptor;
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

    private Purpose purpose;

    private RecipientNotification recipientNotification;

    private String recipientVerification;

    private String statementDescriptor;

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
          this.purpose,
          this.recipientNotification,
          this.recipientVerification,
          this.statementDescriptor,
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

    /** The purpose of the OutboundPayment. */
    public Builder setPurpose(OutboundPaymentCreateParams.Purpose purpose) {
      this.purpose = purpose;
      return this;
    }

    /** Details about the notification settings for the OutboundPayment recipient. */
    public Builder setRecipientNotification(
        OutboundPaymentCreateParams.RecipientNotification recipientNotification) {
      this.recipientNotification = recipientNotification;
      return this;
    }

    /**
     * The recipient verification id for this OutboundPayment. Only required for countries with
     * regulatory mandates to verify recipient names before OutboundPayment creation.
     */
    public Builder setRecipientVerification(String recipientVerification) {
      this.recipientVerification = recipientVerification;
      return this;
    }

    /**
     * The description that appears on the receiving end for an OutboundPayment (for example, on a
     * bank statement). Must be between 3 and 22 characters long for most destinations (500 for
     * FinancialAccount destinations), and not contain profanity.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
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

    /** Delivery options for paper check. */
    @SerializedName("paper_check")
    PaperCheck paperCheck;

    /** Open Enum. Speed of the payout. */
    @SerializedName("speed")
    Speed speed;

    private DeliveryOptions(
        BankAccount bankAccount,
        Map<String, Object> extraParams,
        PaperCheck paperCheck,
        Speed speed) {
      this.bankAccount = bankAccount;
      this.extraParams = extraParams;
      this.paperCheck = paperCheck;
      this.speed = speed;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccount bankAccount;

      private Map<String, Object> extraParams;

      private PaperCheck paperCheck;

      private Speed speed;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.DeliveryOptions build() {
        return new OutboundPaymentCreateParams.DeliveryOptions(
            this.bankAccount, this.extraParams, this.paperCheck, this.speed);
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

      /** Delivery options for paper check. */
      public Builder setPaperCheck(
          OutboundPaymentCreateParams.DeliveryOptions.PaperCheck paperCheck) {
        this.paperCheck = paperCheck;
        return this;
      }

      /** Open Enum. Speed of the payout. */
      public Builder setSpeed(OutboundPaymentCreateParams.DeliveryOptions.Speed speed) {
        this.speed = speed;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaperCheck {
      /** The ID of a file to include as an attachment with the paper check. */
      @SerializedName("attachment")
      String attachment;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Memo printed on the memo field of the check. */
      @SerializedName("memo")
      String memo;

      /** Open Enum. Shipping speed of the paper check. Defaults to standard. */
      @SerializedName("shipping_speed")
      ShippingSpeed shippingSpeed;

      /** <strong>Required.</strong> Signature for the paper check. */
      @SerializedName("signature")
      String signature;

      private PaperCheck(
          String attachment,
          Map<String, Object> extraParams,
          String memo,
          ShippingSpeed shippingSpeed,
          String signature) {
        this.attachment = attachment;
        this.extraParams = extraParams;
        this.memo = memo;
        this.shippingSpeed = shippingSpeed;
        this.signature = signature;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String attachment;

        private Map<String, Object> extraParams;

        private String memo;

        private ShippingSpeed shippingSpeed;

        private String signature;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundPaymentCreateParams.DeliveryOptions.PaperCheck build() {
          return new OutboundPaymentCreateParams.DeliveryOptions.PaperCheck(
              this.attachment, this.extraParams, this.memo, this.shippingSpeed, this.signature);
        }

        /** The ID of a file to include as an attachment with the paper check. */
        public Builder setAttachment(String attachment) {
          this.attachment = attachment;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundPaymentCreateParams.DeliveryOptions.PaperCheck#extraParams} for
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
         * map. See {@link OutboundPaymentCreateParams.DeliveryOptions.PaperCheck#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Memo printed on the memo field of the check. */
        public Builder setMemo(String memo) {
          this.memo = memo;
          return this;
        }

        /** Open Enum. Shipping speed of the paper check. Defaults to standard. */
        public Builder setShippingSpeed(
            OutboundPaymentCreateParams.DeliveryOptions.PaperCheck.ShippingSpeed shippingSpeed) {
          this.shippingSpeed = shippingSpeed;
          return this;
        }

        /** <strong>Required.</strong> Signature for the paper check. */
        public Builder setSignature(String signature) {
          this.signature = signature;
          return this;
        }
      }

      public enum ShippingSpeed implements ApiRequestParams.EnumParam {
        @SerializedName("priority")
        PRIORITY("priority"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ShippingSpeed(String value) {
          this.value = value;
        }
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

    public enum Speed implements ApiRequestParams.EnumParam {
      @SerializedName("instant")
      INSTANT("instant"),

      @SerializedName("next_business_day")
      NEXT_BUSINESS_DAY("next_business_day"),

      @SerializedName("standard")
      STANDARD("standard");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Speed(String value) {
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

    /** Payout method options for the OutboundPayment. */
    @SerializedName("payout_method_options")
    PayoutMethodOptions payoutMethodOptions;

    /** <strong>Required.</strong> To which account the OutboundPayment is sent. */
    @SerializedName("recipient")
    String recipient;

    private To(
        String currency,
        Map<String, Object> extraParams,
        String payoutMethod,
        PayoutMethodOptions payoutMethodOptions,
        String recipient) {
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
      private String currency;

      private Map<String, Object> extraParams;

      private String payoutMethod;

      private PayoutMethodOptions payoutMethodOptions;

      private String recipient;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.To build() {
        return new OutboundPaymentCreateParams.To(
            this.currency,
            this.extraParams,
            this.payoutMethod,
            this.payoutMethodOptions,
            this.recipient);
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

      /** Payout method options for the OutboundPayment. */
      public Builder setPayoutMethodOptions(
          OutboundPaymentCreateParams.To.PayoutMethodOptions payoutMethodOptions) {
        this.payoutMethodOptions = payoutMethodOptions;
        return this;
      }

      /** <strong>Required.</strong> To which account the OutboundPayment is sent. */
      public Builder setRecipient(String recipient) {
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
        public OutboundPaymentCreateParams.To.PayoutMethodOptions build() {
          return new OutboundPaymentCreateParams.To.PayoutMethodOptions(
              this.bankAccount, this.extraParams);
        }

        /** Options for bank account payout methods. */
        public Builder setBankAccount(
            OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount bankAccount) {
          this.bankAccount = bankAccount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundPaymentCreateParams.To.PayoutMethodOptions#extraParams} for the
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
         * map. See {@link OutboundPaymentCreateParams.To.PayoutMethodOptions#extraParams} for the
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

        /** <strong>Required.</strong> The preferred networks to use for this OutboundPayment. */
        @SerializedName("preferred_networks")
        List<OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
            preferredNetworks;

        private BankAccount(
            Map<String, Object> extraParams,
            PreferredNetworkOptions preferredNetworkOptions,
            List<OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
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

          private List<
                  OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
              preferredNetworks;

          /** Finalize and obtain parameter instance from this builder. */
          public OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount build() {
            return new OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount(
                this.extraParams, this.preferredNetworkOptions, this.preferredNetworks);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount#extraParams} for the
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
           * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount#extraParams} for the
           * field documentation.
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
              OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions
                  preferredNetworkOptions) {
            this.preferredNetworkOptions = preferredNetworkOptions;
            return this;
          }

          /**
           * Add an element to `preferredNetworks` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount#preferredNetworks} for
           * the field documentation.
           */
          public Builder addPreferredNetwork(
              OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork
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
           * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount#preferredNetworks} for
           * the field documentation.
           */
          public Builder addAllPreferredNetwork(
              List<OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetwork>
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
            public OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                    .PreferredNetworkOptions
                build() {
              return new OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                  .PreferredNetworkOptions(this.ach, this.extraParams);
            }

            /** ACH-specific network options. */
            public Builder setAch(
                OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                        .PreferredNetworkOptions.Ach
                    ach) {
              this.ach = ach;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions#extraParams}
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
             * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions#extraParams}
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
              public OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                      .PreferredNetworkOptions.Ach
                  build() {
                return new OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                    .PreferredNetworkOptions.Ach(
                    this.extraParams, this.submission, this.transactionPurpose);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions.Ach#extraParams}
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
               * OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount.PreferredNetworkOptions.Ach#extraParams}
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
                  OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
                          .PreferredNetworkOptions.Ach.Submission
                      submission) {
                this.submission = submission;
                return this;
              }

              /** The transaction purpose for this ACH payment. */
              public Builder setTransactionPurpose(
                  OutboundPaymentCreateParams.To.PayoutMethodOptions.BankAccount
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

  public enum Purpose implements ApiRequestParams.EnumParam {
    @SerializedName("payroll")
    PAYROLL("payroll");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Purpose(String value) {
      this.value = value;
    }
  }
}
