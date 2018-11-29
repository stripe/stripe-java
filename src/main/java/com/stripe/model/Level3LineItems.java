package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Level3LineItems extends StripeObject {
  Long discountAmount;

  String productCode;

  String productDescription;

  Long quantity;

  Long taxAmount;

  Long unitCost;
}
