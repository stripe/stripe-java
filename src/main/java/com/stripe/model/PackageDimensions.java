package com.stripe.model;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PackageDimensions extends StripeObject {
  /** Height, in inches. */
  BigDecimal height;

  /** Length, in inches. */
  BigDecimal length;

  /** Weight, in ounces. */
  BigDecimal weight;

  /** Width, in inches. */
  BigDecimal width;
}
