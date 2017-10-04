package com.stripe.model;

public final class SourceRedirectFlow extends StripeObject {
	String failureReason;
	String returnUrl;
	String status;
	String url;

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getReturnURL() {
		return returnUrl;
	}

	public void setReturnURL(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}
}
