// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.radar.BillingEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.BillingEvaluationCreateParams;

public final class BillingEvaluationService extends ApiService {
  public BillingEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public BillingEvaluation create(BillingEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public BillingEvaluation create(BillingEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/billing_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BillingEvaluation.class);
  }
}
