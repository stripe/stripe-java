// File generated from our OpenAPI spec
package com.stripe.service.v2.data.analytics;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.data.analytics.MetricQueryResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.analytics.MetricQueryCreateParams;

public final class MetricQueryService extends ApiService {
  public MetricQueryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Run a synchronous metric query against one or more metrics within the same metric namespace.
   */
  public MetricQueryResult create(MetricQueryCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Run a synchronous metric query against one or more metrics within the same metric namespace.
   */
  public MetricQueryResult create(MetricQueryCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/analytics/metric_query";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MetricQueryResult.class);
  }
}
