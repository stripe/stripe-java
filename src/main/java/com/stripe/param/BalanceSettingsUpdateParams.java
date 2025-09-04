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

  /**
   * <strong>Required.</strong> Settings that apply to the <a
   * href="https://docs.stripe.com/api/balance">Payments Balance</a>.
   */
  @SerializedName("payments")
  Payments payments;

  private BalanceSettingsUpdateParams(
      List<String> expand, Map<String, Object> extraParams, Payments payments) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.payments = payments;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Payments payments;

    /** Finalize and obtain parameter instance from this builder. */
    public BalanceSettingsUpdateParams build() {
      return new BalanceSettingsUpdateParams(this.expand, this.extraParams, this.payments);
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

    /**
     * <strong>Required.</strong> Settings that apply to the <a
     * href="https://docs.stripe.com/api/balance">Payments Balance</a>.
     */
    public Builder setPayments(BalanceSettingsUpdateParams.Payments payments) {
      this.payments = payments;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payments {
    /**
     * A Boolean indicating whether Stripe should try to reclaim negative balances from an attached
     * bank account. For details, see <a
     * href="https://stripe.com/connect/account-balances">Understanding Connect Account
     * Balances</a>.
     */
    @SerializedName("debit_negative_balances")
    Boolean debitNegativeBalances;

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

    private Payments(
        Boolean debitNegativeBalances,
        Map<String, Object> extraParams,
        Payouts payouts,
        SettlementTiming settlementTiming) {
      this.debitNegativeBalances = debitNegativeBalances;
      this.extraParams = extraParams;
      this.payouts = payouts;
      this.settlementTiming = settlementTiming;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean debitNegativeBalances;

      private Map<String, Object> extraParams;

      private Payouts payouts;

      private SettlementTiming settlementTiming;

      /** Finalize and obtain parameter instance from this builder. */
      public BalanceSettingsUpdateParams.Payments build() {
        return new BalanceSettingsUpdateParams.Payments(
            this.debitNegativeBalances, this.extraParams, this.payouts, this.settlementTiming);
      }

      /**
       * A Boolean indicating whether Stripe should try to reclaim negative balances from an
       * attached bank account. For details, see <a
       * href="https://stripe.com/connect/account-balances">Understanding Connect Account
       * Balances</a>.
       */
      public Builder setDebitNegativeBalances(Boolean debitNegativeBalances) {
        this.debitNegativeBalances = debitNegativeBalances;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceSettingsUpdateParams.Payments#extraParams} for the field documentation.
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
       * See {@link BalanceSettingsUpdateParams.Payments#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings specific to the account's payouts. */
      public Builder setPayouts(BalanceSettingsUpdateParams.Payments.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /** Settings related to the account's balance settlement timing. */
      public Builder setSettlementTiming(
          BalanceSettingsUpdateParams.Payments.SettlementTiming settlementTiming) {
        this.settlementTiming = settlementTiming;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
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
        public BalanceSettingsUpdateParams.Payments.Payouts build() {
          return new BalanceSettingsUpdateParams.Payments.Payouts(
              this.extraParams, this.schedule, this.statementDescriptor);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceSettingsUpdateParams.Payments.Payouts#extraParams} for the field
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
         * map. See {@link BalanceSettingsUpdateParams.Payments.Payouts#extraParams} for the field
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
         * Details on when funds from charges are available, and when they are paid out to an
         * external account. For details, see our <a
         * href="https://stripe.com/connect/bank-transfers#payout-information">Setting Bank and
         * Debit Card Payouts</a> documentation.
         */
        public Builder setSchedule(BalanceSettingsUpdateParams.Payments.Payouts.Schedule schedule) {
          this.schedule = schedule;
          return this;
        }

        /**
         * The text that appears on the bank account statement for payouts. If not set, this
         * defaults to the platform's bank descriptor as set in the Dashboard.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * The text that appears on the bank account statement for payouts. If not set, this
         * defaults to the platform's bank descriptor as set in the Dashboard.
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * How frequently available funds are paid out. One of: {@code daily}, {@code manual},
         * {@code weekly}, or {@code monthly}. Default is {@code daily}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The days of the month when available funds are paid out, specified as an array of numbers
         * between 1--31. Payouts nominally scheduled between the 29th and 31st of the month are
         * instead sent on the last day of a shorter month. Required and applicable only if {@code
         * interval} is {@code monthly}.
         */
        @SerializedName("monthly_payout_days")
        List<Long> monthlyPayoutDays;

        /**
         * The days of the week when available funds are paid out, specified as an array, e.g.,
         * [{@code monday}, {@code tuesday}]. Required and applicable only if {@code interval} is
         * {@code weekly}.
         */
        @SerializedName("weekly_payout_days")
        List<BalanceSettingsUpdateParams.Payments.Payouts.Schedule.WeeklyPayoutDay>
            weeklyPayoutDays;

        private Schedule(
            Map<String, Object> extraParams,
            Interval interval,
            List<Long> monthlyPayoutDays,
            List<BalanceSettingsUpdateParams.Payments.Payouts.Schedule.WeeklyPayoutDay>
                weeklyPayoutDays) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.monthlyPayoutDays = monthlyPayoutDays;
          this.weeklyPayoutDays = weeklyPayoutDays;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private List<Long> monthlyPayoutDays;

          private List<BalanceSettingsUpdateParams.Payments.Payouts.Schedule.WeeklyPayoutDay>
              weeklyPayoutDays;

          /** Finalize and obtain parameter instance from this builder. */
          public BalanceSettingsUpdateParams.Payments.Payouts.Schedule build() {
            return new BalanceSettingsUpdateParams.Payments.Payouts.Schedule(
                this.extraParams, this.interval, this.monthlyPayoutDays, this.weeklyPayoutDays);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#extraParams} for
           * the field documentation.
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
           * map. See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#extraParams} for
           * the field documentation.
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
          public Builder setInterval(
              BalanceSettingsUpdateParams.Payments.Payouts.Schedule.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * Add an element to `monthlyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#monthlyPayoutDays} for
           * the field documentation.
           */
          public Builder addMonthlyPayoutDay(Long element) {
            if (this.monthlyPayoutDays == null) {
              this.monthlyPayoutDays = new ArrayList<>();
            }
            this.monthlyPayoutDays.add(element);
            return this;
          }

          /**
           * Add all elements to `monthlyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#monthlyPayoutDays} for
           * the field documentation.
           */
          public Builder addAllMonthlyPayoutDay(List<Long> elements) {
            if (this.monthlyPayoutDays == null) {
              this.monthlyPayoutDays = new ArrayList<>();
            }
            this.monthlyPayoutDays.addAll(elements);
            return this;
          }

          /**
           * Add an element to `weeklyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#weeklyPayoutDays} for
           * the field documentation.
           */
          public Builder addWeeklyPayoutDay(
              BalanceSettingsUpdateParams.Payments.Payouts.Schedule.WeeklyPayoutDay element) {
            if (this.weeklyPayoutDays == null) {
              this.weeklyPayoutDays = new ArrayList<>();
            }
            this.weeklyPayoutDays.add(element);
            return this;
          }

          /**
           * Add all elements to `weeklyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link BalanceSettingsUpdateParams.Payments.Payouts.Schedule#weeklyPayoutDays} for
           * the field documentation.
           */
          public Builder addAllWeeklyPayoutDay(
              List<BalanceSettingsUpdateParams.Payments.Payouts.Schedule.WeeklyPayoutDay>
                  elements) {
            if (this.weeklyPayoutDays == null) {
              this.weeklyPayoutDays = new ArrayList<>();
            }
            this.weeklyPayoutDays.addAll(elements);
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

        public enum WeeklyPayoutDay implements ApiRequestParams.EnumParam {
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

          WeeklyPayoutDay(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SettlementTiming {
      /**
       * The number of days charge funds are held before becoming available. The default value is
       * {@code minimum}, representing the lowest available value for the account. The maximum value
       * is 31. The {@code delay_days} parameter remains at the last configured value if {@code
       * payouts.schedule.interval} is {@code manual}. <a
       * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling delay
       * days</a>.
       */
      @SerializedName("delay_days_override")
      Long delayDaysOverride;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private SettlementTiming(Long delayDaysOverride, Map<String, Object> extraParams) {
        this.delayDaysOverride = delayDaysOverride;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long delayDaysOverride;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public BalanceSettingsUpdateParams.Payments.SettlementTiming build() {
          return new BalanceSettingsUpdateParams.Payments.SettlementTiming(
              this.delayDaysOverride, this.extraParams);
        }

        /**
         * The number of days charge funds are held before becoming available. The default value is
         * {@code minimum}, representing the lowest available value for the account. The maximum
         * value is 31. The {@code delay_days} parameter remains at the last configured value if
         * {@code payouts.schedule.interval} is {@code manual}. <a
         * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling
         * delay days</a>.
         */
        public Builder setDelayDaysOverride(Long delayDaysOverride) {
          this.delayDaysOverride = delayDaysOverride;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceSettingsUpdateParams.Payments.SettlementTiming#extraParams} for
         * the field documentation.
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
         * map. See {@link BalanceSettingsUpdateParams.Payments.SettlementTiming#extraParams} for
         * the field documentation.
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
}
