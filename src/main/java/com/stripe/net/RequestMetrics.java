package com.stripe.net;

import com.google.gson.annotations.SerializedName;

public class RequestMetrics {
  @SerializedName("request_id")
  public String requestId;

  @SerializedName("request_duration_ms")
  public long requestDurationMs;

  public RequestMetrics(String requestId, long requestDurationMs) {
    this.requestId = requestId;
    this.requestDurationMs = requestDurationMs;
  }

  /** Constructs the JSON payload to be sent in the X-Stripe-Client-Telemetry header. */
  public ClientTelemetryPayload payload() {
    ClientTelemetryPayload p = new ClientTelemetryPayload();
    p.lastRequestMetrics = this;
    return p;
  }
}
