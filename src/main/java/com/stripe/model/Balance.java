package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;

public class Balance extends APIResource {
	String object;
	List<Money> available;
	Boolean livemode;
	List<Money> pending;

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public List<Money> getAvailable() {
		return available;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public List<Money> getPending() {
		return pending;
	}

	public static Balance retrieve() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve((RequestOptions) null);
	}

	@Deprecated
	public static Balance retrieve(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Balance retrieve(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, singleClassURL(Balance.class), null, Balance.class, options);
	}
}
