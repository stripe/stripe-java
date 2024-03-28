// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.Meter;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.MeterCreateParams;
import com.stripe.param.billing.MeterDeactivateParams;
import com.stripe.param.billing.MeterListParams;
import com.stripe.param.billing.MeterReactivateParams;
import com.stripe.param.billing.MeterRetrieveParams;
import com.stripe.param.billing.MeterUpdateParams;

public final class MeterService extends ApiService {
  public MeterService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of billing meters. */
  public StripeCollection<Meter> list(MeterListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of billing meters. */
  public StripeCollection<Meter> list(RequestOptions options) throws StripeException {
    return list((MeterListParams) null, options);
  }
  /** Retrieve a list of billing meters. */
  public StripeCollection<Meter> list() throws StripeException {
    return list((MeterListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of billing meters. */
  public StripeCollection<Meter> list(MeterListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meters";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Meter>>() {}.getType());
  }
  /** Creates a billing meter. */
  public Meter create(MeterCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a billing meter. */
  public Meter create(MeterCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/meters";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Meter.class);
  }
  /** Retrieves a billing meter given an ID. */
  public Meter retrieve(String id, MeterRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a billing meter given an ID. */
  public Meter retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (MeterRetrieveParams) null, options);
  }
  /** Retrieves a billing meter given an ID. */
  public Meter retrieve(String id) throws StripeException {
    return retrieve(id, (MeterRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a billing meter given an ID. */
  public Meter retrieve(String id, MeterRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Meter.class);
  }
  /** Updates a billing meter. */
  public Meter update(String id, MeterUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a billing meter. */
  public Meter update(String id, RequestOptions options) throws StripeException {
    return update(id, (MeterUpdateParams) null, options);
  }
  /** Updates a billing meter. */
  public Meter update(String id) throws StripeException {
    return update(id, (MeterUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a billing meter. */
  public Meter update(String id, MeterUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Meter.class);
  }
  /** Deactivates a billing meter. */
  public Meter deactivate(String id, MeterDeactivateParams params) throws StripeException {
    return deactivate(id, params, (RequestOptions) null);
  }
  /** Deactivates a billing meter. */
  public Meter deactivate(String id, RequestOptions options) throws StripeException {
    return deactivate(id, (MeterDeactivateParams) null, options);
  }
  /** Deactivates a billing meter. */
  public Meter deactivate(String id) throws StripeException {
    return deactivate(id, (MeterDeactivateParams) null, (RequestOptions) null);
  }
  /** Deactivates a billing meter. */
  public Meter deactivate(String id, MeterDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Meter.class);
  }
  /** Reactivates a billing meter. */
  public Meter reactivate(String id, MeterReactivateParams params) throws StripeException {
    return reactivate(id, params, (RequestOptions) null);
  }
  /** Reactivates a billing meter. */
  public Meter reactivate(String id, RequestOptions options) throws StripeException {
    return reactivate(id, (MeterReactivateParams) null, options);
  }
  /** Reactivates a billing meter. */
  public Meter reactivate(String id) throws StripeException {
    return reactivate(id, (MeterReactivateParams) null, (RequestOptions) null);
  }
  /** Reactivates a billing meter. */
  public Meter reactivate(String id, MeterReactivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s/reactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Meter.class);
  }

  public com.stripe.service.billing.MeterEventSummaryService eventSummaries() {
    return new com.stripe.service.billing.MeterEventSummaryService(this.getResponseGetter());
  }
}
