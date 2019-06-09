package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
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
   * Used in payment flows that collect payment details and charge later, when the customer is not
   * available to complete additional required steps for the payment. Setting this parameter
   * indicates that this payment attempt is happening while the customer is not in your checkout
   * flow. Use `recurring` for payments made on a recurring basis (for example, subscriptions) and
   * `one_off` for all other off-session payments.
   */
  @SerializedName("off_session")
  PaymentIntentConfirmParams.OffSession offSession;

  /**
   * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach
   * to this PaymentIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

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
      PaymentIntentConfirmParams.OffSession offSession,
      String paymentMethod,
      String receiptEmail,
      String returnUrl,
      Boolean savePaymentMethod,
      Object shipping,
      String source) {

    this.expand = expand;
    this.extraParams = extraParams;
    this.offSession = offSession;
    this.paymentMethod = paymentMethod;
    this.receiptEmail = receiptEmail;
    this.returnUrl = returnUrl;
    this.savePaymentMethod = savePaymentMethod;
    this.shipping = shipping;
    this.source = source;
  }

  public static PaymentIntentConfirmParams.Builder builder() {
    return new PaymentIntentConfirmParams.Builder();
  }

  public static class Builder {
    private List<String> expand;
    private Map<String, Object> extraParams;
    private PaymentIntentConfirmParams.OffSession offSession;
    private String paymentMethod;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private Object shipping;
    private String source;

    public PaymentIntentConfirmParams build() {
      return new PaymentIntentConfirmParams(
          this.expand,
          this.extraParams,
          this.offSession,
          this.paymentMethod,
          this.receiptEmail,
          this.returnUrl,
          this.savePaymentMethod,
          this.shipping,
          this.source);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentConfirmParams#expand} for the field documentation.
     */
    public PaymentIntentConfirmParams.Builder addExpand(String element) {
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
    public PaymentIntentConfirmParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentConfirmParams#extraParams} for the field documentation.
     */
    public PaymentIntentConfirmParams.Builder putExtraParam(String key, Object value) {

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
    public PaymentIntentConfirmParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Used in payment flows that collect payment details and charge later, when the customer is not
     * available to complete additional required steps for the payment. Setting this parameter
     * indicates that this payment attempt is happening while the customer is not in your checkout
     * flow. Use `recurring` for payments made on a recurring basis (for example, subscriptions) and
     * `one_off` for all other off-session payments.
     */
    public PaymentIntentConfirmParams.Builder setOffSession(
        PaymentIntentConfirmParams.OffSession offSession) {

      this.offSession = offSession;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to
     * attach to this PaymentIntent.
     */
    public PaymentIntentConfirmParams.Builder setPaymentMethod(String paymentMethod) {

      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public PaymentIntentConfirmParams.Builder setReceiptEmail(String receiptEmail) {

      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards and
     * other redirect-based payment methods.
     */
    public PaymentIntentConfirmParams.Builder setReturnUrl(String returnUrl) {

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
    public PaymentIntentConfirmParams.Builder setSavePaymentMethod(Boolean savePaymentMethod) {

      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public PaymentIntentConfirmParams.Builder setShipping(
        PaymentIntentConfirmParams.Shipping shipping) {

      this.shipping = shipping;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public PaymentIntentConfirmParams.Builder setShipping(EmptyParam shipping) {

      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Source, Card, and BankAccount objects.
     */
    public PaymentIntentConfirmParams.Builder setSource(String source) {
      this.source = source;
      return this;
    }
  }

  public static class Shipping {

    /** Shipping address. */
    @SerializedName("address")
    PaymentIntentConfirmParams.Shipping.Address address;

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
        PaymentIntentConfirmParams.Shipping.Address address,
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

    public static PaymentIntentConfirmParams.Shipping.Builder builder() {
      return new PaymentIntentConfirmParams.Shipping.Builder();
    }

    public static class Builder {
      private PaymentIntentConfirmParams.Shipping.Address address;
      private String carrier;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;
      private String trackingNumber;

      public PaymentIntentConfirmParams.Shipping build() {
        return new PaymentIntentConfirmParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public PaymentIntentConfirmParams.Shipping.Builder setAddress(
          PaymentIntentConfirmParams.Shipping.Address address) {

        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public PaymentIntentConfirmParams.Shipping.Builder setCarrier(String carrier) {

        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentConfirmParams.Shipping#extraParams} for the field documentation.
       */
      public PaymentIntentConfirmParams.Shipping.Builder putExtraParam(String key, Object value) {

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
      public PaymentIntentConfirmParams.Shipping.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public PaymentIntentConfirmParams.Shipping.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public PaymentIntentConfirmParams.Shipping.Builder setPhone(String phone) {

        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public PaymentIntentConfirmParams.Shipping.Builder setTrackingNumber(String trackingNumber) {

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

      public static PaymentIntentConfirmParams.Shipping.Address.Builder builder() {

        return new PaymentIntentConfirmParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public PaymentIntentConfirmParams.Shipping.Address build() {
          return new PaymentIntentConfirmParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentConfirmParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public PaymentIntentConfirmParams.Shipping.Address.Builder putExtraParam(
            String key, Object value) {

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
        public PaymentIntentConfirmParams.Shipping.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setPostalCode(
            String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public PaymentIntentConfirmParams.Shipping.Address.Builder setState(String state) {

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

    private OffSession(String value) {
      this.value = value;
    }
  }
}
