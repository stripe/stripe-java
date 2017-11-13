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

import java.util.Map;

public class InvoiceItem extends APIResource implements MetadataStore<InvoiceItem>, HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	String currency;
	ExpandableField<Customer> customer;
	@Getter @Setter
	Long date;
	@Getter @Setter
	String description;
	@Getter @Setter
	Boolean discountable;
	ExpandableField<Invoice> invoice;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	InvoiceLineItemPeriod period;
	@Getter @Setter
	Plan plan;
	@Getter @Setter
	Boolean proration;
	@Getter @Setter
	Integer quantity;
	ExpandableField<Subscription> subscription;

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

}
