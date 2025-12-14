// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2PaymentsSettlementAllocationIntentNotFoundEvent extends Event {
  /** Data for the v2.payments.settlement_allocation_intent.not_found event. */
  @SerializedName("data")
  V2PaymentsSettlementAllocationIntentNotFoundEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the ReceivedCredit. */
    @SerializedName("received_credit_id")
    String receivedCreditId;
  }
}
