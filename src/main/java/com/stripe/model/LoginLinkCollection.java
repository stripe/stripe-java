package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class LoginLinkCollection extends StripeCollection<LoginLink> {
	public LoginLink create()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create((RequestOptions) null);
	}

	public LoginLink create(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return APIResource.request(APIResource.RequestMethod.POST, url, null, LoginLink.class, options);
	}
}
