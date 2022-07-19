// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SubscriptionScheduleAmendParams extends ApiRequestParams {
  /** Changes to apply to the phases of the subscription schedule, in the order provided. */
  @SerializedName("amendments")
  List<Amendment> amendments;

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

  private SubscriptionScheduleAmendParams(
      List<Amendment> amendments, List<String> expand, Map<String, Object> extraParams) {
    this.amendments = amendments;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<Amendment> amendments;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleAmendParams build() {
      return new SubscriptionScheduleAmendParams(this.amendments, this.expand, this.extraParams);
    }

    /**
     * Add an element to `amendments` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleAmendParams#amendments} for the field documentation.
     */
    public Builder addAmendment(Amendment element) {
      if (this.amendments == null) {
        this.amendments = new ArrayList<>();
      }
      this.amendments.add(element);
      return this;
    }

    /**
     * Add all elements to `amendments` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleAmendParams#amendments} for the field documentation.
     */
    public Builder addAllAmendment(List<Amendment> elements) {
      if (this.amendments == null) {
        this.amendments = new ArrayList<>();
      }
      this.amendments.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleAmendParams#expand} for the field documentation.
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
     * SubscriptionScheduleAmendParams#expand} for the field documentation.
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
     * SubscriptionScheduleAmendParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionScheduleAmendParams#extraParams} for the field documentation.
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
  public static class Amendment {
    /**
     * Details to identify the end of the time range modified by the proposed change. If not
     * supplied, the amendment is considered a point-in-time operation that only affects the exact
     * timestamp at {@code amendment_start}, and a restricted set of attributes is supported on the
     * amendment.
     */
    @SerializedName("amendment_end")
    AmendmentEnd amendmentEnd;

    /** Details to identify the earliest timestamp where the proposed change should take effect. */
    @SerializedName("amendment_start")
    AmendmentStart amendmentStart;

    /**
     * Changes to the coupons being redeemed or discounts being applied during the amendment time
     * span.
     */
    @SerializedName("discount_actions")
    List<DiscountAction> discountActions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Changes to the items being billed or provisioned to your customer during the amendment time
     * span.
     */
    @SerializedName("item_actions")
    List<ItemAction> itemActions;

    /**
     * Changes to how Stripe handles prorations during the amendment time span. Also supported as a
     * point-in-time operation when {@code amendment_end} is {@code null}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    private Amendment(
        AmendmentEnd amendmentEnd,
        AmendmentStart amendmentStart,
        List<DiscountAction> discountActions,
        Map<String, Object> extraParams,
        List<ItemAction> itemActions,
        ProrationBehavior prorationBehavior) {
      this.amendmentEnd = amendmentEnd;
      this.amendmentStart = amendmentStart;
      this.discountActions = discountActions;
      this.extraParams = extraParams;
      this.itemActions = itemActions;
      this.prorationBehavior = prorationBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AmendmentEnd amendmentEnd;

      private AmendmentStart amendmentStart;

      private List<DiscountAction> discountActions;

      private Map<String, Object> extraParams;

      private List<ItemAction> itemActions;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public Amendment build() {
        return new Amendment(
            this.amendmentEnd,
            this.amendmentStart,
            this.discountActions,
            this.extraParams,
            this.itemActions,
            this.prorationBehavior);
      }

      /**
       * Details to identify the end of the time range modified by the proposed change. If not
       * supplied, the amendment is considered a point-in-time operation that only affects the exact
       * timestamp at {@code amendment_start}, and a restricted set of attributes is supported on
       * the amendment.
       */
      public Builder setAmendmentEnd(AmendmentEnd amendmentEnd) {
        this.amendmentEnd = amendmentEnd;
        return this;
      }

      /**
       * Details to identify the earliest timestamp where the proposed change should take effect.
       */
      public Builder setAmendmentStart(AmendmentStart amendmentStart) {
        this.amendmentStart = amendmentStart;
        return this;
      }

      /**
       * Add an element to `discountActions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleAmendParams.Amendment#discountActions} for the field documentation.
       */
      public Builder addDiscountAction(DiscountAction element) {
        if (this.discountActions == null) {
          this.discountActions = new ArrayList<>();
        }
        this.discountActions.add(element);
        return this;
      }

      /**
       * Add all elements to `discountActions` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleAmendParams.Amendment#discountActions} for the field
       * documentation.
       */
      public Builder addAllDiscountAction(List<DiscountAction> elements) {
        if (this.discountActions == null) {
          this.discountActions = new ArrayList<>();
        }
        this.discountActions.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleAmendParams.Amendment#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleAmendParams.Amendment#extraParams} for the field
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
       * Add an element to `itemActions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleAmendParams.Amendment#itemActions} for the field documentation.
       */
      public Builder addItemAction(ItemAction element) {
        if (this.itemActions == null) {
          this.itemActions = new ArrayList<>();
        }
        this.itemActions.add(element);
        return this;
      }

      /**
       * Add all elements to `itemActions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleAmendParams.Amendment#itemActions} for the field documentation.
       */
      public Builder addAllItemAction(List<ItemAction> elements) {
        if (this.itemActions == null) {
          this.itemActions = new ArrayList<>();
        }
        this.itemActions.addAll(elements);
        return this;
      }

      /**
       * Changes to how Stripe handles prorations during the amendment time span. Also supported as
       * a point-in-time operation when {@code amendment_end} is {@code null}.
       */
      public Builder setProrationBehavior(ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }
    }

    @Getter
    public static class AmendmentEnd {
      /** Time span for the amendment starting from the {@code amendment_start}. */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Cover all remaining phases of the subscription schedule with the amendment. */
      @SerializedName("schedule_end")
      ScheduleEnd scheduleEnd;

      /**
       * A precise Unix timestamp for the amendment to end. Must be after the {@code
       * amendment_start}.
       */
      @SerializedName("timestamp")
      Timestamp timestamp;

      /** Select one of three ways to pass the {@code amendment_end}. */
      @SerializedName("type")
      Type type;

      private AmendmentEnd(
          Duration duration,
          Map<String, Object> extraParams,
          ScheduleEnd scheduleEnd,
          Timestamp timestamp,
          Type type) {
        this.duration = duration;
        this.extraParams = extraParams;
        this.scheduleEnd = scheduleEnd;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Duration duration;

        private Map<String, Object> extraParams;

        private ScheduleEnd scheduleEnd;

        private Timestamp timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AmendmentEnd build() {
          return new AmendmentEnd(
              this.duration, this.extraParams, this.scheduleEnd, this.timestamp, this.type);
        }

        /** Time span for the amendment starting from the {@code amendment_start}. */
        public Builder setDuration(Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.AmendmentEnd#extraParams} for
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.AmendmentEnd#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Cover all remaining phases of the subscription schedule with the amendment. */
        public Builder setScheduleEnd(ScheduleEnd scheduleEnd) {
          this.scheduleEnd = scheduleEnd;
          return this;
        }

        /**
         * A precise Unix timestamp for the amendment to end. Must be after the {@code
         * amendment_start}.
         */
        public Builder setTimestamp(Timestamp timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** Select one of three ways to pass the {@code amendment_end}. */
        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Duration {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("interval")
        Interval interval;

        @SerializedName("interval_count")
        Long intervalCount;

        private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public Duration build() {
            return new Duration(this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setInterval(Interval interval) {
            this.interval = interval;
            return this;
          }

          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
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

          Interval(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class ScheduleEnd {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private ScheduleEnd(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public ScheduleEnd build() {
            return new ScheduleEnd(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.ScheduleEnd#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.ScheduleEnd#extraParams} for the
           * field documentation.
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

      @Getter
      public static class Timestamp {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("value")
        Long value;

        private Timestamp(Map<String, Object> extraParams, Long value) {
          this.extraParams = extraParams;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long value;

          /** Finalize and obtain parameter instance from this builder. */
          public Timestamp build() {
            return new Timestamp(this.extraParams, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Timestamp#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Timestamp#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setValue(Long value) {
            this.value = value;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AmendmentStart {
      /**
       * Details of another amendment in the same array, immediately after which this amendment
       * should begin.
       */
      @SerializedName("amendment_end")
      AmendmentEnd amendmentEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Specify that this amendment should start at the current time as determined by Stripe
       * servers. In the case of Test Clocks, {@code now} uses the frozen time on the testmode
       * clock.
       */
      @SerializedName("now")
      Now now;

      /** A precise Unix timestamp for the amendment to start. */
      @SerializedName("timestamp")
      Timestamp timestamp;

      /** Select one of three ways to pass the {@code amendment_start}. */
      @SerializedName("type")
      Type type;

      private AmendmentStart(
          AmendmentEnd amendmentEnd,
          Map<String, Object> extraParams,
          Now now,
          Timestamp timestamp,
          Type type) {
        this.amendmentEnd = amendmentEnd;
        this.extraParams = extraParams;
        this.now = now;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentEnd amendmentEnd;

        private Map<String, Object> extraParams;

        private Now now;

        private Timestamp timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AmendmentStart build() {
          return new AmendmentStart(
              this.amendmentEnd, this.extraParams, this.now, this.timestamp, this.type);
        }

        /**
         * Details of another amendment in the same array, immediately after which this amendment
         * should begin.
         */
        public Builder setAmendmentEnd(AmendmentEnd amendmentEnd) {
          this.amendmentEnd = amendmentEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.AmendmentStart#extraParams} for
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.AmendmentStart#extraParams} for
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
         * Specify that this amendment should start at the current time as determined by Stripe
         * servers. In the case of Test Clocks, {@code now} uses the frozen time on the testmode
         * clock.
         */
        public Builder setNow(Now now) {
          this.now = now;
          return this;
        }

        /** A precise Unix timestamp for the amendment to start. */
        public Builder setTimestamp(Timestamp timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** Select one of three ways to pass the {@code amendment_start}. */
        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class AmendmentEnd {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("index")
        Long index;

        private AmendmentEnd(Map<String, Object> extraParams, Long index) {
          this.extraParams = extraParams;
          this.index = index;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long index;

          /** Finalize and obtain parameter instance from this builder. */
          public AmendmentEnd build() {
            return new AmendmentEnd(this.extraParams, this.index);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.AmendmentEnd#extraParams} for
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.AmendmentEnd#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      @Getter
      public static class Now {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Now(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Now build() {
            return new Now(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.Now#extraParams} for the field
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.Now#extraParams} for the field
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

      @Getter
      public static class Timestamp {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("value")
        Long value;

        private Timestamp(Map<String, Object> extraParams, Long value) {
          this.extraParams = extraParams;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long value;

          /** Finalize and obtain parameter instance from this builder. */
          public Timestamp build() {
            return new Timestamp(this.extraParams, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.Timestamp#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.Timestamp#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setValue(Long value) {
            this.value = value;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("amendment_end")
        AMENDMENT_END("amendment_end"),

        @SerializedName("now")
        NOW("now"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class DiscountAction {
      /** Details of the discount to add. */
      @SerializedName("add")
      Add add;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details of the discount to remove. */
      @SerializedName("remove")
      Remove remove;

      /** Details of the discount to replace the existing discounts with. */
      @SerializedName("set")
      Set set;

      @SerializedName("type")
      Type type;

      private DiscountAction(
          Add add, Map<String, Object> extraParams, Remove remove, Set set, Type type) {
        this.add = add;
        this.extraParams = extraParams;
        this.remove = remove;
        this.set = set;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Add add;

        private Map<String, Object> extraParams;

        private Remove remove;

        private Set set;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public DiscountAction build() {
          return new DiscountAction(this.add, this.extraParams, this.remove, this.set, this.type);
        }

        /** Details of the discount to add. */
        public Builder setAdd(Add add) {
          this.add = add;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.DiscountAction#extraParams} for
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.DiscountAction#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details of the discount to remove. */
        public Builder setRemove(Remove remove) {
          this.remove = remove;
          return this;
        }

        /** Details of the discount to replace the existing discounts with. */
        public Builder setSet(Set set) {
          this.set = set;
          return this;
        }

        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Add {
        @SerializedName("coupon")
        String coupon;

        @SerializedName("discount")
        String discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("index")
        Long index;

        private Add(String coupon, String discount, Map<String, Object> extraParams, Long index) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.index = index;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private Map<String, Object> extraParams;

          private Long index;

          /** Finalize and obtain parameter instance from this builder. */
          public Add build() {
            return new Add(this.coupon, this.discount, this.extraParams, this.index);
          }

          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add#extraParams} for the field
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      @Getter
      public static class Remove {
        @SerializedName("coupon")
        String coupon;

        @SerializedName("discount")
        String discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Remove(String coupon, String discount, Map<String, Object> extraParams) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Remove build() {
            return new Remove(this.coupon, this.discount, this.extraParams);
          }

          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Remove#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Remove#extraParams} for the
           * field documentation.
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

      @Getter
      public static class Set {
        @SerializedName("coupon")
        String coupon;

        @SerializedName("discount")
        String discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Set(String coupon, String discount, Map<String, Object> extraParams) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Set build() {
            return new Set(this.coupon, this.discount, this.extraParams);
          }

          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Set#extraParams} for the field
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Set#extraParams} for the field
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

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("add")
        ADD("add"),

        @SerializedName("remove")
        REMOVE("remove"),

        @SerializedName("set")
        SET("set");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class ItemAction {
      /** Details of the subscription item to add. */
      @SerializedName("add")
      Add add;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details of the subscription item to remove. */
      @SerializedName("remove")
      Remove remove;

      /** Details of the subscription item to replace the existing items with. */
      @SerializedName("set")
      Set set;

      @SerializedName("type")
      Type type;

      private ItemAction(
          Add add, Map<String, Object> extraParams, Remove remove, Set set, Type type) {
        this.add = add;
        this.extraParams = extraParams;
        this.remove = remove;
        this.set = set;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Add add;

        private Map<String, Object> extraParams;

        private Remove remove;

        private Set set;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ItemAction build() {
          return new ItemAction(this.add, this.extraParams, this.remove, this.set, this.type);
        }

        /** Details of the subscription item to add. */
        public Builder setAdd(Add add) {
          this.add = add;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction#extraParams} for the
         * field documentation.
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details of the subscription item to remove. */
        public Builder setRemove(Remove remove) {
          this.remove = remove;
          return this;
        }

        /** Details of the subscription item to replace the existing items with. */
        public Builder setSet(Set set) {
          this.set = set;
          return this;
        }

        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Add {
        @SerializedName("discounts")
        List<Discount> discounts;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("metadata")
        Map<String, String> metadata;

        @SerializedName("price")
        String price;

        @SerializedName("quantity")
        Long quantity;

        @SerializedName("tax_rates")
        List<String> taxRates;

        @SerializedName("trial")
        Trial trial;

        private Add(
            List<Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            String price,
            Long quantity,
            List<String> taxRates,
            Trial trial) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public Add build() {
            return new Add(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#discounts} for the field
           * documentation.
           */
          public Builder addDiscount(Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#discounts} for the field
           * documentation.
           */
          public Builder addAllDiscount(List<Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#extraParams}
           * for the field documentation.
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
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#metadata} for the field
           * documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#metadata} for
           * the field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#taxRates} for the field
           * documentation.
           */
          public Builder addTaxRate(String element) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add#taxRates} for the field
           * documentation.
           */
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.addAll(elements);
            return this;
          }

          public Builder setTrial(Trial trial) {
            this.trial = trial;
            return this;
          }
        }

        @Getter
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Discount(String coupon, String discount, Map<String, Object> extraParams) {
            this.coupon = coupon;
            this.discount = discount;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public Discount build() {
              return new Discount(this.coupon, this.discount, this.extraParams);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount#extraParams} for
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

        @Getter
        public static class Trial {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          @SerializedName("free")
          Free free;

          @SerializedName("none")
          None none;

          /**
           * Details of a different price, quantity, or both, to bill your customer for during a
           * paid trial.
           */
          @SerializedName("paid")
          Paid paid;

          @SerializedName("type")
          Type type;

          private Trial(
              Map<String, Object> extraParams, Free free, None none, Paid paid, Type type) {
            this.extraParams = extraParams;
            this.free = free;
            this.none = none;
            this.paid = paid;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Free free;

            private None none;

            private Paid paid;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public Trial build() {
              return new Trial(this.extraParams, this.free, this.none, this.paid, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial#extraParams} for the
             * field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            public Builder setFree(Free free) {
              this.free = free;
              return this;
            }

            public Builder setNone(None none) {
              this.none = none;
              return this;
            }

            /**
             * Details of a different price, quantity, or both, to bill your customer for during a
             * paid trial.
             */
            public Builder setPaid(Paid paid) {
              this.paid = paid;
              return this;
            }

            public Builder setType(Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class Free {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Free(Map<String, Object> extraParams) {
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public Free build() {
                return new Free(this.extraParams);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.Free#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.Free#extraParams}
               * for the field documentation.
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

          @Getter
          public static class None {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private None(Map<String, Object> extraParams) {
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public None build() {
                return new None(this.extraParams);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.None#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.None#extraParams}
               * for the field documentation.
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

          @Getter
          public static class Paid {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            @SerializedName("price")
            String price;

            @SerializedName("quantity")
            Long quantity;

            private Paid(Map<String, Object> extraParams, String price, Long quantity) {
              this.extraParams = extraParams;
              this.price = price;
              this.quantity = quantity;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String price;

              private Long quantity;

              /** Finalize and obtain parameter instance from this builder. */
              public Paid build() {
                return new Paid(this.extraParams, this.price, this.quantity);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.Paid#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.Paid#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              public Builder setPrice(String price) {
                this.price = price;
                return this;
              }

              public Builder setQuantity(Long quantity) {
                this.quantity = quantity;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

            @SerializedName("none")
            NONE("none"),

            @SerializedName("paid")
            PAID("paid");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class Remove {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("price")
        String price;

        private Remove(Map<String, Object> extraParams, String price) {
          this.extraParams = extraParams;
          this.price = price;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          /** Finalize and obtain parameter instance from this builder. */
          public Remove build() {
            return new Remove(this.extraParams, this.price);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Remove#extraParams} for the field
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
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Remove#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }
        }
      }

      @Getter
      public static class Set {
        @SerializedName("discounts")
        List<Discount> discounts;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("metadata")
        Map<String, String> metadata;

        @SerializedName("price")
        String price;

        @SerializedName("quantity")
        Long quantity;

        @SerializedName("tax_rates")
        List<String> taxRates;

        @SerializedName("trial")
        Trial trial;

        private Set(
            List<Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            String price,
            Long quantity,
            List<String> taxRates,
            Trial trial) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public Set build() {
            return new Set(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#discounts} for the field
           * documentation.
           */
          public Builder addDiscount(Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#discounts} for the field
           * documentation.
           */
          public Builder addAllDiscount(List<Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#extraParams}
           * for the field documentation.
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
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#metadata} for the field
           * documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#metadata} for
           * the field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#taxRates} for the field
           * documentation.
           */
          public Builder addTaxRate(String element) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set#taxRates} for the field
           * documentation.
           */
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.addAll(elements);
            return this;
          }

          public Builder setTrial(Trial trial) {
            this.trial = trial;
            return this;
          }
        }

        @Getter
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Discount(String coupon, String discount, Map<String, Object> extraParams) {
            this.coupon = coupon;
            this.discount = discount;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public Discount build() {
              return new Discount(this.coupon, this.discount, this.extraParams);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount#extraParams} for
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

        @Getter
        public static class Trial {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          @SerializedName("free")
          Free free;

          @SerializedName("none")
          None none;

          /**
           * Details of a different price, quantity, or both, to bill your customer for during a
           * paid trial.
           */
          @SerializedName("paid")
          Paid paid;

          @SerializedName("type")
          Type type;

          private Trial(
              Map<String, Object> extraParams, Free free, None none, Paid paid, Type type) {
            this.extraParams = extraParams;
            this.free = free;
            this.none = none;
            this.paid = paid;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Free free;

            private None none;

            private Paid paid;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public Trial build() {
              return new Trial(this.extraParams, this.free, this.none, this.paid, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial#extraParams} for the
             * field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            public Builder setFree(Free free) {
              this.free = free;
              return this;
            }

            public Builder setNone(None none) {
              this.none = none;
              return this;
            }

            /**
             * Details of a different price, quantity, or both, to bill your customer for during a
             * paid trial.
             */
            public Builder setPaid(Paid paid) {
              this.paid = paid;
              return this;
            }

            public Builder setType(Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class Free {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Free(Map<String, Object> extraParams) {
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public Free build() {
                return new Free(this.extraParams);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.Free#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.Free#extraParams}
               * for the field documentation.
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

          @Getter
          public static class None {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private None(Map<String, Object> extraParams) {
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public None build() {
                return new None(this.extraParams);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.None#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.None#extraParams}
               * for the field documentation.
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

          @Getter
          public static class Paid {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            @SerializedName("price")
            String price;

            @SerializedName("quantity")
            Long quantity;

            private Paid(Map<String, Object> extraParams, String price, Long quantity) {
              this.extraParams = extraParams;
              this.price = price;
              this.quantity = quantity;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String price;

              private Long quantity;

              /** Finalize and obtain parameter instance from this builder. */
              public Paid build() {
                return new Paid(this.extraParams, this.price, this.quantity);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.Paid#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.Paid#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              public Builder setPrice(String price) {
                this.price = price;
                return this;
              }

              public Builder setQuantity(Long quantity) {
                this.quantity = quantity;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

            @SerializedName("none")
            NONE("none"),

            @SerializedName("paid")
            PAID("paid");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("add")
        ADD("add"),

        @SerializedName("remove")
        REMOVE("remove"),

        @SerializedName("set")
        SET("set");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("always_invoice")
      ALWAYS_INVOICE("always_invoice"),

      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }
}
