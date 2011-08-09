package com.stripe.sdk.model;

public class RecurringPaymentEvent {
	protected long customer, attempt;
	protected boolean livemode;
	protected Invoice invoice;
	protected Payment payment;

	public RecurringPaymentEvent() {
	}

	public RecurringPaymentEvent(long customer, long attempt,
			boolean livemode, Invoice invoice, Payment payment) {
		super();
		this.customer = customer;
		this.attempt = attempt;
		this.livemode = livemode;
		this.invoice = invoice;
		this.payment = payment;
	}

	public long getCustomer() {
		return customer;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public long getAttempt() {
		return attempt;
	}

	public void setAttempt(long attempt) {
		this.attempt = attempt;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
