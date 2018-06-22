package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class CustomerCardCollection extends StripeCollection<Card> {
  // <editor-fold desc="create">
  /**
   * Create a card.
   */
  public Card create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a card.
   */
  public Card create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all cards.
   */
  public CustomerCardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all cards.
   */
  public CustomerCardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, CustomerCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a card.
   */
  public Card retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a card.
   */
  public Card retrieve(String id, RequestOptions options) throws StripeException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Card.class, options);
  }
  // </editor-fold>
}
