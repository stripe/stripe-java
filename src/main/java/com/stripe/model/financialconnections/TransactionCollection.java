// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.financialconnections.TransactionCollectionListParams;
import java.util.Map;

public class TransactionCollection extends StripeCollection<Transaction> {
  /** Returns a list of Financial Connections <code>Transaction</code> objects. */
  public TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections <code>Transaction</code> objects. */
  public TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }

  /** Returns a list of Financial Connections <code>Transaction</code> objects. */
  public TransactionCollection list(TransactionCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections <code>Transaction</code> objects. */
  public TransactionCollection list(TransactionCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }
}
