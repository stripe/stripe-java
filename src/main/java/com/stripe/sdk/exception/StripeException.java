package com.stripe.sdk.exception;

public class StripeException extends Exception {

	private static final long serialVersionUID = -6969455531408365244L;
	protected int statusCode;
	protected String message;

	public StripeException() {
	}

	public StripeException(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
