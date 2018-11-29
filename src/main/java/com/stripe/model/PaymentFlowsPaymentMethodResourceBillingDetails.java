package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentFlowsPaymentMethodResourceBillingDetails extends StripeObject {
  Address address;

  String email;

  String name;

  String phone;
}
