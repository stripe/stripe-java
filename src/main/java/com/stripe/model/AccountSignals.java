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
import com.stripe.param.AccountSignalsRetrieveParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Account Signals API provides risk related signals that can be used to better manage risks.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountSignals extends ApiResource {
  /** The account for which the signals belong to. */
  @SerializedName("account")
  String account;

  /** The delinquency signal of the account. */
  @SerializedName("delinquency")
  Delinquency delinquency;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code account_signals}.
   */
  @SerializedName("object")
  String object;

  /** Retrieves the account’s Signal objects. */
  public static AccountSignals retrieve(String accountId) throws StripeException {
    return retrieve(accountId, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the account’s Signal objects. */
  public static AccountSignals retrieve(String accountId, RequestOptions options)
      throws StripeException {
    return retrieve(accountId, (Map<String, Object>) null, options);
  }

  /** Retrieves the account’s Signal objects. */
  public static AccountSignals retrieve(
      String accountId, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/signals", ApiResource.urlEncodeId(accountId));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountSignals.class);
  }

  /** Retrieves the account’s Signal objects. */
  public static AccountSignals retrieve(
      String accountId, AccountSignalsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/signals", ApiResource.urlEncodeId(accountId));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountSignals.class);
  }

  /**
   * For more details about Delinquency, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Delinquency extends StripeObject {
    /** Time at which the signal was evaluated, measured in seconds since the Unix epoch. */
    @SerializedName("evaluated_at")
    Long evaluatedAt;

    /**
     * Array of objects representing individual factors that contributed to the calculated
     * probability of delinquency.
     */
    @SerializedName("indicators")
    List<AccountSignals.Delinquency.Indicator> indicators;

    /** The probability of delinquency. Can be between 0.00 and 100.00 */
    @SerializedName("probability")
    BigDecimal probability;

    /**
     * Categorical assessment of the delinquency risk based on probability.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /** Unique identifier for the delinquency signal. */
    @SerializedName("signal_id")
    String signalId;

    /**
     * For more details about Indicator, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Indicator extends StripeObject {
      /** A brief explanation of how this indicator contributed to the delinquency probability. */
      @SerializedName("description")
      String description;

      /**
       * The effect this indicator had on the overall risk level.
       *
       * <p>One of {@code decrease}, {@code neutral}, {@code slight_increase}, or {@code
       * strong_increase}.
       */
      @SerializedName("impact")
      String impact;

      /**
       * The name of the specific indicator used in the risk assessment.
       *
       * <p>One of {@code account_balance}, {@code aov}, {@code charge_concentration}, {@code
       * dispute_window}, {@code disputes}, {@code duplicates}, {@code exposure}, {@code
       * firmographic}, {@code lifetime_metrics}, {@code payment_processing}, {@code
       * payment_volume}, {@code payouts}, {@code refunds}, {@code tenure}, or {@code transfers}.
       */
      @SerializedName("indicator")
      String indicator;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(delinquency, responseGetter);
  }
}
