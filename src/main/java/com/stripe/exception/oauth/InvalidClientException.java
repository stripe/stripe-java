package com.stripe.exception.oauth;

/** InvalidClientException is raised when authentication fails. */
public class InvalidClientException extends OAuthException {
  private static final long serialVersionUID = 2L;

  public InvalidClientException(
      String code, String description, String requestId, Integer statusCode, Throwable e) {
    super(code, description, requestId, statusCode, e);
  }
}
