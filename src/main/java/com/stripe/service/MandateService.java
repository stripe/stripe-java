// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Mandate;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.MandateRetrieveParams;

public final class MandateService extends ApiService {
  public MandateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a Mandate object. */
  public Mandate retrieve(String mandate, MandateRetrieveParams params) throws StripeException {
    return retrieve(mandate, params, (RequestOptions) null);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String mandate, RequestOptions options) throws StripeException {
    return retrieve(mandate, (MandateRetrieveParams) null, options);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String mandate) throws StripeException {
    return retrieve(mandate, (MandateRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String mandate, MandateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/mandates/%s", ApiResource.urlEncodeId(mandate));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Mandate.class);
  }
}
