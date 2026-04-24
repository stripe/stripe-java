// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoicePayment;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import lombok.Getter;

@Getter
public final class V1InvoicePaymentPaidEvent extends Event {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public InvoicePayment fetchRelatedObject() throws StripeException {
    return (InvoicePayment) super.fetchRelatedObject(this.relatedObject);
  }
}
