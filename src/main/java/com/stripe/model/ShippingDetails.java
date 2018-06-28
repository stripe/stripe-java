package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class ShippingDetails extends StripeObject {
  protected Address address;
  protected String carrier;
  protected String name;
  protected String phone;
  protected String trackingNumber;
}
