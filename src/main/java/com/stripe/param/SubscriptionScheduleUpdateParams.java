// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionScheduleUpdateParams extends ApiRequestParams {
  /**
   * Configures when the subscription schedule generates prorations for phase transitions. Possible
   * values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the default being
   * {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase changes and
   * generate prorations at transition time. {@code prorate_up_front} will bill for all phases
   * within the current billing cycle up front.
   */
  @SerializedName("billing_behavior")
  BillingBehavior billingBehavior;

  /** Sets the billing schedules for the subscription schedule. */
  @SerializedName("billing_schedules")
  List<SubscriptionScheduleUpdateParams.BillingSchedule> billingSchedules;

  /** Object representing the subscription schedule's default settings. */
  @SerializedName("default_settings")
  DefaultSettings defaultSettings;

  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values
   * are {@code release} or {@code cancel} with the default being {@code release}. {@code release}
   * will end the subscription schedule and keep the underlying subscription running. {@code cancel}
   * will end the subscription schedule and cancel the underlying subscription.
   */
  @SerializedName("end_behavior")
  EndBehavior endBehavior;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have
   * different durations, plans, and coupons. If there are multiple phases, the {@code end_date} of
   * one phase will always equal the {@code start_date} of the next phase. Note that past phases can
   * be omitted.
   */
  @SerializedName("phases")
  List<SubscriptionScheduleUpdateParams.Phase> phases;

  /** If specified, the invoicing for the given billing cycle iterations will be processed now. */
  @SerializedName("prebilling")
  Prebilling prebilling;

  /**
   * If the update changes the billing configuration (item price, quantity, etc.) of the current
   * phase, indicates how prorations from this change should be handled. The default value is {@code
   * create_prorations}.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  private SubscriptionScheduleUpdateParams(
      BillingBehavior billingBehavior,
      List<SubscriptionScheduleUpdateParams.BillingSchedule> billingSchedules,
      DefaultSettings defaultSettings,
      EndBehavior endBehavior,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      List<SubscriptionScheduleUpdateParams.Phase> phases,
      Prebilling prebilling,
      ProrationBehavior prorationBehavior) {
    this.billingBehavior = billingBehavior;
    this.billingSchedules = billingSchedules;
    this.defaultSettings = defaultSettings;
    this.endBehavior = endBehavior;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.phases = phases;
    this.prebilling = prebilling;
    this.prorationBehavior = prorationBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingBehavior billingBehavior;

    private List<SubscriptionScheduleUpdateParams.BillingSchedule> billingSchedules;

    private DefaultSettings defaultSettings;

    private EndBehavior endBehavior;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private List<SubscriptionScheduleUpdateParams.Phase> phases;

    private Prebilling prebilling;

    private ProrationBehavior prorationBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleUpdateParams build() {
      return new SubscriptionScheduleUpdateParams(
          this.billingBehavior,
          this.billingSchedules,
          this.defaultSettings,
          this.endBehavior,
          this.expand,
          this.extraParams,
          this.metadata,
          this.phases,
          this.prebilling,
          this.prorationBehavior);
    }

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
     * all phases within the current billing cycle up front.
     */
    public Builder setBillingBehavior(
        SubscriptionScheduleUpdateParams.BillingBehavior billingBehavior) {
      this.billingBehavior = billingBehavior;
      return this;
    }

    /**
     * Add an element to `billingSchedules` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#billingSchedules} for the field documentation.
     */
    public Builder addBillingSchedule(SubscriptionScheduleUpdateParams.BillingSchedule element) {
      if (this.billingSchedules == null) {
        this.billingSchedules = new ArrayList<>();
      }
      this.billingSchedules.add(element);
      return this;
    }

    /**
     * Add all elements to `billingSchedules` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#billingSchedules} for the field documentation.
     */
    public Builder addAllBillingSchedule(
        List<SubscriptionScheduleUpdateParams.BillingSchedule> elements) {
      if (this.billingSchedules == null) {
        this.billingSchedules = new ArrayList<>();
      }
      this.billingSchedules.addAll(elements);
      return this;
    }

    /** Object representing the subscription schedule's default settings. */
    public Builder setDefaultSettings(
        SubscriptionScheduleUpdateParams.DefaultSettings defaultSettings) {
      this.defaultSettings = defaultSettings;
      return this;
    }

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends. Possible
     * values are {@code release} or {@code cancel} with the default being {@code release}. {@code
     * release} will end the subscription schedule and keep the underlying subscription running.
     * {@code cancel} will end the subscription schedule and cancel the underlying subscription.
     */
    public Builder setEndBehavior(SubscriptionScheduleUpdateParams.EndBehavior endBehavior) {
      this.endBehavior = endBehavior;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
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
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
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
     * SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public Builder addPhase(SubscriptionScheduleUpdateParams.Phase element) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.add(element);
      return this;
    }

    /**
     * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public Builder addAllPhase(List<SubscriptionScheduleUpdateParams.Phase> elements) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(elements);
      return this;
    }

    /** If specified, the invoicing for the given billing cycle iterations will be processed now. */
    public Builder setPrebilling(SubscriptionScheduleUpdateParams.Prebilling prebilling) {
      this.prebilling = prebilling;
      return this;
    }

    /**
     * If the update changes the billing configuration (item price, quantity, etc.) of the current
     * phase, indicates how prorations from this change should be handled. The default value is
     * {@code create_prorations}.
     */
    public Builder setProrationBehavior(
        SubscriptionScheduleUpdateParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingSchedule {
    /** Configure billing schedule differently for individual subscription items. */
    @SerializedName("applies_to")
    List<SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo> appliesTo;

    /** The end date for the billing schedule. */
    @SerializedName("bill_until")
    BillUntil billUntil;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and up to
     * 200 characters. If not provided, a unique key will be generated.
     */
    @SerializedName("key")
    Object key;

    private BillingSchedule(
        List<SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo> appliesTo,
        BillUntil billUntil,
        Map<String, Object> extraParams,
        Object key) {
      this.appliesTo = appliesTo;
      this.billUntil = billUntil;
      this.extraParams = extraParams;
      this.key = key;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo> appliesTo;

      private BillUntil billUntil;

      private Map<String, Object> extraParams;

      private Object key;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.BillingSchedule build() {
        return new SubscriptionScheduleUpdateParams.BillingSchedule(
            this.appliesTo, this.billUntil, this.extraParams, this.key);
      }

      /**
       * Add an element to `appliesTo` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.BillingSchedule#appliesTo} for the field documentation.
       */
      public Builder addAppliesTo(
          SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo element) {
        if (this.appliesTo == null) {
          this.appliesTo = new ArrayList<>();
        }
        this.appliesTo.add(element);
        return this;
      }

      /**
       * Add all elements to `appliesTo` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.BillingSchedule#appliesTo} for the field documentation.
       */
      public Builder addAllAppliesTo(
          List<SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo> elements) {
        if (this.appliesTo == null) {
          this.appliesTo = new ArrayList<>();
        }
        this.appliesTo.addAll(elements);
        return this;
      }

      /** The end date for the billing schedule. */
      public Builder setBillUntil(
          SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil billUntil) {
        this.billUntil = billUntil;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.BillingSchedule#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.BillingSchedule#extraParams} for the field
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
       * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and up
       * to 200 characters. If not provided, a unique key will be generated.
       */
      public Builder setKey(String key) {
        this.key = key;
        return this;
      }

      /**
       * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and up
       * to 200 characters. If not provided, a unique key will be generated.
       */
      public Builder setKey(EmptyParam key) {
        this.key = key;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AppliesTo {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the price object. */
      @SerializedName("price")
      Object price;

      /**
       * <strong>Required.</strong> Controls which subscription items the billing schedule applies
       * to.
       */
      @SerializedName("type")
      Type type;

      private AppliesTo(Map<String, Object> extraParams, Object price, Type type) {
        this.extraParams = extraParams;
        this.price = price;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object price;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo build() {
          return new SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo(
              this.extraParams, this.price, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo#extraParams}
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
         * map. See {@link SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * <strong>Required.</strong> Controls which subscription items the billing schedule applies
         * to.
         */
        public Builder setType(
            SubscriptionScheduleUpdateParams.BillingSchedule.AppliesTo.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("price")
        PRICE("price");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillUntil {
      /** Specifies the billing period. */
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

      /** The end date of the billing schedule. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> Describes how the billing schedule will determine the end date.
       * Either {@code duration} or {@code timestamp}.
       */
      @SerializedName("type")
      Type type;

      private BillUntil(
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
        public SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil build() {
          return new SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Specifies the billing period. */
        public Builder setDuration(
            SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil#extraParams}
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
         * map. See {@link SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The end date of the billing schedule. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> Describes how the billing schedule will determine the end
         * date. Either {@code duration} or {@code timestamp}.
         */
        public Builder setType(
            SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
         * <strong>Required.</strong> Specifies billing duration. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /** The multiplier applied to the interval. */
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
          public SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration build() {
            return new SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration#extraParams} for
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
           * SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration#extraParams} for
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
           * <strong>Required.</strong> Specifies billing duration. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              SubscriptionScheduleUpdateParams.BillingSchedule.BillUntil.Duration.Interval
                  interval) {
            this.interval = interval;
            return this;
          }

          /** The multiplier applied to the interval. */
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
        @SerializedName("amendment_end")
        AMENDMENT_END("amendment_end"),

        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("line_ends_at")
        LINE_ENDS_AT("line_ends_at"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp"),

        @SerializedName("upcoming_invoice")
        UPCOMING_INVOICE("upcoming_invoice");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultSettings {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. The request must be made by a platform account on a connected account
     * in order to set an application fee percentage. For more information, see the application fees
     * <a
     * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /** Default settings for automatic tax computation. */
    @SerializedName("automatic_tax")
    AutomaticTax automaticTax;

    /**
     * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
     * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if this
     * phase specifies a trial. For more information, see the billing cycle <a
     * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
     */
    @SerializedName("billing_cycle_anchor")
    BillingCycleAnchor billingCycleAnchor;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    @SerializedName("billing_thresholds")
    Object billingThresholds;

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     * Defaults to {@code charge_automatically} on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    Object defaultPaymentMethod;

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    Object description;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * The account on behalf of which to charge, for each of the associated subscription's invoices.
     */
    @SerializedName("on_behalf_of")
    Object onBehalfOf;

    /**
     * Configures how the subscription schedule handles billing for phase transitions. Possible
     * values are {@code phase_start} (default) or {@code billing_period_start}. {@code phase_start}
     * bills based on the current state of the subscription, ignoring changes scheduled in future
     * phases. {@code billing_period_start} bills predictively for upcoming phase transitions within
     * the current billing cycle, including pricing changes and service period adjustments that will
     * occur before the next invoice.
     */
    @SerializedName("phase_effective_at")
    PhaseEffectiveAt phaseEffectiveAt;

    /**
     * The data with which to automatically create a Transfer for each of the associated
     * subscription's invoices.
     */
    @SerializedName("transfer_data")
    Object transferData;

    private DefaultSettings(
        BigDecimal applicationFeePercent,
        AutomaticTax automaticTax,
        BillingCycleAnchor billingCycleAnchor,
        Object billingThresholds,
        CollectionMethod collectionMethod,
        Object defaultPaymentMethod,
        Object description,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Object onBehalfOf,
        PhaseEffectiveAt phaseEffectiveAt,
        Object transferData) {
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.description = description;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.onBehalfOf = onBehalfOf;
      this.phaseEffectiveAt = phaseEffectiveAt;
      this.transferData = transferData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private AutomaticTax automaticTax;

      private BillingCycleAnchor billingCycleAnchor;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private Object defaultPaymentMethod;

      private Object description;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Object onBehalfOf;

      private PhaseEffectiveAt phaseEffectiveAt;

      private Object transferData;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.DefaultSettings build() {
        return new SubscriptionScheduleUpdateParams.DefaultSettings(
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
            this.defaultPaymentMethod,
            this.description,
            this.extraParams,
            this.invoiceSettings,
            this.onBehalfOf,
            this.phaseEffectiveAt,
            this.transferData);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** Default settings for automatic tax computation. */
      public Builder setAutomaticTax(
          SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax automaticTax) {
        this.automaticTax = automaticTax;
        return this;
      }

      /**
       * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
       * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
       * this phase specifies a trial. For more information, see the billing cycle <a
       * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
       */
      public Builder setBillingCycleAnchor(
          SubscriptionScheduleUpdateParams.DefaultSettings.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(
          SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      public Builder setCollectionMethod(
          SubscriptionScheduleUpdateParams.DefaultSettings.CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
      }

      /**
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Subscription description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Subscription description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.DefaultSettings#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.DefaultSettings#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(
          SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * Configures how the subscription schedule handles billing for phase transitions. Possible
       * values are {@code phase_start} (default) or {@code billing_period_start}. {@code
       * phase_start} bills based on the current state of the subscription, ignoring changes
       * scheduled in future phases. {@code billing_period_start} bills predictively for upcoming
       * phase transitions within the current billing cycle, including pricing changes and service
       * period adjustments that will occur before the next invoice.
       */
      public Builder setPhaseEffectiveAt(
          SubscriptionScheduleUpdateParams.DefaultSettings.PhaseEffectiveAt phaseEffectiveAt) {
        this.phaseEffectiveAt = phaseEffectiveAt;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(
          SubscriptionScheduleUpdateParams.DefaultSettings.TransferData transferData) {
        this.transferData = transferData;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(EmptyParam transferData) {
        this.transferData = transferData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AutomaticTax {
      /**
       * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
       * compute tax rates on all invoices generated by the subscription.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      @SerializedName("liability")
      Liability liability;

      private AutomaticTax(Boolean enabled, Map<String, Object> extraParams, Liability liability) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.liability = liability;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Liability liability;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax(
              this.enabled, this.extraParams, this.liability);
        }

        /**
         * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
         * compute tax rates on all invoices generated by the subscription.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax#extraParams} for the field
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax#extraParams} for the field
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
         * The account that's liable for tax. If set, the business address and tax registrations
         * required to perform the tax calculation are loaded from this account. The tax transaction
         * is returned in the report of the connected account.
         */
        public Builder setLiability(
            SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability liability) {
          this.liability = liability;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Liability {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Liability(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability build() {
            return new SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability#extraParams}
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
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingThresholds {
      /** Monetary threshold that triggers the subscription to advance to a new billing period. */
      @SerializedName("amount_gte")
      Long amountGte;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged.
       */
      @SerializedName("reset_billing_cycle_anchor")
      Boolean resetBillingCycleAnchor;

      private BillingThresholds(
          Long amountGte, Map<String, Object> extraParams, Boolean resetBillingCycleAnchor) {
        this.amountGte = amountGte;
        this.extraParams = extraParams;
        this.resetBillingCycleAnchor = resetBillingCycleAnchor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amountGte;

        private Map<String, Object> extraParams;

        private Boolean resetBillingCycleAnchor;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds(
              this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
        }

        /** Monetary threshold that triggers the subscription to advance to a new billing period. */
        public Builder setAmountGte(Long amountGte) {
          this.amountGte = amountGte;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds#extraParams} for the
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds#extraParams} for the
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
         * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is
         * reached. If true, {@code billing_cycle_anchor} will be updated to the date/time the
         * threshold was last reached; otherwise, the value will remain unchanged.
         */
        public Builder setResetBillingCycleAnchor(Boolean resetBillingCycleAnchor) {
          this.resetBillingCycleAnchor = resetBillingCycleAnchor;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings {
      /**
       * The account tax IDs associated with the subscription schedule. Will be set on invoices
       * generated by the subscription schedule.
       */
      @SerializedName("account_tax_ids")
      Object accountTaxIds;

      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * collection_method=charge_automatically}.
       */
      @SerializedName("days_until_due")
      Long daysUntilDue;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceSettings(
          Object accountTaxIds, Long daysUntilDue, Map<String, Object> extraParams, Issuer issuer) {
        this.accountTaxIds = accountTaxIds;
        this.daysUntilDue = daysUntilDue;
        this.extraParams = extraParams;
        this.issuer = issuer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountTaxIds;

        private Long daysUntilDue;

        private Map<String, Object> extraParams;

        private Issuer issuer;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings(
              this.accountTaxIds, this.daysUntilDue, this.extraParams, this.issuer);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#accountTaxIds} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAccountTaxId(String element) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).add(element);
          return this;
        }

        /**
         * Add all elements to `accountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#accountTaxIds} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAccountTaxId(List<String> elements) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).addAll(elements);
          return this;
        }

        /**
         * The account tax IDs associated with the subscription schedule. Will be set on invoices
         * generated by the subscription schedule.
         */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * The account tax IDs associated with the subscription schedule. Will be set on invoices
         * generated by the subscription schedule.
         */
        public Builder setAccountTaxIds(List<String> accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * Number of days within which a customer must pay invoices generated by this subscription
         * schedule. This value will be {@code null} for subscription schedules where {@code
         * collection_method=charge_automatically}.
         */
        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer build() {
            return new SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer#extraParams}
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
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      Object destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TransferData(
          BigDecimal amountPercent, Object destination, Map<String, Object> extraParams) {
        this.amountPercent = amountPercent;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BigDecimal amountPercent;

        private Object destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.DefaultSettings.TransferData build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.TransferData(
              this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
         */
        public Builder setAmountPercent(BigDecimal amountPercent) {
          this.amountPercent = amountPercent;
          return this;
        }

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(EmptyParam destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.TransferData#extraParams} for the field
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.TransferData#extraParams} for the field
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

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("phase_start")
      PHASE_START("phase_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
        this.value = value;
      }
    }

    public enum CollectionMethod implements ApiRequestParams.EnumParam {
      @SerializedName("charge_automatically")
      CHARGE_AUTOMATICALLY("charge_automatically"),

      @SerializedName("send_invoice")
      SEND_INVOICE("send_invoice");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CollectionMethod(String value) {
        this.value = value;
      }
    }

    public enum PhaseEffectiveAt implements ApiRequestParams.EnumParam {
      @SerializedName("billing_period_start")
      BILLING_PERIOD_START("billing_period_start"),

      @SerializedName("phase_start")
      PHASE_START("phase_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PhaseEffectiveAt(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Phase {
    /**
     * A list of prices and quantities that will generate invoice items appended to the next invoice
     * for this phase. You may pass up to 20 items.
     */
    @SerializedName("add_invoice_items")
    List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. The request must be made by a platform account on a connected account
     * in order to set an application fee percentage. For more information, see the application fees
     * <a
     * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /** Automatic tax settings for this phase. */
    @SerializedName("automatic_tax")
    AutomaticTax automaticTax;

    /**
     * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
     * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if this
     * phase specifies a trial. For more information, see the billing cycle <a
     * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
     */
    @SerializedName("billing_cycle_anchor")
    BillingCycleAnchor billingCycleAnchor;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    @SerializedName("billing_thresholds")
    Object billingThresholds;

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     * Defaults to {@code charge_automatically} on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    Object currency;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    Object defaultPaymentMethod;

    /**
     * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
     * will set the Subscription's <a
     * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
     * default_tax_rates}</a>, which means they will be the Invoice's <a
     * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
     * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
     */
    @SerializedName("default_tax_rates")
    Object defaultTaxRates;

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    Object description;

    /**
     * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
     * discount from the subscription's customer. Pass an empty string to avoid inheriting any
     * discounts.
     */
    @SerializedName("discounts")
    Object discounts;

    /** The number of intervals the phase should last. If set, {@code end_date} must not be set. */
    @SerializedName("duration")
    Duration duration;

    /**
     * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
     * must not be set.
     */
    @SerializedName("end_date")
    Object endDate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * <strong>Required.</strong> List of configuration items, each with an attached price, to apply
     * during this phase of the subscription schedule.
     */
    @SerializedName("items")
    List<SubscriptionScheduleUpdateParams.Phase.Item> items;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to a phase. Metadata on a schedule's phase will update the underlying subscription's {@code
     * metadata} when the phase is entered, adding new keys and replacing existing keys in the
     * subscription's {@code metadata}. Individual keys in the subscription's {@code metadata} can
     * be unset by posting an empty value to them in the phase's {@code metadata}. To unset all keys
     * in the subscription's {@code metadata}, update the subscription directly or unset every key
     * individually from the phase's {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The account on behalf of which to charge, for each of the associated subscription's invoices.
     */
    @SerializedName("on_behalf_of")
    Object onBehalfOf;

    /**
     * If specified, payment collection for this subscription will be paused. Note that the
     * subscription status will be unchanged and will not be updated to {@code paused}. Learn more
     * about <a href="https://stripe.com/docs/billing/subscriptions/pause-payment">pausing
     * collection</a>.
     */
    @SerializedName("pause_collection")
    PauseCollection pauseCollection;

    /**
     * Controls whether the subscription schedule should create <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
     * transitioning to this phase if there is a difference in billing configuration. It's different
     * from the request-level <a
     * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
     * parameter which controls what happens if the update request affects the billing configuration
     * (item price, quantity, etc.) of the current phase.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * The date at which this phase of the subscription schedule starts or {@code now}. Must be set
     * on the first phase.
     */
    @SerializedName("start_date")
    Object startDate;

    /**
     * The data with which to automatically create a Transfer for each of the associated
     * subscription's invoices.
     */
    @SerializedName("transfer_data")
    TransferData transferData;

    /**
     * If set to true the entire phase is counted as a trial and the customer will not be charged
     * for any fees.
     */
    @SerializedName("trial")
    Boolean trial;

    /** Specify trial behavior when crossing phase boundaries. */
    @SerializedName("trial_continuation")
    TrialContinuation trialContinuation;

    /**
     * Sets the phase to trialing from the start date to this date. Must be before the phase end
     * date, can not be combined with {@code trial}
     */
    @SerializedName("trial_end")
    Object trialEnd;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    TrialSettings trialSettings;

    private Phase(
        List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems,
        BigDecimal applicationFeePercent,
        AutomaticTax automaticTax,
        BillingCycleAnchor billingCycleAnchor,
        Object billingThresholds,
        CollectionMethod collectionMethod,
        Object currency,
        Object defaultPaymentMethod,
        Object defaultTaxRates,
        Object description,
        Object discounts,
        Duration duration,
        Object endDate,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        List<SubscriptionScheduleUpdateParams.Phase.Item> items,
        Map<String, String> metadata,
        Object onBehalfOf,
        PauseCollection pauseCollection,
        ProrationBehavior prorationBehavior,
        Object startDate,
        TransferData transferData,
        Boolean trial,
        TrialContinuation trialContinuation,
        Object trialEnd,
        TrialSettings trialSettings) {
      this.addInvoiceItems = addInvoiceItems;
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.currency = currency;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.defaultTaxRates = defaultTaxRates;
      this.description = description;
      this.discounts = discounts;
      this.duration = duration;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.items = items;
      this.metadata = metadata;
      this.onBehalfOf = onBehalfOf;
      this.pauseCollection = pauseCollection;
      this.prorationBehavior = prorationBehavior;
      this.startDate = startDate;
      this.transferData = transferData;
      this.trial = trial;
      this.trialContinuation = trialContinuation;
      this.trialEnd = trialEnd;
      this.trialSettings = trialSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems;

      private BigDecimal applicationFeePercent;

      private AutomaticTax automaticTax;

      private BillingCycleAnchor billingCycleAnchor;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private Object currency;

      private Object defaultPaymentMethod;

      private Object defaultTaxRates;

      private Object description;

      private Object discounts;

      private Duration duration;

      private Object endDate;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private List<SubscriptionScheduleUpdateParams.Phase.Item> items;

      private Map<String, String> metadata;

      private Object onBehalfOf;

      private PauseCollection pauseCollection;

      private ProrationBehavior prorationBehavior;

      private Object startDate;

      private TransferData transferData;

      private Boolean trial;

      private TrialContinuation trialContinuation;

      private Object trialEnd;

      private TrialSettings trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.Phase build() {
        return new SubscriptionScheduleUpdateParams.Phase(
            this.addInvoiceItems,
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
            this.currency,
            this.defaultPaymentMethod,
            this.defaultTaxRates,
            this.description,
            this.discounts,
            this.duration,
            this.endDate,
            this.extraParams,
            this.invoiceSettings,
            this.items,
            this.metadata,
            this.onBehalfOf,
            this.pauseCollection,
            this.prorationBehavior,
            this.startDate,
            this.transferData,
            this.trial,
            this.trialContinuation,
            this.trialEnd,
            this.trialSettings);
      }

      /**
       * Add an element to `addInvoiceItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAddInvoiceItem(
          SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem element) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.add(element);
        return this;
      }

      /**
       * Add all elements to `addInvoiceItems` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleUpdateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAllAddInvoiceItem(
          List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> elements) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.addAll(elements);
        return this;
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** Automatic tax settings for this phase. */
      public Builder setAutomaticTax(
          SubscriptionScheduleUpdateParams.Phase.AutomaticTax automaticTax) {
        this.automaticTax = automaticTax;
        return this;
      }

      /**
       * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
       * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
       * this phase specifies a trial. For more information, see the billing cycle <a
       * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
       */
      public Builder setBillingCycleAnchor(
          SubscriptionScheduleUpdateParams.Phase.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(
          SubscriptionScheduleUpdateParams.Phase.BillingThresholds billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      public Builder setCollectionMethod(
          SubscriptionScheduleUpdateParams.Phase.CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(EmptyParam currency) {
        this.currency = currency;
        return this;
      }

      /**
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#defaultTaxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDefaultTaxRate(String element) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `defaultTaxRates` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleUpdateParams.Phase#defaultTaxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDefaultTaxRate(List<String> elements) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).addAll(elements);
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a>, which means they will be the Invoice's <a
       * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
       * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
       */
      public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a>, which means they will be the Invoice's <a
       * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
       * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
       */
      public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * Subscription description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Subscription description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(SubscriptionScheduleUpdateParams.Phase.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Discount>();
        }
        ((List<SubscriptionScheduleUpdateParams.Phase.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(
          List<SubscriptionScheduleUpdateParams.Phase.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Discount>();
        }
        ((List<SubscriptionScheduleUpdateParams.Phase.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(List<SubscriptionScheduleUpdateParams.Phase.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * The number of intervals the phase should last. If set, {@code end_date} must not be set.
       */
      public Builder setDuration(SubscriptionScheduleUpdateParams.Phase.Duration duration) {
        this.duration = duration;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
       * must not be set.
       */
      public Builder setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
       * must not be set.
       */
      public Builder setEndDate(SubscriptionScheduleUpdateParams.Phase.EndDate endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(
          SubscriptionScheduleUpdateParams.Phase.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#items} for the field documentation.
       */
      public Builder addItem(SubscriptionScheduleUpdateParams.Phase.Item element) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#items} for the field documentation.
       */
      public Builder addAllItem(List<SubscriptionScheduleUpdateParams.Phase.Item> elements) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.Phase#metadata} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.Phase#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * If specified, payment collection for this subscription will be paused. Note that the
       * subscription status will be unchanged and will not be updated to {@code paused}. Learn more
       * about <a href="https://stripe.com/docs/billing/subscriptions/pause-payment">pausing
       * collection</a>.
       */
      public Builder setPauseCollection(
          SubscriptionScheduleUpdateParams.Phase.PauseCollection pauseCollection) {
        this.pauseCollection = pauseCollection;
        return this;
      }

      /**
       * Controls whether the subscription schedule should create <a
       * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
       * transitioning to this phase if there is a difference in billing configuration. It's
       * different from the request-level <a
       * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
       * parameter which controls what happens if the update request affects the billing
       * configuration (item price, quantity, etc.) of the current phase.
       */
      public Builder setProrationBehavior(
          SubscriptionScheduleUpdateParams.Phase.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule starts or {@code now}. Must be
       * set on the first phase.
       */
      public Builder setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule starts or {@code now}. Must be
       * set on the first phase.
       */
      public Builder setStartDate(SubscriptionScheduleUpdateParams.Phase.StartDate startDate) {
        this.startDate = startDate;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(
          SubscriptionScheduleUpdateParams.Phase.TransferData transferData) {
        this.transferData = transferData;
        return this;
      }

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      public Builder setTrial(Boolean trial) {
        this.trial = trial;
        return this;
      }

      /** Specify trial behavior when crossing phase boundaries. */
      public Builder setTrialContinuation(
          SubscriptionScheduleUpdateParams.Phase.TrialContinuation trialContinuation) {
        this.trialContinuation = trialContinuation;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with {@code trial}
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with {@code trial}
       */
      public Builder setTrialEnd(SubscriptionScheduleUpdateParams.Phase.TrialEnd trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(
          SubscriptionScheduleUpdateParams.Phase.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddInvoiceItem {
      /** The coupons to redeem into discounts for the item. */
      @SerializedName("discounts")
      List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * The period associated with this invoice item. If not set, {@code period.start.type}
       * defaults to {@code max_item_period_start} and {@code period.end.type} defaults to {@code
       * min_item_period_end}.
       */
      @SerializedName("period")
      Period period;

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      @SerializedName("price")
      Object price;

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      @SerializedName("price_data")
      PriceData priceData;

      /** Quantity for this item. Defaults to 1. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not apply
       * to this item.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private AddInvoiceItem(
          List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts,
          Map<String, Object> extraParams,
          Map<String, String> metadata,
          Period period,
          Object price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
        this.discounts = discounts;
        this.extraParams = extraParams;
        this.metadata = metadata;
        this.period = period;
        this.price = price;
        this.priceData = priceData;
        this.quantity = quantity;
        this.taxRates = taxRates;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts;

        private Map<String, Object> extraParams;

        private Map<String, String> metadata;

        private Period period;

        private Object price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem build() {
          return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem(
              this.discounts,
              this.extraParams,
              this.metadata,
              this.period,
              this.price,
              this.priceData,
              this.quantity,
              this.taxRates);
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#discounts} for the field
         * documentation.
         */
        public Builder addDiscount(
            SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount element) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#discounts} for the field
         * documentation.
         */
        public Builder addAllDiscount(
            List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> elements) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#extraParams} for
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
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#metadata} for the field
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#metadata} for the
         * field documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * The period associated with this invoice item. If not set, {@code period.start.type}
         * defaults to {@code max_item_period_start} and {@code period.end.type} defaults to {@code
         * min_item_period_end}.
         */
        public Builder setPeriod(
            SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period period) {
          this.period = period;
          return this;
        }

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline. One of {@code price} or {@code price_data} is required.
         */
        public Builder setPriceData(
            SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /** Quantity for this item. Defaults to 1. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#taxRates} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addTaxRate(String element) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).add(element);
          return this;
        }

        /**
         * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#taxRates} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllTaxRate(List<String> elements) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).addAll(elements);
          return this;
        }

        /**
         * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not
         * apply to this item.
         */
        public Builder setTaxRates(EmptyParam taxRates) {
          this.taxRates = taxRates;
          return this;
        }

        /**
         * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not
         * apply to this item.
         */
        public Builder setTaxRates(List<String> taxRates) {
          this.taxRates = taxRates;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        Object coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        Object discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** ID of the promotion code to create a new discount for. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private Discount(
            Object coupon,
            Object discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount build() {
            return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DiscountEnd {
          /** Time span for the redeemed discount. */
          @SerializedName("duration")
          Duration duration;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(
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
            public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd
                build() {
              return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd(
                  this.duration, this.extraParams, this.timestamp, this.type);
            }

            /** Time span for the redeemed discount. */
            public Builder setDuration(
                SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd.Duration
                    duration) {
              this.duration = duration;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Duration {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Duration(
                Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
              public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd
                      .Duration
                  build() {
                return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount
                    .DiscountEnd.Duration(this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd.Duration#extraParams}
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
               * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd.Duration#extraParams}
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
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount.DiscountEnd
                          .Duration.Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
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

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Period {
        /** <strong>Required.</strong> End of the invoice item period. */
        @SerializedName("end")
        End end;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Start of the invoice item period. */
        @SerializedName("start")
        Start start;

        private Period(End end, Map<String, Object> extraParams, Start start) {
          this.end = end;
          this.extraParams = extraParams;
          this.start = start;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private End end;

          private Map<String, Object> extraParams;

          private Start start;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period build() {
            return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period(
                this.end, this.extraParams, this.start);
          }

          /** <strong>Required.</strong> End of the invoice item period. */
          public Builder setEnd(
              SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End end) {
            this.end = end;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period#extraParams} for the field
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
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Start of the invoice item period. */
          public Builder setStart(
              SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start start) {
            this.start = start;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class End {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * A precise Unix timestamp for the end of the invoice item period. Must be greater than
           * or equal to {@code period.start}.
           */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> Select how to calculate the end of the invoice item period.
           */
          @SerializedName("type")
          Type type;

          private End(Map<String, Object> extraParams, Long timestamp, Type type) {
            this.extraParams = extraParams;
            this.timestamp = timestamp;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long timestamp;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End build() {
              return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End#extraParams} for the
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
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End#extraParams} for the
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
             * A precise Unix timestamp for the end of the invoice item period. Must be greater than
             * or equal to {@code period.start}.
             */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> Select how to calculate the end of the invoice item
             * period.
             */
            public Builder setType(
                SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.End.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("min_item_period_end")
            MIN_ITEM_PERIOD_END("min_item_period_end"),

            @SerializedName("phase_end")
            PHASE_END("phase_end"),

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
        @EqualsAndHashCode(callSuper = false)
        public static class Start {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * A precise Unix timestamp for the start of the invoice item period. Must be less than or
           * equal to {@code period.end}.
           */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> Select how to calculate the start of the invoice item
           * period.
           */
          @SerializedName("type")
          Type type;

          private Start(Map<String, Object> extraParams, Long timestamp, Type type) {
            this.extraParams = extraParams;
            this.timestamp = timestamp;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long timestamp;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start build() {
              return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start#extraParams} for
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
             * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start#extraParams} for
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
             * A precise Unix timestamp for the start of the invoice item period. Must be less than
             * or equal to {@code period.end}.
             */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> Select how to calculate the start of the invoice item
             * period.
             */
            public Builder setType(
                SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Period.Start.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("max_item_period_start")
            MAX_ITEM_PERIOD_START("max_item_period_start"),

            @SerializedName("phase_start")
            PHASE_START("phase_start"),

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        Object currency;

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
         * <strong>Required.</strong> The ID of the <a
         * href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
         */
        @SerializedName("product")
        Object product;

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge or a negative integer representing the amount to credit to the
         * customer.
         */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        @SerializedName("unit_amount_decimal")
        Object unitAmountDecimal;

        private PriceData(
            Object currency,
            Map<String, Object> extraParams,
            Object product,
            TaxBehavior taxBehavior,
            Long unitAmount,
            Object unitAmountDecimal) {
          this.currency = currency;
          this.extraParams = extraParams;
          this.product = product;
          this.taxBehavior = taxBehavior;
          this.unitAmount = unitAmount;
          this.unitAmountDecimal = unitAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object currency;

          private Map<String, Object> extraParams;

          private Object product;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private Object unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData build() {
            return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
            return this;
          }

          /**
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(
              SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData.TaxBehavior
                  taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge or a negative integer representing the amount to credit to the
           * customer.
           */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        public enum TaxBehavior implements ApiRequestParams.EnumParam {
          @SerializedName("exclusive")
          EXCLUSIVE("exclusive"),

          @SerializedName("inclusive")
          INCLUSIVE("inclusive"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxBehavior(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AutomaticTax {
      /**
       * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
       * compute tax rates on all invoices generated by the subscription.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      @SerializedName("liability")
      Liability liability;

      private AutomaticTax(Boolean enabled, Map<String, Object> extraParams, Liability liability) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.liability = liability;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Liability liability;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.AutomaticTax build() {
          return new SubscriptionScheduleUpdateParams.Phase.AutomaticTax(
              this.enabled, this.extraParams, this.liability);
        }

        /**
         * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
         * compute tax rates on all invoices generated by the subscription.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AutomaticTax#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AutomaticTax#extraParams} for the
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
         * The account that's liable for tax. If set, the business address and tax registrations
         * required to perform the tax calculation are loaded from this account. The tax transaction
         * is returned in the report of the connected account.
         */
        public Builder setLiability(
            SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability liability) {
          this.liability = liability;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Liability {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Liability(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability build() {
            return new SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingThresholds {
      /** Monetary threshold that triggers the subscription to advance to a new billing period. */
      @SerializedName("amount_gte")
      Long amountGte;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged.
       */
      @SerializedName("reset_billing_cycle_anchor")
      Boolean resetBillingCycleAnchor;

      private BillingThresholds(
          Long amountGte, Map<String, Object> extraParams, Boolean resetBillingCycleAnchor) {
        this.amountGte = amountGte;
        this.extraParams = extraParams;
        this.resetBillingCycleAnchor = resetBillingCycleAnchor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amountGte;

        private Map<String, Object> extraParams;

        private Boolean resetBillingCycleAnchor;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.BillingThresholds build() {
          return new SubscriptionScheduleUpdateParams.Phase.BillingThresholds(
              this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
        }

        /** Monetary threshold that triggers the subscription to advance to a new billing period. */
        public Builder setAmountGte(Long amountGte) {
          this.amountGte = amountGte;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.BillingThresholds#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.BillingThresholds#extraParams} for
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
         * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is
         * reached. If true, {@code billing_cycle_anchor} will be updated to the date/time the
         * threshold was last reached; otherwise, the value will remain unchanged.
         */
        public Builder setResetBillingCycleAnchor(Boolean resetBillingCycleAnchor) {
          this.resetBillingCycleAnchor = resetBillingCycleAnchor;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      Object coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      Object discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the promotion code to create a new discount for. */
      @SerializedName("promotion_code")
      Object promotionCode;

      private Discount(
          Object coupon,
          Object discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          Object promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private Object promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.Discount build() {
          return new SubscriptionScheduleUpdateParams.Phase.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(EmptyParam coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(EmptyParam discount) {
          this.discount = discount;
          return this;
        }

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(
            SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Discount#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Discount#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(String promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(EmptyParam promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd {
        /** Time span for the redeemed discount. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        @SerializedName("type")
        Type type;

        private DiscountEnd(
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
          public SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd build() {
            return new SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd#extraParams} for the field
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
           * SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          public Builder setType(
              SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Duration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
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
            public SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration build() {
              return new SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration#extraParams} for
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
             * SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration#extraParams} for
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                SubscriptionScheduleUpdateParams.Phase.Discount.DiscountEnd.Duration.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
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

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Duration {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Specifies phase duration. Either {@code day}, {@code week},
       * {@code month} or {@code year}.
       */
      @SerializedName("interval")
      Interval interval;

      /** The multiplier applied to the interval. */
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
        public SubscriptionScheduleUpdateParams.Phase.Duration build() {
          return new SubscriptionScheduleUpdateParams.Phase.Duration(
              this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Duration#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Duration#extraParams} for the
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
         * <strong>Required.</strong> Specifies phase duration. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        public Builder setInterval(
            SubscriptionScheduleUpdateParams.Phase.Duration.Interval interval) {
          this.interval = interval;
          return this;
        }

        /** The multiplier applied to the interval. */
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
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings {
      /**
       * The account tax IDs associated with this phase of the subscription schedule. Will be set on
       * invoices generated by this phase of the subscription schedule.
       */
      @SerializedName("account_tax_ids")
      Object accountTaxIds;

      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * billing=charge_automatically}.
       */
      @SerializedName("days_until_due")
      Long daysUntilDue;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceSettings(
          Object accountTaxIds, Long daysUntilDue, Map<String, Object> extraParams, Issuer issuer) {
        this.accountTaxIds = accountTaxIds;
        this.daysUntilDue = daysUntilDue;
        this.extraParams = extraParams;
        this.issuer = issuer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountTaxIds;

        private Long daysUntilDue;

        private Map<String, Object> extraParams;

        private Issuer issuer;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.InvoiceSettings build() {
          return new SubscriptionScheduleUpdateParams.Phase.InvoiceSettings(
              this.accountTaxIds, this.daysUntilDue, this.extraParams, this.issuer);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#accountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAccountTaxId(String element) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).add(element);
          return this;
        }

        /**
         * Add all elements to `accountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#accountTaxIds} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAccountTaxId(List<String> elements) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).addAll(elements);
          return this;
        }

        /**
         * The account tax IDs associated with this phase of the subscription schedule. Will be set
         * on invoices generated by this phase of the subscription schedule.
         */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * The account tax IDs associated with this phase of the subscription schedule. Will be set
         * on invoices generated by this phase of the subscription schedule.
         */
        public Builder setAccountTaxIds(List<String> accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * Number of days within which a customer must pay invoices generated by this subscription
         * schedule. This value will be {@code null} for subscription schedules where {@code
         * billing=charge_automatically}.
         */
        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#extraParams} for
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
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer build() {
            return new SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Item {
      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

      /** The coupons to redeem into discounts for the subscription item. */
      @SerializedName("discounts")
      Object discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to a configuration item. Metadata on a configuration item will update the underlying
       * subscription item's {@code metadata} when the phase is entered, adding new keys and
       * replacing existing keys. Individual keys in the subscription item's {@code metadata} can be
       * unset by posting an empty value to them in the configuration item's {@code metadata}. To
       * unset all keys in the subscription item's {@code metadata}, update the subscription item
       * directly or unset every key individually from the configuration item's {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code price}.
       */
      @SerializedName("plan")
      Object plan;

      /** The ID of the price object. */
      @SerializedName("price")
      Object price;

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline.
       */
      @SerializedName("price_data")
      PriceData priceData;

      /**
       * Quantity for the given price. Can be set only if the price's {@code usage_type} is {@code
       * licensed} and not {@code metered}.
       */
      @SerializedName("quantity")
      Long quantity;

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will override the <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
       * previously-defined tax rates.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      /** Options that configure the trial on the subscription item. */
      @SerializedName("trial")
      Trial trial;

      private Item(
          Object billingThresholds,
          Object discounts,
          Map<String, Object> extraParams,
          Map<String, String> metadata,
          Object plan,
          Object price,
          PriceData priceData,
          Long quantity,
          Object taxRates,
          Trial trial) {
        this.billingThresholds = billingThresholds;
        this.discounts = discounts;
        this.extraParams = extraParams;
        this.metadata = metadata;
        this.plan = plan;
        this.price = price;
        this.priceData = priceData;
        this.quantity = quantity;
        this.taxRates = taxRates;
        this.trial = trial;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object billingThresholds;

        private Object discounts;

        private Map<String, Object> extraParams;

        private Map<String, String> metadata;

        private Object plan;

        private Object price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        private Trial trial;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.Item build() {
          return new SubscriptionScheduleUpdateParams.Phase.Item(
              this.billingThresholds,
              this.discounts,
              this.extraParams,
              this.metadata,
              this.plan,
              this.price,
              this.priceData,
              this.quantity,
              this.taxRates,
              this.trial);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. Pass an empty string to remove previously-defined thresholds.
         */
        public Builder setBillingThresholds(
            SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. Pass an empty string to remove previously-defined thresholds.
         */
        public Builder setBillingThresholds(EmptyParam billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDiscount(SubscriptionScheduleUpdateParams.Phase.Item.Discount element) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Item.Discount>();
          }
          ((List<SubscriptionScheduleUpdateParams.Phase.Item.Discount>) this.discounts)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDiscount(
            List<SubscriptionScheduleUpdateParams.Phase.Item.Discount> elements) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Item.Discount>();
          }
          ((List<SubscriptionScheduleUpdateParams.Phase.Item.Discount>) this.discounts)
              .addAll(elements);
          return this;
        }

        /** The coupons to redeem into discounts for the subscription item. */
        public Builder setDiscounts(EmptyParam discounts) {
          this.discounts = discounts;
          return this;
        }

        /** The coupons to redeem into discounts for the subscription item. */
        public Builder setDiscounts(
            List<SubscriptionScheduleUpdateParams.Phase.Item.Discount> discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#extraParams} for the field
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#extraParams} for the field
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
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#metadata} for the field documentation.
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code
         * price}.
         */
        public Builder setPlan(String plan) {
          this.plan = plan;
          return this;
        }

        /**
         * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code
         * price}.
         */
        public Builder setPlan(EmptyParam plan) {
          this.plan = plan;
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline.
         */
        public Builder setPriceData(
            SubscriptionScheduleUpdateParams.Phase.Item.PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /**
         * Quantity for the given price. Can be set only if the price's {@code usage_type} is {@code
         * licensed} and not {@code metered}.
         */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#taxRates} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addTaxRate(String element) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).add(element);
          return this;
        }

        /**
         * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#taxRates} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllTaxRate(List<String> elements) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).addAll(elements);
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will override the <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
         * previously-defined tax rates.
         */
        public Builder setTaxRates(EmptyParam taxRates) {
          this.taxRates = taxRates;
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will override the <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
         * previously-defined tax rates.
         */
        public Builder setTaxRates(List<String> taxRates) {
          this.taxRates = taxRates;
          return this;
        }

        /** Options that configure the trial on the subscription item. */
        public Builder setTrial(SubscriptionScheduleUpdateParams.Phase.Item.Trial trial) {
          this.trial = trial;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BillingThresholds {
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
         * <strong>Required.</strong> Number of units that meets the billing threshold to advance
         * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
         * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
         * threshold</a>)
         */
        @SerializedName("usage_gte")
        Long usageGte;

        private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {
          this.extraParams = extraParams;
          this.usageGte = usageGte;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long usageGte;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds(
                this.extraParams, this.usageGte);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds#extraParams} for the
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
           * <strong>Required.</strong> Number of units that meets the billing threshold to advance
           * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
           * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
           * threshold</a>)
           */
          public Builder setUsageGte(Long usageGte) {
            this.usageGte = usageGte;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        Object coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        Object discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** ID of the promotion code to create a new discount for. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private Discount(
            Object coupon,
            Object discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.Discount build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.Discount(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Discount#extraParams} for
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
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Discount#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DiscountEnd {
          /** Time span for the redeemed discount. */
          @SerializedName("duration")
          Duration duration;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(
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
            public SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd build() {
              return new SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd(
                  this.duration, this.extraParams, this.timestamp, this.type);
            }

            /** Time span for the redeemed discount. */
            public Builder setDuration(
                SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Duration
                    duration) {
              this.duration = duration;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd#extraParams} for the
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
             * SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Duration {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Duration(
                Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
              public SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Duration
                  build() {
                return new SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd
                    .Duration(this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Duration#extraParams}
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
               * SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Duration#extraParams}
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
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  SubscriptionScheduleUpdateParams.Phase.Item.Discount.DiscountEnd.Duration.Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
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

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        Object currency;

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
         * <strong>Required.</strong> The ID of the <a
         * href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
         */
        @SerializedName("product")
        Object product;

        /**
         * <strong>Required.</strong> The recurring components of a price such as {@code interval}
         * and {@code interval_count}.
         */
        @SerializedName("recurring")
        Recurring recurring;

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        @SerializedName("unit_amount_decimal")
        Object unitAmountDecimal;

        private PriceData(
            Object currency,
            Map<String, Object> extraParams,
            Object product,
            Recurring recurring,
            TaxBehavior taxBehavior,
            Long unitAmount,
            Object unitAmountDecimal) {
          this.currency = currency;
          this.extraParams = extraParams;
          this.product = product;
          this.recurring = recurring;
          this.taxBehavior = taxBehavior;
          this.unitAmount = unitAmount;
          this.unitAmountDecimal = unitAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object currency;

          private Map<String, Object> extraParams;

          private Object product;

          private Recurring recurring;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private Object unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.PriceData build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.recurring,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.PriceData#extraParams} for
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
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.PriceData#extraParams} for
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
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The recurring components of a price such as {@code interval}
           * and {@code interval_count}.
           */
          public Builder setRecurring(
              SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring recurring) {
            this.recurring = recurring;
            return this;
          }

          /**
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(
              SubscriptionScheduleUpdateParams.Phase.Item.PriceData.TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge.
           */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Recurring {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Recurring(
              Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
            public SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring build() {
              return new SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
             * week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring.Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
             * years interval allowed (3 years, 36 months, or 156 weeks).
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

        public enum TaxBehavior implements ApiRequestParams.EnumParam {
          @SerializedName("exclusive")
          EXCLUSIVE("exclusive"),

          @SerializedName("inclusive")
          INCLUSIVE("inclusive"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxBehavior(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Trial {
        /**
         * List of price IDs which, if present on the subscription following a paid trial,
         * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
         */
        @SerializedName("converts_to")
        List<String> convertsTo;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Determines the type of trial for this item. */
        @SerializedName("type")
        Type type;

        private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
          this.convertsTo = convertsTo;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<String> convertsTo;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.Trial build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.Trial(
                this.convertsTo, this.extraParams, this.type);
          }

          /**
           * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Item.Trial#convertsTo} for the field
           * documentation.
           */
          public Builder addConvertsTo(String element) {
            if (this.convertsTo == null) {
              this.convertsTo = new ArrayList<>();
            }
            this.convertsTo.add(element);
            return this;
          }

          /**
           * Add all elements to `convertsTo` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Item.Trial#convertsTo} for the field
           * documentation.
           */
          public Builder addAllConvertsTo(List<String> elements) {
            if (this.convertsTo == null) {
              this.convertsTo = new ArrayList<>();
            }
            this.convertsTo.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Trial#extraParams} for the
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
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Trial#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Determines the type of trial for this item. */
          public Builder setType(SubscriptionScheduleUpdateParams.Phase.Item.Trial.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class PauseCollection {
      /**
       * <strong>Required.</strong> The payment collection behavior for this subscription while
       * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
       */
      @SerializedName("behavior")
      Behavior behavior;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PauseCollection(Behavior behavior, Map<String, Object> extraParams) {
        this.behavior = behavior;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Behavior behavior;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.PauseCollection build() {
          return new SubscriptionScheduleUpdateParams.Phase.PauseCollection(
              this.behavior, this.extraParams);
        }

        /**
         * <strong>Required.</strong> The payment collection behavior for this subscription while
         * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
         */
        public Builder setBehavior(
            SubscriptionScheduleUpdateParams.Phase.PauseCollection.Behavior behavior) {
          this.behavior = behavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.PauseCollection#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.PauseCollection#extraParams} for
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

      public enum Behavior implements ApiRequestParams.EnumParam {
        @SerializedName("keep_as_draft")
        KEEP_AS_DRAFT("keep_as_draft"),

        @SerializedName("mark_uncollectible")
        MARK_UNCOLLECTIBLE("mark_uncollectible"),

        @SerializedName("void")
        VOID("void");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Behavior(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      Object destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TransferData(
          BigDecimal amountPercent, Object destination, Map<String, Object> extraParams) {
        this.amountPercent = amountPercent;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BigDecimal amountPercent;

        private Object destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.TransferData build() {
          return new SubscriptionScheduleUpdateParams.Phase.TransferData(
              this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
         */
        public Builder setAmountPercent(BigDecimal amountPercent) {
          this.amountPercent = amountPercent;
          return this;
        }

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(EmptyParam destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TransferData#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TransferData#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class TrialSettings {
      /** Defines how the subscription should behave when a trial ends. */
      @SerializedName("end_behavior")
      EndBehavior endBehavior;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
        this.endBehavior = endBehavior;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndBehavior endBehavior;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.TrialSettings build() {
          return new SubscriptionScheduleUpdateParams.Phase.TrialSettings(
              this.endBehavior, this.extraParams);
        }

        /** Defines how the subscription should behave when a trial ends. */
        public Builder setEndBehavior(
            SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TrialSettings#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TrialSettings#extraParams} for the
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndBehavior {
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
         * Configure how an opt-in following a paid trial is billed when using {@code
         * billing_behavior: prorate_up_front}.
         */
        @SerializedName("prorate_up_front")
        ProrateUpFront prorateUpFront;

        private EndBehavior(Map<String, Object> extraParams, ProrateUpFront prorateUpFront) {
          this.extraParams = extraParams;
          this.prorateUpFront = prorateUpFront;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private ProrateUpFront prorateUpFront;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior build() {
            return new SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior(
                this.extraParams, this.prorateUpFront);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior#extraParams} for the
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
           * Configure how an opt-in following a paid trial is billed when using {@code
           * billing_behavior: prorate_up_front}.
           */
          public Builder setProrateUpFront(
              SubscriptionScheduleUpdateParams.Phase.TrialSettings.EndBehavior.ProrateUpFront
                  prorateUpFront) {
            this.prorateUpFront = prorateUpFront;
            return this;
          }
        }

        public enum ProrateUpFront implements ApiRequestParams.EnumParam {
          @SerializedName("defer")
          DEFER("defer"),

          @SerializedName("include")
          INCLUDE("include");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ProrateUpFront(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("phase_start")
      PHASE_START("phase_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
        this.value = value;
      }
    }

    public enum CollectionMethod implements ApiRequestParams.EnumParam {
      @SerializedName("charge_automatically")
      CHARGE_AUTOMATICALLY("charge_automatically"),

      @SerializedName("send_invoice")
      SEND_INVOICE("send_invoice");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CollectionMethod(String value) {
        this.value = value;
      }
    }

    public enum EndDate implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EndDate(String value) {
        this.value = value;
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

    public enum StartDate implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      StartDate(String value) {
        this.value = value;
      }
    }

    public enum TrialContinuation implements ApiRequestParams.EnumParam {
      @SerializedName("continue")
      CONTINUE("continue"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TrialContinuation(String value) {
        this.value = value;
      }
    }

    public enum TrialEnd implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TrialEnd(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Prebilling {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> This is used to determine the number of billing cycles to prebill.
     */
    @SerializedName("iterations")
    Long iterations;

    /**
     * Whether to cancel or preserve {@code prebilling} if the subscription is updated during the
     * prebilled period. The default value is {@code reset}.
     */
    @SerializedName("update_behavior")
    UpdateBehavior updateBehavior;

    private Prebilling(
        Map<String, Object> extraParams, Long iterations, UpdateBehavior updateBehavior) {
      this.extraParams = extraParams;
      this.iterations = iterations;
      this.updateBehavior = updateBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long iterations;

      private UpdateBehavior updateBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.Prebilling build() {
        return new SubscriptionScheduleUpdateParams.Prebilling(
            this.extraParams, this.iterations, this.updateBehavior);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.Prebilling#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.Prebilling#extraParams} for the field
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
       * <strong>Required.</strong> This is used to determine the number of billing cycles to
       * prebill.
       */
      public Builder setIterations(Long iterations) {
        this.iterations = iterations;
        return this;
      }

      /**
       * Whether to cancel or preserve {@code prebilling} if the subscription is updated during the
       * prebilled period. The default value is {@code reset}.
       */
      public Builder setUpdateBehavior(
          SubscriptionScheduleUpdateParams.Prebilling.UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior;
        return this;
      }
    }

    public enum UpdateBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("prebill")
      PREBILL("prebill"),

      @SerializedName("reset")
      RESET("reset");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UpdateBehavior(String value) {
        this.value = value;
      }
    }
  }

  public enum BillingBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("prorate_on_next_phase")
    PRORATE_ON_NEXT_PHASE("prorate_on_next_phase"),

    @SerializedName("prorate_up_front")
    PRORATE_UP_FRONT("prorate_up_front");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingBehavior(String value) {
      this.value = value;
    }
  }

  public enum EndBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("cancel")
    CANCEL("cancel"),

    @SerializedName("none")
    NONE("none"),

    @SerializedName("release")
    RELEASE("release"),

    @SerializedName("renew")
    RENEW("renew");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EndBehavior(String value) {
      this.value = value;
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
