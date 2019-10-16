package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OrderListParams extends ApiRequestParams {
  /** Date this order was created. */
  @SerializedName("created")
  Object created;

  /** Only return orders for the given customer. */
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

  /** Only return orders with the given IDs. */
  @SerializedName("ids")
  List<String> ids;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return orders that have the given status. One of `created`, `paid`, `fulfilled`, or
   * `refunded`.
   */
  @SerializedName("status")
  String status;

  /** Filter orders based on when they were paid, fulfilled, canceled, or returned. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Only return orders with the given upstream order IDs. */
  @SerializedName("upstream_ids")
  List<String> upstreamIds;

  private OrderListParams(
      Object created,
      String customer,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      List<String> ids,
      Long limit,
      String startingAfter,
      String status,
      StatusTransitions statusTransitions,
      List<String> upstreamIds) {
    this.created = created;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.ids = ids;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
    this.statusTransitions = statusTransitions;
    this.upstreamIds = upstreamIds;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object created;

    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<String> ids;

    private Long limit;

    private String startingAfter;

    private String status;

    private StatusTransitions statusTransitions;

    private List<String> upstreamIds;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderListParams build() {
      return new OrderListParams(
          this.created,
          this.customer,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.ids,
          this.limit,
          this.startingAfter,
          this.status,
          this.statusTransitions,
          this.upstreamIds);
    }

    /** Date this order was created. */
    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    /** Date this order was created. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return orders for the given customer. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderListParams#expand} for the field documentation.
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
     * OrderListParams#expand} for the field documentation.
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
     * OrderListParams#extraParams} for the field documentation.
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
     * See {@link OrderListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `ids` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderListParams#ids} for the field documentation.
     */
    public Builder addId(String element) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.add(element);
      return this;
    }

    /**
     * Add all elements to `ids` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderListParams#ids} for the field documentation.
     */
    public Builder addAllId(List<String> elements) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.addAll(elements);
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

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return orders that have the given status. One of `created`, `paid`, `fulfilled`, or
     * `refunded`.
     */
    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    /** Filter orders based on when they were paid, fulfilled, canceled, or returned. */
    public Builder setStatusTransitions(StatusTransitions statusTransitions) {
      this.statusTransitions = statusTransitions;
      return this;
    }

    /**
     * Add an element to `upstreamIds` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderListParams#upstreamIds} for the field documentation.
     */
    public Builder addUpstreamId(String element) {
      if (this.upstreamIds == null) {
        this.upstreamIds = new ArrayList<>();
      }
      this.upstreamIds.add(element);
      return this;
    }

    /**
     * Add all elements to `upstreamIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * OrderListParams#upstreamIds} for the field documentation.
     */
    public Builder addAllUpstreamId(List<String> elements) {
      if (this.upstreamIds == null) {
        this.upstreamIds = new ArrayList<>();
      }
      this.upstreamIds.addAll(elements);
      return this;
    }
  }

  @Getter
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
      public Created build() {
        return new Created(this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderListParams.Created#extraParams} for the field documentation.
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
       * See {@link OrderListParams.Created#extraParams} for the field documentation.
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
  public static class StatusTransitions {
    /** Date this order was canceled. */
    @SerializedName("canceled")
    Object canceled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Date this order was fulfilled. */
    @SerializedName("fulfilled")
    Object fulfilled;

    /** Date this order was paid. */
    @SerializedName("paid")
    Object paid;

    /** Date this order was returned. */
    @SerializedName("returned")
    Object returned;

    private StatusTransitions(
        Object canceled,
        Map<String, Object> extraParams,
        Object fulfilled,
        Object paid,
        Object returned) {
      this.canceled = canceled;
      this.extraParams = extraParams;
      this.fulfilled = fulfilled;
      this.paid = paid;
      this.returned = returned;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object canceled;

      private Map<String, Object> extraParams;

      private Object fulfilled;

      private Object paid;

      private Object returned;

      /** Finalize and obtain parameter instance from this builder. */
      public StatusTransitions build() {
        return new StatusTransitions(
            this.canceled, this.extraParams, this.fulfilled, this.paid, this.returned);
      }

      /** Date this order was canceled. */
      public Builder setCanceled(Canceled canceled) {
        this.canceled = canceled;
        return this;
      }

      /** Date this order was canceled. */
      public Builder setCanceled(Long canceled) {
        this.canceled = canceled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderListParams.StatusTransitions#extraParams} for the field documentation.
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
       * See {@link OrderListParams.StatusTransitions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Date this order was fulfilled. */
      public Builder setFulfilled(Fulfilled fulfilled) {
        this.fulfilled = fulfilled;
        return this;
      }

      /** Date this order was fulfilled. */
      public Builder setFulfilled(Long fulfilled) {
        this.fulfilled = fulfilled;
        return this;
      }

      /** Date this order was paid. */
      public Builder setPaid(Paid paid) {
        this.paid = paid;
        return this;
      }

      /** Date this order was paid. */
      public Builder setPaid(Long paid) {
        this.paid = paid;
        return this;
      }

      /** Date this order was returned. */
      public Builder setReturned(Returned returned) {
        this.returned = returned;
        return this;
      }

      /** Date this order was returned. */
      public Builder setReturned(Long returned) {
        this.returned = returned;
        return this;
      }
    }

    @Getter
    public static class Canceled {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      private Canceled(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
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
        public Canceled build() {
          return new Canceled(this.extraParams, this.gt, this.gte, this.lt, this.lte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderListParams.StatusTransitions.Canceled#extraParams} for the field
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
         * map. See {@link OrderListParams.StatusTransitions.Canceled#extraParams} for the field
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
    public static class Fulfilled {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      private Fulfilled(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
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
        public Fulfilled build() {
          return new Fulfilled(this.extraParams, this.gt, this.gte, this.lt, this.lte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderListParams.StatusTransitions.Fulfilled#extraParams} for the field
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
         * map. See {@link OrderListParams.StatusTransitions.Fulfilled#extraParams} for the field
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
    public static class Paid {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      private Paid(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
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
        public Paid build() {
          return new Paid(this.extraParams, this.gt, this.gte, this.lt, this.lte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderListParams.StatusTransitions.Paid#extraParams} for the field
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
         * map. See {@link OrderListParams.StatusTransitions.Paid#extraParams} for the field
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
    public static class Returned {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      private Returned(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
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
        public Returned build() {
          return new Returned(this.extraParams, this.gt, this.gte, this.lt, this.lte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderListParams.StatusTransitions.Returned#extraParams} for the field
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
         * map. See {@link OrderListParams.StatusTransitions.Returned#extraParams} for the field
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
  }
}
