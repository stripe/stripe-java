package com.stripe.exception;

public abstract class StripeException extends Exception {
  private static final long serialVersionUID = 2L;

  private String code;
  private String requestId;
  private Integer statusCode;

  /**
   * Constructs a new Stripe exception with the specified details.
   *
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public StripeException(String message, String requestId, Integer statusCode) {
    this(message, requestId, null, statusCode, null);
  }

  /**
   * Constructs a new Stripe exception with the specified details.
   *
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public StripeException(String message, String requestId, Integer statusCode, Throwable e) {
    this(message, requestId, null, statusCode, e);
  }

  public StripeException(String message, String requestId, String code, Integer statusCode) {
    this(message, requestId, code, statusCode, null);
  }

  /**
   * Constructs a new Stripe exception with the specified details.
   */
  public StripeException(String message, String requestId, String code, Integer statusCode,
      Throwable e) {
    super(message, e);
    this.code = code;
    this.requestId = requestId;
    this.statusCode = statusCode;
  }

  public String getCode() {
    return code;
  }

  public String getRequestId() {
    return requestId;
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  /**
   * Returns a description of the exception, including the HTTP status code and request ID (if
   * applicable).
   *
   * @return a string representation of the exception.
   */
  public String toString() {
    String additionalInfo = "";
    if (code != null) {
      additionalInfo += "; code: " + code;
    }
    if (requestId != null) {
      additionalInfo += "; request-id: " + requestId;
    }
    return super.toString() + additionalInfo;
  }
}
