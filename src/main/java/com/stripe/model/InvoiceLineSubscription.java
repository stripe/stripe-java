package com.stripe.model;

public class InvoiceLineSubscription extends StripeObject {
	Plan plan;
	Integer amount;
	InvoiceLineSubscriptionPeriod period;
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public InvoiceLineSubscriptionPeriod getPeriod() {
		return period;
	}
	public void setPeriod(InvoiceLineSubscriptionPeriod period) {
		this.period = period;
	}
}
