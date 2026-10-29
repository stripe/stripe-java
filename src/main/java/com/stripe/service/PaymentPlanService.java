// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentPlan;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentPlanCreateParams;
import com.stripe.param.PaymentPlanListParams;
import com.stripe.param.PaymentPlanRetrieveParams;
import com.stripe.param.PaymentPlanUpdateParams;

public final class PaymentPlanService extends ApiService {
  public PaymentPlanService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of payment plans. */
  public StripeCollection<PaymentPlan> list(PaymentPlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of payment plans. */
  public StripeCollection<PaymentPlan> list(RequestOptions options) throws StripeException {
    return list((PaymentPlanListParams) null, options);
  }
  /** Returns a list of payment plans. */
  public StripeCollection<PaymentPlan> list() throws StripeException {
    return list((PaymentPlanListParams) null, (RequestOptions) null);
  }
  /** Returns a list of payment plans. */
  public StripeCollection<PaymentPlan> list(PaymentPlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PaymentPlan>>() {}.getType());
  }
  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public PaymentPlan create(PaymentPlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public PaymentPlan create(PaymentPlanCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentPlan.class);
  }
  /** Retrieves the payment plan with the given ID. */
  public PaymentPlan retrieve(String id, PaymentPlanRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the payment plan with the given ID. */
  public PaymentPlan retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentPlanRetrieveParams) null, options);
  }
  /** Retrieves the payment plan with the given ID. */
  public PaymentPlan retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentPlanRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the payment plan with the given ID. */
  public PaymentPlan retrieve(String id, PaymentPlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentPlan.class);
  }
  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(String id, PaymentPlanUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(String id, RequestOptions options) throws StripeException {
    return update(id, (PaymentPlanUpdateParams) null, options);
  }
  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(String id) throws StripeException {
    return update(id, (PaymentPlanUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(String id, PaymentPlanUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentPlan.class);
  }
}
