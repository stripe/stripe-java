// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Cardholder;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardholderCreateParams;
import com.stripe.param.issuing.CardholderListParams;
import com.stripe.param.issuing.CardholderRetrieveParams;
import com.stripe.param.issuing.CardholderUpdateParams;

public final class CardholderService extends ApiService {
  public CardholderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Cardholder> list(CardholderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Cardholder> list(RequestOptions options) throws StripeException {
    return list((CardholderListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Cardholder> list() throws StripeException {
    return list((CardholderListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Cardholder> list(CardholderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Cardholder>>() {}.getType());
  }
  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public Cardholder create(CardholderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public Cardholder create(CardholderCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Cardholder.class);
  }
  /** Retrieves an Issuing {@code Cardholder} object. */
  public Cardholder retrieve(String cardholder, CardholderRetrieveParams params)
      throws StripeException {
    return retrieve(cardholder, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Cardholder} object. */
  public Cardholder retrieve(String cardholder, RequestOptions options) throws StripeException {
    return retrieve(cardholder, (CardholderRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Cardholder} object. */
  public Cardholder retrieve(String cardholder) throws StripeException {
    return retrieve(cardholder, (CardholderRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Cardholder} object. */
  public Cardholder retrieve(
      String cardholder, CardholderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Cardholder.class);
  }
  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(String cardholder, CardholderUpdateParams params)
      throws StripeException {
    return update(cardholder, params, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(String cardholder, RequestOptions options) throws StripeException {
    return update(cardholder, (CardholderUpdateParams) null, options);
  }
  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(String cardholder) throws StripeException {
    return update(cardholder, (CardholderUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(String cardholder, CardholderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Cardholder.class);
  }
}
