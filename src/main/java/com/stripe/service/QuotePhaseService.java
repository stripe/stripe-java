// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.QuotePhase;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuotePhaseListParams;
import com.stripe.param.QuotePhaseRetrieveParams;

public final class QuotePhaseService extends ApiService {
  public QuotePhaseService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of quote phases. */
  public StripeCollection<QuotePhase> list(QuotePhaseListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of quote phases. */
  public StripeCollection<QuotePhase> list(QuotePhaseListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quote_phases";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<QuotePhase>>() {}.getType());
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase, QuotePhaseRetrieveParams params)
      throws StripeException {
    return retrieve(quotePhase, params, (RequestOptions) null);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase, RequestOptions options) throws StripeException {
    return retrieve(quotePhase, (QuotePhaseRetrieveParams) null, options);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase) throws StripeException {
    return retrieve(quotePhase, (QuotePhaseRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(
      String quotePhase, QuotePhaseRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quote_phases/%s", ApiResource.urlEncodeId(quotePhase));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, QuotePhase.class);
  }

  public com.stripe.service.QuotePhaseLineItemService lineItems() {
    return new com.stripe.service.QuotePhaseLineItemService(this.getResponseGetter());
  }
}
