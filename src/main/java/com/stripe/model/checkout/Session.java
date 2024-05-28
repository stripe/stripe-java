// File generated from our OpenAPI spec
package com.stripe.model.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Address;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Invoice;
import com.stripe.model.LineItemCollection;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentLink;
import com.stripe.model.SetupIntent;
import com.stripe.model.ShippingDetails;
import com.stripe.model.ShippingRate;
import com.stripe.model.StripeObject;
import com.stripe.model.Subscription;
import com.stripe.model.TaxRate;
import com.stripe.net.ApiMode;
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
public class Session extends ApiResource implements HasId {
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

  /**
   * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
   * similar, and can be used to reconcile the Session with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

  /** Client secret to be used when initializing Stripe.js embedded checkout. */
  @SerializedName("client_secret")
  String clientSecret;

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

  /** Currency conversion details for automatic currency conversion sessions. */
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

  /** The ID of the PaymentIntent for Checkout Sessions in {@code payment} mode. */
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

  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /** The ID of the original expired Checkout Session that triggered the recovery flow. */
  @SerializedName("recovered_from")
  String recoveredFrom;

  /**
   * This parameter applies to {@code ui_mode: embedded}. Learn more about the <a
   * href="https://stripe.com/docs/payments/checkout/custom-redirect-behavior">redirect behavior</a>
   * of embedded sessions. Defaults to {@code always}.
   *
   * <p>One of {@code always}, {@code if_required}, or {@code never}.
   */
  @SerializedName("redirect_on_completion")
  String redirectOnCompletion;

  /**
   * Applies to Checkout Sessions with {@code ui_mode: embedded}. The URL to redirect your customer
   * back to after they authenticate or cancel their payment on the payment method's app or site.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * Controls saved payment method settings for the session. Only available in {@code payment} and
   * {@code subscription} mode.
   */
  @SerializedName("saved_payment_method_options")
  SavedPaymentMethodOptions savedPaymentMethodOptions;

  /** The ID of the SetupIntent for Checkout Sessions in {@code setup} mode. */
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

  /** Shipping information for this Checkout Session. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

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
   * <p>One of {@code auto}, {@code book}, {@code donate}, or {@code pay}.
   */
  @SerializedName("submit_type")
  String submitType;

  /** The ID of the subscription for Checkout Sessions in {@code subscription} mode. */
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
   * <p>One of {@code embedded}, or {@code hosted}.
   */
  @SerializedName("ui_mode")
  String uiMode;

  /**
   * The URL to the Checkout Session. Redirect customers to this URL to take them to Checkout. If
   * you’re using <a href="https://stripe.com/docs/payments/checkout/custom-domains">Custom
   * Domains</a>, the URL will use your subdomain. Otherwise, it’ll use {@code checkout.stripe.com.}
   * This value is only present when the session is active.
   */
  @SerializedName("url")
  String url;

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

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Creates a Session object. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
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
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
   */
  public Session expire() throws StripeException {
    return expire((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
   */
  public Session expire(RequestOptions options) throws StripeException {
    return expire((Map<String, Object>) null, options);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
   */
  public Session expire(Map<String, Object> params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
   */
  public Session expire(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/expire", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Session.class);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
   */
  public Session expire(SessionExpireParams params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /**
   * A Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Session and customers loading the Session see
   * a message saying the Session is expired.
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
            options,
            ApiMode.V1);
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
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
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
            options,
            ApiMode.V1);
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
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
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
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Retrieves a Session object. */
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
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterExpiration extends StripeObject {
    /** When set, configuration used to recover the Checkout Session on expiry. */
    @SerializedName("recovery")
    Recovery recovery;

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

    /**
     * The status of the most recent automated tax calculation for this session.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterSubmit extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingAddress extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Submit extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TermsOfServiceAcceptance extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }
  }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code ad_nrt}, {@code ar_cuit}, {@code eu_vat}, {@code
       * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
       * {@code do_rcn}, {@code ec_ruc}, {@code eu_oss_vat}, {@code pe_ruc}, {@code ro_tin}, {@code
       * rs_pib}, {@code sv_nit}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, {@code gb_vat},
       * {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code no_vat}, {@code
       * no_voec}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen}, {@code ru_inn},
       * {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code tw_vat}, {@code
       * th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid}, {@code my_itn},
       * {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code ca_gst_hst}, {@code ca_pst_bc},
       * {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst}, {@code sg_gst}, {@code ae_trn},
       * {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code my_frp}, {@code il_vat}, {@code
       * ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic}, {@code hu_tin}, {@code si_tin},
       * {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code ph_tin}, {@code bh_vat}, {@code
       * kz_bin}, {@code ng_tin}, {@code om_vat}, or {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceCreation extends StripeObject {
    /** Indicates whether invoice creation is enabled for the Checkout Session. */
    @SerializedName("enabled")
    Boolean enabled;

    @SerializedName("invoice_data")
    InvoiceData invoiceData;

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RenderingOptions extends StripeObject {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         */
        @SerializedName("amount_tax_display")
        String amountTaxDisplay;
      }
    }
  }

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

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("konbini")
    Konbini konbini;

    @SerializedName("link")
    Link link;

    @SerializedName("mobilepay")
    Mobilepay mobilepay;

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("oxxo")
    Oxxo oxxo;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("paynow")
    Paynow paynow;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("pix")
    Pix pix;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("swish")
    Swish swish;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

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
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alipay extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {
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
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
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
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      @SerializedName("installments")
      Installments installments;

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments extends StripeObject {
        /** Indicates if installments are enabled. */
        @SerializedName("enabled")
        Boolean enabled;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fpx extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Giropay extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Grabpay extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
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
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
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
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paynow extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pix extends StripeObject {
      /** The number of seconds after which Pix payment will expire. */
      @SerializedName("expires_after_seconds")
      Long expiresAfterSeconds;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {
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
       * <p>One of {@code none}, or {@code off_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
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
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
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
       * <p>Equal to {@code none}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
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
       *
       * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
       */
      @SerializedName("setup_future_usage")
      String setupFutureUsage;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, or {@code instant}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FinancialConnections extends StripeObject {
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PhoneNumberCollection extends StripeObject {
    /** Indicates whether phone number collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;
  }

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddressCollection extends StripeObject {
    /**
     * An array of two-letter ISO country codes representing which countries Checkout should provide
     * as options for shipping locations. Unsupported country codes: {@code AS, CX, CC, CU, HM, IR,
     * KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<String> allowedCountries;
  }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** Amount of tax applied for this rate. */
      @SerializedName("amount")
      Long amount;

      /**
       * Tax rates can be applied to <a
       * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
       * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
       * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
       * Sessions</a> to collect tax.
       *
       * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxIdCollection extends StripeObject {
    /** Indicates whether tax ID collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;
  }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /** Amount of tax applied for this rate. */
        @SerializedName("amount")
        Long amount;

        /**
         * Tax rates can be applied to <a
         * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
         * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
         * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
         * Sessions</a> to collect tax.
         *
         * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(afterExpiration, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
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
    trySetResponseGetter(phoneNumberCollection, responseGetter);
    trySetResponseGetter(savedPaymentMethodOptions, responseGetter);
    trySetResponseGetter(setupIntent, responseGetter);
    trySetResponseGetter(shippingAddressCollection, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(taxIdCollection, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
  }
}
