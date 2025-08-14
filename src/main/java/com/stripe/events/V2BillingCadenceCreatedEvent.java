// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.billing.Cadence;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingCadenceCreatedEvent extends Event {
  /** Data for the v2.billing.cadence.created event. */
  @SerializedName("data")
  V2BillingCadenceCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Timestamp of when the object was created. */
    @SerializedName("created")
    Instant created;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Cadence fetchRelatedObject() throws StripeException {
    return (Cadence) super.fetchRelatedObject(this.relatedObject);
  }
}
