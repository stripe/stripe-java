package com.stripe.exception;

public class APIException extends StripeException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, Throwable e) {
		super(message, e);
	}

}
