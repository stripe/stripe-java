package com.stripe.exception;

public abstract class StripeException extends Exception {

	public StripeException(String message) {
		super(message, null);
	}

	public StripeException(String message, Throwable e) {
		super(message, e);
	}

	private static final long serialVersionUID = 1L;

}
