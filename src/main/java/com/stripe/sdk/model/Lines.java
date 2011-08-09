package com.stripe.sdk.model;

public class Lines {
	protected Subscription subscription;
	protected Plan plan;
	protected InvoiceItem[] invoiceitems;

	public Lines() {
	}

	public Lines(Subscription subscription, Plan plan,
			InvoiceItem[] invoiceitems) {
		super();
		this.subscription = subscription;
		this.plan = plan;
		this.invoiceitems = invoiceitems;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public InvoiceItem[] getInvoiceitems() {
		return invoiceitems;
	}

	public void setInvoiceitems(InvoiceItem[] invoiceitems) {
		this.invoiceitems = invoiceitems;
	}

}
