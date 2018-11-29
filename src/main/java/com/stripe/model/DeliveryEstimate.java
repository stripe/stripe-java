package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DeliveryEstimate extends StripeObject {
  /** If `type` is `"exact"`, `date` will be the expected delivery date in the format YYYY-MM-DD. */
  String date;

  /**
   * If `type` is `"range"`, `earliest` will be be the earliest delivery date in the format
   * YYYY-MM-DD.
   */
  String earliest;

  /** If `type` is `"range"`, `latest` will be the latest delivery date in the format YYYY-MM-DD. */
  String latest;

  /** The type of estimate. Must be either `"range"` or `"exact"`. */
  String type;
}
