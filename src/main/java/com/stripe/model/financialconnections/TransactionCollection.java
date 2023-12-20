// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.financialconnections.TransactionCollectionListParams;
import java.util.Map;

public class TransactionCollection extends StripeCollection<Transaction> {
  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public TransactionCollection list(TransactionCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public TransactionCollection list(TransactionCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }
}
