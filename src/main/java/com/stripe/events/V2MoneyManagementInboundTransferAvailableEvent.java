// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.moneymanagement.InboundTransfer;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2MoneyManagementInboundTransferAvailableEvent extends Event {
  /** Data for the v2.money_management.inbound_transfer.available event. */
  @SerializedName("data")
  V2MoneyManagementInboundTransferAvailableEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The transaction ID of the received credit. */
    @SerializedName("transaction_id")
    String transactionId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public InboundTransfer fetchRelatedObject() throws StripeException {
    return (InboundTransfer) super.fetchRelatedObject(this.relatedObject);
  }
}
