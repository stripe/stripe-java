package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypePaperCheck extends StripeObject {
  String mailingAddressCity;

  String mailingAddressCountry;

  String mailingAddressLine1;

  String mailingAddressLine2;

  String mailingAddressPostalCode;

  String mailingAddressState;
}
