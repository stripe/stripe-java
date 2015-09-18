package com.stripe.exception;

public class APIException extends StripeException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, String requestId, Integer statusCode, Throwable e) {
		super(message, requestId, statusCode, e);
	}

}
