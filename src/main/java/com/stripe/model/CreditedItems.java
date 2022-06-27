// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditedItems extends StripeObject {
  /**
   * Invoice containing the credited invoice line items.
   */
  @SerializedName("invoice")
  String invoice;

  /**
   * Credited invoice line items.
   */
  @SerializedName("invoice_line_items")
  List<String> invoiceLineItems;
}