package com.stripe.net;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Data;

/** Helper class used by {@link LiveStripeResponseGetter} to manage request telemetry. */
class RequestTelemetry {
  /** The name of the header used to send request telemetry in requests. */
  public static final String HEADER_NAME = "X-Stripe-Client-Telemetry";

  private static final int MAX_REQUEST_METRICS_QUEUE_SIZE = 100;

  private static final Gson gson = new Gson();

  private static ConcurrentLinkedQueue<RequestMetrics> prevRequestMetrics =
      new ConcurrentLinkedQueue<RequestMetrics>();

  /**
   * Returns an {@link Optional} containing the value of the {@code X-Stripe-Telemetry} header to
   * add to the request. If the header is already present in the request, or if there is available
   * metrics, or if telemetry is disabled, then the returned {@code Optional} is empty.
   *
   * @param headers the request headers
   * @deprecated Use {$ling {@link #pollPayload()} instead.
   */
  @Deprecated
  public Optional<String> getHeaderValue(HttpHeaders headers) {
    if (headers.firstValue(HEADER_NAME).isPresent()) {
      return Optional.empty();
    }

    return this.pollPayload();
  }

  public Optional<String> pollPayload() {
    RequestMetrics requestMetrics = prevRequestMetrics.poll();
    if (requestMetrics == null) {
      return Optional.empty();
    }

    if (!Stripe.enableTelemetry) {
      return Optional.empty();
    }

    ClientTelemetryPayload payload = new ClientTelemetryPayload(requestMetrics);
    return Optional.of(gson.toJson(payload));
  }

  // TODO (major) remove this overload
  /**
   * @deprecated use {@link #maybeEnqueueMetrics(AbstractStripeResponse, Duration, List)} instead.
   */
  @Deprecated
  public void maybeEnqueueMetrics(AbstractStripeResponse<?> response, Duration duration) {
    maybeEnqueueMetrics(response, duration, new ArrayList<String>());
  }

  /**
   * If telemetry is enabled and the queue is not full, then enqueue a new metrics item; otherwise,
   * do nothing.
   *
   * @param response the Stripe response
   * @param duration the request duration
   * @param usage a list of tracked features used by the corresponding request
   */
  public void maybeEnqueueMetrics(
      AbstractStripeResponse<?> response, Duration duration, List<String> usage) {
    if (!Stripe.enableTelemetry) {
      return;
    }

    if (response.requestId() == null) {
      return;
    }

    if (prevRequestMetrics.size() >= MAX_REQUEST_METRICS_QUEUE_SIZE) {
      return;
    }

    if (usage != null && usage.size() == 0) {
      usage = null;
    }

    RequestMetrics metrics = new RequestMetrics(response.requestId(), duration.toMillis(), usage);
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

    @SerializedName("usage")
    private final List<String> usage;
  }
}
