// File generated from our OpenAPI spec
package com.stripe.param;

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
public class SubscriptionListParams extends ApiRequestParams {
  /** Filter subscriptions by their automatic tax settings. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * The collection method of the subscriptions to retrieve. Either {@code charge_automatically} or
   * {@code send_invoice}.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /** Only return subscriptions that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** Only return subscriptions whose current_period_end falls within the given date interval. */
  @SerializedName("current_period_end")
  Object currentPeriodEnd;

  /** Only return subscriptions whose current_period_start falls within the given date interval. */
  @SerializedName("current_period_start")
  Object currentPeriodStart;

  /** The ID of the customer whose subscriptions will be retrieved. */
  @SerializedName("customer")
  String customer;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

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
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** The ID of the plan whose subscriptions will be retrieved. */
  @SerializedName("plan")
  String plan;

  /** Filter for subscriptions that contain this recurring price ID. */
  @SerializedName("price")
  String price;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * The status of the subscriptions to retrieve. Passing in a value of {@code canceled} will return
   * all canceled subscriptions, including those belonging to deleted customers. Pass {@code ended}
   * to find subscriptions that are canceled and subscriptions that are expired due to <a
   * href="https://stripe.com/docs/billing/subscriptions/overview#subscription-statuses">incomplete
   * payment</a>. Passing in a value of {@code all} will return subscriptions of all statuses. If no
   * value is supplied, all subscriptions that have not been canceled are returned.
   */
  @SerializedName("status")
  Status status;

  /**
   * Filter for subscriptions that are associated with the specified test clock. The response will
   * not include subscriptions with test clocks if this and the customer parameter is not set.
   */
  @SerializedName("test_clock")
  String testClock;

  private SubscriptionListParams(
      AutomaticTax automaticTax,
      CollectionMethod collectionMethod,
      Object created,
      Object currentPeriodEnd,
      Object currentPeriodStart,
      String customer,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String plan,
      String price,
      String startingAfter,
      Status status,
      String testClock) {
    this.automaticTax = automaticTax;
    this.collectionMethod = collectionMethod;
    this.created = created;
    this.currentPeriodEnd = currentPeriodEnd;
    this.currentPeriodStart = currentPeriodStart;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.plan = plan;
    this.price = price;
    this.startingAfter = startingAfter;
    this.status = status;
    this.testClock = testClock;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AutomaticTax automaticTax;

    private CollectionMethod collectionMethod;

    private Object created;

    private Object currentPeriodEnd;

    private Object currentPeriodStart;

    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String plan;

    private String price;

    private String startingAfter;

    private Status status;

    private String testClock;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionListParams build() {
      return new SubscriptionListParams(
          this.automaticTax,
          this.collectionMethod,
          this.created,
          this.currentPeriodEnd,
          this.currentPeriodStart,
          this.customer,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.plan,
          this.price,
          this.startingAfter,
          this.status,
          this.testClock);
    }

    /** Filter subscriptions by their automatic tax settings. */
    public Builder setAutomaticTax(SubscriptionListParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * The collection method of the subscriptions to retrieve. Either {@code charge_automatically}
     * or {@code send_invoice}.
     */
    public Builder setCollectionMethod(SubscriptionListParams.CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /** Only return subscriptions that were created during the given date interval. */
    public Builder setCreated(SubscriptionListParams.Created created) {
      this.created = created;
      return this;
    }

    /** Only return subscriptions that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return subscriptions whose current_period_end falls within the given date interval. */
    public Builder setCurrentPeriodEnd(SubscriptionListParams.CurrentPeriodEnd currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
      return this;
    }

    /** Only return subscriptions whose current_period_end falls within the given date interval. */
    public Builder setCurrentPeriodEnd(Long currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
      return this;
    }

    /**
     * Only return subscriptions whose current_period_start falls within the given date interval.
     */
    public Builder setCurrentPeriodStart(
        SubscriptionListParams.CurrentPeriodStart currentPeriodStart) {
      this.currentPeriodStart = currentPeriodStart;
      return this;
    }

    /**
     * Only return subscriptions whose current_period_start falls within the given date interval.
     */
    public Builder setCurrentPeriodStart(Long currentPeriodStart) {
      this.currentPeriodStart = currentPeriodStart;
      return this;
    }

    /** The ID of the customer whose subscriptions will be retrieved. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionListParams#expand} for the field documentation.
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
     * SubscriptionListParams#expand} for the field documentation.
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
     * SubscriptionListParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** The ID of the plan whose subscriptions will be retrieved. */
    public Builder setPlan(String plan) {
      this.plan = plan;
      return this;
    }

    /** Filter for subscriptions that contain this recurring price ID. */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * The status of the subscriptions to retrieve. Passing in a value of {@code canceled} will
     * return all canceled subscriptions, including those belonging to deleted customers. Pass
     * {@code ended} to find subscriptions that are canceled and subscriptions that are expired due
     * to <a
     * href="https://stripe.com/docs/billing/subscriptions/overview#subscription-statuses">incomplete
     * payment</a>. Passing in a value of {@code all} will return subscriptions of all statuses. If
     * no value is supplied, all subscriptions that have not been canceled are returned.
     */
    public Builder setStatus(SubscriptionListParams.Status status) {
      this.status = status;
      return this;
    }

    /**
     * Filter for subscriptions that are associated with the specified test clock. The response will
     * not include subscriptions with test clocks if this and the customer parameter is not set.
     */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> Enabled automatic tax calculation which will automatically compute
     * tax rates on all invoices generated by the subscription.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionListParams.AutomaticTax build() {
        return new SubscriptionListParams.AutomaticTax(this.enabled, this.extraParams);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionListParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link SubscriptionListParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionListParams.Created build() {
        return new SubscriptionListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionListParams.Created#extraParams} for the field documentation.
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
       * See {@link SubscriptionListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrentPeriodEnd {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private CurrentPeriodEnd(
        Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionListParams.CurrentPeriodEnd build() {
        return new SubscriptionListParams.CurrentPeriodEnd(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionListParams.CurrentPeriodEnd#extraParams} for the field documentation.
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
       * See {@link SubscriptionListParams.CurrentPeriodEnd#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrentPeriodStart {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private CurrentPeriodStart(
        Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionListParams.CurrentPeriodStart build() {
        return new SubscriptionListParams.CurrentPeriodStart(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionListParams.CurrentPeriodStart#extraParams} for the field documentation.
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
       * See {@link SubscriptionListParams.CurrentPeriodStart#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
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

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("all")
    ALL("all"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("ended")
    ENDED("ended"),

    @SerializedName("incomplete")
    INCOMPLETE("incomplete"),

    @SerializedName("incomplete_expired")
    INCOMPLETE_EXPIRED("incomplete_expired"),

    @SerializedName("past_due")
    PAST_DUE("past_due"),

    @SerializedName("paused")
    PAUSED("paused"),

    @SerializedName("trialing")
    TRIALING("trialing"),

    @SerializedName("unpaid")
    UNPAID("unpaid");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
