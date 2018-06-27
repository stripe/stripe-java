package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class BitcoinTransactionCollection extends StripeCollection<BitcoinTransaction> {
  public BitcoinTransactionCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  public BitcoinTransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, BitcoinTransactionCollection.class, options);
  }

  @Deprecated
  public BitcoinTransactionCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  @Deprecated
  public BitcoinTransactionCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, options);
  }
}
