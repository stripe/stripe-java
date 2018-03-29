package com.stripe.exception.oauth;

import com.stripe.exception.StripeException;

/**
 * Base parent class for all OAuth exceptions.
 */
public class OAuthException extends StripeException {
  private static final long serialVersionUID = 2L;

  public OAuthException(String code, String description, String requestId, Integer statusCode,
      Throwable e) {
    super(description, requestId, code, statusCode, e);
  }
}
