// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthCustomPaymentMethodAdapterDegradedResolvedEvent extends Event {
  /** Data for the v2.core.health.custom_payment_method_adapter_degraded.resolved event. */
  @SerializedName("data")
  V2CoreHealthCustomPaymentMethodAdapterDegradedResolvedEvent.EventData data;

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
    /**
     * The severity of the alert.
     *
     * <p>One of {@code critical}, or {@code non_critical}.
     */
    @SerializedName("severity")
    String severity;
    /** The time when impact on the user experience was first detected. */
    @SerializedName("started_at")
    Instant startedAt;
    /** A short description of the alert. */
    @SerializedName("summary")
    String summary;

    public static final class Impact {
      /**
       * Whether the custom payment method was disabled in Checkout as a result of the degradation.
       * True while the alert is open and false when it is resolved.
       */
      @SerializedName("custom_payment_method_disabled_from_checkout")
      Boolean customPaymentMethodDisabledFromCheckout;
      /** The custom payment method type whose adapter is unhealthy. */
      @SerializedName("custom_payment_method_type_details")
      CustomPaymentMethodTypeDetails customPaymentMethodTypeDetails;
      /** The reason the adapter's health is degraded. */
      @SerializedName("degraded_health_reason")
      String degradedHealthReason;

      public static final class CustomPaymentMethodTypeDetails {
        /**
         * The time when the custom payment method was automatically disabled. Null when it is
         * enabled.
         */
        @SerializedName("auto_disabled_at")
        Instant autoDisabledAt;
        /** The display name of the custom payment method type. */
        @SerializedName("display_name")
        String displayName;
        /** The URL of the user's self-hosted adapter endpoint. */
        @SerializedName("reverse_api_url")
        String reverseApiUrl;
        /** The identifier of the custom payment method type (e.g., &quot;cpmt_...&quot;). */
        @SerializedName("type")
        String type;
      }
    }
  }
}
