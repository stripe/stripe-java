package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;

import java.util.Map;

public class ChargeRefundCollection extends StripeColllectionAPIResource<Refund> {
	public ChargeRefundCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, null);
	}

	public ChargeRefundCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return request(RequestMethod.GET, url, params,
				ChargeRefundCollection.class, apiKey);
	}

	public Refund retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, null);
	}

	public Refund retrieve(String id, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
		return request(RequestMethod.GET, url, null,
				Refund.class, apiKey);
	}

	public Refund create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public Refund create(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return request(RequestMethod.POST, url, params,
				Refund.class, apiKey);
	}
}
