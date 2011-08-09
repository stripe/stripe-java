package com.stripe.exceptions;

public class StripeServerErrorException extends StripeException {
	public StripeServerErrorException(){		
	}
	
	public StripeServerErrorException(int statusCode, String message){
		super(statusCode, message);
	}
}
