package com.stripe.model.issuing;

import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MerchantData extends StripeObject {
  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](/docs/issuing/merchant-categories) for a list of possible values.
   */
  String category;

  /** City where the seller is located. */
  String city;

  /** Country where the seller is located. */
  String country;

  /** Name of the seller. */
  String name;

  /** Identifier assigned to the seller by the card brand. */
  String networkId;

  /** Postal code where the seller is located. */
  String postalCode;

  /** State where the seller is located. */
  String state;
}
