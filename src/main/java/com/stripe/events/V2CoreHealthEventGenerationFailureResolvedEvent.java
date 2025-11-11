// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthEventGenerationFailureResolvedEvent extends Event {
  /** Data for the v2.core.health.event_generation_failure.resolved event. */
  @SerializedName("data")
  V2CoreHealthEventGenerationFailureResolvedEvent.EventData data;

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
    /** A short description of the alert. */
    @SerializedName("summary")
    String summary;

    public static final class Impact {
      /**
       * The account id the event should have been generated for. Only present when the account is a
       * connected account.
       */
      @SerializedName("account")
      String account;
      /** The type of event that Stripe failed to generate. */
      @SerializedName("event_type")
      String eventType;
      /** Indicates if the event was for livemode or not. */
      @SerializedName("livemode")
      Boolean livemode;
      /** The number of webhooks that Stripe failed to create and deliver. */
      @SerializedName("missing_delivery_attempts")
      Long missingDeliveryAttempts;
      /** The related object id. */
      @SerializedName("related_object_id")
      String relatedObjectId;
    }
  }
}
