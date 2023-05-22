// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.ConnectionTokenCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Connection Token is used by the Stripe Terminal SDK to connect to a reader.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/terminal/fleet/locations">Fleet management</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ConnectionToken extends ApiResource {
  /**
   * The id of the location that this connection token is scoped to. Note that location scoping only
   * applies to internet-connected readers. For more details, see <a
   * href="https://stripe.com/docs/terminal/fleet/locations#connection-tokens">the docs on scoping
   * connection tokens</a>.
   */
  @SerializedName("location")
  String location;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code terminal.connection_token}.
   */
  @SerializedName("object")
  String object;

  /** Your application should pass this token to the Stripe Terminal SDK. */
  @SerializedName("secret")
  String secret;

  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public static ConnectionToken create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public static ConnectionToken create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/connection_tokens");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ConnectionToken.class, options);
  }

  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public static ConnectionToken create(ConnectionTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public static ConnectionToken create(ConnectionTokenCreateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/connection_tokens");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ConnectionToken.class, options);
  }
}
