// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.LoginLink;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.LoginLinkCreateParams;

public final class LoginLinkService extends ApiService {
  public LoginLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public LoginLink create(String account, LoginLinkCreateParams params) throws StripeException {
    return create(account, params, (RequestOptions) null);
  }
  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public LoginLink create(String account, RequestOptions options) throws StripeException {
    return create(account, (LoginLinkCreateParams) null, options);
  }
  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public LoginLink create(String account) throws StripeException {
    return create(account, (LoginLinkCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public LoginLink create(String account, LoginLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/login_links", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            LoginLink.class,
            options,
            ApiMode.V1);
  }
}
