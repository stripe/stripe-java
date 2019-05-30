package com.stripe.exception.oauth;

/**
 * UnsupportedResponseTypeException is raised when an unsupported response type parameter is
 * specified.
 */
public class UnsupportedResponseTypeException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public UnsupportedResponseTypeException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
