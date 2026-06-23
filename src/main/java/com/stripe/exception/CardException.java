package com.stripe.exception;

import lombok.Getter;

@Getter
public class CardException extends StripeException {
  private static final long serialVersionUID = 2L;

  private String param;
  private String declineCode;
  private String charge;

  /** Constructs a new card exception with the specified details. */
  public CardException(
      String message,
      String requestId,
      String code,
      String param,
      String declineCode,
      String charge,
      Integer statusCode,
      Throwable e) {
    super(message, requestId, code, statusCode, e);
    this.param = param;
    this.declineCode = declineCode;
    this.charge = charge;
  }
}
