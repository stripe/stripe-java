// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
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

  /** Provide any time periods to bill in advance. */
  @SerializedName("prebilling")
  Object prebilling;

  /**
   * In cases where the amendment changes the currently active phase, specifies if and how to
   * prorate at the time of the request.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  /** Changes to apply to the subscription schedule. */
  @SerializedName("schedule_settings")
  ScheduleSettings scheduleSettings;

  private SubscriptionScheduleAmendParams(
      List<SubscriptionScheduleAmendParams.Amendment> amendments,
      List<String> expand,
      Map<String, Object> extraParams,
      Object prebilling,
      ProrationBehavior prorationBehavior,
      ScheduleSettings scheduleSettings) {
    this.amendments = amendments;
    this.expand = expand;
    this.extraParams = extraParams;
    this.prebilling = prebilling;
    this.prorationBehavior = prorationBehavior;
    this.scheduleSettings = scheduleSettings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<SubscriptionScheduleAmendParams.Amendment> amendments;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object prebilling;

    private ProrationBehavior prorationBehavior;

    private ScheduleSettings scheduleSettings;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleAmendParams build() {
      return new SubscriptionScheduleAmendParams(
          this.amendments,
          this.expand,
          this.extraParams,
          this.prebilling,
          this.prorationBehavior,
          this.scheduleSettings);
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

    /**
     * Add an element to `prebilling` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleAmendParams#prebilling} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addPrebilling(SubscriptionScheduleAmendParams.Prebilling element) {
      if (this.prebilling == null || this.prebilling instanceof EmptyParam) {
        this.prebilling = new ArrayList<SubscriptionScheduleAmendParams.Prebilling>();
      }
      ((List<SubscriptionScheduleAmendParams.Prebilling>) this.prebilling).add(element);
      return this;
    }

    /**
     * Add all elements to `prebilling` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleAmendParams#prebilling} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllPrebilling(List<SubscriptionScheduleAmendParams.Prebilling> elements) {
      if (this.prebilling == null || this.prebilling instanceof EmptyParam) {
        this.prebilling = new ArrayList<SubscriptionScheduleAmendParams.Prebilling>();
      }
      ((List<SubscriptionScheduleAmendParams.Prebilling>) this.prebilling).addAll(elements);
      return this;
    }

    /** Provide any time periods to bill in advance. */
    public Builder setPrebilling(EmptyParam prebilling) {
      this.prebilling = prebilling;
      return this;
    }

    /** Provide any time periods to bill in advance. */
    public Builder setPrebilling(List<SubscriptionScheduleAmendParams.Prebilling> prebilling) {
      this.prebilling = prebilling;
      return this;
    }

    /**
     * In cases where the amendment changes the currently active phase, specifies if and how to
     * prorate at the time of the request.
     */
    public Builder setProrationBehavior(
        SubscriptionScheduleAmendParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }

    /** Changes to apply to the subscription schedule. */
    public Builder setScheduleSettings(
        SubscriptionScheduleAmendParams.ScheduleSettings scheduleSettings) {
      this.scheduleSettings = scheduleSettings;
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

    /**
     * <strong>Required.</strong> Details to identify the earliest timestamp where the proposed
     * change should take effect.
     */
    @SerializedName("amendment_start")
    AmendmentStart amendmentStart;

    /**
     * For a point-in-time amendment, this attribute lets you set or update whether the
     * subscription's billing cycle anchor is reset at the {@code amendment_start} timestamp.
     */
    @SerializedName("billing_cycle_anchor")
    BillingCycleAnchor billingCycleAnchor;

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

    /** Instructions for how to modify phase metadata. */
    @SerializedName("metadata_actions")
    List<SubscriptionScheduleAmendParams.Amendment.MetadataAction> metadataActions;

    /**
     * Changes to how Stripe handles prorations during the amendment time span. Affects if and how
     * prorations are created when a future phase starts. In cases where the amendment changes the
     * currently active phase, it is used to determine whether or how to prorate now, at the time of
     * the request. Also supported as a point-in-time operation when {@code amendment_end} is {@code
     * null}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * Defines how to pause collection for the underlying subscription throughout the duration of
     * the amendment.
     */
    @SerializedName("set_pause_collection")
    SetPauseCollection setPauseCollection;

    /**
     * Ends the subscription schedule early as dictated by either the accompanying amendment's start
     * or end.
     */
    @SerializedName("set_schedule_end")
    SetScheduleEnd setScheduleEnd;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    TrialSettings trialSettings;

    private Amendment(
        AmendmentEnd amendmentEnd,
        AmendmentStart amendmentStart,
        BillingCycleAnchor billingCycleAnchor,
        List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> discountActions,
        Map<String, Object> extraParams,
        List<SubscriptionScheduleAmendParams.Amendment.ItemAction> itemActions,
        List<SubscriptionScheduleAmendParams.Amendment.MetadataAction> metadataActions,
        ProrationBehavior prorationBehavior,
        SetPauseCollection setPauseCollection,
        SetScheduleEnd setScheduleEnd,
        TrialSettings trialSettings) {
      this.amendmentEnd = amendmentEnd;
      this.amendmentStart = amendmentStart;
      this.billingCycleAnchor = billingCycleAnchor;
      this.discountActions = discountActions;
      this.extraParams = extraParams;
      this.itemActions = itemActions;
      this.metadataActions = metadataActions;
      this.prorationBehavior = prorationBehavior;
      this.setPauseCollection = setPauseCollection;
      this.setScheduleEnd = setScheduleEnd;
      this.trialSettings = trialSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AmendmentEnd amendmentEnd;

      private AmendmentStart amendmentStart;

      private BillingCycleAnchor billingCycleAnchor;

      private List<SubscriptionScheduleAmendParams.Amendment.DiscountAction> discountActions;

      private Map<String, Object> extraParams;

      private List<SubscriptionScheduleAmendParams.Amendment.ItemAction> itemActions;

      private List<SubscriptionScheduleAmendParams.Amendment.MetadataAction> metadataActions;

      private ProrationBehavior prorationBehavior;

      private SetPauseCollection setPauseCollection;

      private SetScheduleEnd setScheduleEnd;

      private TrialSettings trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleAmendParams.Amendment build() {
        return new SubscriptionScheduleAmendParams.Amendment(
            this.amendmentEnd,
            this.amendmentStart,
            this.billingCycleAnchor,
            this.discountActions,
            this.extraParams,
            this.itemActions,
            this.metadataActions,
            this.prorationBehavior,
            this.setPauseCollection,
            this.setScheduleEnd,
            this.trialSettings);
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
       * <strong>Required.</strong> Details to identify the earliest timestamp where the proposed
       * change should take effect.
       */
      public Builder setAmendmentStart(
          SubscriptionScheduleAmendParams.Amendment.AmendmentStart amendmentStart) {
        this.amendmentStart = amendmentStart;
        return this;
      }

      /**
       * For a point-in-time amendment, this attribute lets you set or update whether the
       * subscription's billing cycle anchor is reset at the {@code amendment_start} timestamp.
       */
      public Builder setBillingCycleAnchor(
          SubscriptionScheduleAmendParams.Amendment.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
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
       * Add an element to `metadataActions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleAmendParams.Amendment#metadataActions} for the field documentation.
       */
      public Builder addMetadataAction(
          SubscriptionScheduleAmendParams.Amendment.MetadataAction element) {
        if (this.metadataActions == null) {
          this.metadataActions = new ArrayList<>();
        }
        this.metadataActions.add(element);
        return this;
      }

      /**
       * Add all elements to `metadataActions` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleAmendParams.Amendment#metadataActions} for the field
       * documentation.
       */
      public Builder addAllMetadataAction(
          List<SubscriptionScheduleAmendParams.Amendment.MetadataAction> elements) {
        if (this.metadataActions == null) {
          this.metadataActions = new ArrayList<>();
        }
        this.metadataActions.addAll(elements);
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

      /**
       * Defines how to pause collection for the underlying subscription throughout the duration of
       * the amendment.
       */
      public Builder setSetPauseCollection(
          SubscriptionScheduleAmendParams.Amendment.SetPauseCollection setPauseCollection) {
        this.setPauseCollection = setPauseCollection;
        return this;
      }

      /**
       * Ends the subscription schedule early as dictated by either the accompanying amendment's
       * start or end.
       */
      public Builder setSetScheduleEnd(
          SubscriptionScheduleAmendParams.Amendment.SetScheduleEnd setScheduleEnd) {
        this.setScheduleEnd = setScheduleEnd;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(
          SubscriptionScheduleAmendParams.Amendment.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    public static class AmendmentEnd {
      /** Use the {@code end} time of a given discount. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

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

      /** <strong>Required.</strong> Select one of three ways to pass the {@code amendment_end}. */
      @SerializedName("type")
      Type type;

      private AmendmentEnd(
          DiscountEnd discountEnd,
          Duration duration,
          Map<String, Object> extraParams,
          Long timestamp,
          Type type) {
        this.discountEnd = discountEnd;
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DiscountEnd discountEnd;

        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.AmendmentEnd build() {
          return new SubscriptionScheduleAmendParams.Amendment.AmendmentEnd(
              this.discountEnd, this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(
            SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
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

        /**
         * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_end}.
         */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
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

        private DiscountEnd(String discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.DiscountEnd build() {
            return new SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.DiscountEnd(
                this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.DiscountEnd#extraParams} for the
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
           * SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.DiscountEnd#extraParams} for the
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
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              SubscriptionScheduleAmendParams.Amendment.AmendmentEnd.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
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
        @SerializedName("discount_end")
        DISCOUNT_END("discount_end"),

        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp"),

        @SerializedName("trial_end")
        TRIAL_END("trial_end"),

        @SerializedName("trial_start")
        TRIAL_START("trial_start"),

        @SerializedName("upcoming_invoice")
        UPCOMING_INVOICE("upcoming_invoice");

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

      /** Use the {@code end} time of a given discount. */
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

      /** A precise Unix timestamp for the amendment to start. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_start}.
       */
      @SerializedName("type")
      Type type;

      private AmendmentStart(
          AmendmentEnd amendmentEnd,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          Long timestamp,
          Type type) {
        this.amendmentEnd = amendmentEnd;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentEnd amendmentEnd;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.AmendmentStart build() {
          return new SubscriptionScheduleAmendParams.Amendment.AmendmentStart(
              this.amendmentEnd, this.discountEnd, this.extraParams, this.timestamp, this.type);
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

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(
            SubscriptionScheduleAmendParams.Amendment.AmendmentStart.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
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

        /**
         * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_start}.
         */
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
         * <strong>Required.</strong> The position of the previous amendment in the {@code
         * amendments} array after which this amendment should begin. Indexes start from 0 and must
         * be less than the index of the current amendment in the array.
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
           * <strong>Required.</strong> The position of the previous amendment in the {@code
           * amendments} array after which this amendment should begin. Indexes start from 0 and
           * must be less than the index of the current amendment in the array.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      @Getter
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
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

        private DiscountEnd(String discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleAmendParams.Amendment.AmendmentStart.DiscountEnd build() {
            return new SubscriptionScheduleAmendParams.Amendment.AmendmentStart.DiscountEnd(
                this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.DiscountEnd#extraParams} for
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
           * SubscriptionScheduleAmendParams.Amendment.AmendmentStart.DiscountEnd#extraParams} for
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

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("amendment_end")
        AMENDMENT_END("amendment_end"),

        @SerializedName("discount_end")
        DISCOUNT_END("discount_end"),

        @SerializedName("now")
        NOW("now"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp"),

        @SerializedName("trial_end")
        TRIAL_END("trial_end"),

        @SerializedName("trial_start")
        TRIAL_START("trial_start"),

        @SerializedName("upcoming_invoice")
        UPCOMING_INVOICE("upcoming_invoice");

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

      /** <strong>Required.</strong> Determines the type of discount action. */
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

        /** <strong>Required.</strong> Determines the type of discount action. */
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

        /**
         * The index, starting at 0, at which to position the new discount. When not supplied,
         * Stripe defaults to appending the discount to the end of the {@code discounts} array.
         */
        @SerializedName("index")
        Long index;

        private Add(
            String coupon,
            String discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Long index) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.index = index;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Long index;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add build() {
            return new SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.index);
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

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
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

        @Getter
        public static class DiscountEnd {
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
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(Map<String, Object> extraParams, Type type) {
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
            public SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd
                build() {
              return new SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd(
                  this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd#extraParams}
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
             * SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd#extraParams}
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
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                SubscriptionScheduleAmendParams.Amendment.DiscountAction.Add.DiscountEnd.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("amendment_end")
            AMENDMENT_END("amendment_end");

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

      /** <strong>Required.</strong> Determines the type of item action. */
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

        /** <strong>Required.</strong> Determines the type of item action. */
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

        /** <strong>Required.</strong> The ID of the price object. */
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

          /** <strong>Required.</strong> The ID of the price object. */
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

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode) {
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
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
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

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd
                    discountEnd) {
              this.discountEnd = discountEnd;
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

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
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
              public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd
                  build() {
                return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount
                    .DiscountEnd(this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd
                          .Duration
                      duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd#extraParams}
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
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd#extraParams}
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
                  SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
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
                public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd
                        .Duration
                    build() {
                  return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount
                      .DiscountEnd.Duration(this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd.Duration#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd.Duration#extraParams}
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
                    SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Discount.DiscountEnd
                            .Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
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
        public static class Trial {
          /**
           * List of price IDs which, if present on the subscription following a paid trial,
           * constitute opting-in to the paid trial.
           */
          @SerializedName("converts_to")
          List<String> convertsTo;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addConvertsTo(String element) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.add(element);
              return this;
            }

            /**
             * Add all elements to `convertsTo` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Add.Trial#convertsTo} for the
             * field documentation.
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

            /** <strong>Required.</strong> Determines the type of trial for this item. */
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

        /** <strong>Required.</strong> ID of a price to remove. */
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

          /** <strong>Required.</strong> ID of a price to remove. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }
        }
      }

      @Getter
      public static class Set {
        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * discounts} array on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
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
         * If an item with the {@code price} already exists, passing this will override the {@code
         * metadata} on the subscription item that matches that price. Otherwise, the {@code items}
         * array is cleared and a single new item is added with the supplied {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** <strong>Required.</strong> The ID of the price object. */
        @SerializedName("price")
        String price;

        /**
         * If an item with the {@code price} already exists, passing this will override the quantity
         * on the subscription item that matches that price. Otherwise, the {@code items} array is
         * cleared and a single new item is added with the supplied {@code quantity}.
         */
        @SerializedName("quantity")
        Long quantity;

        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * tax_rates} array on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
         * tax_rates}.
         */
        @SerializedName("tax_rates")
        List<String> taxRates;

        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * trial} configuration on the subscription item that matches that price. Otherwise, the
         * {@code items} array is cleared and a single new item is added with the supplied {@code
         * trial}.
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

          /** <strong>Required.</strong> The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * If an item with the {@code price} already exists, passing this will override the
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
           * If an item with the {@code price} already exists, passing this will override the {@code
           * trial} configuration on the subscription item that matches that price. Otherwise, the
           * {@code items} array is cleared and a single new item is added with the supplied {@code
           * trial}.
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

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode) {
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
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
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

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd
                    discountEnd) {
              this.discountEnd = discountEnd;
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

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
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
              public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd
                  build() {
                return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount
                    .DiscountEnd(this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd
                          .Duration
                      duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd#extraParams}
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
               * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd#extraParams}
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
                  SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
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
                public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd
                        .Duration
                    build() {
                  return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount
                      .DiscountEnd.Duration(this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd.Duration#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd.Duration#extraParams}
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
                    SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Discount.DiscountEnd
                            .Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
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
        public static class Trial {
          /**
           * List of price IDs which, if present on the subscription following a paid trial,
           * constitute opting-in to the paid trial.
           */
          @SerializedName("converts_to")
          List<String> convertsTo;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial build() {
              return new SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addConvertsTo(String element) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.add(element);
              return this;
            }

            /**
             * Add all elements to `convertsTo` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * SubscriptionScheduleAmendParams.Amendment.ItemAction.Set.Trial#convertsTo} for the
             * field documentation.
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

            /** <strong>Required.</strong> Determines the type of trial for this item. */
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

    @Getter
    public static class MetadataAction {
      /**
       * Key-value pairs to add to schedule phase metadata. These values will merge with existing
       * schedule phase metadata.
       */
      @SerializedName("add")
      Map<String, String> add;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Keys to remove from schedule phase metadata. */
      @SerializedName("remove")
      List<String> remove;

      /**
       * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata will be
       * overwritten.
       */
      @SerializedName("set")
      Object set;

      /**
       * <strong>Required.</strong> Select one of three ways to update phase-level {@code metadata}
       * on subscription schedules.
       */
      @SerializedName("type")
      Type type;

      private MetadataAction(
          Map<String, String> add,
          Map<String, Object> extraParams,
          List<String> remove,
          Object set,
          Type type) {
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
        private Map<String, String> add;

        private Map<String, Object> extraParams;

        private List<String> remove;

        private Object set;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.MetadataAction build() {
          return new SubscriptionScheduleAmendParams.Amendment.MetadataAction(
              this.add, this.extraParams, this.remove, this.set, this.type);
        }

        /**
         * Add a key/value pair to `add` map. A map is initialized for the first `put/putAll` call,
         * and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#add} for the field
         * documentation.
         */
        public Builder putAdd(String key, String value) {
          if (this.add == null) {
            this.add = new HashMap<>();
          }
          this.add.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `add` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#add} for the field
         * documentation.
         */
        public Builder putAllAdd(Map<String, String> map) {
          if (this.add == null) {
            this.add = new HashMap<>();
          }
          this.add.putAll(map);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.MetadataAction#extraParams} for
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.MetadataAction#extraParams} for
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
         * Add an element to `remove` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#remove} for the field
         * documentation.
         */
        public Builder addRemove(String element) {
          if (this.remove == null) {
            this.remove = new ArrayList<>();
          }
          this.remove.add(element);
          return this;
        }

        /**
         * Add all elements to `remove` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#remove} for the field
         * documentation.
         */
        public Builder addAllRemove(List<String> elements) {
          if (this.remove == null) {
            this.remove = new ArrayList<>();
          }
          this.remove.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `set` map. A map is initialized for the first `put/putAll` call,
         * and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#set} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putSet(String key, String value) {
          if (this.set == null || this.set instanceof EmptyParam) {
            this.set = new HashMap<String, String>();
          }
          ((Map<String, String>) this.set).put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `set` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleAmendParams.Amendment.MetadataAction#set} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putAllSet(Map<String, String> map) {
          if (this.set == null || this.set instanceof EmptyParam) {
            this.set = new HashMap<String, String>();
          }
          ((Map<String, String>) this.set).putAll(map);
          return this;
        }

        /**
         * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata will
         * be overwritten.
         */
        public Builder setSet(EmptyParam set) {
          this.set = set;
          return this;
        }

        /**
         * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata will
         * be overwritten.
         */
        public Builder setSet(Map<String, String> set) {
          this.set = set;
          return this;
        }

        /**
         * <strong>Required.</strong> Select one of three ways to update phase-level {@code
         * metadata} on subscription schedules.
         */
        public Builder setType(SubscriptionScheduleAmendParams.Amendment.MetadataAction.Type type) {
          this.type = type;
          return this;
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
    public static class SetPauseCollection {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details of the pause_collection behavior to apply to the amendment. */
      @SerializedName("set")
      Set set;

      /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
      @SerializedName("type")
      Type type;

      private SetPauseCollection(Map<String, Object> extraParams, Set set, Type type) {
        this.extraParams = extraParams;
        this.set = set;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Set set;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Amendment.SetPauseCollection build() {
          return new SubscriptionScheduleAmendParams.Amendment.SetPauseCollection(
              this.extraParams, this.set, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.SetPauseCollection#extraParams}
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.SetPauseCollection#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details of the pause_collection behavior to apply to the amendment. */
        public Builder setSet(
            SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set set) {
          this.set = set;
          return this;
        }

        /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
        public Builder setType(
            SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Set {
        /**
         * <strong>Required.</strong> The payment collection behavior for this subscription while
         * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
         */
        @SerializedName("behavior")
        Behavior behavior;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Set(Behavior behavior, Map<String, Object> extraParams) {
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
          public SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set build() {
            return new SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set(
                this.behavior, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The payment collection behavior for this subscription while
           * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
           */
          public Builder setBehavior(
              SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set.Behavior behavior) {
            this.behavior = behavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set#extraParams} for the
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
           * SubscriptionScheduleAmendParams.Amendment.SetPauseCollection.Set#extraParams} for the
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

      public enum Type implements ApiRequestParams.EnumParam {
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
        public SubscriptionScheduleAmendParams.Amendment.TrialSettings build() {
          return new SubscriptionScheduleAmendParams.Amendment.TrialSettings(
              this.endBehavior, this.extraParams);
        }

        /** Defines how the subscription should behave when a trial ends. */
        public Builder setEndBehavior(
            SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.TrialSettings#extraParams} for
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
         * map. See {@link SubscriptionScheduleAmendParams.Amendment.TrialSettings#extraParams} for
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

      @Getter
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
          public SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior build() {
            return new SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior(
                this.extraParams, this.prorateUpFront);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior#extraParams} for
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
           * SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior#extraParams} for
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
           * Configure how an opt-in following a paid trial is billed when using {@code
           * billing_behavior: prorate_up_front}.
           */
          public Builder setProrateUpFront(
              SubscriptionScheduleAmendParams.Amendment.TrialSettings.EndBehavior.ProrateUpFront
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
      @SerializedName("amendment_start")
      AMENDMENT_START("amendment_start"),

      @SerializedName("automatic")
      AUTOMATIC("automatic");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
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

    public enum SetScheduleEnd implements ApiRequestParams.EnumParam {
      @SerializedName("amendment_end")
      AMENDMENT_END("amendment_end"),

      @SerializedName("amendment_start")
      AMENDMENT_START("amendment_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      SetScheduleEnd(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Prebilling {
    /** The beginning of the prebilled time period. The default value is {@code now}. */
    @SerializedName("bill_from")
    BillFrom billFrom;

    /** The end of the prebilled time period. */
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

    /** When the prebilling invoice should be created. The default value is {@code now}. */
    @SerializedName("invoice_at")
    InvoiceAt invoiceAt;

    /**
     * Whether to cancel or preserve {@code prebilling} if the subscription is updated during the
     * prebilled period. The default value is {@code reset}.
     */
    @SerializedName("update_behavior")
    UpdateBehavior updateBehavior;

    private Prebilling(
        BillFrom billFrom,
        BillUntil billUntil,
        Map<String, Object> extraParams,
        InvoiceAt invoiceAt,
        UpdateBehavior updateBehavior) {
      this.billFrom = billFrom;
      this.billUntil = billUntil;
      this.extraParams = extraParams;
      this.invoiceAt = invoiceAt;
      this.updateBehavior = updateBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillFrom billFrom;

      private BillUntil billUntil;

      private Map<String, Object> extraParams;

      private InvoiceAt invoiceAt;

      private UpdateBehavior updateBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleAmendParams.Prebilling build() {
        return new SubscriptionScheduleAmendParams.Prebilling(
            this.billFrom, this.billUntil, this.extraParams, this.invoiceAt, this.updateBehavior);
      }

      /** The beginning of the prebilled time period. The default value is {@code now}. */
      public Builder setBillFrom(SubscriptionScheduleAmendParams.Prebilling.BillFrom billFrom) {
        this.billFrom = billFrom;
        return this;
      }

      /** The end of the prebilled time period. */
      public Builder setBillUntil(SubscriptionScheduleAmendParams.Prebilling.BillUntil billUntil) {
        this.billUntil = billUntil;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleAmendParams.Prebilling#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleAmendParams.Prebilling#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** When the prebilling invoice should be created. The default value is {@code now}. */
      public Builder setInvoiceAt(SubscriptionScheduleAmendParams.Prebilling.InvoiceAt invoiceAt) {
        this.invoiceAt = invoiceAt;
        return this;
      }

      /**
       * Whether to cancel or preserve {@code prebilling} if the subscription is updated during the
       * prebilled period. The default value is {@code reset}.
       */
      public Builder setUpdateBehavior(
          SubscriptionScheduleAmendParams.Prebilling.UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior;
        return this;
      }
    }

    @Getter
    public static class BillFrom {
      /** Start the prebilled period when a specified amendment begins. */
      @SerializedName("amendment_start")
      AmendmentStart amendmentStart;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Start the prebilled period at a precise integer timestamp, starting from the Unix epoch.
       */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> Select one of several ways to pass the {@code bill_from} value.
       */
      @SerializedName("type")
      Type type;

      private BillFrom(
          AmendmentStart amendmentStart,
          Map<String, Object> extraParams,
          Long timestamp,
          Type type) {
        this.amendmentStart = amendmentStart;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentStart amendmentStart;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Prebilling.BillFrom build() {
          return new SubscriptionScheduleAmendParams.Prebilling.BillFrom(
              this.amendmentStart, this.extraParams, this.timestamp, this.type);
        }

        /** Start the prebilled period when a specified amendment begins. */
        public Builder setAmendmentStart(
            SubscriptionScheduleAmendParams.Prebilling.BillFrom.AmendmentStart amendmentStart) {
          this.amendmentStart = amendmentStart;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Prebilling.BillFrom#extraParams} for the
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
         * map. See {@link SubscriptionScheduleAmendParams.Prebilling.BillFrom#extraParams} for the
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
         * Start the prebilled period at a precise integer timestamp, starting from the Unix epoch.
         */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> Select one of several ways to pass the {@code bill_from}
         * value.
         */
        public Builder setType(SubscriptionScheduleAmendParams.Prebilling.BillFrom.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class AmendmentStart {
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
         * <strong>Required.</strong> The position of the amendment in the {@code amendments} array
         * with which prebilling should begin. Indexes start from 0 and must be less than the total
         * number of supplied amendments.
         */
        @SerializedName("index")
        Long index;

        private AmendmentStart(Map<String, Object> extraParams, Long index) {
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
          public SubscriptionScheduleAmendParams.Prebilling.BillFrom.AmendmentStart build() {
            return new SubscriptionScheduleAmendParams.Prebilling.BillFrom.AmendmentStart(
                this.extraParams, this.index);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Prebilling.BillFrom.AmendmentStart#extraParams} for the
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
           * SubscriptionScheduleAmendParams.Prebilling.BillFrom.AmendmentStart#extraParams} for the
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
           * <strong>Required.</strong> The position of the amendment in the {@code amendments}
           * array with which prebilling should begin. Indexes start from 0 and must be less than
           * the total number of supplied amendments.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("amendment_start")
        AMENDMENT_START("amendment_start"),

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
    public static class BillUntil {
      /** End the prebilled period when a specified amendment ends. */
      @SerializedName("amendment_end")
      AmendmentEnd amendmentEnd;

      /** Time span for prebilling, starting from {@code bill_from}. */
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

      /** End the prebilled period at a precise integer timestamp, starting from the Unix epoch. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> Select one of several ways to pass the {@code bill_until} value.
       */
      @SerializedName("type")
      Type type;

      private BillUntil(
          AmendmentEnd amendmentEnd,
          Duration duration,
          Map<String, Object> extraParams,
          Long timestamp,
          Type type) {
        this.amendmentEnd = amendmentEnd;
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentEnd amendmentEnd;

        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleAmendParams.Prebilling.BillUntil build() {
          return new SubscriptionScheduleAmendParams.Prebilling.BillUntil(
              this.amendmentEnd, this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** End the prebilled period when a specified amendment ends. */
        public Builder setAmendmentEnd(
            SubscriptionScheduleAmendParams.Prebilling.BillUntil.AmendmentEnd amendmentEnd) {
          this.amendmentEnd = amendmentEnd;
          return this;
        }

        /** Time span for prebilling, starting from {@code bill_from}. */
        public Builder setDuration(
            SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleAmendParams.Prebilling.BillUntil#extraParams} for the
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
         * map. See {@link SubscriptionScheduleAmendParams.Prebilling.BillUntil#extraParams} for the
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
         * End the prebilled period at a precise integer timestamp, starting from the Unix epoch.
         */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> Select one of several ways to pass the {@code bill_until}
         * value.
         */
        public Builder setType(SubscriptionScheduleAmendParams.Prebilling.BillUntil.Type type) {
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
         * <strong>Required.</strong> The position of the amendment in the {@code amendments} array
         * at which prebilling should end. Indexes start from 0 and must be less than the total
         * number of supplied amendments.
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
          public SubscriptionScheduleAmendParams.Prebilling.BillUntil.AmendmentEnd build() {
            return new SubscriptionScheduleAmendParams.Prebilling.BillUntil.AmendmentEnd(
                this.extraParams, this.index);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Prebilling.BillUntil.AmendmentEnd#extraParams} for the
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
           * SubscriptionScheduleAmendParams.Prebilling.BillUntil.AmendmentEnd#extraParams} for the
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
           * <strong>Required.</strong> The position of the amendment in the {@code amendments}
           * array at which prebilling should end. Indexes start from 0 and must be less than the
           * total number of supplied amendments.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
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
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
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
          public SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration build() {
            return new SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration#extraParams} for the
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
           * SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration#extraParams} for the
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              SubscriptionScheduleAmendParams.Prebilling.BillUntil.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
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
        @SerializedName("amendment_end")
        AMENDMENT_END("amendment_end"),

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

    public enum InvoiceAt implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      InvoiceAt(String value) {
        this.value = value;
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

  @Getter
  public static class ScheduleSettings {
    /** Behavior of the subscription schedule and underlying subscription when it ends. */
    @SerializedName("end_behavior")
    EndBehavior endBehavior;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ScheduleSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
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
      public SubscriptionScheduleAmendParams.ScheduleSettings build() {
        return new SubscriptionScheduleAmendParams.ScheduleSettings(
            this.endBehavior, this.extraParams);
      }

      /** Behavior of the subscription schedule and underlying subscription when it ends. */
      public Builder setEndBehavior(
          SubscriptionScheduleAmendParams.ScheduleSettings.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleAmendParams.ScheduleSettings#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleAmendParams.ScheduleSettings#extraParams} for the field
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

    public enum EndBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("cancel")
      CANCEL("cancel"),

      @SerializedName("release")
      RELEASE("release");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EndBehavior(String value) {
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
