// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.FeeEntry;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.FeeEntryListParams;

public final class FeeEntryService extends ApiService {
  public FeeEntryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * List FeeEntries optionally filtered by incurred_by, fee_batch, or collection_record (at most
   * one filter at a time).
   */
  public StripeCollection<FeeEntry> list(FeeEntryListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * List FeeEntries optionally filtered by incurred_by, fee_batch, or collection_record (at most
   * one filter at a time).
   */
  public StripeCollection<FeeEntry> list(RequestOptions options) throws StripeException {
    return list((FeeEntryListParams) null, options);
  }
  /**
   * List FeeEntries optionally filtered by incurred_by, fee_batch, or collection_record (at most
   * one filter at a time).
   */
  public StripeCollection<FeeEntry> list() throws StripeException {
    return list((FeeEntryListParams) null, (RequestOptions) null);
  }
  /**
   * List FeeEntries optionally filtered by incurred_by, fee_batch, or collection_record (at most
   * one filter at a time).
   */
  public StripeCollection<FeeEntry> list(FeeEntryListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/fee_entries";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FeeEntry>>() {}.getType());
  }
  /** Retrieve a FeeEntry by id. */
  public FeeEntry retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a FeeEntry by id. */
  public FeeEntry retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/fee_entries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, FeeEntry.class);
  }
}
