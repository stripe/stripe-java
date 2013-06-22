package com.stripe.model;

import java.io.Serializable;

public class BankAccount extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	String country;
	String last4;
	String bankName;
	Boolean validated;

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName= bankName;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}
}
