// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.billing.RateCardVersion;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingRateCardVersionCreatedEvent extends Event {
  /** Data for the v2.billing.rate_card_version.created event. */
  @SerializedName("data")
  V2BillingRateCardVersionCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the RateCard that the RateCardVersion belongs to. */
    @SerializedName("rate_card_id")
    String rateCardId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public RateCardVersion fetchRelatedObject() throws StripeException {
    return (RateCardVersion) super.fetchRelatedObject(this.relatedObject);
  }
}
