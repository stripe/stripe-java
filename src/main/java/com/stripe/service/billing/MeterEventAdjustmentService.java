// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.billing.MeterEventAdjustment;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.MeterEventAdjustmentCreateParams;

public final class MeterEventAdjustmentService extends ApiService {
  public MeterEventAdjustmentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a billing meter event adjustment. */
  public MeterEventAdjustment create(MeterEventAdjustmentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a billing meter event adjustment. */
  public MeterEventAdjustment create(
      MeterEventAdjustmentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/meter_event_adjustments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeterEventAdjustment.class);
  }
}
