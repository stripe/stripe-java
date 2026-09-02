// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthMetronomeNotificationLatencyFiringEvent extends Event {
  /** Data for the v2.core.health.metronome_notification_latency.firing event. */
  @SerializedName("data")
  V2CoreHealthMetronomeNotificationLatencyFiringEvent.EventData data;

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
      /**
       * The impacted Metronome billing pipeline.
       *
       * <p>One of {@code configuration_triggered}, {@code high_cardinality_usage_triggered}, {@code
       * standard_usage_triggered}, or {@code time_triggered}.
       */
      @SerializedName("pipeline")
      String pipeline;
    }
  }
}
