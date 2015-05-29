package com.stripe.model;


public class BankAccount extends ExternalAccount {
	String country;
	String last4;
	String bankName;
	Boolean validated;
	String currency;
	String status;
	String fingerprint;
	Boolean defaultForCurrency;

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
		this.bankName = bankName;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public Boolean getDefaultForCurrency() {
		return defaultForCurrency;
	}

	public void setDefaultForCurrency(Boolean defaultForCurrency) {
		this.defaultForCurrency = defaultForCurrency;
	}
}
