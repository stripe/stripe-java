package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PaymentIntentCreateParams extends ApiRequestParams {

  /**
   * A positive integer representing how much to charge in the [smallest currency
   * unit](https://stripe.com/docs/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
   * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in
   * charge
   * currency](https://support.stripe.com/questions/what-is-the-minimum-amount-i-can-charge-with-stripe).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) that will be applied to the payment and transferred
   * to the application owner's Stripe account. For more information, see the PaymentIntents [use
   * case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * One of `automatic` (default) or `manual`.
   *
   * <p>When the capture method is `automatic`, Stripe automatically captures funds when the
   * customer authorizes the payment.
   *
   * <p>Change `capture_method` to manual if you wish to [separate authorization and
   * capture](https://stripe.com/docs/payments/payment-intents/creating-payment-intents#separate-authorization-and-capture)
   * for payment methods that support this.
   */
  @SerializedName("capture_method")
  PaymentIntentCreateParams.CaptureMethod captureMethod;

  /**
   * Set to `true` to attempt to confirm this PaymentIntent immediately. This parameter defaults to
   * `false`. If the payment method attached is a card, a return_url may be provided in case
   * additional authentication is required.
   */
  @SerializedName("confirm")
  Boolean confirm;

  /**
   * One of `automatic` (default) or `manual`.
   *
   * <p>When the confirmation method is `automatic`, a PaymentIntent can be confirmed using a
   * publishable key. After `next_action`s are handled, no additional confirmation is required to
   * complete the payment.
   *
   * <p>When the confirmation method is `manual`, all payment attempts must be made using a secret
   * key. The PaymentIntent returns to the `requires_confirmation` state after handling
   * `next_action`s, and requires your server to initiate each payment attempt with an explicit
   * confirmation.
   *
   * <p>Learn more about the different [confirmation
   * flows](https://stripe.com/docs/payments/payment-intents#one-time-payments).
   */
  @SerializedName("confirmation_method")
  PaymentIntentCreateParams.ConfirmationMethod confirmationMethod;

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
   * Used in payment flows that collect payment details and charge later, when the customer is not
   * available to complete additional required steps for the payment. Setting this parameter
   * indicates that this payment attempt is happening while the customer is not in your checkout
   * flow. Use `recurring` for payments made on a recurring basis (for example, subscriptions) and
   * `one_off` for all other off-session payments.
   */
  @SerializedName("off_session")
  PaymentIntentCreateParams.OffSession offSession;

  /**
   * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
   * [use case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach
   * to this PaymentIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. If this
   * is not provided, defaults to ["card"].
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
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
  PaymentIntentCreateParams.Shipping shipping;

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
   * The parameters used to automatically create a Transfer when the payment succeeds. For more
   * information, see the PaymentIntents [use case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
   */
  @SerializedName("transfer_data")
  PaymentIntentCreateParams.TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. See the PaymentIntents [use
   * case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private PaymentIntentCreateParams(
      Long amount,
      Long applicationFeeAmount,
      PaymentIntentCreateParams.CaptureMethod captureMethod,
      Boolean confirm,
      PaymentIntentCreateParams.ConfirmationMethod confirmationMethod,
      String currency,
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      PaymentIntentCreateParams.OffSession offSession,
      String onBehalfOf,
      String paymentMethod,
      List<String> paymentMethodTypes,
      String receiptEmail,
      String returnUrl,
      Boolean savePaymentMethod,
      PaymentIntentCreateParams.Shipping shipping,
      String source,
      String statementDescriptor,
      PaymentIntentCreateParams.TransferData transferData,
      String transferGroup) {

    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.captureMethod = captureMethod;
    this.confirm = confirm;
    this.confirmationMethod = confirmationMethod;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.offSession = offSession;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.returnUrl = returnUrl;
    this.savePaymentMethod = savePaymentMethod;
    this.shipping = shipping;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.transferData = transferData;
    this.transferGroup = transferGroup;
  }

  public static PaymentIntentCreateParams.Builder builder() {
    return new PaymentIntentCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;
    private Long applicationFeeAmount;
    private PaymentIntentCreateParams.CaptureMethod captureMethod;
    private Boolean confirm;
    private PaymentIntentCreateParams.ConfirmationMethod confirmationMethod;
    private String currency;
    private String customer;
    private String description;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private PaymentIntentCreateParams.OffSession offSession;
    private String onBehalfOf;
    private String paymentMethod;
    private List<String> paymentMethodTypes;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private PaymentIntentCreateParams.Shipping shipping;
    private String source;
    private String statementDescriptor;
    private PaymentIntentCreateParams.TransferData transferData;
    private String transferGroup;

    public PaymentIntentCreateParams build() {
      return new PaymentIntentCreateParams(
          this.amount,
          this.applicationFeeAmount,
          this.captureMethod,
          this.confirm,
          this.confirmationMethod,
          this.currency,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.offSession,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodTypes,
          this.receiptEmail,
          this.returnUrl,
          this.savePaymentMethod,
          this.shipping,
          this.source,
          this.statementDescriptor,
          this.transferData,
          this.transferGroup);
    }

    /**
     * A positive integer representing how much to charge in the [smallest currency
     * unit](https://stripe.com/docs/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or
     * 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent
     * in charge
     * currency](https://support.stripe.com/questions/what-is-the-minimum-amount-i-can-charge-with-stripe).
     */
    public PaymentIntentCreateParams.Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be applied to the payment and
     * transferred to the application owner's Stripe account. For more information, see the
     * PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    public PaymentIntentCreateParams.Builder setApplicationFeeAmount(Long applicationFeeAmount) {

      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * One of `automatic` (default) or `manual`.
     *
     * <p>When the capture method is `automatic`, Stripe automatically captures funds when the
     * customer authorizes the payment.
     *
     * <p>Change `capture_method` to manual if you wish to [separate authorization and
     * capture](https://stripe.com/docs/payments/payment-intents/creating-payment-intents#separate-authorization-and-capture)
     * for payment methods that support this.
     */
    public PaymentIntentCreateParams.Builder setCaptureMethod(
        PaymentIntentCreateParams.CaptureMethod captureMethod) {

      this.captureMethod = captureMethod;
      return this;
    }

    /**
     * Set to `true` to attempt to confirm this PaymentIntent immediately. This parameter defaults
     * to `false`. If the payment method attached is a card, a return_url may be provided in case
     * additional authentication is required.
     */
    public PaymentIntentCreateParams.Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    /**
     * One of `automatic` (default) or `manual`.
     *
     * <p>When the confirmation method is `automatic`, a PaymentIntent can be confirmed using a
     * publishable key. After `next_action`s are handled, no additional confirmation is required to
     * complete the payment.
     *
     * <p>When the confirmation method is `manual`, all payment attempts must be made using a secret
     * key. The PaymentIntent returns to the `requires_confirmation` state after handling
     * `next_action`s, and requires your server to initiate each payment attempt with an explicit
     * confirmation.
     *
     * <p>Learn more about the different [confirmation
     * flows](https://stripe.com/docs/payments/payment-intents#one-time-payments).
     */
    public PaymentIntentCreateParams.Builder setConfirmationMethod(
        PaymentIntentCreateParams.ConfirmationMethod confirmationMethod) {

      this.confirmationMethod = confirmationMethod;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public PaymentIntentCreateParams.Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** ID of the customer this PaymentIntent is for if one exists. */
    public PaymentIntentCreateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public PaymentIntentCreateParams.Builder setDescription(String description) {

      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCreateParams#expand} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCreateParams#expand} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCreateParams#extraParams} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentCreateParams#extraParams} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCreateParams#metadata} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentCreateParams#metadata} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Used in payment flows that collect payment details and charge later, when the customer is not
     * available to complete additional required steps for the payment. Setting this parameter
     * indicates that this payment attempt is happening while the customer is not in your checkout
     * flow. Use `recurring` for payments made on a recurring basis (for example, subscriptions) and
     * `one_off` for all other off-session payments.
     */
    public PaymentIntentCreateParams.Builder setOffSession(
        PaymentIntentCreateParams.OffSession offSession) {

      this.offSession = offSession;
      return this;
    }

    /**
     * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
     * [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    public PaymentIntentCreateParams.Builder setOnBehalfOf(String onBehalfOf) {

      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to
     * attach to this PaymentIntent.
     */
    public PaymentIntentCreateParams.Builder setPaymentMethod(String paymentMethod) {

      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCreateParams#paymentMethodTypes} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder addPaymentMethodType(String element) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentIntentCreateParams#paymentMethodTypes} for the field documentation.
     */
    public PaymentIntentCreateParams.Builder addAllPaymentMethodType(List<String> list) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(list);
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public PaymentIntentCreateParams.Builder setReceiptEmail(String receiptEmail) {

      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This param can only be used if
     * `confirm=true`.
     */
    public PaymentIntentCreateParams.Builder setReturnUrl(String returnUrl) {

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
    public PaymentIntentCreateParams.Builder setSavePaymentMethod(Boolean savePaymentMethod) {

      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public PaymentIntentCreateParams.Builder setShipping(
        PaymentIntentCreateParams.Shipping shipping) {

      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Source, Card, and BankAccount objects.
     */
    public PaymentIntentCreateParams.Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * Extra information about a PaymentIntent. This will appear on your customer's statement when
     * this PaymentIntent succeeds in creating a charge.
     */
    public PaymentIntentCreateParams.Builder setStatementDescriptor(String statementDescriptor) {

      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    public PaymentIntentCreateParams.Builder setTransferData(
        PaymentIntentCreateParams.TransferData transferData) {

      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. See the PaymentIntents
     * [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts) for
     * details.
     */
    public PaymentIntentCreateParams.Builder setTransferGroup(String transferGroup) {

      this.transferGroup = transferGroup;
      return this;
    }
  }

  public static class Shipping {

    /** Shipping address. */
    @SerializedName("address")
    PaymentIntentCreateParams.Shipping.Address address;

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
        PaymentIntentCreateParams.Shipping.Address address,
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

    public static PaymentIntentCreateParams.Shipping.Builder builder() {
      return new PaymentIntentCreateParams.Shipping.Builder();
    }

    public static class Builder {
      private PaymentIntentCreateParams.Shipping.Address address;
      private String carrier;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;
      private String trackingNumber;

      public PaymentIntentCreateParams.Shipping build() {
        return new PaymentIntentCreateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public PaymentIntentCreateParams.Shipping.Builder setAddress(
          PaymentIntentCreateParams.Shipping.Address address) {

        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public PaymentIntentCreateParams.Shipping.Builder setCarrier(String carrier) {

        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.Shipping#extraParams} for the field documentation.
       */
      public PaymentIntentCreateParams.Shipping.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentCreateParams.Shipping#extraParams} for the field documentation.
       */
      public PaymentIntentCreateParams.Shipping.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public PaymentIntentCreateParams.Shipping.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public PaymentIntentCreateParams.Shipping.Builder setPhone(String phone) {

        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public PaymentIntentCreateParams.Shipping.Builder setTrackingNumber(String trackingNumber) {

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

      public static PaymentIntentCreateParams.Shipping.Address.Builder builder() {

        return new PaymentIntentCreateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public PaymentIntentCreateParams.Shipping.Address build() {
          return new PaymentIntentCreateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public PaymentIntentCreateParams.Shipping.Address.Builder putExtraParam(
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
         * map. See {@link PaymentIntentCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public PaymentIntentCreateParams.Shipping.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public PaymentIntentCreateParams.Shipping.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }

  public static class TransferData {

    /**
     * If specified, successful charges will be attributed to the destination account for tax
     * reporting, and the funds from charges will be transferred to the destination account. The ID
     * of the resulting transfer will be returned on the successful charge's `transfer` field.
     */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(String destination, Map<String, Object> extraParams) {

      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static PaymentIntentCreateParams.TransferData.Builder builder() {
      return new PaymentIntentCreateParams.TransferData.Builder();
    }

    public static class Builder {
      private String destination;
      private Map<String, Object> extraParams;

      public PaymentIntentCreateParams.TransferData build() {
        return new PaymentIntentCreateParams.TransferData(this.destination, this.extraParams);
      }

      /**
       * If specified, successful charges will be attributed to the destination account for tax
       * reporting, and the funds from charges will be transferred to the destination account. The
       * ID of the resulting transfer will be returned on the successful charge's `transfer` field.
       */
      public PaymentIntentCreateParams.TransferData.Builder setDestination(String destination) {

        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.TransferData#extraParams} for the field documentation.
       */
      public PaymentIntentCreateParams.TransferData.Builder putExtraParam(
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
       * See {@link PaymentIntentCreateParams.TransferData#extraParams} for the field documentation.
       */
      public PaymentIntentCreateParams.TransferData.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum CaptureMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),
    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private CaptureMethod(String value) {
      this.value = value;
    }
  }

  public enum ConfirmationMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),
    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private ConfirmationMethod(String value) {
      this.value = value;
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
