// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.LoginLink;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountLoginLinkCreateParams;

public final class AccountLoginLinkService extends ApiService {
  public AccountLoginLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public LoginLink create(String account, AccountLoginLinkCreateParams params)
      throws StripeException {
    return create(account, params, (RequestOptions) null);
  }
  /**
   * Creates a login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public LoginLink create(String account, RequestOptions options) throws StripeException {
    return create(account, (AccountLoginLinkCreateParams) null, options);
  }
  /**
   * Creates a login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public LoginLink create(String account) throws StripeException {
    return create(account, (AccountLoginLinkCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public LoginLink create(
      String account, AccountLoginLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/login_links", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, LoginLink.class);
  }
}
