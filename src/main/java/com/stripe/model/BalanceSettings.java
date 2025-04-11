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
import com.stripe.param.BalanceSettingsRetrieveParams;
import com.stripe.param.BalanceSettingsUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Options for customizing account balances and payout settings for a Stripe platform’s connected
 * accounts.
 *
 * <p>This API is only available for users enrolled in the public preview for Accounts v2 on Stripe
 * Connect. If you are not in this preview, please use the <a
 * href="https://docs.stripe.com/api/accounts?api-version=2025-03-31.basil">Accounts v1 API</a> to
 * manage your connected accounts’ balance settings instead.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceSettings extends ApiResource {
  /**
   * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank
   * account. See <a href="https://stripe.com/connect/account-balances">Understanding Connect
   * account balances</a> for details. The default value is {@code false} when <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, otherwise {@code true}.
   */
  @SerializedName("debit_negative_balances")
  Boolean debitNegativeBalances;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance_settings}.
   */
  @SerializedName("object")
  String object;

  /** Settings specific to the account's payouts. */
  @SerializedName("payouts")
  Payouts payouts;

  @SerializedName("settlement_timing")
  SettlementTiming settlementTiming;

  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_settings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, BalanceSettings.class);
  }

  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings retrieve(
      BalanceSettingsRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/balance_settings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BalanceSettings.class);
  }

  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_settings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, BalanceSettings.class);
  }

  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings update(BalanceSettingsUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public static BalanceSettings update(BalanceSettingsUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_settings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BalanceSettings.class);
  }

  /**
   * For more details about Payouts, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payouts extends StripeObject {
    /**
     * Details on when funds from charges are available, and when they are paid out to an external
     * account. See our <a
     * href="https://stripe.com/docs/connect/bank-transfers#payout-information">Setting Bank and
     * Debit Card Payouts</a> documentation for details.
     */
    @SerializedName("schedule")
    Schedule schedule;

    /**
     * The text that appears on the bank account statement for payouts. If not set, this defaults to
     * the platform's bank descriptor as set in the Dashboard.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * Whether the funds in this account can be paid out.
     *
     * <p>One of {@code disabled}, or {@code enabled}.
     */
    @SerializedName("status")
    String status;

    /**
     * For more details about Schedule, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Schedule extends StripeObject {
      /**
       * How frequently funds will be paid out. One of {@code manual} (payouts only created via API
       * call), {@code daily}, {@code weekly}, or {@code monthly}.
       */
      @SerializedName("interval")
      String interval;

      /**
       * The day of the month funds will be paid out. Only shown if {@code interval} is monthly.
       * Payouts scheduled between the 29th and 31st of the month are sent on the last day of
       * shorter months.
       */
      @SerializedName("monthly_anchor")
      Long monthlyAnchor;

      /**
       * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only
       * shown if {@code interval} is weekly.
       *
       * <p>One of {@code friday}, {@code monday}, {@code thursday}, {@code tuesday}, or {@code
       * wednesday}.
       */
      @SerializedName("weekly_anchor")
      String weeklyAnchor;
    }
  }

  /**
   * For more details about SettlementTiming, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettlementTiming extends StripeObject {
    /** The number of days charge funds are held before becoming available. */
    @SerializedName("delay_days")
    Long delayDays;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(payouts, responseGetter);
    trySetResponseGetter(settlementTiming, responseGetter);
  }
}
