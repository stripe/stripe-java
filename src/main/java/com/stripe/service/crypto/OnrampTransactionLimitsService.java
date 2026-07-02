// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.stripe.exception.StripeException;
import com.stripe.model.crypto.OnrampTransactionLimits;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.OnrampTransactionLimitsRetrieveParams;

public final class OnrampTransactionLimitsService extends ApiService {
  public OnrampTransactionLimitsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the remaining onramp limit for a crypto customer. */
  public OnrampTransactionLimits retrieve(OnrampTransactionLimitsRetrieveParams params)
      throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieves the remaining onramp limit for a crypto customer. */
  public OnrampTransactionLimits retrieve(RequestOptions options) throws StripeException {
    return retrieve((OnrampTransactionLimitsRetrieveParams) null, options);
  }
  /** Retrieves the remaining onramp limit for a crypto customer. */
  public OnrampTransactionLimits retrieve() throws StripeException {
    return retrieve((OnrampTransactionLimitsRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the remaining onramp limit for a crypto customer. */
  public OnrampTransactionLimits retrieve(
      OnrampTransactionLimitsRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/crypto/onramp_transaction_limits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnrampTransactionLimits.class);
  }
}
