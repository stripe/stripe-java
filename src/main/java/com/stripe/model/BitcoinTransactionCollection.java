package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class BitcoinTransactionCollection extends StripeCollection<BitcoinTransaction> {
  public BitcoinTransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  public BitcoinTransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, BitcoinTransactionCollection.class, options);
  }

  @Deprecated
  public BitcoinTransactionCollection all(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  @Deprecated
  public BitcoinTransactionCollection all(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return list(params, options);
  }
}
