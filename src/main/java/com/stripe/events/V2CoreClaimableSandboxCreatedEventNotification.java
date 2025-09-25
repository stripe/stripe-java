// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.EventNotification;
import com.stripe.model.v2.core.ClaimableSandbox;
import lombok.Getter;

@Getter
public final class V2CoreClaimableSandboxCreatedEventNotification extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ClaimableSandbox fetchRelatedObject() throws StripeException {
    return (ClaimableSandbox) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2CoreClaimableSandboxCreatedEvent fetchEvent() throws StripeException {
    return (V2CoreClaimableSandboxCreatedEvent) super.fetchEvent();
  }
}
