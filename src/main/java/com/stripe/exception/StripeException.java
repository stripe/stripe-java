package com.stripe.exception;

import com.stripe.model.StripeError;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class StripeException extends Exception {
  private static final long serialVersionUID = 2L;

  /** The error resource returned by Stripe's API that caused the exception. */
  // transient so the exception can be serialized, as StripeObject does not
  // implement Serializable
  @Setter transient StripeError stripeError;

  /**
   * Returns the error code of the response that triggered this exception. For {@link ApiException}
   * the error code will be equal to {@link StripeError#getCode()}.
   *
   * @return the string representation of the error code.
   */
  private String code;

  /**
   * Returns the request ID of the request that triggered this exception.
   *
   * @return the request ID.
   */
  private String requestId;

  /**
   * Returns the status code of the response that triggered this exception.
   *
   * @return the status code.
   */
  private Integer statusCode;

  protected StripeException(String message, String requestId, String code, Integer statusCode) {
    this(message, requestId, code, statusCode, null);
  }

  /** Constructs a new Stripe exception with the specified details. */
  protected StripeException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, e);
    this.code = code;
    this.requestId = requestId;
    this.statusCode = statusCode;
  }

  /**
   * Returns a description of the exception, including the HTTP status code and request ID (if
   * applicable).
   *
   * @return a string representation of the exception.
   */
  @Override
  public String getMessage() {
    String additionalInfo = "";
    if (code != null) {
      additionalInfo += "; code: " + code;
    }
    if (requestId != null) {
      additionalInfo += "; request-id: " + requestId;
    }
    return super.getMessage() + additionalInfo;
  }

  /**
   * Returns a description of the user facing exception
   *
   * @return a string representation of the user facing exception.
   */
  public String getUserMessage() {
    return super.getMessage();
  }
}
