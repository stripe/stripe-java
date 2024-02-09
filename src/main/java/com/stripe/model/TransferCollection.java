// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.TransferCollectionTransferReversalsParams;
import java.util.Map;

public class TransferCollection extends StripeCollection<Transfer> {
  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(Map<String, Object> params)
      throws StripeException {
    return transferReversals(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TransferReversalCollection.class);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      TransferCollectionTransferReversalsParams params) throws StripeException {
    return transferReversals(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      TransferCollectionTransferReversalsParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TransferReversalCollection.class);
  }
}
