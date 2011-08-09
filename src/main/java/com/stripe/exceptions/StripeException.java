package com.stripe.exceptions;

public class StripeException extends Exception {
	protected int statusCode;
	protected String message;
	
	public StripeException(){	
	}

	public StripeException(int statusCode, String message){
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
