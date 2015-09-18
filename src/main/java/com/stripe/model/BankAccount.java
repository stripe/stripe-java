package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class BankAccount extends ExternalAccount {
	String country;
	String last4;
	String bankName;
	Boolean validated;
	String currency;
	String status;
	String fingerprint;
	Boolean defaultForCurrency;
	String routingNumber;

	public BankAccount update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public BankAccount update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, BankAccount.class, options);
	}

	public DeletedBankAccount delete()
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return delete((RequestOptions) null);
	}

	public DeletedBankAccount delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBankAccount.class, options);
	}

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

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
}
