// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EventListParams extends ApiRequestParams {
  /** Set of filters to query events within a range of {@code created} timestamps. */
  @SerializedName("created")
  Created created;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<EventListParams.Include> include;

  /** The page size. */
  @SerializedName("limit")
  Long limit;

  /** Primary object ID used to retrieve related events. */
  @SerializedName("object_id")
  String objectId;

  /** An array of up to 20 strings containing specific event names. */
  @SerializedName("types")
  List<String> types;

  private EventListParams(
      Created created,
      Map<String, Object> extraParams,
      List<EventListParams.Include> include,
      Long limit,
      String objectId,
      List<String> types) {
    this.created = created;
    this.extraParams = extraParams;
    this.include = include;
    this.limit = limit;
    this.objectId = objectId;
    this.types = types;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Created created;

    private Map<String, Object> extraParams;

    private List<EventListParams.Include> include;

    private Long limit;

    private String objectId;

    private List<String> types;

    /** Finalize and obtain parameter instance from this builder. */
    public EventListParams build() {
      return new EventListParams(
          this.created, this.extraParams, this.include, this.limit, this.objectId, this.types);
    }

    /** Set of filters to query events within a range of {@code created} timestamps. */
    public Builder setCreated(EventListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventListParams#extraParams} for the field documentation.
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
     * See {@link EventListParams#extraParams} for the field documentation.
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
     * EventListParams#include} for the field documentation.
     */
    public Builder addInclude(EventListParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<EventListParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /** The page size. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Primary object ID used to retrieve related events. */
    public Builder setObjectId(String objectId) {
      this.objectId = objectId;
      return this;
    }

    /**
     * Add an element to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#types} for the field documentation.
     */
    public Builder addType(String element) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.add(element);
      return this;
    }

    /**
     * Add all elements to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#types} for the field documentation.
     */
    public Builder addAllType(List<String> elements) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.addAll(elements);
      return this;
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

    /** Filter for events created after the specified timestamp. */
    @SerializedName("gt")
    Instant gt;

    /** Filter for events created at or after the specified timestamp. */
    @SerializedName("gte")
    Instant gte;

    /** Filter for events created before the specified timestamp. */
    @SerializedName("lt")
    Instant lt;

    /** Filter for events created at or before the specified timestamp. */
    @SerializedName("lte")
    Instant lte;

    private Created(
        Map<String, Object> extraParams, Instant gt, Instant gte, Instant lt, Instant lte) {
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

      private Instant gt;

      private Instant gte;

      private Instant lt;

      private Instant lte;

      /** Finalize and obtain parameter instance from this builder. */
      public EventListParams.Created build() {
        return new EventListParams.Created(this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventListParams.Created#extraParams} for the field documentation.
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
       * See {@link EventListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Filter for events created after the specified timestamp. */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /** Filter for events created at or after the specified timestamp. */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /** Filter for events created before the specified timestamp. */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /** Filter for events created at or before the specified timestamp. */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("reason.request.client")
    REASON__REQUEST__CLIENT("reason.request.client");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
