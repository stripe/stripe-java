package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ExchangeRate extends APIResource implements HasId {
  String id;
  String object;
  Map<String, Float> rates;

  @Override
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Map<String, Float> getRates() {
    return rates;
  }

  public void setRates(Map<String, Float> rates) {
    this.rates = rates;
  }

  public static ExchangeRate retrieve(String currency) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(currency, null);
  }

  public static ExchangeRate retrieve(String currency, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(ExchangeRate.class, currency), null,
        ExchangeRate.class, options);
  }

  public static ExchangeRateCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static ExchangeRateCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(ExchangeRate.class), params, ExchangeRateCollection.class,
        options);
  }
}
