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

public class RecipientCardCollection extends StripeCollection<Card> {
  // <editor-fold desc="create">
  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a recipient card.
   */
  public RecipientCardCollection create(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return APIResource.request(APIResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getURL()), params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all recipient cards.
   */
  public RecipientCardCollection list(Map<String, Object> params,
                    RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.requestCollection(url, params, RecipientCardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a recipient card.
   */
  public Card retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
    return APIResource.request(APIResource.RequestMethod.GET, url, null, Card.class, options);
  }
  // </editor-fold>
}
