package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class SessionCreateParams extends ApiRequestParams {

  /**
   * Specify whether Checkout should collect the customer's billing address. If set to `required`,
   * Checkout will always collect the customer's billing address. If left blank or set to `auto`
   * Checkout will only collect the billing address when necessary.
   */
  @SerializedName("billing_address_collection")
  SessionCreateParams.BillingAddressCollection billingAddressCollection;

  /**
   * The URL the customer will be directed to if they decide to cancel payment and return to your
   * website.
   */
  @SerializedName("cancel_url")
  String cancelUrl;

  /**
   * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
   * similar, and can be used to reconcile the session with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

  /**
   * ID of an existing customer paying for this session, if one exists. May only be used with
   * line_items. Usage with subscription_data is not yet available. If blank, Checkout will create a
   * new customer object based on information provided during the session. The email stored on the
   * customer will be used to prefill the email field on the Checkout page. If the customer changes
   * their email on the Checkout page, the Customer object will be updated with the new email.
   */
  @SerializedName("customer")
  String customer;

  /**
   * If provided, this value will be used when the Customer object is created. If not provided,
   * customers will be asked to enter their email address. Use this parameter to prefill customer
   * data if you already have an email on file. To access information about the customer once a
   * session is complete, use the `customer` field.
   */
  @SerializedName("customer_email")
  String customerEmail;

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
   * A list of items the customer is purchasing. Use this parameter for one-time payments. To create
   * subscriptions, use `subscription_data.items`.
   */
  @SerializedName("line_items")
  List<SessionCreateParams.LineItem> lineItems;

  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's
   * locale is used. Supported values are `auto`, `da`, `de`, `en`, `es`, `fi`, `fr`, `it`, `ja`,
   * `nb`, `nl`, `pl`, `pt`, `sv`, or `zh`.
   */
  @SerializedName("locale")
  SessionCreateParams.Locale locale;

  /** A subset of parameters to be passed to PaymentIntent creation. */
  @SerializedName("payment_intent_data")
  SessionCreateParams.PaymentIntentData paymentIntentData;

  /**
   * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
   * The only supported value today is `card`.
   */
  @SerializedName("payment_method_types")
  List<SessionCreateParams.PaymentMethodType> paymentMethodTypes;

  /** A subset of parameters to be passed to subscription creation. */
  @SerializedName("subscription_data")
  SessionCreateParams.SubscriptionData subscriptionData;

  /**
   * The URL to which Stripe should send customers when payment is complete. If you’d like access to
   * the Checkout Session for the successful payment, read more about it in our guide on [fulfilling
   * your payments with webhooks](/docs/payments/checkout/fulfillment#webhooks).
   */
  @SerializedName("success_url")
  String successUrl;

  private SessionCreateParams(
      SessionCreateParams.BillingAddressCollection billingAddressCollection,
      String cancelUrl,
      String clientReferenceId,
      String customer,
      String customerEmail,
      List<String> expand,
      Map<String, Object> extraParams,
      List<SessionCreateParams.LineItem> lineItems,
      SessionCreateParams.Locale locale,
      SessionCreateParams.PaymentIntentData paymentIntentData,
      List<SessionCreateParams.PaymentMethodType> paymentMethodTypes,
      SessionCreateParams.SubscriptionData subscriptionData,
      String successUrl) {

    this.billingAddressCollection = billingAddressCollection;
    this.cancelUrl = cancelUrl;
    this.clientReferenceId = clientReferenceId;
    this.customer = customer;
    this.customerEmail = customerEmail;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItems = lineItems;
    this.locale = locale;
    this.paymentIntentData = paymentIntentData;
    this.paymentMethodTypes = paymentMethodTypes;
    this.subscriptionData = subscriptionData;
    this.successUrl = successUrl;
  }

  public static SessionCreateParams.Builder builder() {
    return new SessionCreateParams.Builder();
  }

  public static class Builder {
    private SessionCreateParams.BillingAddressCollection billingAddressCollection;
    private String cancelUrl;
    private String clientReferenceId;
    private String customer;
    private String customerEmail;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private List<SessionCreateParams.LineItem> lineItems;
    private SessionCreateParams.Locale locale;
    private SessionCreateParams.PaymentIntentData paymentIntentData;
    private List<SessionCreateParams.PaymentMethodType> paymentMethodTypes;
    private SessionCreateParams.SubscriptionData subscriptionData;
    private String successUrl;

    public SessionCreateParams build() {
      return new SessionCreateParams(
          this.billingAddressCollection,
          this.cancelUrl,
          this.clientReferenceId,
          this.customer,
          this.customerEmail,
          this.expand,
          this.extraParams,
          this.lineItems,
          this.locale,
          this.paymentIntentData,
          this.paymentMethodTypes,
          this.subscriptionData,
          this.successUrl);
    }

    /**
     * Specify whether Checkout should collect the customer's billing address. If set to `required`,
     * Checkout will always collect the customer's billing address. If left blank or set to `auto`
     * Checkout will only collect the billing address when necessary.
     */
    public SessionCreateParams.Builder setBillingAddressCollection(
        SessionCreateParams.BillingAddressCollection billingAddressCollection) {

      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /**
     * The URL the customer will be directed to if they decide to cancel payment and return to your
     * website.
     */
    public SessionCreateParams.Builder setCancelUrl(String cancelUrl) {
      this.cancelUrl = cancelUrl;
      return this;
    }

    /**
     * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
     * similar, and can be used to reconcile the session with your internal systems.
     */
    public SessionCreateParams.Builder setClientReferenceId(String clientReferenceId) {

      this.clientReferenceId = clientReferenceId;
      return this;
    }

    /**
     * ID of an existing customer paying for this session, if one exists. May only be used with
     * line_items. Usage with subscription_data is not yet available. If blank, Checkout will create
     * a new customer object based on information provided during the session. The email stored on
     * the customer will be used to prefill the email field on the Checkout page. If the customer
     * changes their email on the Checkout page, the Customer object will be updated with the new
     * email.
     */
    public SessionCreateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * If provided, this value will be used when the Customer object is created. If not provided,
     * customers will be asked to enter their email address. Use this parameter to prefill customer
     * data if you already have an email on file. To access information about the customer once a
     * session is complete, use the `customer` field.
     */
    public SessionCreateParams.Builder setCustomerEmail(String customerEmail) {

      this.customerEmail = customerEmail;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
     */
    public SessionCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
     */
    public SessionCreateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SessionCreateParams#extraParams} for the field documentation.
     */
    public SessionCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SessionCreateParams#extraParams} for the field documentation.
     */
    public SessionCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#lineItems} for the field documentation.
     */
    public SessionCreateParams.Builder addLineItem(SessionCreateParams.LineItem element) {

      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#lineItems} for the field documentation.
     */
    public SessionCreateParams.Builder addAllLineItem(List<SessionCreateParams.LineItem> list) {

      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(list);
      return this;
    }

    /**
     * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the
     * browser's locale is used. Supported values are `auto`, `da`, `de`, `en`, `es`, `fi`, `fr`,
     * `it`, `ja`, `nb`, `nl`, `pl`, `pt`, `sv`, or `zh`.
     */
    public SessionCreateParams.Builder setLocale(SessionCreateParams.Locale locale) {

      this.locale = locale;
      return this;
    }

    /** A subset of parameters to be passed to PaymentIntent creation. */
    public SessionCreateParams.Builder setPaymentIntentData(
        SessionCreateParams.PaymentIntentData paymentIntentData) {

      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#paymentMethodTypes} for the field documentation.
     */
    public SessionCreateParams.Builder addPaymentMethodType(
        SessionCreateParams.PaymentMethodType element) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link SessionCreateParams#paymentMethodTypes} for the field documentation.
     */
    public SessionCreateParams.Builder addAllPaymentMethodType(
        List<SessionCreateParams.PaymentMethodType> list) {

      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(list);
      return this;
    }

    /** A subset of parameters to be passed to subscription creation. */
    public SessionCreateParams.Builder setSubscriptionData(
        SessionCreateParams.SubscriptionData subscriptionData) {

      this.subscriptionData = subscriptionData;
      return this;
    }

    /**
     * The URL to which Stripe should send customers when payment is complete. If you’d like access
     * to the Checkout Session for the successful payment, read more about it in our guide on
     * [fulfilling your payments with webhooks](/docs/payments/checkout/fulfillment#webhooks).
     */
    public SessionCreateParams.Builder setSuccessUrl(String successUrl) {
      this.successUrl = successUrl;
      return this;
    }
  }

  public static class LineItem {

    /** The amount to be collected per unit of the line item. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @SerializedName("currency")
    String currency;

    /** The description for the line item. */
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

    /** A list of images representing this line item. */
    @SerializedName("images")
    List<String> images;

    /** The name for the line item. */
    @SerializedName("name")
    String name;

    /** The quantity of the line item being purchased. */
    @SerializedName("quantity")
    Long quantity;

    private LineItem(
        Long amount,
        String currency,
        String description,
        Map<String, Object> extraParams,
        List<String> images,
        String name,
        Long quantity) {

      this.amount = amount;
      this.currency = currency;
      this.description = description;
      this.extraParams = extraParams;
      this.images = images;
      this.name = name;
      this.quantity = quantity;
    }

    public static SessionCreateParams.LineItem.Builder builder() {
      return new SessionCreateParams.LineItem.Builder();
    }

    public static class Builder {
      private Long amount;
      private String currency;
      private String description;
      private Map<String, Object> extraParams;
      private List<String> images;
      private String name;
      private Long quantity;

      public SessionCreateParams.LineItem build() {
        return new SessionCreateParams.LineItem(
            this.amount,
            this.currency,
            this.description,
            this.extraParams,
            this.images,
            this.name,
            this.quantity);
      }

      /** The amount to be collected per unit of the line item. */
      public SessionCreateParams.LineItem.Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
       * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
       */
      public SessionCreateParams.LineItem.Builder setCurrency(String currency) {

        this.currency = currency;
        return this;
      }

      /** The description for the line item. */
      public SessionCreateParams.LineItem.Builder setDescription(String description) {

        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.LineItem#extraParams} for the field documentation.
       */
      public SessionCreateParams.LineItem.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionCreateParams.LineItem#extraParams} for the field documentation.
       */
      public SessionCreateParams.LineItem.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `images` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.LineItem#images} for the field documentation.
       */
      public SessionCreateParams.LineItem.Builder addImage(String element) {

        if (this.images == null) {
          this.images = new ArrayList<>();
        }
        this.images.add(element);
        return this;
      }

      /**
       * Add all elements to `images` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.LineItem#images} for the field documentation.
       */
      public SessionCreateParams.LineItem.Builder addAllImage(List<String> list) {

        if (this.images == null) {
          this.images = new ArrayList<>();
        }
        this.images.addAll(list);
        return this;
      }

      /** The name for the line item. */
      public SessionCreateParams.LineItem.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The quantity of the line item being purchased. */
      public SessionCreateParams.LineItem.Builder setQuantity(Long quantity) {

        this.quantity = quantity;
        return this;
      }
    }
  }

  public static class PaymentIntentData {

    /**
     * The amount of the application fee (if any) that will be applied to the payment and
     * transferred to the application owner's Stripe account. To use an application fee, the request
     * must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
     * For more information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    @SerializedName("application_fee_amount")
    Long applicationFeeAmount;

    /** Capture method of this PaymentIntent, one of `automatic` or `manual`. */
    @SerializedName("capture_method")
    SessionCreateParams.PaymentIntentData.CaptureMethod captureMethod;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
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

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
     * [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    @SerializedName("on_behalf_of")
    String onBehalfOf;

    /** Email address that the receipt for the resulting payment will be sent to. */
    @SerializedName("receipt_email")
    String receiptEmail;

    /** Shipping information for this payment. */
    @SerializedName("shipping")
    SessionCreateParams.PaymentIntentData.Shipping shipping;

    /**
     * Extra information about the payment. This will appear on your customer's statement when this
     * payment succeeds in creating a charge.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    @SerializedName("transfer_data")
    SessionCreateParams.PaymentIntentData.TransferData transferData;

    private PaymentIntentData(
        Long applicationFeeAmount,
        SessionCreateParams.PaymentIntentData.CaptureMethod captureMethod,
        String description,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String onBehalfOf,
        String receiptEmail,
        SessionCreateParams.PaymentIntentData.Shipping shipping,
        String statementDescriptor,
        SessionCreateParams.PaymentIntentData.TransferData transferData) {

      this.applicationFeeAmount = applicationFeeAmount;
      this.captureMethod = captureMethod;
      this.description = description;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.onBehalfOf = onBehalfOf;
      this.receiptEmail = receiptEmail;
      this.shipping = shipping;
      this.statementDescriptor = statementDescriptor;
      this.transferData = transferData;
    }

    public static SessionCreateParams.PaymentIntentData.Builder builder() {
      return new SessionCreateParams.PaymentIntentData.Builder();
    }

    public static class Builder {
      private Long applicationFeeAmount;
      private SessionCreateParams.PaymentIntentData.CaptureMethod captureMethod;
      private String description;
      private Map<String, Object> extraParams;
      private Map<String, String> metadata;
      private String onBehalfOf;
      private String receiptEmail;
      private SessionCreateParams.PaymentIntentData.Shipping shipping;
      private String statementDescriptor;
      private SessionCreateParams.PaymentIntentData.TransferData transferData;

      public SessionCreateParams.PaymentIntentData build() {
        return new SessionCreateParams.PaymentIntentData(
            this.applicationFeeAmount,
            this.captureMethod,
            this.description,
            this.extraParams,
            this.metadata,
            this.onBehalfOf,
            this.receiptEmail,
            this.shipping,
            this.statementDescriptor,
            this.transferData);
      }

      /**
       * The amount of the application fee (if any) that will be applied to the payment and
       * transferred to the application owner's Stripe account. To use an application fee, the
       * request must be made on behalf of another account, using the `Stripe-Account` header or an
       * OAuth key. For more information, see the PaymentIntents [use case for connected
       * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
       */
      public SessionCreateParams.PaymentIntentData.Builder setApplicationFeeAmount(
          Long applicationFeeAmount) {

        this.applicationFeeAmount = applicationFeeAmount;
        return this;
      }

      /** Capture method of this PaymentIntent, one of `automatic` or `manual`. */
      public SessionCreateParams.PaymentIntentData.Builder setCaptureMethod(
          SessionCreateParams.PaymentIntentData.CaptureMethod captureMethod) {

        this.captureMethod = captureMethod;
        return this;
      }

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public SessionCreateParams.PaymentIntentData.Builder setDescription(String description) {

        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.PaymentIntentData#extraParams} for the field documentation.
       */
      public SessionCreateParams.PaymentIntentData.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionCreateParams.PaymentIntentData#extraParams} for the field documentation.
       */
      public SessionCreateParams.PaymentIntentData.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.PaymentIntentData#metadata} for the field documentation.
       */
      public SessionCreateParams.PaymentIntentData.Builder putMetadata(String key, String value) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionCreateParams.PaymentIntentData#metadata} for the field documentation.
       */
      public SessionCreateParams.PaymentIntentData.Builder putAllMetadata(Map<String, String> map) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * The Stripe account ID for which these funds are intended. For details, see the
       * PaymentIntents [use case for connected
       * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
       */
      public SessionCreateParams.PaymentIntentData.Builder setOnBehalfOf(String onBehalfOf) {

        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /** Email address that the receipt for the resulting payment will be sent to. */
      public SessionCreateParams.PaymentIntentData.Builder setReceiptEmail(String receiptEmail) {

        this.receiptEmail = receiptEmail;
        return this;
      }

      /** Shipping information for this payment. */
      public SessionCreateParams.PaymentIntentData.Builder setShipping(
          SessionCreateParams.PaymentIntentData.Shipping shipping) {

        this.shipping = shipping;
        return this;
      }

      /**
       * Extra information about the payment. This will appear on your customer's statement when
       * this payment succeeds in creating a charge.
       */
      public SessionCreateParams.PaymentIntentData.Builder setStatementDescriptor(
          String statementDescriptor) {

        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /**
       * The parameters used to automatically create a Transfer when the payment succeeds. For more
       * information, see the PaymentIntents [use case for connected
       * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
       */
      public SessionCreateParams.PaymentIntentData.Builder setTransferData(
          SessionCreateParams.PaymentIntentData.TransferData transferData) {

        this.transferData = transferData;
        return this;
      }
    }

    public static class Shipping {

      /** Shipping address. */
      @SerializedName("address")
      SessionCreateParams.PaymentIntentData.Shipping.Address address;

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      @SerializedName("carrier")
      String carrier;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
          SessionCreateParams.PaymentIntentData.Shipping.Address address,
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

      public static SessionCreateParams.PaymentIntentData.Shipping.Builder builder() {

        return new SessionCreateParams.PaymentIntentData.Shipping.Builder();
      }

      public static class Builder {
        private SessionCreateParams.PaymentIntentData.Shipping.Address address;
        private String carrier;
        private Map<String, Object> extraParams;
        private String name;
        private String phone;
        private String trackingNumber;

        public SessionCreateParams.PaymentIntentData.Shipping build() {
          return new SessionCreateParams.PaymentIntentData.Shipping(
              this.address,
              this.carrier,
              this.extraParams,
              this.name,
              this.phone,
              this.trackingNumber);
        }

        /** Shipping address. */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder setAddress(
            SessionCreateParams.PaymentIntentData.Shipping.Address address) {

          this.address = address;
          return this;
        }

        /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder setCarrier(String carrier) {

          this.carrier = carrier;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentIntentData.Shipping#extraParams} for the field
         * documentation.
         */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder putExtraParam(
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
         * map. See {@link SessionCreateParams.PaymentIntentData.Shipping#extraParams} for the field
         * documentation.
         */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Recipient name. */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder setName(String name) {

          this.name = name;
          return this;
        }

        /** Recipient phone (including extension). */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder setPhone(String phone) {

          this.phone = phone;
          return this;
        }

        /**
         * The tracking number for a physical product, obtained from the delivery service. If
         * multiple tracking numbers were generated for this purchase, please separate them with
         * commas.
         */
        public SessionCreateParams.PaymentIntentData.Shipping.Builder setTrackingNumber(
            String trackingNumber) {

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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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

        public static SessionCreateParams.PaymentIntentData.Shipping.Address.Builder builder() {

          return new SessionCreateParams.PaymentIntentData.Shipping.Address.Builder();
        }

        public static class Builder {
          private String city;
          private String country;
          private Map<String, Object> extraParams;
          private String line1;
          private String line2;
          private String postalCode;
          private String state;

          public SessionCreateParams.PaymentIntentData.Shipping.Address build() {

            return new SessionCreateParams.PaymentIntentData.Shipping.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setCity(
              String city) {

            this.city = city;
            return this;
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setCountry(
              String country) {

            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.PaymentIntentData.Shipping.Address#extraParams} for
           * the field documentation.
           */
          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder putExtraParam(
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
           * map. See {@link SessionCreateParams.PaymentIntentData.Shipping.Address#extraParams} for
           * the field documentation.
           */
          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder putAllExtraParam(
              Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setLine1(
              String line1) {

            this.line1 = line1;
            return this;
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setLine2(
              String line2) {

            this.line2 = line2;
            return this;
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setPostalCode(
              String postalCode) {

            this.postalCode = postalCode;
            return this;
          }

          public SessionCreateParams.PaymentIntentData.Shipping.Address.Builder setState(
              String state) {

            this.state = state;
            return this;
          }
        }
      }
    }

    public static class TransferData {

      /**
       * If specified, successful charges will be attributed to the destination account for tax
       * reporting, and the funds from charges will be transferred to the destination account. The
       * ID of the resulting transfer will be returned on the successful charge's `transfer` field.
       */
      @SerializedName("destination")
      String destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TransferData(String destination, Map<String, Object> extraParams) {

        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static SessionCreateParams.PaymentIntentData.TransferData.Builder builder() {

        return new SessionCreateParams.PaymentIntentData.TransferData.Builder();
      }

      public static class Builder {
        private String destination;
        private Map<String, Object> extraParams;

        public SessionCreateParams.PaymentIntentData.TransferData build() {

          return new SessionCreateParams.PaymentIntentData.TransferData(
              this.destination, this.extraParams);
        }

        /**
         * If specified, successful charges will be attributed to the destination account for tax
         * reporting, and the funds from charges will be transferred to the destination account. The
         * ID of the resulting transfer will be returned on the successful charge's `transfer`
         * field.
         */
        public SessionCreateParams.PaymentIntentData.TransferData.Builder setDestination(
            String destination) {

          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentIntentData.TransferData#extraParams} for the
         * field documentation.
         */
        public SessionCreateParams.PaymentIntentData.TransferData.Builder putExtraParam(
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
         * map. See {@link SessionCreateParams.PaymentIntentData.TransferData#extraParams} for the
         * field documentation.
         */
        public SessionCreateParams.PaymentIntentData.TransferData.Builder putAllExtraParam(
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
  }

  public static class SubscriptionData {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A list of items, each with an attached plan, that the customer is subscribing to. Use this
     * parameter for subscriptions. To create one-time payments, use `line_items`.
     */
    @SerializedName("items")
    List<SessionCreateParams.SubscriptionData.Item> items;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. Has to be at least 48h in the future.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    private SubscriptionData(
        Map<String, Object> extraParams,
        List<SessionCreateParams.SubscriptionData.Item> items,
        Map<String, String> metadata,
        Long trialEnd,
        Long trialPeriodDays) {

      this.extraParams = extraParams;
      this.items = items;
      this.metadata = metadata;
      this.trialEnd = trialEnd;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static SessionCreateParams.SubscriptionData.Builder builder() {
      return new SessionCreateParams.SubscriptionData.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private List<SessionCreateParams.SubscriptionData.Item> items;
      private Map<String, String> metadata;
      private Long trialEnd;
      private Long trialPeriodDays;

      public SessionCreateParams.SubscriptionData build() {
        return new SessionCreateParams.SubscriptionData(
            this.extraParams, this.items, this.metadata, this.trialEnd, this.trialPeriodDays);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.SubscriptionData#items} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder addItem(
          SessionCreateParams.SubscriptionData.Item element) {

        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.SubscriptionData#items} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder addAllItem(
          List<SessionCreateParams.SubscriptionData.Item> list) {

        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.addAll(list);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SubscriptionData#metadata} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder putMetadata(String key, String value) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionCreateParams.SubscriptionData#metadata} for the field documentation.
       */
      public SessionCreateParams.SubscriptionData.Builder putAllMetadata(Map<String, String> map) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * Unix timestamp representing the end of the trial period the customer will get before being
       * charged for the first time. Has to be at least 48h in the future.
       */
      public SessionCreateParams.SubscriptionData.Builder setTrialEnd(Long trialEnd) {

        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time.Has to be at least 1.
       */
      public SessionCreateParams.SubscriptionData.Builder setTrialPeriodDays(Long trialPeriodDays) {

        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }

    public static class Item {

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Plan ID for this item. */
      @SerializedName("plan")
      String plan;

      /** Quantity for this item. */
      @SerializedName("quantity")
      Long quantity;

      private Item(Map<String, Object> extraParams, String plan, Long quantity) {

        this.extraParams = extraParams;
        this.plan = plan;
        this.quantity = quantity;
      }

      public static SessionCreateParams.SubscriptionData.Item.Builder builder() {

        return new SessionCreateParams.SubscriptionData.Item.Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;
        private String plan;
        private Long quantity;

        public SessionCreateParams.SubscriptionData.Item build() {
          return new SessionCreateParams.SubscriptionData.Item(
              this.extraParams, this.plan, this.quantity);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.SubscriptionData.Item#extraParams} for the field
         * documentation.
         */
        public SessionCreateParams.SubscriptionData.Item.Builder putExtraParam(
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
         * map. See {@link SessionCreateParams.SubscriptionData.Item#extraParams} for the field
         * documentation.
         */
        public SessionCreateParams.SubscriptionData.Item.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Plan ID for this item. */
        public SessionCreateParams.SubscriptionData.Item.Builder setPlan(String plan) {

          this.plan = plan;
          return this;
        }

        /** Quantity for this item. */
        public SessionCreateParams.SubscriptionData.Item.Builder setQuantity(Long quantity) {

          this.quantity = quantity;
          return this;
        }
      }
    }
  }

  public enum BillingAddressCollection implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),
    @SerializedName("required")
    REQUIRED("required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private BillingAddressCollection(String value) {
      this.value = value;
    }
  }

  public enum Locale implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),
    @SerializedName("da")
    DA("da"),
    @SerializedName("de")
    DE("de"),
    @SerializedName("en")
    EN("en"),
    @SerializedName("es")
    ES("es"),
    @SerializedName("fi")
    FI("fi"),
    @SerializedName("fr")
    FR("fr"),
    @SerializedName("it")
    IT("it"),
    @SerializedName("ja")
    JA("ja"),
    @SerializedName("nb")
    NB("nb"),
    @SerializedName("nl")
    NL("nl"),
    @SerializedName("pl")
    PL("pl"),
    @SerializedName("pt")
    PT("pt"),
    @SerializedName("sv")
    SV("sv"),
    @SerializedName("zh")
    ZH("zh");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Locale(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodType implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private PaymentMethodType(String value) {
      this.value = value;
    }
  }
}
