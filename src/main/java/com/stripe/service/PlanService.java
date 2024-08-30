// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Plan;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PlanCreateParams;
import com.stripe.param.PlanListParams;
import com.stripe.param.PlanRetrieveParams;
import com.stripe.param.PlanUpdateParams;

public final class PlanService extends ApiService {
  public PlanService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(String plan) throws StripeException {
    return delete(plan, (RequestOptions) null);
  }
  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(String plan, RequestOptions options) throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, Plan.class);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String plan, PlanRetrieveParams params) throws StripeException {
    return retrieve(plan, params, (RequestOptions) null);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String plan, RequestOptions options) throws StripeException {
    return retrieve(plan, (PlanRetrieveParams) null, options);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String plan) throws StripeException {
    return retrieve(plan, (PlanRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String plan, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Plan.class);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String plan, PlanUpdateParams params) throws StripeException {
    return update(plan, params, (RequestOptions) null);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String plan, RequestOptions options) throws StripeException {
    return update(plan, (PlanUpdateParams) null, options);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String plan) throws StripeException {
    return update(plan, (PlanUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String plan, PlanUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Plan.class);
  }
  /** Returns a list of your plans. */
  public StripeCollection<Plan> list(PlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your plans. */
  public StripeCollection<Plan> list(RequestOptions options) throws StripeException {
    return list((PlanListParams) null, options);
  }
  /** Returns a list of your plans. */
  public StripeCollection<Plan> list() throws StripeException {
    return list((PlanListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your plans. */
  public StripeCollection<Plan> list(PlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Plan>>() {}.getType());
  }
  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public Plan create(PlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public Plan create(PlanCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Plan.class);
  }
}
