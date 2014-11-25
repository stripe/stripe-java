package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Charge extends APIResource implements MetadataStore<Charge> {
	Integer amount;
	Long created;
	String currency;
	String id;
	Boolean livemode;
	Boolean paid;
	Boolean refunded;
	/** Legacy; use `dispute` field (https://stripe.com/docs/upgrades#2012-11-07) */
	Boolean disputed;
	Boolean captured;
	String description;
	String failureMessage;
	String failureCode;
	Integer amountRefunded;
	String customer;
	String invoice;
	ChargeRefundCollection refunds;
	Card card;
	Dispute dispute;
	String balanceTransaction;
	Map<String, String> metadata;
	String receiptEmail;
	String receiptNumber;
	String statementDescription;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

	public Boolean getCaptured() {
		return captured;
	}

	public void setCaptured(Boolean captured) {
		this.captured = captured;
	}

	/**
	 * @deprecated
	 * Use `dispute` field (https://stripe.com/docs/upgrades#2012-11-07)
	 */
	@Deprecated
	public Boolean getDisputed() {
		return disputed;
	}

	/**
	 * @deprecated
	 * Use `dispute` field (https://stripe.com/docs/upgrades#2012-11-07)
	 */
	@Deprecated
	public void setDisputed(Boolean disputed) {
		this.disputed = disputed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatementDescription() {
		return statementDescription;
	}

	public void setStatementDescription(String statementDescription) {
		this.statementDescription = statementDescription;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public String getFailureCode() {
		return failureCode;
	}

	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public Integer getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Integer amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public ChargeRefundCollection getRefunds() {
		// API versions 2014-05-19 and earlier render charge refunds as an array
		// instead of an object, meaning there is no sublist URL.
		if (refunds.getURL() == null) {
			refunds.setURL(String.format("/v1/charges/%s/refunds", getId()));
		}
		return refunds;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Dispute getDispute() {
		return dispute;
	}

	public void setDispute(Dispute dispute) {
		this.dispute = dispute;
	}

	public String getBalanceTransaction() {
		return balanceTransaction;
	}

	public void setBalanceTransaction(String balanceTransaction) {
		this.balanceTransaction = balanceTransaction;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public String getReceiptEmail() {
		return receiptEmail;
	}

	public void setReceiptEmail(String receiptEmail) {
		this.receiptEmail = receiptEmail;
	}

	public static Charge create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.getDefault());
	}

	public static Charge retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, RequestOptions.getDefault());
	}

	public Charge update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.getDefault());
	}

	public static ChargeCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, RequestOptions.getDefault());
	}

	public Charge refund() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.refund(null, RequestOptions.getDefault());
	}

	public Charge capture() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.capture(null, RequestOptions.getDefault());
	}

	public Dispute updateDispute(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.updateDispute(params, RequestOptions.getDefault());
	}

	public Dispute closeDispute() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.closeDispute(RequestOptions.getDefault());
	}

	public Charge refund(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.refund(params, RequestOptions.getDefault());
	}

	public Charge capture(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.capture(params, RequestOptions.getDefault());
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

	@Deprecated
	public static ChargeCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static ChargeCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, classURL(Charge.class), params, ChargeCollection.class, options);
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
	public Dispute closeDispute(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/dispute/close", instanceURL(Charge.class, this.getId())), null, Dispute.class, options);
	}
}
