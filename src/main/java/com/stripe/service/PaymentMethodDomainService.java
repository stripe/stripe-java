// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethodDomain;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentMethodDomainCreateParams;
import com.stripe.param.PaymentMethodDomainListParams;
import com.stripe.param.PaymentMethodDomainRetrieveParams;
import com.stripe.param.PaymentMethodDomainUpdateParams;
import com.stripe.param.PaymentMethodDomainValidateParams;

public final class PaymentMethodDomainService extends ApiService {
  public PaymentMethodDomainService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists the details of existing payment method domains. */
  public StripeCollection<PaymentMethodDomain> list(PaymentMethodDomainListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists the details of existing payment method domains. */
  public StripeCollection<PaymentMethodDomain> list(RequestOptions options) throws StripeException {
    return list((PaymentMethodDomainListParams) null, options);
  }
  /** Lists the details of existing payment method domains. */
  public StripeCollection<PaymentMethodDomain> list() throws StripeException {
    return list((PaymentMethodDomainListParams) null, (RequestOptions) null);
  }
  /** Lists the details of existing payment method domains. */
  public StripeCollection<PaymentMethodDomain> list(
      PaymentMethodDomainListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_domains";
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
        .request(request, new TypeToken<StripeCollection<PaymentMethodDomain>>() {}.getType());
  }
  /** Creates a payment method domain. */
  public PaymentMethodDomain create(PaymentMethodDomainCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a payment method domain. */
  public PaymentMethodDomain create(PaymentMethodDomainCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_method_domains";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(
      String paymentMethodDomain, PaymentMethodDomainRetrieveParams params) throws StripeException {
    return retrieve(paymentMethodDomain, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(String paymentMethodDomain, RequestOptions options)
      throws StripeException {
    return retrieve(paymentMethodDomain, (PaymentMethodDomainRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(String paymentMethodDomain) throws StripeException {
    return retrieve(
        paymentMethodDomain, (PaymentMethodDomainRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(
      String paymentMethodDomain, PaymentMethodDomainRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s", ApiResource.urlEncodeId(paymentMethodDomain));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(
      String paymentMethodDomain, PaymentMethodDomainUpdateParams params) throws StripeException {
    return update(paymentMethodDomain, params, (RequestOptions) null);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(String paymentMethodDomain, RequestOptions options)
      throws StripeException {
    return update(paymentMethodDomain, (PaymentMethodDomainUpdateParams) null, options);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(String paymentMethodDomain) throws StripeException {
    return update(
        paymentMethodDomain, (PaymentMethodDomainUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(
      String paymentMethodDomain, PaymentMethodDomainUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s", ApiResource.urlEncodeId(paymentMethodDomain));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }
  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(
      String paymentMethodDomain, PaymentMethodDomainValidateParams params) throws StripeException {
    return validate(paymentMethodDomain, params, (RequestOptions) null);
  }
  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(String paymentMethodDomain, RequestOptions options)
      throws StripeException {
    return validate(paymentMethodDomain, (PaymentMethodDomainValidateParams) null, options);
  }
  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(String paymentMethodDomain) throws StripeException {
    return validate(
        paymentMethodDomain, (PaymentMethodDomainValidateParams) null, (RequestOptions) null);
  }
  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(
      String paymentMethodDomain, PaymentMethodDomainValidateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s/validate", ApiResource.urlEncodeId(paymentMethodDomain));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }
}
