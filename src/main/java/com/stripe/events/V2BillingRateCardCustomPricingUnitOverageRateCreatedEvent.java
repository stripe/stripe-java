// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.RateCardCustomPricingUnitOverageRate;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingRateCardCustomPricingUnitOverageRateCreatedEvent extends Event {
  /** Data for the v2.billing.rate_card_custom_pricing_unit_overage_rate.created event. */
  @SerializedName("data")
  V2BillingRateCardCustomPricingUnitOverageRateCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Timestamp of when the object was created. */
    @SerializedName("created")
    Instant created;
    /** The ID of the custom pricing unit this overage rate applies to. */
    @SerializedName("custom_pricing_unit")
    String customPricingUnit;
    /** The ID of the RateCard which this custom pricing unit overage rate belongs to. */
    @SerializedName("rate_card")
    String rateCard;
    /** The ID of the RateCard Version when the custom pricing unit overage rate was created. */
    @SerializedName("rate_card_version")
    String rateCardVersion;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public RateCardCustomPricingUnitOverageRate fetchRelatedObject() throws StripeException {
    return (RateCardCustomPricingUnitOverageRate) super.fetchRelatedObject(this.relatedObject);
  }
}
