// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CreditGrantUpdateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * The time when the credit created by this credit grant will expire. If set to empty, the credit
   * will never expire.
   */
  @SerializedName("expires_at")
  Object expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object (ex: cost basis) in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private CreditGrantUpdateParams(
      List<String> expand,
      Object expiresAt,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Object expiresAt;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditGrantUpdateParams build() {
      return new CreditGrantUpdateParams(
          this.expand, this.expiresAt, this.extraParams, this.metadata);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditGrantUpdateParams#expand} for the field documentation.
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
     * CreditGrantUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * The time when the credit created by this credit grant will expire. If set to empty, the
     * credit will never expire.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * The time when the credit created by this credit grant will expire. If set to empty, the
     * credit will never expire.
     */
    public Builder setExpiresAt(EmptyParam expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditGrantUpdateParams#extraParams} for the field documentation.
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
     * See {@link CreditGrantUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditGrantUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CreditGrantUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }
}
