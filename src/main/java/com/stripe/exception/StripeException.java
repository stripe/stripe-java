package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

@Getter
public abstract class StripeException extends Exception {
  private static final long serialVersionUID = 2L;

  /** The error resource returned by Stripe's API that caused the exception. */
  // transient so the exception can be serialized, as StripeObject does not
  // implement Serializable
  transient StripeError stripeError;

  public void setStripeError(StripeError err) {
    stripeError = err;
  }

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
    if (this.getUserMessage() != null) {
      additionalInfo += "; user-message: " + this.getUserMessage();
    }
    return super.getMessage() + additionalInfo;
  }

  /**
   * Returns a description of the user facing exception
   *
   * @return a string representation of the user facing exception.
   */
  public String getUserMessage() {
    if (this.getStripeError() != null) {
      return this.getStripeError().getUserMessage();
    }
    return null;
  }

  public static StripeException parseV2Exception(
      String type,
      JsonObject body,
      int statusCode,
      String requestId,
      StripeResponseGetter responseGetter) {
    switch (type) {
        // The beginning of the section generated from our OpenAPI spec
      case "financial_account_not_open":
        return com.stripe.exception.FinancialAccountNotOpenException.parse(
            body, statusCode, requestId, responseGetter);
      case "blocked_by_stripe":
        return com.stripe.exception.BlockedByStripeException.parse(
            body, statusCode, requestId, responseGetter);
      case "already_canceled":
        return com.stripe.exception.AlreadyCanceledException.parse(
            body, statusCode, requestId, responseGetter);
      case "not_cancelable":
        return com.stripe.exception.NotCancelableException.parse(
            body, statusCode, requestId, responseGetter);
      case "insufficient_funds":
        return com.stripe.exception.InsufficientFundsException.parse(
            body, statusCode, requestId, responseGetter);
      case "quota_exceeded":
        return com.stripe.exception.QuotaExceededException.parse(
            body, statusCode, requestId, responseGetter);
      case "recipient_not_notifiable":
        return com.stripe.exception.RecipientNotNotifiableException.parse(
            body, statusCode, requestId, responseGetter);
      case "feature_not_enabled":
        return com.stripe.exception.FeatureNotEnabledException.parse(
            body, statusCode, requestId, responseGetter);
      case "invalid_payment_method":
        return com.stripe.exception.InvalidPaymentMethodException.parse(
            body, statusCode, requestId, responseGetter);
      case "controlled_by_dashboard":
        return com.stripe.exception.ControlledByDashboardException.parse(
            body, statusCode, requestId, responseGetter);
        // The end of the section generated from our OpenAPI spec
    }
    return null;
  }
}
