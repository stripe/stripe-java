// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CalculationLineItem extends StripeObject implements HasId {
  /**
   * The line item amount in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
   * currency unit</a>. If {@code tax_behavior=inclusive}, then this amount includes taxes.
   * Otherwise, taxes were calculated on top of this amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of tax calculated for this line item, in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.calculation_line_item}.
   */
  @SerializedName("object")
  String object;

  /**
   * A tax location for a line item that acts as a performance location. This indicates that the
   * line item might be taxed at the place where it is being performed at. This is helpful for
   * events or other services being performed at non-customer addresses like venues or offices. This
   * can be left empty for tax codes that do not require a tax location. For tax codes where the
   * location requirement is &quot;optional&quot;, this would override the customer address in most
   * use cases.
   */
  @SerializedName("performance_location")
  String performanceLocation;

  /** The ID of an existing <a href="https://docs.stripe.com/api/products/object">Product</a>. */
  @SerializedName("product")
  String product;

  /**
   * The number of units of the item being purchased. For reversals, this is the quantity reversed.
   */
  @SerializedName("quantity")
  Long quantity;

  /** A custom identifier for this line item. */
  @SerializedName("reference")
  String reference;

  /**
   * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive}, then
   * the amount includes taxes.
   *
   * <p>One of {@code exclusive}, or {@code inclusive}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /** Detailed account of taxes relevant to this line item. */
  @SerializedName("tax_breakdown")
  List<CalculationLineItem.TaxBreakdown> taxBreakdown;

  /**
   * The <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID used for this
   * resource.
   */
  @SerializedName("tax_code")
  String taxCode;

  /**
   * For more details about TaxBreakdown, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxBreakdown extends StripeObject {
    /**
     * The amount of tax, in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
     * currency unit</a>.
     */
    @SerializedName("amount")
    Long amount;

    @SerializedName("jurisdiction")
    Jurisdiction jurisdiction;

    /**
     * Indicates whether the jurisdiction was determined by the origin (merchant's address) or
     * destination (customer's address).
     *
     * <p>One of {@code destination}, {@code origin}, or {@code performance}.
     */
    @SerializedName("sourcing")
    String sourcing;

    /**
     * Details regarding the rate for this tax. This field will be {@code null} when the tax is not
     * imposed, for example if the product is exempt from tax.
     */
    @SerializedName("tax_rate_details")
    TaxRateDetails taxRateDetails;

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

    /**
     * The amount on which tax is calculated, in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
     */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /**
     * For more details about Jurisdiction, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jurisdiction extends StripeObject {
      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** A human-readable name for the jurisdiction imposing the tax. */
      @SerializedName("display_name")
      String displayName;

      /**
       * Indicates the level of the jurisdiction imposing the tax.
       *
       * <p>One of {@code city}, {@code country}, {@code county}, {@code district}, or {@code
       * state}.
       */
      @SerializedName("level")
      String level;

      /**
       * <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2 subdivision code</a>, without
       * country prefix. For example, &quot;NY&quot; for New York, United States.
       */
      @SerializedName("state")
      String state;
    }

    /**
     * For more details about TaxRateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRateDetails extends StripeObject {
      /**
       * A localized display name for tax type, intended to be human-readable. For example,
       * &quot;Local Sales and Use Tax&quot;, &quot;Value-added tax (VAT)&quot;, or
       * &quot;Umsatzsteuer (USt.)&quot;.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * The tax rate percentage as a string. For example, 8.5% is represented as &quot;8.5&quot;.
       */
      @SerializedName("percentage_decimal")
      String percentageDecimal;

      /**
       * The tax type, such as {@code vat} or {@code sales_tax}.
       *
       * <p>One of {@code admissions_tax}, {@code amusement_tax}, {@code attendance_tax}, {@code
       * communications_tax}, {@code entertainment_tax}, {@code gross_receipts_tax}, {@code gst},
       * {@code hospitality_tax}, {@code hst}, {@code igst}, {@code jct}, {@code lease_tax}, {@code
       * luxury_tax}, {@code pst}, {@code qst}, {@code resort_tax}, {@code retail_delivery_fee},
       * {@code rst}, {@code sales_tax}, {@code service_tax}, {@code tourism_tax}, or {@code vat}.
       */
      @SerializedName("tax_type")
      String taxType;
    }
  }
}
