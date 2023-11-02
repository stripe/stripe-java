// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.ExchangeRateListParams;
import com.stripe.param.ExchangeRateRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code ExchangeRate} objects allow you to determine the rates that Stripe is currently using to
 * convert from one currency to another. Since this number is variable throughout the day, there are
 * various reasons why you might want to know the current rate (for example, to dynamically price an
 * item for a user with a default payment in a foreign currency).
 *
 * <p>Please refer to our <a href="https://stripe.com/docs/fx-rates">Exchange Rates API</a> guide
 * for more details.
 *
 * <p><em>[Note: this integration path is supported but no longer recommended]</em> Additionally,
 * you can guarantee that a charge is made with an exchange rate that you expect is current. To do
 * so, you must pass in the exchange_rate to charges endpoints. If the value is no longer up to
 * date, the charge won't go through. Please refer to our <a
 * href="https://stripe.com/docs/exchange-rates">Using with charges</a> guide for more details.
 *
 * <p>-----
 *
 * <p>
 *
 * <p><em>This Exchange Rates API is a Beta Service and is subject to Stripe's terms of service. You
 * may use the API solely for the purpose of transacting on Stripe. For example, the API may be
 * queried in order to:</em>
 *
 * <p>- <em>localize prices for processing payments on Stripe</em> - <em>reconcile Stripe
 * transactions</em> - <em>determine how much money to send to a connected account</em> -
 * <em>determine app fees to charge a connected account</em>
 *
 * <p><em>Using this Exchange Rates API beta for any purpose other than to transact on Stripe is
 * strictly prohibited and constitutes a violation of Stripe's terms of service.</em>
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
    String path = "/v1/exchange_rates";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            ExchangeRateCollection.class,
            options,
            ApiMode.V1);
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
    String path = "/v1/exchange_rates";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ExchangeRateCollection.class,
            options,
            ApiMode.V1);
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
    String path = String.format("/v1/exchange_rates/%s", ApiResource.urlEncodeId(rateId));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            ExchangeRate.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the exchange rates from the given currency to every supported currency. */
  public static ExchangeRate retrieve(
      String rateId, ExchangeRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/exchange_rates/%s", ApiResource.urlEncodeId(rateId));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ExchangeRate.class,
            options,
            ApiMode.V1);
  }
}
