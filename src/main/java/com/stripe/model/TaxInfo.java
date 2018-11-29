package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxInfo extends StripeObject {
  /** The customer's tax ID number. */
  String taxId;

  /** The type of ID number. */
  String type;
}
