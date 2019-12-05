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
   * Defaults to `true`. When set to `false`, this tax rate cannot be applied to objects in the API,
   * but will still be applied to subscriptions and invoices that already have it set.
   */
  @SerializedName("active")
  Boolean active;

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

  /** The jurisdiction for the tax rate. */
  @SerializedName("jurisdiction")
  String jurisdiction;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `tax_rate`.
   */
  @SerializedName("object")
  String object;

  /** This represents the tax rate percent out of 100. */
  @SerializedName("percentage")
  BigDecimal percentage;

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
