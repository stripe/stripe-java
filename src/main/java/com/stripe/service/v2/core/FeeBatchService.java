// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.FeeBatch;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.FeeBatchListParams;

public final class FeeBatchService extends ApiService {
  public FeeBatchService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List FeeBatches optionally filtered by collection_record. */
  public StripeCollection<FeeBatch> list(FeeBatchListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List FeeBatches optionally filtered by collection_record. */
  public StripeCollection<FeeBatch> list(RequestOptions options) throws StripeException {
    return list((FeeBatchListParams) null, options);
  }
  /** List FeeBatches optionally filtered by collection_record. */
  public StripeCollection<FeeBatch> list() throws StripeException {
    return list((FeeBatchListParams) null, (RequestOptions) null);
  }
  /** List FeeBatches optionally filtered by collection_record. */
  public StripeCollection<FeeBatch> list(FeeBatchListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/fee_batches";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FeeBatch>>() {}.getType());
  }
  /** Retrieve a FeeBatch by id. */
  public FeeBatch retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a FeeBatch by id. */
  public FeeBatch retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/fee_batches/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, FeeBatch.class);
  }
}
