// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.BatchJob;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.BatchJobCreateParams;

public final class BatchJobService extends ApiService {
  public BatchJobService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new batch job. */
  public BatchJob create(BatchJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new batch job. */
  public BatchJob create(BatchJobCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/batch_jobs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BatchJob.class);
  }
  /** Retrieves an existing batch job. */
  public BatchJob retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an existing batch job. */
  public BatchJob retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/batch_jobs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, BatchJob.class);
  }
  /** Cancels an existing batch job. */
  public BatchJob cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels an existing batch job. */
  public BatchJob cancel(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/batch_jobs/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, BatchJob.class);
  }
}
