// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthMeterEventSummariesDelayedResolvedEvent extends Event {
  /** Data for the v2.core.health.meter_event_summaries_delayed.resolved event. */
  @SerializedName("data")
  V2CoreHealthMeterEventSummariesDelayedResolvedEvent.EventData data;

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
    /** The time when the user experience has returned to expected levels. */
    @SerializedName("resolved_at")
    Instant resolvedAt;
    /** The time when impact on the user experience was first detected. */
    @SerializedName("started_at")
    Instant startedAt;
    /** A short description of the alert. */
    @SerializedName("summary")
    String summary;

    public static final class Impact {
      /**
       * The ingestion method.
       *
       * <p>Equal to {@code import_sets}.
       */
      @SerializedName("ingestion_method")
      String ingestionMethod;
    }
  }
}
