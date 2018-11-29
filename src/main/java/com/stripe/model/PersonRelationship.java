package com.stripe.model;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PersonRelationship extends StripeObject {
  /**
   * Whether the person opened the account. This person provides information about themselves, and
   * general information about the account.
   */
  Boolean accountOpener;

  /** Whether the person is a director of the account's legal entity. */
  Boolean director;

  /** Whether the person has a significant control of the account’s legal entity. */
  Boolean executive;

  /** Whether the person is an owner of the account’s legal entity. */
  Boolean owner;

  /** The percent owned by the person of the account's legal entity. */
  BigDecimal percentOwnership;

  /** The person's title (e.g., CEO, Support Engineer). */
  String title;
}
