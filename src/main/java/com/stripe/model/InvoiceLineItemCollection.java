package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;

public class InvoiceLineItemCollection extends APIResource {
	List<InvoiceLineItem> data;
	Integer count;
	String url;

	public List<InvoiceLineItem> getData() {
		return data;
	}

	public String getURL() {
		return url;
	}

	public Integer getCount() {
		return count;
	}

	public InvoiceLineItemCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, null);
	}

	public InvoiceLineItemCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.API_BASE, this.getURL());
		return request(RequestMethod.GET, url, params,
				InvoiceLineItemCollection.class, apiKey);
	}
}