// File generated from our OpenAPI spec
package com.stripe.service.entitlements;

import com.stripe.exception.StripeException;
import com.stripe.model.entitlements.Event;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.entitlements.EventCreateParams;

public final class EventService extends ApiService {
  public EventService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public Event create(EventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public Event create(EventCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/entitlements/events";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Event.class);
  }
}
