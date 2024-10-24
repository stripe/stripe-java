// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxRateCreateParams;
import com.stripe.param.TaxRateListParams;
import com.stripe.param.TaxRateRetrieveParams;
import com.stripe.param.TaxRateUpdateParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Tax rates can be applied to <a
 * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
 * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
 * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
 * Sessions</a> to collect tax.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxRate extends ApiResource implements HasId, MetadataStore<TaxRate> {
  /**
   * Defaults to {@code true}. When set to {@code false}, this tax rate cannot be used with new
   * applications or Checkout Sessions, but will still work for subscriptions and invoices that
   * already have it set.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible
   * to your customers.
   */
  @SerializedName("description")
  String description;

  /**
   * The display name of the tax rates as it will appear to your customer on their receipt email,
   * PDF, and the hosted invoice page.
   */
  @SerializedName("display_name")
  String displayName;

  /**
   * Actual/effective tax rate percentage out of 100. For tax calculations with
   * automatic_tax[enabled]=true, this percentage reflects the rate actually used to calculate tax
   * based on the product's taxability and whether the user is registered to collect taxes in the
   * corresponding jurisdiction.
   */
  @SerializedName("effective_percentage")
  BigDecimal effectivePercentage;

  /**
   * The amount of the tax rate when the {@code rate_type} is {@code flat_amount}. Tax rates with
   * {@code rate_type} {@code percentage} can vary based on the transaction, resulting in this field
   * being {@code null}. This field exposes the amount and currency of the flat tax rate.
   */
  @SerializedName("flat_amount")
  FlatAmount flatAmount;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** This specifies if the tax rate is inclusive or exclusive. */
  @SerializedName("inclusive")
  Boolean inclusive;

  /**
   * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It
   * also appears on your customer’s invoice.
   */
  @SerializedName("jurisdiction")
  String jurisdiction;

  /**
   * The level of the jurisdiction that imposes this tax rate. Will be {@code null} for manually
   * defined tax rates.
   *
   * <p>One of {@code city}, {@code country}, {@code county}, {@code district}, {@code multiple}, or
   * {@code state}.
   */
  @SerializedName("jurisdiction_level")
  String jurisdictionLevel;

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
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax_rate}.
   */
  @SerializedName("object")
  String object;

  /**
   * Tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true, this
   * percentage includes the statutory tax rate of non-taxable jurisdictions.
   */
  @SerializedName("percentage")
  BigDecimal percentage;

  /**
   * Indicates the type of tax rate applied to the taxable amount. This value can be {@code null}
   * when no tax applies to the location.
   *
   * <p>One of {@code flat_amount}, or {@code percentage}.
   */
  @SerializedName("rate_type")
  String rateType;

  /**
   * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>, without
   * country prefix. For example, &quot;NY&quot; for New York, United States.
   */
  @SerializedName("state")
  String state;

  /**
   * The high-level tax type, such as {@code vat} or {@code sales_tax}.
   *
   * <p>One of {@code amusement_tax}, {@code communications_tax}, {@code gst}, {@code hst}, {@code
   * igst}, {@code jct}, {@code lease_tax}, {@code pst}, {@code qst}, {@code retail_delivery_fee},
   * {@code rst}, {@code sales_tax}, or {@code vat}.
   */
  @SerializedName("tax_type")
  String taxType;

  /** Creates a new tax rate. */
  public static TaxRate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_rates";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, TaxRate.class);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(TaxRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(TaxRateCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_rates";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxRate.class);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_rates";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxRateCollection.class);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(TaxRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(TaxRateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_rates";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxRateCollection.class);
  }

  /** Retrieves a tax rate with the given ID. */
  public static TaxRate retrieve(String taxRate) throws StripeException {
    return retrieve(taxRate, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a tax rate with the given ID. */
  public static TaxRate retrieve(String taxRate, RequestOptions options) throws StripeException {
    return retrieve(taxRate, (Map<String, Object>) null, options);
  }

  /** Retrieves a tax rate with the given ID. */
  public static TaxRate retrieve(String taxRate, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxRate.class);
  }

  /** Retrieves a tax rate with the given ID. */
  public static TaxRate retrieve(
      String taxRate, TaxRateRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxRate.class);
  }

  /** Updates an existing tax rate. */
  @Override
  public TaxRate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing tax rate. */
  @Override
  public TaxRate update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, TaxRate.class);
  }

  /** Updates an existing tax rate. */
  public TaxRate update(TaxRateUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing tax rate. */
  public TaxRate update(TaxRateUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, TaxRate.class);
  }

  /**
   * The amount of the tax rate when the {@code rate_type`` is }flat_amount{@code . Tax rates with
   * }rate_type{@code }percentage{@code can vary based on the transaction, resulting in this field
   * being}null`. This field exposes the amount and currency of the flat tax rate.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FlatAmount extends StripeObject {
    /**
     * Amount of the tax when the {@code rate_type} is {@code flat_amount}. This positive integer
     * represents how much to charge in the smallest currency unit (e.g., 100 cents to charge $1.00
     * or 100 to charge ¥100, a zero-decimal currency). The amount value supports up to eight digits
     * (e.g., a value of 99999999 for a USD charge of $999,999.99).
     */
    @SerializedName("amount")
    Long amount;

    /** Three-letter ISO currency code, in lowercase. */
    @SerializedName("currency")
    String currency;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(flatAmount, responseGetter);
  }
}
