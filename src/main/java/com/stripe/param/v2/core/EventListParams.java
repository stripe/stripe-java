// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EventListParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> Primary object ID used to retrieve related events. */
  @SerializedName("object_id")
  String objectId;

  private EventListParams(Map<String, Object> extraParams, Integer limit, String objectId) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.objectId = objectId;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Integer limit;

    private String objectId;

    /** Finalize and obtain parameter instance from this builder. */
    public EventListParams build() {
      return new EventListParams(this.extraParams, this.limit, this.objectId);
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

    /** <strong>Required.</strong> Primary object ID used to retrieve related events. */
    public Builder setObjectId(String objectId) {
      this.objectId = objectId;
      return this;
    }
  }
}
