package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class RecipientCardCollection extends StripeColllectionAPIResource<Card> {
  public RecipientCardCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return all(params, RequestOptions.getDefault());
  }

  @Deprecated
  public RecipientCardCollection all(Map<String, Object> params,
      String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
	  return all(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  public RecipientCardCollection all(Map<String, Object> params,
      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
	  return request(RequestMethod.GET, url, params, RecipientCardCollection.class, options);
  }

  public Card retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.getDefault());
  }

  @Deprecated
  public Card retrieve(String id, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
	  return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }
  public Card retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
	  return request(RequestMethod.GET, url, null, Card.class, options);
  }

  public RecipientCardCollection create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.getDefault());
  }

  @Deprecated
  public RecipientCardCollection create(Map<String, Object> params,
      String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
	  return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  public RecipientCardCollection create(Map<String, Object> params,
      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
	  return request(RequestMethod.POST, url, params, RecipientCardCollection.class, options);
  }
}
