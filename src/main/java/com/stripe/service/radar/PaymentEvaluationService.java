// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.radar.PaymentEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.PaymentEvaluationCreateParams;

public final class PaymentEvaluationService extends ApiService {
  public PaymentEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public PaymentEvaluation create(PaymentEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public PaymentEvaluation create(PaymentEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/payment_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentEvaluation.class);
  }
}
