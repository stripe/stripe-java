package com.stripe.exception;

public class AuthenticationException extends StripeException {


	public AuthenticationException(String message, String requestId) {
		super(message, requestId);
	}

	private static final long serialVersionUID = 1L;

}
