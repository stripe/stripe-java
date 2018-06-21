package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ExchangeRate extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Map<String, Float> rates;

  // <editor-fold desc="list">
  /**
   * List all exchange rates.
   */
  public static ExchangeRateCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all exchange rates.
   */
  public static ExchangeRateCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return requestCollection(classUrl(ExchangeRate.class), params, ExchangeRateCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an exchange rate.
   */
  public static ExchangeRate retrieve(String currency) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return retrieve(currency, null);
  }

  /**
   * Retrieve an exchange rate.
   */
  public static ExchangeRate retrieve(String currency, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(ExchangeRate.class, currency), null,
        ExchangeRate.class, options);
  }
  // </editor-fold>
}
