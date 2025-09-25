// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.PersonalizationDesign;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import lombok.Getter;

@Getter
public final class V1IssuingPersonalizationDesignDeactivatedEvent extends Event {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public PersonalizationDesign fetchRelatedObject() throws StripeException {
    return (PersonalizationDesign) super.fetchRelatedObject(this.relatedObject);
  }
}
