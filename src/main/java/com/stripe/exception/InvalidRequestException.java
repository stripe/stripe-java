package com.stripe.exception;

public class InvalidRequestException extends StripeException {

	private static final long serialVersionUID = 1L;

	private final String param;

	public InvalidRequestException(String message, String param, String requestId, Throwable e) {
		super(message, requestId, e);
		this.param = param;
	}

	public String getParam() {
		return param;
	}

}
