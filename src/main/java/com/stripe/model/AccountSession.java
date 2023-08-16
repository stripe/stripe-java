// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.AccountSessionCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An AccountSession allows a Connect platform to grant access to a connected account in Connect
 * embedded components.
 *
 * <p>We recommend that you create an AccountSession each time you need to display an embedded
 * component to your user. Do not save AccountSessions to your database as they expire relatively
 * quickly, and cannot be used more than once.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/connect/get-started-connect-embedded-components">Connect embedded
 * components</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountSession extends ApiResource {
  /** The ID of the account the AccountSession was created for. */
  @SerializedName("account")
  String account;

  /**
   * The client secret of this AccountSession. Used on the client to set up secure access to the
   * given {@code account}.
   *
   * <p>The client secret can be used to provide access to {@code account} from your frontend. It
   * should not be stored, logged, or exposed to anyone other than the connected account. Make sure
   * that you have TLS enabled on any page that includes the client secret.
   *
   * <p>Refer to our docs to <a
   * href="https://stripe.com/docs/connect/get-started-connect-embedded-components">setup Connect
   * embedded components</a> and learn about how {@code client_secret} should be handled.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** The timestamp at which this AccountSession will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code account_session}.
   */
  @SerializedName("object")
  String object;

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_sessions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            AccountSession.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(AccountSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(AccountSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_sessions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            AccountSession.class,
            options,
            ApiMode.V1);
  }
}
