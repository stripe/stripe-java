package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class PaymentIntentSourceAction extends StripeObject {
  String type;
  PaymentIntentSourceActionValue value;
}
