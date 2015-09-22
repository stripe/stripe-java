package com.stripe.exception;

public class AuthenticationException extends StripeException {


	public AuthenticationException(String message, String requestId, Integer statusCode) {
		super(message, requestId, statusCode);
	}

	private static final long serialVersionUID = 1L;

}
