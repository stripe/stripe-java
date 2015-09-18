package com.stripe.exception;

public class CardException extends StripeException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String param;
	private String declineCode;
	private String charge;

	public CardException(String message, String requestId, String code, String param, String declineCode, String charge, Integer statusCode, Throwable e) {
		super(message, requestId, statusCode, e);
		this.code = code;
		this.param = param;
		this.declineCode = declineCode;
		this.charge = charge;
	}

	public String getCode() {
		return code;
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
