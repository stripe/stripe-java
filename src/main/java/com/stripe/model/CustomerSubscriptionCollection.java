package com.stripe.model;

import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;

public class CustomerSubscriptionCollection extends StripeColllectionAPIResource<Subscription> {
	  public CustomerSubscriptionCollection all(Map<String, Object> params)
	      throws AuthenticationException, InvalidRequestException,
	      APIConnectionException, CardException, APIException {
	    return all(params, null);
	  }

	  public CustomerSubscriptionCollection all(Map<String, Object> params,
	      String apiKey) throws AuthenticationException,
	      InvalidRequestException, APIConnectionException, CardException,
	      APIException {
	    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
	    return request(RequestMethod.GET, url, params,
	        CustomerSubscriptionCollection.class, apiKey);
	  }

	  public Subscription retrieve(String id)
	      throws AuthenticationException, InvalidRequestException,
	      APIConnectionException, CardException, APIException {
	    return retrieve(id, null);
	  }

	  public Subscription retrieve(String id, String apiKey) throws AuthenticationException,
	      InvalidRequestException, APIConnectionException, CardException,
	      APIException {
	        // TODO: URL-encode!
	    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
	    return request(RequestMethod.GET, url, null,
	        Subscription.class, apiKey);
	  }

	  public CustomerSubscriptionCollection create(Map<String, Object> params)
	      throws AuthenticationException, InvalidRequestException,
	      APIConnectionException, CardException, APIException {
	    return create(params, null);
	  }

	  public CustomerSubscriptionCollection create(Map<String, Object> params,
	      String apiKey) throws AuthenticationException,
	      InvalidRequestException, APIConnectionException, CardException,
	      APIException {
	    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
	    return request(RequestMethod.POST, url, params,
	        CustomerSubscriptionCollection.class, apiKey);
	  }
}
