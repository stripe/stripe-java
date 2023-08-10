// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.DebitReversal;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.DebitReversalCreateParams;
import com.stripe.param.treasury.DebitReversalListParams;
import com.stripe.param.treasury.DebitReversalRetrieveParams;

public final class DebitReversalService extends ApiService {
  public DebitReversalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public DebitReversal create(DebitReversalCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public DebitReversal create(DebitReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            DebitReversal.class,
            options,
            ApiMode.V1);
  }
  /** Returns a list of DebitReversals. */
  public StripeCollection<DebitReversal> list(DebitReversalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of DebitReversals. */
  public StripeCollection<DebitReversal> list(
      DebitReversalListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<DebitReversal>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String debitReversal, DebitReversalRetrieveParams params)
      throws StripeException {
    return retrieve(debitReversal, params, (RequestOptions) null);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String debitReversal, RequestOptions options)
      throws StripeException {
    return retrieve(debitReversal, (DebitReversalRetrieveParams) null, options);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String debitReversal) throws StripeException {
    return retrieve(debitReversal, (DebitReversalRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(
      String debitReversal, DebitReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/debit_reversals/%s", ApiResource.urlEncodeId(debitReversal));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            DebitReversal.class,
            options,
            ApiMode.V1);
  }
}
