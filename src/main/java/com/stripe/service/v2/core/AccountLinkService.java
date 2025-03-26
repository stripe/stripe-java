// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.AccountLink;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.AccountLinkCreateParams;

public final class AccountLinkService extends ApiService {
  public AccountLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the merchant can
   * redirect their user to in order to take them to a Stripe-hosted application such as Recipient
   * Onboarding.
   */
  public AccountLink create(AccountLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the merchant can
   * redirect their user to in order to take them to a Stripe-hosted application such as Recipient
   * Onboarding.
   */
  public AccountLink create(AccountLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/account_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountLink.class);
  }
}
