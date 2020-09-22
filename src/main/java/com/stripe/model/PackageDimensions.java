// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PackageDimensions extends StripeObject {
  /** Height, in inches. */
  @SerializedName("height")
  BigDecimal height;

  /** Length, in inches. */
  @SerializedName("length")
  BigDecimal length;

  /** Weight, in ounces. */
  @SerializedName("weight")
  BigDecimal weight;

  /** Width, in inches. */
  @SerializedName("width")
  BigDecimal width;
}
