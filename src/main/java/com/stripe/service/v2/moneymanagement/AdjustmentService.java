// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Adjustment;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.AdjustmentListParams;

public final class AdjustmentService extends ApiService {
  public AdjustmentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Adjustments that match the provided filters. */
  public StripeCollection<Adjustment> list(AdjustmentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Adjustments that match the provided filters. */
  public StripeCollection<Adjustment> list(RequestOptions options) throws StripeException {
    return list((AdjustmentListParams) null, options);
  }
  /** Returns a list of Adjustments that match the provided filters. */
  public StripeCollection<Adjustment> list() throws StripeException {
    return list((AdjustmentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Adjustments that match the provided filters. */
  public StripeCollection<Adjustment> list(AdjustmentListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/adjustments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Adjustment>>() {}.getType());
  }
  /** Retrieves the details of an Adjustment by ID. */
  public Adjustment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an Adjustment by ID. */
  public Adjustment retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/money_management/adjustments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Adjustment.class);
  }
}
