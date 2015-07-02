package com.stripe.exception;

public class APIException extends StripeException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, String requestId, Throwable e) {
		super(message, requestId, e);
	}

}
