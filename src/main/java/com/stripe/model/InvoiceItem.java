package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import com.stripe.params.CreateInvoiceItem;
import com.stripe.params.UpdateInvoiceItem;

import java.util.Map;

public class InvoiceItem extends APIResource implements MetadataStore<InvoiceItem>, HasId {
	String id;
	String object;
	Long amount;
	String currency;
	ExpandableField<Customer> customer;
	Long date;
	String description;
	Boolean discountable;
	ExpandableField<Invoice> invoice;
	Boolean livemode;
	Map<String, String> metadata;
	InvoiceLineItemPeriod period;
	Plan plan;
	Boolean proration;
	Integer quantity;
	ExpandableField<Subscription> subscription;

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

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public Boolean getDiscountable() {
		return discountable;
	}

	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
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

	public void setInvoiceObject(Invoice invoice) {
		this.invoice = new ExpandableField<Invoice>(invoice.getId(), invoice);
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

	public InvoiceLineItemPeriod getPeriod() {
		return period;
	}

	public void setPeriod(InvoiceLineItemPeriod period) {
		this.period = period;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Boolean getProration() {
		return proration;
	}

	public void setProration(Boolean proration) {
		this.proration = proration;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSubscription() {
		if (subscription == null) {
			return null;
		}
		return subscription.getId();
	}

	public void setSubscription(String subscriptionID) {
		this.subscription = setExpandableFieldID(subscriptionID, this.subscription);
	}

	public Subscription getSubscriptionObject() {
		if (this.subscription == null) {
			return null;
		}
		return this.subscription.getExpanded();
	}

	public void setSubscriptionObject(Subscription subscription) {
		this.subscription = new ExpandableField<Subscription>(subscription.getId(), subscription);
	}

	public static InvoiceItem create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static InvoiceItem retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public InvoiceItem update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public DeletedInvoiceItem delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete((RequestOptions) null);
	}

	@Deprecated
	public static InvoiceItem create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static InvoiceItem create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(InvoiceItem.class), params, InvoiceItem.class, options);
	}

	@Deprecated
	public static InvoiceItem retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static InvoiceItem retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), null, InvoiceItem.class, options);
	}

	public static InvoiceItem retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), params, InvoiceItem.class, options);
	}

	public static InvoiceItemCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static InvoiceItemCollection list(Map<String, Object> params,
											 RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(InvoiceItem.class), params, InvoiceItemCollection.class, options);
	}

	@Deprecated
	public static InvoiceItemCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static InvoiceItemCollection all(Map<String, Object> params,
											String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static InvoiceItemCollection all(Map<String, Object> params,
											RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	@Deprecated
	public InvoiceItem update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public InvoiceItem update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(InvoiceItem.class, this.id), params, InvoiceItem.class, options);
	}

	@Deprecated
	public DeletedInvoiceItem delete(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}

	public DeletedInvoiceItem delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(InvoiceItem.class, this.id), null, DeletedInvoiceItem.class, options);
	}


	public static InvoiceItem create(CreateInvoiceItem params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static InvoiceItem create(CreateInvoiceItem params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params.toMap(), options);
	}

	public InvoiceItem update(UpdateInvoiceItem params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public InvoiceItem update(UpdateInvoiceItem params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params.toMap(), options);
	}
}
