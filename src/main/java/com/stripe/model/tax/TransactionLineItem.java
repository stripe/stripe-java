// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionLineItem extends StripeObject implements HasId {
  /**
   * The line item amount in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
   * currency unit</a>. If {@code tax_behavior=inclusive}, then this amount includes taxes.
   * Otherwise, taxes were calculated on top of this amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of tax calculated for this line item, in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount_tax")
  Long amountTax;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.transaction_line_item}.
   */
  @SerializedName("object")
  String object;

  /** The ID of an existing <a href="https://stripe.com/docs/api/products/object">Product</a>. */
  @SerializedName("product")
  String product;

  /**
   * The number of units of the item being purchased. For reversals, this is the quantity reversed.
   */
  @SerializedName("quantity")
  Long quantity;

  /** A custom identifier for this line item in the transaction. */
  @SerializedName("reference")
  String reference;

  /** If {@code type=reversal}, contains information about what was reversed. */
  @SerializedName("reversal")
  Reversal reversal;

  /**
   * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive}, then
   * the amount includes taxes.
   *
   * <p>One of {@code exclusive}, or {@code inclusive}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /**
   * The <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID used for this
   * resource.
   */
  @SerializedName("tax_code")
  String taxCode;

  /**
   * If {@code reversal}, this line item reverses an earlier transaction.
   *
   * <p>One of {@code reversal}, or {@code transaction}.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reversal extends StripeObject {
    /** The {@code id} of the line item to reverse in the original transaction. */
    @SerializedName("original_line_item")
    String originalLineItem;
  }
}
