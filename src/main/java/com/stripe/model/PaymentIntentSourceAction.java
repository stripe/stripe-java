package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class PaymentIntentSourceAction extends StripeObject {
  PaymentIntentSourceActionValueAuthorizeWithUrl authorizeWithUrl;
  String type;

  // This attribute is deprecated and is here for legacy reasons.
  PaymentIntentSourceActionValue value;
}
