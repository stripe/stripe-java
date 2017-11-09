package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse {

	int responseCode;
	String responseBody;
	StripeHeaders headers;

	public StripeResponse(int responseCode, String responseBody) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;
		this.headers = null;
	}

	public StripeResponse(int responseCode, String responseBody, Map<String, List<String>> responseHeaders) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;
		this.headers = new StripeHeaders(responseHeaders);
	}

	public int code() {
		return responseCode;
	}

	public String body() {
		return responseBody;
	}

	public StripeHeaders headers() {
		return headers;
	}

	public String idempotencyKey() {
		return headers.get("Idempotency-Key");
	}

	public String requestId() {
		return headers.get("Request-Id");
	}
}
