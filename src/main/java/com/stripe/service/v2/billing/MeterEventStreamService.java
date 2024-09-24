// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.exception.TemporarySessionExpiredException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.MeterEventStreamCreateParams;
import com.stripe.v2.EmptyStripeObject;

public final class MeterEventStreamService extends ApiService {
  public MeterEventStreamService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Sends a meter event for asynchronous processing. Supports higher rate limits. Requires a meter
   * event session for authentication.
   */
  public void create(MeterEventStreamCreateParams params)
      throws StripeException, TemporarySessionExpiredException {
    create(params, (RequestOptions) null);
  }
  /**
   * Sends a meter event for asynchronous processing. Supports higher rate limits. Requires a meter
   * event session for authentication.
   */
  public void create(MeterEventStreamCreateParams params, RequestOptions options)
      throws StripeException, TemporarySessionExpiredException {
    String path = "/v2/billing/meter_event_stream";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.METER_EVENTS,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    this.request(request, EmptyStripeObject.class);
  }
}
