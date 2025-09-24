// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.model.v2.Event;
import lombok.Getter;

@Getter
public final class V1SigmaScheduledQueryRunCreatedEvent extends Event {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ScheduledQueryRun fetchRelatedObject() throws StripeException {
    return (ScheduledQueryRun) super.fetchRelatedObject(this.relatedObject);
  }
}
