package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse {

  int code;
  String body;
  StripeHeaders headers;

  /** Constructs a Stripe response with the specified status code and body. */
  public StripeResponse(int code, String body) {
    this.code = code;
    this.body = body;
    this.headers = null;
  }

  /** Constructs a Stripe response with the specified status code, body and headers. */
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
    return (headers != null) ? headers.get("Idempotency-Key") : null;
  }

  public String requestId() {
    return (headers != null) ? headers.get("Request-Id") : null;
  }
}
