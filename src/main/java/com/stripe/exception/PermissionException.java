package com.stripe.exception;

public class PermissionException extends AuthenticationException {
  private static final long serialVersionUID = 2L;

  /**
   * Constructs a new permission exception with the specified details.
   *
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public PermissionException(String message, String requestId, Integer statusCode) {
    this(message, requestId, null, statusCode);
  }

  public PermissionException(String message, String requestId, String code, Integer statusCode) {
    super(message, requestId, code, statusCode);
  }
}
