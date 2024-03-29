// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.LoginLinkCreateOnAccountParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Login Links are single-use login link for an Express account to access their Stripe dashboard.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LoginLink extends ApiResource {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code login_link}.
   */
  @SerializedName("object")
  String object;

  /** The URL for the login link. */
  @SerializedName("url")
  String url;

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(String account) throws StripeException {
    return createOnAccount(account, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(String account, RequestOptions options)
      throws StripeException {
    return createOnAccount(account, (Map<String, Object>) null, options);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(String account, Map<String, Object> params)
      throws StripeException {
    return createOnAccount(account, params, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(
      String account, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/login_links", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, LoginLink.class);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(String account, LoginLinkCreateOnAccountParams params)
      throws StripeException {
    return createOnAccount(account, params, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for an Express account to access their Stripe dashboard.
   *
   * <p><strong>You may only create login links for <a
   * href="https://stripe.com/docs/connect/express-accounts">Express accounts</a> connected to your
   * platform</strong>.
   */
  public static LoginLink createOnAccount(
      String account, LoginLinkCreateOnAccountParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/login_links", ApiResource.urlEncodeId(account));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, LoginLink.class);
  }
}
