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
import com.stripe.param.radar.CustomerEvaluationRetrieveParams;
import com.stripe.param.radar.CustomerEvaluationUpdateParams;

public final class CustomerEvaluationService extends ApiService {
  public CustomerEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an {@code CustomerEvaluation} object. */
  public CustomerEvaluation retrieve(String id, CustomerEvaluationRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an {@code CustomerEvaluation} object. */
  public CustomerEvaluation retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CustomerEvaluationRetrieveParams) null, options);
  }
  /** Retrieves an {@code CustomerEvaluation} object. */
  public CustomerEvaluation retrieve(String id) throws StripeException {
    return retrieve(id, (CustomerEvaluationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an {@code CustomerEvaluation} object. */
  public CustomerEvaluation retrieve(
      String id, CustomerEvaluationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/customer_evaluations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomerEvaluation.class);
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
  /** Reports an event on a {@code CustomerEvaluation} object. */
  public CustomerEvaluation update(String id, CustomerEvaluationUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Reports an event on a {@code CustomerEvaluation} object. */
  public CustomerEvaluation update(String id, RequestOptions options) throws StripeException {
    return update(id, (CustomerEvaluationUpdateParams) null, options);
  }
  /** Reports an event on a {@code CustomerEvaluation} object. */
  public CustomerEvaluation update(String id) throws StripeException {
    return update(id, (CustomerEvaluationUpdateParams) null, (RequestOptions) null);
  }
  /** Reports an event on a {@code CustomerEvaluation} object. */
  public CustomerEvaluation update(
      String id, CustomerEvaluationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/radar/customer_evaluations/%s/report", ApiResource.urlEncodeId(id));
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
