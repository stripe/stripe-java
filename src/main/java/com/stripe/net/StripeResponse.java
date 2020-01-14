package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse {

  int code;
  String body;
  HttpHeaders headers;
  int numRetries;

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
    this.headers = HttpHeaders.of(headers);
  }

  public int code() {
    return this.code;
  }

  public String body() {
    return this.body;
  }

  public HttpHeaders headers() {
    return headers;
  }

  public String idempotencyKey() {
    return (headers != null) ? headers.firstValue("Idempotency-Key").orElse(null) : null;
  }

  public String requestId() {
    return (headers != null) ? headers.firstValue("Request-Id").orElse(null) : null;
  }

  public int numRetries() {
    return this.numRetries;
  }

  void setNumRetries(int numRetries) {
    this.numRetries = numRetries;
  }
}
