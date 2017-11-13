package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class AlipayAccount extends ExternalAccount {
	Long created;
	String fingerprint;
	Boolean livemode;
	Long paymentAmount;
	String paymentCurrency;
	Boolean reusable;
	Boolean used;
	String username;
	String status;

	public AlipayAccount update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public AlipayAccount update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, AlipayAccount.class, options);
	}

	public DeletedAlipayAccount delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(null);
	}

	public DeletedAlipayAccount delete(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedAlipayAccount.class, options);
	}
}

