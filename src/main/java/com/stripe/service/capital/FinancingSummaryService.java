// File generated from our OpenAPI spec
package com.stripe.service.capital;

import com.stripe.exception.StripeException;
import com.stripe.model.capital.FinancingSummary;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingSummaryRetrieveParams;

public final class FinancingSummaryService extends ApiService {
  public FinancingSummaryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve the financing state for the account that was authenticated in the request. */
  public FinancingSummary retrieve(FinancingSummaryRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieve the financing state for the account that was authenticated in the request. */
  public FinancingSummary retrieve(RequestOptions options) throws StripeException {
    return retrieve((FinancingSummaryRetrieveParams) null, options);
  }
  /** Retrieve the financing state for the account that was authenticated in the request. */
  public FinancingSummary retrieve() throws StripeException {
    return retrieve((FinancingSummaryRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve the financing state for the account that was authenticated in the request. */
  public FinancingSummary retrieve(FinancingSummaryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/capital/financing_summary";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FinancingSummary.class);
  }
}
