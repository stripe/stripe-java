// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxRateCreateParams;
import com.stripe.param.TaxRateListParams;
import com.stripe.param.TaxRateRetrieveParams;
import com.stripe.param.TaxRateUpdateParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  /** This represents the tax rate percent out of 100. */
  @SerializedName("percentage")
  BigDecimal percentage;

  /**
   * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>, without
   * country prefix. For example, &quot;NY&quot; for New York, United States.
   */
  @SerializedName("state")
  String state;

  /**
   * The high-level tax type, such as {@code vat} or {@code sales_tax}.
   *
   * <p>One of {@code gst}, {@code hst}, {@code jct}, {@code pst}, {@code qst}, {@code rst}, {@code
   * sales_tax}, or {@code vat}.
   */
  @SerializedName("tax_type")
  String taxType;

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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return ApiResource.requestCollection(url, params, TaxRateCollection.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return ApiResource.requestCollection(url, params, TaxRateCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, TaxRate.class, options);
  }

  /** Retrieves a tax rate with the given ID. */
  public static TaxRate retrieve(
      String taxRate, TaxRateRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, TaxRate.class, options);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(TaxRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new tax rate. */
  public static TaxRate create(TaxRateCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /** Updates an existing tax rate. */
  @Override
  public TaxRate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing tax rate. */
  @Override
  public TaxRate update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /** Updates an existing tax rate. */
  public TaxRate update(TaxRateUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing tax rate. */
  public TaxRate update(TaxRateUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }
}
