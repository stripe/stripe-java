package com.stripe.exception.oauth;

/**
 * UnsupportedGrantTypeException is raised when an unuspported grant type parameter is specified.
 */
public class UnsupportedGrantTypeException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public UnsupportedGrantTypeException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
