// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Mandate;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.MandateListParams;
import com.stripe.param.MandateRetrieveParams;

public final class MandateService extends ApiService {
  public MandateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of Mandates for a given PaymentMethod. */
  public StripeCollection<Mandate> list(MandateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of Mandates for a given PaymentMethod. */
  public StripeCollection<Mandate> list(MandateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Mandate>>() {}.getType());
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String id, MandateRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (MandateRetrieveParams) null, options);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String id) throws StripeException {
    return retrieve(id, (MandateRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Mandate object. */
  public Mandate retrieve(String id, MandateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/mandates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Mandate.class);
  }
}
