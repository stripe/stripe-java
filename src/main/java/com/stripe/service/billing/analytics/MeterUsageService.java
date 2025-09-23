// File generated from our OpenAPI spec
package com.stripe.service.billing.analytics;

import com.stripe.exception.StripeException;
import com.stripe.model.billing.analytics.MeterUsage;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.analytics.MeterUsageRetrieveParams;

public final class MeterUsageService extends ApiService {
  public MeterUsageService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public MeterUsage retrieve(MeterUsageRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public MeterUsage retrieve(MeterUsageRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/analytics/meter_usage";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeterUsage.class);
  }
}
