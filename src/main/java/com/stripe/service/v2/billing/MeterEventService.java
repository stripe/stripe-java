// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEvent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.MeterEventCreateParams;

public final class MeterEventService extends ApiService {
  public MeterEventService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a meter event. Events are validated synchronously, but are processed asynchronously.
   * Supports up to 1,000 events per second in livemode. For higher rate-limits, please use meter
   * event streams instead.
   */
  public MeterEvent create(MeterEventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a meter event. Events are validated synchronously, but are processed asynchronously.
   * Supports up to 1,000 events per second in livemode. For higher rate-limits, please use meter
   * event streams instead.
   */
  public MeterEvent create(MeterEventCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/meter_events";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeterEvent.class);
  }
}
