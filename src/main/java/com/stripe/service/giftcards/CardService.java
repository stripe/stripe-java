// File generated from our OpenAPI spec
package com.stripe.service.giftcards;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.giftcards.Card;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.giftcards.CardCreateParams;
import com.stripe.param.giftcards.CardListParams;
import com.stripe.param.giftcards.CardRetrieveParams;
import com.stripe.param.giftcards.CardUpdateParams;
import com.stripe.param.giftcards.CardValidateParams;

public final class CardService extends ApiService {
  public CardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List gift cards for an account. */
  public StripeCollection<Card> list(CardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List gift cards for an account. */
  public StripeCollection<Card> list(RequestOptions options) throws StripeException {
    return list((CardListParams) null, options);
  }
  /** List gift cards for an account. */
  public StripeCollection<Card> list() throws StripeException {
    return list((CardListParams) null, (RequestOptions) null);
  }
  /** List gift cards for an account. */
  public StripeCollection<Card> list(CardListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Card>>() {}.getType());
  }
  /** Creates a new gift card object. */
  public Card create(CardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new gift card object. */
  public Card create(CardCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/gift_cards/cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /** Retrieve a gift card by id. */
  public Card retrieve(String id, CardRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a gift card by id. */
  public Card retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CardRetrieveParams) null, options);
  }
  /** Retrieve a gift card by id. */
  public Card retrieve(String id) throws StripeException {
    return retrieve(id, (CardRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a gift card by id. */
  public Card retrieve(String id, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /** Update a gift card. */
  public Card update(String id, CardUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a gift card. */
  public Card update(String id, RequestOptions options) throws StripeException {
    return update(id, (CardUpdateParams) null, options);
  }
  /** Update a gift card. */
  public Card update(String id) throws StripeException {
    return update(id, (CardUpdateParams) null, (RequestOptions) null);
  }
  /** Update a gift card. */
  public Card update(String id, CardUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public Card validate(CardValidateParams params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }
  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public Card validate(CardValidateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/gift_cards/cards/validate";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
}
