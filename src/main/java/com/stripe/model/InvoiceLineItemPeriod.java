// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceLineItemPeriod extends StripeObject {
  /** The end of the period, which must be greater than or equal to the start. */
  @SerializedName("end")
  Long end;

  /** The start of the period. */
  @SerializedName("start")
  Long start;
}
