// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.moneymanagement.Transaction;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2MoneyManagementTransactionCreatedEvent extends Event {
  /** Data for the v2.money_management.transaction.created event. */
  @SerializedName("data")
  V2MoneyManagementTransactionCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Id of the v1 Transaction corresponding to this Transaction. */
    @SerializedName("v1_id")
    String v1Id;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Transaction fetchRelatedObject() throws StripeException {
    return (Transaction) super.fetchRelatedObject(this.relatedObject);
  }
}
