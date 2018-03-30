package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class ShippingDetails extends StripeObject {
  protected Address address;
  protected String name;
  protected String phone;
}
