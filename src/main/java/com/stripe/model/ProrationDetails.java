// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProrationDetails extends StripeObject {
  /**
   * For a credit proration {@code line_item}, the original debit line_items to which the credit proration applies.
   */
  @SerializedName("credited_items")
  CreditedItems creditedItems;
}