// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RefundCreateParams extends ApiRequestParams {
  @SerializedName("amount")
  Long amount;

  /** The identifier of the charge to refund. */
  @SerializedName("charge")
  String charge;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Customer whose customer balance to refund from. */
  @SerializedName("customer")
  String customer;

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

  /**
   * For payment methods without native refund support (e.g., Konbini, PromptPay), use this email
   * from the customer to receive refund instructions.
   */
  @SerializedName("instructions_email")
  String instructionsEmail;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Origin of the refund. */
  @SerializedName("origin")
  Origin origin;

  /** The identifier of the PaymentAttemptRecord to refund. */
  @SerializedName("payment_attempt_record")
  String paymentAttemptRecord;

  /** The identifier of the PaymentIntent to refund. */
  @SerializedName("payment_intent")
  String paymentIntent;

  /** Used to create the PaymentMethod that will receive the refund. */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment method-specific options for the refund. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** The identifier of the PaymentRecord to refund. */
  @SerializedName("payment_record")
  String paymentRecord;

  /**
   * String indicating the reason for the refund. If set, possible values are {@code duplicate},
   * {@code fraudulent}, and {@code requested_by_customer}. If you believe the charge to be
   * fraudulent, specifying {@code fraudulent} as the reason will add the associated card and email
   * to your <a href="https://docs.stripe.com/radar/lists">block lists</a>, and will also help us
   * improve our fraud detection algorithms.
   */
  @SerializedName("reason")
  Reason reason;

  /**
   * Boolean indicating whether the application fee should be refunded when refunding this charge.
   * If a full charge refund is given, the full application fee will be refunded. Otherwise, the
   * application fee will be refunded in an amount proportional to the amount of the charge
   * refunded. An application fee can be refunded only by the application that created the charge.
   */
  @SerializedName("refund_application_fee")
  Boolean refundApplicationFee;

  /**
   * Boolean indicating whether the transfer should be reversed when refunding this charge. The
   * transfer will be reversed proportionally to the amount being refunded (either the entire or
   * partial amount).<br>
   * <br>
   * A transfer can be reversed only by the application that created the charge.
   */
  @SerializedName("reverse_transfer")
  Boolean reverseTransfer;

  private RefundCreateParams(
      Long amount,
      String charge,
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String instructionsEmail,
      Object metadata,
      Origin origin,
      String paymentAttemptRecord,
      String paymentIntent,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      String paymentRecord,
      Reason reason,
      Boolean refundApplicationFee,
      Boolean reverseTransfer) {
    this.amount = amount;
    this.charge = charge;
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.instructionsEmail = instructionsEmail;
    this.metadata = metadata;
    this.origin = origin;
    this.paymentAttemptRecord = paymentAttemptRecord;
    this.paymentIntent = paymentIntent;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentRecord = paymentRecord;
    this.reason = reason;
    this.refundApplicationFee = refundApplicationFee;
    this.reverseTransfer = reverseTransfer;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String charge;

    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String instructionsEmail;

    private Object metadata;

    private Origin origin;

    private String paymentAttemptRecord;

    private String paymentIntent;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private String paymentRecord;

    private Reason reason;

    private Boolean refundApplicationFee;

    private Boolean reverseTransfer;

    /** Finalize and obtain parameter instance from this builder. */
    public RefundCreateParams build() {
      return new RefundCreateParams(
          this.amount,
          this.charge,
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.instructionsEmail,
          this.metadata,
          this.origin,
          this.paymentAttemptRecord,
          this.paymentIntent,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.paymentRecord,
          this.reason,
          this.refundApplicationFee,
          this.reverseTransfer);
    }

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** The identifier of the charge to refund. */
    public Builder setCharge(String charge) {
      this.charge = charge;
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

    /** Customer whose customer balance to refund from. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RefundCreateParams#expand} for the field documentation.
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
     * RefundCreateParams#expand} for the field documentation.
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
     * RefundCreateParams#extraParams} for the field documentation.
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
     * See {@link RefundCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * For payment methods without native refund support (e.g., Konbini, PromptPay), use this email
     * from the customer to receive refund instructions.
     */
    public Builder setInstructionsEmail(String instructionsEmail) {
      this.instructionsEmail = instructionsEmail;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RefundCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RefundCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** Origin of the refund. */
    public Builder setOrigin(RefundCreateParams.Origin origin) {
      this.origin = origin;
      return this;
    }

    /** The identifier of the PaymentAttemptRecord to refund. */
    public Builder setPaymentAttemptRecord(String paymentAttemptRecord) {
      this.paymentAttemptRecord = paymentAttemptRecord;
      return this;
    }

    /** The identifier of the PaymentIntent to refund. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** Used to create the PaymentMethod that will receive the refund. */
    public Builder setPaymentMethodData(RefundCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment method-specific options for the refund. */
    public Builder setPaymentMethodOptions(
        RefundCreateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /** The identifier of the PaymentRecord to refund. */
    public Builder setPaymentRecord(String paymentRecord) {
      this.paymentRecord = paymentRecord;
      return this;
    }

    /**
     * String indicating the reason for the refund. If set, possible values are {@code duplicate},
     * {@code fraudulent}, and {@code requested_by_customer}. If you believe the charge to be
     * fraudulent, specifying {@code fraudulent} as the reason will add the associated card and
     * email to your <a href="https://docs.stripe.com/radar/lists">block lists</a>, and will also
     * help us improve our fraud detection algorithms.
     */
    public Builder setReason(RefundCreateParams.Reason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Boolean indicating whether the application fee should be refunded when refunding this charge.
     * If a full charge refund is given, the full application fee will be refunded. Otherwise, the
     * application fee will be refunded in an amount proportional to the amount of the charge
     * refunded. An application fee can be refunded only by the application that created the charge.
     */
    public Builder setRefundApplicationFee(Boolean refundApplicationFee) {
      this.refundApplicationFee = refundApplicationFee;
      return this;
    }

    /**
     * Boolean indicating whether the transfer should be reversed when refunding this charge. The
     * transfer will be reversed proportionally to the amount being refunded (either the entire or
     * partial amount).<br>
     * <br>
     * A transfer can be reversed only by the application that created the charge.
     */
    public Builder setReverseTransfer(Boolean reverseTransfer) {
      this.reverseTransfer = reverseTransfer;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodData {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The gift card to receive the refund. */
    @SerializedName("gift_card")
    GiftCard giftCard;

    /**
     * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
     * the PaymentMethod with a name matching this value. It contains additional information
     * specific to the PaymentMethod type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodData(Map<String, Object> extraParams, GiftCard giftCard, Type type) {
      this.extraParams = extraParams;
      this.giftCard = giftCard;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private GiftCard giftCard;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public RefundCreateParams.PaymentMethodData build() {
        return new RefundCreateParams.PaymentMethodData(this.extraParams, this.giftCard, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RefundCreateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link RefundCreateParams.PaymentMethodData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The gift card to receive the refund. */
      public Builder setGiftCard(RefundCreateParams.PaymentMethodData.GiftCard giftCard) {
        this.giftCard = giftCard;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(RefundCreateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GiftCard {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the gift card to receive the refund. */
      @SerializedName("gift_card")
      String giftCard;

      private GiftCard(Map<String, Object> extraParams, String giftCard) {
        this.extraParams = extraParams;
        this.giftCard = giftCard;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String giftCard;

        /** Finalize and obtain parameter instance from this builder. */
        public RefundCreateParams.PaymentMethodData.GiftCard build() {
          return new RefundCreateParams.PaymentMethodData.GiftCard(this.extraParams, this.giftCard);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RefundCreateParams.PaymentMethodData.GiftCard#extraParams} for the field
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
         * map. See {@link RefundCreateParams.PaymentMethodData.GiftCard#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the gift card to receive the refund. */
        public Builder setGiftCard(String giftCard) {
          this.giftCard = giftCard;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("acss_debit")
      ACSS_DEBIT("acss_debit"),

      @SerializedName("affirm")
      AFFIRM("affirm"),

      @SerializedName("afterpay_clearpay")
      AFTERPAY_CLEARPAY("afterpay_clearpay"),

      @SerializedName("alipay")
      ALIPAY("alipay"),

      @SerializedName("alma")
      ALMA("alma"),

      @SerializedName("amazon_pay")
      AMAZON_PAY("amazon_pay"),

      @SerializedName("au_becs_debit")
      AU_BECS_DEBIT("au_becs_debit"),

      @SerializedName("bacs_debit")
      BACS_DEBIT("bacs_debit"),

      @SerializedName("bancontact")
      BANCONTACT("bancontact"),

      @SerializedName("billie")
      BILLIE("billie"),

      @SerializedName("bizum")
      BIZUM("bizum"),

      @SerializedName("blik")
      BLIK("blik"),

      @SerializedName("boleto")
      BOLETO("boleto"),

      @SerializedName("card")
      CARD("card"),

      @SerializedName("carecredit")
      CARECREDIT("carecredit"),

      @SerializedName("cashapp")
      CASHAPP("cashapp"),

      @SerializedName("crypto")
      CRYPTO("crypto"),

      @SerializedName("custom")
      CUSTOM("custom"),

      @SerializedName("customer_balance")
      CUSTOMER_BALANCE("customer_balance"),

      @SerializedName("eps")
      EPS("eps"),

      @SerializedName("fpx")
      FPX("fpx"),

      @SerializedName("getflex")
      GETFLEX("getflex"),

      @SerializedName("gift_card")
      GIFT_CARD("gift_card"),

      @SerializedName("giropay")
      GIROPAY("giropay"),

      @SerializedName("gopay")
      GOPAY("gopay"),

      @SerializedName("grabpay")
      GRABPAY("grabpay"),

      @SerializedName("id_bank_transfer")
      ID_BANK_TRANSFER("id_bank_transfer"),

      @SerializedName("ideal")
      IDEAL("ideal"),

      @SerializedName("kakao_pay")
      KAKAO_PAY("kakao_pay"),

      @SerializedName("klarna")
      KLARNA("klarna"),

      @SerializedName("konbini")
      KONBINI("konbini"),

      @SerializedName("kr_card")
      KR_CARD("kr_card"),

      @SerializedName("link")
      LINK("link"),

      @SerializedName("mb_way")
      MB_WAY("mb_way"),

      @SerializedName("mobilepay")
      MOBILEPAY("mobilepay"),

      @SerializedName("multibanco")
      MULTIBANCO("multibanco"),

      @SerializedName("naver_pay")
      NAVER_PAY("naver_pay"),

      @SerializedName("nz_bank_account")
      NZ_BANK_ACCOUNT("nz_bank_account"),

      @SerializedName("oxxo")
      OXXO("oxxo"),

      @SerializedName("p24")
      P24("p24"),

      @SerializedName("pay_by_bank")
      PAY_BY_BANK("pay_by_bank"),

      @SerializedName("payco")
      PAYCO("payco"),

      @SerializedName("paynow")
      PAYNOW("paynow"),

      @SerializedName("paypal")
      PAYPAL("paypal"),

      @SerializedName("paypay")
      PAYPAY("paypay"),

      @SerializedName("payto")
      PAYTO("payto"),

      @SerializedName("pix")
      PIX("pix"),

      @SerializedName("promptpay")
      PROMPTPAY("promptpay"),

      @SerializedName("qris")
      QRIS("qris"),

      @SerializedName("rakuten_pay")
      RAKUTEN_PAY("rakuten_pay"),

      @SerializedName("rechnung")
      RECHNUNG("rechnung"),

      @SerializedName("revolut_pay")
      REVOLUT_PAY("revolut_pay"),

      @SerializedName("samsung_pay")
      SAMSUNG_PAY("samsung_pay"),

      @SerializedName("satispay")
      SATISPAY("satispay"),

      @SerializedName("scalapay")
      SCALAPAY("scalapay"),

      @SerializedName("sepa_debit")
      SEPA_DEBIT("sepa_debit"),

      @SerializedName("sequra")
      SEQURA("sequra"),

      @SerializedName("sezzle")
      SEZZLE("sezzle"),

      @SerializedName("shopeepay")
      SHOPEEPAY("shopeepay"),

      @SerializedName("sofort")
      SOFORT("sofort"),

      @SerializedName("stripe_balance")
      STRIPE_BALANCE("stripe_balance"),

      @SerializedName("sunbit")
      SUNBIT("sunbit"),

      @SerializedName("swish")
      SWISH("swish"),

      @SerializedName("tamara")
      TAMARA("tamara"),

      @SerializedName("toss_pay")
      TOSS_PAY("toss_pay"),

      @SerializedName("twint")
      TWINT("twint"),

      @SerializedName("upi")
      UPI("upi"),

      @SerializedName("us_bank_account")
      US_BANK_ACCOUNT("us_bank_account"),

      @SerializedName("vipps")
      VIPPS("vipps"),

      @SerializedName("wechat_pay")
      WECHAT_PAY("wechat_pay"),

      @SerializedName("wero")
      WERO("wero"),

      @SerializedName("zip")
      ZIP("zip");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Gift card refund options. */
    @SerializedName("gift_card")
    Object giftCard;

    private PaymentMethodOptions(Map<String, Object> extraParams, Object giftCard) {
      this.extraParams = extraParams;
      this.giftCard = giftCard;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object giftCard;

      /** Finalize and obtain parameter instance from this builder. */
      public RefundCreateParams.PaymentMethodOptions build() {
        return new RefundCreateParams.PaymentMethodOptions(this.extraParams, this.giftCard);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RefundCreateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link RefundCreateParams.PaymentMethodOptions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Gift card refund options. */
      public Builder setGiftCard(RefundCreateParams.PaymentMethodOptions.GiftCard giftCard) {
        this.giftCard = giftCard;
        return this;
      }

      /** Gift card refund options. */
      public Builder setGiftCard(EmptyParam giftCard) {
        this.giftCard = giftCard;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GiftCard {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The type of gift card operation to perform for the refund. */
      @SerializedName("operation_type")
      OperationType operationType;

      private GiftCard(Map<String, Object> extraParams, OperationType operationType) {
        this.extraParams = extraParams;
        this.operationType = operationType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private OperationType operationType;

        /** Finalize and obtain parameter instance from this builder. */
        public RefundCreateParams.PaymentMethodOptions.GiftCard build() {
          return new RefundCreateParams.PaymentMethodOptions.GiftCard(
              this.extraParams, this.operationType);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RefundCreateParams.PaymentMethodOptions.GiftCard#extraParams} for the
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
         * map. See {@link RefundCreateParams.PaymentMethodOptions.GiftCard#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The type of gift card operation to perform for the refund. */
        public Builder setOperationType(
            RefundCreateParams.PaymentMethodOptions.GiftCard.OperationType operationType) {
          this.operationType = operationType;
          return this;
        }
      }

      public enum OperationType implements ApiRequestParams.EnumParam {
        @SerializedName("activation")
        ACTIVATION("activation"),

        @SerializedName("reload")
        RELOAD("reload");

        @Getter(onMethod_ = {@Override})
        private final String value;

        OperationType(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum Origin implements ApiRequestParams.EnumParam {
    @SerializedName("customer_balance")
    CUSTOMER_BALANCE("customer_balance");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Origin(String value) {
      this.value = value;
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("requested_by_customer")
    REQUESTED_BY_CUSTOMER("requested_by_customer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
