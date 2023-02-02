// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.financialconnections.InferredBalanceCollectionListParams;
import java.util.Map;

public class InferredBalanceCollection extends StripeCollection<InferredBalance> {
  /** Lists the recorded inferred balances for a Financial Connections <code>Account</code>. */
  public InferredBalanceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists the recorded inferred balances for a Financial Connections <code>Account</code>. */
  public InferredBalanceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.requestCollection(url, params, InferredBalanceCollection.class, options);
  }

  /** Lists the recorded inferred balances for a Financial Connections <code>Account</code>. */
  public InferredBalanceCollection list(InferredBalanceCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists the recorded inferred balances for a Financial Connections <code>Account</code>. */
  public InferredBalanceCollection list(
      InferredBalanceCollectionListParams params, RequestOptions options) throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.requestCollection(url, params, InferredBalanceCollection.class, options);
  }
}
