// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning.catalog;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.provisioning.ProviderServiceDetail;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.catalog.ServiceListParams;

public final class ServiceService extends ApiService {
  public ServiceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists services available in the catalog. */
  public StripeCollection<ProviderServiceDetail> list(ServiceListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists services available in the catalog. */
  public StripeCollection<ProviderServiceDetail> list(RequestOptions options)
      throws StripeException {
    return list((ServiceListParams) null, options);
  }
  /** Lists services available in the catalog. */
  public StripeCollection<ProviderServiceDetail> list() throws StripeException {
    return list((ServiceListParams) null, (RequestOptions) null);
  }
  /** Lists services available in the catalog. */
  public StripeCollection<ProviderServiceDetail> list(
      ServiceListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/catalog/services";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ProviderServiceDetail>>() {}.getType());
  }
}
