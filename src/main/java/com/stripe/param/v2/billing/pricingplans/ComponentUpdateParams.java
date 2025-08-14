// File generated from our OpenAPI spec
package com.stripe.param.v2.billing.pricingplans;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ComponentUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** An identifier that can be used to find this component. Maximum length of 200 characters. */
  @SerializedName("lookup_key")
  Object lookupKey;

  /** Set of key-value pairs that you can attach to an object. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private ComponentUpdateParams(
      Map<String, Object> extraParams, Object lookupKey, Map<String, Object> metadata) {
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ComponentUpdateParams build() {
      return new ComponentUpdateParams(this.extraParams, this.lookupKey, this.metadata);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ComponentUpdateParams#extraParams} for the field documentation.
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
     * See {@link ComponentUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** An identifier that can be used to find this component. Maximum length of 200 characters. */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /** An identifier that can be used to find this component. Maximum length of 200 characters. */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ComponentUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ComponentUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * ComponentUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }
}
