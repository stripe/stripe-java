// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * EarnedCredit Simulations represent simulated EarnedCredit creation requests for testing purposes.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EarnedCreditSimulation extends StripeObject {
  /** Has the value true if the object exists in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.earned_credit_simulation}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the request, signifying whether simulated EarnedCredit creation was initiated.
   *
   * <p>Equal to {@code accepted}.
   */
  @SerializedName("status")
  String status;
}
