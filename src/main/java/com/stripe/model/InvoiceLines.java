package com.stripe.model;

import java.util.List;

public class InvoiceLines extends StripeObject {
	List<InvoiceItem> invoiceitems;
	List<InvoiceLineSubscription> subscriptions;
	
	public List<InvoiceItem> getInvoiceitems() {
		return invoiceitems;
	}
	public void setInvoiceitems(List<InvoiceItem> invoiceitems) {
		this.invoiceitems = invoiceitems;
	}
	public List<InvoiceLineSubscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<InvoiceLineSubscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
