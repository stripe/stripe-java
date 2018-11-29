package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerShipping extends StripeObject {
  Address address;

  /** Customer name. */
  String name;

  /** Customer phone (including extension). */
  String phone;
}
