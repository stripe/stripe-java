package com.stripe.exception;

public class StripeUnauthorizedException extends StripeException {

	private static final long serialVersionUID = 3666691064846302652L;

	public StripeUnauthorizedException() {
	}

	public StripeUnauthorizedException(int statusCode, String message) {
		super(statusCode, message);
	}
}
