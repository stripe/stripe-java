// File generated from our OpenAPI spec
package com.stripe.model.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Address;
import com.stripe.model.Coupon;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Invoice;
import com.stripe.model.LineItemCollection;
import com.stripe.model.MetadataStore;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentLink;
import com.stripe.model.PromotionCode;
import com.stripe.model.SetupIntent;
import com.stripe.model.ShippingRate;
import com.stripe.model.StripeObject;
import com.stripe.model.Subscription;
import com.stripe.model.TaxRate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionExpireParams;
import com.stripe.param.checkout.SessionListLineItemsParams;
import com.stripe.param.checkout.SessionListParams;
import com.stripe.param.checkout.SessionRetrieveParams;
import com.stripe.param.checkout.SessionUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Checkout Session represents your customer's session as they pay for one-time purchases or
 * subscriptions through <a href="https://stripe.com/docs/payments/checkout">Checkout</a> or <a
 * href="https://stripe.com/docs/payments/payment-links">Payment Links</a>. We recommend creating a
 * new Session each time your customer attempts to pay.
 *
 * <p>Once payment is successful, the Checkout Session will contain a reference to the <a
 * href="https://stripe.com/docs/api/customers">Customer</a>, and either the successful <a
 * href="https://stripe.com/docs/api/payment_intents">PaymentIntent</a> or an active <a
 * href="https://stripe.com/docs/api/subscriptions">Subscription</a>.
 *
 * <p>You can create a Checkout Session on your server and redirect to its URL to begin Checkout.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/checkout/quickstart">Checkout quickstart</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId, MetadataStore<Session> {
  /**
   * Settings for price localization with <a
   * href="https://docs.stripe.com/payments/checkout/adaptive-pricing">Adaptive Pricing</a>.
   */
  @SerializedName("adaptive_pricing")
  AdaptivePricing adaptivePricing;

  /** When set, provides configuration for actions to take if this Checkout Session expires. */
  @SerializedName("after_expiration")
  AfterExpiration afterExpiration;

  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /** Total of all items before discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total of all items after discounts and taxes are applied. */
  @SerializedName("amount_total")
  Long amountTotal;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Describes whether Checkout should collect the customer's billing address. Defaults to {@code
   * auto}.
   *
   * <p>One of {@code auto}, or {@code required}.
   */
  @SerializedName("billing_address_collection")
  String billingAddressCollection;

  /**
   * If set, Checkout displays a back button and customers will be directed to this URL if they
   * decide to cancel payment and return to your website.
   */
  @SerializedName("cancel_url")
  String cancelUrl;

  @SerializedName("checkout_items")
  List<Session.CheckoutItem> checkoutItems;

  /**
   * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
   * similar, and can be used to reconcile the Session with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

  /**
   * The client secret of your Checkout Session. Applies to Checkout Sessions with {@code ui_mode:
   * embedded} or {@code ui_mode: custom}. For {@code ui_mode: embedded}, the client secret is to be
   * used when initializing Stripe.js embedded checkout. For {@code ui_mode: custom}, use the client
   * secret with <a href="https://stripe.com/docs/js/custom_checkout/init">initCheckout</a> on your
   * front end.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Information about the customer collected within the Checkout Session. */
  @SerializedName("collected_information")
  CollectedInformation collectedInformation;

  /** Results of {@code consent_collection} for this session. */
  @SerializedName("consent")
  Consent consent;

  /**
   * When set, provides configuration for the Checkout Session to gather active consent from
   * customers.
   */
  @SerializedName("consent_collection")
  ConsentCollection consentCollection;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Currency conversion details for <a
   * href="https://docs.stripe.com/payments/checkout/adaptive-pricing">Adaptive Pricing</a> sessions
   * created before 2025-03-31.
   */
  @SerializedName("currency_conversion")
  CurrencyConversion currencyConversion;

  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are
   * supported.
   */
  @SerializedName("custom_fields")
  List<Session.CustomField> customFields;

  @SerializedName("custom_text")
  CustomText customText;

  /**
   * The ID of the customer for this Session. For Checkout Sessions in {@code subscription} mode or
   * Checkout Sessions with {@code customer_creation} set as {@code always} in {@code payment} mode,
   * Checkout will create a new customer object based on information provided during the payment
   * flow unless an existing customer was provided when the Session was created.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The ID of the account for this Session. */
  @SerializedName("customer_account")
  String customerAccount;

  /**
   * Configure whether a Checkout Session creates a Customer when the Checkout Session completes.
   *
   * <p>One of {@code always}, or {@code if_required}.
   */
  @SerializedName("customer_creation")
  String customerCreation;

  /**
   * The customer details including the customer's tax exempt status and the customer's tax IDs.
   * Customer's address details are not present on Sessions in {@code setup} mode.
   */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * If provided, this value will be used when the Customer object is created. If not provided,
   * customers will be asked to enter their email address. Use this parameter to prefill customer
   * data if you already have an email on file. To access information about the customer once the
   * payment flow is complete, use the {@code customer} attribute.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /** List of coupons and promotion codes attached to the Checkout Session. */
  @SerializedName("discounts")
  List<Session.Discount> discounts;

  /** The timestamp at which the Checkout Session will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the invoice created by the Checkout Session, if it exists. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /** Details on the state of invoice creation for the Checkout Session. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

  /** The line items purchased by the customer. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or {@code auto}, the
   * browser's locale is used.
   *
   * <p>One of {@code auto}, {@code bg}, {@code cs}, {@code da}, {@code de}, {@code el}, {@code en},
   * {@code en-GB}, {@code es}, {@code es-419}, {@code et}, {@code fi}, {@code fil}, {@code fr},
   * {@code fr-CA}, {@code hr}, {@code hu}, {@code id}, {@code it}, {@code ja}, {@code ko}, {@code
   * lt}, {@code lv}, {@code ms}, {@code mt}, {@code nb}, {@code nl}, {@code pl}, {@code pt}, {@code
   * pt-BR}, {@code ro}, {@code ru}, {@code sk}, {@code sl}, {@code sv}, {@code th}, {@code tr},
   * {@code vi}, {@code zh}, {@code zh-HK}, or {@code zh-TW}.
   */
  @SerializedName("locale")
  String locale;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The mode of the Checkout Session.
   *
   * <p>One of {@code payment}, {@code setup}, or {@code subscription}.
   */
  @SerializedName("mode")
  String mode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code checkout.session}.
   */
  @SerializedName("object")
  String object;

  /** The optional items presented to the customer at checkout. */
  @SerializedName("optional_items")
  List<Session.OptionalItem> optionalItems;

  /**
   * Where the user is coming from. This informs the optimizations that are applied to the session.
   *
   * <p>One of {@code mobile_app}, or {@code web}.
   */
  @SerializedName("origin_context")
  String originContext;

  /**
   * The ID of the PaymentIntent for Checkout Sessions in {@code payment} mode. You can't confirm or
   * cancel the PaymentIntent for a Checkout Session. To cancel, <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">expire the Checkout Session</a>
   * instead.
   */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /** The ID of the Payment Link that created this Session. */
  @SerializedName("payment_link")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentLink> paymentLink;

  /**
   * Configure whether a Checkout Session should collect a payment method. Defaults to {@code
   * always}.
   *
   * <p>One of {@code always}, or {@code if_required}.
   */
  @SerializedName("payment_method_collection")
  String paymentMethodCollection;

  /**
   * Information about the payment method configuration used for this Checkout session if using
   * dynamic payment methods.
   */
  @SerializedName("payment_method_configuration_details")
  PaymentMethodConfigurationDetails paymentMethodConfigurationDetails;

  /**
   * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this
   * CheckoutSession.
   */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * The payment status of the Checkout Session, one of {@code paid}, {@code unpaid}, or {@code
   * no_payment_required}. You can use this value to decide when to fulfill your customer's order.
   */
  @SerializedName("payment_status")
  String paymentStatus;

  /**
   * This property is used to set up permissions for various actions (e.g., update) on the
   * CheckoutSession object.
   *
   * <p>For specific permissions, please refer to their dedicated subsections, such as {@code
   * permissions.update_shipping_details}.
   */
  @SerializedName("permissions")
  Permissions permissions;

  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  @SerializedName("presentment_details")
  PresentmentDetails presentmentDetails;

  /** The ID of the original expired Checkout Session that triggered the recovery flow. */
  @SerializedName("recovered_from")
  String recoveredFrom;

  /**
   * This parameter applies to {@code ui_mode: embedded}. Learn more about the <a
   * href="https://stripe.com/docs/payments/checkout/custom-success-page?payment-ui=embedded-form">redirect
   * behavior</a> of embedded sessions. Defaults to {@code always}.
   *
   * <p>One of {@code always}, {@code if_required}, or {@code never}.
   */
  @SerializedName("redirect_on_completion")
  String redirectOnCompletion;

  /**
   * Applies to Checkout Sessions with {@code ui_mode: embedded} or {@code ui_mode: custom}. The URL
   * to redirect your customer back to after they authenticate or cancel their payment on the
   * payment method's app or site.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * Controls saved payment method settings for the session. Only available in {@code payment} and
   * {@code subscription} mode.
   */
  @SerializedName("saved_payment_method_options")
  SavedPaymentMethodOptions savedPaymentMethodOptions;

  /**
   * The ID of the SetupIntent for Checkout Sessions in {@code setup} mode. You can't confirm or
   * cancel the SetupIntent for a Checkout Session. To cancel, <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">expire the Checkout Session</a>
   * instead.
   */
  @SerializedName("setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> setupIntent;

  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /** The details of the customer cost of shipping, including the customer chosen ShippingRate. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /** The shipping rate options applied to this Session. */
  @SerializedName("shipping_options")
  List<Session.ShippingOption> shippingOptions;

  /**
   * The status of the Checkout Session, one of {@code open}, {@code complete}, or {@code expired}.
   */
  @SerializedName("status")
  String status;

  /**
   * Describes the type of transaction being performed by Checkout in order to customize relevant
   * text on the page, such as the submit button. {@code submit_type} can only be specified on
   * Checkout Sessions in {@code payment} mode. If blank or {@code auto}, {@code pay} is used.
   *
   * <p>One of {@code auto}, {@code book}, {@code donate}, {@code pay}, or {@code subscribe}.
   */
  @SerializedName("submit_type")
  String submitType;

  /**
   * The ID of the <a href="https://stripe.com/docs/api/subscriptions">Subscription</a> for Checkout
   * Sessions in {@code subscription} mode.
   */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /**
   * The URL the customer will be directed to after the payment or subscription creation is
   * successful.
   */
  @SerializedName("success_url")
  String successUrl;

  @SerializedName("tax_id_collection")
  TaxIdCollection taxIdCollection;

  /** Tax and discount details for the computed total amount. */
  @SerializedName("total_details")
  TotalDetails totalDetails;

  /**
   * The UI mode of the Session. Defaults to {@code hosted}.
   *
   * <p>One of {@code custom}, {@code embedded}, or {@code hosted}.
   */
  @SerializedName("ui_mode")
  String uiMode;

  /**
   * The URL to the Checkout Session. Applies to Checkout Sessions with {@code ui_mode: hosted}.
   * Redirect customers to this URL to take them to Checkout. If you’re using <a
   * href="https://stripe.com/docs/payments/checkout/custom-domains">Custom Domains</a>, the URL
   * will use your subdomain. Otherwise, it’ll use {@code checkout.stripe.com.} This value is only
   * present when the session is active.
   */
  @SerializedName("url")
  String url;

  /** Wallet-specific configuration for this Checkout Session. */
  @SerializedName("wallet_options")
  WalletOptions walletOptions;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code invoice} object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded {@code invoice}. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentIntent} object. */
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String id) {
    this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
  }

  /** Get expanded {@code paymentIntent}. */
  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent expandableObject) {
    this.paymentIntent =
        new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentLink} object. */
  public String getPaymentLink() {
    return (this.paymentLink != null) ? this.paymentLink.getId() : null;
  }

  public void setPaymentLink(String id) {
    this.paymentLink = ApiResource.setExpandableFieldId(id, this.paymentLink);
  }

  /** Get expanded {@code paymentLink}. */
  public PaymentLink getPaymentLinkObject() {
    return (this.paymentLink != null) ? this.paymentLink.getExpanded() : null;
  }

  public void setPaymentLinkObject(PaymentLink expandableObject) {
    this.paymentLink = new ExpandableField<PaymentLink>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code setupIntent} object. */
  public String getSetupIntent() {
    return (this.setupIntent != null) ? this.setupIntent.getId() : null;
  }

  public void setSetupIntent(String id) {
    this.setupIntent = ApiResource.setExpandableFieldId(id, this.setupIntent);
  }

  /** Get expanded {@code setupIntent}. */
  public SetupIntent getSetupIntentObject() {
    return (this.setupIntent != null) ? this.setupIntent.getExpanded() : null;
  }

  public void setSetupIntentObject(SetupIntent expandableObject) {
    this.setupIntent = new ExpandableField<SetupIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code subscription} object. */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /** Get expanded {@code subscription}. */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription =
        new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
  }

  /** Creates a Checkout Session object. */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Checkout Session object. */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Creates a Checkout Session object. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Checkout Session object. */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire() throws StripeException {
    return expire((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(RequestOptions options) throws StripeException {
    return expire((Map<String, Object>) null, options);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(Map<String, Object> params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/expire", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Session.class);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(SessionExpireParams params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(SessionExpireParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/expire", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Session.class);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SessionCollection.class);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SessionCollection.class);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(SessionListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(SessionListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /** Retrieves a Checkout Session object. */
  public static Session retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Checkout Session object. */
  public static Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /** Retrieves a Checkout Session object. */
  public static Session retrieve(String session, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Retrieves a Checkout Session object. */
  public static Session retrieve(
      String session, SessionRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /**
   * Updates a Checkout Session object.
   *
   * <p>Related guide: <a href="https://stripe.com/payments/checkout/dynamic-updates">Dynamically
   * update Checkout</a>.
   */
  @Override
  public Session update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a Checkout Session object.
   *
   * <p>Related guide: <a href="https://stripe.com/payments/checkout/dynamic-updates">Dynamically
   * update Checkout</a>.
   */
  @Override
  public Session update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Session.class);
  }

  /**
   * Updates a Checkout Session object.
   *
   * <p>Related guide: <a href="https://stripe.com/payments/checkout/dynamic-updates">Dynamically
   * update Checkout</a>.
   */
  public Session update(SessionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a Checkout Session object.
   *
   * <p>Related guide: <a href="https://stripe.com/payments/checkout/dynamic-updates">Dynamically
   * update Checkout</a>.
   */
  public Session update(SessionUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Session.class);
  }

  /**
   * For more details about AdaptivePricing, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdaptivePricing extends StripeObject {
    /**
     * If enabled, Adaptive Pricing is available on <a
     * href="https://docs.stripe.com/payments/currencies/localize-prices/adaptive-pricing?payment-ui=stripe-hosted#restrictions">eligible
     * sessions</a>.
     */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /**
   * For more details about AfterExpiration, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterExpiration extends StripeObject {
    /** When set, configuration used to recover the Checkout Session on expiry. */
    @SerializedName("recovery")
    Recovery recovery;

    /**
     * For more details about Recovery, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Recovery extends StripeObject {
      /**
       * Enables user redeemable promotion codes on the recovered Checkout Sessions. Defaults to
       * {@code false}
       */
      @SerializedName("allow_promotion_codes")
      Boolean allowPromotionCodes;

      /**
       * If {@code true}, a recovery url will be generated to recover this Checkout Session if it
       * expires before a transaction is completed. It will be attached to the Checkout Session
       * object upon expiration.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /** The timestamp at which the recovery URL will expire. */
      @SerializedName("expires_at")
      Long expiresAt;

      /**
       * URL that creates a new Checkout Session when clicked that is a copy of this expired
       * Checkout Session.
       */
      @SerializedName("url")
      String url;
    }
  }

  /**
   * For more details about AutomaticTax, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Indicates whether automatic tax is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    /** The tax provider powering automatic tax. */
    @SerializedName("provider")
    String provider;

    /**
     * The status of the most recent automated tax calculation for this session.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;

    /**
     * For more details about Liability, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability extends StripeObject {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Account> account;

      /**
       * Type of the account referenced.
       *
       * <p>One of {@code account}, or {@code self}.
       */
      @SerializedName("type")
      String type;

      /** Get ID of expandable {@code account} object. */
      public String getAccount() {
        return (this.account != null) ? this.account.getId() : null;
      }

      public void setAccount(String id) {
        this.account = ApiResource.setExpandableFieldId(id, this.account);
      }

      /** Get expanded {@code account}. */
      public Account getAccountObject() {
        return (this.account != null) ? this.account.getExpanded() : null;
      }

      public void setAccountObject(Account expandableObject) {
        this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
      }
    }
  }

  /**
   * For more details about CheckoutItem, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CheckoutItem extends StripeObject {
    @SerializedName("key")
    String key;

    @SerializedName("rate_card_subscription_item")
    RateCardSubscriptionItem rateCardSubscriptionItem;

    @SerializedName("type")
    String type;

    /**
     * For more details about RateCardSubscriptionItem, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RateCardSubscriptionItem extends StripeObject {
      @SerializedName("billing_cadence")
      String billingCadence;

      @SerializedName("metadata")
      Map<String, String> metadata;

      @SerializedName("rate_card")
      String rateCard;

      @SerializedName("rate_card_subscription")
      String rateCardSubscription;

      @SerializedName("rate_card_version")
      String rateCardVersion;
    }
  }

  /**
   * For more details about CollectedInformation, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectedInformation extends StripeObject {
    /** Customer’s business name for this Checkout Session. */
    @SerializedName("business_name")
    String businessName;

    /** Customer’s email for this Checkout Session. */
    @SerializedName("email")
    String email;

    /** Customer’s phone number for this Checkout Session. */
    @SerializedName("phone")
    String phone;

    /** Shipping information for this Checkout Session. */
    @SerializedName("shipping_details")
    ShippingDetails shippingDetails;

    /** Customer’s tax ids for this Checkout Session. */
    @SerializedName("tax_ids")
    List<Session.CollectedInformation.TaxId> taxIds;

    /**
     * For more details about ShippingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingDetails extends StripeObject {
      @SerializedName("address")
      Address address;

      /** Customer name. */
      @SerializedName("name")
      String name;
    }

    /**
     * For more details about TaxId, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code ad_nrt}, {@code ar_cuit}, {@code eu_vat}, {@code
       * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
       * {@code do_rcn}, {@code ec_ruc}, {@code eu_oss_vat}, {@code hr_oib}, {@code pe_ruc}, {@code
       * ro_tin}, {@code rs_pib}, {@code sv_nit}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin},
       * {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code
       * no_vat}, {@code no_voec}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
       * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code
       * tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid},
       * {@code li_vat}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code
       * ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst},
       * {@code sg_gst}, {@code ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code
       * my_frp}, {@code il_vat}, {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic},
       * {@code hu_tin}, {@code si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code
       * ph_tin}, {@code al_tin}, {@code bh_vat}, {@code kz_bin}, {@code ng_tin}, {@code om_vat},
       * {@code de_stn}, {@code ch_uid}, {@code tz_vat}, {@code uz_vat}, {@code uz_tin}, {@code
       * md_vat}, {@code ma_vat}, {@code by_tin}, {@code ao_tin}, {@code bs_tin}, {@code bb_tin},
       * {@code cd_nif}, {@code mr_nif}, {@code me_pib}, {@code zw_tin}, {@code ba_tin}, {@code
       * gn_nif}, {@code mk_vat}, {@code sr_fin}, {@code sn_ninea}, {@code am_tin}, {@code np_pan},
       * {@code tj_tin}, {@code ug_tin}, {@code zm_tin}, {@code kh_tin}, {@code aw_tin}, {@code
       * az_tin}, {@code bd_bin}, {@code bj_ifu}, {@code et_tin}, {@code kg_tin}, {@code la_tin},
       * {@code cm_niu}, {@code cv_nif}, {@code bf_ifu}, or {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Consent, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Consent extends StripeObject {
    /**
     * If {@code opt_in}, the customer consents to receiving promotional communications from the
     * merchant about this Checkout Session.
     *
     * <p>One of {@code opt_in}, or {@code opt_out}.
     */
    @SerializedName("promotions")
    String promotions;

    /**
     * If {@code accepted}, the customer in this Checkout Session has agreed to the merchant's terms
     * of service.
     *
     * <p>Equal to {@code accepted}.
     */
    @SerializedName("terms_of_service")
    String termsOfService;
  }

  /**
   * For more details about ConsentCollection, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ConsentCollection extends StripeObject {
    /**
     * If set to {@code hidden}, it will hide legal text related to the reuse of a payment method.
     */
    @SerializedName("payment_method_reuse_agreement")
    PaymentMethodReuseAgreement paymentMethodReuseAgreement;

    /**
     * If set to {@code auto}, enables the collection of customer consent for promotional
     * communications. The Checkout Session will determine whether to display an option to opt into
     * promotional communication from the merchant depending on the customer's locale. Only
     * available to US merchants.
     *
     * <p>One of {@code auto}, or {@code none}.
     */
    @SerializedName("promotions")
    String promotions;

    /**
     * If set to {@code required}, it requires customers to accept the terms of service before being
     * able to pay.
     *
     * <p>One of {@code none}, or {@code required}.
     */
    @SerializedName("terms_of_service")
    String termsOfService;

    /**
     * For more details about PaymentMethodReuseAgreement, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodReuseAgreement extends StripeObject {
      /**
       * Determines the position and visibility of the payment method reuse agreement in the UI.
       * When set to {@code auto}, Stripe's defaults will be used.
       *
       * <p>When set to {@code hidden}, the payment method reuse agreement text will always be
       * hidden in the UI.
       *
       * <p>One of {@code auto}, or {@code hidden}.
       */
      @SerializedName("position")
      String position;
    }
  }

  /**
   * For more details about CurrencyConversion, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyConversion extends StripeObject {
    /** Total of all items in source currency before discounts or taxes are applied. */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /** Total of all items in source currency after discounts and taxes are applied. */
    @SerializedName("amount_total")
    Long amountTotal;

    /** Exchange rate used to convert source currency amounts to customer currency amounts. */
    @SerializedName("fx_rate")
    BigDecimal fxRate;

    /** Creation currency of the CheckoutSession before localization. */
    @SerializedName("source_currency")
    String sourceCurrency;
  }

  /**
   * For more details about CustomField, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomField extends StripeObject {
    @SerializedName("dropdown")
    Dropdown dropdown;

    /**
     * String of your choice that your integration can use to reconcile this field. Must be unique
     * to this field, alphanumeric, and up to 200 characters.
     */
    @SerializedName("key")
    String key;

    @SerializedName("label")
    Label label;

    @SerializedName("numeric")
    Numeric numeric;

    /**
     * Whether the customer is required to complete the field before completing the Checkout
     * Session. Defaults to {@code false}.
     */
    @SerializedName("optional")
    Boolean optional;

    @SerializedName("text")
    Text text;

    /**
     * The type of the field.
     *
     * <p>One of {@code dropdown}, {@code numeric}, or {@code text}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Dropdown, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dropdown extends StripeObject {
      /** The value that will pre-fill on the payment page. */
      @SerializedName("default_value")
      String defaultValue;

      /** The options available for the customer to select. Up to 200 options allowed. */
      @SerializedName("options")
      List<Session.CustomField.Dropdown.Option> options;

      /** The option selected by the customer. This will be the {@code value} for the option. */
      @SerializedName("value")
      String value;

      /**
       * For more details about Option, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Option extends StripeObject {
        /** The label for the option, displayed to the customer. Up to 100 characters. */
        @SerializedName("label")
        String label;

        /**
         * The value for this option, not displayed to the customer, used by your integration to
         * reconcile the option selected by the customer. Must be unique to this option,
         * alphanumeric, and up to 100 characters.
         */
        @SerializedName("value")
        String value;
      }
    }

    /**
     * For more details about Label, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Label extends StripeObject {
      /** Custom text for the label, displayed to the customer. Up to 50 characters. */
      @SerializedName("custom")
      String custom;

      /**
       * The type of the label.
       *
       * <p>Equal to {@code custom}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Numeric, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Numeric extends StripeObject {
      /** The value that will pre-fill the field on the payment page. */
      @SerializedName("default_value")
      String defaultValue;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      /** The value entered by the customer, containing only digits. */
      @SerializedName("value")
      String value;
    }

    /**
     * For more details about Text, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Text extends StripeObject {
      /** The value that will pre-fill the field on the payment page. */
      @SerializedName("default_value")
      String defaultValue;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      /** The value entered by the customer. */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about CustomText, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomText extends StripeObject {
    /** Custom text that should be displayed after the payment confirmation button. */
    @SerializedName("after_submit")
    AfterSubmit afterSubmit;

    /** Custom text that should be displayed alongside shipping address collection. */
    @SerializedName("shipping_address")
    ShippingAddress shippingAddress;

    /** Custom text that should be displayed alongside the payment confirmation button. */
    @SerializedName("submit")
    Submit submit;

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    @SerializedName("terms_of_service_acceptance")
    TermsOfServiceAcceptance termsOfServiceAcceptance;

    /**
     * For more details about AfterSubmit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterSubmit extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    /**
     * For more details about ShippingAddress, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingAddress extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    /**
     * For more details about Submit, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Submit extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    /**
     * For more details about TermsOfServiceAcceptance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TermsOfServiceAcceptance extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }
  }

  /**
   * For more details about CustomerDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /**
     * The customer's address after a completed Checkout Session. Note: This property is populated
     * only for sessions on or after March 30, 2022.
     */
    @SerializedName("address")
    Address address;

    /**
     * The email associated with the Customer, if one exists, on the Checkout Session after a
     * completed Checkout Session or at time of session expiry. Otherwise, if the customer has
     * consented to promotional content, this value is the most recent valid email provided by the
     * customer on the Checkout form.
     */
    @SerializedName("email")
    String email;

    /**
     * The customer's name after a completed Checkout Session. Note: This property is populated only
     * for sessions on or after March 30, 2022.
     */
    @SerializedName("name")
    String name;

    /** The customer's phone number after a completed Checkout Session. */
    @SerializedName("phone")
    String phone;

    /**
     * The customer’s tax exempt status after a completed Checkout Session.
     *
     * <p>One of {@code exempt}, {@code none}, or {@code reverse}.
     */
    @SerializedName("tax_exempt")
    String taxExempt;

    /** The customer’s tax IDs after a completed Checkout Session. */
    @SerializedName("tax_ids")
    List<Session.CustomerDetails.TaxId> taxIds;

    /**
     * For more details about TaxId, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code ad_nrt}, {@code ar_cuit}, {@code eu_vat}, {@code
       * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
       * {@code do_rcn}, {@code ec_ruc}, {@code eu_oss_vat}, {@code hr_oib}, {@code pe_ruc}, {@code
       * ro_tin}, {@code rs_pib}, {@code sv_nit}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin},
       * {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code
       * no_vat}, {@code no_voec}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
       * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code
       * tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid},
       * {@code li_vat}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code
       * ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst},
       * {@code sg_gst}, {@code ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code
       * my_frp}, {@code il_vat}, {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic},
       * {@code hu_tin}, {@code si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code
       * ph_tin}, {@code al_tin}, {@code bh_vat}, {@code kz_bin}, {@code ng_tin}, {@code om_vat},
       * {@code de_stn}, {@code ch_uid}, {@code tz_vat}, {@code uz_vat}, {@code uz_tin}, {@code
       * md_vat}, {@code ma_vat}, {@code by_tin}, {@code ao_tin}, {@code bs_tin}, {@code bb_tin},
       * {@code cd_nif}, {@code mr_nif}, {@code me_pib}, {@code zw_tin}, {@code ba_tin}, {@code
       * gn_nif}, {@code mk_vat}, {@code sr_fin}, {@code sn_ninea}, {@code am_tin}, {@code np_pan},
       * {@code tj_tin}, {@code ug_tin}, {@code zm_tin}, {@code kh_tin}, {@code aw_tin}, {@code
       * az_tin}, {@code bd_bin}, {@code bj_ifu}, {@code et_tin}, {@code kg_tin}, {@code la_tin},
       * {@code cm_niu}, {@code cv_nif}, {@code bf_ifu}, or {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Discount, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount extends StripeObject {
    /** Coupon attached to the Checkout Session. */
    @SerializedName("coupon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Coupon> coupon;

    /** Promotion code attached to the Checkout Session. */
    @SerializedName("promotion_code")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PromotionCode> promotionCode;

    /** Get ID of expandable {@code coupon} object. */
    public String getCoupon() {
      return (this.coupon != null) ? this.coupon.getId() : null;
    }

    public void setCoupon(String id) {
      this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
    }

    /** Get expanded {@code coupon}. */
    public Coupon getCouponObject() {
      return (this.coupon != null) ? this.coupon.getExpanded() : null;
    }

    public void setCouponObject(Coupon expandableObject) {
      this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code promotionCode} object. */
    public String getPromotionCode() {
      return (this.promotionCode != null) ? this.promotionCode.getId() : null;
    }

    public void setPromotionCode(String id) {
      this.promotionCode = ApiResource.setExpandableFieldId(id, this.promotionCode);
    }

    /** Get expanded {@code promotionCode}. */
    public PromotionCode getPromotionCodeObject() {
      return (this.promotionCode != null) ? this.promotionCode.getExpanded() : null;
    }

    public void setPromotionCodeObject(PromotionCode expandableObject) {
      this.promotionCode =
          new ExpandableField<PromotionCode>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about InvoiceCreation, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceCreation extends StripeObject {
    /** Indicates whether invoice creation is enabled for the Checkout Session. */
    @SerializedName("enabled")
    Boolean enabled;

    @SerializedName("invoice_data")
    InvoiceData invoiceData;

    /**
     * For more details about InvoiceData, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceData extends StripeObject {
      /** The account tax IDs associated with the invoice. */
      @SerializedName("account_tax_ids")
      List<ExpandableField<com.stripe.model.TaxId>> accountTaxIds;

      /** Custom fields displayed on the invoice. */
      @SerializedName("custom_fields")
      List<Session.InvoiceCreation.InvoiceData.CustomField> customFields;

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      @SerializedName("description")
      String description;

      /** Footer displayed on the invoice. */
      @SerializedName("footer")
      String footer;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** Options for invoice PDF rendering. */
      @SerializedName("rendering_options")
      RenderingOptions renderingOptions;

      /** Get IDs of expandable {@code accountTaxIds} object list. */
      public List<String> getAccountTaxIds() {
        return (this.accountTaxIds != null)
            ? this.accountTaxIds.stream().map(x -> x.getId()).collect(Collectors.toList())
            : null;
      }

      public void setAccountTaxIds(List<String> ids) {
        if (ids == null) {
          this.accountTaxIds = null;
          return;
        }
        if (this.accountTaxIds != null
            && this.accountTaxIds.stream()
                .map(x -> x.getId())
                .collect(Collectors.toList())
                .equals(ids)) {
          // noop if the ids are equal to what are already present
          return;
        }
        this.accountTaxIds =
            (ids != null)
                ? ids.stream()
                    .map(id -> new ExpandableField<com.stripe.model.TaxId>(id, null))
                    .collect(Collectors.toList())
                : null;
      }

      /** Get expanded {@code accountTaxIds}. */
      public List<com.stripe.model.TaxId> getAccountTaxIdObjects() {
        return (this.accountTaxIds != null)
            ? this.accountTaxIds.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
            : null;
      }

      public void setAccountTaxIdObjects(List<com.stripe.model.TaxId> objs) {
        this.accountTaxIds =
            objs != null
                ? objs.stream()
                    .map(x -> new ExpandableField<com.stripe.model.TaxId>(x.getId(), x))
                    .collect(Collectors.toList())
                : null;
      }

      /**
       * For more details about CustomField, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomField extends StripeObject {
        /** The name of the custom field. */
        @SerializedName("name")
        String name;

        /** The value of the custom field. */
        @SerializedName("value")
        String value;
      }

      /**
       * For more details about Issuer, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer extends StripeObject {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Account> account;

        /**
         * Type of the account referenced.
         *
         * <p>One of {@code account}, or {@code self}.
         */
        @SerializedName("type")
        String type;

        /** Get ID of expandable {@code account} object. */
        public String getAccount() {
          return (this.account != null) ? this.account.getId() : null;
        }

        public void setAccount(String id) {
          this.account = ApiResource.setExpandableFieldId(id, this.account);
        }

        /** Get expanded {@code account}. */
        public Account getAccountObject() {
          return (this.account != null) ? this.account.getExpanded() : null;
        }

        public void setAccountObject(Account expandableObject) {
          this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
        }
      }

      /**
       * For more details about RenderingOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RenderingOptions extends StripeObject {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         */
        @SerializedName("amount_tax_display")
        String amountTaxDisplay;

        /** ID of the invoice rendering template to be used for the generated invoice. */
        @SerializedName("template")
        String template;
      }
    }
  }

  /**
   * For more details about OptionalItem, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OptionalItem extends StripeObject {
    @SerializedName("adjustable_quantity")
    AdjustableQuantity adjustableQuantity;

    @SerializedName("price")
    String price;

    @SerializedName("quantity")
    Long quantity;

    /**
     * For more details about AdjustableQuantity, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AdjustableQuantity extends StripeObject {
      /** Set to true if the quantity can be adjusted to any non-negative integer. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * The maximum quantity of this item the customer can purchase. By default this value is 99.
       * You can specify a value up to 999999.
       */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum quantity of this item the customer must purchase, if they choose to purchase
       * it. Because this item is optional, the customer will always be able to remove it from their
       * order, even if the {@code minimum} configured here is greater than 0. By default this value
       * is 0.
       */
      @SerializedName("minimum")
      Long minimum;
    }
  }

  /**
   * For more details about PaymentMethodConfigurationDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodConfigurationDetails extends StripeObject implements HasId {
    /** ID of the payment method configuration used. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** ID of the parent payment method configuration used. */
    @SerializedName("parent")
    String parent;
  }

  /**
   * For more details about PaymentMethodOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("affirm")
    Affirm affirm;

    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    @SerializedName("alipay")
    Alipay alipay;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("boleto")
    Boleto boleto;

    @SerializedName("card")
    Card card;

    @SerializedName("cashapp")
    Cashapp cashapp;

    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    @SerializedName("eps")
    Eps eps;

    @SerializedName("fpx")
    Fpx fpx;

    @SerializedName("giropay")
    Giropay giropay;

    @SerializedName("grabpay")
    Grabpay grabpay;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("kakao_pay")
    KakaoPay kakaoPay;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("konbini")
    Konbini konbini;

    @SerializedName("kr_card")
    KrCard krCard;

    @SerializedName("link")
    Link link;

    @SerializedName("mobilepay")
    Mobilepay mobilepay;

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("naver_pay")
    NaverPay naverPay;

    @SerializedName("oxxo")
    Oxxo oxxo;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("payco")
    Payco payco;

    @SerializedName("paynow")
    Paynow paynow;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("payto")
    Payto payto;

    @SerializedName("pix")
    Pix pix;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("samsung_pay")
    SamsungPay samsungPay;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("swish")
    Swish swish;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * For more details about AcssDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /**
       * Currency supported by the bank account. Returned when the Session is in {@code setup} mode.
       *
       * <p>One of {@code cad}, or {@code usd}.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /** A URL for custom mandate text. */
        @SerializedName("custom_mandate_url")
        String customMandateUrl;

        /**
         * List of Stripe products where this mandate can be selected automatically. Returned when
         * the Session is in {@code setup} mode.
         */
        @SerializedName("default_for")
        List<String> defaultFor;

        /**
         * Description of the interval. Only required if the 'payment_schedule' parameter is
         * 'interval' or 'combined'.
         */
        @SerializedName("interval_description")
        String intervalDescription;

        /**
         * Payment schedule for the mandate.
         *
         * <p>One of {@code combined}, {@code interval}, or {@code sporadic}.
         */
        @SerializedName("payment_schedule")
        String paymentSchedule;

        /**
         * Transaction type of the mandate.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("transaction_type")
        String transactionType;
      }
    }

    /**
     * For more details about Affirm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about AfterpayClearpay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Alipay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alipay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about AmazonPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about AuBecsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;
    }

    /**
     * For more details about BacsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
         * consist of only uppercase letters, numbers, spaces, or the following special characters:
         * '/', '_', '-', '&amp;', '.'. Cannot begin with 'DDIC' or 'STRIPE'.
         */
        @SerializedName("reference_prefix")
        String referencePrefix;
      }
    }

    /**
     * For more details about Bancontact, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Boleto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Boleto extends StripeObject {
      /**
       * The number of calendar days before a Boleto voucher expires. For example, if you create a
       * Boleto voucher on Monday and you set expires_after_days to 2, the Boleto voucher will
       * expire on Wednesday at 23:59 America/Sao_Paulo time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      @SerializedName("installments")
      Installments installments;

      /**
       * Request ability to <a href="https://stripe.com/payments/extended-authorization">capture
       * beyond the standard authorization validity window</a> for this CheckoutSession.
       *
       * <p>One of {@code if_available}, or {@code never}.
       */
      @SerializedName("request_decremental_authorization")
      String requestDecrementalAuthorization;

      /**
       * Request ability to <a href="https://stripe.com/payments/extended-authorization">capture
       * beyond the standard authorization validity window</a> for this CheckoutSession.
       *
       * <p>One of {@code if_available}, or {@code never}.
       */
      @SerializedName("request_extended_authorization")
      String requestExtendedAuthorization;

      /**
       * Request ability to <a
       * href="https://stripe.com/payments/incremental-authorization">increment the
       * authorization</a> for this CheckoutSession.
       *
       * <p>One of {@code if_available}, or {@code never}.
       */
      @SerializedName("request_incremental_authorization")
      String requestIncrementalAuthorization;

      /**
       * Request ability to make <a href="https://stripe.com/payments/multicapture">multiple
       * captures</a> for this CheckoutSession.
       *
       * <p>One of {@code if_available}, or {@code never}.
       */
      @SerializedName("request_multicapture")
      String requestMulticapture;

      /**
       * Request ability to <a href="https://stripe.com/payments/overcapture">overcapture</a> for
       * this CheckoutSession.
       *
       * <p>One of {@code if_available}, or {@code never}.
       */
      @SerializedName("request_overcapture")
      String requestOvercapture;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. If not provided, this value defaults to {@code automatic}. Read our
       * guide on <a
       * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       *
       * <p>One of {@code any}, {@code automatic}, or {@code challenge}.
       */
      @SerializedName("request_three_d_secure")
      String requestThreeDSecure;

      @SerializedName("restrictions")
      Restrictions restrictions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

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

      /**
       * For more details about Installments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments extends StripeObject {
        /** Indicates if installments are enabled. */
        @SerializedName("enabled")
        Boolean enabled;
      }

      /**
       * For more details about Restrictions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Restrictions extends StripeObject {
        /**
         * Specify the card brands to block in the Checkout Session. If a customer enters or selects
         * a card belonging to a blocked brand, they can't complete the Session.
         */
        @SerializedName("brands_blocked")
        List<String> brandsBlocked;
      }
    }

    /**
     * For more details about Cashapp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about CustomerBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerBalance extends StripeObject {
      @SerializedName("bank_transfer")
      BankTransfer bankTransfer;

      /**
       * The funding method type to be used when there are not enough funds in the customer balance.
       * Permitted values include: {@code bank_transfer}.
       *
       * <p>Equal to {@code bank_transfer}.
       */
      @SerializedName("funding_type")
      String fundingType;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * For more details about BankTransfer, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BankTransfer extends StripeObject {
        @SerializedName("eu_bank_transfer")
        EuBankTransfer euBankTransfer;

        /**
         * List of address types that should be returned in the financial_addresses response. If not
         * specified, all valid types will be returned.
         *
         * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or {@code
         * spei}.
         */
        @SerializedName("requested_address_types")
        List<String> requestedAddressTypes;

        /**
         * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted
         * values include: {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code
         * jp_bank_transfer}, {@code mx_bank_transfer}, or {@code us_bank_transfer}.
         *
         * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer},
         * {@code mx_bank_transfer}, or {@code us_bank_transfer}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about EuBankTransfer, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class EuBankTransfer extends StripeObject {
          /**
           * The desired country code of the bank account information. Permitted values include:
           * {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code NL}.
           *
           * <p>One of {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code NL}.
           */
          @SerializedName("country")
          String country;
        }
      }
    }

    /**
     * For more details about Eps, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Fpx, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fpx extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Giropay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Giropay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Grabpay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Grabpay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about KakaoPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Konbini, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Konbini extends StripeObject {
      /**
       * The number of calendar days (between 1 and 60) after which Konbini payment instructions
       * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
       * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
       * 23:59:59 JST.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about KrCard, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Mobilepay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Multibanco, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about NaverPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Oxxo, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Oxxo extends StripeObject {
      /**
       * The number of calendar days before an OXXO invoice expires. For example, if you create an
       * OXXO invoice on Monday and you set expires_after_days to 2, the OXXO invoice will expire on
       * Wednesday at 23:59 America/Mexico_City time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about P24, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Payco, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payco extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;
    }

    /**
     * For more details about Paynow, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paynow extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;

      /** Preferred locale of the PayPal checkout page that the customer is redirected to. */
      @SerializedName("preferred_locale")
      String preferredLocale;

      /**
       * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
       * invoice ID. This must be a globally unique ID if you have configured in your PayPal
       * settings to block multiple payments per invoice ID.
       */
      @SerializedName("reference")
      String reference;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * The Stripe connected account IDs of the sellers on the platform for this transaction
       * (optional). Only allowed when <a
       * href="https://stripe.com/docs/connect/separate-charges-and-transfers">separate charges and
       * transfers</a> are used.
       */
      @SerializedName("subsellers")
      List<String> subsellers;
    }

    /**
     * For more details about Payto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payto extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Amount that will be collected. It is required when {@code amount_type} is {@code fixed}.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * The type of amount that will be collected. The amount charged must be exact or up to the
         * value of {@code amount} param for {@code fixed} or {@code maximum} type respectively.
         *
         * <p>One of {@code fixed}, or {@code maximum}.
         */
        @SerializedName("amount_type")
        String amountType;

        /**
         * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no
         * end date.
         */
        @SerializedName("end_date")
        String endDate;

        /**
         * The periodicity at which payments will be collected.
         *
         * <p>One of {@code adhoc}, {@code annual}, {@code daily}, {@code fortnightly}, {@code
         * monthly}, {@code quarterly}, {@code semi_annual}, or {@code weekly}.
         */
        @SerializedName("payment_schedule")
        String paymentSchedule;

        /**
         * The number of payments that will be made during a payment period. Defaults to 1 except
         * for when {@code payment_schedule} is {@code adhoc}. In that case, it defaults to no
         * limit.
         */
        @SerializedName("payments_per_period")
        Long paymentsPerPeriod;

        /**
         * The purpose for which payments are made. Defaults to retail.
         *
         * <p>One of {@code dependant_support}, {@code government}, {@code loan}, {@code mortgage},
         * {@code other}, {@code pension}, {@code personal}, {@code retail}, {@code salary}, {@code
         * tax}, or {@code utility}.
         */
        @SerializedName("purpose")
        String purpose;

        /**
         * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to
         * confirmation time.
         */
        @SerializedName("start_date")
        String startDate;
      }
    }

    /**
     * For more details about Pix, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pix extends StripeObject {
      /** The number of seconds after which Pix payment will expire. */
      @SerializedName("expires_after_seconds")
      Long expiresAfterSeconds;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about RevolutPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about SamsungPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPay extends StripeObject {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>Equal to {@code manual}.
       */
      @SerializedName("capture_method")
      String captureMethod;
    }

    /**
     * For more details about SepaDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
         * consist of only uppercase letters, numbers, spaces, or the following special characters:
         * '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
         */
        @SerializedName("reference_prefix")
        String referencePrefix;
      }
    }

    /**
     * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    /**
     * For more details about Swish, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Swish extends StripeObject {
      /**
       * The order reference that will be displayed to customers in the Swish application. Defaults
       * to the {@code id} of the Payment Intent.
       */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, or {@code instant}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /**
       * For more details about FinancialConnections, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FinancialConnections extends StripeObject {
        @SerializedName("filters")
        Filters filters;

        @SerializedName("manual_entry")
        ManualEntry manualEntry;

        /**
         * The list of permissions to request. The {@code payment_method} permission must be
         * included.
         */
        @SerializedName("permissions")
        List<String> permissions;

        /** Data features requested to be retrieved upon account creation. */
        @SerializedName("prefetch")
        List<String> prefetch;

        /**
         * For webview integrations only. Upon completing OAuth login in the native browser, the
         * user will be redirected to this URL to return to your app.
         */
        @SerializedName("return_url")
        String returnUrl;

        /**
         * For more details about Filters, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Filters extends StripeObject {
          /**
           * The account subcategories to use to filter for possible accounts to link. Valid
           * subcategories are {@code checking} and {@code savings}.
           */
          @SerializedName("account_subcategories")
          List<String> accountSubcategories;

          /** The institution to use to filter for possible accounts to link. */
          @SerializedName("institution")
          String institution;
        }

        /**
         * For more details about ManualEntry, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ManualEntry extends StripeObject {
          /**
           * Settings for configuring manual entry of account details.
           *
           * <p>One of {@code automatic}, or {@code custom}.
           */
          @SerializedName("mode")
          String mode;
        }
      }
    }
  }

  /**
   * For more details about Permissions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Permissions extends StripeObject {
    /** Permissions for updating the Checkout Session. */
    @SerializedName("update")
    Update update;

    /**
     * Determines which entity is allowed to update the line items.
     *
     * <p>Default is {@code client_only}. Stripe Checkout client will automatically update the line
     * items. If set to {@code server_only}, only your server is allowed to update the line items.
     *
     * <p>When set to {@code server_only}, you must add the onLineItemsChange event handler when
     * initializing the Stripe Checkout client and manually update the line items from your server
     * using the Stripe API.
     *
     * <p>One of {@code client_only}, or {@code server_only}.
     */
    @SerializedName("update_line_items")
    String updateLineItems;

    /**
     * Determines which entity is allowed to update the shipping details.
     *
     * <p>Default is {@code client_only}. Stripe Checkout client will automatically update the
     * shipping details. If set to {@code server_only}, only your server is allowed to update the
     * shipping details.
     *
     * <p>When set to {@code server_only}, you must add the onShippingDetailsChange event handler
     * when initializing the Stripe Checkout client and manually update the shipping details from
     * your server using the Stripe API.
     *
     * <p>One of {@code client_only}, or {@code server_only}.
     */
    @SerializedName("update_shipping_details")
    String updateShippingDetails;

    /**
     * For more details about Update, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Update extends StripeObject {
      /**
       * Determines which entity is allowed to update the line items.
       *
       * <p>Default is {@code client_only}. Stripe Checkout client will automatically update the
       * line items. If set to {@code server_only}, only your server is allowed to update the line
       * items.
       *
       * <p>When set to {@code server_only}, you must add the onLineItemsChange event handler when
       * initializing the Stripe Checkout client and manually update the line items from your server
       * using the Stripe API.
       *
       * <p>One of {@code client_only}, or {@code server_only}.
       */
      @SerializedName("line_items")
      String lineItems;

      /**
       * Determines which entity is allowed to update the shipping details.
       *
       * <p>Default is {@code client_only}. Stripe Checkout client will automatically update the
       * shipping details. If set to {@code server_only}, only your server is allowed to update the
       * shipping details.
       *
       * <p>When set to {@code server_only}, you must add the onShippingDetailsChange event handler
       * when initializing the Stripe Checkout client and manually update the shipping details from
       * your server using the Stripe API.
       *
       * <p>One of {@code client_only}, or {@code server_only}.
       */
      @SerializedName("shipping_details")
      String shippingDetails;
    }
  }

  /**
   * For more details about PhoneNumberCollection, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PhoneNumberCollection extends StripeObject {
    /** Indicates whether phone number collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /**
   * For more details about PresentmentDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PresentmentDetails extends StripeObject {
    /**
     * Amount intended to be collected by this payment, denominated in {@code presentment_currency}.
     */
    @SerializedName("presentment_amount")
    Long presentmentAmount;

    /** Currency presented to the customer during payment. */
    @SerializedName("presentment_currency")
    String presentmentCurrency;
  }

  /**
   * For more details about SavedPaymentMethodOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SavedPaymentMethodOptions extends StripeObject {
    /**
     * Uses the {@code allow_redisplay} value of each saved payment method to filter the set
     * presented to a returning customer. By default, only saved payment methods with
     * ’allow_redisplay: ‘always’ are shown in Checkout.
     */
    @SerializedName("allow_redisplay_filters")
    List<String> allowRedisplayFilters;

    /**
     * Enable customers to choose if they wish to remove their saved payment methods. Disabled by
     * default.
     *
     * <p>One of {@code disabled}, or {@code enabled}.
     */
    @SerializedName("payment_method_remove")
    String paymentMethodRemove;

    /**
     * Enable customers to choose if they wish to save their payment method for future use. Disabled
     * by default.
     *
     * <p>One of {@code disabled}, or {@code enabled}.
     */
    @SerializedName("payment_method_save")
    String paymentMethodSave;
  }

  /**
   * For more details about ShippingAddressCollection, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddressCollection extends StripeObject {
    /**
     * An array of two-letter ISO country codes representing which countries Checkout should provide
     * as options for shipping locations. Unsupported country codes: {@code AS, CX, CC, CU, HM, IR,
     * KP, MH, FM, NF, MP, PW, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<String> allowedCountries;
  }

  /**
   * For more details about ShippingCost, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost extends StripeObject {
    /** Total shipping cost before any discounts or taxes are applied. */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /** Total tax amount applied due to shipping costs. If no tax was applied, defaults to 0. */
    @SerializedName("amount_tax")
    Long amountTax;

    /** Total shipping cost after discounts and taxes are applied. */
    @SerializedName("amount_total")
    Long amountTotal;

    /** The ID of the ShippingRate for this order. */
    @SerializedName("shipping_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<ShippingRate> shippingRate;

    /** The taxes applied to the shipping rate. */
    @SerializedName("taxes")
    List<Session.ShippingCost.Tax> taxes;

    /** Get ID of expandable {@code shippingRate} object. */
    public String getShippingRate() {
      return (this.shippingRate != null) ? this.shippingRate.getId() : null;
    }

    public void setShippingRate(String id) {
      this.shippingRate = ApiResource.setExpandableFieldId(id, this.shippingRate);
    }

    /** Get expanded {@code shippingRate}. */
    public ShippingRate getShippingRateObject() {
      return (this.shippingRate != null) ? this.shippingRate.getExpanded() : null;
    }

    public void setShippingRateObject(ShippingRate expandableObject) {
      this.shippingRate =
          new ExpandableField<ShippingRate>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** Amount of tax applied for this rate. */
      @SerializedName("amount")
      Long amount;

      /**
       * Tax rates can be applied to <a
       * href="https://stripe.com/invoicing/taxes/tax-rates">invoices</a>, <a
       * href="https://stripe.com/billing/taxes/tax-rates">subscriptions</a> and <a
       * href="https://stripe.com/payments/checkout/use-manual-tax-rates">Checkout Sessions</a> to
       * collect tax.
       *
       * <p>Related guide: <a href="https://stripe.com/billing/taxes/tax-rates">Tax rates</a>
       */
      @SerializedName("rate")
      TaxRate rate;

      /**
       * The reasoning behind this tax, for example, if the product is tax exempt. The possible
       * values for this field may be extended as new tax rules are supported.
       *
       * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
       * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
       * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
       * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
       * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
       */
      @SerializedName("taxability_reason")
      String taxabilityReason;

      /** The amount on which tax is calculated, in cents (or local equivalent). */
      @SerializedName("taxable_amount")
      Long taxableAmount;
    }
  }

  /**
   * For more details about ShippingOption, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingOption extends StripeObject {
    /** A non-negative integer in cents representing how much to charge. */
    @SerializedName("shipping_amount")
    Long shippingAmount;

    /** The shipping rate. */
    @SerializedName("shipping_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<ShippingRate> shippingRate;

    /** Get ID of expandable {@code shippingRate} object. */
    public String getShippingRate() {
      return (this.shippingRate != null) ? this.shippingRate.getId() : null;
    }

    public void setShippingRate(String id) {
      this.shippingRate = ApiResource.setExpandableFieldId(id, this.shippingRate);
    }

    /** Get expanded {@code shippingRate}. */
    public ShippingRate getShippingRateObject() {
      return (this.shippingRate != null) ? this.shippingRate.getExpanded() : null;
    }

    public void setShippingRateObject(ShippingRate expandableObject) {
      this.shippingRate =
          new ExpandableField<ShippingRate>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about TaxIdCollection, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxIdCollection extends StripeObject {
    /** Indicates whether tax ID collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Indicates whether a tax ID is required on the payment page
     *
     * <p>One of {@code if_supported}, or {@code never}.
     */
    @SerializedName("required")
    String required;
  }

  /**
   * For more details about TotalDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** This is the sum of all the discounts. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** This is the sum of all the shipping amounts. */
    @SerializedName("amount_shipping")
    Long amountShipping;

    /** This is the sum of all the tax amounts. */
    @SerializedName("amount_tax")
    Long amountTax;

    @SerializedName("breakdown")
    Breakdown breakdown;

    /**
     * For more details about Breakdown, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Breakdown extends StripeObject {
      /** The aggregated discounts. */
      @SerializedName("discounts")
      List<Session.TotalDetails.Breakdown.Discount> discounts;

      /** The aggregated tax amounts by rate. */
      @SerializedName("taxes")
      List<Session.TotalDetails.Breakdown.Tax> taxes;

      /**
       * For more details about Discount, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** The amount discounted. */
        @SerializedName("amount")
        Long amount;

        /**
         * A discount represents the actual application of a <a
         * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
         * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
         * information about when the discount began, when it will end, and what it is applied to.
         *
         * <p>Related guide: <a
         * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying discounts to
         * subscriptions</a>
         */
        @SerializedName("discount")
        com.stripe.model.Discount discount;
      }

      /**
       * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /** Amount of tax applied for this rate. */
        @SerializedName("amount")
        Long amount;

        /**
         * Tax rates can be applied to <a
         * href="https://stripe.com/invoicing/taxes/tax-rates">invoices</a>, <a
         * href="https://stripe.com/billing/taxes/tax-rates">subscriptions</a> and <a
         * href="https://stripe.com/payments/checkout/use-manual-tax-rates">Checkout Sessions</a> to
         * collect tax.
         *
         * <p>Related guide: <a href="https://stripe.com/billing/taxes/tax-rates">Tax rates</a>
         */
        @SerializedName("rate")
        TaxRate rate;

        /**
         * The reasoning behind this tax, for example, if the product is tax exempt. The possible
         * values for this field may be extended as new tax rules are supported.
         *
         * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
         * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
         * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
         * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
         * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
         */
        @SerializedName("taxability_reason")
        String taxabilityReason;

        /** The amount on which tax is calculated, in cents (or local equivalent). */
        @SerializedName("taxable_amount")
        Long taxableAmount;
      }
    }
  }

  /**
   * For more details about WalletOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WalletOptions extends StripeObject {
    @SerializedName("link")
    Link link;

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /**
       * Describes whether Checkout should display Link. Defaults to {@code auto}.
       *
       * <p>One of {@code auto}, or {@code never}.
       */
      @SerializedName("display")
      String display;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(adaptivePricing, responseGetter);
    trySetResponseGetter(afterExpiration, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(collectedInformation, responseGetter);
    trySetResponseGetter(consent, responseGetter);
    trySetResponseGetter(consentCollection, responseGetter);
    trySetResponseGetter(currencyConversion, responseGetter);
    trySetResponseGetter(customText, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(invoiceCreation, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(paymentIntent, responseGetter);
    trySetResponseGetter(paymentLink, responseGetter);
    trySetResponseGetter(paymentMethodConfigurationDetails, responseGetter);
    trySetResponseGetter(paymentMethodOptions, responseGetter);
    trySetResponseGetter(permissions, responseGetter);
    trySetResponseGetter(phoneNumberCollection, responseGetter);
    trySetResponseGetter(presentmentDetails, responseGetter);
    trySetResponseGetter(savedPaymentMethodOptions, responseGetter);
    trySetResponseGetter(setupIntent, responseGetter);
    trySetResponseGetter(shippingAddressCollection, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(taxIdCollection, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
    trySetResponseGetter(walletOptions, responseGetter);
  }
}
