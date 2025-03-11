// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EventListParams extends ApiRequestParams {
  /** Filter for events created after the specified timestamp. */
  @SerializedName("created_gt")
  Instant createdGt;

  /** Filter for events created at or after the specified timestamp. */
  @SerializedName("created_gte")
  Instant createdGte;

  /** Filter for events created before the specified timestamp. */
  @SerializedName("created_lt")
  Instant createdLt;

  /** Filter for events created at or before the specified timestamp. */
  @SerializedName("created_lte")
  Instant createdLte;

  /**
   * Filter events based on whether they were successfully delivered to all subscribed event
   * destinations. If false, events which are still pending or have failed all delivery attempts to
   * a event destination will be returned.
   */
  @SerializedName("delivery_success")
  Boolean deliverySuccess;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page size. */
  @SerializedName("limit")
  Integer limit;

  /** Primary object ID used to retrieve related events. */
  @SerializedName("object_id")
  String objectId;

  /** The requested page. */
  @SerializedName("page")
  String page;

  private EventListParams(
      Instant createdGt,
      Instant createdGte,
      Instant createdLt,
      Instant createdLte,
      Boolean deliverySuccess,
      Map<String, Object> extraParams,
      Integer limit,
      String objectId,
      String page) {
    this.createdGt = createdGt;
    this.createdGte = createdGte;
    this.createdLt = createdLt;
    this.createdLte = createdLte;
    this.deliverySuccess = deliverySuccess;
    this.extraParams = extraParams;
    this.limit = limit;
    this.objectId = objectId;
    this.page = page;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Instant createdGt;

    private Instant createdGte;

    private Instant createdLt;

    private Instant createdLte;

    private Boolean deliverySuccess;

    private Map<String, Object> extraParams;

    private Integer limit;

    private String objectId;

    private String page;

    /** Finalize and obtain parameter instance from this builder. */
    public EventListParams build() {
      return new EventListParams(
          this.createdGt,
          this.createdGte,
          this.createdLt,
          this.createdLte,
          this.deliverySuccess,
          this.extraParams,
          this.limit,
          this.objectId,
          this.page);
    }

    /** Filter for events created after the specified timestamp. */
    public Builder setCreatedGt(Instant createdGt) {
      this.createdGt = createdGt;
      return this;
    }

    /** Filter for events created at or after the specified timestamp. */
    public Builder setCreatedGte(Instant createdGte) {
      this.createdGte = createdGte;
      return this;
    }

    /** Filter for events created before the specified timestamp. */
    public Builder setCreatedLt(Instant createdLt) {
      this.createdLt = createdLt;
      return this;
    }

    /** Filter for events created at or before the specified timestamp. */
    public Builder setCreatedLte(Instant createdLte) {
      this.createdLte = createdLte;
      return this;
    }

    /**
     * Filter events based on whether they were successfully delivered to all subscribed event
     * destinations. If false, events which are still pending or have failed all delivery attempts
     * to a event destination will be returned.
     */
    public Builder setDeliverySuccess(Boolean deliverySuccess) {
      this.deliverySuccess = deliverySuccess;
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

    /** The page size. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /** Primary object ID used to retrieve related events. */
    public Builder setObjectId(String objectId) {
      this.objectId = objectId;
      return this;
    }

    /** The requested page. */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }
  }
}
