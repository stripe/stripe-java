// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentLocationCapabilityUpdateParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The location that the capability enables functionality for. */
  @SerializedName("location")
  Object location;

  /**
   * <strong>Required.</strong> To request a new capability for the location, set this to {@code
   * true}. You can remove it from the location by passing {@code false}.
   */
  @SerializedName("requested")
  Boolean requested;

  private PaymentLocationCapabilityUpdateParams(
      List<String> expand, Map<String, Object> extraParams, Object location, Boolean requested) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.location = location;
    this.requested = requested;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object location;

    private Boolean requested;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentLocationCapabilityUpdateParams build() {
      return new PaymentLocationCapabilityUpdateParams(
          this.expand, this.extraParams, this.location, this.requested);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentLocationCapabilityUpdateParams#expand} for the field documentation.
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
     * PaymentLocationCapabilityUpdateParams#expand} for the field documentation.
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
     * PaymentLocationCapabilityUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentLocationCapabilityUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The location that the capability enables functionality for. */
    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    /** <strong>Required.</strong> The location that the capability enables functionality for. */
    public Builder setLocation(EmptyParam location) {
      this.location = location;
      return this;
    }

    /**
     * <strong>Required.</strong> To request a new capability for the location, set this to {@code
     * true}. You can remove it from the location by passing {@code false}.
     */
    public Builder setRequested(Boolean requested) {
      this.requested = requested;
      return this;
    }
  }
}
