package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntent extends ApiResource implements HasId, MetadataStore<PaymentIntent> {
  /** The list of source types (e.g. card) that this PaymentIntent is allowed to use. */
  List<String> allowedSourceTypes;

  /** Amount intended to be collected by this PaymentIntent. */
  Long amount;

  /** Amount that can be captured from this PaymentIntent. */
  Long amountCapturable;

  /** Amount that was collected by this PaymentIntent. */
  Long amountReceived;

  /** ID of the Connect application that created the PaymentIntent. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The amount of the application fee (if any) for the resulting payment. [See the Connect
   * documentation](/docs/connect/direct-charges#collecting-fees) for details.
   */
  Long applicationFeeAmount;

  /**
   * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was
   * canceled. Measured in seconds since the Unix epoch.
   */
  Long canceledAt;

  /**
   * User-given reason for cancellation of this PaymentIntent, one of `duplicate`, `fraudulent`, or
   * `requested_by_customer`.
   */
  String cancellationReason;

  /** Capture method of this PaymentIntent, one of `automatic` or `manual`. */
  String captureMethod;

  /** Charges that were created by this PaymentIntent, if any. */
  ChargeCollection charges;

  /**
   * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable
   * key. Please refer to [dynamic authentication](/docs/payments/dynamic-authentication) guide on
   * how `client_secret` should be handled.
   */
  String clientSecret;

  /** Confirmation method of this PaymentIntent, one of `secret` or `publishable`. */
  String confirmationMethod;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** ID of the Customer this PaymentIntent is for if one exists. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The payment error encountered in the previous PaymentIntent confirmation. */
  ApiError lastPaymentError;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /**
   * If present, this property tells you what actions you need to take in order for your customer to
   * fulfill a payment using the provided source.
   */
  PaymentIntentNextSourceAction nextSourceAction;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * The account (if any) for which the funds of the PaymentIntent are intended. For details, see
   * [Creating Separate Charges and Transfers](/docs/connect/charges-transfers#on-behalf-of). When
   * transfer_data is specified, on_behalf_of must also be specified and must match the destination
   * of the transfer.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** Email address that the receipt for the resulting payment will be sent to. */
  String receiptEmail;

  /** ID of the review associated with this PaymentIntent, if any. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Review> review;

  /** Shipping information for this PaymentIntent. */
  Shipping shipping;

  /** ID of the source used in this PaymentIntent. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntentSource> source;

  /**
   * Extra information about a PaymentIntent. This will appear on your customer's statement when
   * this PaymentIntent succeeds in creating a charge.
   */
  String statementDescriptor;

  /**
   * Status of this PaymentIntent, one of `requires_source`, `requires_confirmation`,
   * `requires_source_action`, `processing`, `requires_capture`, `canceled`, or `succeeded`.
   */
  String status;

  /** The data with which to automatically create a Transfer when the payment is finalized. */
  PaymentFlowsPaymentIntentResourceTransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. See the [Connect
   * documentation](/docs/connect/charges-transfers#grouping-transactions) for details.
   */
  String transferGroup;

  /** Get id of expandable `application` object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded `application`. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `onBehalfOf` object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded `onBehalfOf`. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `review` object. */
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String id) {
    this.review = ApiResource.setExpandableFieldId(id, this.review);
  }

  /** Get expanded `review`. */
  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review expandableObject) {
    this.review = new ExpandableField<Review>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `source` object. */
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String id) {
    this.source = ApiResource.setExpandableFieldId(id, this.source);
  }

  /** Get expanded `source`. */
  public PaymentIntentSource getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(PaymentIntentSource expandableObject) {
    this.source =
        new ExpandableField<PaymentIntentSource>(expandableObject.getId(), expandableObject);
  }

  /** Creates a PaymentIntent object. */
  public static PaymentIntent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a PaymentIntent object. */
  public static PaymentIntent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_intents");
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /** Returns a list of PaymentIntents. */
  public static PaymentIntentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentIntents. */
  public static PaymentIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_intents");
    return requestCollection(url, params, PaymentIntentCollection.class, options);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(String intent, RequestOptions options)
      throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(
      String intent, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payment_intents/%s", intent));
    return request(ApiResource.RequestMethod.GET, url, params, PaymentIntent.class, options);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statues: <code>
   * requires_source</code>, <code>requires_capture</code>, <code>requires_confirmation</code>, or
   * <code>requires_source_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statues: <code>
   * requires_source</code>, <code>requires_capture</code>, <code>requires_confirmation</code>, or
   * <code>requires_source_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statues: <code>
   * requires_source</code>, <code>requires_capture</code>, <code>requires_confirmation</code>, or
   * <code>requires_source_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/cancel", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent where <code>
   * required_action="requires_capture"</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   */
  public PaymentIntent capture() throws StripeException {
    return capture((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent where <code>
   * required_action="requires_capture"</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   */
  public PaymentIntent capture(Map<String, Object> params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent where <code>
   * required_action="requires_capture"</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   */
  public PaymentIntent capture(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/capture", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /**
   * Confirm that your customer intends to pay with current or provided <code>source</code>. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected <code>source</code> requires additional authentication steps, the
   * PaymentIntent will transition to the <code>requires_source_action</code> status and suggest
   * additional actions via <code>next_source_action</code>. If payment fails, the PaymentIntent
   * will transition to the <code>requires_source</code> status. If payment succeeds, the
   * PaymentIntent will transition to the <code>succeeded</code> status (or <code>requires_capture
   * </code>, if <code>capture_method</code> is set to <code>manual</code>).
   *
   * <p>When using a publishable key, the <a
   * href="#payment_intent_object-client_secret">client_secret</a> must be provided to confirm the
   * PaymentIntent.
   */
  public PaymentIntent confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to pay with current or provided <code>source</code>. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected <code>source</code> requires additional authentication steps, the
   * PaymentIntent will transition to the <code>requires_source_action</code> status and suggest
   * additional actions via <code>next_source_action</code>. If payment fails, the PaymentIntent
   * will transition to the <code>requires_source</code> status. If payment succeeds, the
   * PaymentIntent will transition to the <code>succeeded</code> status (or <code>requires_capture
   * </code>, if <code>capture_method</code> is set to <code>manual</code>).
   *
   * <p>When using a publishable key, the <a
   * href="#payment_intent_object-client_secret">client_secret</a> must be provided to confirm the
   * PaymentIntent.
   */
  public PaymentIntent confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to pay with current or provided <code>source</code>. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected <code>source</code> requires additional authentication steps, the
   * PaymentIntent will transition to the <code>requires_source_action</code> status and suggest
   * additional actions via <code>next_source_action</code>. If payment fails, the PaymentIntent
   * will transition to the <code>requires_source</code> status. If payment succeeds, the
   * PaymentIntent will transition to the <code>succeeded</code> status (or <code>requires_capture
   * </code>, if <code>capture_method</code> is set to <code>manual</code>).
   *
   * <p>When using a publishable key, the <a
   * href="#payment_intent_object-client_secret">client_secret</a> must be provided to confirm the
   * PaymentIntent.
   */
  public PaymentIntent confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/confirm", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /** Updates a PaymentIntent object. */
  public PaymentIntent update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a PaymentIntent object. */
  public PaymentIntent update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/payment_intents/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }
}
