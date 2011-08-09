package com.stripe.sdk.exception;

public class StripeUnauthorizedException extends StripeException {
	public StripeUnauthorizedException(){		
	}
	
	public StripeUnauthorizedException(int statusCode, String message){
		super(statusCode, message);
	}
}
