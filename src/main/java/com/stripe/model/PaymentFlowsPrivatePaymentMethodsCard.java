package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentFlowsPrivatePaymentMethodsCard extends StripeObject {
  String brand;

  Long expMonth;

  Long expYear;

  String funding;

  String last4;
}
