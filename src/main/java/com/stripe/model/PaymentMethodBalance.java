// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * PaymentMethodBalance objects represent balances available on a payment method. You can use
 * v1/payment_methods/:id/check_balance to check the balance of a payment method.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodBalance extends StripeObject {
  /** The time at which the balance was calculated. Measured in seconds since the Unix epoch. */
  @SerializedName("as_of")
  Long asOf;

  /** BalanceEntry contain information about every individual balance type of a card. */
  @SerializedName("balance")
  Balance balance;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_method_balance}.
   */
  @SerializedName("object")
  String object;

  /** BalanceEntry contain information about every individual balance type of a card. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    /** The available FR Meal Voucher balances. */
    @SerializedName("fr_meal_voucher")
    FrMealVoucher frMealVoucher;

    /**
     * For more details about FrMealVoucher, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FrMealVoucher extends StripeObject {
      /** The hashes of balances and amounts for available balances. */
      @SerializedName("available")
      List<PaymentMethodBalance.Balance.FrMealVoucher.Available> available;

      /**
       * For more details about Available, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Available extends StripeObject {
        /** The amount of the balance. */
        @SerializedName("amount")
        Long amount;

        /** The currency of the balance. */
        @SerializedName("currency")
        String currency;
      }
    }
  }
}
