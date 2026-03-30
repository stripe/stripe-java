// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2IamStripeAccessGrantCanceledEvent extends Event {
  /** Data for the v2.iam.stripe_access_grant.canceled event. */
  @SerializedName("data")
  V2IamStripeAccessGrantCanceledEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** ID of canceled Stripe Access Grant. */
    @SerializedName("stripe_access_grant")
    String stripeAccessGrant;
  }
}
