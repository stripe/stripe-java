package com.stripe.sdk.exception;

public class StripeBadRequestException extends StripeException {
	public StripeBadRequestException(){
		
	}
	
	public StripeBadRequestException(int statusCode, String message){
		super(statusCode, message);
	}
}
