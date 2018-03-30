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

public class Charge extends APIResource implements MetadataStore<Charge>, HasId {
  public static final String FRAUD_DETAILS = "fraud_details";

  String id;
  String object;
  Long amount;
  Long amountRefunded;
  ExpandableField<Application> application;
  ExpandableField<ApplicationFee> applicationFee;
  AlternateStatementDescriptors alternateStatementDescriptors;
  ExpandableField<BalanceTransaction> balanceTransaction;
  Boolean captured;
  Long created;
  String currency;
  ExpandableField<Customer> customer;
  String description;
  ExpandableField<Account> destination;
  ExpandableField<Dispute> dispute;
  String failureCode;
  String failureMessage;
  FraudDetails fraudDetails;
  ExpandableField<Invoice> invoice;
  Boolean livemode;
  Map<String, String> metadata;
  ChargeOutcome outcome;
  ExpandableField<Order> order;
  Boolean paid;
  String receiptEmail;
  String receiptNumber;
  Boolean refunded;
  ChargeRefundCollection refunds;
  ExpandableField<Review> review;
  ShippingDetails shipping;
  ExternalAccount source;
  ExpandableField<Transfer> sourceTransfer;
  String statementDescriptor;
  String status;
  ExpandableField<Transfer> transfer;
  String transferGroup;

  @Deprecated
  Card card;
  @Deprecated
  Boolean disputed;
  @Deprecated
  String statementDescription;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public AlternateStatementDescriptors getAlternateStatementDescriptors() {
    return alternateStatementDescriptors;
  }

  public void setAlternateStatementDescriptors(
      AlternateStatementDescriptors alternateStatementDescriptors) {
    this.alternateStatementDescriptors = alternateStatementDescriptors;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getAmountRefunded() {
    return amountRefunded;
  }

  public void setAmountRefunded(Long amountRefunded) {
    this.amountRefunded = amountRefunded;
  }

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

  public Boolean getCaptured() {
    return captured;
  }

  public void setCaptured(Boolean captured) {
    this.captured = captured;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

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

  public String getFailureCode() {
    return failureCode;
  }

  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }

  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  public FraudDetails getFraudDetails() {
    return fraudDetails;
  }

  public void setFraudDetails(FraudDetails fraudDetails) {
    this.fraudDetails = fraudDetails;
  }

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

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

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

  public ChargeOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(ChargeOutcome outcome) {
    this.outcome = outcome;
  }

  public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public String getReceiptEmail() {
    return receiptEmail;
  }

  public void setReceiptEmail(String receiptEmail) {
    this.receiptEmail = receiptEmail;
  }

  public String getReceiptNumber() {
    return receiptNumber;
  }

  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

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

  public ShippingDetails getShipping() {
    return shipping;
  }

  public void setShipping(ShippingDetails shipping) {
    this.shipping = shipping;
  }

  public ExternalAccount getSource() {
    return source;
  }

  public void setSource(ExternalAccount source) {
    this.source = source;
  }

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

  public String getStatementDescriptor() {
    return statementDescriptor;
  }

  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String transferID) {
    this.transfer = setExpandableFieldID(transferID, this.transfer);
  }

  public String getTransferGroup() {
    return this.transferGroup;
  }

  public void setTransferGroup(String transferGroup) {
    this.transferGroup = transferGroup;
  }

  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer c) {
    this.transfer = new ExpandableField<Transfer>(c.getId(), c);
  }

  /**
   * Returns the {@code card} attribute.
   *
   * @return the {@code card} attribute
   * @deprecated Prefer using the {@code source} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  public Card getCard() {
    return card;
  }

  @Deprecated
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * Returns the {@code disputed} attribute.
   *
   * @return the {@code disputed} attribute
   * @deprecated Prefer using the {@code dispute} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-11-07">API version 2012-11-07</a>
   */
  @Deprecated
  public Boolean getDisputed() {
    return disputed;
  }

  @Deprecated
  public void setDisputed(Boolean disputed) {
    this.disputed = disputed;
  }

  /**
   * Returns the {@code statement_description} attribute.
   *
   * @return the {@code statement_description} attribute
   * @deprecated Prefer using the {@code statement_descriptor} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   */
  @Deprecated
  public String getStatementDescription() {
    return statementDescription;
  }

  @Deprecated
  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }

  public static Charge create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Charge create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Charge create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Charge.class), params, Charge.class, options);
  }

  public static Charge retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Charge retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Charge retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Charge.class, id), null, Charge.class, options);
  }

  public static Charge retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Charge.class, id), params, Charge.class, options);
  }

  public Charge update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Charge update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Charge update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Charge.class, id), params, Charge.class,
        options);
  }

  public Charge refund() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(null, (RequestOptions) null);
  }

  public Charge refund(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.refund(params, (RequestOptions) null);
  }

  @Deprecated
  public Charge refund(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(RequestOptions.builder().setApiKey(apiKey).build()); // full refund
  }

  public Charge refund(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(null, options); // full refund
  }

  @Deprecated
  public Charge refund(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return refund(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Charge refund(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/refund",
        instanceURL(Charge.class, this.getId())), params, Charge.class, options);
  }

  public Charge capture() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.capture(null, (RequestOptions) null);
  }

  public Charge capture(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.capture(params, (RequestOptions) null);
  }

  @Deprecated
  public Charge capture(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return capture(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Charge capture(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.capture(null, options);
  }

  @Deprecated
  public Charge capture(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return capture(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Charge capture(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/capture",
        instanceURL(Charge.class, this.getId())), params, Charge.class, options);
  }

  @Deprecated
  public Dispute updateDispute(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.updateDispute(params, (RequestOptions) null);
  }

  @Deprecated
  public Dispute updateDispute(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return updateDispute(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Updates the charge's dispute.
   *
   * @deprecated Prefer using the {@link Dispute#update} method instead.
   */
  @Deprecated
  public Dispute updateDispute(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST,
        String.format("%s/dispute", instanceURL(Charge.class, this.id)), params, Dispute.class,
        options);
  }

  @Deprecated
  public Dispute closeDispute() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.closeDispute((RequestOptions) null);
  }

  @Deprecated
  public Dispute closeDispute(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return closeDispute(RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Closes the charge's dispute.
   *
   * @deprecated Prefer using the {@link Dispute#close} method instead.
   */
  @Deprecated
  public Dispute closeDispute(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST,
        String.format("%s/dispute/close", instanceURL(Charge.class, this.getId())), null,
        Dispute.class, options);
  }

  public static ChargeCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static ChargeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Charge.class), params, ChargeCollection.class, options);
  }

  @Deprecated
  public static ChargeCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static ChargeCollection all(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static ChargeCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }

  /**
   * Convenience method to mark a given charge as fraudulent.
   */
  public Charge markFraudulent(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "fraudulent"));
    return this.update(params, options);
  }

  /**
   * Convenience method to mark a given charge as not fraudulent.
   */
  public Charge markSafe(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "safe"));
    return this.update(params, options);
  }
}
