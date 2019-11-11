package com.stripe.net;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Data;

/** Helper class used by {@link LiveStripeResponseGetter} to manage request telemetry. */
class RequestTelemetry {
  private static final int MAX_REQUEST_METRICS_QUEUE_SIZE = 100;

  private static final Gson gson = new Gson();

  private static ConcurrentLinkedQueue<RequestMetrics> prevRequestMetrics =
      new ConcurrentLinkedQueue<RequestMetrics>();

  /**
   * If telemetry is enabled and there is at least one metrics item in the queue, then add a {@code
   * X-Stripe-Client-Telemetry} header with the item; otherwise, do nothing.
   *
   * @param headers the request headers
   */
  public void maybeAddTelemetryHeader(Map<String, String> headers) {
    if (headers.containsKey("X-Stripe-Telemetry")) {
      return;
    }

    RequestMetrics requestMetrics = prevRequestMetrics.poll();
    if (requestMetrics == null) {
      return;
    }

    if (!Stripe.enableTelemetry) {
      return;
    }

    ClientTelemetryPayload payload = new ClientTelemetryPayload(requestMetrics);
    headers.put("X-Stripe-Client-Telemetry", gson.toJson(payload));
  }

  /**
   * If telemetry is enabled and the queue is not full, then enqueue a new metrics item; otherwise,
   * do nothing.
   *
   * @param response the Stripe response
   * @param duration the request duration
   */
  public void maybeEnqueueMetrics(StripeResponse response, Duration duration) {
    if (!Stripe.enableTelemetry) {
      return;
    }

    if (response.requestId() == null) {
      return;
    }

    if (prevRequestMetrics.size() >= MAX_REQUEST_METRICS_QUEUE_SIZE) {
      return;
    }

    RequestMetrics metrics = new RequestMetrics(response.requestId(), duration.toMillis());
    prevRequestMetrics.add(metrics);
  }

  @Data
  private static class ClientTelemetryPayload {
    @SerializedName("last_request_metrics")
    private final RequestMetrics lastRequestMetrics;
  }

  @Data
  private static class RequestMetrics {
    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("request_duration_ms")
    private final long requestDurationMs;
  }
}
