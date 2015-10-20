package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Collections;
import java.util.Map;

public class ExternalAccount extends APIResource implements HasId {
	String id;
	String object;
	String customer;
	String account;

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public String getCustomer() {
		return customer;
	}

	// For testing
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccount() {
		return account;
	}

	// For testing
	public void setAccount(String account) {
		this.account = account;
	}

	public String getInstanceURL() {
		if (this.getCustomer() != null) {
			return String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(), this.getId());
		} else if (this.getAccount() != null) {
			return String.format("%s/%s/external_accounts/%s", classURL(Account.class), this.getAccount(), this.getId());
		} else {
			return null;
		}
	}

	public ExternalAccount update(Map<String, Object> params) throws
			AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public ExternalAccount update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, ExternalAccount.class, options);
	}

	public DeletedExternalAccount delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException,
			CardException, APIException {
		return delete(null);
	}

	public DeletedExternalAccount delete(RequestOptions options) throws
			AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedExternalAccount.class, options);
	}
}
