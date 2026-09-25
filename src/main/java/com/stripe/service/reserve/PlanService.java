// File generated from our OpenAPI spec
package com.stripe.service.reserve;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.reserve.Plan;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reserve.PlanListParams;
import com.stripe.param.reserve.PlanRetrieveParams;

public final class PlanService extends ApiService {
  public PlanService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of ReservePlans previously created. The ReservePlans are returned in sorted
   * order, with the most recent ReservePlans appearing first.
   */
  public StripeCollection<Plan> list(PlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of ReservePlans previously created. The ReservePlans are returned in sorted
   * order, with the most recent ReservePlans appearing first.
   */
  public StripeCollection<Plan> list(RequestOptions options) throws StripeException {
    return list((PlanListParams) null, options);
  }
  /**
   * Returns a list of ReservePlans previously created. The ReservePlans are returned in sorted
   * order, with the most recent ReservePlans appearing first.
   */
  public StripeCollection<Plan> list() throws StripeException {
    return list((PlanListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of ReservePlans previously created. The ReservePlans are returned in sorted
   * order, with the most recent ReservePlans appearing first.
   */
  public StripeCollection<Plan> list(PlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reserve/plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Plan>>() {}.getType());
  }
  /** Retrieve a ReservePlan. */
  public Plan retrieve(String id, PlanRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a ReservePlan. */
  public Plan retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PlanRetrieveParams) null, options);
  }
  /** Retrieve a ReservePlan. */
  public Plan retrieve(String id) throws StripeException {
    return retrieve(id, (PlanRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a ReservePlan. */
  public Plan retrieve(String id, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Plan.class);
  }
}
