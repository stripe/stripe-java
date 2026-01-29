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
public class BatchJobCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The API endpoint to batch (e.g., /v1/customers/:id for batch
   * customer updates).
   */
  @SerializedName("endpoint")
  Endpoint endpoint;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private BatchJobCreateParams(Endpoint endpoint, Map<String, Object> extraParams) {
    this.endpoint = endpoint;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Endpoint endpoint;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public BatchJobCreateParams build() {
      return new BatchJobCreateParams(this.endpoint, this.extraParams);
    }

    /**
     * <strong>Required.</strong> The API endpoint to batch (e.g., /v1/customers/:id for batch
     * customer updates).
     */
    public Builder setEndpoint(BatchJobCreateParams.Endpoint endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BatchJobCreateParams#extraParams} for the field documentation.
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
     * See {@link BatchJobCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  public enum Endpoint implements ApiRequestParams.EnumParam {
    @SerializedName("/v1/subscription_schedules")
    _V1_SUBSCRIPTION_SCHEDULES("/v1/subscription_schedules"),

    @SerializedName("/v1/customers/:customer")
    _V1_CUSTOMERS__CUSTOMER("/v1/customers/:customer"),

    @SerializedName("/v1/subscriptions/:subscription_exposed_id")
    _V1_SUBSCRIPTIONS__SUBSCRIPTION_EXPOSED_ID("/v1/subscriptions/:subscription_exposed_id");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Endpoint(String value) {
      this.value = value;
    }
  }
}
