// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxFund;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxFundListParams;
import com.stripe.param.TaxFundRetrieveParams;

public final class TaxFundService extends ApiService {
  public TaxFundService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of tax funds in reverse chronological order. */
  public StripeCollection<TaxFund> list(TaxFundListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of tax funds in reverse chronological order. */
  public StripeCollection<TaxFund> list(RequestOptions options) throws StripeException {
    return list((TaxFundListParams) null, options);
  }
  /** Returns a list of tax funds in reverse chronological order. */
  public StripeCollection<TaxFund> list() throws StripeException {
    return list((TaxFundListParams) null, (RequestOptions) null);
  }
  /** Returns a list of tax funds in reverse chronological order. */
  public StripeCollection<TaxFund> list(TaxFundListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_funds";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TaxFund>>() {}.getType());
  }
  /** Retrieves a tax fund object by its ID. */
  public TaxFund retrieve(String taxFund, TaxFundRetrieveParams params) throws StripeException {
    return retrieve(taxFund, params, (RequestOptions) null);
  }
  /** Retrieves a tax fund object by its ID. */
  public TaxFund retrieve(String taxFund, RequestOptions options) throws StripeException {
    return retrieve(taxFund, (TaxFundRetrieveParams) null, options);
  }
  /** Retrieves a tax fund object by its ID. */
  public TaxFund retrieve(String taxFund) throws StripeException {
    return retrieve(taxFund, (TaxFundRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a tax fund object by its ID. */
  public TaxFund retrieve(String taxFund, TaxFundRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_funds/%s", ApiResource.urlEncodeId(taxFund));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxFund.class);
  }
}
