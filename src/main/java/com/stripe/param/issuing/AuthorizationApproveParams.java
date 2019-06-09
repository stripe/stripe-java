package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationApproveParams extends ApiRequestParams {

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
   * If the authorization's `is_held_amount_controllable` property is `true`, you may provide this
   * value to control how much to hold for the authorization. Must be positive (use
   * [`decline`](https://stripe.com/docs/api/issuing/authorizations/decline) to decline an
   * authorization request).
   */
  @SerializedName("held_amount")
  Long heldAmount;

  private AuthorizationApproveParams(
      List<String> expand, Map<String, Object> extraParams, Long heldAmount) {

    this.expand = expand;
    this.extraParams = extraParams;
    this.heldAmount = heldAmount;
  }

  public static AuthorizationApproveParams.Builder builder() {
    return new AuthorizationApproveParams.Builder();
  }

  public static class Builder {
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Long heldAmount;

    public AuthorizationApproveParams build() {
      return new AuthorizationApproveParams(this.expand, this.extraParams, this.heldAmount);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationApproveParams#expand} for the field documentation.
     */
    public AuthorizationApproveParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationApproveParams#expand} for the field documentation.
     */
    public AuthorizationApproveParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AuthorizationApproveParams#extraParams} for the field documentation.
     */
    public AuthorizationApproveParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AuthorizationApproveParams#extraParams} for the field documentation.
     */
    public AuthorizationApproveParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If the authorization's `is_held_amount_controllable` property is `true`, you may provide this
     * value to control how much to hold for the authorization. Must be positive (use
     * [`decline`](https://stripe.com/docs/api/issuing/authorizations/decline) to decline an
     * authorization request).
     */
    public AuthorizationApproveParams.Builder setHeldAmount(Long heldAmount) {

      this.heldAmount = heldAmount;
      return this;
    }
  }
}
