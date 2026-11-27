// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.payments.OffSessionPayment;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2PaymentsOffSessionPaymentAttemptFailedEvent extends Event {
  /** Data for the v2.payments.off_session_payment.attempt_failed event. */
  @SerializedName("data")
  V2PaymentsOffSessionPaymentAttemptFailedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the payment attempt record associated with this failed attempt. */
    @SerializedName("payment_attempt_record")
    String paymentAttemptRecord;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public OffSessionPayment fetchRelatedObject() throws StripeException {
    return (OffSessionPayment) super.fetchRelatedObject(this.relatedObject);
  }
}
