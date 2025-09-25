// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.EventNotification;
import lombok.Getter;

@Getter
public final class V1TestHelpersTestClockReadyEventNotification extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public TestClock fetchRelatedObject() throws StripeException {
    return (TestClock) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V1TestHelpersTestClockReadyEvent fetchEvent() throws StripeException {
    return (V1TestHelpersTestClockReadyEvent) super.fetchEvent();
  }
}
