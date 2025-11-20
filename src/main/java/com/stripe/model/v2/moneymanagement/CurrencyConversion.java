// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The CurrencyConversion object. Contains details such as the amount debited and credited and the
 * FinancialAccount the CurrencyConversion was performed on.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CurrencyConversion extends StripeObject implements HasId {
  /** The time the CurrencyConversion was created at. */
  @SerializedName("created")
  Instant created;

  /** The exchange rate used when processing the CurrencyConversion. */
  @SerializedName("exchange_rate")
  String exchangeRate;

  /** The FinancialAccount the CurrencyConversion was performed on. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The from block containing what was debited. */
  @SerializedName("from")
  From from;

  /** The id of the CurrencyConversion. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** If the CurrencyConversion was performed in livemode or not. */
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

  /** The to block containing what was credited. */
  @SerializedName("to")
  To to;

  /** The from block containing what was debited. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** Amount object. */
    @SerializedName("amount")
    Amount amount;

    /** Amount object. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      @SerializedName("value")
      Long value;
    }
  }

  /** The to block containing what was credited. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** Amount object. */
    @SerializedName("amount")
    Amount amount;

    /** Amount object. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      @SerializedName("value")
      Long value;
    }
  }
}
