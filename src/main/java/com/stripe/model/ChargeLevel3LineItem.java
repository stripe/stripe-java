package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class ChargeLevel3LineItem extends StripeObject {
  protected Long discountAmount;
  protected String productCode;
  protected String productDescription;
  protected Long quantity;
  protected Long taxAmount;
  protected Long unitCost;
}
