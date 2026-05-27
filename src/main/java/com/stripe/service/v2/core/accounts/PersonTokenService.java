// File generated from our OpenAPI spec
package com.stripe.service.v2.core.accounts;

import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.AccountPersonToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.accounts.PersonTokenCreateParams;

public final class PersonTokenService extends ApiService {
  public PersonTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a single-use token that represents the details for a person. Use this when you create
   * or update persons associated with an Account v2. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. You can only create
   * person tokens with your application's publishable key and in live mode. You can use your
   * application's secret key to create person tokens only in test mode.
   */
  public AccountPersonToken create(String accountId, PersonTokenCreateParams params)
      throws StripeException, RateLimitException {
    return create(accountId, params, (RequestOptions) null);
  }
  /**
   * Creates a single-use token that represents the details for a person. Use this when you create
   * or update persons associated with an Account v2. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. You can only create
   * person tokens with your application's publishable key and in live mode. You can use your
   * application's secret key to create person tokens only in test mode.
   */
  public AccountPersonToken create(String accountId, RequestOptions options)
      throws StripeException, RateLimitException {
    return create(accountId, (PersonTokenCreateParams) null, options);
  }
  /**
   * Creates a single-use token that represents the details for a person. Use this when you create
   * or update persons associated with an Account v2. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. You can only create
   * person tokens with your application's publishable key and in live mode. You can use your
   * application's secret key to create person tokens only in test mode.
   */
  public AccountPersonToken create(String accountId) throws StripeException, RateLimitException {
    return create(accountId, (PersonTokenCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a single-use token that represents the details for a person. Use this when you create
   * or update persons associated with an Account v2. Learn more about <a
   * href="https://docs.stripe.com/connect/account-tokens">account tokens</a>. You can only create
   * person tokens with your application's publishable key and in live mode. You can use your
   * application's secret key to create person tokens only in test mode.
   */
  public AccountPersonToken create(
      String accountId, PersonTokenCreateParams params, RequestOptions options)
      throws StripeException, RateLimitException {
    String path =
        String.format("/v2/core/accounts/%s/person_tokens", ApiResource.urlEncodeId(accountId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountPersonToken.class);
  }
  /** Retrieves a Person Token associated with an Account. */
  public AccountPersonToken retrieve(String accountId, String id)
      throws StripeException, RateLimitException {
    return retrieve(accountId, id, (RequestOptions) null);
  }
  /** Retrieves a Person Token associated with an Account. */
  public AccountPersonToken retrieve(String accountId, String id, RequestOptions options)
      throws StripeException, RateLimitException {
    String path =
        String.format(
            "/v2/core/accounts/%s/person_tokens/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountPersonToken.class);
  }
}
