// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEventAdjustmentV2;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.MeterEventAdjustmentCreateParams;

public final class MeterEventAdjustmentService extends ApiService {
  public MeterEventAdjustmentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a meter event adjustment to cancel a previously sent meter event. */
  public MeterEventAdjustmentV2 create(MeterEventAdjustmentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a meter event adjustment to cancel a previously sent meter event. */
  public MeterEventAdjustmentV2 create(
      MeterEventAdjustmentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/meter_event_adjustments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeterEventAdjustmentV2.class);
  }
}
