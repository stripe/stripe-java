// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

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

  /** Creates an Account Token. */
  public AccountToken create(AccountTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an Account Token. */
  public AccountToken create(RequestOptions options) throws StripeException {
    return create((AccountTokenCreateParams) null, options);
  }
  /** Creates an Account Token. */
  public AccountToken create() throws StripeException {
    return create((AccountTokenCreateParams) null, (RequestOptions) null);
  }
  /** Creates an Account Token. */
  public AccountToken create(AccountTokenCreateParams params, RequestOptions options)
      throws StripeException {
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
  public AccountToken retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an Account Token. */
  public AccountToken retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/account_tokens/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountToken.class);
  }
}
