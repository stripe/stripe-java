package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Summary extends StripeObject {
  Integer adjustmentCount;
  Long adjustmentGross;
  Integer chargeCount;
  Long chargeFees;
  Long chargeGross;
  Long net;
  Integer refundCount;
  Long refundFees;
  Long refundGross;
  Integer validationCount;
  Long validationFees;
}
