// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class NetworkTokenGenerateCryptogramParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The cryptogram type. When omitted, token_cryptogram is used. */
  @SerializedName("type")
  Type type;

  private NetworkTokenGenerateCryptogramParams(Map<String, Object> extraParams, Type type) {
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public NetworkTokenGenerateCryptogramParams build() {
      return new NetworkTokenGenerateCryptogramParams(this.extraParams, this.type);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * NetworkTokenGenerateCryptogramParams#extraParams} for the field documentation.
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
     * See {@link NetworkTokenGenerateCryptogramParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The cryptogram type. When omitted, token_cryptogram is used. */
    public Builder setType(NetworkTokenGenerateCryptogramParams.Type type) {
      this.type = type;
      return this;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("token_cryptogram")
    TOKEN_CRYPTOGRAM("token_cryptogram");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
