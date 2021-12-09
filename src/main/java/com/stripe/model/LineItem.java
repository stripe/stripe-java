// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LineItem extends StripeObject implements HasId {
  /** Total before any discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total after discounts and taxes. */
  @SerializedName("amount_total")
  Long amountTotal;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Defaults to
   * product name.
   */
  @SerializedName("description")
  String description;

  /** The discounts applied to the line item. */
  @SerializedName("discounts")
  List<LineItem.Discount> discounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code item}.
   */
  @SerializedName("object")
  String object;

  /** The price used to generate the line item. */
  @SerializedName("price")
  Price price;

  /** The quantity of products being purchased. */
  @SerializedName("quantity")
  Long quantity;

  /** The taxes applied to the line item. */
  @SerializedName("taxes")
  List<LineItem.Tax> taxes;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount extends StripeObject {
    /** The amount discounted. */
    @SerializedName("amount")
    Long amount;

    /**
     * A discount represents the actual application of a coupon to a particular customer. It
     * contains information about when the discount began and when it will end.
     *
     * <p>Related guide: <a href="https://stripe.com/docs/billing/subscriptions/discounts">Applying
     * Discounts to Subscriptions</a>.
     */
    @SerializedName("discount")
    Discount discount;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tax extends StripeObject {
    /** Amount of tax applied for this rate. */
    @SerializedName("amount")
    Long amount;

    /**
     * Tax rates can be applied to <a
     * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
     * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
     * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
     * Sessions</a> to collect tax.
     *
     * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax Rates</a>.
     */
    @SerializedName("rate")
    TaxRate rate;
  }
}
