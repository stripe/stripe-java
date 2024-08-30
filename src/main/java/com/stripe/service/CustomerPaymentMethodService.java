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
  public StripeCollection<PaymentMethod> list(
      String customer, CustomerPaymentMethodListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerPaymentMethodListParams) null, options);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(String customer) throws StripeException {
    return list(customer, (CustomerPaymentMethodListParams) null, (RequestOptions) null);
  }
  /** Returns a list of PaymentMethods for a given Customer. */
  public StripeCollection<PaymentMethod> list(
      String customer, CustomerPaymentMethodListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(customer));
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
      String customer, String paymentMethod, CustomerPaymentMethodRetrieveParams params)
      throws StripeException {
    return retrieve(customer, paymentMethod, params, (RequestOptions) null);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(String customer, String paymentMethod, RequestOptions options)
      throws StripeException {
    return retrieve(customer, paymentMethod, (CustomerPaymentMethodRetrieveParams) null, options);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(String customer, String paymentMethod) throws StripeException {
    return retrieve(
        customer, paymentMethod, (CustomerPaymentMethodRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrieve(
      String customer,
      String paymentMethod,
      CustomerPaymentMethodRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/payment_methods/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(paymentMethod));
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
