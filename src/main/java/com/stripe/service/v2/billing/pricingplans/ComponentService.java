// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.pricingplans;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.PricingPlanComponent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.pricingplans.ComponentCreateParams;
import com.stripe.param.v2.billing.pricingplans.ComponentListParams;
import com.stripe.param.v2.billing.pricingplans.ComponentUpdateParams;

public final class ComponentService extends ApiService {
  public ComponentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Pricing Plan Component objects for a Pricing Plan. */
  public StripeCollection<PricingPlanComponent> list(
      String pricingPlanId, ComponentListParams params) throws StripeException {
    return list(pricingPlanId, params, (RequestOptions) null);
  }
  /** List all Pricing Plan Component objects for a Pricing Plan. */
  public StripeCollection<PricingPlanComponent> list(String pricingPlanId, RequestOptions options)
      throws StripeException {
    return list(pricingPlanId, (ComponentListParams) null, options);
  }
  /** List all Pricing Plan Component objects for a Pricing Plan. */
  public StripeCollection<PricingPlanComponent> list(String pricingPlanId) throws StripeException {
    return list(pricingPlanId, (ComponentListParams) null, (RequestOptions) null);
  }
  /** List all Pricing Plan Component objects for a Pricing Plan. */
  public StripeCollection<PricingPlanComponent> list(
      String pricingPlanId, ComponentListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/components", ApiResource.urlEncodeId(pricingPlanId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PricingPlanComponent>>() {}.getType());
  }
  /** Create a Pricing Plan Component object. */
  public PricingPlanComponent create(String pricingPlanId, ComponentCreateParams params)
      throws StripeException {
    return create(pricingPlanId, params, (RequestOptions) null);
  }
  /** Create a Pricing Plan Component object. */
  public PricingPlanComponent create(
      String pricingPlanId, ComponentCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/components", ApiResource.urlEncodeId(pricingPlanId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PricingPlanComponent.class);
  }
  /** Remove a Pricing Plan Component from the latest version of a Pricing Plan. */
  public PricingPlanComponent delete(String pricingPlanId, String id) throws StripeException {
    return delete(pricingPlanId, id, (RequestOptions) null);
  }
  /** Remove a Pricing Plan Component from the latest version of a Pricing Plan. */
  public PricingPlanComponent delete(String pricingPlanId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/components/%s",
            ApiResource.urlEncodeId(pricingPlanId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, PricingPlanComponent.class);
  }
  /** Retrieve a Pricing Plan Component object. */
  public PricingPlanComponent retrieve(String pricingPlanId, String id) throws StripeException {
    return retrieve(pricingPlanId, id, (RequestOptions) null);
  }
  /** Retrieve a Pricing Plan Component object. */
  public PricingPlanComponent retrieve(String pricingPlanId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/components/%s",
            ApiResource.urlEncodeId(pricingPlanId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PricingPlanComponent.class);
  }
  /** Update a Pricing Plan Component object. */
  public PricingPlanComponent update(String pricingPlanId, String id, ComponentUpdateParams params)
      throws StripeException {
    return update(pricingPlanId, id, params, (RequestOptions) null);
  }
  /** Update a Pricing Plan Component object. */
  public PricingPlanComponent update(String pricingPlanId, String id, RequestOptions options)
      throws StripeException {
    return update(pricingPlanId, id, (ComponentUpdateParams) null, options);
  }
  /** Update a Pricing Plan Component object. */
  public PricingPlanComponent update(String pricingPlanId, String id) throws StripeException {
    return update(pricingPlanId, id, (ComponentUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Pricing Plan Component object. */
  public PricingPlanComponent update(
      String pricingPlanId, String id, ComponentUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/components/%s",
            ApiResource.urlEncodeId(pricingPlanId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PricingPlanComponent.class);
  }
}
