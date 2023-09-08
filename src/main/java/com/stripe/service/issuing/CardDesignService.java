// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.CardDesign;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardDesignCreateParams;
import com.stripe.param.issuing.CardDesignListParams;
import com.stripe.param.issuing.CardDesignRetrieveParams;
import com.stripe.param.issuing.CardDesignUpdateParams;

public final class CardDesignService extends ApiService {
  public CardDesignService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardDesign> list(CardDesignListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardDesign> list(RequestOptions options) throws StripeException {
    return list((CardDesignListParams) null, options);
  }
  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardDesign> list() throws StripeException {
    return list((CardDesignListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardDesign> list(CardDesignListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_designs";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CardDesign>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Creates a card design object. */
  public CardDesign create(CardDesignCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a card design object. */
  public CardDesign create(CardDesignCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_designs";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves a card design object. */
  public CardDesign retrieve(String cardDesign, CardDesignRetrieveParams params)
      throws StripeException {
    return retrieve(cardDesign, params, (RequestOptions) null);
  }
  /** Retrieves a card design object. */
  public CardDesign retrieve(String cardDesign, RequestOptions options) throws StripeException {
    return retrieve(cardDesign, (CardDesignRetrieveParams) null, options);
  }
  /** Retrieves a card design object. */
  public CardDesign retrieve(String cardDesign) throws StripeException {
    return retrieve(cardDesign, (CardDesignRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a card design object. */
  public CardDesign retrieve(
      String cardDesign, CardDesignRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(cardDesign));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
  /** Updates a card design object. */
  public CardDesign update(String cardDesign, CardDesignUpdateParams params)
      throws StripeException {
    return update(cardDesign, params, (RequestOptions) null);
  }
  /** Updates a card design object. */
  public CardDesign update(String cardDesign, RequestOptions options) throws StripeException {
    return update(cardDesign, (CardDesignUpdateParams) null, options);
  }
  /** Updates a card design object. */
  public CardDesign update(String cardDesign) throws StripeException {
    return update(cardDesign, (CardDesignUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a card design object. */
  public CardDesign update(String cardDesign, CardDesignUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(cardDesign));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
}
