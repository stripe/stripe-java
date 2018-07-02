package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class Address extends StripeObject {
  String city;
  String country;
  String line1;
  String line2;
  String postalCode;
  String state;
}
