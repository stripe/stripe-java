// File generated from our OpenAPI spec
package com.stripe.param.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TransactionListParams extends ApiRequestParams {
  /** Only return Transactions that were created during the given date interval. */
  @SerializedName("created")
  Object created;

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

  /** <strong>Required.</strong> Returns objects associated with this FinancialAccount. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * The results are in reverse chronological order by {@code created} or {@code posted_at}. The
   * default is {@code created}.
   */
  @SerializedName("order_by")
  OrderBy orderBy;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return Transactions that have the given status: {@code open}, {@code posted}, or {@code
   * void}.
   */
  @SerializedName("status")
  Status status;

  /**
   * A filter for the {@code status_transitions.posted_at} timestamp. When using this filter, {@code
   * status=posted} and {@code order_by=posted_at} must also be specified.
   */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  private TransactionListParams(
      Object created,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Long limit,
      OrderBy orderBy,
      String startingAfter,
      Status status,
      StatusTransitions statusTransitions) {
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.limit = limit;
    this.orderBy = orderBy;
    this.startingAfter = startingAfter;
    this.status = status;
    this.statusTransitions = statusTransitions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object created;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Long limit;

    private OrderBy orderBy;

    private String startingAfter;

    private Status status;

    private StatusTransitions statusTransitions;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionListParams build() {
      return new TransactionListParams(
          this.created,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.limit,
          this.orderBy,
          this.startingAfter,
          this.status,
          this.statusTransitions);
    }

    /** Only return Transactions that were created during the given date interval. */
    public Builder setCreated(TransactionListParams.Created created) {
      this.created = created;
      return this;
    }

    /** Only return Transactions that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
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
     * TransactionListParams#expand} for the field documentation.
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
     * TransactionListParams#expand} for the field documentation.
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
     * TransactionListParams#extraParams} for the field documentation.
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
     * See {@link TransactionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Returns objects associated with this FinancialAccount. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
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
     * The results are in reverse chronological order by {@code created} or {@code posted_at}. The
     * default is {@code created}.
     */
    public Builder setOrderBy(TransactionListParams.OrderBy orderBy) {
      this.orderBy = orderBy;
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
     * Only return Transactions that have the given status: {@code open}, {@code posted}, or {@code
     * void}.
     */
    public Builder setStatus(TransactionListParams.Status status) {
      this.status = status;
      return this;
    }

    /**
     * A filter for the {@code status_transitions.posted_at} timestamp. When using this filter,
     * {@code status=posted} and {@code order_by=posted_at} must also be specified.
     */
    public Builder setStatusTransitions(TransactionListParams.StatusTransitions statusTransitions) {
      this.statusTransitions = statusTransitions;
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
      public TransactionListParams.Created build() {
        return new TransactionListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionListParams.Created#extraParams} for the field documentation.
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
       * See {@link TransactionListParams.Created#extraParams} for the field documentation.
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
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Returns Transactions with {@code posted_at} within the specified range. */
    @SerializedName("posted_at")
    Object postedAt;

    private StatusTransitions(Map<String, Object> extraParams, Object postedAt) {
      this.extraParams = extraParams;
      this.postedAt = postedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object postedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionListParams.StatusTransitions build() {
        return new TransactionListParams.StatusTransitions(this.extraParams, this.postedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionListParams.StatusTransitions#extraParams} for the field documentation.
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
       * See {@link TransactionListParams.StatusTransitions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Returns Transactions with {@code posted_at} within the specified range. */
      public Builder setPostedAt(TransactionListParams.StatusTransitions.PostedAt postedAt) {
        this.postedAt = postedAt;
        return this;
      }

      /** Returns Transactions with {@code posted_at} within the specified range. */
      public Builder setPostedAt(Long postedAt) {
        this.postedAt = postedAt;
        return this;
      }
    }

    @Getter
    public static class PostedAt {
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

      private PostedAt(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
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
        public TransactionListParams.StatusTransitions.PostedAt build() {
          return new TransactionListParams.StatusTransitions.PostedAt(
              this.extraParams, this.gt, this.gte, this.lt, this.lte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionListParams.StatusTransitions.PostedAt#extraParams} for the
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
         * map. See {@link TransactionListParams.StatusTransitions.PostedAt#extraParams} for the
         * field documentation.
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

  public enum OrderBy implements ApiRequestParams.EnumParam {
    @SerializedName("created")
    CREATED("created"),

    @SerializedName("posted_at")
    POSTED_AT("posted_at");

    @Getter(onMethod_ = {@Override})
    private final String value;

    OrderBy(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("open")
    OPEN("open"),

    @SerializedName("posted")
    POSTED("posted"),

    @SerializedName("void")
    VOID("void");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
