// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.AccountEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.AccountEvaluationCreateParams;

public final class AccountEvaluationService extends ApiService {
  public AccountEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a new account evaluation to trigger signal evaluations on an account or account data.
   */
  public AccountEvaluation create(AccountEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new account evaluation to trigger signal evaluations on an account or account data.
   */
  public AccountEvaluation create(AccountEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/account_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountEvaluation.class);
  }
}
