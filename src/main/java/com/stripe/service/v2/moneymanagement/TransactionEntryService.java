// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.TransactionEntry;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.TransactionEntryListParams;

public final class TransactionEntryService extends ApiService {
  public TransactionEntryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of TransactionEntries that match the provided filters. */
  public StripeCollection<TransactionEntry> list(TransactionEntryListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of TransactionEntries that match the provided filters. */
  public StripeCollection<TransactionEntry> list(RequestOptions options) throws StripeException {
    return list((TransactionEntryListParams) null, options);
  }
  /** Returns a list of TransactionEntries that match the provided filters. */
  public StripeCollection<TransactionEntry> list() throws StripeException {
    return list((TransactionEntryListParams) null, (RequestOptions) null);
  }
  /** Returns a list of TransactionEntries that match the provided filters. */
  public StripeCollection<TransactionEntry> list(
      TransactionEntryListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/transaction_entries";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TransactionEntry>>() {}.getType());
  }
  /** Retrieves the details of a TransactionEntry by ID. */
  public TransactionEntry retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of a TransactionEntry by ID. */
  public TransactionEntry retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/transaction_entries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, TransactionEntry.class);
  }
}
