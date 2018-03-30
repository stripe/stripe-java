package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PackageDimensions extends StripeObject {
  Double height;
  Double length;
  Double weight;
  Double width;
}
