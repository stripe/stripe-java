// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Plan;
import com.stripe.model.StripeCollection;
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
  public Plan delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Plan.class);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String id, PlanRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PlanRetrieveParams) null, options);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String id) throws StripeException {
    return retrieve(id, (PlanRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the plan with the given ID. */
  public Plan retrieve(String id, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Plan.class);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String id, PlanUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String id, RequestOptions options) throws StripeException {
    return update(id, (PlanUpdateParams) null, options);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String id) throws StripeException {
    return update(id, (PlanUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(String id, PlanUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
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
            options);
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
            options);
    return this.request(request, Plan.class);
  }
}
