package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public final class Address extends StripeObject {
  protected String city;
  protected String country;
  protected String line1;
  protected String line2;
  protected String postalCode;
  protected String state;
}
