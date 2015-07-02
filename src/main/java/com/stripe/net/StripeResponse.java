package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse {
	
	int responseCode;
	String responseBody;
	Map<String, List<String>> responseHeaders;
	
	public StripeResponse(int responseCode, String responseBody) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;
		this.responseHeaders = null;
	}
	public StripeResponse(int responseCode, String responseBody, Map<String, List<String>> responseHeaders) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;
		this.responseHeaders = responseHeaders;
	}

	public int getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getResponseBody() {
		return responseBody;
	}
	
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public Map<String, List<String>> getResponseHeaders() {
		return responseHeaders;
	}
}
