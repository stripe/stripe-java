// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressGeneratedMicrodeposits extends StripeObject {
  /** The amounts of the microdeposits that were generated. */
  @SerializedName("amounts")
  List<Amount> amounts;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code financial_address_generated_microdeposits}.
   */
  @SerializedName("object")
  String object;

  /**
   * Closed Enum. The status of the request.
   *
   * <p>Equal to {@code accepted}.
   */
  @SerializedName("status")
  String status;
}
