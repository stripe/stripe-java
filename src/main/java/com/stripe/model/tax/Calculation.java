// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.CalculationCreateParams;
import com.stripe.param.tax.CalculationListLineItemsParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax Calculation allows you to calculate the tax to collect from your customer.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/tax/custom">Calculate tax in your custom
 * payment flow</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Calculation extends ApiResource implements HasId {
  /** Total after taxes. */
  @SerializedName("amount_total")
  Long amountTotal;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of an existing <a href="https://stripe.com/docs/api/customers/object">Customer</a> used
   * for the resource.
   */
  @SerializedName("customer")
  String customer;

  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /** Timestamp of date at which the tax calculation will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the calculation. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The list of items the customer is purchasing. */
  @SerializedName("line_items")
  CalculationLineItemCollection lineItems;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.calculation}.
   */
  @SerializedName("object")
  String object;

  /** The shipping cost details for the calculation. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /** The amount of tax to be collected on top of the line item prices. */
  @SerializedName("tax_amount_exclusive")
  Long taxAmountExclusive;

  /** The amount of tax already included in the line item prices. */
  @SerializedName("tax_amount_inclusive")
  Long taxAmountInclusive;

  /** Breakdown of individual tax amounts that add up to the total. */
  @SerializedName("tax_breakdown")
  List<Calculation.TaxBreakdown> taxBreakdown;

  /** Timestamp of date at which the tax rules and rates in effect applies for the calculation. */
  @SerializedName("tax_date")
  Long taxDate;

  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public static Calculation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public static Calculation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/calculations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Calculation.class, options);
  }

  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public static Calculation create(CalculationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public static Calculation create(CalculationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/calculations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Calculation.class, options);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public CalculationLineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public CalculationLineItemCollection listLineItems(Map<String, Object> params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public CalculationLineItemCollection listLineItems(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CalculationLineItemCollection.class, options);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public CalculationLineItemCollection listLineItems(CalculationListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public CalculationLineItemCollection listLineItems(
      CalculationListLineItemsParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CalculationLineItemCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The customer's postal address (for example, home or business location). */
    @SerializedName("address")
    Address address;

    /**
     * The type of customer address provided.
     *
     * <p>One of {@code billing}, or {@code shipping}.
     */
    @SerializedName("address_source")
    String addressSource;

    /** The customer's IP address (IPv4 or IPv6). */
    @SerializedName("ip_address")
    String ipAddress;

    /** The customer's tax IDs (for example, EU VAT numbers). */
    @SerializedName("tax_ids")
    List<Calculation.CustomerDetails.TaxId> taxIds;

    /**
     * The taxability override used for taxation.
     *
     * <p>One of {@code customer_exempt}, {@code none}, or {@code reverse_charge}.
     */
    @SerializedName("taxability_override")
    String taxabilityOverride;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
       */
      @SerializedName("state")
      String state;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code eu_vat}, {@code br_cnpj}, {@code br_cpf}, {@code
       * eu_oss_vat}, {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code
       * in_gst}, {@code no_vat}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
       * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code
       * tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid},
       * {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code ca_gst_hst}, {@code
       * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst}, {@code sg_gst}, {@code
       * ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code my_frp}, {@code il_vat},
       * {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic}, {@code hu_tin}, {@code
       * si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code ph_tin}, or {@code
       * unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost extends StripeObject {
    /**
     * The shipping amount in integer cents. If {@code tax_behavior=inclusive}, then this amount
     * includes taxes. Otherwise, taxes were calculated on top of this amount.
     */
    @SerializedName("amount")
    Long amount;

    /** The amount of tax calculated for shipping, in integer cents. */
    @SerializedName("amount_tax")
    Long amountTax;

    /**
     * The ID of an existing <a
     * href="https://stripe.com/docs/api/shipping_rates/object">ShippingRate.</a>
     */
    @SerializedName("shipping_rate")
    String shippingRate;

    /**
     * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive}, then
     * the amount includes taxes.
     *
     * <p>One of {@code exclusive}, or {@code inclusive}.
     */
    @SerializedName("tax_behavior")
    String taxBehavior;

    /** Detailed account of taxes relevant to shipping cost. */
    @SerializedName("tax_breakdown")
    List<Calculation.ShippingCost.TaxBreakdown> taxBreakdown;

    /**
     * The <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID used for shipping.
     */
    @SerializedName("tax_code")
    String taxCode;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxBreakdown extends StripeObject {
      /** The amount of tax, in integer cents. */
      @SerializedName("amount")
      Long amount;

      @SerializedName("jurisdiction")
      Jurisdiction jurisdiction;

      /**
       * Indicates whether the jurisdiction was determined by the origin (merchant's address) or
       * destination (customer's address).
       *
       * <p>One of {@code destination}, or {@code origin}.
       */
      @SerializedName("sourcing")
      String sourcing;

      /**
       * Details regarding the rate for this tax. This field will be {@code null} when the tax is
       * not imposed, for example if the product is exempt from tax.
       */
      @SerializedName("tax_rate_details")
      TaxRateDetails taxRateDetails;

      /**
       * The reasoning behind this tax, for example, if the product is tax exempt. The possible
       * values for this field may be extended as new tax rules are supported.
       *
       * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
       * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
       * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
       * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
       * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
       */
      @SerializedName("taxability_reason")
      String taxabilityReason;

      /** The amount on which tax is calculated, in integer cents. */
      @SerializedName("taxable_amount")
      Long taxableAmount;

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
         * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
         * without country prefix. For example, &quot;NY&quot; for New York, United States.
         */
        @SerializedName("state")
        String state;
      }

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
         * <p>One of {@code gst}, {@code hst}, {@code igst}, {@code jct}, {@code lease_tax}, {@code
         * pst}, {@code qst}, {@code rst}, {@code sales_tax}, or {@code vat}.
         */
        @SerializedName("tax_type")
        String taxType;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxBreakdown extends StripeObject {
    /** The amount of tax, in integer cents. */
    @SerializedName("amount")
    Long amount;

    /** Specifies whether the tax amount is included in the line item amount. */
    @SerializedName("inclusive")
    Boolean inclusive;

    @SerializedName("tax_rate_details")
    TaxRateDetails taxRateDetails;

    /** The amount on which tax is calculated, in integer cents. */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRateDetails extends StripeObject {
      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** The tax rate percentage as a string. For example, 8.5% is represented as {@code "8.5"}. */
      @SerializedName("percentage_decimal")
      String percentageDecimal;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      /**
       * The tax type, such as {@code vat} or {@code sales_tax}.
       *
       * <p>One of {@code gst}, {@code hst}, {@code igst}, {@code jct}, {@code lease_tax}, {@code
       * pst}, {@code qst}, {@code rst}, {@code sales_tax}, or {@code vat}.
       */
      @SerializedName("tax_type")
      String taxType;
    }
  }
}
