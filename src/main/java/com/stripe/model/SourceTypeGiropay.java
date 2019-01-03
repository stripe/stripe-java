package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeGiropay extends StripeObject {
  String bankCode;

  String bankName;

  String bic;

  String statementDescriptor;
}
