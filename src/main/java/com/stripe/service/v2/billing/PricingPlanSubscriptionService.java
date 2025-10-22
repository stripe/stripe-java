// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.PricingPlanSubscription;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.PricingPlanSubscriptionListParams;
import com.stripe.param.v2.billing.PricingPlanSubscriptionUpdateParams;

public final class PricingPlanSubscriptionService extends ApiService {
  public PricingPlanSubscriptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Pricing Plan Subscription objects. */
  public StripeCollection<PricingPlanSubscription> list(PricingPlanSubscriptionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Pricing Plan Subscription objects. */
  public StripeCollection<PricingPlanSubscription> list(RequestOptions options)
      throws StripeException {
    return list((PricingPlanSubscriptionListParams) null, options);
  }
  /** List all Pricing Plan Subscription objects. */
  public StripeCollection<PricingPlanSubscription> list() throws StripeException {
    return list((PricingPlanSubscriptionListParams) null, (RequestOptions) null);
  }
  /** List all Pricing Plan Subscription objects. */
  public StripeCollection<PricingPlanSubscription> list(
      PricingPlanSubscriptionListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/pricing_plan_subscriptions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PricingPlanSubscription>>() {}.getType());
  }
  /** Retrieve a Pricing Plan Subscription object. */
  public PricingPlanSubscription retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Pricing Plan Subscription object. */
  public PricingPlanSubscription retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/billing/pricing_plan_subscriptions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PricingPlanSubscription.class);
  }
  /** Update a Pricing Plan Subscription object. */
  public PricingPlanSubscription update(String id, PricingPlanSubscriptionUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a Pricing Plan Subscription object. */
  public PricingPlanSubscription update(String id, RequestOptions options) throws StripeException {
    return update(id, (PricingPlanSubscriptionUpdateParams) null, options);
  }
  /** Update a Pricing Plan Subscription object. */
  public PricingPlanSubscription update(String id) throws StripeException {
    return update(id, (PricingPlanSubscriptionUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Pricing Plan Subscription object. */
  public PricingPlanSubscription update(
      String id, PricingPlanSubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/billing/pricing_plan_subscriptions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PricingPlanSubscription.class);
  }

  public com.stripe.service.v2.billing.pricingplansubscriptions.ComponentService components() {
    return new com.stripe.service.v2.billing.pricingplansubscriptions.ComponentService(
        this.getResponseGetter());
  }
}
