package com.stripe.exception;

public abstract class StripeException extends Exception {

	private String requestId;

	public StripeException(String message, String requestId) {
		super(message, null);
		this.requestId = requestId;
	}

	public StripeException(String message, String requestId, Throwable e) {
		super(message, e);
		this.requestId = requestId;
	}

	private static final long serialVersionUID = 1L;

	public String getRequestId() {
		return requestId;
    }

	public String toString() {
		String reqIdStr = "";
		if (requestId != null) {
			reqIdStr = "; request-id: " + requestId;
		}
		return super.toString() + reqIdStr;
	}
}

