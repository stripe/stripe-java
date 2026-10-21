// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.data.SearchResultList;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.OperationSearchParams;

public final class OperationService extends ApiService {
  public OperationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Resolve a natural-language query into ranked public analytical resources (schemas, reports, and
   * metrics) with execution context.
   */
  public SearchResultList search(OperationSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Resolve a natural-language query into ranked public analytical resources (schemas, reports, and
   * metrics) with execution context.
   */
  public SearchResultList search(OperationSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/operations/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SearchResultList.class);
  }
}
