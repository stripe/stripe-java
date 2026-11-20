// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.DisputeAdjustment;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.DisputeAdjustmentListParams;

public final class DisputeAdjustmentService extends ApiService {
  public DisputeAdjustmentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of DisputeAdjustments. */
  public StripeCollection<DisputeAdjustment> list(DisputeAdjustmentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of DisputeAdjustments. */
  public StripeCollection<DisputeAdjustment> list(RequestOptions options) throws StripeException {
    return list((DisputeAdjustmentListParams) null, options);
  }
  /** Retrieves a list of DisputeAdjustments. */
  public StripeCollection<DisputeAdjustment> list() throws StripeException {
    return list((DisputeAdjustmentListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of DisputeAdjustments. */
  public StripeCollection<DisputeAdjustment> list(
      DisputeAdjustmentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/dispute_adjustments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<DisputeAdjustment>>() {}.getType());
  }
  /** Retrieves a DisputeAdjustment by ID. */
  public DisputeAdjustment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a DisputeAdjustment by ID. */
  public DisputeAdjustment retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/dispute_adjustments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, DisputeAdjustment.class);
  }
}
