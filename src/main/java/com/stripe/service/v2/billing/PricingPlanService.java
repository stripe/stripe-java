// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.PricingPlan;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.PricingPlanCreateParams;
import com.stripe.param.v2.billing.PricingPlanListParams;
import com.stripe.param.v2.billing.PricingPlanUpdateParams;

public final class PricingPlanService extends ApiService {
  public PricingPlanService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all PricingPlan objects. */
  public StripeCollection<PricingPlan> list(PricingPlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all PricingPlan objects. */
  public StripeCollection<PricingPlan> list(RequestOptions options) throws StripeException {
    return list((PricingPlanListParams) null, options);
  }
  /** List all PricingPlan objects. */
  public StripeCollection<PricingPlan> list() throws StripeException {
    return list((PricingPlanListParams) null, (RequestOptions) null);
  }
  /** List all PricingPlan objects. */
  public StripeCollection<PricingPlan> list(PricingPlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/pricing_plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PricingPlan>>() {}.getType());
  }
  /** Create a PricingPlan object. */
  public PricingPlan create(PricingPlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a PricingPlan object. */
  public PricingPlan create(PricingPlanCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/pricing_plans";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PricingPlan.class);
  }
  /** Retrieve a PricingPlan object. */
  public PricingPlan retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a PricingPlan object. */
  public PricingPlan retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/pricing_plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PricingPlan.class);
  }
  /** Update a PricingPlan object. */
  public PricingPlan update(String id, PricingPlanUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a PricingPlan object. */
  public PricingPlan update(String id, RequestOptions options) throws StripeException {
    return update(id, (PricingPlanUpdateParams) null, options);
  }
  /** Update a PricingPlan object. */
  public PricingPlan update(String id) throws StripeException {
    return update(id, (PricingPlanUpdateParams) null, (RequestOptions) null);
  }
  /** Update a PricingPlan object. */
  public PricingPlan update(String id, PricingPlanUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/pricing_plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PricingPlan.class);
  }

  public com.stripe.service.v2.billing.pricingplans.ComponentService components() {
    return new com.stripe.service.v2.billing.pricingplans.ComponentService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.pricingplans.VersionService versions() {
    return new com.stripe.service.v2.billing.pricingplans.VersionService(this.getResponseGetter());
  }
}
