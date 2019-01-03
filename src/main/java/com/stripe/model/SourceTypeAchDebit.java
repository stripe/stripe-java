package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeAchDebit extends StripeObject {
  String bankName;

  String country;

  String fingerprint;

  String last4;

  String routingNumber;

  String type;
}
