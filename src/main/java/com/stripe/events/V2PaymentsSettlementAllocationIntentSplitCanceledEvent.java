// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.payments.SettlementAllocationIntentSplit;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2PaymentsSettlementAllocationIntentSplitCanceledEvent extends Event {
  /** Data for the v2.payments.settlement_allocation_intent_split.canceled event. */
  @SerializedName("data")
  V2PaymentsSettlementAllocationIntentSplitCanceledEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the SettlementAllocationIntent this split belongs to. */
    @SerializedName("settlement_allocation_intent_id")
    String settlementAllocationIntentId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public SettlementAllocationIntentSplit fetchRelatedObject() throws StripeException {
    return (SettlementAllocationIntentSplit) super.fetchRelatedObject(this.relatedObject);
  }
}
