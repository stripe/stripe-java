// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountSignalsFraudulentWebsiteReadyEvent extends Event {
  /** Data for the v2.core.account_signals.fraudulent_website_ready event. */
  @SerializedName("data")
  V2CoreAccountSignalsFraudulentWebsiteReadyEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The account for which the signals belong to. Empty if this was an entityless request. */
    @SerializedName("account")
    String account;
    /**
     * Human readable description of concerns found in the website, produced by LLM. If risk_level
     * is unknown, this explains why evaluation could not run.
     */
    @SerializedName("details")
    String details;
    /** Time at which the signal was evaluated. */
    @SerializedName("evaluated_at")
    Instant evaluatedAt;
    /** Unique identifier for the fraudulent website evaluation request. */
    @SerializedName("evaluation_id")
    String evaluationId;
    /**
     * Risk level for the fraudulent website signal. If evaluation could not run (like invalid
     * website), we return unknown.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;
    /** Unique identifier for the fraudulent website signal. */
    @SerializedName("signal_id")
    String signalId;
  }
}
