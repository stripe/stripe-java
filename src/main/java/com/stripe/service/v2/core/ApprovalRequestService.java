// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.ApprovalRequest;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.ApprovalRequestListParams;
import com.stripe.param.v2.core.ApprovalRequestSubmitParams;

public final class ApprovalRequestService extends ApiService {
  public ApprovalRequestService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** GET /v2/core/approval_requests Lists approval requests with optional filtering. */
  public StripeCollection<ApprovalRequest> list(ApprovalRequestListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** GET /v2/core/approval_requests Lists approval requests with optional filtering. */
  public StripeCollection<ApprovalRequest> list(RequestOptions options) throws StripeException {
    return list((ApprovalRequestListParams) null, options);
  }
  /** GET /v2/core/approval_requests Lists approval requests with optional filtering. */
  public StripeCollection<ApprovalRequest> list() throws StripeException {
    return list((ApprovalRequestListParams) null, (RequestOptions) null);
  }
  /** GET /v2/core/approval_requests Lists approval requests with optional filtering. */
  public StripeCollection<ApprovalRequest> list(
      ApprovalRequestListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/core/approval_requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ApprovalRequest>>() {}.getType());
  }
  /** GET /v2/core/approval_requests/:id Retrieves an approval request by ID. */
  public ApprovalRequest retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** GET /v2/core/approval_requests/:id Retrieves an approval request by ID. */
  public ApprovalRequest retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/approval_requests/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ApprovalRequest.class);
  }
  /** POST /v2/core/approval_requests/:id/cancel Cancels a pending approval request. */
  public ApprovalRequest cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** POST /v2/core/approval_requests/:id/cancel Cancels a pending approval request. */
  public ApprovalRequest cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/core/approval_requests/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ApprovalRequest.class);
  }
  /** POST /v2/core/approval_requests/:id/execute Executes an approved approval request. */
  public ApprovalRequest execute(String id) throws StripeException {
    return execute(id, (RequestOptions) null);
  }
  /** POST /v2/core/approval_requests/:id/execute Executes an approved approval request. */
  public ApprovalRequest execute(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/core/approval_requests/%s/execute", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ApprovalRequest.class);
  }
  /**
   * POST /v2/core/approval_requests/:id/submit Moves a pending approval request into the reviewer
   * queue for auto-execution upon approval.
   */
  public ApprovalRequest submit(String id, ApprovalRequestSubmitParams params)
      throws StripeException {
    return submit(id, params, (RequestOptions) null);
  }
  /**
   * POST /v2/core/approval_requests/:id/submit Moves a pending approval request into the reviewer
   * queue for auto-execution upon approval.
   */
  public ApprovalRequest submit(String id, RequestOptions options) throws StripeException {
    return submit(id, (ApprovalRequestSubmitParams) null, options);
  }
  /**
   * POST /v2/core/approval_requests/:id/submit Moves a pending approval request into the reviewer
   * queue for auto-execution upon approval.
   */
  public ApprovalRequest submit(String id) throws StripeException {
    return submit(id, (ApprovalRequestSubmitParams) null, (RequestOptions) null);
  }
  /**
   * POST /v2/core/approval_requests/:id/submit Moves a pending approval request into the reviewer
   * queue for auto-execution upon approval.
   */
  public ApprovalRequest submit(
      String id, ApprovalRequestSubmitParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/core/approval_requests/%s/submit", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ApprovalRequest.class);
  }
}
