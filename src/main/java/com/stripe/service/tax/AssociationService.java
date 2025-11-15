// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.tax.Association;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.AssociationFindParams;

public final class AssociationService extends ApiService {
  public AssociationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public Association find(AssociationFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }
  /** Finds a tax association object by PaymentIntent id. */
  public Association find(AssociationFindParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/associations/find";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Association.class);
  }
}
