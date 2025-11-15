// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FxQuoteCreateParams;
import com.stripe.param.FxQuoteListParams;
import com.stripe.param.FxQuoteRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The FX Quotes API provides three functions: - View Stripe's current exchange rate for any given
 * currency pair. - Extend quoted rates for a 1-hour period or a 24-hour period, minimizing
 * uncertainty from FX fluctuations. - Preview the FX fees Stripe will charge on your FX
 * transaction, allowing you to anticipate specific settlement amounts before payment costs.
 *
 * <p><a href="https://stripe.com/payments/currencies/localize-prices/fx-quotes-api">View the
 * docs</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FxQuote extends ApiResource implements HasId {
  /** Time at which the quote was created, measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The duration the exchange rate quote remains valid from creation time. Allowed values are none,
   * hour, and day. Note that for the test mode API available in alpha, you can request an extended
   * quote, but it won't be usable for any transactions.
   *
   * <p>One of {@code day}, {@code five_minutes}, {@code hour}, or {@code none}.
   */
  @SerializedName("lock_duration")
  String lockDuration;

  /**
   * Time at which the quote will expire, measured in seconds since the Unix epoch.
   *
   * <p>If lock_duration is set to ‘none’ this field will be set to null.
   */
  @SerializedName("lock_expires_at")
  Long lockExpiresAt;

  /**
   * Lock status of the quote. Transitions from active to expired once past the lock_expires_at
   * timestamp.
   *
   * <p>Can return value none, active, or expired.
   *
   * <p>One of {@code active}, {@code expired}, or {@code none}.
   */
  @SerializedName("lock_status")
  String lockStatus;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code fx_quote}.
   */
  @SerializedName("object")
  String object;

  /** Information about the rates. */
  @SerializedName("rates")
  Map<String, FxQuote.Rate> rates;

  /**
   * The currency to convert into, typically this is the currency that you want to settle to your
   * Stripe balance. Three-letter ISO currency code, in lowercase. Must be a supported currency.
   */
  @SerializedName("to_currency")
  String toCurrency;

  @SerializedName("usage")
  Usage usage;

  /** Creates an FX Quote object. */
  public static FxQuote create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an FX Quote object. */
  public static FxQuote create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fx_quotes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, FxQuote.class);
  }

  /** Creates an FX Quote object. */
  public static FxQuote create(FxQuoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an FX Quote object. */
  public static FxQuote create(FxQuoteCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fx_quotes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FxQuote.class);
  }

  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public static FxQuoteCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public static FxQuoteCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fx_quotes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FxQuoteCollection.class);
  }

  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public static FxQuoteCollection list(FxQuoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of FX quotes that have been issued. The FX quotes are returned in sorted order,
   * with the most recent FX quotes appearing first.
   */
  public static FxQuoteCollection list(FxQuoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fx_quotes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FxQuoteCollection.class);
  }

  /** Retrieve an FX Quote object. */
  public static FxQuote retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve an FX Quote object. */
  public static FxQuote retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve an FX Quote object. */
  public static FxQuote retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fx_quotes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FxQuote.class);
  }

  /** Retrieve an FX Quote object. */
  public static FxQuote retrieve(String id, FxQuoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fx_quotes/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FxQuote.class);
  }

  /**
   * For more details about Rate, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Rate extends StripeObject {
    /** The rate that includes the FX fee rate. */
    @SerializedName("exchange_rate")
    BigDecimal exchangeRate;

    @SerializedName("rate_details")
    RateDetails rateDetails;

    /**
     * For more details about RateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RateDetails extends StripeObject {
      /** The rate for the currency pair. */
      @SerializedName("base_rate")
      BigDecimal baseRate;

      /** The fee for locking the conversion rates. */
      @SerializedName("duration_premium")
      BigDecimal durationPremium;

      /** The FX fee for the currency pair. */
      @SerializedName("fx_fee_rate")
      BigDecimal fxFeeRate;

      /** A reference rate for the currency pair provided by the reference rate provider. */
      @SerializedName("reference_rate")
      BigDecimal referenceRate;

      /**
       * The reference rate provider.
       *
       * <p>Equal to {@code ecb}.
       */
      @SerializedName("reference_rate_provider")
      String referenceRateProvider;
    }
  }

  /**
   * For more details about Usage, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Usage extends StripeObject {
    /** The details required to use an FX Quote for a payment. */
    @SerializedName("payment")
    Payment payment;

    /** The details required to use an FX Quote for a transfer. */
    @SerializedName("transfer")
    Transfer transfer;

    /**
     * The transaction type for which the FX Quote will be used.
     *
     * <p>Can be 'payment' or 'transfer'.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Payment, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payment extends StripeObject {
      /**
       * The Stripe account ID that the funds will be transferred to.
       *
       * <p>This field should match the account ID that would be used in the PaymentIntent’s
       * transfer_data[destination] field.
       */
      @SerializedName("destination")
      String destination;

      /**
       * The Stripe account ID that these funds are intended for.
       *
       * <p>This field must match the account ID that would be used in the PaymentIntent’s
       * on_behalf_of field.
       */
      @SerializedName("on_behalf_of")
      String onBehalfOf;
    }

    /**
     * For more details about Transfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Transfer extends StripeObject {
      /**
       * The Stripe account ID that the funds will be transferred to.
       *
       * <p>This field should match the account ID that would be used in the Transfer’s destination
       * field.
       */
      @SerializedName("destination")
      String destination;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(usage, responseGetter);
  }
}
