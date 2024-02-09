// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A customer's {@code Cash balance} represents real funds. Customers can add funds to their cash
 * balance by sending a bank transfer. These funds can be used for payment and can eventually be
 * paid out to your bank account.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CashBalance extends StripeObject {
  /**
   * A hash of all cash balances available to this customer. You cannot delete a customer with any
   * cash balances, even if the balance is 0. Amounts are represented in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("available")
  Map<String, Long> available;

  /** The ID of the customer whose cash balance this object represents. */
  @SerializedName("customer")
  String customer;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code cash_balance}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("settings")
  Settings settings;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    /**
     * The configuration for how funds that land in the customer cash balance are reconciled.
     *
     * <p>One of {@code automatic}, or {@code manual}.
     */
    @SerializedName("reconciliation_mode")
    String reconciliationMode;

    /**
     * A flag to indicate if reconciliation mode returned is the user's default or is specific to
     * this customer cash balance.
     */
    @SerializedName("using_merchant_default")
    Boolean usingMerchantDefault;
  }
}
