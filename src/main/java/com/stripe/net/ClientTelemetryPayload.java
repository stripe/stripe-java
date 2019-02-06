package com.stripe.net;

import com.google.gson.annotations.SerializedName;

public class ClientTelemetryPayload {
  @SerializedName("last_request_metrics")
  public RequestMetrics lastRequestMetrics;
}
