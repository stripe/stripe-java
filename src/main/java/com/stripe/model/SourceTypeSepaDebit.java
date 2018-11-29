package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeSepaDebit extends StripeObject {
  String bankCode;

  String branchCode;

  String country;

  String fingerprint;

  String last4;

  String mandateReference;

  String mandateUrl;

  Boolean skipValidation;
}
