package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class InvoiceItem extends APIResource {
	Integer amount;
	String id;
	String currency;
	String description;
	Long date;
	Boolean livemode;
	String customer;
	String invoice;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
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

	public static InvoiceItem create(Map<String, Object> params) throws StripeException {
		return create(params, null);
	}

	public static InvoiceItem retrieve(String id) throws StripeException {
		return retrieve(id, null);
	}
	
	public static InvoiceItemCollection all(Map<String, Object> params) throws StripeException {
		return all(params, null);
	}
	
	public InvoiceItem update(Map<String, Object> params) throws StripeException {
		return update(params, null);
	}
	
	public DeletedInvoiceItem delete() throws StripeException { 
		return delete(null);
	}
	
	public static InvoiceItem create(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.POST, classURL(InvoiceItem.class), params, InvoiceItem.class, apiKey);
	}

	public static InvoiceItem retrieve(String id, String apiKey) throws StripeException {
		return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), null, InvoiceItem.class, apiKey);
	}
	
	public static InvoiceItemCollection all(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.GET, classURL(InvoiceItem.class), params, InvoiceItemCollection.class, apiKey);
	}
	
	public InvoiceItem update(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.POST, instanceURL(InvoiceItem.class, this.id), params, InvoiceItem.class, apiKey);
	}
	
	public DeletedInvoiceItem delete(String apiKey) throws StripeException { 
		return request(RequestMethod.DELETE, instanceURL(InvoiceItem.class, this.id), null, DeletedInvoiceItem.class, apiKey);
	}
	
}