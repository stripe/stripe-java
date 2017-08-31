package com.stripe.net;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.oauth.OAuthException;

import java.util.Map;

public interface StripeResponseGetter {
	<T> T request(
			APIResource.RequestMethod method,
			String url,
			Map<String, Object> params,
			Class<T> clazz,
			APIResource.RequestType type,
			RequestOptions options) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException;

	<T> T oAuthRequest(
			APIResource.RequestMethod method,
			String url,
			Map<String, Object> params,
			Class<T> clazz,
			APIResource.RequestType type,
			RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, OAuthException;
}

