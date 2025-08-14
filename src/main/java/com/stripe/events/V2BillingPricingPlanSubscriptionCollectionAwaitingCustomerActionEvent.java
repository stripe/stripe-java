// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.billing.PricingPlanSubscription;
import lombok.Getter;

@Getter
public final class V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEvent
    extends Event {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public PricingPlanSubscription fetchRelatedObject() throws StripeException {
    return (PricingPlanSubscription) super.fetchRelatedObject(this.relatedObject);
  }
}
