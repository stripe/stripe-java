// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AccountUpdateCapabilityParams extends ApiRequestParams {
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
   * To request a new capability for an account, pass true. There can be a delay before the
   * requested capability becomes active. If the capability has any activation requirements, the
   * response includes them in the {@code requirements} arrays.
   *
   * <p>If a capability isn't permanent, you can remove it from the account by passing false. Most
   * capabilities are permanent after they've been requested. Attempting to remove a permanent
   * capability returns an error.
   */
  @SerializedName("requested")
  Boolean requested;

  private AccountUpdateCapabilityParams(
      List<String> expand, Map<String, Object> extraParams, Boolean requested) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.requested = requested;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean requested;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountUpdateCapabilityParams build() {
      return new AccountUpdateCapabilityParams(this.expand, this.extraParams, this.requested);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateCapabilityParams#expand} for the field documentation.
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
     * AccountUpdateCapabilityParams#expand} for the field documentation.
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
     * AccountUpdateCapabilityParams#extraParams} for the field documentation.
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
     * See {@link AccountUpdateCapabilityParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * To request a new capability for an account, pass true. There can be a delay before the
     * requested capability becomes active. If the capability has any activation requirements, the
     * response includes them in the {@code requirements} arrays.
     *
     * <p>If a capability isn't permanent, you can remove it from the account by passing false. Most
     * capabilities are permanent after they've been requested. Attempting to remove a permanent
     * capability returns an error.
     */
    public Builder setRequested(Boolean requested) {
      this.requested = requested;
      return this;
    }
  }
}
