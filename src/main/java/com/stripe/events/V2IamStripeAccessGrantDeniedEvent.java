// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2IamStripeAccessGrantDeniedEvent extends Event {
  /** Data for the v2.iam.stripe_access_grant.denied event. */
  @SerializedName("data")
  V2IamStripeAccessGrantDeniedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** ID of denied Stripe Access Grant. */
    @SerializedName("stripe_access_grant")
    String stripeAccessGrant;
  }
}
