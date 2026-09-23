// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning.catalog;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.provisioning.Provider;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.catalog.ProviderListParams;

public final class ProviderService extends ApiService {
  public ProviderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists providers available in the catalog. */
  public StripeCollection<Provider> list(ProviderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists providers available in the catalog. */
  public StripeCollection<Provider> list(RequestOptions options) throws StripeException {
    return list((ProviderListParams) null, options);
  }
  /** Lists providers available in the catalog. */
  public StripeCollection<Provider> list() throws StripeException {
    return list((ProviderListParams) null, (RequestOptions) null);
  }
  /** Lists providers available in the catalog. */
  public StripeCollection<Provider> list(ProviderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/provisioning/catalog/providers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Provider>>() {}.getType());
  }
}
