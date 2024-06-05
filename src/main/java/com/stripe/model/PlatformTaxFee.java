// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PlatformTaxFee extends StripeObject implements BalanceTransactionSource {
  /** The Connected account that incurred this charge. */
  @SerializedName("account")
  String account;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code platform_tax_fee}.
   */
  @SerializedName("object")
  String object;

  /** The payment object that caused this tax to be inflicted. */
  @SerializedName("source_transaction")
  String sourceTransaction;

  /** The type of tax (VAT). */
  @SerializedName("type")
  String type;
}
