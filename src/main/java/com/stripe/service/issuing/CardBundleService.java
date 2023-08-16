// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.CardBundle;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardBundleListParams;
import com.stripe.param.issuing.CardBundleRetrieveParams;

public final class CardBundleService extends ApiService {
  public CardBundleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardBundle> list(CardBundleListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardBundle> list(RequestOptions options) throws StripeException {
    return list((CardBundleListParams) null, options);
  }
  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardBundle> list() throws StripeException {
    return list((CardBundleListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public StripeCollection<CardBundle> list(CardBundleListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_bundles";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CardBundle>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Retrieves a card bundle object. */
  public CardBundle retrieve(String cardBundle, CardBundleRetrieveParams params)
      throws StripeException {
    return retrieve(cardBundle, params, (RequestOptions) null);
  }
  /** Retrieves a card bundle object. */
  public CardBundle retrieve(String cardBundle, RequestOptions options) throws StripeException {
    return retrieve(cardBundle, (CardBundleRetrieveParams) null, options);
  }
  /** Retrieves a card bundle object. */
  public CardBundle retrieve(String cardBundle) throws StripeException {
    return retrieve(cardBundle, (CardBundleRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a card bundle object. */
  public CardBundle retrieve(
      String cardBundle, CardBundleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_bundles/%s", ApiResource.urlEncodeId(cardBundle));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardBundle.class,
            options,
            ApiMode.V1);
  }
}
