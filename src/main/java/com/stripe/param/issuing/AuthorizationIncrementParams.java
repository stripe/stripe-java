// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AuthorizationIncrementParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The amount to increment the authorization by. This amount is in the
   * authorization currency and in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("increment_amount")
  Long incrementAmount;

  /**
   * If set {@code true}, you may provide <a
   * href="https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount">amount</a>
   * to control how much to hold for the authorization.
   */
  @SerializedName("is_amount_controllable")
  Boolean isAmountControllable;

  private AuthorizationIncrementParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Long incrementAmount,
      Boolean isAmountControllable) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.incrementAmount = incrementAmount;
    this.isAmountControllable = isAmountControllable;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long incrementAmount;

    private Boolean isAmountControllable;

    /** Finalize and obtain parameter instance from this builder. */
    public AuthorizationIncrementParams build() {
      return new AuthorizationIncrementParams(
          this.expand, this.extraParams, this.incrementAmount, this.isAmountControllable);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationIncrementParams#expand} for the field documentation.
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
     * AuthorizationIncrementParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AuthorizationIncrementParams#extraParams} for the field documentation.
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
     * See {@link AuthorizationIncrementParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The amount to increment the authorization by. This amount is in
     * the authorization currency and in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
     */
    public Builder setIncrementAmount(Long incrementAmount) {
      this.incrementAmount = incrementAmount;
      return this;
    }

    /**
     * If set {@code true}, you may provide <a
     * href="https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount">amount</a>
     * to control how much to hold for the authorization.
     */
    public Builder setIsAmountControllable(Boolean isAmountControllable) {
      this.isAmountControllable = isAmountControllable;
      return this;
    }
  }
}
