package com.stripe.net;

public class RequestMetrics {
    public String request_id;
    public long request_duration_ms;

    public class Payload {
        public RequestMetrics last_request_metrics;
    }

    public RequestMetrics(String requestId, long requestDurationMS) {
        this.request_id = requestId;
        this.request_duration_ms = requestDurationMS;
    }

    public Payload payload() {
        Payload p = new Payload();
        p.last_request_metrics = this;
        return p;
    }
}
