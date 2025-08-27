// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthApiLatencyFiringEvent extends Event {
  /** Data for the v2.core.health.api_latency.firing event. */
  @SerializedName("data")
  V2CoreHealthApiLatencyFiringEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The alert ID. */
    @SerializedName("alert_id")
    String alertId;
    /** The grouping key for the alert. */
    @SerializedName("grouping_key")
    String groupingKey;
    /** The user impact. */
    @SerializedName("impact")
    Impact impact;
    /** The time when impact on the user experience was first detected. */
    @SerializedName("started_at")
    Instant startedAt;
    /** A short description of the alert. */
    @SerializedName("summary")
    String summary;

    public static final class Impact {
      /** The canonical path. */
      @SerializedName("canonical_path")
      String canonicalPath;
      /**
       * The HTTP method.
       *
       * <p>One of {@code DELETE}, {@code GET}, {@code POST}, or {@code PUT}.
       */
      @SerializedName("http_method")
      String httpMethod;
      /** The HTTP status. */
      @SerializedName("http_status")
      String httpStatus;
      /** The number of impacted requests. */
      @SerializedName("impacted_requests")
      Integer impactedRequests;
    }
  }
}
