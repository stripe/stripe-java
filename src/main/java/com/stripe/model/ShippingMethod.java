package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ShippingMethod extends StripeObject {
  String id;
  Long amount;
  String currency;
  String description;
}
