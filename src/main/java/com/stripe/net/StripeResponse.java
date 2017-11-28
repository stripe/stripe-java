package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse {

	int code;
	String body;
	StripeHeaders headers;

	public StripeResponse(int code, String body) {
		this.code = code;
		this.body = body;
		this.headers = null;
	}

	public StripeResponse(int code, String body, Map<String, List<String>> headers) {
		this.code = code;
		this.body = body;
		this.headers = new StripeHeaders(headers);
	}

	public int code() {
		return this.code;
	}

	public String body() {
		return this.body;
	}

	public StripeHeaders headers() {
		return headers;
	}

	public String idempotencyKey() {
		if (headers == null) {
			return null;
		}
		return headers.get("Idempotency-Key");
	}

	public String requestId() {
		if (headers == null) {
			return null;
		}
		return headers.get("Request-Id");
	}
}
