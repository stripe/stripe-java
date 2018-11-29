package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxInfoVerification extends StripeObject {
  /**
   * The state of verification for this customer. Possible values are `unverified`, `pending`, or
   * `verified`.
   */
  String status;

  /** The official name associated with the tax ID returned from the external provider. */
  String verifiedName;
}
