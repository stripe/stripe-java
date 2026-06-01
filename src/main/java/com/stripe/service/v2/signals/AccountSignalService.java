// File generated from our OpenAPI spec
package com.stripe.service.v2.signals;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.signals.AccountSignal;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.signals.AccountSignalListParams;

public final class AccountSignalService extends ApiService {
  public AccountSignalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists AccountSignals for a given account or customer, filtered by signal type. */
  public StripeCollection<AccountSignal> list(AccountSignalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists AccountSignals for a given account or customer, filtered by signal type. */
  public StripeCollection<AccountSignal> list(
      AccountSignalListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/signals/account_signals";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<AccountSignal>>() {}.getType());
  }
  /** Retrieves an AccountSignal by its ID. */
  public AccountSignal retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an AccountSignal by its ID. */
  public AccountSignal retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/signals/account_signals/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountSignal.class);
  }
}
