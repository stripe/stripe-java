package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceOwner extends StripeObject {
  /** Owner's address. */
  Address address;

  /** Owner's email address. */
  String email;

  /** Owner's full name. */
  String name;

  /** Owner's phone number (including extension). */
  String phone;

  /**
   * Verified owner's address. Verified values are verified or provided by the payment method
   * directly (and if supported) at the time of authorization or settlement. They cannot be set or
   * mutated.
   */
  Address verifiedAddress;

  /**
   * Verified owner's email address. Verified values are verified or provided by the payment method
   * directly (and if supported) at the time of authorization or settlement. They cannot be set or
   * mutated.
   */
  String verifiedEmail;

  /**
   * Verified owner's full name. Verified values are verified or provided by the payment method
   * directly (and if supported) at the time of authorization or settlement. They cannot be set or
   * mutated.
   */
  String verifiedName;

  /**
   * Verified owner's phone number (including extension). Verified values are verified or provided
   * by the payment method directly (and if supported) at the time of authorization or settlement.
   * They cannot be set or mutated.
   */
  String verifiedPhone;
}
