// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.FxQuote;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FxQuoteCreateParams;
import com.stripe.param.FxQuoteListParams;
import com.stripe.param.FxQuoteRetrieveParams;

public final class FxQuoteService extends ApiService {
  public FxQuoteService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public StripeCollection<FxQuote> list(FxQuoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public StripeCollection<FxQuote> list(RequestOptions options) throws StripeException {
    return list((FxQuoteListParams) null, options);
  }
  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public StripeCollection<FxQuote> list() throws StripeException {
    return list((FxQuoteListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public StripeCollection<FxQuote> list(FxQuoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fx_quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FxQuote>>() {}.getType());
  }
  /** Creates an FX Quote object. */
  public FxQuote create(FxQuoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an FX Quote object. */
  public FxQuote create(FxQuoteCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/fx_quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FxQuote.class);
  }
  /** Retrieve an FX Quote object. */
  public FxQuote retrieve(String id, FxQuoteRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve an FX Quote object. */
  public FxQuote retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FxQuoteRetrieveParams) null, options);
  }
  /** Retrieve an FX Quote object. */
  public FxQuote retrieve(String id) throws StripeException {
    return retrieve(id, (FxQuoteRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve an FX Quote object. */
  public FxQuote retrieve(String id, FxQuoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fx_quotes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FxQuote.class);
  }
}
