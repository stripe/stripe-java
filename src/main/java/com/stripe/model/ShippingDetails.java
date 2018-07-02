package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class ShippingDetails extends StripeObject {
  Address address;
  String carrier;
  String name;
  String phone;
  String trackingNumber;
}
