// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.GiftCardOperation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.GiftCardOperationRetrieveParams;

public final class GiftCardOperationService extends ApiService {
  public GiftCardOperationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a third-party gift card operation object. */
  public GiftCardOperation retrieve(String id, GiftCardOperationRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card operation object. */
  public GiftCardOperation retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (GiftCardOperationRetrieveParams) null, options);
  }
  /** Retrieves a third-party gift card operation object. */
  public GiftCardOperation retrieve(String id) throws StripeException {
    return retrieve(id, (GiftCardOperationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card operation object. */
  public GiftCardOperation retrieve(
      String id, GiftCardOperationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_card_operations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
}
