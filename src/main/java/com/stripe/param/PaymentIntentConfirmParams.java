package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PaymentIntentConfirmParams extends ApiRequestParams {
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
   * Set to `true` to indicate that the customer is not in your checkout flow during this payment
   * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
   * where you collect card details and [charge them
   * later](https://stripe.com/docs/payments/cards/charging-saved-cards).
   */
  @SerializedName("off_session")
  Object offSession;

  /**
   * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach
   * to this PaymentIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment-method-specific configuration for this PaymentIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  Object receiptEmail;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This parameter is only used for cards and other
   * redirect-based payment methods.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * If the PaymentIntent has a `payment_method` and a `customer` or if you're attaching a payment
   * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
   * the payment method to the customer. Defaults to `false`.
   *
   * <p>If the payment method is already saved to a customer, this does nothing. If this type of
   * payment method cannot be saved to a customer, the request will error.
   */
  @SerializedName("save_payment_method")
  Boolean savePaymentMethod;

  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * <p>If present, the payment method used with this PaymentIntent can be
   * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
   * transaction completes.
   *
   * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
   * present in your checkout flow. Use `off_session` if your customer may or may not be in your
   * checkout flow.
   *
   * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
   * regional legislation and network rules. For example, if your customer is impacted by
   * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will ensure
   * that they are authenticated while processing this PaymentIntent. You will then be able to
   * collect [off-session
   * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
   * for this customer.
   *
   * <p>If `setup_future_usage` is already set and you are performing a request using a publishable
   * key, you may only update the value from `on_session` to `off_session`.
   */
  @SerializedName("setup_future_usage")
  EnumParam setupFutureUsage;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  Object shipping;

  /**
   * This is a legacy field that will be removed in the future. It is the ID of the Source object to
   * attach to this PaymentIntent. Please use the `payment_method` field instead, which also
   * supports Source, Card, and BankAccount objects.
   */
  @SerializedName("source")
  String source;

  private PaymentIntentConfirmParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Object offSession,
      String paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      Object receiptEmail,
      String returnUrl,
      Boolean savePaymentMethod,
      EnumParam setupFutureUsage,
      Object shipping,
      String source) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.offSession = offSession;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.receiptEmail = receiptEmail;
    this.returnUrl = returnUrl;
    this.savePaymentMethod = savePaymentMethod;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
    this.source = source;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object offSession;

    private String paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private Object receiptEmail;

    private String returnUrl;

    private Boolean savePaymentMethod;

    private EnumParam setupFutureUsage;

    private Object shipping;

    private String source;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentConfirmParams build() {
      return new PaymentIntentConfirmParams(
          this.expand,
          this.extraParams,
          this.offSession,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.receiptEmail,
          this.returnUrl,
          this.savePaymentMethod,
          this.setupFutureUsage,
          this.shipping,
          this.source);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentConfirmParams#expand} for the field documentation.
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
     * PaymentIntentConfirmParams#expand} for the field documentation.
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
     * PaymentIntentConfirmParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentConfirmParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Set to `true` to indicate that the customer is not in your checkout flow during this payment
     * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
     * where you collect card details and [charge them
     * later](https://stripe.com/docs/payments/cards/charging-saved-cards).
     */
    public Builder setOffSession(Boolean offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * Set to `true` to indicate that the customer is not in your checkout flow during this payment
     * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
     * where you collect card details and [charge them
     * later](https://stripe.com/docs/payments/cards/charging-saved-cards).
     */
    public Builder setOffSession(OffSession offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to
     * attach to this PaymentIntent.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Payment-method-specific configuration for this PaymentIntent. */
    public Builder setPaymentMethodOptions(PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public Builder setReceiptEmail(EmptyParam receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards and
     * other redirect-based payment methods.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you're attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * <p>If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     */
    public Builder setSavePaymentMethod(Boolean savePaymentMethod) {
      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If present, the payment method used with this PaymentIntent can be
     * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
     * transaction completes.
     *
     * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
     * present in your checkout flow. Use `off_session` if your customer may or may not be in your
     * checkout flow.
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     *
     * <p>If `setup_future_usage` is already set and you are performing a request using a
     * publishable key, you may only update the value from `on_session` to `off_session`.
     */
    public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If present, the payment method used with this PaymentIntent can be
     * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
     * transaction completes.
     *
     * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
     * present in your checkout flow. Use `off_session` if your customer may or may not be in your
     * checkout flow.
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     *
     * <p>If `setup_future_usage` is already set and you are performing a request using a
     * publishable key, you may only update the value from `on_session` to `off_session`.
     */
    public Builder setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(EmptyParam shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Source, Card, and BankAccount objects.
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }
  }

  public static class PaymentMethodOptions {
    /** Configuration for any card payments attempted on this PaymentIntent. */
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

    private PaymentMethodOptions(Card card, Map<String, Object> extraParams) {
      this.card = card;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodOptions build() {
        return new PaymentMethodOptions(this.card, this.extraParams);
      }

      /** Configuration for any card payments attempted on this PaymentIntent. */
      public Builder setCard(Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentConfirmParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link PaymentIntentConfirmParams.PaymentMethodOptions#extraParams} for the field
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

    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * When specified, this parameter indicates that a transaction will be marked as MOTO (Mail
       * Order Telephone Order) and thus out of scope for SCA. This parameter can only be provided
       * during confirmation.
       */
      @SerializedName("moto")
      Boolean moto;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and [other
       * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you wish
       * to request 3D Secure based on logic from your own fraud engine, provide this option.
       * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
       * Read our guide on [manually requesting 3D
       * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information on
       * how this configuration interacts with Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      private Card(
          Map<String, Object> extraParams, Boolean moto, RequestThreeDSecure requestThreeDSecure) {
        this.extraParams = extraParams;
        this.moto = moto;
        this.requestThreeDSecure = requestThreeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean moto;

        private RequestThreeDSecure requestThreeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public Card build() {
          return new Card(this.extraParams, this.moto, this.requestThreeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentConfirmParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link PaymentIntentConfirmParams.PaymentMethodOptions.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * When specified, this parameter indicates that a transaction will be marked as MOTO (Mail
         * Order Telephone Order) and thus out of scope for SCA. This parameter can only be provided
         * during confirmation.
         */
        public Builder setMoto(Boolean moto) {
          this.moto = moto;
          return this;
        }

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and [other
         * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you
         * wish to request 3D Secure based on logic from your own fraud engine, provide this option.
         * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
         * Read our guide on [manually requesting 3D
         * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information
         * on how this configuration interacts with Radar and our SCA Engine.
         */
        public Builder setRequestThreeDSecure(RequestThreeDSecure requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }
      }

      public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
        @SerializedName("any")
        ANY("any"),

        @SerializedName("automatic")
        AUTOMATIC("automatic");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestThreeDSecure(String value) {
          this.value = value;
        }
      }
    }
  }

  public static class Shipping {
    /** Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    String carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    String phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    String trackingNumber;

    private Shipping(
        Address address,
        String carrier,
        Map<String, Object> extraParams,
        String name,
        String phone,
        String trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private String carrier;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      private String trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentConfirmParams.Shipping#extraParams} for the field documentation.
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
       * See {@link PaymentIntentConfirmParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    public static class Address {
      @SerializedName("city")
      String city;

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

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentConfirmParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link PaymentIntentConfirmParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  public enum OffSession implements ApiRequestParams.EnumParam {
    @SerializedName("one_off")
    ONE_OFF("one_off"),

    @SerializedName("recurring")
    RECURRING("recurring");

    @Getter(onMethod_ = {@Override})
    private final String value;

    OffSession(String value) {
      this.value = value;
    }
  }

  public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
    @SerializedName("off_session")
    OFF_SESSION("off_session"),

    @SerializedName("on_session")
    ON_SESSION("on_session");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SetupFutureUsage(String value) {
      this.value = value;
    }
  }
}
