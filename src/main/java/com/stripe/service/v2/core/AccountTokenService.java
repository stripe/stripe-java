// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.AccountToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.AccountTokenCreateParams;

public final class AccountTokenService extends ApiService {
  public AccountTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Create an account token with a publishable key and pass it to the Accounts v2 API to create or
   * update an account without its data touching your server. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. In live mode, you can
   * only create account tokens with your application's publishable key. In test mode, you can
   * create account tokens with your secret key or publishable key.
   */
  public AccountToken create(AccountTokenCreateParams params)
      throws StripeException, RateLimitException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create an account token with a publishable key and pass it to the Accounts v2 API to create or
   * update an account without its data touching your server. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. In live mode, you can
   * only create account tokens with your application's publishable key. In test mode, you can
   * create account tokens with your secret key or publishable key.
   */
  public AccountToken create(RequestOptions options) throws StripeException, RateLimitException {
    return create((AccountTokenCreateParams) null, options);
  }
  /**
   * Create an account token with a publishable key and pass it to the Accounts v2 API to create or
   * update an account without its data touching your server. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. In live mode, you can
   * only create account tokens with your application's publishable key. In test mode, you can
   * create account tokens with your secret key or publishable key.
   */
  public AccountToken create() throws StripeException, RateLimitException {
    return create((AccountTokenCreateParams) null, (RequestOptions) null);
  }
  /**
   * Create an account token with a publishable key and pass it to the Accounts v2 API to create or
   * update an account without its data touching your server. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. In live mode, you can
   * only create account tokens with your application's publishable key. In test mode, you can
   * create account tokens with your secret key or publishable key.
   */
  public AccountToken create(AccountTokenCreateParams params, RequestOptions options)
      throws StripeException, RateLimitException {
    String path = "/v2/core/account_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountToken.class);
  }
  /** Retrieves an Account Token. */
  public AccountToken retrieve(String id) throws StripeException, RateLimitException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an Account Token. */
  public AccountToken retrieve(String id, RequestOptions options)
      throws StripeException, RateLimitException {
    String path = String.format("/v2/core/account_tokens/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountToken.class);
  }
}
