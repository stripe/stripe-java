// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CountrySpec;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CountrySpecListParams;
import com.stripe.param.CountrySpecRetrieveParams;

public final class CountrySpecService extends ApiService {
  public CountrySpecService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all Country Spec objects available in the API. */
  public StripeCollection<CountrySpec> list(CountrySpecListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all Country Spec objects available in the API. */
  public StripeCollection<CountrySpec> list(RequestOptions options) throws StripeException {
    return list((CountrySpecListParams) null, options);
  }
  /** Lists all Country Spec objects available in the API. */
  public StripeCollection<CountrySpec> list() throws StripeException {
    return list((CountrySpecListParams) null, (RequestOptions) null);
  }
  /** Lists all Country Spec objects available in the API. */
  public StripeCollection<CountrySpec> list(CountrySpecListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/country_specs";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CountrySpec>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Returns a Country Spec for a given Country code. */
  public CountrySpec retrieve(String country, CountrySpecRetrieveParams params)
      throws StripeException {
    return retrieve(country, params, (RequestOptions) null);
  }
  /** Returns a Country Spec for a given Country code. */
  public CountrySpec retrieve(String country, RequestOptions options) throws StripeException {
    return retrieve(country, (CountrySpecRetrieveParams) null, options);
  }
  /** Returns a Country Spec for a given Country code. */
  public CountrySpec retrieve(String country) throws StripeException {
    return retrieve(country, (CountrySpecRetrieveParams) null, (RequestOptions) null);
  }
  /** Returns a Country Spec for a given Country code. */
  public CountrySpec retrieve(
      String country, CountrySpecRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/country_specs/%s", ApiResource.urlEncodeId(country));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CountrySpec.class,
            options,
            ApiMode.V1);
  }
}
