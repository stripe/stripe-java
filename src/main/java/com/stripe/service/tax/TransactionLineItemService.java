// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.TransactionLineItem;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.TransactionLineItemListParams;

public final class TransactionLineItemService extends ApiService {
  public TransactionLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> list(
      String transaction, TransactionLineItemListParams params) throws StripeException {
    return list(transaction, params, (RequestOptions) null);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> list(String transaction, RequestOptions options)
      throws StripeException {
    return list(transaction, (TransactionLineItemListParams) null, options);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> list(String transaction) throws StripeException {
    return list(transaction, (TransactionLineItemListParams) null, (RequestOptions) null);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> list(
      String transaction, TransactionLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/tax/transactions/%s/line_items", ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<TransactionLineItem>>() {}.getType());
  }
}
