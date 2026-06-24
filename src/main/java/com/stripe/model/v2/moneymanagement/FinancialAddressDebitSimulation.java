// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Debit Simulations represent a simulated debit transaction applied to financial addresses for
 * testing purposes.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressDebitSimulation extends StripeObject {
  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_address_debit_simulation}.
   */
  @SerializedName("object")
  String object;

  /** The status of the request, signifying whether a simulated debit was initiated. */
  @SerializedName("status")
  String status;
}
