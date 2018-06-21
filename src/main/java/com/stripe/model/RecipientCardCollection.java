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

public class RecipientCardCollection extends StripeCollection<Card> {
  // <editor-fold desc="create">
  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params,
                    RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Card.class, options);
  }
  // </editor-fold>
}
