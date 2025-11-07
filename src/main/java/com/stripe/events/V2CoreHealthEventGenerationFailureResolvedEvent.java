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
       * The context the event should have been generated for. Only present when the account is a
       * connected account.
       */
      @SerializedName("context")
      String context;
      /** The type of event that Stripe failed to generate. */
      @SerializedName("event_type")
      String eventType;
      /** The related object details. */
      @SerializedName("related_object")
      com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEvent.EventData.Impact
              .RelatedObject
          relatedObject;

      public static final class RelatedObject {
        /** The ID of the related object (e.g., &quot;pi_...&quot;). */
        @SerializedName("id")
        String id;
        /** The type of the related object (e.g., &quot;payment_intent&quot;). */
        @SerializedName("type")
        String type;
        /** The API URL for the related object (e.g., &quot;/v1/payment_intents/pi_...&quot;). */
        @SerializedName("url")
        String url;
      }
    }
  }
}
