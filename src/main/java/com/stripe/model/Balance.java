package com.stripe.model;

import java.util.List;
import java.util.HashMap;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;

public class Balance extends APIResource {
	Boolean livemode;
	List<HashMap> pending;
	List<HashMap> available;

	public Boolean getLivemode() {
		return livemode;
	}

	public List<HashMap> getPending() {
		return pending;
	}

	public List<HashMap> getAvailable() {
		return available;
	}

	public static Balance retrieve() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(null);
	}

	public static Balance retrieve(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, singleClassURL(Balance.class), null,
				Balance.class, apiKey);
	}
}
