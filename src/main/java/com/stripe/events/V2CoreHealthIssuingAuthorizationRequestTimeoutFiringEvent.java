// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent extends Event {
  /** Data for the v2.core.health.issuing_authorization_request_timeout.firing event. */
  @SerializedName("data")
  V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.EventData data;

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
      /** Estimated aggregated amount for the approved requests. */
      @SerializedName("approved_amount")
      ApprovedAmount approvedAmount;
      /** The number of approved requests which are impacted. */
      @SerializedName("approved_impacted_requests")
      Long approvedImpactedRequests;
      /** Estimated aggregated amount for the declined requests. */
      @SerializedName("declined_amount")
      DeclinedAmount declinedAmount;
      /** The number of declined requests which are impacted. */
      @SerializedName("declined_impacted_requests")
      Long declinedImpactedRequests;

      public static final class ApprovedAmount {
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

      public static final class DeclinedAmount {
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
