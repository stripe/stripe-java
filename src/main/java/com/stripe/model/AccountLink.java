// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.AccountLinkCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Account Links are the means by which a Connect platform grants a connected account permission to
 * access Stripe-hosted applications, such as Connect Onboarding.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/connect/custom/hosted-onboarding">Connect
 * Onboarding</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountLink extends ApiResource {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The timestamp at which this account link will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code account_link}.
   */
  @SerializedName("object")
  String object;

  /** The URL for the account link. */
  @SerializedName("url")
  String url;

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public static AccountLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public static AccountLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_links";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            AccountLink.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public static AccountLink create(AccountLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an AccountLink object that includes a single-use Stripe URL that the platform can
   * redirect their user to in order to take them through the Connect Onboarding flow.
   */
  public static AccountLink create(AccountLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_links";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            AccountLink.class,
            options,
            ApiMode.V1);
  }
}
