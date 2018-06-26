package com.stripe.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class ChargeLevel3 extends StripeObject {
  protected String customerReference;
  protected List<ChargeLevel3LineItem> lineItems;
  protected String merchantReference;
  protected String shippingAddressZip;
  protected String shippingFromZip;
  protected Long shippingAmount;
}