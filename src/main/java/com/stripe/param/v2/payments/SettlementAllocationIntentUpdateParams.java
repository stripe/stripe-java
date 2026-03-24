// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SettlementAllocationIntentUpdateParams extends ApiRequestParams {
  /**
   * The new amount for the SettlementAllocationIntent. Only amount.value can be updated and
   * currency must remain same.
   */
  @SerializedName("amount")
  Amount amount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The new reference for the SettlementAllocationIntent. */
  @SerializedName("reference")
  Object reference;

  private SettlementAllocationIntentUpdateParams(
      Amount amount, Map<String, Object> extraParams, Object reference) {
    this.amount = amount;
    this.extraParams = extraParams;
    this.reference = reference;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Map<String, Object> extraParams;

    private Object reference;

    /** Finalize and obtain parameter instance from this builder. */
    public SettlementAllocationIntentUpdateParams build() {
      return new SettlementAllocationIntentUpdateParams(
          this.amount, this.extraParams, this.reference);
    }

    /**
     * The new amount for the SettlementAllocationIntent. Only amount.value can be updated and
     * currency must remain same.
     */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SettlementAllocationIntentUpdateParams#extraParams} for the field documentation.
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
     * See {@link SettlementAllocationIntentUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The new reference for the SettlementAllocationIntent. */
    public Builder setReference(String reference) {
      this.reference = reference;
      return this;
    }

    /** The new reference for the SettlementAllocationIntent. */
    public Builder setReference(EmptyParam reference) {
      this.reference = reference;
      return this;
    }
  }
}
