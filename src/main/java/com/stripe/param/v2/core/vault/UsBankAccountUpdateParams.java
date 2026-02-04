// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class UsBankAccountUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * The bank account's Fedwire routing number can be provided for update if it was empty
   * previously.
   */
  @SerializedName("fedwire_routing_number")
  Object fedwireRoutingNumber;

  /**
   * The bank account's ACH routing number can be provided for update if it was empty previously.
   */
  @SerializedName("routing_number")
  Object routingNumber;

  private UsBankAccountUpdateParams(
      Map<String, Object> extraParams, Object fedwireRoutingNumber, Object routingNumber) {
    this.extraParams = extraParams;
    this.fedwireRoutingNumber = fedwireRoutingNumber;
    this.routingNumber = routingNumber;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Object fedwireRoutingNumber;

    private Object routingNumber;

    /** Finalize and obtain parameter instance from this builder. */
    public UsBankAccountUpdateParams build() {
      return new UsBankAccountUpdateParams(
          this.extraParams, this.fedwireRoutingNumber, this.routingNumber);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * UsBankAccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link UsBankAccountUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The bank account's Fedwire routing number can be provided for update if it was empty
     * previously.
     */
    public Builder setFedwireRoutingNumber(String fedwireRoutingNumber) {
      this.fedwireRoutingNumber = fedwireRoutingNumber;
      return this;
    }

    /**
     * The bank account's Fedwire routing number can be provided for update if it was empty
     * previously.
     */
    public Builder setFedwireRoutingNumber(EmptyParam fedwireRoutingNumber) {
      this.fedwireRoutingNumber = fedwireRoutingNumber;
      return this;
    }

    /**
     * The bank account's ACH routing number can be provided for update if it was empty previously.
     */
    public Builder setRoutingNumber(String routingNumber) {
      this.routingNumber = routingNumber;
      return this;
    }

    /**
     * The bank account's ACH routing number can be provided for update if it was empty previously.
     */
    public Builder setRoutingNumber(EmptyParam routingNumber) {
      this.routingNumber = routingNumber;
      return this;
    }
  }
}
