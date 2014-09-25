package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;

import java.util.Map;

public class InvoiceLineItemCollection extends StripeColllectionAPIResource<InvoiceLineItem> {
	public InvoiceLineItemCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, null);
	}

	public InvoiceLineItemCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return request(RequestMethod.GET, url, params,
				InvoiceLineItemCollection.class, apiKey);
	}
}
