// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.FxQuoteExpiredException;
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

  /** Lists all Currency Conversions that match the provided filters. */
  public StripeCollection<CurrencyConversion> list(CurrencyConversionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all Currency Conversions that match the provided filters. */
  public StripeCollection<CurrencyConversion> list(RequestOptions options) throws StripeException {
    return list((CurrencyConversionListParams) null, options);
  }
  /** Lists all Currency Conversions that match the provided filters. */
  public StripeCollection<CurrencyConversion> list() throws StripeException {
    return list((CurrencyConversionListParams) null, (RequestOptions) null);
  }
  /** Lists all Currency Conversions that match the provided filters. */
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
  /** Create a new Currency Conversion in a Financial Account or the payments balance. */
  public CurrencyConversion create(CurrencyConversionCreateParams params)
      throws StripeException, FxQuoteExpiredException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new Currency Conversion in a Financial Account or the payments balance. */
  public CurrencyConversion create(CurrencyConversionCreateParams params, RequestOptions options)
      throws StripeException, FxQuoteExpiredException, FeatureNotEnabledException {
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
  /** Retrieves the details of a Currency Conversion by its ID. */
  public CurrencyConversion retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of a Currency Conversion by its ID. */
  public CurrencyConversion retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/currency_conversions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CurrencyConversion.class);
  }
}
