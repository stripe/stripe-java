package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PaymentMethodCreateParams extends ApiRequestParams {

  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  PaymentMethodCreateParams.BillingDetails billingDetails;

  /**
   * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
   * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex Express
   * Checkout, or legacy Checkout) into the card hash with format `card: {token: "tok_visa"}`. When
   * creating with a card number, you must meet the requirements for [PCI
   * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly recommend
   * using Stripe.js instead of interacting with this API directly.
   */
  @SerializedName("card")
  Object card;

  /** The `Customer` to whom the original PaymentMethod is attached. */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The PaymentMethod to share. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   * Required unless `payment_method` is specified (see the [Shared
   * PaymentMethods](https://stripe.com/docs/payments/payment-methods/connect#shared-paymentmethods)
   * guide)
   */
  @SerializedName("type")
  PaymentMethodCreateParams.Type type;

  private PaymentMethodCreateParams(
      PaymentMethodCreateParams.BillingDetails billingDetails,
      Object card,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String paymentMethod,
      PaymentMethodCreateParams.Type type) {

    this.billingDetails = billingDetails;
    this.card = card;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.type = type;
  }

  public static PaymentMethodCreateParams.Builder builder() {
    return new PaymentMethodCreateParams.Builder();
  }

  public static class Builder {
    private PaymentMethodCreateParams.BillingDetails billingDetails;
    private Object card;
    private String customer;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private String paymentMethod;
    private PaymentMethodCreateParams.Type type;

    public PaymentMethodCreateParams build() {
      return new PaymentMethodCreateParams(
          this.billingDetails,
          this.card,
          this.customer,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentMethod,
          this.type);
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public PaymentMethodCreateParams.Builder setBillingDetails(
        PaymentMethodCreateParams.BillingDetails billingDetails) {

      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
     * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex
     * Express Checkout, or legacy Checkout) into the card hash with format `card: {token:
     * "tok_visa"}`. When creating with a card number, you must meet the requirements for [PCI
     * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly
     * recommend using Stripe.js instead of interacting with this API directly.
     */
    public PaymentMethodCreateParams.Builder setCard(PaymentMethodCreateParams.CardDetails card) {

      this.card = card;
      return this;
    }

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
     * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex
     * Express Checkout, or legacy Checkout) into the card hash with format `card: {token:
     * "tok_visa"}`. When creating with a card number, you must meet the requirements for [PCI
     * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly
     * recommend using Stripe.js instead of interacting with this API directly.
     */
    public PaymentMethodCreateParams.Builder setCard(PaymentMethodCreateParams.Token card) {

      this.card = card;
      return this;
    }

    /** The `Customer` to whom the original PaymentMethod is attached. */
    public PaymentMethodCreateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public PaymentMethodCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The PaymentMethod to share. */
    public PaymentMethodCreateParams.Builder setPaymentMethod(String paymentMethod) {

      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the PaymentMethod
     * type. Required unless `payment_method` is specified (see the [Shared
     * PaymentMethods](https://stripe.com/docs/payments/payment-methods/connect#shared-paymentmethods)
     * guide)
     */
    public PaymentMethodCreateParams.Builder setType(PaymentMethodCreateParams.Type type) {

      this.type = type;
      return this;
    }
  }

  public static class BillingDetails {

    /** Billing address. */
    @SerializedName("address")
    PaymentMethodCreateParams.BillingDetails.Address address;

    /** Email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
        PaymentMethodCreateParams.BillingDetails.Address address,
        String email,
        Map<String, Object> extraParams,
        String name,
        String phone) {

      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static PaymentMethodCreateParams.BillingDetails.Builder builder() {

      return new PaymentMethodCreateParams.BillingDetails.Builder();
    }

    public static class Builder {
      private PaymentMethodCreateParams.BillingDetails.Address address;
      private String email;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;

      public PaymentMethodCreateParams.BillingDetails build() {
        return new PaymentMethodCreateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public PaymentMethodCreateParams.BillingDetails.Builder setAddress(
          PaymentMethodCreateParams.BillingDetails.Address address) {

        this.address = address;
        return this;
      }

      /** Email address. */
      public PaymentMethodCreateParams.BillingDetails.Builder setEmail(String email) {

        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BillingDetails#extraParams} for the field documentation.
       */
      public PaymentMethodCreateParams.BillingDetails.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.BillingDetails#extraParams} for the field
       * documentation.
       */
      public PaymentMethodCreateParams.BillingDetails.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Full name. */
      public PaymentMethodCreateParams.BillingDetails.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** Billing phone number (including extension). */
      public PaymentMethodCreateParams.BillingDetails.Builder setPhone(String phone) {

        this.phone = phone;
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

      public static PaymentMethodCreateParams.BillingDetails.Address.Builder builder() {

        return new PaymentMethodCreateParams.BillingDetails.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public PaymentMethodCreateParams.BillingDetails.Address build() {

          return new PaymentMethodCreateParams.BillingDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public PaymentMethodCreateParams.BillingDetails.Address.Builder putExtraParam(
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
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public PaymentMethodCreateParams.BillingDetails.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setPostalCode(
            String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public PaymentMethodCreateParams.BillingDetails.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }

  public static class CardDetails {

    /** The card's CVC. It is highly recommended to always include this value. */
    @SerializedName("cvc")
    String cvc;

    /** Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private CardDetails(
        String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {

      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
    }

    public static PaymentMethodCreateParams.CardDetails.Builder builder() {
      return new PaymentMethodCreateParams.CardDetails.Builder();
    }

    public static class Builder {
      private String cvc;
      private Long expMonth;
      private Long expYear;
      private Map<String, Object> extraParams;
      private String number;

      public PaymentMethodCreateParams.CardDetails build() {
        return new PaymentMethodCreateParams.CardDetails(
            this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
      }

      /** The card's CVC. It is highly recommended to always include this value. */
      public PaymentMethodCreateParams.CardDetails.Builder setCvc(String cvc) {

        this.cvc = cvc;
        return this;
      }

      /** Two-digit number representing the card's expiration month. */
      public PaymentMethodCreateParams.CardDetails.Builder setExpMonth(Long expMonth) {

        this.expMonth = expMonth;
        return this;
      }

      /** Four-digit number representing the card's expiration year. */
      public PaymentMethodCreateParams.CardDetails.Builder setExpYear(Long expYear) {

        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public PaymentMethodCreateParams.CardDetails.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public PaymentMethodCreateParams.CardDetails.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card number, as a string without any separators. */
      public PaymentMethodCreateParams.CardDetails.Builder setNumber(String number) {

        this.number = number;
        return this;
      }
    }
  }

  public static class Token {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("token")
    String token;

    private Token(Map<String, Object> extraParams, String token) {
      this.extraParams = extraParams;
      this.token = token;
    }

    public static PaymentMethodCreateParams.Token.Builder builder() {
      return new PaymentMethodCreateParams.Token.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private String token;

      public PaymentMethodCreateParams.Token build() {
        return new PaymentMethodCreateParams.Token(this.extraParams, this.token);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public PaymentMethodCreateParams.Token.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public PaymentMethodCreateParams.Token.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public PaymentMethodCreateParams.Token.Builder setToken(String token) {

        this.token = token;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card"),
    @SerializedName("card_present")
    CARD_PRESENT("card_present");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Type(String value) {
      this.value = value;
    }
  }
}
