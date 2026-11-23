// File generated from our OpenAPI spec
package com.stripe.service.v2.risk;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.risk.EvaluationOutcome;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.risk.EvaluationOutcomeListParams;

public final class EvaluationOutcomeService extends ApiService {
  public EvaluationOutcomeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all matching historical evaluation outcomes, newest first. */
  public StripeCollection<EvaluationOutcome> list(EvaluationOutcomeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all matching historical evaluation outcomes, newest first. */
  public StripeCollection<EvaluationOutcome> list(
      EvaluationOutcomeListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/risk/evaluation_outcomes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<EvaluationOutcome>>() {}.getType());
  }
  /** Retrieves an evaluation outcome by its ID. */
  public EvaluationOutcome retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an evaluation outcome by its ID. */
  public EvaluationOutcome retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/risk/evaluation_outcomes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, EvaluationOutcome.class);
  }
}
