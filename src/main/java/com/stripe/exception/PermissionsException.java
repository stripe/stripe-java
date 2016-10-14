package com.stripe.exception;

public class PermissionsException extends AuthenticationException {


  public PermissionsException(String message, String requestId, Integer statusCode) {
    super(message, requestId, statusCode);
  }

  private static final long serialVersionUID = 1L;

}
