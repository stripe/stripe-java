package com.stripe.sdk.exception;

public class StripeServerErrorException extends StripeException {
	public StripeServerErrorException(){		
	}
	
	public StripeServerErrorException(int statusCode, String message){
		super(statusCode, message);
	}
}
