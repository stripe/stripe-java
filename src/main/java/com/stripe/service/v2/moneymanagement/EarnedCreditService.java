// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.EarnedCredit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.EarnedCreditListParams;

public final class EarnedCreditService extends ApiService {
  public EarnedCreditService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of EarnedCredits. */
  public StripeCollection<EarnedCredit> list(EarnedCreditListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of EarnedCredits. */
  public StripeCollection<EarnedCredit> list(RequestOptions options) throws StripeException {
    return list((EarnedCreditListParams) null, options);
  }
  /** Returns a list of EarnedCredits. */
  public StripeCollection<EarnedCredit> list() throws StripeException {
    return list((EarnedCreditListParams) null, (RequestOptions) null);
  }
  /** Returns a list of EarnedCredits. */
  public StripeCollection<EarnedCredit> list(EarnedCreditListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/earned_credits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<EarnedCredit>>() {}.getType());
  }
  /** Retrieves an EarnedCredit. */
  public EarnedCredit retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an EarnedCredit. */
  public EarnedCredit retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/earned_credits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, EarnedCredit.class);
  }
}
