package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ExchangeRate extends ApiResource implements HasId {
  /**
   * Unique identifier for the object. Represented as the three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html) in lowercase.
   */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Hash where the keys are supported currencies and the values are the exchange rate at which the
   * base id currency converts to the key currency.
   */
  Map<String, BigDecimal> rates;

  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public static ExchangeRateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public static ExchangeRateCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/exchange_rates");
    return requestCollection(url, params, ExchangeRateCollection.class, options);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(String currency) throws StripeException {
    return retrieve(currency, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(String currency, RequestOptions options)
      throws StripeException {
    return retrieve(currency, (Map<String, Object>) null, options);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(
      String currency, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/exchange_rates/%s", currency));
    return request(ApiResource.RequestMethod.GET, url, params, ExchangeRate.class, options);
  }
}
