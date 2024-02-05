// File generated from our OpenAPI spec
package com.stripe.service.giftcards;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.giftcards.Transaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.giftcards.TransactionCancelParams;
import com.stripe.param.giftcards.TransactionConfirmParams;
import com.stripe.param.giftcards.TransactionCreateParams;
import com.stripe.param.giftcards.TransactionListParams;
import com.stripe.param.giftcards.TransactionRetrieveParams;
import com.stripe.param.giftcards.TransactionUpdateParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List gift card transactions for a gift card. */
  public StripeCollection<Transaction> list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List gift card transactions for a gift card. */
  public StripeCollection<Transaction> list(RequestOptions options) throws StripeException {
    return list((TransactionListParams) null, options);
  }
  /** List gift card transactions for a gift card. */
  public StripeCollection<Transaction> list() throws StripeException {
    return list((TransactionListParams) null, (RequestOptions) null);
  }
  /** List gift card transactions for a gift card. */
  public StripeCollection<Transaction> list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Transaction>>() {}.getType());
  }
  /** Create a gift card transaction. */
  public Transaction create(TransactionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a gift card transaction. */
  public Transaction create(TransactionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
  /** Retrieves the gift card transaction. */
  public Transaction retrieve(String id, TransactionRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the gift card transaction. */
  public Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, options);
  }
  /** Retrieves the gift card transaction. */
  public Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the gift card transaction. */
  public Transaction retrieve(String id, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
  /** Update a gift card transaction. */
  public Transaction update(String id, TransactionUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a gift card transaction. */
  public Transaction update(String id, RequestOptions options) throws StripeException {
    return update(id, (TransactionUpdateParams) null, options);
  }
  /** Update a gift card transaction. */
  public Transaction update(String id) throws StripeException {
    return update(id, (TransactionUpdateParams) null, (RequestOptions) null);
  }
  /** Update a gift card transaction. */
  public Transaction update(String id, TransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
  /** Cancel a gift card transaction. */
  public Transaction cancel(String id, TransactionCancelParams params) throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancel a gift card transaction. */
  public Transaction cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (TransactionCancelParams) null, options);
  }
  /** Cancel a gift card transaction. */
  public Transaction cancel(String id) throws StripeException {
    return cancel(id, (TransactionCancelParams) null, (RequestOptions) null);
  }
  /** Cancel a gift card transaction. */
  public Transaction cancel(String id, TransactionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/transactions/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
  /** Confirm a gift card transaction. */
  public Transaction confirm(String id, TransactionConfirmParams params) throws StripeException {
    return confirm(id, params, (RequestOptions) null);
  }
  /** Confirm a gift card transaction. */
  public Transaction confirm(String id, RequestOptions options) throws StripeException {
    return confirm(id, (TransactionConfirmParams) null, options);
  }
  /** Confirm a gift card transaction. */
  public Transaction confirm(String id) throws StripeException {
    return confirm(id, (TransactionConfirmParams) null, (RequestOptions) null);
  }
  /** Confirm a gift card transaction. */
  public Transaction confirm(String id, TransactionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/transactions/%s/confirm", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
}
