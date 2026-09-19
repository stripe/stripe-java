// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.DebitReversal;
import com.stripe.net.ApiRequest;
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

  /** Returns a list of DebitReversals. */
  public StripeCollection<DebitReversal> list(DebitReversalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of DebitReversals. */
  public StripeCollection<DebitReversal> list(
      DebitReversalListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<DebitReversal>>() {}.getType());
  }
  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public DebitReversal create(DebitReversalCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public DebitReversal create(DebitReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DebitReversal.class);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String id, DebitReversalRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (DebitReversalRetrieveParams) null, options);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(String id) throws StripeException {
    return retrieve(id, (DebitReversalRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a DebitReversal object. */
  public DebitReversal retrieve(
      String id, DebitReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/debit_reversals/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DebitReversal.class);
  }
}
