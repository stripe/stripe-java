package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class CustomerCardCollection extends StripeCollection<Card> {
  // <editor-fold desc="create">
  /**
   * Create a card.
   */
  public Card create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a card.
   */
  public Card create(Map<String, Object> params,
             RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all cards.
   */
  public CustomerCardCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all cards.
   */
  public CustomerCardCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, CustomerCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a card.
   */
  public Card retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a card.
   */
  public Card retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Card.class, options);
  }
  // </editor-fold>
}
