package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class NotificationEventRequest extends StripeObject implements HasId {
  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe's
   * automatic subscription handling). Request logs are available in the
   * [dashboard](https://dashboard.stripe.com/logs), but currently not in the API.
   */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * The idempotency key transmitted during the request, if any. *Note: This property is populated
   * only for events on or after May 23, 2017*.
   */
  String idempotencyKey;
}
