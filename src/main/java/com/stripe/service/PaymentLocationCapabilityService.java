// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLocationCapability;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLocationCapabilityListParams;
import com.stripe.param.PaymentLocationCapabilityRetrieveParams;
import com.stripe.param.PaymentLocationCapabilityUpdateParams;

public final class PaymentLocationCapabilityService extends ApiService {
  public PaymentLocationCapabilityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all payment location capabilities associated with the payment location. */
  public StripeCollection<PaymentLocationCapability> list(
      PaymentLocationCapabilityListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all payment location capabilities associated with the payment location. */
  public StripeCollection<PaymentLocationCapability> list(
      PaymentLocationCapabilityListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_location_capabilities";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PaymentLocationCapability>>() {}.getType());
  }
  /** Retrieves a {@code payment_location} capability. */
  public PaymentLocationCapability retrieve(
      String capability, PaymentLocationCapabilityRetrieveParams params) throws StripeException {
    return retrieve(capability, params, (RequestOptions) null);
  }
  /** Retrieves a {@code payment_location} capability. */
  public PaymentLocationCapability retrieve(
      String capability, PaymentLocationCapabilityRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(capability));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocationCapability.class);
  }
  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(
      String capability, PaymentLocationCapabilityUpdateParams params) throws StripeException {
    return update(capability, params, (RequestOptions) null);
  }
  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
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
