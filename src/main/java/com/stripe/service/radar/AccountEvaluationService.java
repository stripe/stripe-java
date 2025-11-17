// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.radar.AccountEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.AccountEvaluationCreateParams;
import com.stripe.param.radar.AccountEvaluationRetrieveParams;
import com.stripe.param.radar.AccountEvaluationUpdateParams;

public final class AccountEvaluationService extends ApiService {
  public AccountEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an {@code AccountEvaluation} object. */
  public AccountEvaluation retrieve(
      String accountEvaluation, AccountEvaluationRetrieveParams params) throws StripeException {
    return retrieve(accountEvaluation, params, (RequestOptions) null);
  }
  /** Retrieves an {@code AccountEvaluation} object. */
  public AccountEvaluation retrieve(String accountEvaluation, RequestOptions options)
      throws StripeException {
    return retrieve(accountEvaluation, (AccountEvaluationRetrieveParams) null, options);
  }
  /** Retrieves an {@code AccountEvaluation} object. */
  public AccountEvaluation retrieve(String accountEvaluation) throws StripeException {
    return retrieve(
        accountEvaluation, (AccountEvaluationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an {@code AccountEvaluation} object. */
  public AccountEvaluation retrieve(
      String accountEvaluation, AccountEvaluationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s", ApiResource.urlEncodeId(accountEvaluation));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountEvaluation.class);
  }
  /** Creates a new {@code AccountEvaluation} object. */
  public AccountEvaluation create(AccountEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code AccountEvaluation} object. */
  public AccountEvaluation create(AccountEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/account_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountEvaluation.class);
  }
  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(String accountEvaluation, AccountEvaluationUpdateParams params)
      throws StripeException {
    return update(accountEvaluation, params, (RequestOptions) null);
  }
  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(
      String accountEvaluation, AccountEvaluationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s/report_event",
            ApiResource.urlEncodeId(accountEvaluation));
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
