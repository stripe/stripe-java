// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.billing.MeterEvent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.MeterEventCreateParams;

public final class MeterEventService extends ApiService {
  public MeterEventService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a billing meter event. */
  public MeterEvent create(MeterEventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a billing meter event. */
  public MeterEvent create(MeterEventCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meter_events";
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
