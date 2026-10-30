// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.AccountSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.AccountSessionCreateParams;

public final class AccountSessionService extends ApiService {
  public AccountSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create an Account Session. */
  public AccountSession create(AccountSessionCreateParams params)
      throws StripeException, RateLimitException {
    return create(params, (RequestOptions) null);
  }
  /** Create an Account Session. */
  public AccountSession create(AccountSessionCreateParams params, RequestOptions options)
      throws StripeException, RateLimitException {
    String path = "/v2/core/account_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountSession.class);
  }
}
