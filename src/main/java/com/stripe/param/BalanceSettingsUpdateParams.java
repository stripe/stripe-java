// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class BalanceSettingsUpdateParams extends ApiRequestParams {
  /**
   * A Boolean indicating whether Stripe should try to reclaim negative balances from an attached
   * bank account. For details, see <a
   * href="https://stripe.com/connect/account-balances">Understanding Connect Account Balances</a>.
   */
  @SerializedName("debit_negative_balances")
  Boolean debitNegativeBalances;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Settings specific to the account's payouts. */
  @SerializedName("payouts")
  Payouts payouts;

  /** Settings related to the account's balance settlement timing. */
  @SerializedName("settlement_timing")
  SettlementTiming settlementTiming;

  private BalanceSettingsUpdateParams(
      Boolean debitNegativeBalances,
      List<String> expand,
      Map<String, Object> extraParams,
      Payouts payouts,
      SettlementTiming settlementTiming) {
    this.debitNegativeBalances = debitNegativeBalances;
    this.expand = expand;
    this.extraParams = extraParams;
    this.payouts = payouts;
    this.settlementTiming = settlementTiming;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean debitNegativeBalances;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Payouts payouts;

    private SettlementTiming settlementTiming;

    /** Finalize and obtain parameter instance from this builder. */
    public BalanceSettingsUpdateParams build() {
      return new BalanceSettingsUpdateParams(
          this.debitNegativeBalances,
          this.expand,
          this.extraParams,
          this.payouts,
          this.settlementTiming);
    }

    /**
     * A Boolean indicating whether Stripe should try to reclaim negative balances from an attached
     * bank account. For details, see <a
     * href="https://stripe.com/connect/account-balances">Understanding Connect Account
     * Balances</a>.
     */
    public Builder setDebitNegativeBalances(Boolean debitNegativeBalances) {
      this.debitNegativeBalances = debitNegativeBalances;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BalanceSettingsUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BalanceSettingsUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BalanceSettingsUpdateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link BalanceSettingsUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Settings specific to the account's payouts. */
    public Builder setPayouts(BalanceSettingsUpdateParams.Payouts payouts) {
      this.payouts = payouts;
      return this;
    }

    /** Settings related to the account's balance settlement timing. */
    public Builder setSettlementTiming(
        BalanceSettingsUpdateParams.SettlementTiming settlementTiming) {
      this.settlementTiming = settlementTiming;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payouts {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Details on when funds from charges are available, and when they are paid out to an external
     * account. For details, see our <a
     * href="https://stripe.com/connect/bank-transfers#payout-information">Setting Bank and Debit
     * Card Payouts</a> documentation.
     */
    @SerializedName("schedule")
    Schedule schedule;

    /**
     * The text that appears on the bank account statement for payouts. If not set, this defaults to
     * the platform's bank descriptor as set in the Dashboard.
     */
    @SerializedName("statement_descriptor")
    Object statementDescriptor;

    private Payouts(
        Map<String, Object> extraParams, Schedule schedule, Object statementDescriptor) {
      this.extraParams = extraParams;
      this.schedule = schedule;
      this.statementDescriptor = statementDescriptor;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Schedule schedule;

      private Object statementDescriptor;

      /** Finalize and obtain parameter instance from this builder. */
      public BalanceSettingsUpdateParams.Payouts build() {
        return new BalanceSettingsUpdateParams.Payouts(
            this.extraParams, this.schedule, this.statementDescriptor);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceSettingsUpdateParams.Payouts#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link BalanceSettingsUpdateParams.Payouts#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Details on when funds from charges are available, and when they are paid out to an external
       * account. For details, see our <a
       * href="https://stripe.com/connect/bank-transfers#payout-information">Setting Bank and Debit
       * Card Payouts</a> documentation.
       */
      public Builder setSchedule(BalanceSettingsUpdateParams.Payouts.Schedule schedule) {
        this.schedule = schedule;
        return this;
      }

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
       */
      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
       */
      public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Schedule {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * How frequently available funds are paid out. One of: {@code daily}, {@code manual}, {@code
       * weekly}, or {@code monthly}. Default is {@code daily}.
       */
      @SerializedName("interval")
      Interval interval;

      /**
       * The day of the month when available funds are paid out, specified as a number between
       * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead sent
       * on the last day of a shorter month. Required and applicable only if {@code interval} is
       * {@code monthly}.
       */
      @SerializedName("monthly_anchor")
      Long monthlyAnchor;

      /**
       * The day of the week when available funds are paid out (required and applicable only if
       * {@code interval} is {@code weekly}.).
       */
      @SerializedName("weekly_anchor")
      WeeklyAnchor weeklyAnchor;

      private Schedule(
          Map<String, Object> extraParams,
          Interval interval,
          Long monthlyAnchor,
          WeeklyAnchor weeklyAnchor) {
        this.extraParams = extraParams;
        this.interval = interval;
        this.monthlyAnchor = monthlyAnchor;
        this.weeklyAnchor = weeklyAnchor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Interval interval;

        private Long monthlyAnchor;

        private WeeklyAnchor weeklyAnchor;

        /** Finalize and obtain parameter instance from this builder. */
        public BalanceSettingsUpdateParams.Payouts.Schedule build() {
          return new BalanceSettingsUpdateParams.Payouts.Schedule(
              this.extraParams, this.interval, this.monthlyAnchor, this.weeklyAnchor);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceSettingsUpdateParams.Payouts.Schedule#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceSettingsUpdateParams.Payouts.Schedule#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * How frequently available funds are paid out. One of: {@code daily}, {@code manual},
         * {@code weekly}, or {@code monthly}. Default is {@code daily}.
         */
        public Builder setInterval(BalanceSettingsUpdateParams.Payouts.Schedule.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The day of the month when available funds are paid out, specified as a number between
         * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead
         * sent on the last day of a shorter month. Required and applicable only if {@code interval}
         * is {@code monthly}.
         */
        public Builder setMonthlyAnchor(Long monthlyAnchor) {
          this.monthlyAnchor = monthlyAnchor;
          return this;
        }

        /**
         * The day of the week when available funds are paid out (required and applicable only if
         * {@code interval} is {@code weekly}.).
         */
        public Builder setWeeklyAnchor(
            BalanceSettingsUpdateParams.Payouts.Schedule.WeeklyAnchor weeklyAnchor) {
          this.weeklyAnchor = weeklyAnchor;
          return this;
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("daily")
        DAILY("daily"),

        @SerializedName("manual")
        MANUAL("manual"),

        @SerializedName("monthly")
        MONTHLY("monthly"),

        @SerializedName("weekly")
        WEEKLY("weekly");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }

      public enum WeeklyAnchor implements ApiRequestParams.EnumParam {
        @SerializedName("friday")
        FRIDAY("friday"),

        @SerializedName("monday")
        MONDAY("monday"),

        @SerializedName("thursday")
        THURSDAY("thursday"),

        @SerializedName("tuesday")
        TUESDAY("tuesday"),

        @SerializedName("wednesday")
        WEDNESDAY("wednesday");

        @Getter(onMethod_ = {@Override})
        private final String value;

        WeeklyAnchor(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SettlementTiming {
    /**
     * The number of days charge funds are held before becoming available. May also be set to {@code
     * minimum}, representing the lowest available value for the account country. Default is {@code
     * minimum}. The {@code delay_days} parameter remains at the last configured value if {@code
     * payouts.schedule.interval} is {@code manual}. <a
     * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling payout
     * delay days</a>.
     */
    @SerializedName("delay_days")
    Long delayDays;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SettlementTiming(Long delayDays, Map<String, Object> extraParams) {
      this.delayDays = delayDays;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long delayDays;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public BalanceSettingsUpdateParams.SettlementTiming build() {
        return new BalanceSettingsUpdateParams.SettlementTiming(this.delayDays, this.extraParams);
      }

      /**
       * The number of days charge funds are held before becoming available. May also be set to
       * {@code minimum}, representing the lowest available value for the account country. Default
       * is {@code minimum}. The {@code delay_days} parameter remains at the last configured value
       * if {@code payouts.schedule.interval} is {@code manual}. <a
       * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling
       * payout delay days</a>.
       */
      public Builder setDelayDays(Long delayDays) {
        this.delayDays = delayDays;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceSettingsUpdateParams.SettlementTiming#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link BalanceSettingsUpdateParams.SettlementTiming#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
