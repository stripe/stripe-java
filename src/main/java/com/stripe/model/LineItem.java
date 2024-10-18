// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A line item. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LineItem extends StripeObject implements HasId {
  /** Total discount amount applied. If no discounts were applied, defaults to 0. */
  @SerializedName("amount_discount")
  Long amountDiscount;

  /** Total before any discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total tax amount applied. If no tax was applied, defaults to 0. */
  @SerializedName("amount_tax")
  Long amountTax;

  /** Total after discounts and taxes. */
  @SerializedName("amount_total")
  Long amountTotal;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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

  /**
   * The ID of the product for this line item.
   *
   * <p>This will always be the same as {@code price.product}.
   */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /** The quantity of products being purchased. */
  @SerializedName("quantity")
  Long quantity;

  /** The taxes applied to the line item. */
  @SerializedName("taxes")
  List<LineItem.Tax> taxes;

  /** Get ID of expandable {@code product} object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded {@code product}. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /**
   * For more details about Discount, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount extends StripeObject {
    /** The amount discounted. */
    @SerializedName("amount")
    Long amount;

    /**
     * A discount represents the actual application of a <a
     * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
     * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
     * information about when the discount began, when it will end, and what it is applied to.
     *
     * <p>Related guide: <a href="https://stripe.com/docs/billing/subscriptions/discounts">Applying
     * discounts to subscriptions</a>
     */
    @SerializedName("discount")
    com.stripe.model.Discount discount;
  }

  /**
   * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
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
     * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
     */
    @SerializedName("rate")
    TaxRate rate;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values
     * for this field may be extended as new tax rules are supported.
     *
     * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
     * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
     * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday}, {@code
     * proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code standard_rated},
     * {@code taxable_basis_reduced}, or {@code zero_rated}.
     */
    @SerializedName("taxability_reason")
    String taxabilityReason;

    /** The amount on which tax is calculated, in cents (or local equivalent). */
    @SerializedName("taxable_amount")
    Long taxableAmount;
  }
}
