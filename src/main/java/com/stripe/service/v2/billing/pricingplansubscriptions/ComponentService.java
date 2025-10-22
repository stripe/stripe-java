// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.pricingplansubscriptions;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.PricingPlanSubscriptionComponents;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class ComponentService extends ApiService {
  public ComponentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a Pricing Plan Subscription's components. */
  public PricingPlanSubscriptionComponents retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Pricing Plan Subscription's components. */
  public PricingPlanSubscriptionComponents retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/pricing_plan_subscriptions/%s/components", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PricingPlanSubscriptionComponents.class);
  }
}
