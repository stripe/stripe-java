// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Card;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardCreateParams;
import com.stripe.param.issuing.CardListParams;
import com.stripe.param.issuing.CardRetrieveParams;
import com.stripe.param.issuing.CardUpdateParams;

public final class CardService extends ApiService {
  public CardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Card> list(CardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Card> list(RequestOptions options) throws StripeException {
    return list((CardListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Card> list() throws StripeException {
    return list((CardListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Card> list(CardListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Card>>() {}.getType());
  }
  /** Creates an Issuing {@code Card} object. */
  public Card create(CardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an Issuing {@code Card} object. */
  public Card create(CardCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /** Retrieves an Issuing {@code Card} object. */
  public Card retrieve(String card, CardRetrieveParams params) throws StripeException {
    return retrieve(card, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Card} object. */
  public Card retrieve(String card, RequestOptions options) throws StripeException {
    return retrieve(card, (CardRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Card} object. */
  public Card retrieve(String card) throws StripeException {
    return retrieve(card, (CardRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Card} object. */
  public Card retrieve(String card, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(String card, CardUpdateParams params) throws StripeException {
    return update(card, params, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(String card, RequestOptions options) throws StripeException {
    return update(card, (CardUpdateParams) null, options);
  }
  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(String card) throws StripeException {
    return update(card, (CardUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(String card, CardUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
}
