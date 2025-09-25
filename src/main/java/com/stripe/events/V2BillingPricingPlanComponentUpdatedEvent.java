// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.billing.PricingPlanComponent;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingPricingPlanComponentUpdatedEvent extends Event {
  /** Data for the v2.billing.pricing_plan_component.updated event. */
  @SerializedName("data")
  V2BillingPricingPlanComponentUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the PricingPlan that the PricingPlanComponent belongs to. */
    @SerializedName("pricing_plan_id")
    String pricingPlanId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public PricingPlanComponent fetchRelatedObject() throws StripeException {
    return (PricingPlanComponent) super.fetchRelatedObject(this.relatedObject);
  }
}
