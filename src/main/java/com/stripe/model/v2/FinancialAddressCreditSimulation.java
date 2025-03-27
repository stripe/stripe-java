// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressCreditSimulation extends StripeObject {
  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code financial_address_credit_simulation}.
   */
  @SerializedName("object")
  String object;

  /** The status of the request, signifying whether a simulated credit was initiated. */
  @SerializedName("status")
  String status;
}
