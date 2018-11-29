package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntityAdditionalOwner extends StripeObject {
  LegalEntityAddress address;

  LegalEntityDob dob;

  /** The first name of this additional owner. */
  String firstName;

  /** The last name of this additional owner. */
  String lastName;

  /** The maiden name of this additional owner. */
  String maidenName;

  /** Whether the personal ID number of this additional owner was provided. */
  Boolean personalIdNumberProvided;

  LegalEntityVerification verification;
}
