// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.AccountOwner;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.AccountOwnerListParams;

public final class AccountOwnerService extends ApiService {
  public AccountOwnerService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all owners for a given {@code Account}. */
  public StripeCollection<AccountOwner> list(String account, AccountOwnerListParams params)
      throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /** Lists all owners for a given {@code Account}. */
  public StripeCollection<AccountOwner> list(
      String account, AccountOwnerListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/owners", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<AccountOwner>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
