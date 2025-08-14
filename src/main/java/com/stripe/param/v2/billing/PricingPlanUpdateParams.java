// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanUpdateParams extends ApiRequestParams {
  /** Whether the PricingPlan is active. */
  @SerializedName("active")
  Boolean active;

  /** Description of pricing plan subscription. */
  @SerializedName("description")
  Object description;

  /** Display name of the PricingPlan. Maximum 250 characters. */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The ID of the live version of the PricingPlan. */
  @SerializedName("live_version")
  Object liveVersion;

  /**
   * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /** Set of key-value pairs that you can attach to an object. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private PricingPlanUpdateParams(
      Boolean active,
      Object description,
      Object displayName,
      Map<String, Object> extraParams,
      Object liveVersion,
      Object lookupKey,
      Map<String, Object> metadata) {
    this.active = active;
    this.description = description;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.liveVersion = liveVersion;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object description;

    private Object displayName;

    private Map<String, Object> extraParams;

    private Object liveVersion;

    private Object lookupKey;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public PricingPlanUpdateParams build() {
      return new PricingPlanUpdateParams(
          this.active,
          this.description,
          this.displayName,
          this.extraParams,
          this.liveVersion,
          this.lookupKey,
          this.metadata);
    }

    /** Whether the PricingPlan is active. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /** Description of pricing plan subscription. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** Description of pricing plan subscription. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /** Display name of the PricingPlan. Maximum 250 characters. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /** Display name of the PricingPlan. Maximum 250 characters. */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PricingPlanUpdateParams#extraParams} for the field documentation.
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
     * See {@link PricingPlanUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The ID of the live version of the PricingPlan. */
    public Builder setLiveVersion(String liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /** The ID of the live version of the PricingPlan. */
    public Builder setLiveVersion(EmptyParam liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PricingPlanUpdateParams#metadata} for the field documentation.
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
     * PricingPlanUpdateParams#metadata} for the field documentation.
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
     * PricingPlanUpdateParams#metadata} for the field documentation.
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
