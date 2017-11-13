package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Map;

public class Charge extends APIResource implements MetadataStore<Charge>, HasId {
	public static final String FRAUD_DETAILS = "fraud_details";

	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long amountRefunded;
	ExpandableField<Application> application;
	ExpandableField<ApplicationFee> applicationFee;
	@Getter @Setter
	AlternateStatementDescriptors alternateStatementDescriptors;
	ExpandableField<BalanceTransaction> balanceTransaction;
	@Getter @Setter
	Boolean captured;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	ExpandableField<Customer> customer;
	@Getter @Setter
	String description;
	ExpandableField<Account> destination;
	ExpandableField<Dispute> dispute;
	@Getter @Setter
	String failureCode;
	@Getter @Setter
	String failureMessage;
	@Getter @Setter
	FraudDetails fraudDetails;
	ExpandableField<Invoice> invoice;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	ChargeOutcome outcome;
	ExpandableField<Order> order;
	@Getter @Setter
	Boolean paid;
	@Getter @Setter
	String receiptEmail;
	@Getter @Setter
	String receiptNumber;
	@Getter @Setter
	Boolean refunded;
	ChargeRefundCollection refunds;
	ExpandableField<Review> review;
	@Getter @Setter
	ShippingDetails shipping;
	@Getter @Setter
	ExternalAccount source;
	ExpandableField<Transfer> sourceTransfer;
	@Getter @Setter
	String statementDescriptor;
	@Getter @Setter
	String status;
	ExpandableField<Transfer> transfer;
	@Getter @Setter
	String transferGroup;

	/**
	 * @deprecated Use `source` field (https://stripe.com/docs/upgrades#2015-02-18)
	 */
	@Getter @Setter
	@Deprecated
	Card card;

	/**
	 * @deprecated Use `dispute` field (https://stripe.com/docs/upgrades#2012-11-07)
	 */
	@Getter @Setter
	@Deprecated
	Boolean disputed;

	/**
	 * @deprecated Use `statement_descriptor` field (https://stripe.com/docs/upgrades#2014-12-17)
	 */
	@Getter @Setter
	@Deprecated
	String statementDescription;

	public String getApplication() {
		if (this.application == null) {
			return null;
		}
		return this.application.getId();
	}

	public void setApplication(String applicationID) {
		this.application = setExpandableFieldID(applicationID, this.application);
	}

	public Application getApplicationObject() {
		if (this.application == null) {
			return null;
		}
		return this.application.getExpanded();
	}

	public void setApplicationObject(Application c) {
		this.application = new ExpandableField<Application>(c.getId(), c);
	}

	public String getApplicationFee() {
		if (this.applicationFee == null) {
			return null;
		}
		return this.applicationFee.getId();
	}

	public void setApplicationFee(String applicationFeeID) {
		this.applicationFee = setExpandableFieldID(applicationFeeID, this.applicationFee);
	}

	public ApplicationFee getApplicationFeeObject() {
		if (this.applicationFee == null) {
			return null;
		}
		return this.applicationFee.getExpanded();
	}

	public void setApplicationFeeObject(ApplicationFee c) {
		this.applicationFee = new ExpandableField<ApplicationFee>(c.getId(), c);
	}

	public String getBalanceTransaction() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getId();
	}

	public void setBalanceTransaction(String balanceTransactionID) {
		this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
	}

	public BalanceTransaction getBalanceTransactionObject() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getExpanded();
	}

	public void setBalanceTransactionObject(BalanceTransaction c) {
		this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
	}

	public String getCustomer() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getId();
	}

	public void setCustomer(String customerID) {
		this.customer = setExpandableFieldID(customerID, this.customer);

	}

	public Customer getCustomerObject() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getExpanded();
	}

	public void setCustomerObject(Customer c) {
		this.customer = new ExpandableField<Customer>(c.getId(), c);
	}

	public String getDestination() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.getId();
	}

	public void setDestination(String destinationID) {
		this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
	}

	public Account getDestinationObject() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.getExpanded();
	}

	public void setDestinationObject(Account c) {
		this.destination = new ExpandableField<Account>(c.getId(), c);
	}

	public String getDispute() {
		if (dispute == null) {
			return null;
		}
		return dispute.getId();
	}

	public void setDispute(String dispute) {
		this.dispute = setExpandableFieldID(dispute, this.dispute);
	}

	public Dispute getDisputeObject() {
		if (dispute == null) {
			return null;
		}
		return this.dispute.getExpanded();
	}

	public void setDisputeObject(Dispute dispute) {
		this.dispute = new ExpandableField<Dispute>(dispute.getId(), dispute);
	}

	public String getInvoice() {
		if (this.invoice == null) {
			return null;
		}
		return this.invoice.getId();
	}

	public void setInvoice(String invoiceID) {
		this.invoice = setExpandableFieldID(invoiceID, this.invoice);
	}

	public Invoice getInvoiceObject() {
		if (this.invoice == null) {
			return null;
		}
		return this.invoice.getExpanded();
	}

	public void setInvoiceObject(Invoice c) {
		this.invoice = new ExpandableField<Invoice>(c.getId(), c);
	}

	public String getOrder() {
		if (this.order == null) {
			return null;
		}
		return this.order.getId();
	}

	public void setOrder(String orderID) {
		this.order = setExpandableFieldID(orderID, this.order);
	}

	public Order getOrderObject() {
		if (this.order == null) {
			return null;
		}
		return this.order.getExpanded();
	}

	public void setOrderObject(Order c) {
		this.order = new ExpandableField<Order>(c.getId(), c);
	}

	public ChargeRefundCollection getRefunds() {
		// API versions 2014-05-19 and earlier render charge refunds as an array
		// instead of an object, meaning there is no sublist URL.
		if (refunds != null && refunds.getURL() == null) {
			refunds.setURL(String.format("/v1/charges/%s/refunds", getId()));
		}
		return refunds;
	}

	public String getReview() {
		if (this.review == null) {
			return null;
		}
		return this.review.getId();
	}

	public void setReview(String reviewID) {
		this.review = setExpandableFieldID(reviewID, this.review);
	}

	public Review getReviewObject() {
		if (this.review == null) {
			return null;
		}
		return this.review.getExpanded();
	}

	public void setReviewObject(Review r) {
		this.review = new ExpandableField<Review>(r.getId(), r);
	}

	public String getSourceTransfer() {
		if (this.sourceTransfer == null) {
			return null;
		}
		return this.sourceTransfer.getId();
	}

	public void setSourceTransfer(String sourceTransferID) {
		this.sourceTransfer = setExpandableFieldID(sourceTransferID, this.sourceTransfer);
	}

	public Transfer getSourceTransferObject() {
		if (this.sourceTransfer == null) {
			return null;
		}
		return this.sourceTransfer.getExpanded();
	}

	public void setSourceTransferObject(Transfer c) {
		this.sourceTransfer = new ExpandableField<Transfer>(c.getId(), c);
	}

	public String getTransfer() {
		if (this.transfer == null) {
			return null;
		}
		return this.transfer.getId();
	}

	public void setTransfer(String transferID) {
		this.transfer = setExpandableFieldID(transferID, this.transfer);
	}
	
	public Transfer getTransferObject() {
		if (this.transfer == null) {
			return null;
		}
		return this.transfer.getExpanded();
	}

	public void setTransferObject(Transfer c) {
		this.transfer = new ExpandableField<Transfer>(c.getId(), c);
	}

	public static Charge create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Charge retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public Charge update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public Charge refund() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.refund(null, (RequestOptions) null);
	}

	public Charge capture() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.capture(null, (RequestOptions) null);
	}

	@Deprecated
	public Dispute updateDispute(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.updateDispute(params, (RequestOptions) null);
	}

	@Deprecated
	public Dispute closeDispute() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.closeDispute((RequestOptions) null);
	}

	public Charge refund(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.refund(params, (RequestOptions) null);
	}

	public Charge capture(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.capture(params, (RequestOptions) null);
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

	@Deprecated
	public Charge update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Charge update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Charge.class, id), params, Charge.class, options);
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
	public Dispute updateDispute(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return updateDispute(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public Dispute updateDispute(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/dispute", instanceURL(Charge.class, this.id)), params, Dispute.class, options);
	}

	@Deprecated
	public Dispute closeDispute(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return closeDispute(RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public Dispute closeDispute(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/dispute/close", instanceURL(Charge.class, this.getId())), null, Dispute.class, options);
	}

	/**
	 * Convenience method to mark a given charge as fraudulent.
	 */
	public Charge markFraudulent(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		Map<String, Object> params = Collections.<String, Object>singletonMap(FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "fraudulent"));
		return this.update(params, options);
	}

	/**
	 * Convenience method to mark a given charge as not fraudulent.
	 */
	public Charge markSafe(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		Map<String, Object> params = Collections.<String, Object>singletonMap(FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "safe"));
		return this.update(params, options);
	}
}
