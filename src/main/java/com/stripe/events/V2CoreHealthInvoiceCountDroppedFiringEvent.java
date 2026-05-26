// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthInvoiceCountDroppedFiringEvent extends Event {
  /** Data for the v2.core.health.invoice_count_dropped.firing event. */
  @SerializedName("data")
  V2CoreHealthInvoiceCountDroppedFiringEvent.EventData data;

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
      /** The observed number of invoices within the time window. */
      @SerializedName("observed_count")
      BigDecimal observedCount;
      /** The expected threshold number of invoices within the time window. */
      @SerializedName("threshold_count")
      BigDecimal thresholdCount;
      /** The size of the observation time window. */
      @SerializedName("time_window")
      String timeWindow;
    }
  }
}
