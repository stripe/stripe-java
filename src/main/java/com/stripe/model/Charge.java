package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Collections;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Charge extends APIResource implements MetadataStore<Charge>, HasId {
  public static final String FRAUD_DETAILS = "fraud_details";

  @Getter(onMethod = @__({@Override}))
  String id;
  String object;
  Long amount;
  Long amountRefunded;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Application> application;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<ApplicationFee> applicationFee;
  AlternateStatementDescriptors alternateStatementDescriptors;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  Boolean captured;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  String description;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> destination;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Dispute> dispute;
  String failureCode;
  String failureMessage;
  FraudDetails fraudDetails;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Invoice> invoice;
  ChargeLevel3 level3;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> onBehalfOf;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Order> order;
  ChargeOutcome outcome;
  Boolean paid;
  String receiptEmail;
  String receiptNumber;
  Boolean refunded;
  @Getter(AccessLevel.NONE) ChargeRefundCollection refunds;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Review> review;
  ShippingDetails shipping;
  ExternalAccount source;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> sourceTransfer;
  String statementDescriptor;
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> transfer;
  String transferGroup;

  /**
   * The {@code card} attribute.
   *
   * @return the {@code card} attribute
   * @deprecated Prefer using the {@link #source} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  Card card;

  /**
   * The {@code disputed} attribute.
   *
   * @return the {@code disputed} attribute
   * @deprecated Prefer using the {@link #dispute} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-11-07">API version 2012-11-07</a>
   */
  @Deprecated
  Boolean disputed;

  /**
   * The {@code statement_description} attribute.
   *
   * @return the {@code cards} attribute
   * @deprecated Prefer using the {@link #statementDescriptor} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   */
  @Deprecated
  String statementDescription;

  // <editor-fold desc="application">
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String applicationID) {
    this.application = setExpandableFieldID(applicationID, this.application);
  }

  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application c) {
    this.application = new ExpandableField<Application>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="applicationFee">
  public String getApplicationFee() {
    return (this.applicationFee != null) ? this.applicationFee.getId() : null;
  }

  public void setApplicationFee(String applicationFeeID) {
    this.applicationFee = setExpandableFieldID(applicationFeeID, this.applicationFee);
  }

  public ApplicationFee getApplicationFeeObject() {
    return (this.applicationFee != null) ? this.applicationFee.getExpanded() : null;
  }

  public void setApplicationFeeObject(ApplicationFee c) {
    this.applicationFee = new ExpandableField<ApplicationFee>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerID) {
    this.customer = setExpandableFieldID(customerID, this.customer);

  }

  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer c) {
    this.customer = new ExpandableField<Customer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="destination">
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String destinationID) {
    this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
  }

  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account c) {
    this.destination = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="dispute">
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String dispute) {
    this.dispute = setExpandableFieldID(dispute, this.dispute);
  }

  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute dispute) {
    this.dispute = new ExpandableField<Dispute>(dispute.getId(), dispute);
  }
  // </editor-fold>

  // <editor-fold desc="invoice">
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String invoiceID) {
    this.invoice = setExpandableFieldID(invoiceID, this.invoice);
  }

  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice c) {
    this.invoice = new ExpandableField<Invoice>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="onBehalfOf">
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String onBehalfOfID) {
    this.onBehalfOf = APIResource.setExpandableFieldID(onBehalfOfID, this.onBehalfOf);
  }

  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account c) {
    this.onBehalfOf = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="order">
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String orderID) {
    this.order = setExpandableFieldID(orderID, this.order);
  }

  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order c) {
    this.order = new ExpandableField<Order>(c.getId(), c);
  }
  // </editor-fold>

  /**
   * Returns the {@code refunds} list.
   *
   * @return the {@code refunds} list
   */
  public ChargeRefundCollection getRefunds() {
    // API versions 2014-05-19 and earlier render charge refunds as an array
    // instead of an object, meaning there is no sublist URL.
    if (refunds != null && refunds.getURL() == null) {
      refunds.setURL(String.format("/v1/charges/%s/refunds", getId()));
    }
    return refunds;
  }

  // <editor-fold desc="review">
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String reviewID) {
    this.review = setExpandableFieldID(reviewID, this.review);
  }

  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review r) {
    this.review = new ExpandableField<Review>(r.getId(), r);
  }
  // </editor-fold>

  // <editor-fold desc="sourceTransfer">
  public String getSourceTransfer() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getId() : null;
  }

  public void setSourceTransfer(String sourceTransferID) {
    this.sourceTransfer = setExpandableFieldID(sourceTransferID, this.sourceTransfer);
  }

  public Transfer getSourceTransferObject() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getExpanded() : null;
  }

  public void setSourceTransferObject(Transfer c) {
    this.sourceTransfer = new ExpandableField<Transfer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="transfer">
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String transferID) {
    this.transfer = setExpandableFieldID(transferID, this.transfer);
  }

  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer c) {
    this.transfer = new ExpandableField<Transfer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="capture">
  /**
   * Capture a charge.
   */
  public Charge capture() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.capture(null, (RequestOptions) null);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.capture(null, options);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.capture(params, (RequestOptions) null);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/capture",
        instanceURL(Charge.class, this.getId())), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a charge.
   */
  public static Charge create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a charge.
   */
  public static Charge create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Charge.class), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all charges.
   */
  public static ChargeCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all charges.
   */
  public static ChargeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Charge.class), params, ChargeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="markFraudulent">
  /**
   * Mark the charge as fraudulent.
   */
  public Charge markFraudulent(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "fraudulent"));
    return this.update(params, options);
  }
  // </editor-fold>

  // <editor-fold desc="markSafe">
  /**
   * Mark the charge as safe.
   */
  public Charge markSafe(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "safe"));
    return this.update(params, options);
  }
  // </editor-fold>

  // <editor-fold desc="refund">
  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} method instead.
   */
  @Deprecated
  public Charge refund() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(null, (RequestOptions) null);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public Charge refund(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(null, options);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} method instead.
   */
  @Deprecated
  public Charge refund(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.refund(params, (RequestOptions) null);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public Charge refund(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/refund",
        instanceURL(Charge.class, this.getId())), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Charge.class, id), null, Charge.class, options);
  }

  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Charge.class, id), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a charge.
   */
  @Override
  public Charge update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a charge.
   */
  @Override
  public Charge update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Charge.class, id), params, Charge.class,
        options);
  }
  // </editor-fold>
}
