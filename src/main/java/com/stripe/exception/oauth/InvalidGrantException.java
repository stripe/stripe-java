package com.stripe.exception.oauth;

/**
 * InvalidGrantException is raised when a specified code doesn't exist, is expired, has been used,
 * or doesn't belong to you; a refresh token doesn't exist, or doesn't belong to you; or if an API
 * key's mode (live or test) doesn't match the mode of a code or refresh token.
 */
public class InvalidGrantException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public InvalidGrantException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
