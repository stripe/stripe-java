package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Card;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.issuing.CardCreateParams;
import com.stripe.param.issuing.CardListParams;
import com.stripe.param.issuing.CardRetrieveParams;
import com.stripe.param.issuing.CardUpdateParams;
import com.stripe.service.Service;
import com.stripe.util.StringUtils;
import java.lang.reflect.Type;

public class CardService extends Service<Card> {
  public CardService(StripeClient client) {
    super(client);
  }

  /**
   * Creates an Issuing <code>Card</code> object.
   *
   * @param params the request parameters
   * @return the created card
   * @throws StripeException if the request fails
   */
  public Card create(CardCreateParams params) throws StripeException {
    return this.create(params, null);
  }

  /**
   * Creates an Issuing <code>Card</code> object.
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the created card
   * @throws StripeException if the request fails
   */
  public Card create(CardCreateParams params, RequestOptions options) throws StripeException {
    return this.request(
        Card.class, ApiResource.RequestMethod.POST, "/v1/issuing/cards", params, options);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   *
   * @return the list of cards
   * @throws StripeException if the request fails
   */
  public StripeCollection<Card> list() throws StripeException {
    return this.list(null, null);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   *
   * @param params the request parameters
   * @return the list of cards
   * @throws StripeException if the request fails
   */
  public StripeCollection<Card> list(CardListParams params) throws StripeException {
    return this.list(params, null);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the list of cards
   * @throws StripeException if the request fails
   */
  public StripeCollection<Card> list(CardListParams params, RequestOptions options)
      throws StripeException {
    Type type = new TypeToken<StripeCollection<Card>>() {}.getType();
    return this.request(type, ApiResource.RequestMethod.GET, "/v1/issuing/cards", params, options);
  }

  /**
   * Retrieves an Issuing <code>Card</code> object.
   *
   * @param id the ID of the card to retrieve
   * @return the retrieved card
   * @throws StripeException if the request fails
   */
  public Card retrieve(String id) throws StripeException {
    return this.retrieve(id, null, null);
  }

  /**
   * Retrieves an Issuing <code>Card</code> object.
   *
   * @param id the ID of the card to retrieve
   * @param params the request parameters
   * @return the retrieved card
   * @throws StripeException if the request fails
   */
  public Card retrieve(String id, CardRetrieveParams params) throws StripeException {
    return this.retrieve(id, params, null);
  }

  /**
   * Retrieves an Issuing <code>Card</code> object.
   *
   * @param id the ID of the card to retrieve
   * @param params the request parameters
   * @param options the special options for the request
   * @return the retrieved card
   * @throws StripeException if the request fails
   */
  public Card retrieve(String id, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    return this.request(
        Card.class,
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/cards/%s", StringUtils.urlEncode(id)),
        params,
        options);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   *
   * @param id the ID of the card to update
   * @param params the request parameters
   * @return the updated card
   * @throws StripeException if the request fails
   */
  public Card update(String id, CardUpdateParams params) throws StripeException {
    return this.update(id, params, null);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   *
   * @param id the ID of the card to update
   * @param params the request parameters
   * @param options the special options for the request
   * @return the updated card
   * @throws StripeException if the request fails
   */
  public Card update(String id, CardUpdateParams params, RequestOptions options)
      throws StripeException {
    return this.request(
        Card.class,
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/cards/%s", StringUtils.urlEncode(id)),
        params,
        options);
  }
}
