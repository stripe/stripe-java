// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.AccountLink;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountLinkCreateParams;

public final class AccountLinkService extends ApiService {
  public AccountLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public AccountLink create(AccountLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public AccountLink create(AccountLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, AccountLink.class);
  }
}
