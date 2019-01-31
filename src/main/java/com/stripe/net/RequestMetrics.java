package com.stripe.net;

import com.google.gson.annotations.SerializedName;

public class RequestMetrics {
    @SerializedName("request_id")
    public String requestId;

    @SerializedName("request_duration_ms")
    public long requestDurationMs;

    public RequestMetrics(String requestId, long requestDurationMS) {
        this.requestId = requestId;
        this.requestDurationMs = requestDurationMS;
    }

    public ClientTelemetryPayload payload() {
        ClientTelemetryPayload p = new ClientTelemetryPayload();
        p.lastRequestMetrics = this;
        return p;
    }
}
