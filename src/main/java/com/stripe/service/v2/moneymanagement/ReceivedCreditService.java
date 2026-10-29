// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.ReceivedCredit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.ReceivedCreditListParams;

public final class ReceivedCreditService extends ApiService {
  public ReceivedCreditService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list(ReceivedCreditListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list(RequestOptions options) throws StripeException {
    return list((ReceivedCreditListParams) null, options);
  }
  /** Retrieves a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list() throws StripeException {
    return list((ReceivedCreditListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list(
      ReceivedCreditListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/received_credits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ReceivedCredit>>() {}.getType());
  }
  /** Retrieve a ReceivedCredit by ID. */
  public ReceivedCredit retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a ReceivedCredit by ID. */
  public ReceivedCredit retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/received_credits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ReceivedCredit.class);
  }
}
