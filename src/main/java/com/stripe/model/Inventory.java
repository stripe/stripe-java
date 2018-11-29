package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Inventory extends StripeObject {
  /** The count of inventory available. Will be present if and only if `type` is `finite`. */
  Long quantity;

  /** Inventory type. Possible values are `finite`, `bucket` (not quantified), and `infinite`. */
  String type;

  /**
   * An indicator of the inventory available. Possible values are `in_stock`, `limited`, and
   * `out_of_stock`. Will be present if and only if `type` is `bucket`.
   */
  String value;
}
