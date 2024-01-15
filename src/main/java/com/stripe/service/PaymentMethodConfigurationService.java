// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethodConfiguration;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentMethodConfigurationCreateParams;
import com.stripe.param.PaymentMethodConfigurationListParams;
import com.stripe.param.PaymentMethodConfigurationRetrieveParams;
import com.stripe.param.PaymentMethodConfigurationUpdateParams;

public final class PaymentMethodConfigurationService extends ApiService {
  public PaymentMethodConfigurationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List payment method configurations. */
  public StripeCollection<PaymentMethodConfiguration> list(
      PaymentMethodConfigurationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List payment method configurations. */
  public StripeCollection<PaymentMethodConfiguration> list(RequestOptions options)
      throws StripeException {
    return list((PaymentMethodConfigurationListParams) null, options);
  }
  /** List payment method configurations. */
  public StripeCollection<PaymentMethodConfiguration> list() throws StripeException {
    return list((PaymentMethodConfigurationListParams) null, (RequestOptions) null);
  }
  /** List payment method configurations. */
  public StripeCollection<PaymentMethodConfiguration> list(
      PaymentMethodConfigurationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(
            request, new TypeToken<StripeCollection<PaymentMethodConfiguration>>() {}.getType());
  }
  /** Creates a payment method configuration. */
  public PaymentMethodConfiguration create(PaymentMethodConfigurationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a payment method configuration. */
  public PaymentMethodConfiguration create(RequestOptions options) throws StripeException {
    return create((PaymentMethodConfigurationCreateParams) null, options);
  }
  /** Creates a payment method configuration. */
  public PaymentMethodConfiguration create() throws StripeException {
    return create((PaymentMethodConfigurationCreateParams) null, (RequestOptions) null);
  }
  /** Creates a payment method configuration. */
  public PaymentMethodConfiguration create(
      PaymentMethodConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodConfiguration.class);
  }
  /** Retrieve payment method configuration. */
  public PaymentMethodConfiguration retrieve(
      String configuration, PaymentMethodConfigurationRetrieveParams params)
      throws StripeException {
    return retrieve(configuration, params, (RequestOptions) null);
  }
  /** Retrieve payment method configuration. */
  public PaymentMethodConfiguration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (PaymentMethodConfigurationRetrieveParams) null, options);
  }
  /** Retrieve payment method configuration. */
  public PaymentMethodConfiguration retrieve(String configuration) throws StripeException {
    return retrieve(
        configuration, (PaymentMethodConfigurationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve payment method configuration. */
  public PaymentMethodConfiguration retrieve(
      String configuration, PaymentMethodConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodConfiguration.class);
  }
  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(
      String configuration, PaymentMethodConfigurationUpdateParams params) throws StripeException {
    return update(configuration, params, (RequestOptions) null);
  }
  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(String configuration, RequestOptions options)
      throws StripeException {
    return update(configuration, (PaymentMethodConfigurationUpdateParams) null, options);
  }
  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(String configuration) throws StripeException {
    return update(
        configuration, (PaymentMethodConfigurationUpdateParams) null, (RequestOptions) null);
  }
  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(
      String configuration, PaymentMethodConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodConfiguration.class);
  }
}
