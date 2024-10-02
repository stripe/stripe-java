// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEventSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class MeterEventSessionService extends ApiService {
  public MeterEventSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a meter event session to send usage on the high-throughput meter event stream.
   * Authentication tokens are only valid for 15 minutes, so you will need to create a new meter
   * event session when your token expires.
   */
  public MeterEventSession create() throws StripeException {
    return create((RequestOptions) null);
  }
  /**
   * Creates a meter event session to send usage on the high-throughput meter event stream.
   * Authentication tokens are only valid for 15 minutes, so you will need to create a new meter
   * event session when your token expires.
   */
  public MeterEventSession create(RequestOptions options) throws StripeException {
    String path = "/v2/billing/meter_event_session";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, MeterEventSession.class);
  }
}
