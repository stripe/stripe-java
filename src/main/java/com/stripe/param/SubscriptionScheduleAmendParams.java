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
  List<SubscriptionScheduleAmendParams.Amendment> amendments;

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
      List<SubscriptionScheduleAmendParams.Amendment> amendments,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.amendments = amendments;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<SubscriptionScheduleAmendParams.Amendment> amendments;

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
    public Builder addAmendment(SubscriptionScheduleAmendParams.Amendment element) {
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
    public Builder addAllAmendment(List<SubscriptionScheduleAmendParams.Amendment> elements) {
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
    List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> discountActions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Changes to the subscription items during the amendment time span. */
    @SerializedName("item_actions")
    List<SubscriptionScheduleAmendParams.Amendment.ItemAction> itemActions;

    /**
     * Changes to how Stripe handles prorations during the amendment time span. Affects if and how
     * prorations are created when a future phase starts. In cases where the amendment changes the
     * currently active phase, it is used to determine whether or how to prorate now, at the time of
     * the request. Also supported as a point-in-time operation when {@code amendment_end} is {@code
     * null}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    private Amendment(
        AmendmentEnd amendmentEnd,
        AmendmentStart amendmentStart,
        List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> discountActions,
        Map<String, Object> extraParams,
        List<SubscriptionScheduleAmendParams.Amendment.ItemAction> itemActions,
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

      private List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> discountActions;

      private Map<String, Object> extraParams;

      private List<SubscriptionScheduleAmendParams.Amendment.ItemAction> itemActions;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleAmendParams.Amendment build() {
        return new SubscriptionScheduleAmendParams.Amendment(
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
      public Builder setAmendmentEnd(
          SubscriptionScheduleAmendParams.Amendment.AmendmentEnd amendmentEnd) {
        this.amendmentEnd = amendmentEnd;
        return this;
      }

      /**
       * Details to identify the earliest timestamp where the proposed change should take effect.
       */
      public Builder setAmendmentStart(
          SubscriptionScheduleAmendParams.Amendment.AmendmentStart amendmentStart) {
        this.amendmentStart = amendmentStart;
        return this;
      }

      /**
       * Add an element to `discountActions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleAmendParams.Amendment#discountActions} for the field documentation.
       */
      public Builder addDiscountAction(
          SubscriptionScheduleAmendParams.Amendment.DiscountAction element) {
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
      public Builder addAllDiscountAction(
          List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> elements) {
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
      public Builder addItemAction(SubscriptionScheduleAmendParams.Amendment.ItemAction element) {
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
      public Builder addAllItemAction(
          List<SubscriptionScheduleAmendParams.Amendment.ItemAction> elements) {
        if (this.itemActions == null) {
          this.itemActions = new ArrayList<>();
        }
        this.itemActions.addAll(elements);
        return this;
      }

      /**
       * Changes to how Stripe handles prorations during the amendment time span. Affects if and how
       * prorations are created when a future phase starts. In cases where the amendment changes the
       * currently active phase, it is used to determine whether or how to prorate now, at the time
       * of the request. Also supported as a point-in-time operation when {@code amendment_end} is
       * {@code null}.
       */
      public Builder setProrationBehavior(
          SubscriptionScheduleAmendParams.Amendment.ProrationBehavior prorationBehavior) {
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

      /**
       * A precise Unix timestamp for the amendment to end. Must be after the {@code
       * amendment_start}.
       */
      @SerializedName("timestamp")
      Long timestamp;

      /** Select one of three ways to pass the {@code amendment_end}. */
      @SerializedName("type")
      Type type;

      private AmendmentEnd(
          Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.AmendmentEnd build() {
          return new SubscriptionScheduleAmendParams.Amendment.AmendmentEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the amendment starting from the {@code amendment_start}. */
        public Builder setDuration(
            SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration duration) {
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

        /**
         * A precise Unix timestamp for the amendment to end. Must be after the {@code
         * amendment_start}.
         */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** Select one of three ways to pass the {@code amendment_end}. */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Type type) {
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

        /**
         * Specifies a type of interval unit. Either {@code day}, {@code week}, {@code month} or
         * {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals, as an whole number greater than 0. Stripe multiplies this by the
         * interval type to get the overall duration.
         */
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
          public SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration build() {
            return new SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
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

          /**
           * Specifies a type of interval unit. Either {@code day}, {@code week}, {@code month} or
           * {@code year}.
           */
          public Builder setInterval(
              SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals, as an whole number greater than 0. Stripe multiplies this by
           * the interval type to get the overall duration.
           */
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

      /** A precise Unix timestamp for the amendment to start. */
      @SerializedName("timestamp")
      Long timestamp;

      /** Select one of three ways to pass the {@code amendment_start}. */
      @SerializedName("type")
      Type type;

      private AmendmentStart(
          AmendmentEnd amendmentEnd, Map<String, Object> extraParams, Long timestamp, Type type) {
        this.amendmentEnd = amendmentEnd;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentEnd amendmentEnd;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.AmendmentStart build() {
          return new SubscriptionScheduleAmendParams.Amendment.AmendmentStart(
              this.amendmentEnd, this.extraParams, this.timestamp, this.type);
        }

        /**
         * Details of another amendment in the same array, immediately after which this amendment
         * should begin.
         */
        public Builder setAmendmentEnd(
            SubscriptionScheduleAmendParams.Amendment.AmendmentStart.AmendmentEnd amendmentEnd) {
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

        /** A precise Unix timestamp for the amendment to start. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** Select one of three ways to pass the {@code amendment_start}. */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.AmendmentStart.Type type) {
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

        /**
         * The position of the previous amendment in the {@code amendments} array after which this
         * amendment should begin. Indexes start from 0 and must be less than the index of the
         * current amendment in the array.
         */
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
          public SubscriptionScheduleAmendParams.Amendment.AmendmentStart.AmendmentEnd build() {
            return new SubscriptionScheduleAmendParams.Amendment.AmendmentStart.AmendmentEnd(
                this.extraParams, this.index);
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

          /**
           * The position of the previous amendment in the {@code amendments} array after which this
           * amendment should begin. Indexes start from 0 and must be less than the index of the
           * current amendment in the array.
           */
          public Builder setIndex(Long index) {
            this.index = index;
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

      /** Determines the type of discount action. */
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
        public SubscriptionScheduleAmendParams.Amendment.DiscountAction build() {
          return new SubscriptionScheduleAmendParams.Amendment.DiscountAction(
              this.add, this.extraParams, this.remove, this.set, this.type);
        }

        /** Details of the discount to add. */
        public Builder setAdd(SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add add) {
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
        public Builder setRemove(
            SubscriptionScheduleAmendParams.Amendment.DiscountAction.Remove remove) {
          this.remove = remove;
          return this;
        }

        /** Details of the discount to replace the existing discounts with. */
        public Builder setSet(SubscriptionScheduleAmendParams.Amendment.DiscountAction.Set set) {
          this.set = set;
          return this;
        }

        /** Determines the type of discount action. */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.DiscountAction.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Add {
        /** The coupon code to redeem. */
        @SerializedName("coupon")
        String coupon;

        /** An ID of an existing discount for a coupon that was already redeemed. */
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

        /**
         * The index, starting at 0, at which to position the new discount. When not supplied,
         * Stripe defaults to appending the discount to the end of the {@code discounts} array.
         */
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
          public SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add build() {
            return new SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add(
                this.coupon, this.discount, this.extraParams, this.index);
          }

          /** The coupon code to redeem. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount for a coupon that was already redeemed. */
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

          /**
           * The index, starting at 0, at which to position the new discount. When not supplied,
           * Stripe defaults to appending the discount to the end of the {@code discounts} array.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      @Getter
      public static class Remove {
        /** The coupon code to remove from the {@code discounts} array. */
        @SerializedName("coupon")
        String coupon;

        /** The ID of a discount to remove from the {@code discounts} array. */
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
          public SubscriptionScheduleAmendParams.Amendment.DiscountAction.Remove build() {
            return new SubscriptionScheduleAmendParams.Amendment.DiscountAction.Remove(
                this.coupon, this.discount, this.extraParams);
          }

          /** The coupon code to remove from the {@code discounts} array. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The ID of a discount to remove from the {@code discounts} array. */
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
        /** The coupon code to replace the {@code discounts} array with. */
        @SerializedName("coupon")
        String coupon;

        /** An ID of an existing discount to replace the {@code discounts} array with. */
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
          public SubscriptionScheduleAmendParams.Amendment.DiscountAction.Set build() {
            return new SubscriptionScheduleAmendParams.Amendment.DiscountAction.Set(
                this.coupon, this.discount, this.extraParams);
          }

          /** The coupon code to replace the {@code discounts} array with. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount to replace the {@code discounts} array with. */
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
      /**
       * Details of the subscription item to add. If an item with the same {@code price} exists, it
       * will be replaced by this new item. Otherwise, it adds the new item.
       */
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

      /**
       * Details of the subscription item to replace the existing items with. If an item with the
       * {@code set[price]} already exists, the {@code items} array is not cleared. Instead, all of
       * the other {@code set} properties that are passed in this request will replace the existing
       * values for the configuration item.
       */
      @SerializedName("set")
      Set set;

      /** Determines the type of item action. */
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
        public SubscriptionScheduleAmendParams.Amendment.ItemAction build() {
          return new SubscriptionScheduleAmendParams.Amendment.ItemAction(
              this.add, this.extraParams, this.remove, this.set, this.type);
        }

        /**
         * Details of the subscription item to add. If an item with the same {@code price} exists,
         * it will be replaced by this new item. Otherwise, it adds the new item.
         */
        public Builder setAdd(SubscriptionScheduleAmendParams.Amendment.ItemAction.Add add) {
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
        public Builder setRemove(
            SubscriptionScheduleAmendParams.Amendment.ItemAction.Remove remove) {
          this.remove = remove;
          return this;
        }

        /**
         * Details of the subscription item to replace the existing items with. If an item with the
         * {@code set[price]} already exists, the {@code items} array is not cleared. Instead, all
         * of the other {@code set} properties that are passed in this request will replace the
         * existing values for the configuration item.
         */
        public Builder setSet(SubscriptionScheduleAmendParams.Amendment.ItemAction.Set set) {
          this.set = set;
          return this;
        }

        /** Determines the type of item action. */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.ItemAction.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Add {
        /**
         * The discounts applied to the item. Subscription item discounts are applied before
         * subscription discounts.
         */
        @SerializedName("discounts")
        List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount> discounts;

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
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /** Quantity for this item. */
        @SerializedName("quantity")
        Long quantity;

        /**
         * The tax rates that apply to this subscription item. When set, the {@code
         * default_tax_rates} on the subscription do not apply to this {@code subscription_item}.
         */
        @SerializedName("tax_rates")
        List<String> taxRates;

        /** Options that configure the trial on the subscription item. */
        @SerializedName("trial")
        Trial trial;

        private Add(
            List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount> discounts,
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
          private List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add build() {
            return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add(
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
          public Builder addDiscount(
              SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount element) {
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
          public Builder addAllDiscount(
              List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount> elements) {
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

          /** The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /** Quantity for this item. */
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

          /** Options that configure the trial on the subscription item. */
          public Builder setTrial(
              SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial trial) {
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
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount(
                  this.coupon, this.discount, this.extraParams);
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

          /** Determines the type of trial for this item. */
          @SerializedName("type")
          Type type;

          private Trial(Map<String, Object> extraParams, Type type) {
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial(
                  this.extraParams, this.type);
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

            /** Determines the type of trial for this item. */
            public Builder setType(
                SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

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

        /** ID of a price to remove. */
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
          public SubscriptionScheduleAmendParams.Amendment.ItemAction.Remove build() {
            return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Remove(
                this.extraParams, this.price);
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

          /** ID of a price to remove. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }
        }
      }

      @Getter
      public static class Set {
        /**
         * If the an item with the {@code price} already exists, passing this will override the
         * {@code discounts} array on the subscription item that matches that price. Otherwise, the
         * {@code items} array is cleared and a single new item is added with the supplied {@code
         * discounts}.
         */
        @SerializedName("discounts")
        List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount> discounts;

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
         * If the an item with the {@code price} already exists, passing this will override the
         * {@code metadata} on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
         * metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /**
         * If the an item with the {@code price} already exists, passing this will override the
         * quantity on the subscription item that matches that price. Otherwise, the {@code items}
         * array is cleared and a single new item is added with the supplied {@code quantity}.
         */
        @SerializedName("quantity")
        Long quantity;

        /**
         * If the an item with the {@code price} already exists, passing this will override the
         * {@code tax_rates} array on the subscription item that matches that price. Otherwise, the
         * {@code items} array is cleared and a single new item is added with the supplied {@code
         * tax_rates}.
         */
        @SerializedName("tax_rates")
        List<String> taxRates;

        /**
         * If the an item with the {@code price} already exists, passing this will override the
         * {@code trial} configuration on the subscription item that matches that price. Otherwise,
         * the {@code items} array is cleared and a single new item is added with the supplied
         * {@code trial}.
         */
        @SerializedName("trial")
        Trial trial;

        private Set(
            List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount> discounts,
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
          private List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set build() {
            return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set(
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
          public Builder addDiscount(
              SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount element) {
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
          public Builder addAllDiscount(
              List<SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount> elements) {
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

          /** The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * If the an item with the {@code price} already exists, passing this will override the
           * quantity on the subscription item that matches that price. Otherwise, the {@code items}
           * array is cleared and a single new item is added with the supplied {@code quantity}.
           */
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

          /**
           * If the an item with the {@code price} already exists, passing this will override the
           * {@code trial} configuration on the subscription item that matches that price.
           * Otherwise, the {@code items} array is cleared and a single new item is added with the
           * supplied {@code trial}.
           */
          public Builder setTrial(
              SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial trial) {
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
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount(
                  this.coupon, this.discount, this.extraParams);
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

          /** Determines the type of trial for this item. */
          @SerializedName("type")
          Type type;

          private Trial(Map<String, Object> extraParams, Type type) {
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial(
                  this.extraParams, this.type);
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

            /** Determines the type of trial for this item. */
            public Builder setType(
                SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

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
