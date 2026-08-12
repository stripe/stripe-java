// File generated from our OpenAPI spec
package com.stripe.service.v2.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.tax.OperationsResolveAddressResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.tax.OperationResolveAddressParams;

public final class OperationService extends ApiService {
  public OperationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Resolves an address to its tax precision level. */
  public OperationsResolveAddressResult resolveAddress(OperationResolveAddressParams params)
      throws StripeException {
    return resolveAddress(params, (RequestOptions) null);
  }
  /** Resolves an address to its tax precision level. */
  public OperationsResolveAddressResult resolveAddress(
      OperationResolveAddressParams params, RequestOptions options) throws StripeException {
    String path = "/v2/tax/operations/resolve_address";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OperationsResolveAddressResult.class);
  }
}
