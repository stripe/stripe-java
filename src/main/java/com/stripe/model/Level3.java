package com.stripe.model;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Level3 extends StripeObject {
  String customerReference;

  List<Level3LineItems> lineItems;

  String merchantReference;

  String shippingAddressZip;

  Long shippingAmount;

  String shippingFromZip;
}
