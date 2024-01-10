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
import com.stripe.param.TaxCodeListParams;
import com.stripe.param.TaxCodeRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <a href="https://stripe.com/docs/tax/tax-categories">Tax codes</a> classify goods and services
 * for tax purposes.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxCode extends ApiResource implements HasId {
  /** A detailed description of which types of products the tax code represents. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** A short name for the tax code. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax_code}.
   */
  @SerializedName("object")
  String object;

  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public static TaxCodeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public static TaxCodeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_codes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, TaxCodeCollection.class);
  }

  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public static TaxCodeCollection list(TaxCodeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public static TaxCodeCollection list(TaxCodeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_codes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, TaxCodeCollection.class);
  }

  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public static TaxCode retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public static TaxCode retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public static TaxCode retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_codes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, TaxCode.class);
  }

  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public static TaxCode retrieve(String id, TaxCodeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_codes/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, TaxCode.class);
  }
}
