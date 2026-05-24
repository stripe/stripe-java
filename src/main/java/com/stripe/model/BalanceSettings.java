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
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Options for customizing account balances and payout settings for a Stripe platform’s connected
 * accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceSettings extends ApiResource {
  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance_settings}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payments")
  Payments payments;

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
   * For more details about Payments, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payments extends StripeObject {
    /**
     * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank
     * account. See <a href="https://stripe.com/connect/account-balances">Understanding Connect
     * account balances</a> for details. The default value is {@code false} when <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts, otherwise {@code true}.
     */
    @SerializedName("debit_negative_balances")
    Boolean debitNegativeBalances;

    /** Settings specific to the account's payouts. */
    @SerializedName("payouts")
    Payouts payouts;

    @SerializedName("settlement_timing")
    SettlementTiming settlementTiming;

    /**
     * For more details about Payouts, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts extends StripeObject {
      /**
       * Configures per-currency rules for automatically transferring funds from the payments
       * balance to a FinancialAccount.
       */
      @SerializedName("automatic_transfer_rules_by_currency")
      Map<String, List<BalanceSettings.Payments.Payouts.AutomaticTransferRulesByCurrency>>
          automaticTransferRulesByCurrency;

      /**
       * The minimum balance amount to retain per currency after automatic payouts. Only funds that
       * exceed these amounts are paid out. Learn more about the <a
       * href="https://stripe.com/payouts/minimum-balances-for-automatic-payouts">minimum balances
       * for automatic payouts</a>.
       */
      @SerializedName("minimum_balance_by_currency")
      Map<String, Long> minimumBalanceByCurrency;

      /**
       * Details on when funds from charges are available, and when they are paid out to an external
       * account. See our <a
       * href="https://docs.stripe.com/connect/bank-transfers#payout-information">Setting Bank and
       * Debit Card Payouts</a> documentation for details.
       */
      @SerializedName("schedule")
      Schedule schedule;

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
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
       * For more details about AutomaticTransferRulesByCurrency, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AutomaticTransferRulesByCurrency extends StripeObject {
        /**
         * The ID of the FinancialAccount that funds will be transferred to during automatic
         * transfers.
         */
        @SerializedName("payout_method")
        String payoutMethod;

        /**
         * The maximum amount in minor units to transfer to the FinancialAccount. Only applicable
         * when {@code type} is {@code transfer_up_to_amount}.
         */
        @SerializedName("transfer_up_to_amount")
        Long transferUpToAmount;

        /**
         * The type of automatic transfer rule.
         *
         * <p>One of {@code transfer_all}, or {@code transfer_up_to_amount}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Schedule, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Schedule extends StripeObject {
        /**
         * How frequently funds will be paid out. One of {@code manual} (payouts only created via
         * API call), {@code daily}, {@code weekly}, or {@code monthly}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The day of the month funds will be paid out. Only shown if {@code interval} is monthly.
         * Payouts scheduled between the 29th and 31st of the month are sent on the last day of
         * shorter months.
         */
        @SerializedName("monthly_payout_days")
        List<Long> monthlyPayoutDays;

        /**
         * The days of the week when available funds are paid out, specified as an array, for
         * example, [{@code monday}, {@code tuesday}]. Only shown if {@code interval} is weekly.
         */
        @SerializedName("weekly_payout_days")
        List<String> weeklyPayoutDays;
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

      /**
       * The number of days charge funds are held before becoming available. If present, overrides
       * the default, or minimum available, for the account.
       */
      @SerializedName("delay_days_override")
      Long delayDaysOverride;

      /**
       * Customized start of day configuration for automatic payouts to group and send payments in
       * local timezones with a customized day starting time. For details, see our <a
       * href="https://stripe.com/connect/customized-start-of-day">Customized start of day</a>
       * documentation.
       */
      @SerializedName("start_of_day")
      StartOfDay startOfDay;

      /**
       * For more details about StartOfDay, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StartOfDay extends StripeObject {
        /**
         * Hour at which the customized start of day begins according to the given timezone. Must be
         * a <a
         * href="https://stripe.com/connect/customized-start-of-day#available-timezones-and-cutoffs">supported
         * customized start of day hour</a>.
         */
        @SerializedName("hour")
        Long hour;

        /**
         * Minutes at which the customized start of day begins according to the given timezone. Must
         * be either 0 or 30.
         */
        @SerializedName("minutes")
        Long minutes;

        /**
         * Timezone for the customized start of day. Must be a <a
         * href="https://stripe.com/connect/customized-start-of-day#available-timezones-and-cutoffs">supported
         * customized start of day timezone</a>.
         */
        @SerializedName("timezone")
        String timezone;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(payments, responseGetter);
  }
}
