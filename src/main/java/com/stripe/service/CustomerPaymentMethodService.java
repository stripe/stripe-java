// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethod;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerPaymentMethodListParams;
import com.stripe.param.CustomerPaymentMethodRetrieveParams;

public final class CustomerPaymentMethodService extends ApiService {
  public CustomerPaymentMethodService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(String id, CustomerPaymentMethodListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CustomerPaymentMethodListParams) null, options);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(String id) throws StripeException {
    return list(id, (CustomerPaymentMethodListParams) null, (RequestOptions) null);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(
      String id, CustomerPaymentMethodListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PaymentMethod>>() {}.getType());
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(
      String customerId, String id, CustomerPaymentMethodRetrieveParams params)
      throws StripeException {
    return retrieve(customerId, id, params, (RequestOptions) null);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(String customerId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customerId, id, (CustomerPaymentMethodRetrieveParams) null, options);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(String customerId, String id) throws StripeException {
    return retrieve(
        customerId, id, (CustomerPaymentMethodRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(
      String customerId,
      String id,
      CustomerPaymentMethodRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/payment_methods/%s",
            ApiResource.urlEncodeId(customerId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentMethod.class);
  }
}
