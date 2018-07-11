package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
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
public class PaymentIntent extends APIResource implements MetadataStore<PaymentIntent>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  List<String> allowedSourceTypes;
  Long amount;
  Long amountCapturable;
  Long amountReceived;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Application> application;
  Long applicationFeeAmount;
  Long canceledAt;
  String captureMethod;
  ChargeCollection charges;
  String clientSecret;
  String confirmationMethod;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  PaymentIntentSourceAction nextSourceAction;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> onBehalfOf;
  String receiptEmail;
  String returnUrl;
  ShippingDetails shipping;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<ExternalAccount> source;
  String statementDescriptor;
  PaymentIntentTransferData transferData;
  String status;

  // <editor-fold desc="application">
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String applicationId) {
    this.application = setExpandableFieldID(applicationId, this.application);
  }

  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application c) {
    this.application = new ExpandableField<Application>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerId) {
    this.customer = setExpandableFieldID(customerId, this.customer);

  }

  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer c) {
    this.customer = new ExpandableField<Customer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="onBehalfOf">
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String onBehalfOfId) {
    this.onBehalfOf = APIResource.setExpandableFieldID(onBehalfOfId, this.onBehalfOf);
  }

  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account c) {
    this.onBehalfOf = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="source">
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String sourceId) {
    this.source = APIResource.setExpandableFieldID(sourceId, this.source);
  }

  public ExternalAccount getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(ExternalAccount c) {
    this.source = new ExpandableField<ExternalAccount>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="cancel">
  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel(null, null);
  }

  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel(params, null);
  }

  /**
   * Cancel a payment intent.
   */
  public PaymentIntent cancel(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(PaymentIntent.class, this.id) + "/cancel",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="capture">
  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return capture(null, null);
  }

  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return capture(params, null);
  }

  /**
   * Capture a payment intent.
   */
  public PaymentIntent capture(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(PaymentIntent.class, this.id) + "/capture",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="confirm">
  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return confirm(null, null);
  }

  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return confirm(params, null);
  }

  /**
   * Confirm a payment intent.
   */
  public PaymentIntent confirm(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(PaymentIntent.class, this.id) + "/confirm",
      params, PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a payment intent.
   */
  public static PaymentIntent create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a payment intent.
   */
  public static PaymentIntent create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(PaymentIntent.class), params,
      PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all payment intents.
   */
  public static PaymentIntentCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all payment intents.
   */
  public static PaymentIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(PaymentIntent.class), params,
      PaymentIntentCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(PaymentIntent.class, id), null,
      PaymentIntent.class, options);
  }

  /**
   * Retrieve a payment intent.
   */
  public static PaymentIntent retrieve(String id, Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(PaymentIntent.class, id), params,
      PaymentIntent.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a payment intent.
   */
  @Override
  public PaymentIntent update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a payment intent.
   */
  @Override
  public PaymentIntent update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(PaymentIntent.class, this.id), params,
      PaymentIntent.class,
        options);
  }
  // </editor-fold>
}
