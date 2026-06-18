// File generated from our OpenAPI spec
package com.stripe.service.v2.core.health.alerts;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.health.AlertHistoryEntry;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.health.alerts.HistoryListParams;

public final class HistoryService extends ApiService {
  public HistoryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of alert history entries for a health alert. */
  public StripeCollection<AlertHistoryEntry> list(String id, HistoryListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Retrieves a list of alert history entries for a health alert. */
  public StripeCollection<AlertHistoryEntry> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (HistoryListParams) null, options);
  }
  /** Retrieves a list of alert history entries for a health alert. */
  public StripeCollection<AlertHistoryEntry> list(String id) throws StripeException {
    return list(id, (HistoryListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of alert history entries for a health alert. */
  public StripeCollection<AlertHistoryEntry> list(
      String id, HistoryListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/health/alerts/%s/history", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<AlertHistoryEntry>>() {}.getType());
  }
}
