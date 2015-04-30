package com.stripe.exception;

public class CardException extends StripeException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String param;
	private String declineCode;

	public CardException(String message, String code, String param, String declineCode, Throwable e) {
		super(message, e);
		this.code = code;
		this.param = param;
		this.declineCode = declineCode;
	}
	
	public CardException(String message, String code, String param, Throwable e) {
		super(message, e);
		this.code = code;
		this.param = param;
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
}
