// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.payments.SettlementAllocationIntent;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2PaymentsSettlementAllocationIntentErroredEvent extends Event {
  /** Data for the v2.payments.settlement_allocation_intent.errored event. */
  @SerializedName("data")
  V2PaymentsSettlementAllocationIntentErroredEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Stripe doc link to debug the issue. */
    @SerializedName("doc_url")
    String docUrl;
    /** User Message detailing the reason code and possible resolution . */
    @SerializedName("message")
    String message;
    /**
     * Open Enum. The {@code errored} status reason.
     *
     * <p>Equal to {@code amount_mismatch}.
     */
    @SerializedName("reason_code")
    String reasonCode;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public SettlementAllocationIntent fetchRelatedObject() throws StripeException {
    return (SettlementAllocationIntent) super.fetchRelatedObject(this.relatedObject);
  }
}
