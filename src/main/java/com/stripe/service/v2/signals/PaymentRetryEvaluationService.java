// File generated from our OpenAPI spec
package com.stripe.service.v2.signals;

import com.stripe.exception.AlreadyExistsException;
import com.stripe.exception.CannotProceedException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.signals.PaymentRetryEvaluation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.signals.PaymentRetryEvaluationCancelParams;
import com.stripe.param.v2.signals.PaymentRetryEvaluationCreateParams;
import com.stripe.param.v2.signals.PaymentRetryEvaluationUpdateParams;

public final class PaymentRetryEvaluationService extends ApiService {
  public PaymentRetryEvaluationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new payment retry evaluation for a failed payment. */
  public PaymentRetryEvaluation create(PaymentRetryEvaluationCreateParams params)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new payment retry evaluation for a failed payment. */
  public PaymentRetryEvaluation create(RequestOptions options)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return create((PaymentRetryEvaluationCreateParams) null, options);
  }
  /** Creates a new payment retry evaluation for a failed payment. */
  public PaymentRetryEvaluation create()
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return create((PaymentRetryEvaluationCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new payment retry evaluation for a failed payment. */
  public PaymentRetryEvaluation create(
      PaymentRetryEvaluationCreateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    String path = "/v2/signals/payment_retry_evaluations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRetryEvaluation.class);
  }
  /** Retrieves a payment retry evaluation by ID. */
  public PaymentRetryEvaluation retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a payment retry evaluation by ID. */
  public PaymentRetryEvaluation retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/signals/payment_retry_evaluations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PaymentRetryEvaluation.class);
  }
  /** Updates an active payment retry evaluation with a replacement payment identifier. */
  public PaymentRetryEvaluation update(String id, PaymentRetryEvaluationUpdateParams params)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an active payment retry evaluation with a replacement payment identifier. */
  public PaymentRetryEvaluation update(String id, RequestOptions options)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return update(id, (PaymentRetryEvaluationUpdateParams) null, options);
  }
  /** Updates an active payment retry evaluation with a replacement payment identifier. */
  public PaymentRetryEvaluation update(String id)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return update(id, (PaymentRetryEvaluationUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an active payment retry evaluation with a replacement payment identifier. */
  public PaymentRetryEvaluation update(
      String id, PaymentRetryEvaluationUpdateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    String path =
        String.format("/v2/signals/payment_retry_evaluations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRetryEvaluation.class);
  }
  /** Cancels an active payment retry evaluation. */
  public PaymentRetryEvaluation cancel(String id, PaymentRetryEvaluationCancelParams params)
      throws StripeException, CannotProceedException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancels an active payment retry evaluation. */
  public PaymentRetryEvaluation cancel(String id, RequestOptions options)
      throws StripeException, CannotProceedException {
    return cancel(id, (PaymentRetryEvaluationCancelParams) null, options);
  }
  /** Cancels an active payment retry evaluation. */
  public PaymentRetryEvaluation cancel(String id) throws StripeException, CannotProceedException {
    return cancel(id, (PaymentRetryEvaluationCancelParams) null, (RequestOptions) null);
  }
  /** Cancels an active payment retry evaluation. */
  public PaymentRetryEvaluation cancel(
      String id, PaymentRetryEvaluationCancelParams params, RequestOptions options)
      throws StripeException, CannotProceedException {
    String path =
        String.format(
            "/v2/signals/payment_retry_evaluations/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRetryEvaluation.class);
  }
}
