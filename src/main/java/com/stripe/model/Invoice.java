package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Invoice extends APIResource implements MetadataStore<Invoice>, HasId {
	String id;
	String object;
	Long amountDue;
	Long applicationFee;
	Integer attemptCount;
	Boolean attempted;
	String billing;
	ExpandableField<Charge> charge;
	Boolean closed;
	Long created;
	String currency;
	String customer;
	Long date;
	String description;
	Discount discount;
	Long dueDate;
	Long endingBalance;
	Boolean forgiven;
	InvoiceLineItemCollection lines;
	Boolean livemode;
	Map<String, String> metadata;
	Long nextPaymentAttempt;
	String number;
	Boolean paid;
	Long periodEnd;
	Long periodStart;
	String receiptNumber;
	Long startingBalance;
	String statementDescriptor;
	String subscription;
	Long subscriptionProrationDate;
	Long subtotal;
	Long tax;
	Double taxPercent;
	Long total;
	Long webhooksDeliveredAt;

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

	public Long getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(Long amountDue) {
		this.amountDue = amountDue;
	}

	public Long getApplicationFee() {
		return applicationFee;
	}

	public void setApplicationFee(Long applicationFee) {
		this.applicationFee = applicationFee;
	}

	public Integer getAttemptCount() {
		return attemptCount;
	}

	public void setAttemptCount(Integer attemptCount) {
		this.attemptCount = attemptCount;
	}

	public Boolean getAttempted() {
		return attempted;
	}

	public void setAttempted(Boolean attempted) {
		this.attempted = attempted;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public String getCharge() {
		if (charge == null) {
			return null;
		}
		return charge.getId();
	}

	public void setCharge(String charge) {
		this.charge = setExpandableFieldID(charge, this.charge);
	}

	public Charge getChargeObject() {
		if (this.charge == null) {
			return null;
		}
		return this.charge.getExpanded();
	}

	public void setChargeObject(Charge charge) {
		this.charge = new ExpandableField<Charge>(charge.getId(), charge);
	}

	public Boolean getClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
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
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Long getDueDate() {
		return dueDate;
	}

	public void setDueDate(Long dueDate) {
		this.dueDate = dueDate;
	}

	public Long getEndingBalance() {
		return endingBalance;
	}

	public void setEndingBalance(Long endingBalance) {
		this.endingBalance = endingBalance;
	}

	public Boolean getForgiven() {
		return forgiven;
	}

	public void setForgiven(Boolean forgiven) {
		this.forgiven = forgiven;
	}

	public InvoiceLineItemCollection getLines() {
		return lines;
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

	public Long getNextPaymentAttempt() {
		return nextPaymentAttempt;
	}

	public void setNextPaymentAttempt(Long nextPaymentAttempt) {
		this.nextPaymentAttempt = nextPaymentAttempt;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Long getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(Long periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Long getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(Long periodStart) {
		this.periodStart = periodStart;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public Long getStartingBalance() {
		return startingBalance;
	}

	public void setStartingBalance(Long startingBalance) {
		this.startingBalance = startingBalance;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public void setStatementDescriptor(String statementDescriptor) {
		this.statementDescriptor = statementDescriptor;
	}

	public String getSubscription() {
		return subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	public Long getSubscriptionProrationDate() {
		return subscriptionProrationDate;
	}

	public void setSubscriptionProrationDate(Long subscriptionProrationDate) {
		this.subscriptionProrationDate = subscriptionProrationDate;
	}

	public Long getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Long subtotal) {
		this.subtotal = subtotal;
	}

	public Long getTax() {
		return tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public Double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getWebhooksDeliveredAt() {
		return webhooksDeliveredAt;
	}

	public void setWebhooksDeliveredAt(Long webhooksDeliveredAt) {
		this.webhooksDeliveredAt = webhooksDeliveredAt;
	}

	public static Invoice retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static Invoice create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Invoice upcoming(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return upcoming(params, (RequestOptions) null);
	}

	public Invoice pay() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.pay((RequestOptions) null);
	}

	public Invoice update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	@Deprecated
	public static Invoice retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Invoice retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Invoice.class, id), null, Invoice.class, options);
	}

	@Deprecated
	public static Invoice create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Invoice create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Invoice.class), params, Invoice.class, options);
	}

	@Deprecated
	public static Invoice upcoming(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return upcoming(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Invoice upcoming(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, String.format("%s/upcoming", classURL(Invoice.class)), params, Invoice.class, options);
	}

	public static InvoiceCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	public static InvoiceCollection list(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Invoice.class), params, InvoiceCollection.class, options);
	}

	@Deprecated
	public static InvoiceCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static InvoiceCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static InvoiceCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	@Deprecated
	public Invoice update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Invoice update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Invoice.class, this.id), params, Invoice.class, options);
	}

	@Deprecated
	public Invoice pay(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return pay(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Invoice pay(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/pay",
				instanceURL(Invoice.class, this.getId())), null, Invoice.class, options);
	}
}
