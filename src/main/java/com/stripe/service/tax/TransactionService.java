// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.tax.Transaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.TransactionCreateFromCalculationParams;
import com.stripe.param.tax.TransactionCreateReversalParams;
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
    String path = String.format("/v1/tax/transactions/%s", ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Transaction.class);
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
    String path = "/v1/tax/transactions/create_from_calculation";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Transaction.class);
  }
  /** Partially or fully reverses a previously created {@code Transaction}. */
  public Transaction createReversal(TransactionCreateReversalParams params) throws StripeException {
    return createReversal(params, (RequestOptions) null);
  }
  /** Partially or fully reverses a previously created {@code Transaction}. */
  public Transaction createReversal(TransactionCreateReversalParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/transactions/create_reversal";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Transaction.class);
  }

  public com.stripe.service.tax.TransactionLineItemService lineItems() {
    return new com.stripe.service.tax.TransactionLineItemService(this.getResponseGetter());
  }
}
