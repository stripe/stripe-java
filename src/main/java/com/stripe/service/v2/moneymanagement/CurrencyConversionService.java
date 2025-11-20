// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.CurrencyConversion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.CurrencyConversionCreateParams;
import com.stripe.param.v2.moneymanagement.CurrencyConversionListParams;

public final class CurrencyConversionService extends ApiService {
  public CurrencyConversionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all CurrencyConversion on an account with the option to filter by FinancialAccount. */
  public StripeCollection<CurrencyConversion> list(CurrencyConversionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all CurrencyConversion on an account with the option to filter by FinancialAccount. */
  public StripeCollection<CurrencyConversion> list(RequestOptions options) throws StripeException {
    return list((CurrencyConversionListParams) null, options);
  }
  /** List all CurrencyConversion on an account with the option to filter by FinancialAccount. */
  public StripeCollection<CurrencyConversion> list() throws StripeException {
    return list((CurrencyConversionListParams) null, (RequestOptions) null);
  }
  /** List all CurrencyConversion on an account with the option to filter by FinancialAccount. */
  public StripeCollection<CurrencyConversion> list(
      CurrencyConversionListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/currency_conversions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CurrencyConversion>>() {}.getType());
  }
  /** Create a CurrencyConversion. */
  public CurrencyConversion create(CurrencyConversionCreateParams params)
      throws StripeException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Create a CurrencyConversion. */
  public CurrencyConversion create(CurrencyConversionCreateParams params, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    String path = "/v2/money_management/currency_conversions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CurrencyConversion.class);
  }
  /** Retrieve details of a CurrencyConversion by id. */
  public CurrencyConversion retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve details of a CurrencyConversion by id. */
  public CurrencyConversion retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/currency_conversions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CurrencyConversion.class);
  }
}
