// File generated from our OpenAPI spec
package com.stripe.service.entitlements;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.entitlements.ActiveEntitlement;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.entitlements.ActiveEntitlementListParams;

public final class ActiveEntitlementService extends ApiService {
  public ActiveEntitlementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of active entitlements for a customer. */
  public StripeCollection<ActiveEntitlement> list(ActiveEntitlementListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of active entitlements for a customer. */
  public StripeCollection<ActiveEntitlement> list(
      ActiveEntitlementListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/entitlements/active_entitlements";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<ActiveEntitlement>>() {}.getType());
  }
}
