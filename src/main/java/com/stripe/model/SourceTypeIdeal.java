package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeIdeal extends StripeObject {
  String bank;

  String bic;

  String ibanLast4;

  String statementDescriptor;
}
