package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeHeaders {

	Map<String, List<String>> headers;

	public StripeHeaders(Map<String, List<String>> headers) {
		this.headers = headers;
	}
	
	public String get(String name) {
		List<String> requestIdList = values(name);
		String requestId = null;
		if (requestIdList != null && requestIdList.size() > 0) {
			requestId = requestIdList.get(0);
		}
		return requestId;
	}

	public List<String> values(String name) {
		return headers == null ? null : headers.get("Request-Id");
	}

}
