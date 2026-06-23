package com.stripe.exception.oauth;

/**
 * InvalidRequestException is raised when a code, refresh token, or grant type parameter is not
 * provided, but was required.
 */
public class InvalidRequestException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public InvalidRequestException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
