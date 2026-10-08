// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.FundingSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.FundingSessionCreateParams;

public final class FundingSessionService extends ApiService {
  public FundingSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Create a FundingSession: a hosted funding surface for a customer to fund a FinancialAccount.
   */
  public FundingSession create(FundingSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create a FundingSession: a hosted funding surface for a customer to fund a FinancialAccount.
   */
  public FundingSession create(FundingSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/funding_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FundingSession.class);
  }
}
