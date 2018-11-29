package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntityJapanAddress extends StripeObject {
  /** City/Ward. */
  String city;

  /**
   * Two-letter country code ([ISO 3166-1
   * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  String country;

  /** Block/Building number. */
  String line1;

  /** Building details. */
  String line2;

  /** Zip/Postal Code. */
  String postalCode;

  /** Prefecture. */
  String state;

  /** Town/cho-me. */
  String town;
}
