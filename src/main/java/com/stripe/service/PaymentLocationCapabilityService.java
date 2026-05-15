// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLocationCapability;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLocationCapabilityUpdateParams;

public final class PaymentLocationCapabilityService extends ApiService {
  public PaymentLocationCapabilityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Updates a specified Payment Location Capability. Request or remove a payment location
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(
      String capability, PaymentLocationCapabilityUpdateParams params) throws StripeException {
    return update(capability, params, (RequestOptions) null);
  }
  /**
   * Updates a specified Payment Location Capability. Request or remove a payment location
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(
      String capability, PaymentLocationCapabilityUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(capability));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocationCapability.class);
  }
}
