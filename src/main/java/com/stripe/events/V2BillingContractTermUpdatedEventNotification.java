// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.ContractTerm;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.core.EventNotification;
import lombok.Getter;

@Getter
public final class V2BillingContractTermUpdatedEventNotification extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ContractTerm fetchRelatedObject() throws StripeException {
    return (ContractTerm) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2BillingContractTermUpdatedEvent fetchEvent() throws StripeException {
    return (V2BillingContractTermUpdatedEvent) super.fetchEvent();
  }
}
