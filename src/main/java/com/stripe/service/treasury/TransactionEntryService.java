// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.TransactionEntry;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.TransactionEntryListParams;
import com.stripe.param.treasury.TransactionEntryRetrieveParams;

public final class TransactionEntryService extends ApiService {
  public TransactionEntryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a TransactionEntry object. */
  public TransactionEntry retrieve(String id, TransactionEntryRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a TransactionEntry object. */
  public TransactionEntry retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TransactionEntryRetrieveParams) null, options);
  }
  /** Retrieves a TransactionEntry object. */
  public TransactionEntry retrieve(String id) throws StripeException {
    return retrieve(id, (TransactionEntryRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a TransactionEntry object. */
  public TransactionEntry retrieve(
      String id, TransactionEntryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/transaction_entries/%s", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            TransactionEntry.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves a list of TransactionEntry objects. */
  public StripeCollection<TransactionEntry> list(TransactionEntryListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of TransactionEntry objects. */
  public StripeCollection<TransactionEntry> list(
      TransactionEntryListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/transaction_entries";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<TransactionEntry>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
