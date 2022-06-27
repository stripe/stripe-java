// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BitcoinTransactionCollectionListParams;
import java.util.Map;

public class BitcoinTransactionCollection extends StripeCollection<BitcoinTransaction> {
  /**
   * <p>List bitcoin transacitons for a given receiver.</p>
   */
  public BitcoinTransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List bitcoin transacitons for a given receiver.</p>
   */
  public BitcoinTransactionCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, BitcoinTransactionCollection.class, options);
  }

  /**
   * <p>List bitcoin transacitons for a given receiver.</p>
   */
  public BitcoinTransactionCollection list(
      BitcoinTransactionCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List bitcoin transacitons for a given receiver.</p>
   */
  public BitcoinTransactionCollection list(
      BitcoinTransactionCollectionListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, BitcoinTransactionCollection.class, options);
  }
}