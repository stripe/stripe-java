package com.stripe.model;

import java.util.List;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;

public class Account extends APIResource {
	String id;
	Boolean chargeEnabled;
	Boolean detailsSubmitted;
	Boolean transferEnabled;
	List<String> currenciesSupported;
	String email;
	String statementDescriptor;

	public String getId() {
		return id;
	}

	public Boolean getChargeEnabled() {
		return chargeEnabled;
	}

	public Boolean getDetailsSubmitted() {
		return detailsSubmitted;
	}

	public Boolean getTransferEnabled() {
		return transferEnabled;
	}

	public List<String> getCurrenciesSupported() {
		return currenciesSupported;
	}

	public String getEmail() {
		return email;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public static Account retrieve() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(null);
	}

	public static Account retrieve(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, singleClassURL(Account.class), null,
				Account.class, apiKey);
	}
}
