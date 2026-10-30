// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Currency Conversion represents a standalone conversion between currencies in a <a
 * href="https://docs.stripe.com/api/v2/money-management/financial-accounts">Financial Account</a>
 * or the payments balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CurrencyConversion extends StripeObject implements HasId {
  /** The time the Currency Conversion was created at. */
  @SerializedName("created")
  Instant created;

  /** The exchange rate used, excluding applicable fees. */
  @SerializedName("exchange_rate")
  String exchangeRate;

  /**
   * The ID of the Financial Account the Currency Conversion was created in. If {@code null}, it was
   * created in the payments balance.
   */
  @SerializedName("financial_account")
  String financialAccount;

  /** The amount that was debited from the source currency. */
  @SerializedName("from")
  From from;

  /** The ID of the Currency Conversion. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.currency_conversion}.
   */
  @SerializedName("object")
  String object;

  /** The amount that was credited to the destination currency. */
  @SerializedName("to")
  To to;

  /** The amount that was debited from the source currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** A specific amount. */
    @SerializedName("amount")
    Amount amount;
  }

  /** The amount that was credited to the destination currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** A specific amount. */
    @SerializedName("amount")
    Amount amount;
  }
}
