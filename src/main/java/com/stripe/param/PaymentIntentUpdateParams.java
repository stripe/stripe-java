package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentIntentUpdateParams extends ApiRequestParams {

  /** Amount intended to be collected by this PaymentIntent. */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
   * [use case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
   * details.
   */
  @SerializedName("application_fee_amount")
  Object applicationFeeAmount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** ID of the customer this PaymentIntent is for if one exists. */
  @SerializedName("customer")
  String customer;

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

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach
   * to this PaymentIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

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

  /**
   * Extra information about a PaymentIntent. This will appear on your customer's statement when
   * this PaymentIntent succeeds in creating a charge.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * A string that identifies the resulting payment as part of a group. `transfer_group` may only be
   * provided if it has not been set. See the PaymentIntents [use case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private PaymentIntentUpdateParams(
      Long amount,
      Object applicationFeeAmount,
      String currency,
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String paymentMethod,
      List<String> paymentMethodTypes,
      String receiptEmail,
      Boolean savePaymentMethod,
      Object shipping,
      String source,
      String statementDescriptor,
      String transferGroup) {

    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.savePaymentMethod = savePaymentMethod;
    this.shipping = shipping;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.transferGroup = transferGroup;
  }

  public static PaymentIntentUpdateParams.Builder builder() {
    return new PaymentIntentUpdateParams.Builder();
  }

  public static class Builder {
    private Long amount;
    private Object applicationFeeAmount;
    private String currency;
    private String customer;
    private String description;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private String paymentMethod;
    private List<String> paymentMethodTypes;
    private String receiptEmail;
    private Boolean savePaymentMethod;
    private Object shipping;
    private String source;
    private String statementDescriptor;
    private String transferGroup;

    public PaymentIntentUpdateParams build() {
      return new PaymentIntentUpdateParams(
          this.amount,
          this.applicationFeeAmount,
          this.currency,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodTypes,
          this.receiptEmail,
          this.savePaymentMethod,
          this.shipping,
          this.source,
          this.statementDescriptor,
          this.transferGroup);
    }

    /** Amount intended to be collected by this PaymentIntent. */
    public PaymentIntentUpdateParams.Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
     * [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
     * details.
     */
    public PaymentIntentUpdateParams.Builder setApplicationFeeAmount(Long applicationFeeAmount) {

      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
     * [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
     * details.
     */
    public PaymentIntentUpdateParams.Builder setApplicationFeeAmount(
        EmptyParam applicationFeeAmount) {

      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public PaymentIntentUpdateParams.Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** ID of the customer this PaymentIntent is for if one exists. */
    public PaymentIntentUpdateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public PaymentIntentUpdateParams.Builder setDescription(String description) {

      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentUpdateParams#expand} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentUpdateParams#expand} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentUpdateParams#extraParams} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentUpdateParams#extraParams} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentUpdateParams#metadata} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentUpdateParams#metadata} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to
     * attach to this PaymentIntent.
     */
    public PaymentIntentUpdateParams.Builder setPaymentMethod(String paymentMethod) {

      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentUpdateParams#paymentMethodTypes} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder addPaymentMethodType(String element) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentIntentUpdateParams#paymentMethodTypes} for the field documentation.
     */
    public PaymentIntentUpdateParams.Builder addAllPaymentMethodType(List<String> list) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(list);
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public PaymentIntentUpdateParams.Builder setReceiptEmail(String receiptEmail) {

      this.receiptEmail = receiptEmail;
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
    public PaymentIntentUpdateParams.Builder setSavePaymentMethod(Boolean savePaymentMethod) {

      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public PaymentIntentUpdateParams.Builder setShipping(
        PaymentIntentUpdateParams.Shipping shipping) {

      this.shipping = shipping;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public PaymentIntentUpdateParams.Builder setShipping(EmptyParam shipping) {

      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Source, Card, and BankAccount objects.
     */
    public PaymentIntentUpdateParams.Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * Extra information about a PaymentIntent. This will appear on your customer's statement when
     * this PaymentIntent succeeds in creating a charge.
     */
    public PaymentIntentUpdateParams.Builder setStatementDescriptor(String statementDescriptor) {

      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. `transfer_group` may only
     * be provided if it has not been set. See the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
     * details.
     */
    public PaymentIntentUpdateParams.Builder setTransferGroup(String transferGroup) {

      this.transferGroup = transferGroup;
      return this;
    }
  }

  public static class Shipping {

    /** Shipping address. */
    @SerializedName("address")
    PaymentIntentUpdateParams.Shipping.Address address;

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
        PaymentIntentUpdateParams.Shipping.Address address,
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

    public static PaymentIntentUpdateParams.Shipping.Builder builder() {
      return new PaymentIntentUpdateParams.Shipping.Builder();
    }

    public static class Builder {
      private PaymentIntentUpdateParams.Shipping.Address address;
      private String carrier;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;
      private String trackingNumber;

      public PaymentIntentUpdateParams.Shipping build() {
        return new PaymentIntentUpdateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public PaymentIntentUpdateParams.Shipping.Builder setAddress(
          PaymentIntentUpdateParams.Shipping.Address address) {

        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public PaymentIntentUpdateParams.Shipping.Builder setCarrier(String carrier) {

        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public PaymentIntentUpdateParams.Shipping.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public PaymentIntentUpdateParams.Shipping.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public PaymentIntentUpdateParams.Shipping.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public PaymentIntentUpdateParams.Shipping.Builder setPhone(String phone) {

        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public PaymentIntentUpdateParams.Shipping.Builder setTrackingNumber(String trackingNumber) {

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

      public static PaymentIntentUpdateParams.Shipping.Address.Builder builder() {

        return new PaymentIntentUpdateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public PaymentIntentUpdateParams.Shipping.Address build() {
          return new PaymentIntentUpdateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public PaymentIntentUpdateParams.Shipping.Address.Builder putExtraParam(
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
         * map. See {@link PaymentIntentUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public PaymentIntentUpdateParams.Shipping.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public PaymentIntentUpdateParams.Shipping.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }
}
