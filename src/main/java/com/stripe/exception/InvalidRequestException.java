package com.stripe.exception;

public class InvalidRequestException extends StripeException {

	private static final long serialVersionUID = 1L;

	private final String param;
	private final Integer code;

	public InvalidRequestException(String message, String param, Integer code, Throwable e) {
		super(message, e);
		this.param = param;
		this.code = code;
	}

	public String getParam() {
		return param;
	}

	public Integer getCode() {
		return code;
	}
}
