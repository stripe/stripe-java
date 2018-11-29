package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentFlowsPrivatePaymentMethodsSepaDebit extends StripeObject {
  String last4;
}
