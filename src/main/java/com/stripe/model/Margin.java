// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.MarginCreateParams;
import com.stripe.param.MarginListParams;
import com.stripe.param.MarginRetrieveParams;
import com.stripe.param.MarginUpdateParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A (partner) margin represents a specific discount distributed in partner reseller programs to
 * business partners who resell products and services and earn a discount (margin) for doing so.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Margin extends ApiResource implements HasId, MetadataStore<Margin> {
  /**
   * Whether the margin can be applied to invoices, invoice items, or invoice line items. Defaults
   * to {@code true}.
   */
  @SerializedName("active")
  Boolean active;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

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
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Name of the margin that's displayed on, for example, invoices. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code margin}.
   */
  @SerializedName("object")
  String object;

  /**
   * Percent that will be taken off the subtotal before tax (after all other discounts and
   * promotions) of any invoice to which the margin is applied.
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /**
   * Create a margin object to be used with invoices, invoice items, and invoice line items for a
   * customer to represent a partner discount.A margin has a {@code percent_off} which is the
   * percent that will be taken off the subtotal after all items and other discounts and promotions)
   * of any invoices for a customer. Calculation of prorations do not include any partner margins
   * applied on the original invoice item.
   */
  public static Margin create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a margin object to be used with invoices, invoice items, and invoice line items for a
   * customer to represent a partner discount.A margin has a {@code percent_off} which is the
   * percent that will be taken off the subtotal after all items and other discounts and promotions)
   * of any invoices for a customer. Calculation of prorations do not include any partner margins
   * applied on the original invoice item.
   */
  public static Margin create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/margins";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Margin.class);
  }

  /**
   * Create a margin object to be used with invoices, invoice items, and invoice line items for a
   * customer to represent a partner discount.A margin has a {@code percent_off} which is the
   * percent that will be taken off the subtotal after all items and other discounts and promotions)
   * of any invoices for a customer. Calculation of prorations do not include any partner margins
   * applied on the original invoice item.
   */
  public static Margin create(MarginCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a margin object to be used with invoices, invoice items, and invoice line items for a
   * customer to represent a partner discount.A margin has a {@code percent_off} which is the
   * percent that will be taken off the subtotal after all items and other discounts and promotions)
   * of any invoices for a customer. Calculation of prorations do not include any partner margins
   * applied on the original invoice item.
   */
  public static Margin create(MarginCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/margins";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Margin.class);
  }

  /** Retrieve a list of your margins. */
  public static MarginCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of your margins. */
  public static MarginCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/margins";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, MarginCollection.class);
  }

  /** Retrieve a list of your margins. */
  public static MarginCollection list(MarginListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of your margins. */
  public static MarginCollection list(MarginListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/margins";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, MarginCollection.class);
  }

  /** Retrieve a margin object with the given ID. */
  public static Margin retrieve(String margin) throws StripeException {
    return retrieve(margin, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a margin object with the given ID. */
  public static Margin retrieve(String margin, RequestOptions options) throws StripeException {
    return retrieve(margin, (Map<String, Object>) null, options);
  }

  /** Retrieve a margin object with the given ID. */
  public static Margin retrieve(String margin, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/margins/%s", ApiResource.urlEncodeId(margin));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Margin.class);
  }

  /** Retrieve a margin object with the given ID. */
  public static Margin retrieve(String margin, MarginRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/margins/%s", ApiResource.urlEncodeId(margin));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Margin.class);
  }

  /** Update the specified margin object. Certain fields of the margin object are not editable. */
  @Override
  public Margin update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update the specified margin object. Certain fields of the margin object are not editable. */
  @Override
  public Margin update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/margins/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Margin.class);
  }

  /** Update the specified margin object. Certain fields of the margin object are not editable. */
  public Margin update(MarginUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update the specified margin object. Certain fields of the margin object are not editable. */
  public Margin update(MarginUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/margins/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Margin.class);
  }
}
