package com.stripe.model;

public class SubscriptionEvent {
	protected long customer;
	protected Subscription subscription;

	public SubscriptionEvent() {
	}

	public SubscriptionEvent(long customer, Subscription subscription) {
		super();
		this.customer = customer;
		this.subscription = subscription;
	}

	public long getCustomer() {
		return customer;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

}
