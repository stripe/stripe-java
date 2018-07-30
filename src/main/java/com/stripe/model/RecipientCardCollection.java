package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class RecipientCardCollection extends StripeCollection<Card> {
  // <editor-fold desc="create">
  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id, RequestOptions options) throws StripeException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Card.class, options);
  }
  // </editor-fold>
}
