package com.stripe.exception;

public class CardException extends StripeException {
  private static final long serialVersionUID = 2L;

  private String param;
  private String declineCode;
  private String charge;

  public CardException(String message, String requestId, String code, String param,
      String declineCode, String charge, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
    this.param = param;
    this.declineCode = declineCode;
    this.charge = charge;
  }

  public String getParam() {
    return param;
  }

  public String getDeclineCode() {
    return declineCode;
  }

  public String getCharge() {
    return charge;
  }
}
