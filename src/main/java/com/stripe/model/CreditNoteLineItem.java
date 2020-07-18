package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditNoteLineItem extends StripeObject implements HasId {
  /**
   * The integer amount in <strong>%s</strong> representing the gross amount being credited for this
   * line item, excluding (exclusive) tax and discounts.
   */
  @SerializedName("amount")
  Long amount;

  /** Description of the item being credited. */
  @SerializedName("description")
  String description;

  /**
   * The integer amount in <strong>%s</strong> representing the discount being credited for this
   * line item.
   */
  @SerializedName("discount_amount")
  Long discountAmount;

  /** The amount of discount calculated per discount for this line item. */
  @SerializedName("discount_amounts")
  List<Invoice.DiscountAmount> discountAmounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the invoice line item being credited. */
  @SerializedName("invoice_line_item")
  String invoiceLineItem;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code credit_note_line_item}.
   */
  @SerializedName("object")
  String object;

  /** The number of units of product being credited. */
  @SerializedName("quantity")
  Long quantity;

  /** The amount of tax calculated per tax rate for this line item. */
  @SerializedName("tax_amounts")
  List<CreditNote.TaxAmount> taxAmounts;

  /** The tax rates which apply to the line item. */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;

  /**
   * The type of the credit note line item, one of {@code invoice_line_item} or {@code
   * custom_line_item}. When the type is {@code invoice_line_item} there is an additional {@code
   * invoice_line_item} property on the resource the value of which is the id of the credited line
   * item on the invoice.
   */
  @SerializedName("type")
  String type;

  /** The cost of each unit of product being credited. */
  @SerializedName("unit_amount")
  Long unitAmount;

  /** Same as {@code unit_amount}, but contains a decimal value with at most 12 decimal places. */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;
}
