// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CadenceCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The billing cycle is the object that defines future billing cycle
   * dates.
   */
  @SerializedName("billing_cycle")
  BillingCycle billingCycle;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional resource to include in the response. */
  @SerializedName("include")
  List<CadenceCreateParams.Include> include;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The payer determines the entity financially responsible for the
   * bill.
   */
  @SerializedName("payer")
  Payer payer;

  /** The settings associated with the cadence. */
  @SerializedName("settings")
  Settings settings;

  private CadenceCreateParams(
      BillingCycle billingCycle,
      Map<String, Object> extraParams,
      List<CadenceCreateParams.Include> include,
      Map<String, String> metadata,
      Payer payer,
      Settings settings) {
    this.billingCycle = billingCycle;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.payer = payer;
    this.settings = settings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingCycle billingCycle;

    private Map<String, Object> extraParams;

    private List<CadenceCreateParams.Include> include;

    private Map<String, String> metadata;

    private Payer payer;

    private Settings settings;

    /** Finalize and obtain parameter instance from this builder. */
    public CadenceCreateParams build() {
      return new CadenceCreateParams(
          this.billingCycle,
          this.extraParams,
          this.include,
          this.metadata,
          this.payer,
          this.settings);
    }

    /**
     * <strong>Required.</strong> The billing cycle is the object that defines future billing cycle
     * dates.
     */
    public Builder setBillingCycle(CadenceCreateParams.BillingCycle billingCycle) {
      this.billingCycle = billingCycle;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CadenceCreateParams#extraParams} for the field documentation.
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
     * See {@link CadenceCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CadenceCreateParams#include} for the field documentation.
     */
    public Builder addInclude(CadenceCreateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CadenceCreateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<CadenceCreateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CadenceCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CadenceCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The payer determines the entity financially responsible for the
     * bill.
     */
    public Builder setPayer(CadenceCreateParams.Payer payer) {
      this.payer = payer;
      return this;
    }

    /** The settings associated with the cadence. */
    public Builder setSettings(CadenceCreateParams.Settings settings) {
      this.settings = settings;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingCycle {
    /** Specific configuration for determining billing dates when type=day. */
    @SerializedName("day")
    Day day;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The number of intervals (specified in the interval attribute) between cadence billings. For
     * example, type=month and interval_count=3 bills every 3 months. If this is not provided, it
     * will default to 1.
     */
    @SerializedName("interval_count")
    Integer intervalCount;

    /** Specific configuration for determining billing dates when type=month. */
    @SerializedName("month")
    Month month;

    /** <strong>Required.</strong> The frequency at which a cadence bills. */
    @SerializedName("type")
    Type type;

    /** Specific configuration for determining billing dates when type=week. */
    @SerializedName("week")
    Week week;

    /** Specific configuration for determining billing dates when type=year. */
    @SerializedName("year")
    Year year;

    private BillingCycle(
        Day day,
        Map<String, Object> extraParams,
        Integer intervalCount,
        Month month,
        Type type,
        Week week,
        Year year) {
      this.day = day;
      this.extraParams = extraParams;
      this.intervalCount = intervalCount;
      this.month = month;
      this.type = type;
      this.week = week;
      this.year = year;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Day day;

      private Map<String, Object> extraParams;

      private Integer intervalCount;

      private Month month;

      private Type type;

      private Week week;

      private Year year;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceCreateParams.BillingCycle build() {
        return new CadenceCreateParams.BillingCycle(
            this.day,
            this.extraParams,
            this.intervalCount,
            this.month,
            this.type,
            this.week,
            this.year);
      }

      /** Specific configuration for determining billing dates when type=day. */
      public Builder setDay(CadenceCreateParams.BillingCycle.Day day) {
        this.day = day;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceCreateParams.BillingCycle#extraParams} for the field documentation.
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
       * See {@link CadenceCreateParams.BillingCycle#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The number of intervals (specified in the interval attribute) between cadence billings. For
       * example, type=month and interval_count=3 bills every 3 months. If this is not provided, it
       * will default to 1.
       */
      public Builder setIntervalCount(Integer intervalCount) {
        this.intervalCount = intervalCount;
        return this;
      }

      /** Specific configuration for determining billing dates when type=month. */
      public Builder setMonth(CadenceCreateParams.BillingCycle.Month month) {
        this.month = month;
        return this;
      }

      /** <strong>Required.</strong> The frequency at which a cadence bills. */
      public Builder setType(CadenceCreateParams.BillingCycle.Type type) {
        this.type = type;
        return this;
      }

      /** Specific configuration for determining billing dates when type=week. */
      public Builder setWeek(CadenceCreateParams.BillingCycle.Week week) {
        this.week = week;
        return this;
      }

      /** Specific configuration for determining billing dates when type=year. */
      public Builder setYear(CadenceCreateParams.BillingCycle.Year year) {
        this.year = year;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Day {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The time at which the billing cycle ends. This field is optional, and if not provided, it
       * will default to the time at which the cadence was created in UTC timezone.
       */
      @SerializedName("time")
      Time time;

      private Day(Map<String, Object> extraParams, Time time) {
        this.extraParams = extraParams;
        this.time = time;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Time time;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.BillingCycle.Day build() {
          return new CadenceCreateParams.BillingCycle.Day(this.extraParams, this.time);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.BillingCycle.Day#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.BillingCycle.Day#extraParams} for the field
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
         * The time at which the billing cycle ends. This field is optional, and if not provided, it
         * will default to the time at which the cadence was created in UTC timezone.
         */
        public Builder setTime(CadenceCreateParams.BillingCycle.Day.Time time) {
          this.time = time;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Time {
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
         * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
         * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive. Will default to the minute the cadence was created in UTC timezone.
         */
        @SerializedName("minute")
        Integer minute;

        private Time(Map<String, Object> extraParams, Integer hour, Integer minute) {
          this.extraParams = extraParams;
          this.hour = hour;
          this.minute = minute;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Integer hour;

          private Integer minute;

          /** Finalize and obtain parameter instance from this builder. */
          public CadenceCreateParams.BillingCycle.Day.Time build() {
            return new CadenceCreateParams.BillingCycle.Day.Time(
                this.extraParams, this.hour, this.minute);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link CadenceCreateParams.BillingCycle.Day.Time#extraParams} for the field
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
           * map. See {@link CadenceCreateParams.BillingCycle.Day.Time#extraParams} for the field
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
           * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
           * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
           */
          public Builder setHour(Integer hour) {
            this.hour = hour;
            return this;
          }

          /**
           * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
           * inclusive. Will default to the minute the cadence was created in UTC timezone.
           */
          public Builder setMinute(Integer minute) {
            this.minute = minute;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Month {
      /**
       * <strong>Required.</strong> The day to anchor the billing on for a type=&quot;month&quot;
       * billing cycle from 1-31. If this number is greater than the number of days in the month
       * being billed, this will anchor to the last day of the month. If not provided, this will
       * default to the day the cadence was created.
       */
      @SerializedName("day_of_month")
      Integer dayOfMonth;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The time at which the billing cycle ends. This field is optional, and if not provided, it
       * will default to the time at which the cadence was created in UTC timezone.
       */
      @SerializedName("time")
      Time time;

      private Month(Integer dayOfMonth, Map<String, Object> extraParams, Time time) {
        this.dayOfMonth = dayOfMonth;
        this.extraParams = extraParams;
        this.time = time;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Integer dayOfMonth;

        private Map<String, Object> extraParams;

        private Time time;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.BillingCycle.Month build() {
          return new CadenceCreateParams.BillingCycle.Month(
              this.dayOfMonth, this.extraParams, this.time);
        }

        /**
         * <strong>Required.</strong> The day to anchor the billing on for a type=&quot;month&quot;
         * billing cycle from 1-31. If this number is greater than the number of days in the month
         * being billed, this will anchor to the last day of the month. If not provided, this will
         * default to the day the cadence was created.
         */
        public Builder setDayOfMonth(Integer dayOfMonth) {
          this.dayOfMonth = dayOfMonth;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.BillingCycle.Month#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.BillingCycle.Month#extraParams} for the field
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
         * The time at which the billing cycle ends. This field is optional, and if not provided, it
         * will default to the time at which the cadence was created in UTC timezone.
         */
        public Builder setTime(CadenceCreateParams.BillingCycle.Month.Time time) {
          this.time = time;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Time {
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
         * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
         * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive. Will default to the minute the cadence was created in UTC timezone.
         */
        @SerializedName("minute")
        Integer minute;

        private Time(Map<String, Object> extraParams, Integer hour, Integer minute) {
          this.extraParams = extraParams;
          this.hour = hour;
          this.minute = minute;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Integer hour;

          private Integer minute;

          /** Finalize and obtain parameter instance from this builder. */
          public CadenceCreateParams.BillingCycle.Month.Time build() {
            return new CadenceCreateParams.BillingCycle.Month.Time(
                this.extraParams, this.hour, this.minute);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link CadenceCreateParams.BillingCycle.Month.Time#extraParams} for the field
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
           * map. See {@link CadenceCreateParams.BillingCycle.Month.Time#extraParams} for the field
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
           * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
           * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
           */
          public Builder setHour(Integer hour) {
            this.hour = hour;
            return this;
          }

          /**
           * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
           * inclusive. Will default to the minute the cadence was created in UTC timezone.
           */
          public Builder setMinute(Integer minute) {
            this.minute = minute;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Week {
      /**
       * <strong>Required.</strong> The day of the week to bill the type=week billing cycle on.
       * Numbered from 1-7 for Monday to Sunday respectively, based on the ISO-8601 week day
       * numbering. If not provided, this will default to the day the cadence was created.
       */
      @SerializedName("day_of_week")
      Integer dayOfWeek;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The time at which the billing cycle ends. This field is optional, and if not provided, it
       * will default to the time at which the cadence was created in UTC timezone.
       */
      @SerializedName("time")
      Time time;

      private Week(Integer dayOfWeek, Map<String, Object> extraParams, Time time) {
        this.dayOfWeek = dayOfWeek;
        this.extraParams = extraParams;
        this.time = time;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Integer dayOfWeek;

        private Map<String, Object> extraParams;

        private Time time;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.BillingCycle.Week build() {
          return new CadenceCreateParams.BillingCycle.Week(
              this.dayOfWeek, this.extraParams, this.time);
        }

        /**
         * <strong>Required.</strong> The day of the week to bill the type=week billing cycle on.
         * Numbered from 1-7 for Monday to Sunday respectively, based on the ISO-8601 week day
         * numbering. If not provided, this will default to the day the cadence was created.
         */
        public Builder setDayOfWeek(Integer dayOfWeek) {
          this.dayOfWeek = dayOfWeek;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.BillingCycle.Week#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.BillingCycle.Week#extraParams} for the field
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
         * The time at which the billing cycle ends. This field is optional, and if not provided, it
         * will default to the time at which the cadence was created in UTC timezone.
         */
        public Builder setTime(CadenceCreateParams.BillingCycle.Week.Time time) {
          this.time = time;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Time {
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
         * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
         * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive. Will default to the minute the cadence was created in UTC timezone.
         */
        @SerializedName("minute")
        Integer minute;

        private Time(Map<String, Object> extraParams, Integer hour, Integer minute) {
          this.extraParams = extraParams;
          this.hour = hour;
          this.minute = minute;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Integer hour;

          private Integer minute;

          /** Finalize and obtain parameter instance from this builder. */
          public CadenceCreateParams.BillingCycle.Week.Time build() {
            return new CadenceCreateParams.BillingCycle.Week.Time(
                this.extraParams, this.hour, this.minute);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link CadenceCreateParams.BillingCycle.Week.Time#extraParams} for the field
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
           * map. See {@link CadenceCreateParams.BillingCycle.Week.Time#extraParams} for the field
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
           * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
           * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
           */
          public Builder setHour(Integer hour) {
            this.hour = hour;
            return this;
          }

          /**
           * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
           * inclusive. Will default to the minute the cadence was created in UTC timezone.
           */
          public Builder setMinute(Integer minute) {
            this.minute = minute;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Year {
      /**
       * The day to anchor the billing on for a type=&quot;month&quot; billing cycle from 1-31. If
       * this number is greater than the number of days in the month being billed, this will anchor
       * to the last day of the month. If not provided, this will default to the day the cadence was
       * created.
       */
      @SerializedName("day_of_month")
      Integer dayOfMonth;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The month to bill on from 1-12. If not provided, this will default to the month the cadence
       * was created.
       */
      @SerializedName("month_of_year")
      Integer monthOfYear;

      /**
       * The time at which the billing cycle ends. This field is optional, and if not provided, it
       * will default to the time at which the cadence was created in UTC timezone.
       */
      @SerializedName("time")
      Time time;

      private Year(
          Integer dayOfMonth, Map<String, Object> extraParams, Integer monthOfYear, Time time) {
        this.dayOfMonth = dayOfMonth;
        this.extraParams = extraParams;
        this.monthOfYear = monthOfYear;
        this.time = time;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Integer dayOfMonth;

        private Map<String, Object> extraParams;

        private Integer monthOfYear;

        private Time time;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.BillingCycle.Year build() {
          return new CadenceCreateParams.BillingCycle.Year(
              this.dayOfMonth, this.extraParams, this.monthOfYear, this.time);
        }

        /**
         * The day to anchor the billing on for a type=&quot;month&quot; billing cycle from 1-31. If
         * this number is greater than the number of days in the month being billed, this will
         * anchor to the last day of the month. If not provided, this will default to the day the
         * cadence was created.
         */
        public Builder setDayOfMonth(Integer dayOfMonth) {
          this.dayOfMonth = dayOfMonth;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.BillingCycle.Year#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.BillingCycle.Year#extraParams} for the field
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
         * The month to bill on from 1-12. If not provided, this will default to the month the
         * cadence was created.
         */
        public Builder setMonthOfYear(Integer monthOfYear) {
          this.monthOfYear = monthOfYear;
          return this;
        }

        /**
         * The time at which the billing cycle ends. This field is optional, and if not provided, it
         * will default to the time at which the cadence was created in UTC timezone.
         */
        public Builder setTime(CadenceCreateParams.BillingCycle.Year.Time time) {
          this.time = time;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Time {
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
         * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
         * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive. Will default to the minute the cadence was created in UTC timezone.
         */
        @SerializedName("minute")
        Integer minute;

        private Time(Map<String, Object> extraParams, Integer hour, Integer minute) {
          this.extraParams = extraParams;
          this.hour = hour;
          this.minute = minute;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Integer hour;

          private Integer minute;

          /** Finalize and obtain parameter instance from this builder. */
          public CadenceCreateParams.BillingCycle.Year.Time build() {
            return new CadenceCreateParams.BillingCycle.Year.Time(
                this.extraParams, this.hour, this.minute);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link CadenceCreateParams.BillingCycle.Year.Time#extraParams} for the field
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
           * map. See {@link CadenceCreateParams.BillingCycle.Year.Time#extraParams} for the field
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
           * <strong>Required.</strong> The hour at which the billing cycle ends. This must be an
           * integer between 0 and 23, inclusive. 0 represents midnight, and 23 represents 11 PM.
           */
          public Builder setHour(Integer hour) {
            this.hour = hour;
            return this;
          }

          /**
           * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
           * inclusive. Will default to the minute the cadence was created in UTC timezone.
           */
          public Builder setMinute(Integer minute) {
            this.minute = minute;
            return this;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("day")
      DAY("day"),

      @SerializedName("month")
      MONTH("month"),

      @SerializedName("week")
      WEEK("week"),

      @SerializedName("year")
      YEAR("year");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer {
    /**
     * The ID of the Billing Profile object which determines how a bill will be paid. If provided,
     * the created cadence will be associated with the provided Billing Profile. If not provided, a
     * new Billing Profile will be created and associated with the cadence.
     */
    @SerializedName("billing_profile")
    String billingProfile;

    /** The ID of the Customer object. */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A string identifying the type of the payer. Currently the only supported value is {@code
     * customer}.
     */
    @SerializedName("type")
    Type type;

    private Payer(
        String billingProfile, String customer, Map<String, Object> extraParams, Type type) {
      this.billingProfile = billingProfile;
      this.customer = customer;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String billingProfile;

      private String customer;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceCreateParams.Payer build() {
        return new CadenceCreateParams.Payer(
            this.billingProfile, this.customer, this.extraParams, this.type);
      }

      /**
       * The ID of the Billing Profile object which determines how a bill will be paid. If provided,
       * the created cadence will be associated with the provided Billing Profile. If not provided,
       * a new Billing Profile will be created and associated with the cadence.
       */
      public Builder setBillingProfile(String billingProfile) {
        this.billingProfile = billingProfile;
        return this;
      }

      /** The ID of the Customer object. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceCreateParams.Payer#extraParams} for the field documentation.
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
       * See {@link CadenceCreateParams.Payer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A string identifying the type of the payer. Currently the only supported value is {@code
       * customer}.
       */
      public Builder setType(CadenceCreateParams.Payer.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("customer")
      CUSTOMER("customer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings {
    /**
     * Settings that configure bill generation, which includes calculating totals, tax, and
     * presenting invoices. If no setting is provided here, the settings from the customer
     * referenced on the payer will be used. If no customer settings are present, the merchant
     * default settings will be used.
     */
    @SerializedName("bill")
    Bill bill;

    /**
     * Settings that configure and manage the behavior of collecting payments. If no setting is
     * provided here, the settings from the customer referenced from the payer will be used if they
     * exist. If no customer settings are present, the merchant default settings will be used.
     */
    @SerializedName("collection")
    Collection collection;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Settings(Bill bill, Collection collection, Map<String, Object> extraParams) {
      this.bill = bill;
      this.collection = collection;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bill bill;

      private Collection collection;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceCreateParams.Settings build() {
        return new CadenceCreateParams.Settings(this.bill, this.collection, this.extraParams);
      }

      /**
       * Settings that configure bill generation, which includes calculating totals, tax, and
       * presenting invoices. If no setting is provided here, the settings from the customer
       * referenced on the payer will be used. If no customer settings are present, the merchant
       * default settings will be used.
       */
      public Builder setBill(CadenceCreateParams.Settings.Bill bill) {
        this.bill = bill;
        return this;
      }

      /**
       * Settings that configure and manage the behavior of collecting payments. If no setting is
       * provided here, the settings from the customer referenced from the payer will be used if
       * they exist. If no customer settings are present, the merchant default settings will be
       * used.
       */
      public Builder setCollection(CadenceCreateParams.Settings.Collection collection) {
        this.collection = collection;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceCreateParams.Settings#extraParams} for the field documentation.
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
       * See {@link CadenceCreateParams.Settings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Bill {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the referenced Settings object. */
      @SerializedName("id")
      String id;

      /**
       * An optional field to specify the version of the Settings to use. If not provided, this will
       * always default to the live version any time the settings are used.
       */
      @SerializedName("version")
      String version;

      private Bill(Map<String, Object> extraParams, String id, String version) {
        this.extraParams = extraParams;
        this.id = id;
        this.version = version;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String id;

        private String version;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.Settings.Bill build() {
          return new CadenceCreateParams.Settings.Bill(this.extraParams, this.id, this.version);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.Settings.Bill#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.Settings.Bill#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced Settings object. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /**
         * An optional field to specify the version of the Settings to use. If not provided, this
         * will always default to the live version any time the settings are used.
         */
        public Builder setVersion(String version) {
          this.version = version;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Collection {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the referenced Settings object. */
      @SerializedName("id")
      String id;

      /**
       * An optional field to specify the version of the Settings to use. If not provided, this will
       * always default to the live version any time the settings are used.
       */
      @SerializedName("version")
      String version;

      private Collection(Map<String, Object> extraParams, String id, String version) {
        this.extraParams = extraParams;
        this.id = id;
        this.version = version;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String id;

        private String version;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceCreateParams.Settings.Collection build() {
          return new CadenceCreateParams.Settings.Collection(
              this.extraParams, this.id, this.version);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceCreateParams.Settings.Collection#extraParams} for the field
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
         * map. See {@link CadenceCreateParams.Settings.Collection#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced Settings object. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /**
         * An optional field to specify the version of the Settings to use. If not provided, this
         * will always default to the live version any time the settings are used.
         */
        public Builder setVersion(String version) {
          this.version = version;
          return this;
        }
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("invoice_discount_rules")
    INVOICE_DISCOUNT_RULES("invoice_discount_rules");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
