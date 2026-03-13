// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.radar.CustomerEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.CustomerEvaluationCreateParams;

public final class CustomerEvaluationService extends ApiService {
  public CustomerEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new {@code CustomerEvaluation} object. */
  public CustomerEvaluation create(CustomerEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code CustomerEvaluation} object. */
  public CustomerEvaluation create(CustomerEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/customer_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomerEvaluation.class);
  }
}
