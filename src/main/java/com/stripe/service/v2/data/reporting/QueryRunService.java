// File generated from our OpenAPI spec
package com.stripe.service.v2.data.reporting;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.data.reporting.QueryRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.reporting.QueryRunCreateParams;

public final class QueryRunService extends ApiService {
  public QueryRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a query run to execute ad-hoc SQL and returns a {@code QueryRun} object to track
   * progress and retrieve results.
   */
  public QueryRun create(QueryRunCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a query run to execute ad-hoc SQL and returns a {@code QueryRun} object to track
   * progress and retrieve results.
   */
  public QueryRun create(QueryRunCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/reporting/query_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, QueryRun.class);
  }
  /**
   * Fetches the current state and details of a previously created {@code QueryRun}. If the {@code
   * QueryRun} has succeeded, the endpoint will provide details for how to retrieve the results.
   */
  public QueryRun retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Fetches the current state and details of a previously created {@code QueryRun}. If the {@code
   * QueryRun} has succeeded, the endpoint will provide details for how to retrieve the results.
   */
  public QueryRun retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/data/reporting/query_runs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, QueryRun.class);
  }
}
