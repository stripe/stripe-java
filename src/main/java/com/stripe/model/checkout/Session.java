package com.stripe.model.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.LineItemCollection;
import com.stripe.model.PaymentIntent;
import com.stripe.model.Plan;
import com.stripe.model.SetupIntent;
import com.stripe.model.ShippingDetails;
import com.stripe.model.Sku;
import com.stripe.model.StripeObject;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionListLineItemsParams;
import com.stripe.param.checkout.SessionListParams;
import com.stripe.param.checkout.SessionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {
  /**
   * The value ({@code auto} or {@code required}) for whether Checkout collected the customer's
   * billing address.
   */
  @SerializedName("billing_address_collection")
  String billingAddressCollection;

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
   * The ID of the customer for this session. For Checkout Sessions in {@code payment} or {@code
   * subscription} mode, Checkout will create a new customer object based on information provided
   * during the session unless an existing customer was provided when the session was created.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * If provided, this value will be used when the Customer object is created. If not provided,
   * customers will be asked to enter their email address. Use this parameter to prefill customer
   * data if you already have an email on file. To access information about the customer once a
   * session is complete, use the {@code customer} attribute.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /** The line items, plans, or SKUs purchased by the customer. Prefer using {@code line_items}. */
  @SerializedName("display_items")
  List<Session.DisplayItem> displayItems;

  /** Unique identifier for the object. Used to pass to {@code redirectToCheckout} in Stripe.js. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
   * {@code es}, {@code et}, {@code fi}, {@code fr}, {@code hu}, {@code it}, {@code ja}, {@code lt},
   * {@code lv}, {@code ms}, {@code mt}, {@code nb}, {@code nl}, {@code pl}, {@code pt}, {@code
   * pt-BR}, {@code ro}, {@code ru}, {@code sk}, {@code sl}, {@code sv}, {@code tr}, or {@code zh}.
   */
  @SerializedName("locale")
  String locale;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The mode of the Checkout Session, one of {@code payment}, {@code setup}, or {@code
   * subscription}.
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

  /**
   * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** The ID of the SetupIntent for Checkout Sessions in {@code setup} mode. */
  @SerializedName("setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> setupIntent;

  /** Shipping information for this Checkout Session. */
  @SerializedName("shipping")
  ShippingDetails shipping;

  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /**
   * Describes the type of transaction being performed by Checkout in order to customize relevant
   * text on the page, such as the submit button. {@code submit_type} can only be specified on
   * Checkout Sessions in {@code payment} mode, but not Checkout Sessions in {@code subscription} or
   * {@code setup} mode.
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

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.requestCollection(url, params, SessionCollection.class, options);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.requestCollection(url, params, SessionCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Session.class, options);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(
      String session, SessionRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Session.class, options);
  }

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
  }

  /** Creates a Session object. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId())));

    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(SessionListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(SessionListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId())));

    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DisplayItem extends StripeObject {
    /** Amount for the display item. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    @SerializedName("custom")
    Custom custom;

    /**
     * You can now model subscriptions more flexibly using the <a
     * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
     * backwards compatible to simplify your migration.
     *
     * <p>Plans define the base price, currency, and billing cycle for recurring purchases of
     * products. <a href="https://stripe.com/docs/api#products">Products</a> help you track
     * inventory or provisioning, and plans help you track pricing. Different physical goods or
     * levels of service should be represented by products, and pricing options should be
     * represented by plans. This approach lets you change prices without having to change your
     * provisioning scheme.
     *
     * <p>For example, you might have a single &quot;gold&quot; product that has plans for
     * $10/month, $100/year, €9/month, and €90/year.
     *
     * <p>Related guides: <a
     * href="https://stripe.com/docs/billing/subscriptions/set-up-subscription">Set up a
     * subscription</a> and more about <a
     * href="https://stripe.com/docs/billing/prices-guide">products and prices</a>.
     */
    @SerializedName("plan")
    Plan plan;

    /** Quantity of the display item being purchased. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * Stores representations of <a href="http://en.wikipedia.org/wiki/Stock_keeping_unit">stock
     * keeping units</a>. SKUs describe specific product variations, taking into account any
     * combination of: attributes, currency, and cost. For example, a product may be a T-shirt,
     * whereas a specific SKU represents the {@code size: large}, {@code color: red} version of that
     * shirt.
     *
     * <p>Can also be used to manage inventory.
     *
     * <p>Related guide: <a href="https://stripe.com/docs/orders">Tax, Shipping, and Inventory</a>.
     */
    @SerializedName("sku")
    Sku sku;

    /** The type of display item. One of {@code custom}, {@code plan} or {@code sku} */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom extends StripeObject {
      /** The description of the line item. */
      @SerializedName("description")
      String description;

      /** The images of the line item. */
      @SerializedName("images")
      List<String> images;

      /** The name of the line item. */
      @SerializedName("name")
      String name;
    }
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
}
