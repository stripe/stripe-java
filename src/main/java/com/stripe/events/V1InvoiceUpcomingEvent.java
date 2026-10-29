// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V1InvoiceUpcomingEvent extends Event {
  /** Data for the v1.invoice.upcoming event. */
  @SerializedName("data")
  V1InvoiceUpcomingEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the customer this upcoming invoice is associated with. */
    @SerializedName("customer")
    String customer;
    /** The ID of the subscription, if any. */
    @SerializedName("subscription")
    String subscription;
  }
}
