package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Summary extends StripeObject {
  Long adjustmentCount;
  Long adjustmentGross;
  Long chargeCount;
  Long chargeFees;
  Long chargeGross;
  Long net;
  Long refundCount;
  Long refundFees;
  Long refundGross;
  Long validationCount;
  Long validationFees;
}
