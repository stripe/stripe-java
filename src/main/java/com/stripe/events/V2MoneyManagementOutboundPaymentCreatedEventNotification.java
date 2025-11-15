// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.core.EventNotification;
import com.stripe.model.v2.moneymanagement.OutboundPayment;
import lombok.Getter;

@Getter
public final class V2MoneyManagementOutboundPaymentCreatedEventNotification
    extends EventNotification {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public OutboundPayment fetchRelatedObject() throws StripeException {
    return (OutboundPayment) super.fetchRelatedObject(this.relatedObject);
  }
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2MoneyManagementOutboundPaymentCreatedEvent fetchEvent() throws StripeException {
    return (V2MoneyManagementOutboundPaymentCreatedEvent) super.fetchEvent();
  }
}
