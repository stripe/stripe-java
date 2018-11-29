package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingAuthorizationVerificationData extends StripeObject {
  /** One of `match`, `mismatch`, or `not_provided`. */
  String addressLine1Check;

  /** One of `match`, `mismatch`, or `not_provided`. */
  String addressZipCheck;

  /** One of `match`, `mismatch`, or `not_provided`. */
  String cvcCheck;
}
