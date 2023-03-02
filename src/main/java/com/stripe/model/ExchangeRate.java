// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ExchangeRateListParams;
import com.stripe.param.ExchangeRateRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code Exchange Rate} objects allow you to determine the rates that Stripe is currently using to
 * convert from one currency to another. Since this number is variable throughout the day, there are
 * various reasons why you might want to know the current rate (for example, to dynamically price an
 * item for a user with a default payment in a foreign currency).
 *
 * <p>If you want a guarantee that the charge is made with a certain exchange rate you expect is
 * current, you can pass in {@code exchange_rate} to charges endpoints. If the value is no longer up
 * to date, the charge won't go through. Please refer to our <a
 * href="https://stripe.com/docs/exchange-rates">Exchange Rates API</a> guide for more details.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ExchangeRate extends ApiResource implements HasId {
  /**
   * Unique identifier for the object. Represented as the three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> in lowercase.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code exchange_rate}.
   */
  @SerializedName("object")
  String object;

  /**
   * Hash where the keys are supported currencies and the values are the exchange rate at which the
   * base id currency converts to the key currency.
   */
  @SerializedName("rates")
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
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/exchange_rates");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ExchangeRateCollection.class, options);
  }

  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public static ExchangeRateCollection list(ExchangeRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of objects that contain the rates at which foreign currencies are converted to
   * one another. Only shows the currencies for which Stripe supports.
   */
  public static ExchangeRateCollection list(ExchangeRateListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/exchange_rates");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ExchangeRateCollection.class, options);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(String rateId) throws StripeException {
    return retrieve(rateId, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(String rateId, RequestOptions options)
      throws StripeException {
    return retrieve(rateId, (Map<String, Object>) null, options);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(
      String rateId, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/exchange_rates/%s", ApiResource.urlEncodeId(rateId)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ExchangeRate.class, options);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(
      String rateId, ExchangeRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/exchange_rates/%s", ApiResource.urlEncodeId(rateId)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ExchangeRate.class, options);
  }
}
