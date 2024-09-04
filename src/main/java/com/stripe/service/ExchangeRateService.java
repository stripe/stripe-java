// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ExchangeRate;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ExchangeRateListParams;
import com.stripe.param.ExchangeRateRetrieveParams;

public final class ExchangeRateService extends ApiService {
  public ExchangeRateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public StripeCollection<ExchangeRate> list(ExchangeRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public StripeCollection<ExchangeRate> list(RequestOptions options) throws StripeException {
    return list((ExchangeRateListParams) null, options);
  }
  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public StripeCollection<ExchangeRate> list() throws StripeException {
    return list((ExchangeRateListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public StripeCollection<ExchangeRate> list(ExchangeRateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/exchange_rates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ExchangeRate>>() {}.getType());
  }
  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public ExchangeRate retrieve(String rateId, ExchangeRateRetrieveParams params)
      throws StripeException {
    return retrieve(rateId, params, (RequestOptions) null);
  }
  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public ExchangeRate retrieve(String rateId, RequestOptions options) throws StripeException {
    return retrieve(rateId, (ExchangeRateRetrieveParams) null, options);
  }
  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public ExchangeRate retrieve(String rateId) throws StripeException {
    return retrieve(rateId, (ExchangeRateRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public ExchangeRate retrieve(
      String rateId, ExchangeRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/exchange_rates/%s", ApiResource.urlEncodeId(rateId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ExchangeRate.class);
  }
}
