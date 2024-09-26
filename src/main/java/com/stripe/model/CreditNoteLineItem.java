// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.billing.CreditBalanceTransaction;
import com.stripe.net.ApiResource;
import java.math.BigDecimal;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The credit note line item object. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditNoteLineItem extends StripeObject implements HasId {
  /**
   * The integer amount in cents (or local equivalent) representing the gross amount being credited
   * for this line item, excluding (exclusive) tax and discounts.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The integer amount in cents (or local equivalent) representing the amount being credited for
   * this line item, excluding all tax and discounts.
   */
  @SerializedName("amount_excluding_tax")
  Long amountExcludingTax;

  /** Description of the item being credited. */
  @SerializedName("description")
  String description;

  /**
   * The integer amount in cents (or local equivalent) representing the discount being credited for
   * this line item.
   */
  @SerializedName("discount_amount")
  Long discountAmount;

  /** The amount of discount calculated per discount for this line item. */
  @SerializedName("discount_amounts")
  List<CreditNoteLineItem.DiscountAmount> discountAmounts;

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

  @SerializedName("pretax_credit_amounts")
  List<CreditNoteLineItem.PretaxCreditAmount> pretaxCreditAmounts;

  /** The number of units of product being credited. */
  @SerializedName("quantity")
  Long quantity;

  /** The amount of tax calculated per tax rate for this line item. */
  @SerializedName("tax_amounts")
  List<CreditNoteLineItem.TaxAmount> taxAmounts;

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

  /**
   * The amount in cents (or local equivalent) representing the unit amount being credited for this
   * line item, excluding all tax and discounts.
   */
  @SerializedName("unit_amount_excluding_tax")
  BigDecimal unitAmountExcludingTax;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DiscountAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the discount. */
    @SerializedName("amount")
    Long amount;

    /** The discount that was applied to get this discount amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PretaxCreditAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the pretax credit amount. */
    @SerializedName("amount")
    Long amount;

    /** The credit balance transaction that was applied to get this pretax credit amount. */
    @SerializedName("credit_balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<CreditBalanceTransaction> creditBalanceTransaction;

    /** The discount that was applied to get this pretax credit amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /**
     * Type of the pretax credit amount referenced.
     *
     * <p>One of {@code credit_balance_transaction}, or {@code discount}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code creditBalanceTransaction} object. */
    public String getCreditBalanceTransaction() {
      return (this.creditBalanceTransaction != null) ? this.creditBalanceTransaction.getId() : null;
    }

    public void setCreditBalanceTransaction(String id) {
      this.creditBalanceTransaction =
          ApiResource.setExpandableFieldId(id, this.creditBalanceTransaction);
    }

    /** Get expanded {@code creditBalanceTransaction}. */
    public CreditBalanceTransaction getCreditBalanceTransactionObject() {
      return (this.creditBalanceTransaction != null)
          ? this.creditBalanceTransaction.getExpanded()
          : null;
    }

    public void setCreditBalanceTransactionObject(CreditBalanceTransaction expandableObject) {
      this.creditBalanceTransaction =
          new ExpandableField<CreditBalanceTransaction>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the tax. */
    @SerializedName("amount")
    Long amount;

    /** Whether this tax amount is inclusive or exclusive. */
    @SerializedName("inclusive")
    Boolean inclusive;

    /** The tax rate that was applied to get this tax amount. */
    @SerializedName("tax_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<TaxRate> taxRate;

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

    /** Get ID of expandable {@code taxRate} object. */
    public String getTaxRate() {
      return (this.taxRate != null) ? this.taxRate.getId() : null;
    }

    public void setTaxRate(String id) {
      this.taxRate = ApiResource.setExpandableFieldId(id, this.taxRate);
    }

    /** Get expanded {@code taxRate}. */
    public TaxRate getTaxRateObject() {
      return (this.taxRate != null) ? this.taxRate.getExpanded() : null;
    }

    public void setTaxRateObject(TaxRate expandableObject) {
      this.taxRate = new ExpandableField<TaxRate>(expandableObject.getId(), expandableObject);
    }
  }
}
