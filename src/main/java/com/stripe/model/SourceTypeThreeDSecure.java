package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeThreeDSecure extends StripeObject {
  String addressLine1Check;

  String addressZipCheck;

  Boolean authenticated;

  String brand;

  String card;

  String country;

  String customer;

  String cvcCheck;

  String dynamicLast4;

  Long expMonth;

  Long expYear;

  String fingerprint;

  String funding;

  String last4;

  String name;

  Boolean skipValidation;

  String threeDSecure;

  String tokenizationMethod;
}
