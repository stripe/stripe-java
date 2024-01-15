// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.AccountSession;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountSessionCreateParams;

public final class AccountSessionService extends ApiService {
  public AccountSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public AccountSession create(AccountSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public AccountSession create(AccountSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, AccountSession.class);
  }
}
