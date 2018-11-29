package com.stripe.model.terminal;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ConnectionToken extends ApiResource {
  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** Your application should pass this token to the Stripe Terminal SDK. */
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/connection_tokens");
    return request(ApiResource.RequestMethod.POST, url, params, ConnectionToken.class, options);
  }
}
