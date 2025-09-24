// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent extends Event {
  /** Data for the v2.core.health.issuing_authorization_request_errors.resolved event. */
  @SerializedName("data")
  V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
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
      /** Estimated aggregated amount for the approved requests. */
      @SerializedName("approved_amount")
      Amount approvedAmount;
      /** The number of approved requests which are impacted. */
      @SerializedName("approved_impacted_requests")
      Long approvedImpactedRequests;
      /** Estimated aggregated amount for the declined requests. */
      @SerializedName("declined_amount")
      Amount declinedAmount;
      /** The number of declined requests which are impacted. */
      @SerializedName("declined_impacted_requests")
      Long declinedImpactedRequests;
    }
  }
}
