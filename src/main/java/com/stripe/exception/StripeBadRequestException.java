package com.stripe.exception;

public class StripeBadRequestException extends StripeException {

	private static final long serialVersionUID = -769959596755582241L;

	public StripeBadRequestException() {

	}

	public StripeBadRequestException(int statusCode, String message) {
		super(statusCode, message);
	}
}
