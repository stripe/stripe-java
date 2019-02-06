package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntent extends ApiResource implements MetadataStore<PaymentIntent>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long amountCapturable;
  Long amountReceived;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Application> application;
  Long applicationFeeAmount;
  Long canceledAt;
  String cancellationReason;
  String captureMethod;
  ChargeCollection charges;
  String clientSecret;
  String confirmationMethod;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  PaymentIntentLastPaymentError lastPaymentError;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  NextAction nextAction;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> onBehalfOf;
  List<String> paymentMethodTypes;
  String receiptEmail;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Review> review;
  ShippingDetails shipping;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<ExternalAccount> source;
  String statementDescriptor;
  TransferData transferData;
  String status;

  /**
   * The {@code allowedSourceTypes} attribute.
   *
   * @return the {@code allowedSourceTypes} attribute
   * @deprecated Prefer using the {@link #paymentMethodTypes} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-11">API version 2019-02-11</a>
   */
  @Deprecated
  List<String> allowedSourceTypes;

  /**
   * The {@code nextSourceAction} attribute.
   *
   * @return the {@code nextSourceAction} attribute
   * @deprecated Prefer using the {@link #nextAction} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-11">API version 2019-02-11</a>
   */
  @Deprecated
  PaymentIntentSourceAction nextSourceAction;

  /**
   * The {@code returnUrl} attribute.
   *
   * @deprecated This property is not supported anymore and is only present for legacy reasons.
   */
  @Deprecated
  String returnUrl;

  // <editor-fold desc="application">
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String applicationId) {
    this.application = setExpandableFieldId(applicationId, this.application);
  }

  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application c) {
    this.application = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerId) {
    this.customer = setExpandableFieldId(customerId, this.customer);

  }

  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer c) {
    this.customer = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="onBehalfOf">
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String onBehalfOfId) {
    this.onBehalfOf = setExpandableFieldId(onBehalfOfId, this.onBehalfOf);
  }

  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account c) {
    this.onBehalfOf = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="review">
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String reviewId) {
    this.review = setExpandableFieldId(reviewId, this.review);
  }

  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review c) {
    this.review = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="source">
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String sourceId) {
    this.source = setExpandableFieldId(sourceId, this.source);
  }

  public ExternalAccount getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(ExternalAccount c) {
    this.source = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="cancel">
  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel() throws StripeException {
    return cancel(null, null);
  }

  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, null);
  }

  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(PaymentIntent.class, this.id) + "/cancel",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="capture">
  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture() throws StripeException {
    return capture(null, null);
  }

  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture(Map<String, Object> params) throws StripeException {
    return capture(params, null);
  }

  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(PaymentIntent.class, this.id) + "/capture",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="confirm">
  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm() throws StripeException {
    return confirm(null, null);
  }

  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, null);
  }

  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(PaymentIntent.class, this.id) + "/confirm",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a payment intent.
   */
  public static PaymentIntent create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a payment intent.
   */
  public static PaymentIntent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(PaymentIntent.class), params,
      PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all payment intents.
   */
  public static PaymentIntentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all payment intents.
   */
  public static PaymentIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(PaymentIntent.class), params,
      PaymentIntentCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(PaymentIntent.class, id), params,
      PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a payment intent.
   */
  @Override
  public PaymentIntent update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a payment intent.
   */
  @Override
  public PaymentIntent update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(PaymentIntent.class, this.id), params,
      PaymentIntent.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> destination;

    /**
     * The {@code amount} attribute.
     *
     * @deprecated This property is now deprecated and is only present for legacy reasons.
     */
    @Deprecated
    Long amount;

    // <editor-fold desc="destination">
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String destinationId) {
      this.destination = setExpandableFieldId(destinationId, this.destination);

    }

    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account c) {
      this.destination = new ExpandableField<>(c.getId(), c);
    }
    // </editor-fold>
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    NextActionRedirectToUrl redirectToUrl;
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextActionRedirectToUrl extends StripeObject {
    String returnUrl;
    String url;
  }
}
