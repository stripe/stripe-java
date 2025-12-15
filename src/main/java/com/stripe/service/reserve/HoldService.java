// File generated from our OpenAPI spec
package com.stripe.service.reserve;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.reserve.Hold;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reserve.HoldListParams;
import com.stripe.param.reserve.HoldRetrieveParams;

public final class HoldService extends ApiService {
  public HoldService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of ReserveHolds previously created. The ReserveHolds are returned in sorted
   * order, with the most recent ReserveHolds appearing first.
   */
  public StripeCollection<Hold> list(HoldListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of ReserveHolds previously created. The ReserveHolds are returned in sorted
   * order, with the most recent ReserveHolds appearing first.
   */
  public StripeCollection<Hold> list(RequestOptions options) throws StripeException {
    return list((HoldListParams) null, options);
  }
  /**
   * Returns a list of ReserveHolds previously created. The ReserveHolds are returned in sorted
   * order, with the most recent ReserveHolds appearing first.
   */
  public StripeCollection<Hold> list() throws StripeException {
    return list((HoldListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of ReserveHolds previously created. The ReserveHolds are returned in sorted
   * order, with the most recent ReserveHolds appearing first.
   */
  public StripeCollection<Hold> list(HoldListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reserve/holds";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Hold>>() {}.getType());
  }
  /** Retrieve a ReserveHold. */
  public Hold retrieve(String id, HoldRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a ReserveHold. */
  public Hold retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (HoldRetrieveParams) null, options);
  }
  /** Retrieve a ReserveHold. */
  public Hold retrieve(String id) throws StripeException {
    return retrieve(id, (HoldRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a ReserveHold. */
  public Hold retrieve(String id, HoldRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/holds/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Hold.class);
  }
}
