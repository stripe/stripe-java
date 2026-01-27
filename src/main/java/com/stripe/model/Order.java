// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.OrderCancelParams;
import com.stripe.param.OrderCreateParams;
import com.stripe.param.OrderListLineItemsParams;
import com.stripe.param.OrderListParams;
import com.stripe.param.OrderReopenParams;
import com.stripe.param.OrderRetrieveParams;
import com.stripe.param.OrderSubmitParams;
import com.stripe.param.OrderUpdateParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Order describes a purchase being made by a customer, including the products &amp; quantities
 * being purchased, the order status, the payment information, and the billing/shipping details.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/orders">Orders overview</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Order extends ApiResource implements HasId, MetadataStore<Order> {
  /**
   * Order cost before any discounts or taxes are applied. A positive integer representing the
   * subtotal of the order in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
   * currency unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal
   * currency).
   */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /**
   * Total order cost after discounts and taxes are applied. A positive integer representing the
   * cost of the order in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
   * currency unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal
   * currency). To submit an order, the total must be either 0 or at least $0.50 USD or <a
   * href="https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts">equivalent in
   * charge currency</a>.
   */
  @SerializedName("amount_total")
  Long amountTotal;

  /** ID of the Connect application that created the Order, if any. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Customer billing details associated with the order. */
  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /**
   * The client secret of this Order. Used for client-side retrieval using a publishable key.
   *
   * <p>The client secret can be used to complete a payment for an Order from your frontend. It
   * should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
   * Make sure that you have TLS enabled on any page that includes the client secret.
   *
   * <p>Refer to our docs for <a
   * href="https://docs.stripe.com/orders-beta/create-and-process">creating and processing an
   * order</a> to learn about how client_secret should be handled.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The customer which this orders belongs to. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The discounts applied to the order. Use {@code expand[]=discounts} to expand each discount. */
  @SerializedName("discounts")
  List<ExpandableField<com.stripe.model.Discount>> discounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** A recent IP address of the purchaser used for tax reporting and tax location inference. */
  @SerializedName("ip_address")
  String ipAddress;

  /**
   * A list of line items the customer is ordering. Each line item includes information about the
   * product, the quantity, and the resulting cost. There is a maximum of 100 line items.
   */
  @SerializedName("line_items")
  LineItemCollection lineItems;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code order}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payment")
  Payment payment;

  /** The details of the customer cost of shipping, including the customer chosen ShippingRate. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /** Customer shipping information associated with the order. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  /**
   * The overall status of the order.
   *
   * <p>One of {@code canceled}, {@code complete}, {@code open}, {@code processing}, or {@code
   * submitted}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("tax_details")
  TaxDetails taxDetails;

  @SerializedName("total_details")
  TotalDetails totalDetails;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

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

  /** Get IDs of expandable {@code discounts} object list. */
  public List<String> getDiscounts() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDiscounts(List<String> ids) {
    if (ids == null) {
      this.discounts = null;
      return;
    }
    if (this.discounts != null
        && this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.discounts =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<com.stripe.model.Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<com.stripe.model.Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<com.stripe.model.Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<com.stripe.model.Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(OrderCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(OrderCancelParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  /** Creates a new {@code open} order object. */
  public static Order create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code open} order object. */
  public static Order create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/orders";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /** Creates a new {@code open} order object. */
  public static Order create(OrderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code open} order object. */
  public static Order create(OrderCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/orders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/orders";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OrderCollection.class);
  }

  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(OrderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(OrderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/orders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OrderCollection.class);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(OrderListLineItemsParams params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(OrderListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s/line_items", ApiResource.urlEncodeId(this.getId()));
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

  /** Reopens a {@code submitted} order. */
  public Order reopen() throws StripeException {
    return reopen((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Reopens a {@code submitted} order. */
  public Order reopen(RequestOptions options) throws StripeException {
    return reopen((Map<String, Object>) null, options);
  }

  /** Reopens a {@code submitted} order. */
  public Order reopen(Map<String, Object> params) throws StripeException {
    return reopen(params, (RequestOptions) null);
  }

  /** Reopens a {@code submitted} order. */
  public Order reopen(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/reopen", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /** Reopens a {@code submitted} order. */
  public Order reopen(OrderReopenParams params) throws StripeException {
    return reopen(params, (RequestOptions) null);
  }

  /** Reopens a {@code submitted} order. */
  public Order reopen(OrderReopenParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/reopen", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public static Order retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public static Order retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public static Order retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public static Order retrieve(String id, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(Map<String, Object> params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/submit", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(OrderSubmitParams params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(OrderSubmitParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/submit", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Order update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Order update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(OrderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(OrderUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * For more details about AutomaticTax, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Whether Stripe automatically computes tax on this Order. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The status of the most recent automated tax calculation for this Order.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;
  }

  /**
   * For more details about BillingDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingDetails extends StripeObject {
    /** Billing address for the order. */
    @SerializedName("address")
    Address address;

    /** Email address for the order. */
    @SerializedName("email")
    String email;

    /** Full name for the order. */
    @SerializedName("name")
    String name;

    /** Billing phone number for the order (including extension). */
    @SerializedName("phone")
    String phone;
  }

  /**
   * For more details about Payment, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payment extends StripeObject {
    /** ID of the payment intent associated with this order. Null when the order is {@code open}. */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /** Settings describing how the order should configure generated PaymentIntents. */
    @SerializedName("settings")
    Settings settings;

    /**
     * The status of the underlying payment associated with this order, if any. Null when the order
     * is {@code open}.
     *
     * <p>One of {@code canceled}, {@code complete}, {@code not_required}, {@code processing},
     * {@code requires_action}, {@code requires_capture}, {@code requires_confirmation}, or {@code
     * requires_payment_method}.
     */
    @SerializedName("status")
    String status;

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

    /**
     * For more details about Settings, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Settings extends StripeObject {
      /**
       * The amount of the application fee (if any) that will be requested to be applied to the
       * payment and transferred to the application owner's Stripe account.
       */
      @SerializedName("application_fee_amount")
      Long applicationFeeAmount;

      /**
       * Indicates whether order has been opted into using <a
       * href="https://dashboard.stripe.com/settings/payment_methods">Stripe Dashboard</a> to manage
       * payment method types.
       */
      @SerializedName("automatic_payment_methods")
      AutomaticPaymentMethods automaticPaymentMethods;

      /** PaymentMethod-specific configuration to provide to the order's PaymentIntent. */
      @SerializedName("payment_method_options")
      PaymentMethodOptions paymentMethodOptions;

      /**
       * The list of <a href="https://docs.stripe.com/payments/payment-methods/overview">payment
       * method types</a> to provide to the order's PaymentIntent. Do not include this attribute if
       * you prefer to manage your payment methods from the <a
       * href="https://dashboard.stripe.com/settings/payment_methods">Stripe Dashboard</a>.
       */
      @SerializedName("payment_method_types")
      List<String> paymentMethodTypes;

      /** The URL to redirect the customer to after they authenticate their payment. */
      @SerializedName("return_url")
      String returnUrl;

      /**
       * For non-card charges, you can use this value as the complete description that appears on
       * your customers' statements. Must contain at least one letter, maximum 22 characters.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on
       * the account to form the complete statement descriptor. Maximum 22 characters for the
       * concatenated descriptor.
       */
      @SerializedName("statement_descriptor_suffix")
      String statementDescriptorSuffix;

      /** Provides configuration for completing a transfer for the order after it is paid. */
      @SerializedName("transfer_data")
      TransferData transferData;

      /**
       * For more details about AutomaticPaymentMethods, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AutomaticPaymentMethods extends StripeObject {
        /**
         * Whether this Order has been opted into managing payment method types via the <a
         * href="https://dashboard.stripe.com/settings/payment_methods">Stripe Dashboard</a>.
         */
        @SerializedName("enabled")
        Boolean enabled;
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

        @SerializedName("afterpay_clearpay")
        AfterpayClearpay afterpayClearpay;

        @SerializedName("alipay")
        Alipay alipay;

        @SerializedName("bancontact")
        Bancontact bancontact;

        @SerializedName("card")
        Card card;

        @SerializedName("customer_balance")
        CustomerBalance customerBalance;

        @SerializedName("ideal")
        Ideal ideal;

        @SerializedName("klarna")
        Klarna klarna;

        @SerializedName("link")
        Link link;

        @SerializedName("oxxo")
        Oxxo oxxo;

        @SerializedName("p24")
        P24 p24;

        @SerializedName("paypal")
        Paypal paypal;

        @SerializedName("sepa_debit")
        SepaDebit sepaDebit;

        @SerializedName("sofort")
        Sofort sofort;

        @SerializedName("wechat_pay")
        WechatPay wechatPay;

        /**
         * For more details about AcssDebit, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebit extends StripeObject {
          @SerializedName("mandate_options")
          MandateOptions mandateOptions;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;

          /**
           * Controls when Stripe will attempt to debit the funds from the customer's account. The
           * date must be a string in YYYY-MM-DD format. The date must be in the future and between
           * 3 and 15 calendar days from now.
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
         * For more details about AfterpayClearpay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AfterpayClearpay extends StripeObject {
          /**
           * Controls when the funds will be captured from the customer's account.
           *
           * <p>One of {@code automatic}, {@code automatic_async}, or {@code manual}.
           */
          @SerializedName("capture_method")
          String captureMethod;

          /**
           * Order identifier shown to the user in Afterpay's online portal. We recommend using a
           * value that helps you answer any questions a customer might have about the payment. The
           * identifier is limited to 128 characters and may contain only letters, digits,
           * underscores, backslashes and dashes.
           */
          @SerializedName("reference")
          String reference;

          /**
           * Indicates that you intend to make future payments with the payment method.
           *
           * <p>Providing this parameter will <a
           * href="https://docs.stripe.com/payments/save-during-payment">attach the payment
           * method</a> to the order's Customer, if present, after the order's PaymentIntent is
           * confirmed and any required actions from the user are complete. If no Customer was
           * provided, the payment method can still be <a
           * href="https://docs.stripe.com/api/payment_methods/attach">attached</a> to a Customer
           * after the transaction completes.
           *
           * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
           * dynamically optimize your payment flow and comply with regional legislation and network
           * rules, such as <a
           * href="https://docs.stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If {@code setup_future_usage} is already set and you are performing a request using
           * a publishable key, you may only update the value from {@code on_session} to {@code
           * off_session}.
           *
           * <p>Equal to {@code none}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Alipay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Alipay extends StripeObject {
          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
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
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
           *
           * <p>One of {@code de}, {@code en}, {@code fr}, or {@code nl}.
           */
          @SerializedName("preferred_language")
          String preferredLanguage;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Card, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Card extends StripeObject {
          /**
           * Controls when the funds will be captured from the customer's account.
           *
           * <p>One of {@code automatic}, {@code automatic_async}, or {@code manual}.
           */
          @SerializedName("capture_method")
          String captureMethod;

          /**
           * Indicates that you intend to make future payments with the payment method.
           *
           * <p>Providing this parameter will <a
           * href="https://docs.stripe.com/payments/save-during-payment">attach the payment
           * method</a> to the order's Customer, if present, after the order's PaymentIntent is
           * confirmed and any required actions from the user are complete. If no Customer was
           * provided, the payment method can still be <a
           * href="https://docs.stripe.com/api/payment_methods/attach">attached</a> to a Customer
           * after the transaction completes.
           *
           * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
           * dynamically optimize your payment flow and comply with regional legislation and network
           * rules, such as <a
           * href="https://docs.stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If {@code setup_future_usage} is already set and you are performing a request using
           * a publishable key, you may only update the value from {@code on_session} to {@code
           * off_session}.
           *
           * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
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
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Permitted values include: {@code bank_transfer}.
           *
           * <p>Equal to {@code bank_transfer}.
           */
          @SerializedName("funding_type")
          String fundingType;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
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
             * List of address types that should be returned in the financial_addresses response. If
             * not specified, all valid types will be returned.
             *
             * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or
             * {@code spei}.
             */
            @SerializedName("requested_address_types")
            List<String> requestedAddressTypes;

            /**
             * The bank transfer type that this PaymentIntent is allowed to use for funding
             * Permitted values include: {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code
             * jp_bank_transfer}, {@code mx_bank_transfer}, or {@code us_bank_transfer}.
             *
             * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code
             * jp_bank_transfer}, {@code mx_bank_transfer}, or {@code us_bank_transfer}.
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
               * <p>One of {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code
               * NL}.
               */
              @SerializedName("country")
              String country;
            }
          }
        }

        /**
         * For more details about Ideal, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Ideal extends StripeObject {
          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Klarna, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Klarna extends StripeObject {
          /**
           * Controls when the funds will be captured from the customer's account.
           *
           * <p>Equal to {@code manual}.
           */
          @SerializedName("capture_method")
          String captureMethod;

          /** Preferred locale of the Klarna checkout page that the customer is redirected to. */
          @SerializedName("preferred_locale")
          String preferredLocale;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Link, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Link extends StripeObject {
          /**
           * Controls when the funds will be captured from the customer's account.
           *
           * <p>Equal to {@code manual}.
           */
          @SerializedName("capture_method")
          String captureMethod;

          /** [Deprecated] This is a legacy parameter that no longer has any function. */
          @SerializedName("persistent_token")
          @Deprecated
          String persistentToken;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Oxxo, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Oxxo extends StripeObject {
          /**
           * The number of calendar days before an OXXO invoice expires. For example, if you create
           * an OXXO invoice on Monday and you set expires_after_days to 2, the OXXO invoice will
           * expire on Wednesday at 23:59 America/Mexico_City time.
           */
          @SerializedName("expires_after_days")
          Long expiresAfterDays;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
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
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>Equal to {@code none}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about Paypal, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
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

          /** The line items purchased by the customer. */
          @SerializedName("line_items")
          List<Order.Payment.Settings.PaymentMethodOptions.Paypal.LineItem> lineItems;

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
           * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
           * invoice ID. This must be a globally unique ID if you have configured in your PayPal
           * settings to block multiple payments per invoice ID.
           */
          @SerializedName("reference_id")
          String referenceId;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;

          /**
           * The Stripe connected account IDs of the sellers on the platform for this transaction
           * (optional). Only allowed when <a
           * href="https://stripe.com/docs/connect/separate-charges-and-transfers">separate charges
           * and transfers</a> are used.
           */
          @SerializedName("subsellers")
          List<String> subsellers;

          /**
           * For more details about LineItem, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class LineItem extends StripeObject {
            /**
             * Type of the line item.
             *
             * <p>One of {@code digital_goods}, {@code donation}, or {@code physical_goods}.
             */
            @SerializedName("category")
            String category;

            /** Description of the line item. */
            @SerializedName("description")
            String description;

            /** Descriptive name of the line item. */
            @SerializedName("name")
            String name;

            /** Quantity of the line item. Cannot be a negative number. */
            @SerializedName("quantity")
            Long quantity;

            /** Client facing stock keeping unit, article number or similar. */
            @SerializedName("sku")
            String sku;

            /**
             * The Stripe account ID of the connected account that sells the item. This is only
             * needed when using <a
             * href="https://docs.stripe.com/connect/separate-charges-and-transfers">Separate
             * Charges and Transfers</a>.
             */
            @SerializedName("sold_by")
            String soldBy;

            @SerializedName("tax")
            Tax tax;

            /**
             * Price for a single unit of the line item in minor units. Cannot be a negative number.
             */
            @SerializedName("unit_amount")
            Long unitAmount;

            /**
             * For more details about Tax, please refer to the <a
             * href="https://docs.stripe.com/api">API Reference.</a>
             */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class Tax extends StripeObject {
              /**
               * The tax for a single unit of the line item in minor units. Cannot be a negative
               * number.
               */
              @SerializedName("amount")
              Long amount;

              /**
               * The tax behavior for the line item.
               *
               * <p>One of {@code exclusive}, or {@code inclusive}.
               */
              @SerializedName("behavior")
              String behavior;
            }
          }
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
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;

          /**
           * Controls when Stripe will attempt to debit the funds from the customer's account. The
           * date must be a string in YYYY-MM-DD format. The date must be in the future and between
           * 3 and 15 calendar days from now.
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
             * Prefix used to generate the Mandate reference. Must be at most 12 characters long.
             * Must consist of only uppercase letters, numbers, spaces, or the following special
             * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
             */
            @SerializedName("reference_prefix")
            String referencePrefix;
          }
        }

        /**
         * For more details about Sofort, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Sofort extends StripeObject {
          /**
           * Preferred language of the SOFORT authorization page that the customer is redirected to.
           *
           * <p>One of {@code de}, {@code en}, {@code es}, {@code fr}, {@code it}, {@code nl}, or
           * {@code pl}.
           */
          @SerializedName("preferred_language")
          String preferredLanguage;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>One of {@code none}, or {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }

        /**
         * For more details about WechatPay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class WechatPay extends StripeObject {
          /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
          @SerializedName("app_id")
          String appId;

          /**
           * The client type that the end customer will pay from
           *
           * <p>One of {@code android}, {@code ios}, or {@code web}.
           */
          @SerializedName("client")
          String client;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>Equal to {@code none}.
           */
          @SerializedName("setup_future_usage")
          String setupFutureUsage;
        }
      }

      /**
       * For more details about TransferData, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TransferData extends StripeObject {
        /**
         * The amount that will be transferred automatically when the order is paid. If no amount is
         * set, the full amount is transferred. There cannot be any line items with recurring prices
         * when using this field.
         */
        @SerializedName("amount")
        Long amount;

        /** ID of the Connected account receiving the transfer. */
        @SerializedName("destination")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Account> destination;

        /** Get ID of expandable {@code destination} object. */
        public String getDestination() {
          return (this.destination != null) ? this.destination.getId() : null;
        }

        public void setDestination(String id) {
          this.destination = ApiResource.setExpandableFieldId(id, this.destination);
        }

        /** Get expanded {@code destination}. */
        public Account getDestinationObject() {
          return (this.destination != null) ? this.destination.getExpanded() : null;
        }

        public void setDestinationObject(Account expandableObject) {
          this.destination =
              new ExpandableField<Account>(expandableObject.getId(), expandableObject);
        }
      }
    }
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
    List<Order.ShippingCost.Tax> taxes;

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
   * For more details about ShippingDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingDetails extends StripeObject {
    /** Recipient shipping address. Required if the order includes products that are shippable. */
    @SerializedName("address")
    Address address;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    String phone;
  }

  /**
   * For more details about TaxDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxDetails extends StripeObject {
    /**
     * Describes the purchaser's tax exemption status. One of {@code none}, {@code exempt}, or
     * {@code reverse}.
     */
    @SerializedName("tax_exempt")
    String taxExempt;

    /** The purchaser's tax IDs to be used in calculation of tax for this Order. */
    @SerializedName("tax_ids")
    List<Order.TaxDetails.TaxId> taxIds;

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
       * pl_nip}, {@code tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn},
       * {@code li_uid}, {@code li_vat}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code
       * ca_qst}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk},
       * {@code my_sst}, {@code sg_gst}, {@code ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code
       * id_npwp}, {@code my_frp}, {@code il_vat}, {@code ge_vat}, {@code ua_vat}, {@code is_vat},
       * {@code bg_uic}, {@code hu_tin}, {@code si_tin}, {@code ke_pin}, {@code tr_tin}, {@code
       * eg_tin}, {@code ph_tin}, {@code al_tin}, {@code bh_vat}, {@code kz_bin}, {@code ng_tin},
       * {@code om_vat}, {@code de_stn}, {@code ch_uid}, {@code tz_vat}, {@code uz_vat}, {@code
       * uz_tin}, {@code md_vat}, {@code ma_vat}, {@code by_tin}, {@code ao_tin}, {@code bs_tin},
       * {@code bb_tin}, {@code cd_nif}, {@code mr_nif}, {@code me_pib}, {@code zw_tin}, {@code
       * ba_tin}, {@code gn_nif}, {@code mk_vat}, {@code sr_fin}, {@code sn_ninea}, {@code am_tin},
       * {@code np_pan}, {@code tj_tin}, {@code ug_tin}, {@code zm_tin}, {@code kh_tin}, {@code
       * aw_tin}, {@code az_tin}, {@code bd_bin}, {@code bj_ifu}, {@code et_tin}, {@code kg_tin},
       * {@code la_tin}, {@code cm_niu}, {@code cv_nif}, {@code bf_ifu}, or {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
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
      List<Order.TotalDetails.Breakdown.Discount> discounts;

      /** The aggregated tax amounts by rate. */
      @SerializedName("taxes")
      List<Order.TotalDetails.Breakdown.Tax> taxes;

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
         * href="https://api.stripe.com#coupons">coupon</a> or <a
         * href="https://api.stripe.com#promotion_codes">promotion code</a>. It contains information
         * about when the discount began, when it will end, and what it is applied to.
         *
         * <p>Related guide: <a
         * href="https://docs.stripe.com/billing/subscriptions/discounts">Applying discounts to
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(billingDetails, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(payment, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
    trySetResponseGetter(taxDetails, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
  }
}
