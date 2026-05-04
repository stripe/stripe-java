// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLocation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLocationCreateParams;

public final class PaymentLocationService extends ApiService {
  public PaymentLocationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a Payment Location. */
  public PaymentLocation create(PaymentLocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Payment Location. */
  public PaymentLocation create(PaymentLocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocation.class);
  }
}
