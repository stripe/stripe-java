package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntityDob extends StripeObject {
  /** The day of birth, between 1 and 31. */
  Long day;

  /** The month of birth, between 1 and 12. */
  Long month;

  /** The four-digit year of birth. */
  Long year;
}
