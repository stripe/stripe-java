// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.pricingplans;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.PricingPlanVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.pricingplans.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all versions of a PricingPlan. */
  public StripeCollection<PricingPlanVersion> list(String pricingPlanId, VersionListParams params)
      throws StripeException {
    return list(pricingPlanId, params, (RequestOptions) null);
  }
  /** List all versions of a PricingPlan. */
  public StripeCollection<PricingPlanVersion> list(String pricingPlanId, RequestOptions options)
      throws StripeException {
    return list(pricingPlanId, (VersionListParams) null, options);
  }
  /** List all versions of a PricingPlan. */
  public StripeCollection<PricingPlanVersion> list(String pricingPlanId) throws StripeException {
    return list(pricingPlanId, (VersionListParams) null, (RequestOptions) null);
  }
  /** List all versions of a PricingPlan. */
  public StripeCollection<PricingPlanVersion> list(
      String pricingPlanId, VersionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/versions", ApiResource.urlEncodeId(pricingPlanId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PricingPlanVersion>>() {}.getType());
  }
  /** Retrieve a specific version of a PricingPlan. */
  public PricingPlanVersion retrieve(String pricingPlanId, String id) throws StripeException {
    return retrieve(pricingPlanId, id, (RequestOptions) null);
  }
  /** Retrieve a specific version of a PricingPlan. */
  public PricingPlanVersion retrieve(String pricingPlanId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plans/%s/versions/%s",
            ApiResource.urlEncodeId(pricingPlanId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PricingPlanVersion.class);
  }
}
