package com.stripe.sdk.model;

public class InvoiceReadyEvent {
	protected long customer;
	protected Invoice invoice;

	public InvoiceReadyEvent() {
	}

	public InvoiceReadyEvent(long customer, Invoice invoice) {
		super();
		this.customer = customer;
		this.invoice = invoice;
	}

	public long getCustomer() {
		return customer;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
