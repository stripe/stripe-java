// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Transaction;
import com.stripe.model.tax.TransactionLineItem;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.TransactionCreateFromCalculationParams;
import com.stripe.param.tax.TransactionCreateReversalParams;
import com.stripe.param.tax.TransactionListLineItemsParams;
import com.stripe.param.tax.TransactionRetrieveParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a Tax {@code Transaction} object. */
  public Transaction retrieve(String transaction, TransactionRetrieveParams params)
      throws StripeException {
    return retrieve(transaction, params, (RequestOptions) null);
  }
  /** Retrieves a Tax {@code Transaction} object. */
  public Transaction retrieve(String transaction, RequestOptions options) throws StripeException {
    return retrieve(transaction, (TransactionRetrieveParams) null, options);
  }
  /** Retrieves a Tax {@code Transaction} object. */
  public Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (TransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Tax {@code Transaction} object. */
  public Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("/v1/tax/transactions/%s", ApiResource.urlEncodeId(transaction));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }
  /** Partially or fully reverses a previously created {@code Transaction}. */
  public Transaction createReversal(TransactionCreateReversalParams params) throws StripeException {
    return createReversal(params, (RequestOptions) null);
  }
  /** Partially or fully reverses a previously created {@code Transaction}. */
  public Transaction createReversal(TransactionCreateReversalParams params, RequestOptions options)
      throws StripeException {
    String url = "/v1/tax/transactions/create_reversal";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }
  /** Creates a Tax {@code Transaction} from a calculation. */
  public Transaction createFromCalculation(TransactionCreateFromCalculationParams params)
      throws StripeException {
    return createFromCalculation(params, (RequestOptions) null);
  }
  /** Creates a Tax {@code Transaction} from a calculation. */
  public Transaction createFromCalculation(
      TransactionCreateFromCalculationParams params, RequestOptions options)
      throws StripeException {
    String url = "/v1/tax/transactions/create_from_calculation";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> listLineItems(
      String transaction, TransactionListLineItemsParams params) throws StripeException {
    return listLineItems(transaction, params, (RequestOptions) null);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> listLineItems(
      String transaction, RequestOptions options) throws StripeException {
    return listLineItems(transaction, (TransactionListLineItemsParams) null, options);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> listLineItems(String transaction)
      throws StripeException {
    return listLineItems(transaction, (TransactionListLineItemsParams) null, (RequestOptions) null);
  }
  /** Retrieves the line items of a committed standalone transaction as a collection. */
  public StripeCollection<TransactionLineItem> listLineItems(
      String transaction, TransactionListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("/v1/tax/transactions/%s/line_items", ApiResource.urlEncodeId(transaction));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<TransactionLineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
