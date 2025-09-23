// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.ClaimableSandbox;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.ClaimableSandboxCreateParams;

public final class ClaimableSandboxService extends ApiService {
  public ClaimableSandboxService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Create an anonymous, claimable sandbox. This sandbox can be prefilled with data. The response
   * will include a claim URL that allow a user to claim the account.
   */
  public ClaimableSandbox create(ClaimableSandboxCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create an anonymous, claimable sandbox. This sandbox can be prefilled with data. The response
   * will include a claim URL that allow a user to claim the account.
   */
  public ClaimableSandbox create(ClaimableSandboxCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/claimable_sandboxes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ClaimableSandbox.class);
  }
}
