package com.stripe.exceptions;

public class StripeNotFoundException extends StripeException {
	public StripeNotFoundException(){		
	}
	
	public StripeNotFoundException(int statusCode, String message){
		super(statusCode, message);
	}
}
