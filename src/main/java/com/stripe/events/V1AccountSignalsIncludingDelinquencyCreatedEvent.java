// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V1AccountSignalsIncludingDelinquencyCreatedEvent extends Event {
  /** Data for the v1.account_signals[delinquency].created event. */
  @SerializedName("data")
  V1AccountSignalsIncludingDelinquencyCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The account for which the signals belong to. */
    @SerializedName("account")
    String account;
    /** Time at which the signal was evaluated. */
    @SerializedName("evaluated_at")
    Instant evaluatedAt;
    /**
     * Array of objects representing individual factors that contributed to the calculated
     * probability of delinquency.
     */
    @SerializedName("indicators")
    List<V1AccountSignalsIncludingDelinquencyCreatedEvent.EventData.Indicator> indicators;
    /** The probability of delinquency. Can be between 0.00 and 100.00. */
    @SerializedName("probability")
    BigDecimal probability;
    /**
     * Categorical assessment of the delinquency risk based on probability.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;
    /** Unique identifier for the delinquency signal. */
    @SerializedName("signal_id")
    String signalId;

    public static final class Indicator {
      /** A brief explanation of how this indicator contributed to the delinquency probability. */
      @SerializedName("description")
      String description;
      /**
       * The effect this indicator had on the overall risk level.
       *
       * <p>One of {@code decrease}, {@code neutral}, {@code slight_increase}, or {@code
       * strong_increase}.
       */
      @SerializedName("impact")
      String impact;
      /**
       * The name of the specific indicator used in the risk assessment.
       *
       * <p>One of {@code account_balance}, {@code aov}, {@code charge_concentration}, {@code
       * disputes}, {@code dispute_window}, {@code duplicates}, {@code exposure}, {@code
       * firmographic}, {@code lifetime_metrics}, {@code payment_processing}, {@code
       * payment_volume}, {@code payouts}, {@code refunds}, {@code tenure}, or {@code transfers}.
       */
      @SerializedName("indicator")
      String indicator;
    }
  }
}
