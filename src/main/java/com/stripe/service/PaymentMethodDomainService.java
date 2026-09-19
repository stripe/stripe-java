// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethodDomain;
import com.stripe.model.StripeCollection;
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
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PaymentMethodDomain>>() {}.getType());
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
            options);
    return this.request(request, PaymentMethodDomain.class);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(String id, PaymentMethodDomainRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentMethodDomainRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentMethodDomainRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing payment method domain. */
  public PaymentMethodDomain retrieve(
      String id, PaymentMethodDomainRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_method_domains/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentMethodDomain.class);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(String id, PaymentMethodDomainUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(String id, RequestOptions options) throws StripeException {
    return update(id, (PaymentMethodDomainUpdateParams) null, options);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(String id) throws StripeException {
    return update(id, (PaymentMethodDomainUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(
      String id, PaymentMethodDomainUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_method_domains/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentMethodDomain.class);
  }
  /**
   * Some payment methods might require additional steps to register a domain. If the requirements
   * weren’t satisfied when the domain was created, the payment method will be inactive on the
   * domain. The payment method doesn’t appear in Elements or Embedded Checkout for this domain
   * until it is active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * registration steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(String id, PaymentMethodDomainValidateParams params)
      throws StripeException {
    return validate(id, params, (RequestOptions) null);
  }
  /**
   * Some payment methods might require additional steps to register a domain. If the requirements
   * weren’t satisfied when the domain was created, the payment method will be inactive on the
   * domain. The payment method doesn’t appear in Elements or Embedded Checkout for this domain
   * until it is active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * registration steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(String id, RequestOptions options) throws StripeException {
    return validate(id, (PaymentMethodDomainValidateParams) null, options);
  }
  /**
   * Some payment methods might require additional steps to register a domain. If the requirements
   * weren’t satisfied when the domain was created, the payment method will be inactive on the
   * domain. The payment method doesn’t appear in Elements or Embedded Checkout for this domain
   * until it is active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * registration steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(String id) throws StripeException {
    return validate(id, (PaymentMethodDomainValidateParams) null, (RequestOptions) null);
  }
  /**
   * Some payment methods might require additional steps to register a domain. If the requirements
   * weren’t satisfied when the domain was created, the payment method will be inactive on the
   * domain. The payment method doesn’t appear in Elements or Embedded Checkout for this domain
   * until it is active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * registration steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(
      String id, PaymentMethodDomainValidateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_method_domains/%s/validate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentMethodDomain.class);
  }
}
