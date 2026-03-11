// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.radar.IssuingAuthorizationEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.IssuingAuthorizationEvaluationCreateParams;

public final class IssuingAuthorizationEvaluationService extends ApiService {
  public IssuingAuthorizationEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public IssuingAuthorizationEvaluation create(IssuingAuthorizationEvaluationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public IssuingAuthorizationEvaluation create(
      IssuingAuthorizationEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/issuing_authorization_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, IssuingAuthorizationEvaluation.class);
  }
}
