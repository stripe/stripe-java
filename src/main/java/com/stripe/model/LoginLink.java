// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
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
 * Login Links are single-use URLs for a connected account to access the Express Dashboard. The
 * connected account's <a
 * href="https://stripe.com/api/accounts/object#account_object-controller-stripe_dashboard-type">account.controller.stripe_dashboard.type</a>
 * must be {@code express} to have access to the Express Dashboard.
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
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public static LoginLink createOnAccount(String account) throws StripeException {
    return createOnAccount(account, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public static LoginLink createOnAccount(String account, RequestOptions options)
      throws StripeException {
    return createOnAccount(account, (Map<String, Object>) null, options);
  }

  /**
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public static LoginLink createOnAccount(String account, Map<String, Object> params)
      throws StripeException {
    return createOnAccount(account, params, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public static LoginLink createOnAccount(
      String account, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/login_links", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, LoginLink.class);
  }

  /**
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
   */
  public static LoginLink createOnAccount(String account, LoginLinkCreateOnAccountParams params)
      throws StripeException {
    return createOnAccount(account, params, (RequestOptions) null);
  }

  /**
   * Creates a single-use login link for a connected account to access the Express Dashboard.
   *
   * <p><strong>You can only create login links for accounts that use the <a
   * href="https://stripe.com/connect/express-dashboard">Express Dashboard</a> and are connected to
   * your platform</strong>.
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
            options);
    return getGlobalResponseGetter().request(request, LoginLink.class);
  }
}
