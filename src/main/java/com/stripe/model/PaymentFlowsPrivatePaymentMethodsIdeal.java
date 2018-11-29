package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentFlowsPrivatePaymentMethodsIdeal extends StripeObject {
  String bank;

  String last4;

  String statementDescriptor;
}
