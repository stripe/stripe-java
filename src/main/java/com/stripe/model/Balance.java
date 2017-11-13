package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Balance extends APIResource {
	@Getter @Setter
	String object;
	@Getter
	List<Money> available;
	@Getter
	Boolean livemode;
	@Getter
	List<Money> pending;

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
