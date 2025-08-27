// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthTrafficVolumeDropResolvedEvent extends Event {
  /** Data for the v2.core.health.traffic_volume_drop.resolved event. */
  @SerializedName("data")
  V2CoreHealthTrafficVolumeDropResolvedEvent.EventData data;

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
      /** The total volume of payment requests within the latest observation time window. */
      @SerializedName("actual_traffic")
      Integer actualTraffic;
      /** The expected volume of payment requests within the latest observation time window. */
      @SerializedName("expected_traffic")
      Integer expectedTraffic;
      /** The size of the observation time window. */
      @SerializedName("time_window")
      String timeWindow;
    }
  }
}
