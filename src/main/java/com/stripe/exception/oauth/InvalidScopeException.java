package com.stripe.exception.oauth;

/** InvalidScopeException is raised when an invalid scope parameter is provided. */
public class InvalidScopeException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public InvalidScopeException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
