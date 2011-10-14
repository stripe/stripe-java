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
	String livemode;

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

	public String getLivemode() {
		return livemode;
	}

	public void setLivemode(String livemode) {
		this.livemode = livemode;
	}

	public static InvoiceItem create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(InvoiceItem.class), params, InvoiceItem.class);
	}

	public static InvoiceItem retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), null, InvoiceItem.class);
	}
	
	public static InvoiceItemCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(InvoiceItem.class), params, InvoiceItemCollection.class);
	}
	
	public InvoiceItem update(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, instanceURL(InvoiceItem.class, this.id), params, InvoiceItem.class);
	}
	
	public DeletedInvoiceItem delete() throws StripeException { 
		return request(RequestMethod.DELETE, instanceURL(InvoiceItem.class, this.id), null, DeletedInvoiceItem.class);
	}
}