// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CalculationCreateParams;
import com.stripe.param.tax.CalculationListLineItemsParams;
import com.stripe.param.tax.CalculationRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax Calculation allows you to calculate the tax to collect from your customer.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/tax/custom">Calculate tax in your custom
 * payment flow</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Calculation extends ApiResource implements HasId {
  /**
   * Total amount after taxes in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
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

  /** The details of the ship from location, such as the address. */
  @SerializedName("ship_from_details")
  ShipFromDetails shipFromDetails;

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

  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public static Calculation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public static Calculation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/calculations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Calculation.class);
  }

  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public static Calculation create(CalculationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public static Calculation create(CalculationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/calculations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Calculation.class);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public CalculationLineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public CalculationLineItemCollection listLineItems(Map<String, Object> params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public CalculationLineItemCollection listLineItems(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, CalculationLineItemCollection.class);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public CalculationLineItemCollection listLineItems(CalculationListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public CalculationLineItemCollection listLineItems(
      CalculationListLineItemsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CalculationLineItemCollection.class);
  }

  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public static Calculation retrieve(String calculation) throws StripeException {
    return retrieve(calculation, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public static Calculation retrieve(String calculation, RequestOptions options)
      throws StripeException {
    return retrieve(calculation, (Map<String, Object>) null, options);
  }

  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public static Calculation retrieve(
      String calculation, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/calculations/%s", ApiResource.urlEncodeId(calculation));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Calculation.class);
  }

  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public static Calculation retrieve(
      String calculation, CalculationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/calculations/%s", ApiResource.urlEncodeId(calculation));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Calculation.class);
  }

  /**
   * For more details about CustomerDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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

    /**
     * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
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

    /**
     * For more details about TaxId, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code ad_nrt}, {@code ar_cuit}, {@code eu_vat}, {@code
       * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
       * {@code do_rcn}, {@code ec_ruc}, {@code eu_oss_vat}, {@code hr_oib}, {@code pe_ruc}, {@code
       * ro_tin}, {@code rs_pib}, {@code sv_nit}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin},
       * {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code
       * no_vat}, {@code no_voec}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
       * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code
       * tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid},
       * {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code ca_gst_hst}, {@code
       * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst}, {@code sg_gst}, {@code
       * ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code my_frp}, {@code il_vat},
       * {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic}, {@code hu_tin}, {@code
       * si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code ph_tin}, {@code bh_vat},
       * {@code kz_bin}, {@code ng_tin}, {@code om_vat}, {@code de_stn}, {@code ch_uid}, {@code
       * tz_vat}, {@code uz_vat}, {@code uz_tin}, {@code md_vat}, {@code ma_vat}, {@code by_tin}, or
       * {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about ShipFromDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShipFromDetails extends StripeObject {
    @SerializedName("address")
    Address address;

    /**
     * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
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
  }

  /**
   * For more details about ShippingCost, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost extends StripeObject {
    /**
     * The shipping amount in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a>. If {@code tax_behavior=inclusive}, then this amount includes taxes.
     * Otherwise, taxes were calculated on top of this amount.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * The amount of tax calculated for shipping, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    @SerializedName("amount_tax")
    Long amountTax;

    /**
     * The ID of an existing <a
     * href="https://stripe.com/docs/api/shipping_rates/object">ShippingRate</a>.
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

    /**
     * For more details about TaxBreakdown, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxBreakdown extends StripeObject {
      /**
       * The amount of tax, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
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

      /**
       * The amount on which tax is calculated, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
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
         * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
         * without country prefix. For example, &quot;NY&quot; for New York, United States.
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
         * <p>One of {@code amusement_tax}, {@code communications_tax}, {@code gst}, {@code hst},
         * {@code igst}, {@code jct}, {@code lease_tax}, {@code pst}, {@code qst}, {@code
         * retail_delivery_fee}, {@code rst}, {@code sales_tax}, or {@code vat}.
         */
        @SerializedName("tax_type")
        String taxType;
      }
    }
  }

  /**
   * For more details about TaxBreakdown, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxBreakdown extends StripeObject {
    /**
     * The amount of tax, in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a>.
     */
    @SerializedName("amount")
    Long amount;

    /** Specifies whether the tax amount is included in the line item amount. */
    @SerializedName("inclusive")
    Boolean inclusive;

    @SerializedName("tax_rate_details")
    TaxRateDetails taxRateDetails;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. We might extend the
     * possible values for this field to support new tax rules.
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
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /**
     * For more details about TaxRateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
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

      /**
       * The amount of the tax rate when the {@code rate_type} is {@code flat_amount}. Tax rates
       * with {@code rate_type} {@code percentage} can vary based on the transaction, resulting in
       * this field being {@code null}. This field exposes the amount and currency of the flat tax
       * rate.
       */
      @SerializedName("flat_amount")
      FlatAmount flatAmount;

      /** The tax rate percentage as a string. For example, 8.5% is represented as {@code "8.5"}. */
      @SerializedName("percentage_decimal")
      String percentageDecimal;

      /**
       * Indicates the type of tax rate applied to the taxable amount. This value can be {@code
       * null} when no tax applies to the location.
       *
       * <p>One of {@code flat_amount}, or {@code percentage}.
       */
      @SerializedName("rate_type")
      String rateType;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      /**
       * The tax type, such as {@code vat} or {@code sales_tax}.
       *
       * <p>One of {@code amusement_tax}, {@code communications_tax}, {@code gst}, {@code hst},
       * {@code igst}, {@code jct}, {@code lease_tax}, {@code pst}, {@code qst}, {@code
       * retail_delivery_fee}, {@code rst}, {@code sales_tax}, or {@code vat}.
       */
      @SerializedName("tax_type")
      String taxType;

      /**
       * The amount of the tax rate when the {@code rate_type`` is }flat_amount{@code . Tax rates
       * with }rate_type{@code }percentage{@code can vary based on the transaction, resulting in
       * this field being}null`. This field exposes the amount and currency of the flat tax rate.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FlatAmount extends StripeObject {
        /**
         * Amount of the tax when the {@code rate_type} is {@code flat_amount}. This positive
         * integer represents how much to charge in the smallest currency unit (e.g., 100 cents to
         * charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The amount value supports
         * up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
         */
        @SerializedName("amount")
        Long amount;

        /** Three-letter ISO currency code, in lowercase. */
        @SerializedName("currency")
        String currency;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(shipFromDetails, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
  }
}
