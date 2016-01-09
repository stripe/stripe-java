package com.stripe.model;

public class AccountDeclineChargeOn extends StripeObject {
	Boolean avsFailure;
	Boolean cvcFailure;

	public Boolean getAvsFailure() {
		return this.avsFailure;
	}

	public Boolean getCvcFailure() {
		return this.cvcFailure;
	}
}
