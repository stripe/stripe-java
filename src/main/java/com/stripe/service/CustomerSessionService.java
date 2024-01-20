// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.CustomerSession;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerSessionCreateParams;

public final class CustomerSessionService extends ApiService {
  public CustomerSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a customer session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public CustomerSession create(CustomerSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a customer session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public CustomerSession create(CustomerSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customer_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, CustomerSession.class);
  }
}
