// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.CreditReversal;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.CreditReversalCreateParams;
import com.stripe.param.treasury.CreditReversalListParams;
import com.stripe.param.treasury.CreditReversalRetrieveParams;

public final class CreditReversalService extends ApiService {
  public CreditReversalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of CreditReversals. */
  public StripeCollection<CreditReversal> list(CreditReversalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of CreditReversals. */
  public StripeCollection<CreditReversal> list(
      CreditReversalListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CreditReversal>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public CreditReversal create(CreditReversalCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public CreditReversal create(CreditReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditReversal.class,
            options,
            ApiMode.V1);
  }
  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public CreditReversal retrieve(String creditReversal, CreditReversalRetrieveParams params)
      throws StripeException {
    return retrieve(creditReversal, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public CreditReversal retrieve(String creditReversal, RequestOptions options)
      throws StripeException {
    return retrieve(creditReversal, (CreditReversalRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public CreditReversal retrieve(String creditReversal) throws StripeException {
    return retrieve(creditReversal, (CreditReversalRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public CreditReversal retrieve(
      String creditReversal, CreditReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/credit_reversals/%s", ApiResource.urlEncodeId(creditReversal));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditReversal.class,
            options,
            ApiMode.V1);
  }
}
