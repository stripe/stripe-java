// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.ThinEvent;
import lombok.Getter;

@Getter
public final class PushedV1BillingMeterErrorReportTriggeredEvent extends ThinEvent {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Meter fetchRelatedObject() throws StripeException {
    return (Meter) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V1BillingMeterErrorReportTriggeredEvent pull() throws StripeException {
    return (V1BillingMeterErrorReportTriggeredEvent) super.pull();
  }
}
