// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.EventNotification;
import com.stripe.model.v2.billing.RateCardSubscription;
import lombok.Getter;

@Getter
public final class V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEventNotification
    extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public RateCardSubscription fetchRelatedObject() throws StripeException {
    return (RateCardSubscription) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEvent fetchEvent()
      throws StripeException {
    return (V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEvent) super.fetchEvent();
  }
}
