// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEventV2;
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

  /** Creates a meter event. Validates the event synchronously. */
  public MeterEventV2 create(MeterEventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a meter event. Validates the event synchronously. */
  public MeterEventV2 create(MeterEventCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/meter_events";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeterEventV2.class);
  }
}
