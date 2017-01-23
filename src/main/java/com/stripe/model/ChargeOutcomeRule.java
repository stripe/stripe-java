package com.stripe.model;

public class ChargeOutcomeRule extends StripeObject {
	protected String action;
	protected String predicate;

	public String getAction() {
		return action;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
}
