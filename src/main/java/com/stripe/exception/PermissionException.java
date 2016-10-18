package com.stripe.exception;

public class PermissionException extends AuthenticationException {
	private static final long serialVersionUID = 1L;

  public PermissionException(String message, String requestId, Integer statusCode) {
    super(message, requestId, statusCode);
  }
}
