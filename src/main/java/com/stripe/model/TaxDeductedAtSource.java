package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxDeductedAtSource extends StripeObject implements BalanceTransactionSource {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `tax_deducted_at_source`.
   */
  @SerializedName("object")
  String object;

  /**
   * The end of the invoicing period. This TDS applies to Stripe fees collected during this
   * invoicing period.
   */
  @SerializedName("period_end")
  Long periodEnd;

  /**
   * The start of the invoicing period. This TDS applies to Stripe fees collected during this
   * invoicing period.
   */
  @SerializedName("period_start")
  Long periodStart;

  /** The TAN that was supplied to Stripe when TDS was assessed. */
  @SerializedName("tax_deduction_account_number")
  String taxDeductionAccountNumber;
}
