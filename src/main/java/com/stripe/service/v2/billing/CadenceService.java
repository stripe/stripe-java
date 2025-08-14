// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.Cadence;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.CadenceCancelParams;
import com.stripe.param.v2.billing.CadenceCreateParams;
import com.stripe.param.v2.billing.CadenceListParams;
import com.stripe.param.v2.billing.CadenceRetrieveParams;
import com.stripe.param.v2.billing.CadenceUpdateParams;

public final class CadenceService extends ApiService {
  public CadenceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all the billing Cadences. */
  public StripeCollection<Cadence> list(CadenceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all the billing Cadences. */
  public StripeCollection<Cadence> list(RequestOptions options) throws StripeException {
    return list((CadenceListParams) null, options);
  }
  /** List all the billing Cadences. */
  public StripeCollection<Cadence> list() throws StripeException {
    return list((CadenceListParams) null, (RequestOptions) null);
  }
  /** List all the billing Cadences. */
  public StripeCollection<Cadence> list(CadenceListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/cadences";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Cadence>>() {}.getType());
  }
  /** Create a billing Cadence object. */
  public Cadence create(CadenceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a billing Cadence object. */
  public Cadence create(CadenceCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/cadences";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Cadence.class);
  }
  /** Retrieve a billing Cadence object. */
  public Cadence retrieve(String id, CadenceRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a billing Cadence object. */
  public Cadence retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CadenceRetrieveParams) null, options);
  }
  /** Retrieve a billing Cadence object. */
  public Cadence retrieve(String id) throws StripeException {
    return retrieve(id, (CadenceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a billing Cadence object. */
  public Cadence retrieve(String id, CadenceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/cadences/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Cadence.class);
  }
  /** Update a billing Cadence object. */
  public Cadence update(String id, CadenceUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a billing Cadence object. */
  public Cadence update(String id, RequestOptions options) throws StripeException {
    return update(id, (CadenceUpdateParams) null, options);
  }
  /** Update a billing Cadence object. */
  public Cadence update(String id) throws StripeException {
    return update(id, (CadenceUpdateParams) null, (RequestOptions) null);
  }
  /** Update a billing Cadence object. */
  public Cadence update(String id, CadenceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/cadences/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Cadence.class);
  }
  /** Cancel the billing cadence. */
  public Cadence cancel(String id, CadenceCancelParams params) throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancel the billing cadence. */
  public Cadence cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (CadenceCancelParams) null, options);
  }
  /** Cancel the billing cadence. */
  public Cadence cancel(String id) throws StripeException {
    return cancel(id, (CadenceCancelParams) null, (RequestOptions) null);
  }
  /** Cancel the billing cadence. */
  public Cadence cancel(String id, CadenceCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/cadences/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Cadence.class);
  }
}
