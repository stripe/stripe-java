// File generated from our OpenAPI spec
package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SessionCreateParams extends ApiRequestParams {
  /** Configure actions after a Checkout Session has expired. */
  @SerializedName("after_expiration")
  AfterExpiration afterExpiration;

  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /**
   * Settings for automatic tax lookup for this session and resulting payments, invoices, and
   * subscriptions.
   */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Specify whether Checkout should collect the customer's billing address. */
  @SerializedName("billing_address_collection")
  BillingAddressCollection billingAddressCollection;

  /**
   * If set, Checkout displays a back button and customers will be directed to this URL if they
   * decide to cancel payment and return to your website.
   */
  @SerializedName("cancel_url")
  String cancelUrl;

  /**
   * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
   * similar, and can be used to reconcile the session with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

  /** Configure fields for the Checkout Session to gather active consent from customers. */
  @SerializedName("consent_collection")
  ConsentCollection consentCollection;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Collect additional information from your customer using custom fields. Up to 2 fields are
   * supported.
   */
  @SerializedName("custom_fields")
  List<SessionCreateParams.CustomField> customFields;

  /** Display additional text for your customers using custom text. */
  @SerializedName("custom_text")
  CustomText customText;

  /**
   * ID of an existing Customer, if one exists. In {@code payment} mode, the customer’s most recent
   * card payment method will be used to prefill the email, name, card details, and billing address
   * on the Checkout page. In {@code subscription} mode, the customer’s <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">default
   * payment method</a> will be used if it’s a card, and otherwise the most recent card will be
   * used. A valid billing address, billing name and billing email are required on the payment
   * method for Checkout to prefill the customer's card details.
   *
   * <p>If the Customer already has a valid <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-email">email</a> set, the
   * email will be prefilled and not editable in Checkout. If the Customer does not have a valid
   * {@code email}, Checkout will set the email entered during the session on the Customer.
   *
   * <p>If blank for Checkout Sessions in {@code subscription} mode or with {@code
   * customer_creation} set as {@code always} in {@code payment} mode, Checkout will create a new
   * Customer object based on information provided during the payment flow.
   *
   * <p>You can set <a
   * href="https://stripe.com/docs/api/checkout/sessions/create#create_checkout_session-payment_intent_data-setup_future_usage">{@code
   * payment_intent_data.setup_future_usage}</a> to have Checkout automatically attach the payment
   * method to the Customer you pass in for future reuse.
   */
  @SerializedName("customer")
  String customer;

  /**
   * Configure whether a Checkout Session creates a <a
   * href="https://stripe.com/docs/api/customers">Customer</a> during Session confirmation.
   *
   * <p>When a Customer is not created, you can still retrieve email, address, and other customer
   * data entered in Checkout with <a
   * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-customer_details">customer_details</a>.
   *
   * <p>Sessions that don't create Customers instead are grouped by <a
   * href="https://stripe.com/docs/payments/checkout/guest-customers">guest customers</a> in the
   * Dashboard. Promotion codes limited to first time customers will return invalid for these
   * Sessions.
   *
   * <p>Can only be set in {@code payment} and {@code setup} mode.
   */
  @SerializedName("customer_creation")
  CustomerCreation customerCreation;

  /**
   * If provided, this value will be used when the Customer object is created. If not provided,
   * customers will be asked to enter their email address. Use this parameter to prefill customer
   * data if you already have an email on file. To access information about the customer once a
   * session is complete, use the {@code customer} field.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /**
   * Controls what fields on Customer can be updated by the Checkout Session. Can only be provided
   * when {@code customer} is provided.
   */
  @SerializedName("customer_update")
  CustomerUpdate customerUpdate;

  /**
   * The coupon or promotion code to apply to this Session. Currently, only up to one may be
   * specified.
   */
  @SerializedName("discounts")
  List<SessionCreateParams.Discount> discounts;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * The Epoch time in seconds at which the Checkout Session will expire. It can be anywhere from 30
   * minutes to 24 hours after Checkout Session creation. By default, this value is 24 hours from
   * creation.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Generate a post-purchase Invoice for one-time payments. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

  /**
   * A list of items the customer is purchasing. Use this parameter to pass one-time or recurring <a
   * href="https://stripe.com/docs/api/prices">Prices</a>.
   *
   * <p>For {@code payment} mode, there is a maximum of 100 line items, however it is recommended to
   * consolidate line items if there are more than a few dozen.
   *
   * <p>For {@code subscription} mode, there is a maximum of 20 line items with recurring Prices and
   * 20 line items with one-time Prices. Line items with one-time Prices will be on the initial
   * invoice only.
   */
  @SerializedName("line_items")
  List<SessionCreateParams.LineItem> lineItems;

  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or {@code auto}, the
   * browser's locale is used.
   */
  @SerializedName("locale")
  Locale locale;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The mode of the Checkout Session. Pass {@code subscription} if the Checkout Session includes at
   * least one recurring item.
   */
  @SerializedName("mode")
  Mode mode;

  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
   * payment} mode.
   */
  @SerializedName("payment_intent_data")
  PaymentIntentData paymentIntentData;

  /**
   * Specify whether Checkout should collect a payment method. When set to {@code if_required},
   * Checkout will not collect a payment method when the total due for the session is 0. This may
   * occur if the Checkout Session includes a free trial or a discount.
   *
   * <p>Can only be set in {@code subscription} mode.
   *
   * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
   * guide on configuring <a
   * href="https://stripe.com/docs/payments/checkout/free-trials">subscriptions with a free
   * trial</a>.
   */
  @SerializedName("payment_method_collection")
  PaymentMethodCollection paymentMethodCollection;

  /** The ID of the payment method configuration to use with this Checkout session. */
  @SerializedName("payment_method_configuration")
  String paymentMethodConfiguration;

  /** Payment-method-specific configuration. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * A list of the types of payment methods (e.g., {@code card}) this Checkout Session can accept.
   *
   * <p>In {@code payment} and {@code subscription} mode, you can omit this attribute to manage your
   * payment methods from the <a href="https://dashboard.stripe.com/settings/payment_methods">Stripe
   * Dashboard</a>. It is required in {@code setup} mode.
   *
   * <p>Read more about the supported payment methods and their requirements in our <a
   * href="https://stripe.com/docs/payments/checkout/payment-methods">payment method details
   * guide</a>.
   *
   * <p>If multiple payment methods are passed, Checkout will dynamically reorder them to prioritize
   * the most relevant payment methods based on the customer's location and other characteristics.
   */
  @SerializedName("payment_method_types")
  List<SessionCreateParams.PaymentMethodType> paymentMethodTypes;

  /**
   * Controls phone number collection settings for the session.
   *
   * <p>We recommend that you review your privacy policy and check with your legal contacts before
   * using this feature. Learn more about <a
   * href="https://stripe.com/docs/payments/checkout/phone-numbers">collecting phone numbers with
   * Checkout</a>.
   */
  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /**
   * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in {@code
   * setup} mode.
   */
  @SerializedName("setup_intent_data")
  SetupIntentData setupIntentData;

  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /** The shipping rate options to apply to this Session. Up to a maximum of 5. */
  @SerializedName("shipping_options")
  List<SessionCreateParams.ShippingOption> shippingOptions;

  /**
   * Describes the type of transaction being performed by Checkout in order to customize relevant
   * text on the page, such as the submit button. {@code submit_type} can only be specified on
   * Checkout Sessions in {@code payment} mode, but not Checkout Sessions in {@code subscription} or
   * {@code setup} mode.
   */
  @SerializedName("submit_type")
  SubmitType submitType;

  /**
   * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
   * subscription} mode.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /**
   * <strong>Required.</strong> The URL to which Stripe should send customers when payment or setup
   * is complete. If you’d like to use information from the successful Checkout Session on your
   * page, read the guide on <a
   * href="https://stripe.com/docs/payments/checkout/custom-success-page">customizing your success
   * page</a>.
   */
  @SerializedName("success_url")
  String successUrl;

  /** Controls tax ID collection settings for the session. */
  @SerializedName("tax_id_collection")
  TaxIdCollection taxIdCollection;

  private SessionCreateParams(
      AfterExpiration afterExpiration,
      Boolean allowPromotionCodes,
      AutomaticTax automaticTax,
      BillingAddressCollection billingAddressCollection,
      String cancelUrl,
      String clientReferenceId,
      ConsentCollection consentCollection,
      String currency,
      List<SessionCreateParams.CustomField> customFields,
      CustomText customText,
      String customer,
      CustomerCreation customerCreation,
      String customerEmail,
      CustomerUpdate customerUpdate,
      List<SessionCreateParams.Discount> discounts,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      InvoiceCreation invoiceCreation,
      List<SessionCreateParams.LineItem> lineItems,
      Locale locale,
      Map<String, String> metadata,
      Mode mode,
      PaymentIntentData paymentIntentData,
      PaymentMethodCollection paymentMethodCollection,
      String paymentMethodConfiguration,
      PaymentMethodOptions paymentMethodOptions,
      List<SessionCreateParams.PaymentMethodType> paymentMethodTypes,
      PhoneNumberCollection phoneNumberCollection,
      SetupIntentData setupIntentData,
      ShippingAddressCollection shippingAddressCollection,
      List<SessionCreateParams.ShippingOption> shippingOptions,
      SubmitType submitType,
      SubscriptionData subscriptionData,
      String successUrl,
      TaxIdCollection taxIdCollection) {
    this.afterExpiration = afterExpiration;
    this.allowPromotionCodes = allowPromotionCodes;
    this.automaticTax = automaticTax;
    this.billingAddressCollection = billingAddressCollection;
    this.cancelUrl = cancelUrl;
    this.clientReferenceId = clientReferenceId;
    this.consentCollection = consentCollection;
    this.currency = currency;
    this.customFields = customFields;
    this.customText = customText;
    this.customer = customer;
    this.customerCreation = customerCreation;
    this.customerEmail = customerEmail;
    this.customerUpdate = customerUpdate;
    this.discounts = discounts;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.invoiceCreation = invoiceCreation;
    this.lineItems = lineItems;
    this.locale = locale;
    this.metadata = metadata;
    this.mode = mode;
    this.paymentIntentData = paymentIntentData;
    this.paymentMethodCollection = paymentMethodCollection;
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.phoneNumberCollection = phoneNumberCollection;
    this.setupIntentData = setupIntentData;
    this.shippingAddressCollection = shippingAddressCollection;
    this.shippingOptions = shippingOptions;
    this.submitType = submitType;
    this.subscriptionData = subscriptionData;
    this.successUrl = successUrl;
    this.taxIdCollection = taxIdCollection;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AfterExpiration afterExpiration;

    private Boolean allowPromotionCodes;

    private AutomaticTax automaticTax;

    private BillingAddressCollection billingAddressCollection;

    private String cancelUrl;

    private String clientReferenceId;

    private ConsentCollection consentCollection;

    private String currency;

    private List<SessionCreateParams.CustomField> customFields;

    private CustomText customText;

    private String customer;

    private CustomerCreation customerCreation;

    private String customerEmail;

    private CustomerUpdate customerUpdate;

    private List<SessionCreateParams.Discount> discounts;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private InvoiceCreation invoiceCreation;

    private List<SessionCreateParams.LineItem> lineItems;

    private Locale locale;

    private Map<String, String> metadata;

    private Mode mode;

    private PaymentIntentData paymentIntentData;

    private PaymentMethodCollection paymentMethodCollection;

    private String paymentMethodConfiguration;

    private PaymentMethodOptions paymentMethodOptions;

    private List<SessionCreateParams.PaymentMethodType> paymentMethodTypes;

    private PhoneNumberCollection phoneNumberCollection;

    private SetupIntentData setupIntentData;

    private ShippingAddressCollection shippingAddressCollection;

    private List<SessionCreateParams.ShippingOption> shippingOptions;

    private SubmitType submitType;

    private SubscriptionData subscriptionData;

    private String successUrl;

    private TaxIdCollection taxIdCollection;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionCreateParams build() {
      return new SessionCreateParams(
          this.afterExpiration,
          this.allowPromotionCodes,
          this.automaticTax,
          this.billingAddressCollection,
          this.cancelUrl,
          this.clientReferenceId,
          this.consentCollection,
          this.currency,
          this.customFields,
          this.customText,
          this.customer,
          this.customerCreation,
          this.customerEmail,
          this.customerUpdate,
          this.discounts,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.invoiceCreation,
          this.lineItems,
          this.locale,
          this.metadata,
          this.mode,
          this.paymentIntentData,
          this.paymentMethodCollection,
          this.paymentMethodConfiguration,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.phoneNumberCollection,
          this.setupIntentData,
          this.shippingAddressCollection,
          this.shippingOptions,
          this.submitType,
          this.subscriptionData,
          this.successUrl,
          this.taxIdCollection);
    }

    /** Configure actions after a Checkout Session has expired. */
    public Builder setAfterExpiration(SessionCreateParams.AfterExpiration afterExpiration) {
      this.afterExpiration = afterExpiration;
      return this;
    }

    /** Enables user redeemable promotion codes. */
    public Builder setAllowPromotionCodes(Boolean allowPromotionCodes) {
      this.allowPromotionCodes = allowPromotionCodes;
      return this;
    }

    /**
     * Settings for automatic tax lookup for this session and resulting payments, invoices, and
     * subscriptions.
     */
    public Builder setAutomaticTax(SessionCreateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /** Specify whether Checkout should collect the customer's billing address. */
    public Builder setBillingAddressCollection(
        SessionCreateParams.BillingAddressCollection billingAddressCollection) {
      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /**
     * If set, Checkout displays a back button and customers will be directed to this URL if they
     * decide to cancel payment and return to your website.
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

    /** Configure fields for the Checkout Session to gather active consent from customers. */
    public Builder setConsentCollection(SessionCreateParams.ConsentCollection consentCollection) {
      this.consentCollection = consentCollection;
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

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#customFields} for the field documentation.
     */
    public Builder addCustomField(SessionCreateParams.CustomField element) {
      if (this.customFields == null) {
        this.customFields = new ArrayList<>();
      }
      this.customFields.add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#customFields} for the field documentation.
     */
    public Builder addAllCustomField(List<SessionCreateParams.CustomField> elements) {
      if (this.customFields == null) {
        this.customFields = new ArrayList<>();
      }
      this.customFields.addAll(elements);
      return this;
    }

    /** Display additional text for your customers using custom text. */
    public Builder setCustomText(SessionCreateParams.CustomText customText) {
      this.customText = customText;
      return this;
    }

    /**
     * ID of an existing Customer, if one exists. In {@code payment} mode, the customer’s most
     * recent card payment method will be used to prefill the email, name, card details, and billing
     * address on the Checkout page. In {@code subscription} mode, the customer’s <a
     * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">default
     * payment method</a> will be used if it’s a card, and otherwise the most recent card will be
     * used. A valid billing address, billing name and billing email are required on the payment
     * method for Checkout to prefill the customer's card details.
     *
     * <p>If the Customer already has a valid <a
     * href="https://stripe.com/docs/api/customers/object#customer_object-email">email</a> set, the
     * email will be prefilled and not editable in Checkout. If the Customer does not have a valid
     * {@code email}, Checkout will set the email entered during the session on the Customer.
     *
     * <p>If blank for Checkout Sessions in {@code subscription} mode or with {@code
     * customer_creation} set as {@code always} in {@code payment} mode, Checkout will create a new
     * Customer object based on information provided during the payment flow.
     *
     * <p>You can set <a
     * href="https://stripe.com/docs/api/checkout/sessions/create#create_checkout_session-payment_intent_data-setup_future_usage">{@code
     * payment_intent_data.setup_future_usage}</a> to have Checkout automatically attach the payment
     * method to the Customer you pass in for future reuse.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Configure whether a Checkout Session creates a <a
     * href="https://stripe.com/docs/api/customers">Customer</a> during Session confirmation.
     *
     * <p>When a Customer is not created, you can still retrieve email, address, and other customer
     * data entered in Checkout with <a
     * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-customer_details">customer_details</a>.
     *
     * <p>Sessions that don't create Customers instead are grouped by <a
     * href="https://stripe.com/docs/payments/checkout/guest-customers">guest customers</a> in the
     * Dashboard. Promotion codes limited to first time customers will return invalid for these
     * Sessions.
     *
     * <p>Can only be set in {@code payment} and {@code setup} mode.
     */
    public Builder setCustomerCreation(SessionCreateParams.CustomerCreation customerCreation) {
      this.customerCreation = customerCreation;
      return this;
    }

    /**
     * If provided, this value will be used when the Customer object is created. If not provided,
     * customers will be asked to enter their email address. Use this parameter to prefill customer
     * data if you already have an email on file. To access information about the customer once a
     * session is complete, use the {@code customer} field.
     */
    public Builder setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
    }

    /**
     * Controls what fields on Customer can be updated by the Checkout Session. Can only be provided
     * when {@code customer} is provided.
     */
    public Builder setCustomerUpdate(SessionCreateParams.CustomerUpdate customerUpdate) {
      this.customerUpdate = customerUpdate;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#discounts} for the field documentation.
     */
    public Builder addDiscount(SessionCreateParams.Discount element) {
      if (this.discounts == null) {
        this.discounts = new ArrayList<>();
      }
      this.discounts.add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#discounts} for the field documentation.
     */
    public Builder addAllDiscount(List<SessionCreateParams.Discount> elements) {
      if (this.discounts == null) {
        this.discounts = new ArrayList<>();
      }
      this.discounts.addAll(elements);
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
     * The Epoch time in seconds at which the Checkout Session will expire. It can be anywhere from
     * 30 minutes to 24 hours after Checkout Session creation. By default, this value is 24 hours
     * from creation.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
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

    /** Generate a post-purchase Invoice for one-time payments. */
    public Builder setInvoiceCreation(SessionCreateParams.InvoiceCreation invoiceCreation) {
      this.invoiceCreation = invoiceCreation;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(SessionCreateParams.LineItem element) {
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
    public Builder addAllLineItem(List<SessionCreateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * The IETF language tag of the locale Checkout is displayed in. If blank or {@code auto}, the
     * browser's locale is used.
     */
    public Builder setLocale(SessionCreateParams.Locale locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SessionCreateParams#metadata} for the field documentation.
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
     * See {@link SessionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The mode of the Checkout Session. Pass {@code subscription} if the Checkout Session includes
     * at least one recurring item.
     */
    public Builder setMode(SessionCreateParams.Mode mode) {
      this.mode = mode;
      return this;
    }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
     * payment} mode.
     */
    public Builder setPaymentIntentData(SessionCreateParams.PaymentIntentData paymentIntentData) {
      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * Specify whether Checkout should collect a payment method. When set to {@code if_required},
     * Checkout will not collect a payment method when the total due for the session is 0. This may
     * occur if the Checkout Session includes a free trial or a discount.
     *
     * <p>Can only be set in {@code subscription} mode.
     *
     * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
     * guide on configuring <a
     * href="https://stripe.com/docs/payments/checkout/free-trials">subscriptions with a free
     * trial</a>.
     */
    public Builder setPaymentMethodCollection(
        SessionCreateParams.PaymentMethodCollection paymentMethodCollection) {
      this.paymentMethodCollection = paymentMethodCollection;
      return this;
    }

    /** The ID of the payment method configuration to use with this Checkout session. */
    public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /** Payment-method-specific configuration. */
    public Builder setPaymentMethodOptions(
        SessionCreateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addPaymentMethodType(SessionCreateParams.PaymentMethodType element) {
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
    public Builder addAllPaymentMethodType(List<SessionCreateParams.PaymentMethodType> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /**
     * Controls phone number collection settings for the session.
     *
     * <p>We recommend that you review your privacy policy and check with your legal contacts before
     * using this feature. Learn more about <a
     * href="https://stripe.com/docs/payments/checkout/phone-numbers">collecting phone numbers with
     * Checkout</a>.
     */
    public Builder setPhoneNumberCollection(
        SessionCreateParams.PhoneNumberCollection phoneNumberCollection) {
      this.phoneNumberCollection = phoneNumberCollection;
      return this;
    }

    /**
     * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in {@code
     * setup} mode.
     */
    public Builder setSetupIntentData(SessionCreateParams.SetupIntentData setupIntentData) {
      this.setupIntentData = setupIntentData;
      return this;
    }

    /**
     * When set, provides configuration for Checkout to collect a shipping address from a customer.
     */
    public Builder setShippingAddressCollection(
        SessionCreateParams.ShippingAddressCollection shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }

    /**
     * Add an element to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#shippingOptions} for the field documentation.
     */
    public Builder addShippingOption(SessionCreateParams.ShippingOption element) {
      if (this.shippingOptions == null) {
        this.shippingOptions = new ArrayList<>();
      }
      this.shippingOptions.add(element);
      return this;
    }

    /**
     * Add all elements to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#shippingOptions} for the field documentation.
     */
    public Builder addAllShippingOption(List<SessionCreateParams.ShippingOption> elements) {
      if (this.shippingOptions == null) {
        this.shippingOptions = new ArrayList<>();
      }
      this.shippingOptions.addAll(elements);
      return this;
    }

    /**
     * Describes the type of transaction being performed by Checkout in order to customize relevant
     * text on the page, such as the submit button. {@code submit_type} can only be specified on
     * Checkout Sessions in {@code payment} mode, but not Checkout Sessions in {@code subscription}
     * or {@code setup} mode.
     */
    public Builder setSubmitType(SessionCreateParams.SubmitType submitType) {
      this.submitType = submitType;
      return this;
    }

    /**
     * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
     * subscription} mode.
     */
    public Builder setSubscriptionData(SessionCreateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /**
     * <strong>Required.</strong> The URL to which Stripe should send customers when payment or
     * setup is complete. If you’d like to use information from the successful Checkout Session on
     * your page, read the guide on <a
     * href="https://stripe.com/docs/payments/checkout/custom-success-page">customizing your success
     * page</a>.
     */
    public Builder setSuccessUrl(String successUrl) {
      this.successUrl = successUrl;
      return this;
    }

    /** Controls tax ID collection settings for the session. */
    public Builder setTaxIdCollection(SessionCreateParams.TaxIdCollection taxIdCollection) {
      this.taxIdCollection = taxIdCollection;
      return this;
    }
  }

  @Getter
  public static class AfterExpiration {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configure a Checkout Session that can be used to recover an expired session. */
    @SerializedName("recovery")
    Recovery recovery;

    private AfterExpiration(Map<String, Object> extraParams, Recovery recovery) {
      this.extraParams = extraParams;
      this.recovery = recovery;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Recovery recovery;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.AfterExpiration build() {
        return new SessionCreateParams.AfterExpiration(this.extraParams, this.recovery);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.AfterExpiration#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.AfterExpiration#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configure a Checkout Session that can be used to recover an expired session. */
      public Builder setRecovery(SessionCreateParams.AfterExpiration.Recovery recovery) {
        this.recovery = recovery;
        return this;
      }
    }

    @Getter
    public static class Recovery {
      /**
       * Enables user redeemable promotion codes on the recovered Checkout Sessions. Defaults to
       * {@code false}
       */
      @SerializedName("allow_promotion_codes")
      Boolean allowPromotionCodes;

      /**
       * <strong>Required.</strong> If {@code true}, a recovery URL will be generated to recover
       * this Checkout Session if it expires before a successful transaction is completed. It will
       * be attached to the Checkout Session object upon expiration.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Recovery(
          Boolean allowPromotionCodes, Boolean enabled, Map<String, Object> extraParams) {
        this.allowPromotionCodes = allowPromotionCodes;
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean allowPromotionCodes;

        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.AfterExpiration.Recovery build() {
          return new SessionCreateParams.AfterExpiration.Recovery(
              this.allowPromotionCodes, this.enabled, this.extraParams);
        }

        /**
         * Enables user redeemable promotion codes on the recovered Checkout Sessions. Defaults to
         * {@code false}
         */
        public Builder setAllowPromotionCodes(Boolean allowPromotionCodes) {
          this.allowPromotionCodes = allowPromotionCodes;
          return this;
        }

        /**
         * <strong>Required.</strong> If {@code true}, a recovery URL will be generated to recover
         * this Checkout Session if it expires before a successful transaction is completed. It will
         * be attached to the Checkout Session object upon expiration.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.AfterExpiration.Recovery#extraParams} for the field
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
         * map. See {@link SessionCreateParams.AfterExpiration.Recovery#extraParams} for the field
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
    }
  }

  @Getter
  public static class AutomaticTax {
    /** <strong>Required.</strong> Set to true to enable automatic taxes. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.AutomaticTax build() {
        return new SessionCreateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to true to enable automatic taxes. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.AutomaticTax#extraParams} for the field documentation.
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

  @Getter
  public static class ConsentCollection {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If set to {@code auto}, enables the collection of customer consent for promotional
     * communications. The Checkout Session will determine whether to display an option to opt into
     * promotional communication from the merchant depending on the customer's locale. Only
     * available to US merchants.
     */
    @SerializedName("promotions")
    Promotions promotions;

    /**
     * If set to {@code required}, it requires customers to check a terms of service checkbox before
     * being able to pay. There must be a valid terms of service URL set in your <a
     * href="https://dashboard.stripe.com/settings/public">Dashboard settings</a>.
     */
    @SerializedName("terms_of_service")
    TermsOfService termsOfService;

    private ConsentCollection(
        Map<String, Object> extraParams, Promotions promotions, TermsOfService termsOfService) {
      this.extraParams = extraParams;
      this.promotions = promotions;
      this.termsOfService = termsOfService;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Promotions promotions;

      private TermsOfService termsOfService;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.ConsentCollection build() {
        return new SessionCreateParams.ConsentCollection(
            this.extraParams, this.promotions, this.termsOfService);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.ConsentCollection#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.ConsentCollection#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * If set to {@code auto}, enables the collection of customer consent for promotional
       * communications. The Checkout Session will determine whether to display an option to opt
       * into promotional communication from the merchant depending on the customer's locale. Only
       * available to US merchants.
       */
      public Builder setPromotions(SessionCreateParams.ConsentCollection.Promotions promotions) {
        this.promotions = promotions;
        return this;
      }

      /**
       * If set to {@code required}, it requires customers to check a terms of service checkbox
       * before being able to pay. There must be a valid terms of service URL set in your <a
       * href="https://dashboard.stripe.com/settings/public">Dashboard settings</a>.
       */
      public Builder setTermsOfService(
          SessionCreateParams.ConsentCollection.TermsOfService termsOfService) {
        this.termsOfService = termsOfService;
        return this;
      }
    }

    public enum Promotions implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Promotions(String value) {
        this.value = value;
      }
    }

    public enum TermsOfService implements ApiRequestParams.EnumParam {
      @SerializedName("none")
      NONE("none"),

      @SerializedName("required")
      REQUIRED("required");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TermsOfService(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class CustomField {
    /** Configuration for {@code type=dropdown} fields. */
    @SerializedName("dropdown")
    Dropdown dropdown;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> String of your choice that your integration can use to reconcile
     * this field. Must be unique to this field, alphanumeric, and up to 200 characters.
     */
    @SerializedName("key")
    String key;

    /** <strong>Required.</strong> The label for the field, displayed to the customer. */
    @SerializedName("label")
    Label label;

    /** Configuration for {@code type=numeric} fields. */
    @SerializedName("numeric")
    Numeric numeric;

    /**
     * Whether the customer is required to complete the field before completing the Checkout
     * Session. Defaults to {@code false}.
     */
    @SerializedName("optional")
    Boolean optional;

    /** Configuration for {@code type=text} fields. */
    @SerializedName("text")
    Text text;

    /** <strong>Required.</strong> The type of the field. */
    @SerializedName("type")
    Type type;

    private CustomField(
        Dropdown dropdown,
        Map<String, Object> extraParams,
        String key,
        Label label,
        Numeric numeric,
        Boolean optional,
        Text text,
        Type type) {
      this.dropdown = dropdown;
      this.extraParams = extraParams;
      this.key = key;
      this.label = label;
      this.numeric = numeric;
      this.optional = optional;
      this.text = text;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Dropdown dropdown;

      private Map<String, Object> extraParams;

      private String key;

      private Label label;

      private Numeric numeric;

      private Boolean optional;

      private Text text;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.CustomField build() {
        return new SessionCreateParams.CustomField(
            this.dropdown,
            this.extraParams,
            this.key,
            this.label,
            this.numeric,
            this.optional,
            this.text,
            this.type);
      }

      /** Configuration for {@code type=dropdown} fields. */
      public Builder setDropdown(SessionCreateParams.CustomField.Dropdown dropdown) {
        this.dropdown = dropdown;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.CustomField#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.CustomField#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> String of your choice that your integration can use to reconcile
       * this field. Must be unique to this field, alphanumeric, and up to 200 characters.
       */
      public Builder setKey(String key) {
        this.key = key;
        return this;
      }

      /** <strong>Required.</strong> The label for the field, displayed to the customer. */
      public Builder setLabel(SessionCreateParams.CustomField.Label label) {
        this.label = label;
        return this;
      }

      /** Configuration for {@code type=numeric} fields. */
      public Builder setNumeric(SessionCreateParams.CustomField.Numeric numeric) {
        this.numeric = numeric;
        return this;
      }

      /**
       * Whether the customer is required to complete the field before completing the Checkout
       * Session. Defaults to {@code false}.
       */
      public Builder setOptional(Boolean optional) {
        this.optional = optional;
        return this;
      }

      /** Configuration for {@code type=text} fields. */
      public Builder setText(SessionCreateParams.CustomField.Text text) {
        this.text = text;
        return this;
      }

      /** <strong>Required.</strong> The type of the field. */
      public Builder setType(SessionCreateParams.CustomField.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class Dropdown {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The options available for the customer to select. Up to 200
       * options allowed.
       */
      @SerializedName("options")
      List<SessionCreateParams.CustomField.Dropdown.Option> options;

      private Dropdown(
          Map<String, Object> extraParams,
          List<SessionCreateParams.CustomField.Dropdown.Option> options) {
        this.extraParams = extraParams;
        this.options = options;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<SessionCreateParams.CustomField.Dropdown.Option> options;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomField.Dropdown build() {
          return new SessionCreateParams.CustomField.Dropdown(this.extraParams, this.options);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomField.Dropdown#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomField.Dropdown#extraParams} for the field
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
         * Add an element to `options` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addOption(SessionCreateParams.CustomField.Dropdown.Option element) {
          if (this.options == null) {
            this.options = new ArrayList<>();
          }
          this.options.add(element);
          return this;
        }

        /**
         * Add all elements to `options` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addAllOption(
            List<SessionCreateParams.CustomField.Dropdown.Option> elements) {
          if (this.options == null) {
            this.options = new ArrayList<>();
          }
          this.options.addAll(elements);
          return this;
        }
      }

      @Getter
      public static class Option {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The label for the option, displayed to the customer. Up to 100
         * characters.
         */
        @SerializedName("label")
        String label;

        /**
         * <strong>Required.</strong> The value for this option, not displayed to the customer, used
         * by your integration to reconcile the option selected by the customer. Must be unique to
         * this option, alphanumeric, and up to 100 characters.
         */
        @SerializedName("value")
        String value;

        private Option(Map<String, Object> extraParams, String label, String value) {
          this.extraParams = extraParams;
          this.label = label;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String label;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.CustomField.Dropdown.Option build() {
            return new SessionCreateParams.CustomField.Dropdown.Option(
                this.extraParams, this.label, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.CustomField.Dropdown.Option#extraParams} for the
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
           * map. See {@link SessionCreateParams.CustomField.Dropdown.Option#extraParams} for the
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
           * <strong>Required.</strong> The label for the option, displayed to the customer. Up to
           * 100 characters.
           */
          public Builder setLabel(String label) {
            this.label = label;
            return this;
          }

          /**
           * <strong>Required.</strong> The value for this option, not displayed to the customer,
           * used by your integration to reconcile the option selected by the customer. Must be
           * unique to this option, alphanumeric, and up to 100 characters.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Label {
      /**
       * <strong>Required.</strong> Custom text for the label, displayed to the customer. Up to 50
       * characters.
       */
      @SerializedName("custom")
      String custom;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The type of the label. */
      @SerializedName("type")
      Type type;

      private Label(String custom, Map<String, Object> extraParams, Type type) {
        this.custom = custom;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String custom;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomField.Label build() {
          return new SessionCreateParams.CustomField.Label(
              this.custom, this.extraParams, this.type);
        }

        /**
         * <strong>Required.</strong> Custom text for the label, displayed to the customer. Up to 50
         * characters.
         */
        public Builder setCustom(String custom) {
          this.custom = custom;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomField.Label#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomField.Label#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The type of the label. */
        public Builder setType(SessionCreateParams.CustomField.Label.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("custom")
        CUSTOM("custom");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Numeric {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      private Numeric(Map<String, Object> extraParams, Long maximumLength, Long minimumLength) {
        this.extraParams = extraParams;
        this.maximumLength = maximumLength;
        this.minimumLength = minimumLength;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long maximumLength;

        private Long minimumLength;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomField.Numeric build() {
          return new SessionCreateParams.CustomField.Numeric(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomField.Numeric#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomField.Numeric#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The maximum character length constraint for the customer's input. */
        public Builder setMaximumLength(Long maximumLength) {
          this.maximumLength = maximumLength;
          return this;
        }

        /** The minimum character length requirement for the customer's input. */
        public Builder setMinimumLength(Long minimumLength) {
          this.minimumLength = minimumLength;
          return this;
        }
      }
    }

    @Getter
    public static class Text {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      private Text(Map<String, Object> extraParams, Long maximumLength, Long minimumLength) {
        this.extraParams = extraParams;
        this.maximumLength = maximumLength;
        this.minimumLength = minimumLength;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long maximumLength;

        private Long minimumLength;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomField.Text build() {
          return new SessionCreateParams.CustomField.Text(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomField.Text#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomField.Text#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The maximum character length constraint for the customer's input. */
        public Builder setMaximumLength(Long maximumLength) {
          this.maximumLength = maximumLength;
          return this;
        }

        /** The minimum character length requirement for the customer's input. */
        public Builder setMinimumLength(Long minimumLength) {
          this.minimumLength = minimumLength;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("dropdown")
      DROPDOWN("dropdown"),

      @SerializedName("numeric")
      NUMERIC("numeric"),

      @SerializedName("text")
      TEXT("text");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class CustomText {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Custom text that should be displayed alongside shipping address collection. */
    @SerializedName("shipping_address")
    Object shippingAddress;

    /** Custom text that should be displayed alongside the payment confirmation button. */
    @SerializedName("submit")
    Object submit;

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    @SerializedName("terms_of_service_acceptance")
    Object termsOfServiceAcceptance;

    private CustomText(
        Map<String, Object> extraParams,
        Object shippingAddress,
        Object submit,
        Object termsOfServiceAcceptance) {
      this.extraParams = extraParams;
      this.shippingAddress = shippingAddress;
      this.submit = submit;
      this.termsOfServiceAcceptance = termsOfServiceAcceptance;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingAddress;

      private Object submit;

      private Object termsOfServiceAcceptance;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.CustomText build() {
        return new SessionCreateParams.CustomText(
            this.extraParams, this.shippingAddress, this.submit, this.termsOfServiceAcceptance);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.CustomText#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.CustomText#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(
          SessionCreateParams.CustomText.ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(SessionCreateParams.CustomText.Submit submit) {
        this.submit = submit;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(EmptyParam submit) {
        this.submit = submit;
        return this;
      }

      /**
       * Custom text that should be displayed in place of the default terms of service agreement
       * text.
       */
      public Builder setTermsOfServiceAcceptance(
          SessionCreateParams.CustomText.TermsOfServiceAcceptance termsOfServiceAcceptance) {
        this.termsOfServiceAcceptance = termsOfServiceAcceptance;
        return this;
      }

      /**
       * Custom text that should be displayed in place of the default terms of service agreement
       * text.
       */
      public Builder setTermsOfServiceAcceptance(EmptyParam termsOfServiceAcceptance) {
        this.termsOfServiceAcceptance = termsOfServiceAcceptance;
        return this;
      }
    }

    @Getter
    public static class ShippingAddress {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private ShippingAddress(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomText.ShippingAddress build() {
          return new SessionCreateParams.CustomText.ShippingAddress(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomText.ShippingAddress#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomText.ShippingAddress#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }

    @Getter
    public static class Submit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private Submit(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomText.Submit build() {
          return new SessionCreateParams.CustomText.Submit(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomText.Submit#extraParams} for the field
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
         * map. See {@link SessionCreateParams.CustomText.Submit#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }

    @Getter
    public static class TermsOfServiceAcceptance {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private TermsOfServiceAcceptance(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.CustomText.TermsOfServiceAcceptance build() {
          return new SessionCreateParams.CustomText.TermsOfServiceAcceptance(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.CustomText.TermsOfServiceAcceptance#extraParams} for
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
         * map. See {@link SessionCreateParams.CustomText.TermsOfServiceAcceptance#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }
  }

  @Getter
  public static class CustomerUpdate {
    /**
     * Describes whether Checkout saves the billing address onto {@code customer.address}. To always
     * collect a full billing address, use {@code billing_address_collection}. Defaults to {@code
     * never}.
     */
    @SerializedName("address")
    Address address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Describes whether Checkout saves the name onto {@code customer.name}. Defaults to {@code
     * never}.
     */
    @SerializedName("name")
    Name name;

    /**
     * Describes whether Checkout saves shipping information onto {@code customer.shipping}. To
     * collect shipping information, use {@code shipping_address_collection}. Defaults to {@code
     * never}.
     */
    @SerializedName("shipping")
    Shipping shipping;

    private CustomerUpdate(
        Address address, Map<String, Object> extraParams, Name name, Shipping shipping) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.shipping = shipping;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private Name name;

      private Shipping shipping;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.CustomerUpdate build() {
        return new SessionCreateParams.CustomerUpdate(
            this.address, this.extraParams, this.name, this.shipping);
      }

      /**
       * Describes whether Checkout saves the billing address onto {@code customer.address}. To
       * always collect a full billing address, use {@code billing_address_collection}. Defaults to
       * {@code never}.
       */
      public Builder setAddress(SessionCreateParams.CustomerUpdate.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.CustomerUpdate#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.CustomerUpdate#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Describes whether Checkout saves the name onto {@code customer.name}. Defaults to {@code
       * never}.
       */
      public Builder setName(SessionCreateParams.CustomerUpdate.Name name) {
        this.name = name;
        return this;
      }

      /**
       * Describes whether Checkout saves shipping information onto {@code customer.shipping}. To
       * collect shipping information, use {@code shipping_address_collection}. Defaults to {@code
       * never}.
       */
      public Builder setShipping(SessionCreateParams.CustomerUpdate.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }
    }

    public enum Address implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("never")
      NEVER("never");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Address(String value) {
        this.value = value;
      }
    }

    public enum Name implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("never")
      NEVER("never");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Name(String value) {
        this.value = value;
      }
    }

    public enum Shipping implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("never")
      NEVER("never");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Shipping(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Discount {
    /** The ID of the coupon to apply to this Session. */
    @SerializedName("coupon")
    String coupon;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of a promotion code to apply to this Session. */
    @SerializedName("promotion_code")
    String promotionCode;

    private Discount(String coupon, Map<String, Object> extraParams, String promotionCode) {
      this.coupon = coupon;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private Map<String, Object> extraParams;

      private String promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.Discount build() {
        return new SessionCreateParams.Discount(this.coupon, this.extraParams, this.promotionCode);
      }

      /** The ID of the coupon to apply to this Session. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.Discount#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of a promotion code to apply to this Session. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }
  }

  @Getter
  public static class InvoiceCreation {
    /** <strong>Required.</strong> Set to {@code true} to enable invoice creation. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameters passed when creating invoices for payment-mode Checkout Sessions. */
    @SerializedName("invoice_data")
    InvoiceData invoiceData;

    private InvoiceCreation(
        Boolean enabled, Map<String, Object> extraParams, InvoiceData invoiceData) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.invoiceData = invoiceData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private InvoiceData invoiceData;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.InvoiceCreation build() {
        return new SessionCreateParams.InvoiceCreation(
            this.enabled, this.extraParams, this.invoiceData);
      }

      /** <strong>Required.</strong> Set to {@code true} to enable invoice creation. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.InvoiceCreation#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.InvoiceCreation#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameters passed when creating invoices for payment-mode Checkout Sessions. */
      public Builder setInvoiceData(SessionCreateParams.InvoiceCreation.InvoiceData invoiceData) {
        this.invoiceData = invoiceData;
        return this;
      }
    }

    @Getter
    public static class InvoiceData {
      /** The account tax IDs associated with the invoice. */
      @SerializedName("account_tax_ids")
      Object accountTaxIds;

      /** Default custom fields to be displayed on invoices for this customer. */
      @SerializedName("custom_fields")
      Object customFields;

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Default footer to be displayed on invoices for this customer. */
      @SerializedName("footer")
      String footer;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** Default options for invoice PDF rendering for this customer. */
      @SerializedName("rendering_options")
      Object renderingOptions;

      private InvoiceData(
          Object accountTaxIds,
          Object customFields,
          String description,
          Map<String, Object> extraParams,
          String footer,
          Map<String, String> metadata,
          Object renderingOptions) {
        this.accountTaxIds = accountTaxIds;
        this.customFields = customFields;
        this.description = description;
        this.extraParams = extraParams;
        this.footer = footer;
        this.metadata = metadata;
        this.renderingOptions = renderingOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountTaxIds;

        private Object customFields;

        private String description;

        private Map<String, Object> extraParams;

        private String footer;

        private Map<String, String> metadata;

        private Object renderingOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.InvoiceCreation.InvoiceData build() {
          return new SessionCreateParams.InvoiceCreation.InvoiceData(
              this.accountTaxIds,
              this.customFields,
              this.description,
              this.extraParams,
              this.footer,
              this.metadata,
              this.renderingOptions);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAccountTaxId(String element) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).add(element);
          return this;
        }

        /**
         * Add all elements to `accountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link SessionCreateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAccountTaxId(List<String> elements) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).addAll(elements);
          return this;
        }

        /** The account tax IDs associated with the invoice. */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /** The account tax IDs associated with the invoice. */
        public Builder setAccountTaxIds(List<String> accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addCustomField(
            SessionCreateParams.InvoiceCreation.InvoiceData.CustomField element) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField>) this.customFields)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllCustomField(
            List<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField> elements) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField>) this.customFields)
              .addAll(elements);
          return this;
        }

        /** Default custom fields to be displayed on invoices for this customer. */
        public Builder setCustomFields(EmptyParam customFields) {
          this.customFields = customFields;
          return this;
        }

        /** Default custom fields to be displayed on invoices for this customer. */
        public Builder setCustomFields(
            List<SessionCreateParams.InvoiceCreation.InvoiceData.CustomField> customFields) {
          this.customFields = customFields;
          return this;
        }

        /** An arbitrary string attached to the object. Often useful for displaying to users. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.InvoiceCreation.InvoiceData#extraParams} for the
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
         * map. See {@link SessionCreateParams.InvoiceCreation.InvoiceData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Default footer to be displayed on invoices for this customer. */
        public Builder setFooter(String footer) {
          this.footer = footer;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SessionCreateParams.InvoiceCreation.InvoiceData#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.InvoiceCreation.InvoiceData#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** Default options for invoice PDF rendering for this customer. */
        public Builder setRenderingOptions(
            SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions renderingOptions) {
          this.renderingOptions = renderingOptions;
          return this;
        }

        /** Default options for invoice PDF rendering for this customer. */
        public Builder setRenderingOptions(EmptyParam renderingOptions) {
          this.renderingOptions = renderingOptions;
          return this;
        }
      }

      @Getter
      public static class CustomField {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The name of the custom field. This may be up to 30 characters.
         */
        @SerializedName("name")
        String name;

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 30
         * characters.
         */
        @SerializedName("value")
        String value;

        private CustomField(Map<String, Object> extraParams, String name, String value) {
          this.extraParams = extraParams;
          this.name = name;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.InvoiceCreation.InvoiceData.CustomField build() {
            return new SessionCreateParams.InvoiceCreation.InvoiceData.CustomField(
                this.extraParams, this.name, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the field
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
           * map. See {@link
           * SessionCreateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the field
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
           * <strong>Required.</strong> The name of the custom field. This may be up to 30
           * characters.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the custom field. This may be up to 30
           * characters.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }

      @Getter
      public static class RenderingOptions {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
         * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in invoice
         * PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive alike)
         * from invoice PDF amounts.
         */
        @SerializedName("amount_tax_display")
        ApiRequestParams.EnumParam amountTaxDisplay;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private RenderingOptions(
            ApiRequestParams.EnumParam amountTaxDisplay, Map<String, Object> extraParams) {
          this.amountTaxDisplay = amountTaxDisplay;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private ApiRequestParams.EnumParam amountTaxDisplay;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions build() {
            return new SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions(
                this.amountTaxDisplay, this.extraParams);
          }

          /**
           * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
           * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
           * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in
           * invoice PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive
           * alike) from invoice PDF amounts.
           */
          public Builder setAmountTaxDisplay(
              SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions.AmountTaxDisplay
                  amountTaxDisplay) {
            this.amountTaxDisplay = amountTaxDisplay;
            return this;
          }

          /**
           * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
           * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
           * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in
           * invoice PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive
           * alike) from invoice PDF amounts.
           */
          public Builder setAmountTaxDisplay(EmptyParam amountTaxDisplay) {
            this.amountTaxDisplay = amountTaxDisplay;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for the
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
           * SessionCreateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for the
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

        public enum AmountTaxDisplay implements ApiRequestParams.EnumParam {
          @SerializedName("exclude_tax")
          EXCLUDE_TAX("exclude_tax"),

          @SerializedName("include_inclusive_tax")
          INCLUDE_INCLUSIVE_TAX("include_inclusive_tax");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AmountTaxDisplay(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  @Getter
  public static class LineItem {
    /**
     * When set, provides configuration for this item’s quantity to be adjusted by the customer
     * during Checkout.
     */
    @SerializedName("adjustable_quantity")
    AdjustableQuantity adjustableQuantity;

    /**
     * The <a href="https://stripe.com/docs/api/tax_rates">tax rates</a> that will be applied to
     * this line item depending on the customer's billing/shipping address. We currently support the
     * following countries: US, GB, AU, and all countries in the EU.
     */
    @SerializedName("dynamic_tax_rates")
    List<String> dynamicTaxRates;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The ID of the <a href="https://stripe.com/docs/api/prices">Price</a> or <a
     * href="https://stripe.com/docs/api/plans">Plan</a> object. One of {@code price} or {@code
     * price_data} is required.
     */
    @SerializedName("price")
    String price;

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /**
     * The quantity of the line item being purchased. Quantity should not be defined when {@code
     * recurring.usage_type=metered}.
     */
    @SerializedName("quantity")
    Long quantity;

    /**
     * The <a href="https://stripe.com/docs/api/tax_rates">tax rates</a> which apply to this line
     * item.
     */
    @SerializedName("tax_rates")
    List<String> taxRates;

    private LineItem(
        AdjustableQuantity adjustableQuantity,
        List<String> dynamicTaxRates,
        Map<String, Object> extraParams,
        String price,
        PriceData priceData,
        Long quantity,
        List<String> taxRates) {
      this.adjustableQuantity = adjustableQuantity;
      this.dynamicTaxRates = dynamicTaxRates;
      this.extraParams = extraParams;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
      this.taxRates = taxRates;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AdjustableQuantity adjustableQuantity;

      private List<String> dynamicTaxRates;

      private Map<String, Object> extraParams;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private List<String> taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.LineItem build() {
        return new SessionCreateParams.LineItem(
            this.adjustableQuantity,
            this.dynamicTaxRates,
            this.extraParams,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates);
      }

      /**
       * When set, provides configuration for this item’s quantity to be adjusted by the customer
       * during Checkout.
       */
      public Builder setAdjustableQuantity(
          SessionCreateParams.LineItem.AdjustableQuantity adjustableQuantity) {
        this.adjustableQuantity = adjustableQuantity;
        return this;
      }

      /**
       * Add an element to `dynamicTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.LineItem#dynamicTaxRates} for the field documentation.
       */
      public Builder addDynamicTaxRate(String element) {
        if (this.dynamicTaxRates == null) {
          this.dynamicTaxRates = new ArrayList<>();
        }
        this.dynamicTaxRates.add(element);
        return this;
      }

      /**
       * Add all elements to `dynamicTaxRates` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SessionCreateParams.LineItem#dynamicTaxRates} for the field documentation.
       */
      public Builder addAllDynamicTaxRate(List<String> elements) {
        if (this.dynamicTaxRates == null) {
          this.dynamicTaxRates = new ArrayList<>();
        }
        this.dynamicTaxRates.addAll(elements);
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
       * The ID of the <a href="https://stripe.com/docs/api/prices">Price</a> or <a
       * href="https://stripe.com/docs/api/plans">Plan</a> object. One of {@code price} or {@code
       * price_data} is required.
       */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(SessionCreateParams.LineItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /**
       * The quantity of the line item being purchased. Quantity should not be defined when {@code
       * recurring.usage_type=metered}.
       */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.LineItem#taxRates} for the field documentation.
       */
      public Builder addTaxRate(String element) {
        if (this.taxRates == null) {
          this.taxRates = new ArrayList<>();
        }
        this.taxRates.add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.LineItem#taxRates} for the field documentation.
       */
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null) {
          this.taxRates = new ArrayList<>();
        }
        this.taxRates.addAll(elements);
        return this;
      }
    }

    @Getter
    public static class AdjustableQuantity {
      /**
       * <strong>Required.</strong> Set to true if the quantity can be adjusted to any non-negative
       * integer. By default customers will be able to remove the line item by setting the quantity
       * to 0.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The maximum quantity the customer can purchase for the Checkout Session. By default this
       * value is 99. You can specify a value up to 999999.
       */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum quantity the customer must purchase for the Checkout Session. By default this
       * value is 0.
       */
      @SerializedName("minimum")
      Long minimum;

      private AdjustableQuantity(
          Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.maximum = maximum;
        this.minimum = minimum;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Long maximum;

        private Long minimum;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.LineItem.AdjustableQuantity build() {
          return new SessionCreateParams.LineItem.AdjustableQuantity(
              this.enabled, this.extraParams, this.maximum, this.minimum);
        }

        /**
         * <strong>Required.</strong> Set to true if the quantity can be adjusted to any
         * non-negative integer. By default customers will be able to remove the line item by
         * setting the quantity to 0.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.LineItem.AdjustableQuantity#extraParams} for the
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
         * map. See {@link SessionCreateParams.LineItem.AdjustableQuantity#extraParams} for the
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
         * The maximum quantity the customer can purchase for the Checkout Session. By default this
         * value is 99. You can specify a value up to 999999.
         */
        public Builder setMaximum(Long maximum) {
          this.maximum = maximum;
          return this;
        }

        /**
         * The minimum quantity the customer must purchase for the Checkout Session. By default this
         * value is 0.
         */
        public Builder setMinimum(Long minimum) {
          this.minimum = minimum;
          return this;
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The ID of the product that this price will belong to. One of {@code product} or {@code
       * product_data} is required.
       */
      @SerializedName("product")
      String product;

      /**
       * Data used to generate a new product object inline. One of {@code product} or {@code
       * product_data} is required.
       */
      @SerializedName("product_data")
      ProductData productData;

      /**
       * The recurring components of a price such as {@code interval} and {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A non-negative integer in cents (or local equivalent) representing how much to charge. One
       * of {@code unit_amount} or {@code unit_amount_decimal} is required.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          ProductData productData,
          Recurring recurring,
          TaxBehavior taxBehavior,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.productData = productData;
        this.recurring = recurring;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String currency;

        private Map<String, Object> extraParams;

        private String product;

        private ProductData productData;

        private Recurring recurring;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.LineItem.PriceData build() {
          return new SessionCreateParams.LineItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.productData,
              this.recurring,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link SessionCreateParams.LineItem.PriceData#extraParams} for the field
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
         * The ID of the product that this price will belong to. One of {@code product} or {@code
         * product_data} is required.
         */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * Data used to generate a new product object inline. One of {@code product} or {@code
         * product_data} is required.
         */
        public Builder setProductData(
            SessionCreateParams.LineItem.PriceData.ProductData productData) {
          this.productData = productData;
          return this;
        }

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        public Builder setRecurring(SessionCreateParams.LineItem.PriceData.Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            SessionCreateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A non-negative integer in cents (or local equivalent) representing how much to charge.
         * One of {@code unit_amount} or {@code unit_amount_decimal} is required.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      @Getter
      public static class ProductData {
        /**
         * The product's description, meant to be displayable to the customer. Use this field to
         * optionally store a long form explanation of the product being sold for your own rendering
         * purposes.
         */
        @SerializedName("description")
        String description;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * A list of up to 8 URLs of images for this product, meant to be displayable to the
         * customer.
         */
        @SerializedName("images")
        List<String> images;

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        @SerializedName("name")
        String name;

        /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
        @SerializedName("tax_code")
        String taxCode;

        private ProductData(
            String description,
            Map<String, Object> extraParams,
            List<String> images,
            Map<String, String> metadata,
            String name,
            String taxCode) {
          this.description = description;
          this.extraParams = extraParams;
          this.images = images;
          this.metadata = metadata;
          this.name = name;
          this.taxCode = taxCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String description;

          private Map<String, Object> extraParams;

          private List<String> images;

          private Map<String, String> metadata;

          private String name;

          private String taxCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.LineItem.PriceData.ProductData build() {
            return new SessionCreateParams.LineItem.PriceData.ProductData(
                this.description,
                this.extraParams,
                this.images,
                this.metadata,
                this.name,
                this.taxCode);
          }

          /**
           * The product's description, meant to be displayable to the customer. Use this field to
           * optionally store a long form explanation of the product being sold for your own
           * rendering purposes.
           */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.LineItem.PriceData.ProductData#extraParams} for the
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
           * map. See {@link SessionCreateParams.LineItem.PriceData.ProductData#extraParams} for the
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
           * Add an element to `images` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.LineItem.PriceData.ProductData#images} for the field documentation.
           */
          public Builder addImage(String element) {
            if (this.images == null) {
              this.images = new ArrayList<>();
            }
            this.images.add(element);
            return this;
          }

          /**
           * Add all elements to `images` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.LineItem.PriceData.ProductData#images} for the field documentation.
           */
          public Builder addAllImage(List<String> elements) {
            if (this.images == null) {
              this.images = new ArrayList<>();
            }
            this.images.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link SessionCreateParams.LineItem.PriceData.ProductData#metadata} for the field
           * documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.LineItem.PriceData.ProductData#metadata} for the
           * field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
          public Builder setTaxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
          }
        }
      }

      @Getter
      public static class Recurring {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
         * interval allowed (1 year, 12 months, or 52 weeks).
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Recurring(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.LineItem.PriceData.Recurring build() {
            return new SessionCreateParams.LineItem.PriceData.Recurring(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.LineItem.PriceData.Recurring#extraParams} for the
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
           * map. See {@link SessionCreateParams.LineItem.PriceData.Recurring#extraParams} for the
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
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              SessionCreateParams.LineItem.PriceData.Recurring.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
           * interval allowed (1 year, 12 months, or 52 weeks).
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class PaymentIntentData {
    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total payment amount. For more information,
     * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case
     * for connected accounts</a>.
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
     * <a href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    @SerializedName("on_behalf_of")
    String onBehalfOf;

    /**
     * Email address that the receipt for the resulting payment will be sent to. If {@code
     * receipt_email} is specified for a payment in live mode, a receipt will be sent regardless of
     * your <a href="https://dashboard.stripe.com/account/emails">email settings</a>.
     */
    @SerializedName("receipt_email")
    String receiptEmail;

    /**
     * Indicates that you intend to <a
     * href="https://stripe.com/docs/payments/payment-intents#future-usage">make future payments</a>
     * with the payment method collected by this Checkout Session.
     *
     * <p>When setting this to {@code on_session}, Checkout will show a notice to the customer that
     * their payment details will be saved.
     *
     * <p>When setting this to {@code off_session}, Checkout will show a notice to the customer that
     * their payment details will be saved and used for future payments.
     *
     * <p>If a Customer has been provided or Checkout creates a new Customer, Checkout will attach
     * the payment method to the Customer.
     *
     * <p>If Checkout does not create a Customer, the payment method is not attached to a Customer.
     * To reuse the payment method, you can retrieve it from the Checkout Session's PaymentIntent.
     *
     * <p>When processing card payments, Checkout also uses {@code setup_future_usage} to
     * dynamically optimize your payment flow and comply with regional legislation and network
     * rules, such as SCA.
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
     * Provides information about the charge that customers see on their statements. Concatenated
     * with the prefix (shortened descriptor) or statement descriptor that’s set on the account to
     * form the complete statement descriptor. Maximum 22 characters for the concatenated
     * descriptor.
     */
    @SerializedName("statement_descriptor_suffix")
    String statementDescriptorSuffix;

    /**
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    @SerializedName("transfer_data")
    TransferData transferData;

    /**
     * A string that identifies the resulting payment as part of a group. See the PaymentIntents <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for connected
     * accounts</a> for details.
     */
    @SerializedName("transfer_group")
    String transferGroup;

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
        String statementDescriptorSuffix,
        TransferData transferData,
        String transferGroup) {
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
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      this.transferData = transferData;
      this.transferGroup = transferGroup;
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

      private String statementDescriptorSuffix;

      private TransferData transferData;

      private String transferGroup;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.PaymentIntentData build() {
        return new SessionCreateParams.PaymentIntentData(
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
            this.statementDescriptorSuffix,
            this.transferData,
            this.transferGroup);
      }

      /**
       * The amount of the application fee (if any) that will be requested to be applied to the
       * payment and transferred to the application owner's Stripe account. The amount of the
       * application fee collected will be capped at the total payment amount. For more information,
       * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use
       * case for connected accounts</a>.
       */
      public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
        return this;
      }

      /** Controls when the funds will be captured from the customer's account. */
      public Builder setCaptureMethod(
          SessionCreateParams.PaymentIntentData.CaptureMethod captureMethod) {
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
       * PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case for
       * connected accounts</a>.
       */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * Email address that the receipt for the resulting payment will be sent to. If {@code
       * receipt_email} is specified for a payment in live mode, a receipt will be sent regardless
       * of your <a href="https://dashboard.stripe.com/account/emails">email settings</a>.
       */
      public Builder setReceiptEmail(String receiptEmail) {
        this.receiptEmail = receiptEmail;
        return this;
      }

      /**
       * Indicates that you intend to <a
       * href="https://stripe.com/docs/payments/payment-intents#future-usage">make future
       * payments</a> with the payment method collected by this Checkout Session.
       *
       * <p>When setting this to {@code on_session}, Checkout will show a notice to the customer
       * that their payment details will be saved.
       *
       * <p>When setting this to {@code off_session}, Checkout will show a notice to the customer
       * that their payment details will be saved and used for future payments.
       *
       * <p>If a Customer has been provided or Checkout creates a new Customer, Checkout will attach
       * the payment method to the Customer.
       *
       * <p>If Checkout does not create a Customer, the payment method is not attached to a
       * Customer. To reuse the payment method, you can retrieve it from the Checkout Session's
       * PaymentIntent.
       *
       * <p>When processing card payments, Checkout also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as SCA.
       */
      public Builder setSetupFutureUsage(
          SessionCreateParams.PaymentIntentData.SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
        return this;
      }

      /** Shipping information for this payment. */
      public Builder setShipping(SessionCreateParams.PaymentIntentData.Shipping shipping) {
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
       * Provides information about the charge that customers see on their statements. Concatenated
       * with the prefix (shortened descriptor) or statement descriptor that’s set on the account to
       * form the complete statement descriptor. Maximum 22 characters for the concatenated
       * descriptor.
       */
      public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
        this.statementDescriptorSuffix = statementDescriptorSuffix;
        return this;
      }

      /**
       * The parameters used to automatically create a Transfer when the payment succeeds. For more
       * information, see the PaymentIntents <a
       * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
       * accounts</a>.
       */
      public Builder setTransferData(
          SessionCreateParams.PaymentIntentData.TransferData transferData) {
        this.transferData = transferData;
        return this;
      }

      /**
       * A string that identifies the resulting payment as part of a group. See the PaymentIntents
       * <a href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for
       * connected accounts</a> for details.
       */
      public Builder setTransferGroup(String transferGroup) {
        this.transferGroup = transferGroup;
        return this;
      }
    }

    @Getter
    public static class Shipping {
      /** <strong>Required.</strong> Shipping address. */
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

      /** <strong>Required.</strong> Recipient name. */
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
        public SessionCreateParams.PaymentIntentData.Shipping build() {
          return new SessionCreateParams.PaymentIntentData.Shipping(
              this.address,
              this.carrier,
              this.extraParams,
              this.name,
              this.phone,
              this.trackingNumber);
        }

        /** <strong>Required.</strong> Shipping address. */
        public Builder setAddress(SessionCreateParams.PaymentIntentData.Shipping.Address address) {
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

        /** <strong>Required.</strong> Recipient name. */
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
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
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

        /** <strong>Required.</strong> Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
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

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
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

          /** <strong>Required.</strong> Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    public static class TransferData {
      /** The amount that will be transferred automatically when a charge succeeds. */
      @SerializedName("amount")
      Long amount;

      /**
       * <strong>Required.</strong> If specified, successful charges will be attributed to the
       * destination account for tax reporting, and the funds from charges will be transferred to
       * the destination account. The ID of the resulting transfer will be returned on the
       * successful charge's {@code transfer} field.
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

      private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
        this.amount = amount;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentIntentData.TransferData build() {
          return new SessionCreateParams.PaymentIntentData.TransferData(
              this.amount, this.destination, this.extraParams);
        }

        /** The amount that will be transferred automatically when a charge succeeds. */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * <strong>Required.</strong> If specified, successful charges will be attributed to the
         * destination account for tax reporting, and the funds from charges will be transferred to
         * the destination account. The ID of the resulting transfer will be returned on the
         * successful charge's {@code transfer} field.
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

      @SerializedName("automatic_async")
      AUTOMATIC_ASYNC("automatic_async"),

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
  public static class PaymentMethodOptions {
    /** contains details about the ACSS Debit payment method options. */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /** contains details about the Affirm payment method options. */
    @SerializedName("affirm")
    Affirm affirm;

    /** contains details about the Afterpay Clearpay payment method options. */
    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    /** contains details about the Alipay payment method options. */
    @SerializedName("alipay")
    Alipay alipay;

    /** contains details about the AU Becs Debit payment method options. */
    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    /** contains details about the Bacs Debit payment method options. */
    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    /** contains details about the Bancontact payment method options. */
    @SerializedName("bancontact")
    Bancontact bancontact;

    /** contains details about the Boleto payment method options. */
    @SerializedName("boleto")
    Boleto boleto;

    /** contains details about the Card payment method options. */
    @SerializedName("card")
    Card card;

    /** contains details about the Cashapp Pay payment method options. */
    @SerializedName("cashapp")
    Cashapp cashapp;

    /** contains details about the Customer Balance payment method options. */
    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    /** contains details about the EPS payment method options. */
    @SerializedName("eps")
    Eps eps;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** contains details about the FPX payment method options. */
    @SerializedName("fpx")
    Fpx fpx;

    /** contains details about the Giropay payment method options. */
    @SerializedName("giropay")
    Giropay giropay;

    /** contains details about the Grabpay payment method options. */
    @SerializedName("grabpay")
    Grabpay grabpay;

    /** contains details about the Ideal payment method options. */
    @SerializedName("ideal")
    Ideal ideal;

    /** contains details about the Klarna payment method options. */
    @SerializedName("klarna")
    Klarna klarna;

    /** contains details about the Konbini payment method options. */
    @SerializedName("konbini")
    Konbini konbini;

    /** contains details about the Link payment method options. */
    @SerializedName("link")
    Link link;

    /** contains details about the OXXO payment method options. */
    @SerializedName("oxxo")
    Oxxo oxxo;

    /** contains details about the P24 payment method options. */
    @SerializedName("p24")
    P24 p24;

    /** contains details about the PayNow payment method options. */
    @SerializedName("paynow")
    Paynow paynow;

    /** contains details about the PayPal payment method options. */
    @SerializedName("paypal")
    Paypal paypal;

    /** contains details about the Pix payment method options. */
    @SerializedName("pix")
    Pix pix;

    /** contains details about the Sepa Debit payment method options. */
    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    /** contains details about the Sofort payment method options. */
    @SerializedName("sofort")
    Sofort sofort;

    /** contains details about the Us Bank Account payment method options. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /** contains details about the WeChat Pay payment method options. */
    @SerializedName("wechat_pay")
    WechatPay wechatPay;

    private PaymentMethodOptions(
        AcssDebit acssDebit,
        Affirm affirm,
        AfterpayClearpay afterpayClearpay,
        Alipay alipay,
        AuBecsDebit auBecsDebit,
        BacsDebit bacsDebit,
        Bancontact bancontact,
        Boleto boleto,
        Card card,
        Cashapp cashapp,
        CustomerBalance customerBalance,
        Eps eps,
        Map<String, Object> extraParams,
        Fpx fpx,
        Giropay giropay,
        Grabpay grabpay,
        Ideal ideal,
        Klarna klarna,
        Konbini konbini,
        Link link,
        Oxxo oxxo,
        P24 p24,
        Paynow paynow,
        Paypal paypal,
        Pix pix,
        SepaDebit sepaDebit,
        Sofort sofort,
        UsBankAccount usBankAccount,
        WechatPay wechatPay) {
      this.acssDebit = acssDebit;
      this.affirm = affirm;
      this.afterpayClearpay = afterpayClearpay;
      this.alipay = alipay;
      this.auBecsDebit = auBecsDebit;
      this.bacsDebit = bacsDebit;
      this.bancontact = bancontact;
      this.boleto = boleto;
      this.card = card;
      this.cashapp = cashapp;
      this.customerBalance = customerBalance;
      this.eps = eps;
      this.extraParams = extraParams;
      this.fpx = fpx;
      this.giropay = giropay;
      this.grabpay = grabpay;
      this.ideal = ideal;
      this.klarna = klarna;
      this.konbini = konbini;
      this.link = link;
      this.oxxo = oxxo;
      this.p24 = p24;
      this.paynow = paynow;
      this.paypal = paypal;
      this.pix = pix;
      this.sepaDebit = sepaDebit;
      this.sofort = sofort;
      this.usBankAccount = usBankAccount;
      this.wechatPay = wechatPay;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebit acssDebit;

      private Affirm affirm;

      private AfterpayClearpay afterpayClearpay;

      private Alipay alipay;

      private AuBecsDebit auBecsDebit;

      private BacsDebit bacsDebit;

      private Bancontact bancontact;

      private Boleto boleto;

      private Card card;

      private Cashapp cashapp;

      private CustomerBalance customerBalance;

      private Eps eps;

      private Map<String, Object> extraParams;

      private Fpx fpx;

      private Giropay giropay;

      private Grabpay grabpay;

      private Ideal ideal;

      private Klarna klarna;

      private Konbini konbini;

      private Link link;

      private Oxxo oxxo;

      private P24 p24;

      private Paynow paynow;

      private Paypal paypal;

      private Pix pix;

      private SepaDebit sepaDebit;

      private Sofort sofort;

      private UsBankAccount usBankAccount;

      private WechatPay wechatPay;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.PaymentMethodOptions build() {
        return new SessionCreateParams.PaymentMethodOptions(
            this.acssDebit,
            this.affirm,
            this.afterpayClearpay,
            this.alipay,
            this.auBecsDebit,
            this.bacsDebit,
            this.bancontact,
            this.boleto,
            this.card,
            this.cashapp,
            this.customerBalance,
            this.eps,
            this.extraParams,
            this.fpx,
            this.giropay,
            this.grabpay,
            this.ideal,
            this.klarna,
            this.konbini,
            this.link,
            this.oxxo,
            this.p24,
            this.paynow,
            this.paypal,
            this.pix,
            this.sepaDebit,
            this.sofort,
            this.usBankAccount,
            this.wechatPay);
      }

      /** contains details about the ACSS Debit payment method options. */
      public Builder setAcssDebit(SessionCreateParams.PaymentMethodOptions.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /** contains details about the Affirm payment method options. */
      public Builder setAffirm(SessionCreateParams.PaymentMethodOptions.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /** contains details about the Afterpay Clearpay payment method options. */
      public Builder setAfterpayClearpay(
          SessionCreateParams.PaymentMethodOptions.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /** contains details about the Alipay payment method options. */
      public Builder setAlipay(SessionCreateParams.PaymentMethodOptions.Alipay alipay) {
        this.alipay = alipay;
        return this;
      }

      /** contains details about the AU Becs Debit payment method options. */
      public Builder setAuBecsDebit(
          SessionCreateParams.PaymentMethodOptions.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /** contains details about the Bacs Debit payment method options. */
      public Builder setBacsDebit(SessionCreateParams.PaymentMethodOptions.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /** contains details about the Bancontact payment method options. */
      public Builder setBancontact(SessionCreateParams.PaymentMethodOptions.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /** contains details about the Boleto payment method options. */
      public Builder setBoleto(SessionCreateParams.PaymentMethodOptions.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /** contains details about the Card payment method options. */
      public Builder setCard(SessionCreateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /** contains details about the Cashapp Pay payment method options. */
      public Builder setCashapp(SessionCreateParams.PaymentMethodOptions.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /** contains details about the Customer Balance payment method options. */
      public Builder setCustomerBalance(
          SessionCreateParams.PaymentMethodOptions.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /** contains details about the EPS payment method options. */
      public Builder setEps(SessionCreateParams.PaymentMethodOptions.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.PaymentMethodOptions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** contains details about the FPX payment method options. */
      public Builder setFpx(SessionCreateParams.PaymentMethodOptions.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /** contains details about the Giropay payment method options. */
      public Builder setGiropay(SessionCreateParams.PaymentMethodOptions.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /** contains details about the Grabpay payment method options. */
      public Builder setGrabpay(SessionCreateParams.PaymentMethodOptions.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /** contains details about the Ideal payment method options. */
      public Builder setIdeal(SessionCreateParams.PaymentMethodOptions.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /** contains details about the Klarna payment method options. */
      public Builder setKlarna(SessionCreateParams.PaymentMethodOptions.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /** contains details about the Konbini payment method options. */
      public Builder setKonbini(SessionCreateParams.PaymentMethodOptions.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /** contains details about the Link payment method options. */
      public Builder setLink(SessionCreateParams.PaymentMethodOptions.Link link) {
        this.link = link;
        return this;
      }

      /** contains details about the OXXO payment method options. */
      public Builder setOxxo(SessionCreateParams.PaymentMethodOptions.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /** contains details about the P24 payment method options. */
      public Builder setP24(SessionCreateParams.PaymentMethodOptions.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /** contains details about the PayNow payment method options. */
      public Builder setPaynow(SessionCreateParams.PaymentMethodOptions.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /** contains details about the PayPal payment method options. */
      public Builder setPaypal(SessionCreateParams.PaymentMethodOptions.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /** contains details about the Pix payment method options. */
      public Builder setPix(SessionCreateParams.PaymentMethodOptions.Pix pix) {
        this.pix = pix;
        return this;
      }

      /** contains details about the Sepa Debit payment method options. */
      public Builder setSepaDebit(SessionCreateParams.PaymentMethodOptions.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /** contains details about the Sofort payment method options. */
      public Builder setSofort(SessionCreateParams.PaymentMethodOptions.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /** contains details about the Us Bank Account payment method options. */
      public Builder setUsBankAccount(
          SessionCreateParams.PaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /** contains details about the WeChat Pay payment method options. */
      public Builder setWechatPay(SessionCreateParams.PaymentMethodOptions.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }
    }

    @Getter
    public static class AcssDebit {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>. This is only accepted for Checkout Sessions in {@code setup} mode.
       */
      @SerializedName("currency")
      Currency currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /** Verification method for the intent. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Currency currency,
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          SetupFutureUsage setupFutureUsage,
          VerificationMethod verificationMethod) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Currency currency;

        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private SetupFutureUsage setupFutureUsage;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.AcssDebit build() {
          return new SessionCreateParams.PaymentMethodOptions.AcssDebit(
              this.currency,
              this.extraParams,
              this.mandateOptions,
              this.setupFutureUsage,
              this.verificationMethod);
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>. This is only accepted for Checkout Sessions in {@code setup} mode.
         */
        public Builder setCurrency(
            SessionCreateParams.PaymentMethodOptions.AcssDebit.Currency currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.AcssDebit.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Verification method for the intent. */
        public Builder setVerificationMethod(
            SessionCreateParams.PaymentMethodOptions.AcssDebit.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      public static class MandateOptions {
        /**
         * A URL for custom mandate text to render during confirmation step. The URL will be
         * rendered with additional GET parameters {@code payment_intent} and {@code
         * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
         * and {@code setup_intent_client_secret} when confirming a Setup Intent.
         */
        @SerializedName("custom_mandate_url")
        Object customMandateUrl;

        /**
         * List of Stripe products where this mandate can be selected automatically. Only usable in
         * {@code setup} mode.
         */
        @SerializedName("default_for")
        List<SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
            defaultFor;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Description of the mandate interval. Only required if 'payment_schedule' parameter is
         * 'interval' or 'combined'.
         */
        @SerializedName("interval_description")
        String intervalDescription;

        /** Payment schedule for the mandate. */
        @SerializedName("payment_schedule")
        PaymentSchedule paymentSchedule;

        /** Transaction type of the mandate. */
        @SerializedName("transaction_type")
        TransactionType transactionType;

        private MandateOptions(
            Object customMandateUrl,
            List<SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
                defaultFor,
            Map<String, Object> extraParams,
            String intervalDescription,
            PaymentSchedule paymentSchedule,
            TransactionType transactionType) {
          this.customMandateUrl = customMandateUrl;
          this.defaultFor = defaultFor;
          this.extraParams = extraParams;
          this.intervalDescription = intervalDescription;
          this.paymentSchedule = paymentSchedule;
          this.transactionType = transactionType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object customMandateUrl;

          private List<SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
              defaultFor;

          private Map<String, Object> extraParams;

          private String intervalDescription;

          private PaymentSchedule paymentSchedule;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions build() {
            return new SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions(
                this.customMandateUrl,
                this.defaultFor,
                this.extraParams,
                this.intervalDescription,
                this.paymentSchedule,
                this.transactionType);
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(String customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(EmptyParam customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * Add an element to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for the
           * field documentation.
           */
          public Builder addDefaultFor(
              SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor
                  element) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.add(element);
            return this;
          }

          /**
           * Add all elements to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for the
           * field documentation.
           */
          public Builder addAllDefaultFor(
              List<SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
                  elements) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for the
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
           * SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for the
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
           * Description of the mandate interval. Only required if 'payment_schedule' parameter is
           * 'interval' or 'combined'.
           */
          public Builder setIntervalDescription(String intervalDescription) {
            this.intervalDescription = intervalDescription;
            return this;
          }

          /** Payment schedule for the mandate. */
          public Builder setPaymentSchedule(
              SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(
              SessionCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions.TransactionType
                  transactionType) {
            this.transactionType = transactionType;
            return this;
          }
        }

        public enum DefaultFor implements ApiRequestParams.EnumParam {
          @SerializedName("invoice")
          INVOICE("invoice"),

          @SerializedName("subscription")
          SUBSCRIPTION("subscription");

          @Getter(onMethod_ = {@Override})
          private final String value;

          DefaultFor(String value) {
            this.value = value;
          }
        }

        public enum PaymentSchedule implements ApiRequestParams.EnumParam {
          @SerializedName("combined")
          COMBINED("combined"),

          @SerializedName("interval")
          INTERVAL("interval"),

          @SerializedName("sporadic")
          SPORADIC("sporadic");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentSchedule(String value) {
            this.value = value;
          }
        }

        public enum TransactionType implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("personal")
          PERSONAL("personal");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TransactionType(String value) {
            this.value = value;
          }
        }
      }

      public enum Currency implements ApiRequestParams.EnumParam {
        @SerializedName("cad")
        CAD("cad"),

        @SerializedName("usd")
        USD("usd");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Currency(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant"),

        @SerializedName("microdeposits")
        MICRODEPOSITS("microdeposits");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Affirm {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Affirm(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Affirm build() {
          return new SessionCreateParams.PaymentMethodOptions.Affirm(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Affirm#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Affirm#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Affirm.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AfterpayClearpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private AfterpayClearpay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.AfterpayClearpay build() {
          return new SessionCreateParams.PaymentMethodOptions.AfterpayClearpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AfterpayClearpay#extraParams}
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AfterpayClearpay#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.AfterpayClearpay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Alipay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Alipay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Alipay build() {
          return new SessionCreateParams.PaymentMethodOptions.Alipay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Alipay#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Alipay#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Alipay.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AuBecsDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private AuBecsDebit(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.AuBecsDebit build() {
          return new SessionCreateParams.PaymentMethodOptions.AuBecsDebit(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AuBecsDebit#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.AuBecsDebit#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.AuBecsDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class BacsDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private BacsDebit(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.BacsDebit build() {
          return new SessionCreateParams.PaymentMethodOptions.BacsDebit(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.BacsDebit#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.BacsDebit#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.BacsDebit.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Bancontact {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Bancontact(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Bancontact build() {
          return new SessionCreateParams.PaymentMethodOptions.Bancontact(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Bancontact#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Bancontact#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Bancontact.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Boleto {
      /**
       * The number of calendar days before a Boleto voucher expires. For example, if you create a
       * Boleto voucher on Monday and you set expires_after_days to 2, the Boleto invoice will
       * expire on Wednesday at 23:59 America/Sao_Paulo time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Boleto(
          Long expiresAfterDays,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.expiresAfterDays = expiresAfterDays;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterDays;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Boleto build() {
          return new SessionCreateParams.PaymentMethodOptions.Boleto(
              this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of calendar days before a Boleto voucher expires. For example, if you create a
         * Boleto voucher on Monday and you set expires_after_days to 2, the Boleto invoice will
         * expire on Wednesday at 23:59 America/Sao_Paulo time.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Boleto#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Boleto#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Boleto.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Installment options for card payments. */
      @SerializedName("installments")
      Installments installments;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the Kana prefix (shortened Kana descriptor) or Kana statement descriptor
       * that’s set on the account to form the complete statement descriptor. Maximum 22 characters.
       * On card statements, the <em>concatenation</em> of both prefix and suffix (including
       * separators) will appear truncated to 22 characters.
       */
      @SerializedName("statement_descriptor_suffix_kana")
      String statementDescriptorSuffixKana;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the Kanji prefix (shortened Kanji descriptor) or Kanji statement
       * descriptor that’s set on the account to form the complete statement descriptor. Maximum 17
       * characters. On card statements, the <em>concatenation</em> of both prefix and suffix
       * (including separators) will appear truncated to 17 characters.
       */
      @SerializedName("statement_descriptor_suffix_kanji")
      String statementDescriptorSuffixKanji;

      private Card(
          Map<String, Object> extraParams,
          Installments installments,
          SetupFutureUsage setupFutureUsage,
          String statementDescriptorSuffixKana,
          String statementDescriptorSuffixKanji) {
        this.extraParams = extraParams;
        this.installments = installments;
        this.setupFutureUsage = setupFutureUsage;
        this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
        this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Installments installments;

        private SetupFutureUsage setupFutureUsage;

        private String statementDescriptorSuffixKana;

        private String statementDescriptorSuffixKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Card build() {
          return new SessionCreateParams.PaymentMethodOptions.Card(
              this.extraParams,
              this.installments,
              this.setupFutureUsage,
              this.statementDescriptorSuffixKana,
              this.statementDescriptorSuffixKanji);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Card#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Card#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Installment options for card payments. */
        public Builder setInstallments(
            SessionCreateParams.PaymentMethodOptions.Card.Installments installments) {
          this.installments = installments;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Card.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kana prefix (shortened Kana descriptor) or Kana statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 22 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 22 characters.
         */
        public Builder setStatementDescriptorSuffixKana(String statementDescriptorSuffixKana) {
          this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kanji prefix (shortened Kanji descriptor) or Kanji statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 17 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 17 characters.
         */
        public Builder setStatementDescriptorSuffixKanji(String statementDescriptorSuffixKanji) {
          this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
          return this;
        }
      }

      @Getter
      public static class Installments {
        /**
         * Setting to true enables installments for this Checkout Session. Setting to false will
         * prevent any installment plan from applying to a payment.
         */
        @SerializedName("enabled")
        Boolean enabled;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Installments(Boolean enabled, Map<String, Object> extraParams) {
          this.enabled = enabled;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean enabled;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.PaymentMethodOptions.Card.Installments build() {
            return new SessionCreateParams.PaymentMethodOptions.Card.Installments(
                this.enabled, this.extraParams);
          }

          /**
           * Setting to true enables installments for this Checkout Session. Setting to false will
           * prevent any installment plan from applying to a payment.
           */
          public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.PaymentMethodOptions.Card.Installments#extraParams}
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.PaymentMethodOptions.Card.Installments#extraParams}
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
    public static class Cashapp {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Cashapp(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Cashapp build() {
          return new SessionCreateParams.PaymentMethodOptions.Cashapp(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Cashapp#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Cashapp#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Cashapp.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class CustomerBalance {
      /**
       * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
       * {@code bank_transfer}.
       */
      @SerializedName("bank_transfer")
      BankTransfer bankTransfer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The funding method type to be used when there are not enough funds in the customer balance.
       * Permitted values include: {@code bank_transfer}.
       */
      @SerializedName("funding_type")
      FundingType fundingType;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private CustomerBalance(
          BankTransfer bankTransfer,
          Map<String, Object> extraParams,
          FundingType fundingType,
          SetupFutureUsage setupFutureUsage) {
        this.bankTransfer = bankTransfer;
        this.extraParams = extraParams;
        this.fundingType = fundingType;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BankTransfer bankTransfer;

        private Map<String, Object> extraParams;

        private FundingType fundingType;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.CustomerBalance build() {
          return new SessionCreateParams.PaymentMethodOptions.CustomerBalance(
              this.bankTransfer, this.extraParams, this.fundingType, this.setupFutureUsage);
        }

        /**
         * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
         * {@code bank_transfer}.
         */
        public Builder setBankTransfer(
            SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer bankTransfer) {
          this.bankTransfer = bankTransfer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.CustomerBalance#extraParams} for
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.CustomerBalance#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The funding method type to be used when there are not enough funds in the customer
         * balance. Permitted values include: {@code bank_transfer}.
         */
        public Builder setFundingType(
            SessionCreateParams.PaymentMethodOptions.CustomerBalance.FundingType fundingType) {
          this.fundingType = fundingType;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.CustomerBalance.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      @Getter
      public static class BankTransfer {
        /** Configuration for eu_bank_transfer funding type. */
        @SerializedName("eu_bank_transfer")
        EuBankTransfer euBankTransfer;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * List of address types that should be returned in the financial_addresses response. If not
         * specified, all valid types will be returned.
         *
         * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or {@code
         * spei}.
         */
        @SerializedName("requested_address_types")
        List<
                SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .RequestedAddressType>
            requestedAddressTypes;

        /**
         * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent is
         * allowed to use for funding.
         */
        @SerializedName("type")
        Type type;

        private BankTransfer(
            EuBankTransfer euBankTransfer,
            Map<String, Object> extraParams,
            List<
                    SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                        .RequestedAddressType>
                requestedAddressTypes,
            Type type) {
          this.euBankTransfer = euBankTransfer;
          this.extraParams = extraParams;
          this.requestedAddressTypes = requestedAddressTypes;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EuBankTransfer euBankTransfer;

          private Map<String, Object> extraParams;

          private List<
                  SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .RequestedAddressType>
              requestedAddressTypes;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer build() {
            return new SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer(
                this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
          }

          /** Configuration for eu_bank_transfer funding type. */
          public Builder setEuBankTransfer(
              SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer
                  euBankTransfer) {
            this.euBankTransfer = euBankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams} for
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
           * map. See {@link
           * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `requestedAddressTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addRequestedAddressType(
              SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .RequestedAddressType
                  element) {
            if (this.requestedAddressTypes == null) {
              this.requestedAddressTypes = new ArrayList<>();
            }
            this.requestedAddressTypes.add(element);
            return this;
          }

          /**
           * Add all elements to `requestedAddressTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addAllRequestedAddressType(
              List<
                      SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                          .RequestedAddressType>
                  elements) {
            if (this.requestedAddressTypes == null) {
              this.requestedAddressTypes = new ArrayList<>();
            }
            this.requestedAddressTypes.addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent is
           * allowed to use for funding.
           */
          public Builder setType(
              SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class EuBankTransfer {
          /**
           * <strong>Required.</strong> The desired country code of the bank account information.
           * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
           * or {@code NL}.
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private EuBankTransfer(String country, Map<String, Object> extraParams) {
            this.country = country;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String country;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .EuBankTransfer
                build() {
              return new SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                  .EuBankTransfer(this.country, this.extraParams);
            }

            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
             * or {@code NL}.
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
             * SessionCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
        }

        public enum RequestedAddressType implements ApiRequestParams.EnumParam {
          @SerializedName("aba")
          ABA("aba"),

          @SerializedName("iban")
          IBAN("iban"),

          @SerializedName("sepa")
          SEPA("sepa"),

          @SerializedName("sort_code")
          SORT_CODE("sort_code"),

          @SerializedName("spei")
          SPEI("spei"),

          @SerializedName("swift")
          SWIFT("swift"),

          @SerializedName("zengin")
          ZENGIN("zengin");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RequestedAddressType(String value) {
            this.value = value;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("eu_bank_transfer")
          EU_BANK_TRANSFER("eu_bank_transfer"),

          @SerializedName("gb_bank_transfer")
          GB_BANK_TRANSFER("gb_bank_transfer"),

          @SerializedName("jp_bank_transfer")
          JP_BANK_TRANSFER("jp_bank_transfer"),

          @SerializedName("mx_bank_transfer")
          MX_BANK_TRANSFER("mx_bank_transfer"),

          @SerializedName("us_bank_transfer")
          US_BANK_TRANSFER("us_bank_transfer");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum FundingType implements ApiRequestParams.EnumParam {
        @SerializedName("bank_transfer")
        BANK_TRANSFER("bank_transfer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        FundingType(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Eps {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Eps(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Eps build() {
          return new SessionCreateParams.PaymentMethodOptions.Eps(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Eps#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Eps#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Eps.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Fpx {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Fpx(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Fpx build() {
          return new SessionCreateParams.PaymentMethodOptions.Fpx(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Fpx#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Fpx#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Fpx.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Giropay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Giropay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Giropay build() {
          return new SessionCreateParams.PaymentMethodOptions.Giropay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Giropay#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Giropay#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Giropay.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Grabpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Grabpay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Grabpay build() {
          return new SessionCreateParams.PaymentMethodOptions.Grabpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Grabpay#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Grabpay#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Grabpay.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ideal {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Ideal(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Ideal build() {
          return new SessionCreateParams.PaymentMethodOptions.Ideal(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Ideal#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Ideal#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Ideal.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Klarna {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Klarna(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Klarna build() {
          return new SessionCreateParams.PaymentMethodOptions.Klarna(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Klarna#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Klarna#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Klarna.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Konbini {
      /**
       * The number of calendar days (between 1 and 60) after which Konbini payment instructions
       * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
       * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
       * 23:59:59 JST. Defaults to 3 days.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Konbini(
          Long expiresAfterDays,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.expiresAfterDays = expiresAfterDays;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterDays;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Konbini build() {
          return new SessionCreateParams.PaymentMethodOptions.Konbini(
              this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of calendar days (between 1 and 60) after which Konbini payment instructions
         * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
         * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
         * 23:59:59 JST. Defaults to 3 days.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Konbini#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Konbini#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Konbini.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Link {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Link(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Link build() {
          return new SessionCreateParams.PaymentMethodOptions.Link(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Link#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Link#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Link.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Oxxo {
      /**
       * The number of calendar days before an OXXO voucher expires. For example, if you create an
       * OXXO voucher on Monday and you set expires_after_days to 2, the OXXO invoice will expire on
       * Wednesday at 23:59 America/Mexico_City time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Oxxo(
          Long expiresAfterDays,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.expiresAfterDays = expiresAfterDays;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterDays;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Oxxo build() {
          return new SessionCreateParams.PaymentMethodOptions.Oxxo(
              this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of calendar days before an OXXO voucher expires. For example, if you create an
         * OXXO voucher on Monday and you set expires_after_days to 2, the OXXO invoice will expire
         * on Wednesday at 23:59 America/Mexico_City time.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Oxxo#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Oxxo#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Oxxo.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class P24 {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /** Confirm that the payer has accepted the P24 terms and conditions. */
      @SerializedName("tos_shown_and_accepted")
      Boolean tosShownAndAccepted;

      private P24(
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage,
          Boolean tosShownAndAccepted) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
        this.tosShownAndAccepted = tosShownAndAccepted;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        private Boolean tosShownAndAccepted;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.P24 build() {
          return new SessionCreateParams.PaymentMethodOptions.P24(
              this.extraParams, this.setupFutureUsage, this.tosShownAndAccepted);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.P24#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.P24#extraParams} for the field
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.P24.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Confirm that the payer has accepted the P24 terms and conditions. */
        public Builder setTosShownAndAccepted(Boolean tosShownAndAccepted) {
          this.tosShownAndAccepted = tosShownAndAccepted;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Paynow {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Paynow(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Paynow build() {
          return new SessionCreateParams.PaymentMethodOptions.Paynow(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Paynow#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Paynow#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Paynow.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Paypal {
      /** Controls when the funds will be captured from the customer's account. */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred locale</a> of
       * the PayPal checkout page that the customer is redirected to.
       */
      @SerializedName("preferred_locale")
      PreferredLocale preferredLocale;

      /**
       * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
       * invoice ID. This must be a globally unique ID if you have configured in your PayPal
       * settings to block multiple payments per invoice ID.
       */
      @SerializedName("reference")
      String reference;

      /** The risk correlation ID for an on-session payment using a saved PayPal payment method. */
      @SerializedName("risk_correlation_id")
      String riskCorrelationId;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Paypal(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          PreferredLocale preferredLocale,
          String reference,
          String riskCorrelationId,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.preferredLocale = preferredLocale;
        this.reference = reference;
        this.riskCorrelationId = riskCorrelationId;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private PreferredLocale preferredLocale;

        private String reference;

        private String riskCorrelationId;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Paypal build() {
          return new SessionCreateParams.PaymentMethodOptions.Paypal(
              this.captureMethod,
              this.extraParams,
              this.preferredLocale,
              this.reference,
              this.riskCorrelationId,
              this.setupFutureUsage);
        }

        /** Controls when the funds will be captured from the customer's account. */
        public Builder setCaptureMethod(
            SessionCreateParams.PaymentMethodOptions.Paypal.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /** Controls when the funds will be captured from the customer's account. */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Paypal#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Paypal#extraParams} for the
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
         * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred locale</a>
         * of the PayPal checkout page that the customer is redirected to.
         */
        public Builder setPreferredLocale(
            SessionCreateParams.PaymentMethodOptions.Paypal.PreferredLocale preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
         * invoice ID. This must be a globally unique ID if you have configured in your PayPal
         * settings to block multiple payments per invoice ID.
         */
        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /**
         * The risk correlation ID for an on-session payment using a saved PayPal payment method.
         */
        public Builder setRiskCorrelationId(String riskCorrelationId) {
          this.riskCorrelationId = riskCorrelationId;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Paypal.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum PreferredLocale implements ApiRequestParams.EnumParam {
        @SerializedName("cs-CZ")
        CS_CZ("cs-CZ"),

        @SerializedName("da-DK")
        DA_DK("da-DK"),

        @SerializedName("de-AT")
        DE_AT("de-AT"),

        @SerializedName("de-DE")
        DE_DE("de-DE"),

        @SerializedName("de-LU")
        DE_LU("de-LU"),

        @SerializedName("el-GR")
        EL_GR("el-GR"),

        @SerializedName("en-GB")
        EN_GB("en-GB"),

        @SerializedName("en-US")
        EN_US("en-US"),

        @SerializedName("es-ES")
        ES_ES("es-ES"),

        @SerializedName("fi-FI")
        FI_FI("fi-FI"),

        @SerializedName("fr-BE")
        FR_BE("fr-BE"),

        @SerializedName("fr-FR")
        FR_FR("fr-FR"),

        @SerializedName("fr-LU")
        FR_LU("fr-LU"),

        @SerializedName("hu-HU")
        HU_HU("hu-HU"),

        @SerializedName("it-IT")
        IT_IT("it-IT"),

        @SerializedName("nl-BE")
        NL_BE("nl-BE"),

        @SerializedName("nl-NL")
        NL_NL("nl-NL"),

        @SerializedName("pl-PL")
        PL_PL("pl-PL"),

        @SerializedName("pt-PT")
        PT_PT("pt-PT"),

        @SerializedName("sk-SK")
        SK_SK("sk-SK"),

        @SerializedName("sv-SE")
        SV_SE("sv-SE");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLocale(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Pix {
      /**
       * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
       * Defaults to 86400 seconds.
       */
      @SerializedName("expires_after_seconds")
      Long expiresAfterSeconds;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pix(Long expiresAfterSeconds, Map<String, Object> extraParams) {
        this.expiresAfterSeconds = expiresAfterSeconds;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterSeconds;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Pix build() {
          return new SessionCreateParams.PaymentMethodOptions.Pix(
              this.expiresAfterSeconds, this.extraParams);
        }

        /**
         * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
         * Defaults to 86400 seconds.
         */
        public Builder setExpiresAfterSeconds(Long expiresAfterSeconds) {
          this.expiresAfterSeconds = expiresAfterSeconds;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Pix#extraParams} for the field
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Pix#extraParams} for the field
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
    }

    @Getter
    public static class SepaDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private SepaDebit(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.SepaDebit build() {
          return new SessionCreateParams.PaymentMethodOptions.SepaDebit(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.SepaDebit.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Sofort {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Sofort(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.Sofort build() {
          return new SessionCreateParams.PaymentMethodOptions.Sofort(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Sofort#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.Sofort#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.Sofort.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class UsBankAccount {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Financial Connections Session creation. */
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /** Verification method for the intent. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private UsBankAccount(
          Map<String, Object> extraParams,
          FinancialConnections financialConnections,
          SetupFutureUsage setupFutureUsage,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.financialConnections = financialConnections;
        this.setupFutureUsage = setupFutureUsage;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FinancialConnections financialConnections;

        private SetupFutureUsage setupFutureUsage;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.UsBankAccount build() {
          return new SessionCreateParams.PaymentMethodOptions.UsBankAccount(
              this.extraParams,
              this.financialConnections,
              this.setupFutureUsage,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.UsBankAccount#extraParams} for
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.UsBankAccount#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Financial Connections Session creation. */
        public Builder setFinancialConnections(
            SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                financialConnections) {
          this.financialConnections = financialConnections;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.UsBankAccount.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Verification method for the intent. */
        public Builder setVerificationMethod(
            SessionCreateParams.PaymentMethodOptions.UsBankAccount.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      public static class FinancialConnections {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The list of permissions to request. If this parameter is passed, the {@code
         * payment_method} permission must be included. Valid permissions include: {@code balances},
         * {@code ownership}, {@code payment_method}, and {@code transactions}.
         */
        @SerializedName("permissions")
        List<SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Permission>
            permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Prefetch>
            prefetch;

        private FinancialConnections(
            Map<String, Object> extraParams,
            List<
                    SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Permission>
                permissions,
            List<
                    SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Prefetch>
                prefetch) {
          this.extraParams = extraParams;
          this.permissions = permissions;
          this.prefetch = prefetch;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission>
              permissions;

          private List<
                  SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch>
              prefetch;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
              build() {
            return new SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections(
                this.extraParams, this.permissions, this.prefetch);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `permissions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addPermission(
              SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Permission
                  element) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.add(element);
            return this;
          }

          /**
           * Add all elements to `permissions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addAllPermission(
              List<
                      SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                          .Permission>
                  elements) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.addAll(elements);
            return this;
          }

          /**
           * Add an element to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addPrefetch(
              SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Prefetch
                  element) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.add(element);
            return this;
          }

          /**
           * Add all elements to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addAllPrefetch(
              List<
                      SessionCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                          .Prefetch>
                  elements) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.addAll(elements);
            return this;
          }
        }

        public enum Permission implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances"),

          @SerializedName("ownership")
          OWNERSHIP("ownership"),

          @SerializedName("payment_method")
          PAYMENT_METHOD("payment_method"),

          @SerializedName("transactions")
          TRANSACTIONS("transactions");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Permission(String value) {
            this.value = value;
          }
        }

        public enum Prefetch implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Prefetch(String value) {
            this.value = value;
          }
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class WechatPay {
      /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
      @SerializedName("app_id")
      String appId;

      /** <strong>Required.</strong> The client type that the end customer will pay from */
      @SerializedName("client")
      Client client;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private WechatPay(
          String appId,
          Client client,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.appId = appId;
        this.client = client;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String appId;

        private Client client;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.PaymentMethodOptions.WechatPay build() {
          return new SessionCreateParams.PaymentMethodOptions.WechatPay(
              this.appId, this.client, this.extraParams, this.setupFutureUsage);
        }

        /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
        public Builder setAppId(String appId) {
          this.appId = appId;
          return this;
        }

        /** <strong>Required.</strong> The client type that the end customer will pay from */
        public Builder setClient(SessionCreateParams.PaymentMethodOptions.WechatPay.Client client) {
          this.client = client;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.PaymentMethodOptions.WechatPay#extraParams} for the
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
         * map. See {@link SessionCreateParams.PaymentMethodOptions.WechatPay#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            SessionCreateParams.PaymentMethodOptions.WechatPay.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum Client implements ApiRequestParams.EnumParam {
        @SerializedName("android")
        ANDROID("android"),

        @SerializedName("ios")
        IOS("ios"),

        @SerializedName("web")
        WEB("web");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Client(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class PhoneNumberCollection {
    /** <strong>Required.</strong> Set to {@code true} to enable phone number collection. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PhoneNumberCollection(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.PhoneNumberCollection build() {
        return new SessionCreateParams.PhoneNumberCollection(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to {@code true} to enable phone number collection. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.PhoneNumberCollection#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.PhoneNumberCollection#extraParams} for the field
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
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
      public SessionCreateParams.SetupIntentData build() {
        return new SessionCreateParams.SetupIntentData(
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
  public static class ShippingAddressCollection {
    /**
     * <strong>Required.</strong> An array of two-letter ISO country codes representing which
     * countries Checkout should provide as options for shipping locations. Unsupported country
     * codes: {@code AS, CX, CC, CU, HM, IR, KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<SessionCreateParams.ShippingAddressCollection.AllowedCountry> allowedCountries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShippingAddressCollection(
        List<SessionCreateParams.ShippingAddressCollection.AllowedCountry> allowedCountries,
        Map<String, Object> extraParams) {
      this.allowedCountries = allowedCountries;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<SessionCreateParams.ShippingAddressCollection.AllowedCountry> allowedCountries;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.ShippingAddressCollection build() {
        return new SessionCreateParams.ShippingAddressCollection(
            this.allowedCountries, this.extraParams);
      }

      /**
       * Add an element to `allowedCountries` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllowedCountry(
          SessionCreateParams.ShippingAddressCollection.AllowedCountry element) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SessionCreateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllAllowedCountry(
          List<SessionCreateParams.ShippingAddressCollection.AllowedCountry> elements) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.ShippingAddressCollection#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.ShippingAddressCollection#extraParams} for the field
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

    public enum AllowedCountry implements ApiRequestParams.EnumParam {
      @SerializedName("AC")
      AC("AC"),

      @SerializedName("AD")
      AD("AD"),

      @SerializedName("AE")
      AE("AE"),

      @SerializedName("AF")
      AF("AF"),

      @SerializedName("AG")
      AG("AG"),

      @SerializedName("AI")
      AI("AI"),

      @SerializedName("AL")
      AL("AL"),

      @SerializedName("AM")
      AM("AM"),

      @SerializedName("AO")
      AO("AO"),

      @SerializedName("AQ")
      AQ("AQ"),

      @SerializedName("AR")
      AR("AR"),

      @SerializedName("AT")
      AT("AT"),

      @SerializedName("AU")
      AU("AU"),

      @SerializedName("AW")
      AW("AW"),

      @SerializedName("AX")
      AX("AX"),

      @SerializedName("AZ")
      AZ("AZ"),

      @SerializedName("BA")
      BA("BA"),

      @SerializedName("BB")
      BB("BB"),

      @SerializedName("BD")
      BD("BD"),

      @SerializedName("BE")
      BE("BE"),

      @SerializedName("BF")
      BF("BF"),

      @SerializedName("BG")
      BG("BG"),

      @SerializedName("BH")
      BH("BH"),

      @SerializedName("BI")
      BI("BI"),

      @SerializedName("BJ")
      BJ("BJ"),

      @SerializedName("BL")
      BL("BL"),

      @SerializedName("BM")
      BM("BM"),

      @SerializedName("BN")
      BN("BN"),

      @SerializedName("BO")
      BO("BO"),

      @SerializedName("BQ")
      BQ("BQ"),

      @SerializedName("BR")
      BR("BR"),

      @SerializedName("BS")
      BS("BS"),

      @SerializedName("BT")
      BT("BT"),

      @SerializedName("BV")
      BV("BV"),

      @SerializedName("BW")
      BW("BW"),

      @SerializedName("BY")
      BY("BY"),

      @SerializedName("BZ")
      BZ("BZ"),

      @SerializedName("CA")
      CA("CA"),

      @SerializedName("CD")
      CD("CD"),

      @SerializedName("CF")
      CF("CF"),

      @SerializedName("CG")
      CG("CG"),

      @SerializedName("CH")
      CH("CH"),

      @SerializedName("CI")
      CI("CI"),

      @SerializedName("CK")
      CK("CK"),

      @SerializedName("CL")
      CL("CL"),

      @SerializedName("CM")
      CM("CM"),

      @SerializedName("CN")
      CN("CN"),

      @SerializedName("CO")
      CO("CO"),

      @SerializedName("CR")
      CR("CR"),

      @SerializedName("CV")
      CV("CV"),

      @SerializedName("CW")
      CW("CW"),

      @SerializedName("CY")
      CY("CY"),

      @SerializedName("CZ")
      CZ("CZ"),

      @SerializedName("DE")
      DE("DE"),

      @SerializedName("DJ")
      DJ("DJ"),

      @SerializedName("DK")
      DK("DK"),

      @SerializedName("DM")
      DM("DM"),

      @SerializedName("DO")
      DO("DO"),

      @SerializedName("DZ")
      DZ("DZ"),

      @SerializedName("EC")
      EC("EC"),

      @SerializedName("EE")
      EE("EE"),

      @SerializedName("EG")
      EG("EG"),

      @SerializedName("EH")
      EH("EH"),

      @SerializedName("ER")
      ER("ER"),

      @SerializedName("ES")
      ES("ES"),

      @SerializedName("ET")
      ET("ET"),

      @SerializedName("FI")
      FI("FI"),

      @SerializedName("FJ")
      FJ("FJ"),

      @SerializedName("FK")
      FK("FK"),

      @SerializedName("FO")
      FO("FO"),

      @SerializedName("FR")
      FR("FR"),

      @SerializedName("GA")
      GA("GA"),

      @SerializedName("GB")
      GB("GB"),

      @SerializedName("GD")
      GD("GD"),

      @SerializedName("GE")
      GE("GE"),

      @SerializedName("GF")
      GF("GF"),

      @SerializedName("GG")
      GG("GG"),

      @SerializedName("GH")
      GH("GH"),

      @SerializedName("GI")
      GI("GI"),

      @SerializedName("GL")
      GL("GL"),

      @SerializedName("GM")
      GM("GM"),

      @SerializedName("GN")
      GN("GN"),

      @SerializedName("GP")
      GP("GP"),

      @SerializedName("GQ")
      GQ("GQ"),

      @SerializedName("GR")
      GR("GR"),

      @SerializedName("GS")
      GS("GS"),

      @SerializedName("GT")
      GT("GT"),

      @SerializedName("GU")
      GU("GU"),

      @SerializedName("GW")
      GW("GW"),

      @SerializedName("GY")
      GY("GY"),

      @SerializedName("HK")
      HK("HK"),

      @SerializedName("HN")
      HN("HN"),

      @SerializedName("HR")
      HR("HR"),

      @SerializedName("HT")
      HT("HT"),

      @SerializedName("HU")
      HU("HU"),

      @SerializedName("ID")
      ID("ID"),

      @SerializedName("IE")
      IE("IE"),

      @SerializedName("IL")
      IL("IL"),

      @SerializedName("IM")
      IM("IM"),

      @SerializedName("IN")
      IN("IN"),

      @SerializedName("IO")
      IO("IO"),

      @SerializedName("IQ")
      IQ("IQ"),

      @SerializedName("IS")
      IS("IS"),

      @SerializedName("IT")
      IT("IT"),

      @SerializedName("JE")
      JE("JE"),

      @SerializedName("JM")
      JM("JM"),

      @SerializedName("JO")
      JO("JO"),

      @SerializedName("JP")
      JP("JP"),

      @SerializedName("KE")
      KE("KE"),

      @SerializedName("KG")
      KG("KG"),

      @SerializedName("KH")
      KH("KH"),

      @SerializedName("KI")
      KI("KI"),

      @SerializedName("KM")
      KM("KM"),

      @SerializedName("KN")
      KN("KN"),

      @SerializedName("KR")
      KR("KR"),

      @SerializedName("KW")
      KW("KW"),

      @SerializedName("KY")
      KY("KY"),

      @SerializedName("KZ")
      KZ("KZ"),

      @SerializedName("LA")
      LA("LA"),

      @SerializedName("LB")
      LB("LB"),

      @SerializedName("LC")
      LC("LC"),

      @SerializedName("LI")
      LI("LI"),

      @SerializedName("LK")
      LK("LK"),

      @SerializedName("LR")
      LR("LR"),

      @SerializedName("LS")
      LS("LS"),

      @SerializedName("LT")
      LT("LT"),

      @SerializedName("LU")
      LU("LU"),

      @SerializedName("LV")
      LV("LV"),

      @SerializedName("LY")
      LY("LY"),

      @SerializedName("MA")
      MA("MA"),

      @SerializedName("MC")
      MC("MC"),

      @SerializedName("MD")
      MD("MD"),

      @SerializedName("ME")
      ME("ME"),

      @SerializedName("MF")
      MF("MF"),

      @SerializedName("MG")
      MG("MG"),

      @SerializedName("MK")
      MK("MK"),

      @SerializedName("ML")
      ML("ML"),

      @SerializedName("MM")
      MM("MM"),

      @SerializedName("MN")
      MN("MN"),

      @SerializedName("MO")
      MO("MO"),

      @SerializedName("MQ")
      MQ("MQ"),

      @SerializedName("MR")
      MR("MR"),

      @SerializedName("MS")
      MS("MS"),

      @SerializedName("MT")
      MT("MT"),

      @SerializedName("MU")
      MU("MU"),

      @SerializedName("MV")
      MV("MV"),

      @SerializedName("MW")
      MW("MW"),

      @SerializedName("MX")
      MX("MX"),

      @SerializedName("MY")
      MY("MY"),

      @SerializedName("MZ")
      MZ("MZ"),

      @SerializedName("NA")
      NA("NA"),

      @SerializedName("NC")
      NC("NC"),

      @SerializedName("NE")
      NE("NE"),

      @SerializedName("NG")
      NG("NG"),

      @SerializedName("NI")
      NI("NI"),

      @SerializedName("NL")
      NL("NL"),

      @SerializedName("NO")
      NO("NO"),

      @SerializedName("NP")
      NP("NP"),

      @SerializedName("NR")
      NR("NR"),

      @SerializedName("NU")
      NU("NU"),

      @SerializedName("NZ")
      NZ("NZ"),

      @SerializedName("OM")
      OM("OM"),

      @SerializedName("PA")
      PA("PA"),

      @SerializedName("PE")
      PE("PE"),

      @SerializedName("PF")
      PF("PF"),

      @SerializedName("PG")
      PG("PG"),

      @SerializedName("PH")
      PH("PH"),

      @SerializedName("PK")
      PK("PK"),

      @SerializedName("PL")
      PL("PL"),

      @SerializedName("PM")
      PM("PM"),

      @SerializedName("PN")
      PN("PN"),

      @SerializedName("PR")
      PR("PR"),

      @SerializedName("PS")
      PS("PS"),

      @SerializedName("PT")
      PT("PT"),

      @SerializedName("PY")
      PY("PY"),

      @SerializedName("QA")
      QA("QA"),

      @SerializedName("RE")
      RE("RE"),

      @SerializedName("RO")
      RO("RO"),

      @SerializedName("RS")
      RS("RS"),

      @SerializedName("RU")
      RU("RU"),

      @SerializedName("RW")
      RW("RW"),

      @SerializedName("SA")
      SA("SA"),

      @SerializedName("SB")
      SB("SB"),

      @SerializedName("SC")
      SC("SC"),

      @SerializedName("SE")
      SE("SE"),

      @SerializedName("SG")
      SG("SG"),

      @SerializedName("SH")
      SH("SH"),

      @SerializedName("SI")
      SI("SI"),

      @SerializedName("SJ")
      SJ("SJ"),

      @SerializedName("SK")
      SK("SK"),

      @SerializedName("SL")
      SL("SL"),

      @SerializedName("SM")
      SM("SM"),

      @SerializedName("SN")
      SN("SN"),

      @SerializedName("SO")
      SO("SO"),

      @SerializedName("SR")
      SR("SR"),

      @SerializedName("SS")
      SS("SS"),

      @SerializedName("ST")
      ST("ST"),

      @SerializedName("SV")
      SV("SV"),

      @SerializedName("SX")
      SX("SX"),

      @SerializedName("SZ")
      SZ("SZ"),

      @SerializedName("TA")
      TA("TA"),

      @SerializedName("TC")
      TC("TC"),

      @SerializedName("TD")
      TD("TD"),

      @SerializedName("TF")
      TF("TF"),

      @SerializedName("TG")
      TG("TG"),

      @SerializedName("TH")
      TH("TH"),

      @SerializedName("TJ")
      TJ("TJ"),

      @SerializedName("TK")
      TK("TK"),

      @SerializedName("TL")
      TL("TL"),

      @SerializedName("TM")
      TM("TM"),

      @SerializedName("TN")
      TN("TN"),

      @SerializedName("TO")
      TO("TO"),

      @SerializedName("TR")
      TR("TR"),

      @SerializedName("TT")
      TT("TT"),

      @SerializedName("TV")
      TV("TV"),

      @SerializedName("TW")
      TW("TW"),

      @SerializedName("TZ")
      TZ("TZ"),

      @SerializedName("UA")
      UA("UA"),

      @SerializedName("UG")
      UG("UG"),

      @SerializedName("US")
      US("US"),

      @SerializedName("UY")
      UY("UY"),

      @SerializedName("UZ")
      UZ("UZ"),

      @SerializedName("VA")
      VA("VA"),

      @SerializedName("VC")
      VC("VC"),

      @SerializedName("VE")
      VE("VE"),

      @SerializedName("VG")
      VG("VG"),

      @SerializedName("VN")
      VN("VN"),

      @SerializedName("VU")
      VU("VU"),

      @SerializedName("WF")
      WF("WF"),

      @SerializedName("WS")
      WS("WS"),

      @SerializedName("XK")
      XK("XK"),

      @SerializedName("YE")
      YE("YE"),

      @SerializedName("YT")
      YT("YT"),

      @SerializedName("ZA")
      ZA("ZA"),

      @SerializedName("ZM")
      ZM("ZM"),

      @SerializedName("ZW")
      ZW("ZW"),

      @SerializedName("ZZ")
      ZZ("ZZ");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowedCountry(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class ShippingOption {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the Shipping Rate to use for this shipping option. */
    @SerializedName("shipping_rate")
    String shippingRate;

    /** Parameters to be passed to Shipping Rate creation for this shipping option. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingOption(
        Map<String, Object> extraParams, String shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.ShippingOption build() {
        return new SessionCreateParams.ShippingOption(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.ShippingOption#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.ShippingOption#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the Shipping Rate to use for this shipping option. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to be passed to Shipping Rate creation for this shipping option. */
      public Builder setShippingRateData(
          SessionCreateParams.ShippingOption.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
    public static class ShippingRateData {
      /**
       * The estimated range for how long shipping will take, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("delivery_estimate")
      DeliveryEstimate deliveryEstimate;

      /**
       * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Describes a fixed amount to charge for shipping. Must be present if type is {@code
       * fixed_amount}.
       */
      @SerializedName("fixed_amount")
      FixedAmount fixedAmount;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
       * code is {@code txcd_92010001}.
       */
      @SerializedName("tax_code")
      String taxCode;

      /**
       * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for
       * now.
       */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          String displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          String taxCode,
          Type type) {
        this.deliveryEstimate = deliveryEstimate;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.fixedAmount = fixedAmount;
        this.metadata = metadata;
        this.taxBehavior = taxBehavior;
        this.taxCode = taxCode;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeliveryEstimate deliveryEstimate;

        private String displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private String taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.ShippingOption.ShippingRateData build() {
          return new SessionCreateParams.ShippingOption.ShippingRateData(
              this.deliveryEstimate,
              this.displayName,
              this.extraParams,
              this.fixedAmount,
              this.metadata,
              this.taxBehavior,
              this.taxCode,
              this.type);
        }

        /**
         * The estimated range for how long shipping will take, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDeliveryEstimate(
            SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate deliveryEstimate) {
          this.deliveryEstimate = deliveryEstimate;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.ShippingOption.ShippingRateData#extraParams} for the
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
         * map. See {@link SessionCreateParams.ShippingOption.ShippingRateData#extraParams} for the
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
         * Describes a fixed amount to charge for shipping. Must be present if type is {@code
         * fixed_amount}.
         */
        public Builder setFixedAmount(
            SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SessionCreateParams.ShippingOption.ShippingRateData#metadata} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.ShippingOption.ShippingRateData#metadata} for the
         * field documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
         * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        public Builder setTaxBehavior(
            SessionCreateParams.ShippingOption.ShippingRateData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(String taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /**
         * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for
         * now.
         */
        public Builder setType(SessionCreateParams.ShippingOption.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class DeliveryEstimate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
         * infinite.
         */
        @SerializedName("maximum")
        Maximum maximum;

        /** The lower bound of the estimated range. If empty, represents no lower bound. */
        @SerializedName("minimum")
        Minimum minimum;

        private DeliveryEstimate(
            Map<String, Object> extraParams, Maximum maximum, Minimum minimum) {
          this.extraParams = extraParams;
          this.maximum = maximum;
          this.minimum = minimum;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Maximum maximum;

          private Minimum minimum;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate build() {
            return new SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate#extraParams} for
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
           * map. See {@link
           * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
           * infinite.
           */
          public Builder setMaximum(
              SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum
                  maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum
                  minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
        public static class Maximum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Maximum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate
                  .Maximum(this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
             * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        public static class Minimum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Minimum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate
                  .Minimum(this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
             * SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                SessionCreateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class FixedAmount {
        /**
         * <strong>Required.</strong> A non-negative integer in cents representing how much to
         * charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
            currencyOptions;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private FixedAmount(
            Long amount,
            String currency,
            Map<
                    String,
                    SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
                currencyOptions,
            Map<String, Object> extraParams) {
          this.amount = amount;
          this.currency = currency;
          this.currencyOptions = currencyOptions;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Map<
                  String,
                  SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount build() {
            return new SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount(
                this.amount, this.currency, this.currencyOptions, this.extraParams);
          }

          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount#currencyOptions} for
           * the field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                  value) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the
           * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
           * original map. See {@link
           * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount#currencyOptions} for
           * the field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount
                          .CurrencyOption>
                  map) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount#extraParams} for the
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
           * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount#extraParams} for the
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
        public static class CurrencyOption {
          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          private CurrencyOption(
              Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.taxBehavior = taxBehavior;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private TaxBehavior taxBehavior;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount
                  .CurrencyOption(this.amount, this.extraParams, this.taxBehavior);
            }

            /**
             * <strong>Required.</strong> A non-negative integer in cents representing how much to
             * charge.
             */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes.
             * One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
             */
            public Builder setTaxBehavior(
                SessionCreateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                        .TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }
          }

          public enum TaxBehavior implements ApiRequestParams.EnumParam {
            @SerializedName("exclusive")
            EXCLUSIVE("exclusive"),

            @SerializedName("inclusive")
            INCLUSIVE("inclusive"),

            @SerializedName("unspecified")
            UNSPECIFIED("unspecified");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TaxBehavior(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("fixed_amount")
        FIXED_AMOUNT("fixed_amount");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class SubscriptionData {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. To use an application fee percent, the request must be made on behalf
     * of another account, using the {@code Stripe-Account} header or an OAuth key. For more
     * information, see the application fees <a
     * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /** A future timestamp to anchor the subscription's billing cycle for new subscriptions. */
    @SerializedName("billing_cycle_anchor")
    Long billingCycleAnchor;

    /**
     * The tax rates that will apply to any subscription item that does not have {@code tax_rates}
     * set. Invoices created will have their {@code default_tax_rates} populated from the
     * subscription.
     */
    @SerializedName("default_tax_rates")
    List<String> defaultTaxRates;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in the <a
     * href="https://stripe.com/docs/customer-management">customer portal</a>.
     */
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The account on behalf of which to charge, for each of the subscription's invoices. */
    @SerializedName("on_behalf_of")
    String onBehalfOf;

    /**
     * Determines how to handle prorations resulting from the {@code billing_cycle_anchor}. If no
     * value is passed, the default is {@code create_prorations}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * If specified, the funds from the subscription's invoices will be transferred to the
     * destination and the ID of the resulting transfers will be found on the resulting charges.
     */
    @SerializedName("transfer_data")
    TransferData transferData;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. Has to be at least 48 hours in the future.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time. Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    TrialSettings trialSettings;

    private SubscriptionData(
        BigDecimal applicationFeePercent,
        Long billingCycleAnchor,
        List<String> defaultTaxRates,
        String description,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String onBehalfOf,
        ProrationBehavior prorationBehavior,
        TransferData transferData,
        Long trialEnd,
        Long trialPeriodDays,
        TrialSettings trialSettings) {
      this.applicationFeePercent = applicationFeePercent;
      this.billingCycleAnchor = billingCycleAnchor;
      this.defaultTaxRates = defaultTaxRates;
      this.description = description;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.onBehalfOf = onBehalfOf;
      this.prorationBehavior = prorationBehavior;
      this.transferData = transferData;
      this.trialEnd = trialEnd;
      this.trialPeriodDays = trialPeriodDays;
      this.trialSettings = trialSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private Long billingCycleAnchor;

      private List<String> defaultTaxRates;

      private String description;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String onBehalfOf;

      private ProrationBehavior prorationBehavior;

      private TransferData transferData;

      private Long trialEnd;

      private Long trialPeriodDays;

      private TrialSettings trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.SubscriptionData build() {
        return new SessionCreateParams.SubscriptionData(
            this.applicationFeePercent,
            this.billingCycleAnchor,
            this.defaultTaxRates,
            this.description,
            this.extraParams,
            this.metadata,
            this.onBehalfOf,
            this.prorationBehavior,
            this.transferData,
            this.trialEnd,
            this.trialPeriodDays,
            this.trialSettings);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * application owner's Stripe account. To use an application fee percent, the request must be
       * made on behalf of another account, using the {@code Stripe-Account} header or an OAuth key.
       * For more information, see the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** A future timestamp to anchor the subscription's billing cycle for new subscriptions. */
      public Builder setBillingCycleAnchor(Long billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.SubscriptionData#defaultTaxRates} for the field documentation.
       */
      public Builder addDefaultTaxRate(String element) {
        if (this.defaultTaxRates == null) {
          this.defaultTaxRates = new ArrayList<>();
        }
        this.defaultTaxRates.add(element);
        return this;
      }

      /**
       * Add all elements to `defaultTaxRates` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SessionCreateParams.SubscriptionData#defaultTaxRates} for the field documentation.
       */
      public Builder addAllDefaultTaxRate(List<String> elements) {
        if (this.defaultTaxRates == null) {
          this.defaultTaxRates = new ArrayList<>();
        }
        this.defaultTaxRates.addAll(elements);
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in the <a
       * href="https://stripe.com/docs/customer-management">customer portal</a>.
       */
      public Builder setDescription(String description) {
        this.description = description;
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

      /** The account on behalf of which to charge, for each of the subscription's invoices. */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * Determines how to handle prorations resulting from the {@code billing_cycle_anchor}. If no
       * value is passed, the default is {@code create_prorations}.
       */
      public Builder setProrationBehavior(
          SessionCreateParams.SubscriptionData.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * If specified, the funds from the subscription's invoices will be transferred to the
       * destination and the ID of the resulting transfers will be found on the resulting charges.
       */
      public Builder setTransferData(
          SessionCreateParams.SubscriptionData.TransferData transferData) {
        this.transferData = transferData;
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
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(
          SessionCreateParams.SubscriptionData.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
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

      private TransferData(
          BigDecimal amountPercent, String destination, Map<String, Object> extraParams) {
        this.amountPercent = amountPercent;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BigDecimal amountPercent;

        private String destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.SubscriptionData.TransferData build() {
          return new SessionCreateParams.SubscriptionData.TransferData(
              this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
         */
        public Builder setAmountPercent(BigDecimal amountPercent) {
          this.amountPercent = amountPercent;
          return this;
        }

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.SubscriptionData.TransferData#extraParams} for the
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
         * map. See {@link SessionCreateParams.SubscriptionData.TransferData#extraParams} for the
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

    @Getter
    public static class TrialSettings {
      /**
       * <strong>Required.</strong> Defines how the subscription should behave when the user's free
       * trial ends.
       */
      @SerializedName("end_behavior")
      EndBehavior endBehavior;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
        this.endBehavior = endBehavior;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndBehavior endBehavior;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.SubscriptionData.TrialSettings build() {
          return new SessionCreateParams.SubscriptionData.TrialSettings(
              this.endBehavior, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Defines how the subscription should behave when the user's
         * free trial ends.
         */
        public Builder setEndBehavior(
            SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.SubscriptionData.TrialSettings#extraParams} for the
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
         * map. See {@link SessionCreateParams.SubscriptionData.TrialSettings#extraParams} for the
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
      public static class EndBehavior {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Indicates how the subscription should change when the trial
         * ends if the user did not provide a payment method.
         */
        @SerializedName("missing_payment_method")
        MissingPaymentMethod missingPaymentMethod;

        private EndBehavior(
            Map<String, Object> extraParams, MissingPaymentMethod missingPaymentMethod) {
          this.extraParams = extraParams;
          this.missingPaymentMethod = missingPaymentMethod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private MissingPaymentMethod missingPaymentMethod;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior build() {
            return new SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior(
                this.extraParams, this.missingPaymentMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior#extraParams} for the
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
           * SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior#extraParams} for the
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
           * <strong>Required.</strong> Indicates how the subscription should change when the trial
           * ends if the user did not provide a payment method.
           */
          public Builder setMissingPaymentMethod(
              SessionCreateParams.SubscriptionData.TrialSettings.EndBehavior.MissingPaymentMethod
                  missingPaymentMethod) {
            this.missingPaymentMethod = missingPaymentMethod;
            return this;
          }
        }

        public enum MissingPaymentMethod implements ApiRequestParams.EnumParam {
          @SerializedName("cancel")
          CANCEL("cancel"),

          @SerializedName("create_invoice")
          CREATE_INVOICE("create_invoice"),

          @SerializedName("pause")
          PAUSE("pause");

          @Getter(onMethod_ = {@Override})
          private final String value;

          MissingPaymentMethod(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class TaxIdCollection {
    /** <strong>Required.</strong> Set to true to enable Tax ID collection. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TaxIdCollection(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.TaxIdCollection build() {
        return new SessionCreateParams.TaxIdCollection(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to true to enable Tax ID collection. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.TaxIdCollection#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.TaxIdCollection#extraParams} for the field documentation.
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

  public enum CustomerCreation implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CustomerCreation(String value) {
      this.value = value;
    }
  }

  public enum Locale implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("bg")
    BG("bg"),

    @SerializedName("cs")
    CS("cs"),

    @SerializedName("da")
    DA("da"),

    @SerializedName("de")
    DE("de"),

    @SerializedName("el")
    EL("el"),

    @SerializedName("en")
    EN("en"),

    @SerializedName("en-GB")
    EN_GB("en-GB"),

    @SerializedName("es")
    ES("es"),

    @SerializedName("es-419")
    ES_419("es-419"),

    @SerializedName("et")
    ET("et"),

    @SerializedName("fi")
    FI("fi"),

    @SerializedName("fil")
    FIL("fil"),

    @SerializedName("fr")
    FR("fr"),

    @SerializedName("fr-CA")
    FR_CA("fr-CA"),

    @SerializedName("hr")
    HR("hr"),

    @SerializedName("hu")
    HU("hu"),

    @SerializedName("id")
    ID("id"),

    @SerializedName("it")
    IT("it"),

    @SerializedName("ja")
    JA("ja"),

    @SerializedName("ko")
    KO("ko"),

    @SerializedName("lt")
    LT("lt"),

    @SerializedName("lv")
    LV("lv"),

    @SerializedName("ms")
    MS("ms"),

    @SerializedName("mt")
    MT("mt"),

    @SerializedName("nb")
    NB("nb"),

    @SerializedName("nl")
    NL("nl"),

    @SerializedName("pl")
    PL("pl"),

    @SerializedName("pt")
    PT("pt"),

    @SerializedName("pt-BR")
    PT_BR("pt-BR"),

    @SerializedName("ro")
    RO("ro"),

    @SerializedName("ru")
    RU("ru"),

    @SerializedName("sk")
    SK("sk"),

    @SerializedName("sl")
    SL("sl"),

    @SerializedName("sv")
    SV("sv"),

    @SerializedName("th")
    TH("th"),

    @SerializedName("tr")
    TR("tr"),

    @SerializedName("vi")
    VI("vi"),

    @SerializedName("zh")
    ZH("zh"),

    @SerializedName("zh-HK")
    ZH_HK("zh-HK"),

    @SerializedName("zh-TW")
    ZH_TW("zh-TW");

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

  public enum PaymentMethodCollection implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodCollection(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodType implements ApiRequestParams.EnumParam {
    @SerializedName("acss_debit")
    ACSS_DEBIT("acss_debit"),

    @SerializedName("affirm")
    AFFIRM("affirm"),

    @SerializedName("afterpay_clearpay")
    AFTERPAY_CLEARPAY("afterpay_clearpay"),

    @SerializedName("alipay")
    ALIPAY("alipay"),

    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("blik")
    BLIK("blik"),

    @SerializedName("boleto")
    BOLETO("boleto"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("cashapp")
    CASHAPP("cashapp"),

    @SerializedName("customer_balance")
    CUSTOMER_BALANCE("customer_balance"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("klarna")
    KLARNA("klarna"),

    @SerializedName("konbini")
    KONBINI("konbini"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("paynow")
    PAYNOW("paynow"),

    @SerializedName("paypal")
    PAYPAL("paypal"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay"),

    @SerializedName("zip")
    ZIP("zip");

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
