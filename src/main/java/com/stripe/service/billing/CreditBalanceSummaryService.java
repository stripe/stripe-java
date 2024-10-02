// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.billing.CreditBalanceSummary;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditBalanceSummaryRetrieveParams;

public final class CreditBalanceSummaryService extends ApiService {
  public CreditBalanceSummaryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the credit balance summary for a customer. */
  public CreditBalanceSummary retrieve(CreditBalanceSummaryRetrieveParams params)
      throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieves the credit balance summary for a customer. */
  public CreditBalanceSummary retrieve(
      CreditBalanceSummaryRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/credit_balance_summary";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditBalanceSummary.class);
  }
}
