// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplePayDomain;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ApplePayDomainCreateParams;
import com.stripe.param.ApplePayDomainListParams;
import com.stripe.param.ApplePayDomainRetrieveParams;

public final class ApplePayDomainService extends ApiService {
  public ApplePayDomainService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List apple pay domains. */
  public StripeCollection<ApplePayDomain> list(ApplePayDomainListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List apple pay domains. */
  public StripeCollection<ApplePayDomain> list(RequestOptions options) throws StripeException {
    return list((ApplePayDomainListParams) null, options);
  }
  /** List apple pay domains. */
  public StripeCollection<ApplePayDomain> list() throws StripeException {
    return list((ApplePayDomainListParams) null, (RequestOptions) null);
  }
  /** List apple pay domains. */
  public StripeCollection<ApplePayDomain> list(
      ApplePayDomainListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apple_pay/domains";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<ApplePayDomain>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Create an apple pay domain. */
  public ApplePayDomain create(ApplePayDomainCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create an apple pay domain. */
  public ApplePayDomain create(ApplePayDomainCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apple_pay/domains";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            ApplePayDomain.class,
            options,
            ApiMode.V1);
  }
  /** Retrieve an apple pay domain. */
  public ApplePayDomain retrieve(String domain, ApplePayDomainRetrieveParams params)
      throws StripeException {
    return retrieve(domain, params, (RequestOptions) null);
  }
  /** Retrieve an apple pay domain. */
  public ApplePayDomain retrieve(String domain, RequestOptions options) throws StripeException {
    return retrieve(domain, (ApplePayDomainRetrieveParams) null, options);
  }
  /** Retrieve an apple pay domain. */
  public ApplePayDomain retrieve(String domain) throws StripeException {
    return retrieve(domain, (ApplePayDomainRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve an apple pay domain. */
  public ApplePayDomain retrieve(
      String domain, ApplePayDomainRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apple_pay/domains/%s", ApiResource.urlEncodeId(domain));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ApplePayDomain.class,
            options,
            ApiMode.V1);
  }
  /** Delete an apple pay domain. */
  public ApplePayDomain delete(String domain) throws StripeException {
    return delete(domain, (RequestOptions) null);
  }
  /** Delete an apple pay domain. */
  public ApplePayDomain delete(String domain, RequestOptions options) throws StripeException {
    String path = String.format("/v1/apple_pay/domains/%s", ApiResource.urlEncodeId(domain));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            null,
            ApplePayDomain.class,
            options,
            ApiMode.V1);
  }
}
