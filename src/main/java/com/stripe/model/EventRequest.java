package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventRequest extends StripeObject {
  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe’s
   * automatic subscription handling). Request logs are available in the <a
   * href="https://dashboard.stripe.com/logs">dashboard</a>, but currently not in the API.
   */
  @SerializedName("id")
  String id;

  /**
   * The idempotency key transmitted during the request, if any. <i>Note: This property is populated
   * only for events on or after May 23, 2017.</i>
   */
  @SerializedName("idempotency_key")
  String idempotencyKey;
}
