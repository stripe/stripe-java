package com.stripe.exceptions;

public class StripeRequestFailedException extends StripeException {
	private String code;
	private String param;
	private String type;
	
	public StripeRequestFailedException(){		
	}
	
	public StripeRequestFailedException(int statusCode, String message){
		super(statusCode, message);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
