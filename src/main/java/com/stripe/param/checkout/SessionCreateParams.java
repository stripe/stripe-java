package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SessionCreateParams extends ApiRequestParams {
  /** Specify whether Checkout should collect the customer's billing address. */
  @SerializedName("billing_address_collection")
  BillingAddressCollection billingAddressCollection;

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
   * ID of an existing customer, if one exists. Only supported for Checkout Sessions in `payment` or
   * `subscription` mode, but not Checkout Sessions in `setup` mode. The email stored on the
   * customer will be used to prefill the email field on the Checkout page. If the customer changes
   * their email on the Checkout page, the Customer object will be updated with the new email. If
   * blank for Checkout Sessions in `payment` or `subscription` mode, Checkout will create a new
   * customer object based on information provided during the session.
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
   * A list of items the customer is purchasing. Use this parameter for one-time payments or adding
   * invoice line items to a subscription (used in conjunction with `subscription_data`).
   */
  @SerializedName("line_items")
  List<LineItem> lineItems;

  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's
   * locale is used.
   */
  @SerializedName("locale")
  Locale locale;

  /** The mode of the Checkout Session, one of `payment`, `setup`, or `subscription`. */
  @SerializedName("mode")
  Mode mode;

  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in
   * `payment` mode.
   */
  @SerializedName("payment_intent_data")
  PaymentIntentData paymentIntentData;

  /**
   * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
   * The only supported values today are `card` and `ideal`.
   */
  @SerializedName("payment_method_types")
  List<PaymentMethodType> paymentMethodTypes;

  /**
   * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in `setup`
   * mode.
   */
  @SerializedName("setup_intent_data")
  SetupIntentData setupIntentData;

  /**
   * Describes the type of transaction being performed by Checkout in order to customize relevant
   * text on the page, such as the submit button. `submit_type` can only be specified on Checkout
   * Sessions in `payment` mode, but not Checkout Sessions in `subscription` or `setup` mode.
   */
  @SerializedName("submit_type")
  SubmitType submitType;

  /**
   * A subset of parameters to be passed to subscription creation for Checkout Sessions in
   * `subscription` mode.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /**
   * The URL to which Stripe should send customers when payment or setup is complete. If you’d like
   * access to the Checkout Session for the successful payment, read more about it in our guide on
   * [fulfilling your payments with webhooks](/docs/payments/checkout/fulfillment#webhooks).
   */
  @SerializedName("success_url")
  String successUrl;

  private SessionCreateParams(
      BillingAddressCollection billingAddressCollection,
      String cancelUrl,
      String clientReferenceId,
      String customer,
      String customerEmail,
      List<String> expand,
      Map<String, Object> extraParams,
      List<LineItem> lineItems,
      Locale locale,
      Mode mode,
      PaymentIntentData paymentIntentData,
      List<PaymentMethodType> paymentMethodTypes,
      SetupIntentData setupIntentData,
      SubmitType submitType,
      SubscriptionData subscriptionData,
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
    this.mode = mode;
    this.paymentIntentData = paymentIntentData;
    this.paymentMethodTypes = paymentMethodTypes;
    this.setupIntentData = setupIntentData;
    this.submitType = submitType;
    this.subscriptionData = subscriptionData;
    this.successUrl = successUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingAddressCollection billingAddressCollection;

    private String cancelUrl;

    private String clientReferenceId;

    private String customer;

    private String customerEmail;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<LineItem> lineItems;

    private Locale locale;

    private Mode mode;

    private PaymentIntentData paymentIntentData;

    private List<PaymentMethodType> paymentMethodTypes;

    private SetupIntentData setupIntentData;

    private SubmitType submitType;

    private SubscriptionData subscriptionData;

    private String successUrl;

    /** Finalize and obtain parameter instance from this builder. */
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
          this.mode,
          this.paymentIntentData,
          this.paymentMethodTypes,
          this.setupIntentData,
          this.submitType,
          this.subscriptionData,
          this.successUrl);
    }

    /** Specify whether Checkout should collect the customer's billing address. */
    public Builder setBillingAddressCollection(BillingAddressCollection billingAddressCollection) {
      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /**
     * The URL the customer will be directed to if they decide to cancel payment and return to your
     * website.
     */
    public Builder setCancelUrl(String cancelUrl) {
      this.cancelUrl = cancelUrl;
      return this;
    }

    /**
     * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
     * similar, and can be used to reconcile the session with your internal systems.
     */
    public Builder setClientReferenceId(String clientReferenceId) {
      this.clientReferenceId = clientReferenceId;
      return this;
    }

    /**
     * ID of an existing customer, if one exists. Only supported for Checkout Sessions in `payment`
     * or `subscription` mode, but not Checkout Sessions in `setup` mode. The email stored on the
     * customer will be used to prefill the email field on the Checkout page. If the customer
     * changes their email on the Checkout page, the Customer object will be updated with the new
     * email. If blank for Checkout Sessions in `payment` or `subscription` mode, Checkout will
     * create a new customer object based on information provided during the session.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * If provided, this value will be used when the Customer object is created. If not provided,
     * customers will be asked to enter their email address. Use this parameter to prefill customer
     * data if you already have an email on file. To access information about the customer once a
     * session is complete, use the `customer` field.
     */
    public Builder setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#extraParams} for the field documentation.
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
     * See {@link SessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
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
    public Builder addLineItem(LineItem element) {
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
    public Builder addAllLineItem(List<LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the
     * browser's locale is used.
     */
    public Builder setLocale(Locale locale) {
      this.locale = locale;
      return this;
    }

    /** The mode of the Checkout Session, one of `payment`, `setup`, or `subscription`. */
    public Builder setMode(Mode mode) {
      this.mode = mode;
      return this;
    }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in
     * `payment` mode.
     */
    public Builder setPaymentIntentData(PaymentIntentData paymentIntentData) {
      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addPaymentMethodType(PaymentMethodType element) {
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
    public Builder addAllPaymentMethodType(List<PaymentMethodType> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /**
     * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in `setup`
     * mode.
     */
    public Builder setSetupIntentData(SetupIntentData setupIntentData) {
      this.setupIntentData = setupIntentData;
      return this;
    }

    /**
     * Describes the type of transaction being performed by Checkout in order to customize relevant
     * text on the page, such as the submit button. `submit_type` can only be specified on Checkout
     * Sessions in `payment` mode, but not Checkout Sessions in `subscription` or `setup` mode.
     */
    public Builder setSubmitType(SubmitType submitType) {
      this.submitType = submitType;
      return this;
    }

    /**
     * A subset of parameters to be passed to subscription creation for Checkout Sessions in
     * `subscription` mode.
     */
    public Builder setSubscriptionData(SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /**
     * The URL to which Stripe should send customers when payment or setup is complete. If you’d
     * like access to the Checkout Session for the successful payment, read more about it in our
     * guide on [fulfilling your payments with
     * webhooks](/docs/payments/checkout/fulfillment#webhooks).
     */
    public Builder setSuccessUrl(String successUrl) {
      this.successUrl = successUrl;
      return this;
    }
  }

  @Getter
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

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private String description;

      private Map<String, Object> extraParams;

      private List<String> images;

      private String name;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public LineItem build() {
        return new LineItem(
            this.amount,
            this.currency,
            this.description,
            this.extraParams,
            this.images,
            this.name,
            this.quantity);
      }

      /** The amount to be collected per unit of the line item. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
       * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** The description for the line item. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
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
      public Builder addImage(String element) {
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
      public Builder addAllImage(List<String> elements) {
        if (this.images == null) {
          this.images = new ArrayList<>();
        }
        this.images.addAll(elements);
        return this;
      }

      /** The name for the line item. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The quantity of the line item being purchased. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }
    }
  }

  @Getter
  public static class PaymentIntentData {
    /**
     * The amount of the application fee (if any) that will be applied to the payment and
     * transferred to the application owner's Stripe account. To use an application fee, the request
     * must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
     * For more information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    @SerializedName("application_fee_amount")
    Long applicationFeeAmount;

    /** Controls when the funds will be captured from the customer's account. */
    @SerializedName("capture_method")
    CaptureMethod captureMethod;

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
     * [use case for connected accounts](/docs/payments/connected-accounts).
     */
    @SerializedName("on_behalf_of")
    String onBehalfOf;

    /** Email address that the receipt for the resulting payment will be sent to. */
    @SerializedName("receipt_email")
    String receiptEmail;

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If present, the payment method used with this PaymentIntent can be
     * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
     * transaction completes.
     *
     * <p>For more, learn to [save card details after a
     * payment](https://stripe.com/docs/payments/save-after-payment).
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     */
    @SerializedName("setup_future_usage")
    SetupFutureUsage setupFutureUsage;

    /** Shipping information for this payment. */
    @SerializedName("shipping")
    Shipping shipping;

    /**
     * Extra information about the payment. This will appear on your customer's statement when this
     * payment succeeds in creating a charge.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    @SerializedName("transfer_data")
    TransferData transferData;

    private PaymentIntentData(
        Long applicationFeeAmount,
        CaptureMethod captureMethod,
        String description,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String onBehalfOf,
        String receiptEmail,
        SetupFutureUsage setupFutureUsage,
        Shipping shipping,
        String statementDescriptor,
        TransferData transferData) {
      this.applicationFeeAmount = applicationFeeAmount;
      this.captureMethod = captureMethod;
      this.description = description;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.onBehalfOf = onBehalfOf;
      this.receiptEmail = receiptEmail;
      this.setupFutureUsage = setupFutureUsage;
      this.shipping = shipping;
      this.statementDescriptor = statementDescriptor;
      this.transferData = transferData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long applicationFeeAmount;

      private CaptureMethod captureMethod;

      private String description;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String onBehalfOf;

      private String receiptEmail;

      private SetupFutureUsage setupFutureUsage;

      private Shipping shipping;

      private String statementDescriptor;

      private TransferData transferData;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentData build() {
        return new PaymentIntentData(
            this.applicationFeeAmount,
            this.captureMethod,
            this.description,
            this.extraParams,
            this.metadata,
            this.onBehalfOf,
            this.receiptEmail,
            this.setupFutureUsage,
            this.shipping,
            this.statementDescriptor,
            this.transferData);
      }

      /**
       * The amount of the application fee (if any) that will be applied to the payment and
       * transferred to the application owner's Stripe account. To use an application fee, the
       * request must be made on behalf of another account, using the `Stripe-Account` header or an
       * OAuth key. For more information, see the PaymentIntents [use case for connected
       * accounts](https://stripe.com/docs/payments/connected-accounts).
       */
      public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
        return this;
      }

      /** Controls when the funds will be captured from the customer's account. */
      public Builder setCaptureMethod(CaptureMethod captureMethod) {
        this.captureMethod = captureMethod;
        return this;
      }

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.PaymentIntentData#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.PaymentIntentData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
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
       * See {@link SessionCreateParams.PaymentIntentData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * The Stripe account ID for which these funds are intended. For details, see the
       * PaymentIntents [use case for connected accounts](/docs/payments/connected-accounts).
       */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /** Email address that the receipt for the resulting payment will be sent to. */
      public Builder setReceiptEmail(String receiptEmail) {
        this.receiptEmail = receiptEmail;
        return this;
      }

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If present, the payment method used with this PaymentIntent can be
       * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after
       * the transaction completes.
       *
       * <p>For more, learn to [save card details after a
       * payment](https://stripe.com/docs/payments/save-after-payment).
       *
       * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply
       * with regional legislation and network rules. For example, if your customer is impacted by
       * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
       * ensure that they are authenticated while processing this PaymentIntent. You will then be
       * able to collect [off-session
       * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
       * for this customer.
       */
      public Builder setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
        return this;
      }

      /** Shipping information for this payment. */
      public Builder setShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /**
       * Extra information about the payment. This will appear on your customer's statement when
       * this payment succeeds in creating a charge.
       */
      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /**
       * The parameters used to automatically create a Transfer when the payment succeeds. For more
       * information, see the PaymentIntents [use case for connected
       * accounts](https://stripe.com/docs/payments/connected-accounts).
       */
      public Builder setTransferData(TransferData transferData) {
        this.transferData = transferData;
        return this;
      }
    }

    @Getter
    public static class Shipping {
      /** Shipping address. */
      @SerializedName("address")
      Address address;

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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentIntentData.Shipping#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentIntentData.Shipping#extraParams} for the field
         * documentation.
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
         * The tracking number for a physical product, obtained from the delivery service. If
         * multiple tracking numbers were generated for this purchase, please separate them with
         * commas.
         */
        public Builder setTrackingNumber(String trackingNumber) {
          this.trackingNumber = trackingNumber;
          return this;
        }
      }

      @Getter
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
           * map. See {@link SessionCreateParams.PaymentIntentData.Shipping.Address#extraParams} for
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
           * map. See {@link SessionCreateParams.PaymentIntentData.Shipping.Address#extraParams} for
           * the field documentation.
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

    @Getter
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public TransferData build() {
          return new TransferData(this.destination, this.extraParams);
        }

        /**
         * If specified, successful charges will be attributed to the destination account for tax
         * reporting, and the funds from charges will be transferred to the destination account. The
         * ID of the resulting transfer will be returned on the successful charge's `transfer`
         * field.
         */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentIntentData.TransferData#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentIntentData.TransferData#extraParams} for the
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
    }

    public enum CaptureMethod implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("manual")
      MANUAL("manual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CaptureMethod(String value) {
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

  @Getter
  public static class SetupIntentData {
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

    /** The Stripe account for which the setup is intended. */
    @SerializedName("on_behalf_of")
    String onBehalfOf;

    private SetupIntentData(
        String description,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String onBehalfOf) {
      this.description = description;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.onBehalfOf = onBehalfOf;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String description;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String onBehalfOf;

      /** Finalize and obtain parameter instance from this builder. */
      public SetupIntentData build() {
        return new SetupIntentData(
            this.description, this.extraParams, this.metadata, this.onBehalfOf);
      }

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SetupIntentData#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.SetupIntentData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SetupIntentData#metadata} for the field documentation.
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
       * See {@link SessionCreateParams.SetupIntentData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** The Stripe account for which the setup is intended. */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }
    }
  }

  @Getter
  public static class SubscriptionData {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. To use an application fee percent, the request must be
     * made on behalf of another account, using the `Stripe-Account` header or an OAuth key. For
     * more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

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
    List<Item> items;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. Has to be at least 48 hours in the future.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    /**
     * Indicates if a plan’s `trial_period_days` should be applied to the subscription. Setting
     * `trial_end` on `subscription_data` is preferred. Defaults to `false`.
     */
    @SerializedName("trial_from_plan")
    Boolean trialFromPlan;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time. Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    private SubscriptionData(
        BigDecimal applicationFeePercent,
        Map<String, Object> extraParams,
        List<Item> items,
        Map<String, String> metadata,
        Long trialEnd,
        Boolean trialFromPlan,
        Long trialPeriodDays) {
      this.applicationFeePercent = applicationFeePercent;
      this.extraParams = extraParams;
      this.items = items;
      this.metadata = metadata;
      this.trialEnd = trialEnd;
      this.trialFromPlan = trialFromPlan;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private Map<String, Object> extraParams;

      private List<Item> items;

      private Map<String, String> metadata;

      private Long trialEnd;

      private Boolean trialFromPlan;

      private Long trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionData build() {
        return new SubscriptionData(
            this.applicationFeePercent,
            this.extraParams,
            this.items,
            this.metadata,
            this.trialEnd,
            this.trialFromPlan,
            this.trialPeriodDays);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * application owner's Stripe account. To use an application fee percent, the request must be
       * made on behalf of another account, using the `Stripe-Account` header or an OAuth key. For
       * more information, see the application fees
       * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SubscriptionData#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
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
      public Builder addItem(Item element) {
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
      public Builder addAllItem(List<Item> elements) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.SubscriptionData#metadata} for the field documentation.
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
       * See {@link SessionCreateParams.SubscriptionData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * Unix timestamp representing the end of the trial period the customer will get before being
       * charged for the first time. Has to be at least 48 hours in the future.
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * Indicates if a plan’s `trial_period_days` should be applied to the subscription. Setting
       * `trial_end` on `subscription_data` is preferred. Defaults to `false`.
       */
      public Builder setTrialFromPlan(Boolean trialFromPlan) {
        this.trialFromPlan = trialFromPlan;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }

    @Getter
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String plan;

        private Long quantity;

        /** Finalize and obtain parameter instance from this builder. */
        public Item build() {
          return new Item(this.extraParams, this.plan, this.quantity);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.SubscriptionData.Item#extraParams} for the field
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
         * map. See {@link SessionCreateParams.SubscriptionData.Item#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Plan ID for this item. */
        public Builder setPlan(String plan) {
          this.plan = plan;
          return this;
        }

        /** Quantity for this item. */
        public Builder setQuantity(Long quantity) {
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

    BillingAddressCollection(String value) {
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

    @SerializedName("ms")
    MS("ms"),

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

    Locale(String value) {
      this.value = value;
    }
  }

  public enum Mode implements ApiRequestParams.EnumParam {
    @SerializedName("payment")
    PAYMENT("payment"),

    @SerializedName("setup")
    SETUP("setup"),

    @SerializedName("subscription")
    SUBSCRIPTION("subscription");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Mode(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodType implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card"),

    @SerializedName("ideal")
    IDEAL("ideal");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodType(String value) {
      this.value = value;
    }
  }

  public enum SubmitType implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("book")
    BOOK("book"),

    @SerializedName("donate")
    DONATE("donate"),

    @SerializedName("pay")
    PAY("pay");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubmitType(String value) {
      this.value = value;
    }
  }
}
