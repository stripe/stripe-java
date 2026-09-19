// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.AccountSignals;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountSignalsRetrieveParams;

public final class AccountSignalsService extends ApiService {
  public AccountSignalsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the account’s Signal objects. */
  public AccountSignals retrieve(String id, AccountSignalsRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the account’s Signal objects. */
  public AccountSignals retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AccountSignalsRetrieveParams) null, options);
  }
  /** Retrieves the account’s Signal objects. */
  public AccountSignals retrieve(String id) throws StripeException {
    return retrieve(id, (AccountSignalsRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the account’s Signal objects. */
  public AccountSignals retrieve(
      String id, AccountSignalsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/signals", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountSignals.class);
  }
}
