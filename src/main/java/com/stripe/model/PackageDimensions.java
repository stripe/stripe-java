package com.stripe.model;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PackageDimensions extends StripeObject {
  BigDecimal height;
  BigDecimal length;
  BigDecimal weight;
  BigDecimal width;
}
