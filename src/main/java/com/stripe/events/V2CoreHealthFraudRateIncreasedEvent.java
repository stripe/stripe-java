// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthFraudRateIncreasedEvent extends Event {
  /** Data for the v2.core.health.fraud_rate.increased event. */
  @SerializedName("data")
  V2CoreHealthFraudRateIncreasedEvent.EventData data;

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
       * Fraud attack type.
       *
       * <p>One of {@code spike}, or {@code sustained_attack}.
       */
      @SerializedName("attack_type")
      String attackType;
      /** The number of impacted requests which are detected. */
      @SerializedName("impacted_requests")
      Long impactedRequests;
      /** Estimated aggregated amount for the impacted requests. */
      @SerializedName("realized_fraud_amount")
      RealizedFraudAmount realizedFraudAmount;

      public static final class RealizedFraudAmount {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;
        /**
         * A non-negative integer representing how much to charge in the <a
         * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
         */
        @SerializedName("value")
        Long value;
      }
    }
  }
}
