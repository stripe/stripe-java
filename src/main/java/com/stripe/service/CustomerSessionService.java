// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerSession;
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
   * Creates a Customer Session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public CustomerSession create(CustomerSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a Customer Session object that includes a single-use client secret that you can use on
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
            options);
    return this.request(request, CustomerSession.class);
  }
  /** Serializes a CustomerSession create request into a batch job JSONL line. */
  public String serializeBatchCreate(CustomerSessionCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a CustomerSession create request into a batch job JSONL line. */
  public String serializeBatchCreate(CustomerSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
}
