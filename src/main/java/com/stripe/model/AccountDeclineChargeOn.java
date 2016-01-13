package com.stripe.model;

public class AccountDeclineChargeOn extends StripeObject {
	Boolean avsFailure;
	Boolean cvcFailure;

	public Boolean getAvsFailure(){
		return avsFailure;
	}

	public void setAvsFailure(Boolean avsFailure){
		this.avsFailure = avsFailure;
	}

	public Boolean getCvcFailure(){
		return cvcFailure;
	}
	
	public void setCvcFailure(Boolean cvcFailure){
		this.cvcFailure = cvcFailure;
	}
}
