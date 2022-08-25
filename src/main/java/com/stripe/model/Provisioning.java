// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Provisioning extends StripeObject {
  @SerializedName("gift_card")
  GiftCard giftCard;

  /**
   * The type of provisioning, only {@code gift_card} currently supported.
   *
   * <p>Equal to {@code gift_card}.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GiftCard extends StripeObject {
    @SerializedName("fixed_amount")
    FixedAmount fixedAmount;

    /**
     * The specific type of gift_card provisioning, only {@code fixed_amount} currently supported.
     *
     * <p>Equal to {@code fixed_amount}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FixedAmount extends StripeObject {
      /** The initial amount with which the provisioned gift card will be created. */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;
    }
  }
}
