package com.stripe.model.terminal;

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
  String object;
  String secret;

  // <editor-fold desc="create">
  /**
   * Create a connection token.
   */
  public static ConnectionToken create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a connection token.
   */
  public static ConnectionToken create(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.POST, classUrl(ConnectionToken.class), params,
            ConnectionToken.class, options);
  }
  // </editor-fold>
}
