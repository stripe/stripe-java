// File generated from our OpenAPI spec
package com.stripe.service.sigma;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sigma.ScheduledQueryRunListParams;
import com.stripe.param.sigma.ScheduledQueryRunRetrieveParams;

public final class ScheduledQueryRunService extends ApiService {
  public ScheduledQueryRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of scheduled query runs. */
  public StripeCollection<ScheduledQueryRun> list(ScheduledQueryRunListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of scheduled query runs. */
  public StripeCollection<ScheduledQueryRun> list(RequestOptions options) throws StripeException {
    return list((ScheduledQueryRunListParams) null, options);
  }
  /** Returns a list of scheduled query runs. */
  public StripeCollection<ScheduledQueryRun> list() throws StripeException {
    return list((ScheduledQueryRunListParams) null, (RequestOptions) null);
  }
  /** Returns a list of scheduled query runs. */
  public StripeCollection<ScheduledQueryRun> list(
      ScheduledQueryRunListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/sigma/scheduled_query_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<ScheduledQueryRun>>() {}.getType());
  }
  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params) throws StripeException {
    return retrieve(scheduledQueryRun, params, (RequestOptions) null);
  }
  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(String scheduledQueryRun, RequestOptions options)
      throws StripeException {
    return retrieve(scheduledQueryRun, (ScheduledQueryRunRetrieveParams) null, options);
  }
  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(String scheduledQueryRun) throws StripeException {
    return retrieve(
        scheduledQueryRun, (ScheduledQueryRunRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/sigma/scheduled_query_runs/%s", ApiResource.urlEncodeId(scheduledQueryRun));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ScheduledQueryRun.class);
  }
}
