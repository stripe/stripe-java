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
public class OutboundPaymentQuoteCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The &quot;presentment amount&quot; to be sent to the recipient. */
  @SerializedName("amount")
  Amount amount;

  /** Method to be used to send the OutboundPayment. */
  @SerializedName("delivery_options")
  DeliveryOptions deliveryOptions;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Request details about the sender of an OutboundPaymentQuote. */
  @SerializedName("from")
  From from;

  /** <strong>Required.</strong> Request details about the recipient of an OutboundPaymentQuote. */
  @SerializedName("to")
  To to;

  private OutboundPaymentQuoteCreateParams(
      Amount amount,
      DeliveryOptions deliveryOptions,
      Map<String, Object> extraParams,
      From from,
      To to) {
    this.amount = amount;
    this.deliveryOptions = deliveryOptions;
    this.extraParams = extraParams;
    this.from = from;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private DeliveryOptions deliveryOptions;

    private Map<String, Object> extraParams;

    private From from;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundPaymentQuoteCreateParams build() {
      return new OutboundPaymentQuoteCreateParams(
          this.amount, this.deliveryOptions, this.extraParams, this.from, this.to);
    }

    /**
     * <strong>Required.</strong> The &quot;presentment amount&quot; to be sent to the recipient.
     */
    public Builder setAmount(OutboundPaymentQuoteCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Method to be used to send the OutboundPayment. */
    public Builder setDeliveryOptions(
        OutboundPaymentQuoteCreateParams.DeliveryOptions deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundPaymentQuoteCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundPaymentQuoteCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Request details about the sender of an OutboundPaymentQuote. */
    public Builder setFrom(OutboundPaymentQuoteCreateParams.From from) {
      this.from = from;
      return this;
    }

    /**
     * <strong>Required.</strong> Request details about the recipient of an OutboundPaymentQuote.
     */
    public Builder setTo(OutboundPaymentQuoteCreateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
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

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;

    private Amount(String currency, Map<String, Object> extraParams, Long value) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private Long value;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentQuoteCreateParams.Amount build() {
        return new OutboundPaymentQuoteCreateParams.Amount(
            this.currency, this.extraParams, this.value);
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

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentQuoteCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentQuoteCreateParams.Amount#extraParams} for the field
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
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
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

    /** Open Enum. Speed of the payout. */
    @SerializedName("speed")
    Speed speed;

    private DeliveryOptions(BankAccount bankAccount, Map<String, Object> extraParams, Speed speed) {
      this.bankAccount = bankAccount;
      this.extraParams = extraParams;
      this.speed = speed;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccount bankAccount;

      private Map<String, Object> extraParams;

      private Speed speed;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentQuoteCreateParams.DeliveryOptions build() {
        return new OutboundPaymentQuoteCreateParams.DeliveryOptions(
            this.bankAccount, this.extraParams, this.speed);
      }

      /** Open Enum. Method for bank account. */
      public Builder setBankAccount(
          OutboundPaymentQuoteCreateParams.DeliveryOptions.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentQuoteCreateParams.DeliveryOptions#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentQuoteCreateParams.DeliveryOptions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Open Enum. Speed of the payout. */
      public Builder setSpeed(OutboundPaymentQuoteCreateParams.DeliveryOptions.Speed speed) {
        this.speed = speed;
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
    /** <strong>Required.</strong> Describes the FinancialAccount's currency drawn from. */
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
      public OutboundPaymentQuoteCreateParams.From build() {
        return new OutboundPaymentQuoteCreateParams.From(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> Describes the FinancialAccount's currency drawn from. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentQuoteCreateParams.From#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentQuoteCreateParams.From#extraParams} for the field documentation.
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
      public OutboundPaymentQuoteCreateParams.To build() {
        return new OutboundPaymentQuoteCreateParams.To(
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
       * OutboundPaymentQuoteCreateParams.To#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentQuoteCreateParams.To#extraParams} for the field documentation.
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
