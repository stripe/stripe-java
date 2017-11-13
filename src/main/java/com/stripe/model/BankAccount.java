package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class BankAccount extends ExternalAccount {
	@Getter @Setter
	String accountHolderName;
	@Getter @Setter
	String accountHolderType;
	@Getter @Setter
	String bankName;
	@Getter @Setter
	String country;
	@Getter @Setter
	String currency;
	@Getter @Setter
	Boolean defaultForCurrency;
	@Getter @Setter
	String fingerprint;
	@Getter @Setter
	String last4;
	@Getter @Setter
	String routingNumber;
	@Getter @Setter
	String status;
	@Getter @Setter
	Boolean validated;

	public BankAccount update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public BankAccount update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, BankAccount.class, options);
	}

	public DeletedBankAccount delete()
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return delete(null);
	}

	public DeletedBankAccount delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBankAccount.class, options);
	}
}
