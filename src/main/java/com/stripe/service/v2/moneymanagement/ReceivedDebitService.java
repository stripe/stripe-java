// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.ReceivedDebit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.ReceivedDebitListParams;

public final class ReceivedDebitService extends ApiService {
  public ReceivedDebitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of ReceivedDebits, given the selected filters. */
  public StripeCollection<ReceivedDebit> list(ReceivedDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of ReceivedDebits, given the selected filters. */
  public StripeCollection<ReceivedDebit> list(RequestOptions options) throws StripeException {
    return list((ReceivedDebitListParams) null, options);
  }
  /** Retrieves a list of ReceivedDebits, given the selected filters. */
  public StripeCollection<ReceivedDebit> list() throws StripeException {
    return list((ReceivedDebitListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of ReceivedDebits, given the selected filters. */
  public StripeCollection<ReceivedDebit> list(
      ReceivedDebitListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/received_debits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ReceivedDebit>>() {}.getType());
  }
  /** Retrieves a single ReceivedDebit by ID. */
  public ReceivedDebit retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a single ReceivedDebit by ID. */
  public ReceivedDebit retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/received_debits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ReceivedDebit.class);
  }
}
