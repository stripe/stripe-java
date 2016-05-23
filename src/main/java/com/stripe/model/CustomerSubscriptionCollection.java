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

public class CustomerSubscriptionCollection extends StripeCollection<Subscription> {
	public CustomerSubscriptionCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	public CustomerSubscriptionCollection list(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return APIResource.requestCollection(url, params, CustomerSubscriptionCollection.class, options);
	}

	@Deprecated
	public CustomerSubscriptionCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public CustomerSubscriptionCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public CustomerSubscriptionCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	public Subscription retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	@Deprecated
	public Subscription retrieve(String id, String apiKey) throws AuthenticationException,
		InvalidRequestException, APIConnectionException, CardException,
		APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Subscription retrieve(String id, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
		return APIResource.request(APIResource.RequestMethod.GET, url, null, Subscription.class, options);
	}

	public Subscription create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	@Deprecated
	public Subscription create(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Subscription create(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
		return APIResource.request(APIResource.RequestMethod.POST, url, params, Subscription.class, options);
	}
}
