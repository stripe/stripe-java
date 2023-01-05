// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.LineItemCollection;
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

/** A Tax {@code Calculation} allows you to calculate the tax to collect from your customer. */
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

  /**
   * Timestamp of date at which the tax calculation will expire. Empty if the calculation is an
   * unsaved preview.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the calculation. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The list of items the customer is purchasing. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

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

  /** A custom unique identifier, such as 'myOrder_123'. */
  @SerializedName("reference")
  String reference;

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

  /** Calculates tax based on input and returns a Tax <code>Calculation</code> object. */
  public static Calculation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on input and returns a Tax <code>Calculation</code> object. */
  public static Calculation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/calculations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Calculation.class, options);
  }

  /** Calculates tax based on input and returns a Tax <code>Calculation</code> object. */
  public static Calculation create(CalculationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Calculates tax based on input and returns a Tax <code>Calculation</code> object. */
  public static Calculation create(CalculationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/calculations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Calculation.class, options);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public LineItemCollection listLineItems(CalculationListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public LineItemCollection listLineItems(
      CalculationListLineItemsParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The customer's postal address (e.g., home or business location). */
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

    /** The customer's tax IDs (e.g., EU VAT numbers). */
    @SerializedName("tax_ids")
    List<Calculation.CustomerDetails.TaxId> taxIds;

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
       * <p>One of {@code gst}, {@code hst}, {@code jct}, {@code pst}, {@code qst}, {@code rst},
       * {@code sales_tax}, or {@code vat}.
       */
      @SerializedName("tax_type")
      String taxType;
    }
  }
}
