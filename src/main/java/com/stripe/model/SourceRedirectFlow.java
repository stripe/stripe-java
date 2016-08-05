package com.stripe.model;

public final class SourceRedirectFlow extends StripeObject {
	String url;
	String returnUrl;
	String status;

	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
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
}
