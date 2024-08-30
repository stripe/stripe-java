// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.MeterEventSummary;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.MeterEventSummaryListParams;

public final class MeterEventSummaryService extends ApiService {
  public MeterEventSummaryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of billing meter event summaries. */
  public StripeCollection<MeterEventSummary> list(String id, MeterEventSummaryListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Retrieve a list of billing meter event summaries. */
  public StripeCollection<MeterEventSummary> list(
      String id, MeterEventSummaryListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/event_summaries", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<MeterEventSummary>>() {}.getType());
  }
}
