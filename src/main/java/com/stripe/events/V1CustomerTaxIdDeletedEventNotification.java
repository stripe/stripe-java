// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.TaxId;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.EventNotification;
import lombok.Getter;

@Getter
public final class V1CustomerTaxIdDeletedEventNotification extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public TaxId fetchRelatedObject() throws StripeException {
    return (TaxId) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V1CustomerTaxIdDeletedEvent fetchEvent() throws StripeException {
    return (V1CustomerTaxIdDeletedEvent) super.fetchEvent();
  }
}
