// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.billing.RateCardRate;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingRateCardRateCreatedEvent extends Event {
  /** Data for the v2.billing.rate_card_rate.created event. */
  @SerializedName("data")
  V2BillingRateCardRateCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the BillableItem which this Rate is associated with. */
    @SerializedName("billable_item")
    String billableItem;
    /** Timestamp of when the object was created. */
    @SerializedName("created")
    Instant created;
    /** The ID of the RateCard which this Rate belongs to. */
    @SerializedName("rate_card")
    String rateCard;
    /** The ID of the latest RateCard Version when the Rate was created. */
    @SerializedName("rate_card_version")
    String rateCardVersion;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public RateCardRate fetchRelatedObject() throws StripeException {
    return (RateCardRate) super.fetchRelatedObject(this.relatedObject);
  }
}
