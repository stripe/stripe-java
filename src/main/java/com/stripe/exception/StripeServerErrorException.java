package com.stripe.exception;

public class StripeServerErrorException extends StripeException {

	private static final long serialVersionUID = 5973542329323958647L;

	public StripeServerErrorException() {
	}

	public StripeServerErrorException(int statusCode, String message) {
		super(statusCode, message);
	}
}
