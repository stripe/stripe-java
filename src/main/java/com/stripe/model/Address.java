package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Address extends StripeObject {
  /** City/District/Suburb/Town/Village. */
  String city;

  /** 2-letter country code. */
  String country;

  /** Address line 1 (Street address/PO Box/Company name). */
  String line1;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  String line2;

  /** ZIP or postal code. */
  String postalCode;

  /** State/County/Province/Region. */
  String state;
}
