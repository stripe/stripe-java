package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountLink extends StripeObject {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** The timestamp at which this account link will expire. */
  Long expiresAt;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The URL for the account link. */
  String url;
}
