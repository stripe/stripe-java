// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2SignalsPaymentRetryEvaluationsRetryRecommendedEvent extends Event {
  /** Data for the v2.signals.payment_retry_evaluations.retry_recommended event. */
  @SerializedName("data")
  V2SignalsPaymentRetryEvaluationsRetryRecommendedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Unique identifier for the payment retry evaluation. */
    @SerializedName("id")
    String id;
    /** Whether the event was created in livemode. */
    @SerializedName("livemode")
    Boolean livemode;
    /** The PaymentIntent ID. Present when the evaluation is for a PaymentIntent. */
    @SerializedName("payment_intent")
    String paymentIntent;
    /** The PaymentRecord ID. Present when the evaluation is for a PaymentRecord. */
    @SerializedName("payment_record")
    String paymentRecord;
  }
}
