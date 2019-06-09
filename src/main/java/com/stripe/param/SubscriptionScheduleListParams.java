package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionScheduleListParams extends ApiRequestParams {

  /** Only return subscription schedules that were created canceled the given date interval. */
  @SerializedName("canceled_at")
  Object canceledAt;

  /** Only return subscription schedules that completed during the given date interval. */
  @SerializedName("completed_at")
  Object completedAt;

  /** Only return subscription schedules that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** Only return subscription schedules for the given customer. */
  @SerializedName("customer")
  String customer;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
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

  /** Only return subscription schedules that were released during the given date interval. */
  @SerializedName("released_at")
  Object releasedAt;

  /** Only return subscription schedules that have not started yet. */
  @SerializedName("scheduled")
  Boolean scheduled;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private SubscriptionScheduleListParams(
      Object canceledAt,
      Object completedAt,
      Object created,
      String customer,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      Object releasedAt,
      Boolean scheduled,
      String startingAfter) {

    this.canceledAt = canceledAt;
    this.completedAt = completedAt;
    this.created = created;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.releasedAt = releasedAt;
    this.scheduled = scheduled;
    this.startingAfter = startingAfter;
  }

  public static SubscriptionScheduleListParams.Builder builder() {
    return new SubscriptionScheduleListParams.Builder();
  }

  public static class Builder {
    private Object canceledAt;
    private Object completedAt;
    private Object created;
    private String customer;
    private String endingBefore;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Long limit;
    private Object releasedAt;
    private Boolean scheduled;
    private String startingAfter;

    public SubscriptionScheduleListParams build() {
      return new SubscriptionScheduleListParams(
          this.canceledAt,
          this.completedAt,
          this.created,
          this.customer,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.releasedAt,
          this.scheduled,
          this.startingAfter);
    }

    /** Only return subscription schedules that were created canceled the given date interval. */
    public SubscriptionScheduleListParams.Builder setCanceledAt(
        SubscriptionScheduleListParams.CanceledAt canceledAt) {

      this.canceledAt = canceledAt;
      return this;
    }

    /** Only return subscription schedules that were created canceled the given date interval. */
    public SubscriptionScheduleListParams.Builder setCanceledAt(Long canceledAt) {

      this.canceledAt = canceledAt;
      return this;
    }

    /** Only return subscription schedules that completed during the given date interval. */
    public SubscriptionScheduleListParams.Builder setCompletedAt(
        SubscriptionScheduleListParams.CompletedAt completedAt) {

      this.completedAt = completedAt;
      return this;
    }

    /** Only return subscription schedules that completed during the given date interval. */
    public SubscriptionScheduleListParams.Builder setCompletedAt(Long completedAt) {

      this.completedAt = completedAt;
      return this;
    }

    /** Only return subscription schedules that were created during the given date interval. */
    public SubscriptionScheduleListParams.Builder setCreated(
        SubscriptionScheduleListParams.Created created) {

      this.created = created;
      return this;
    }

    /** Only return subscription schedules that were created during the given date interval. */
    public SubscriptionScheduleListParams.Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return subscription schedules for the given customer. */
    public SubscriptionScheduleListParams.Builder setCustomer(String customer) {

      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public SubscriptionScheduleListParams.Builder setEndingBefore(String endingBefore) {

      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleListParams#expand} for the field documentation.
     */
    public SubscriptionScheduleListParams.Builder addExpand(String element) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleListParams#expand} for the field documentation.
     */
    public SubscriptionScheduleListParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleListParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleListParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleListParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleListParams.Builder putAllExtraParam(Map<String, Object> map) {

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
    public SubscriptionScheduleListParams.Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return subscription schedules that were released during the given date interval. */
    public SubscriptionScheduleListParams.Builder setReleasedAt(
        SubscriptionScheduleListParams.ReleasedAt releasedAt) {

      this.releasedAt = releasedAt;
      return this;
    }

    /** Only return subscription schedules that were released during the given date interval. */
    public SubscriptionScheduleListParams.Builder setReleasedAt(Long releasedAt) {

      this.releasedAt = releasedAt;
      return this;
    }

    /** Only return subscription schedules that have not started yet. */
    public SubscriptionScheduleListParams.Builder setScheduled(Boolean scheduled) {

      this.scheduled = scheduled;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public SubscriptionScheduleListParams.Builder setStartingAfter(String startingAfter) {

      this.startingAfter = startingAfter;
      return this;
    }
  }

  public static class CanceledAt {

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

    private CanceledAt(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static SubscriptionScheduleListParams.CanceledAt.Builder builder() {

      return new SubscriptionScheduleListParams.CanceledAt.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public SubscriptionScheduleListParams.CanceledAt build() {
        return new SubscriptionScheduleListParams.CanceledAt(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleListParams.CanceledAt#extraParams} for the field documentation.
       */
      public SubscriptionScheduleListParams.CanceledAt.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleListParams.CanceledAt#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleListParams.CanceledAt.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.CanceledAt.Builder setGt(Long gt) {

        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.CanceledAt.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.CanceledAt.Builder setLt(Long lt) {

        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.CanceledAt.Builder setLte(Long lte) {

        this.lte = lte;
        return this;
      }
    }
  }

  public static class CompletedAt {

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

    private CompletedAt(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static SubscriptionScheduleListParams.CompletedAt.Builder builder() {

      return new SubscriptionScheduleListParams.CompletedAt.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public SubscriptionScheduleListParams.CompletedAt build() {
        return new SubscriptionScheduleListParams.CompletedAt(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleListParams.CompletedAt#extraParams} for the field documentation.
       */
      public SubscriptionScheduleListParams.CompletedAt.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleListParams.CompletedAt#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleListParams.CompletedAt.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.CompletedAt.Builder setGt(Long gt) {

        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.CompletedAt.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.CompletedAt.Builder setLt(Long lt) {

        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.CompletedAt.Builder setLte(Long lte) {

        this.lte = lte;
        return this;
      }
    }
  }

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

    public static SubscriptionScheduleListParams.Created.Builder builder() {
      return new SubscriptionScheduleListParams.Created.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public SubscriptionScheduleListParams.Created build() {
        return new SubscriptionScheduleListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleListParams.Created#extraParams} for the field documentation.
       */
      public SubscriptionScheduleListParams.Created.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleListParams.Created#extraParams} for the field documentation.
       */
      public SubscriptionScheduleListParams.Created.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.Created.Builder setGt(Long gt) {

        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.Created.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.Created.Builder setLt(Long lt) {

        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.Created.Builder setLte(Long lte) {

        this.lte = lte;
        return this;
      }
    }
  }

  public static class ReleasedAt {

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

    private ReleasedAt(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static SubscriptionScheduleListParams.ReleasedAt.Builder builder() {

      return new SubscriptionScheduleListParams.ReleasedAt.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public SubscriptionScheduleListParams.ReleasedAt build() {
        return new SubscriptionScheduleListParams.ReleasedAt(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleListParams.ReleasedAt#extraParams} for the field documentation.
       */
      public SubscriptionScheduleListParams.ReleasedAt.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleListParams.ReleasedAt#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleListParams.ReleasedAt.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.ReleasedAt.Builder setGt(Long gt) {

        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.ReleasedAt.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public SubscriptionScheduleListParams.ReleasedAt.Builder setLt(Long lt) {

        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public SubscriptionScheduleListParams.ReleasedAt.Builder setLte(Long lte) {

        this.lte = lte;
        return this;
      }
    }
  }
}
