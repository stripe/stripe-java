package com.stripe.sdk.exception;

public class StripeNotFoundException extends StripeException {

	private static final long serialVersionUID = 7327544733869018763L;

	public StripeNotFoundException() {
	}

	public StripeNotFoundException(int statusCode, String message) {
		super(statusCode, message);
	}
}
