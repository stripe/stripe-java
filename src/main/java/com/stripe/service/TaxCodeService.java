// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxCode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxCodeListParams;
import com.stripe.param.TaxCodeRetrieveParams;

public final class TaxCodeService extends ApiService {
  public TaxCodeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public StripeCollection<TaxCode> list(TaxCodeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public StripeCollection<TaxCode> list(RequestOptions options) throws StripeException {
    return list((TaxCodeListParams) null, options);
  }
  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public StripeCollection<TaxCode> list() throws StripeException {
    return list((TaxCodeListParams) null, (RequestOptions) null);
  }
  /**
   * A list of <a href="https://stripe.com/docs/tax/tax-categories">all tax codes available</a> to
   * add to Products in order to allow specific tax calculations.
   */
  public StripeCollection<TaxCode> list(TaxCodeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_codes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TaxCode>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public TaxCode retrieve(String id, TaxCodeRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public TaxCode retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TaxCodeRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public TaxCode retrieve(String id) throws StripeException {
    return retrieve(id, (TaxCodeRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing tax code. Supply the unique tax code ID and Stripe will
   * return the corresponding tax code information.
   */
  public TaxCode retrieve(String id, TaxCodeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_codes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxCode.class);
  }
}
