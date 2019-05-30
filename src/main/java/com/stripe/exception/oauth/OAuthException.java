package com.stripe.exception.oauth;

import com.stripe.exception.StripeException;
import com.stripe.model.oauth.OAuthError;
import lombok.Getter;
import lombok.Setter;

/** Base parent class for all OAuth exceptions. */
@Getter
public class OAuthException extends StripeException {
  private static final long serialVersionUID = 2L;

  /** The error resource returned by Stripe's OAuth API that caused the exception. */
  @Setter OAuthError oauthError;

  public OAuthException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(description, requestId, code, statusCode, e);
  }
}
