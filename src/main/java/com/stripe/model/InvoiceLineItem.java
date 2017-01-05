package com.stripe.model;

import java.util.Map;

public class InvoiceLineItem extends StripeObject implements HasId {
	String id;
	String object;
	Long amount;
	String currency;
	String description;
	Boolean discountable;
	Boolean livemode;
	Map<String, String> metadata;
	InvoiceLineItemPeriod period;
	Plan plan;
	Boolean proration;
	Integer quantity;
	String subscription;
	String type;

	public String getId() {
		return this.id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Long getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public String getDescription() {
		return this.description;
	}

	public Boolean getDiscountable() {
		return this.discountable;
	}

	public Boolean getLivemode() {
		return this.livemode;
	}

	public Map<String, String> getMetadata() {
		return this.metadata;
	}

	public InvoiceLineItemPeriod getPeriod() {
		return this.period;
	}

	public Plan getPlan() {
		return this.plan;
	}

	public Boolean getProration() {
		return this.proration;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public String getSubscription() {
		return this.subscription;
	}

	public String getType() {
		return this.type;
	}
}
