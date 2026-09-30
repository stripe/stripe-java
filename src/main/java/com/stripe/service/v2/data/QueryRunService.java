// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.data.QueryRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.QueryRunCreateParams;
import com.stripe.param.v2.data.QueryRunRetrieveParams;

public final class QueryRunService extends ApiService {
  public QueryRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Submits a SQL query for execution against a dataset and returns a {@code QueryRun} object to
   * track progress and retrieve results.
   */
  public QueryRun create(QueryRunCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Submits a SQL query for execution against a dataset and returns a {@code QueryRun} object to
   * track progress and retrieve results.
   */
  public QueryRun create(QueryRunCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/query_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, QueryRun.class);
  }
  /** Retrieves the status and results of a previously created {@code QueryRun}. */
  public QueryRun retrieve(String id, QueryRunRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the status and results of a previously created {@code QueryRun}. */
  public QueryRun retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (QueryRunRetrieveParams) null, options);
  }
  /** Retrieves the status and results of a previously created {@code QueryRun}. */
  public QueryRun retrieve(String id) throws StripeException {
    return retrieve(id, (QueryRunRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the status and results of a previously created {@code QueryRun}. */
  public QueryRun retrieve(String id, QueryRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/data/query_runs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, QueryRun.class);
  }
}
