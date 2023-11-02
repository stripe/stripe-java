// File generated from our OpenAPI spec
package com.stripe.param.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RegistrationUpdateParams extends ApiRequestParams {
  /**
   * Time at which the registration becomes active. It can be either {@code now} to indicate the
   * current time, or a timestamp measured in seconds since the Unix epoch.
   */
  @SerializedName("active_from")
  Object activeFrom;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * If set, the registration stops being active at this time. If not set, the registration will be
   * active indefinitely. It can be either {@code now} to indicate the current time, or a timestamp
   * measured in seconds since the Unix epoch.
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

  private RegistrationUpdateParams(
      Object activeFrom, List<String> expand, Object expiresAt, Map<String, Object> extraParams) {
    this.activeFrom = activeFrom;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object activeFrom;

    private List<String> expand;

    private Object expiresAt;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public RegistrationUpdateParams build() {
      return new RegistrationUpdateParams(
          this.activeFrom, this.expand, this.expiresAt, this.extraParams);
    }

    /**
     * Time at which the registration becomes active. It can be either {@code now} to indicate the
     * current time, or a timestamp measured in seconds since the Unix epoch.
     */
    public Builder setActiveFrom(RegistrationUpdateParams.ActiveFrom activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * Time at which the registration becomes active. It can be either {@code now} to indicate the
     * current time, or a timestamp measured in seconds since the Unix epoch.
     */
    public Builder setActiveFrom(Long activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RegistrationUpdateParams#expand} for the field documentation.
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
     * RegistrationUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * If set, the registration stops being active at this time. If not set, the registration will
     * be active indefinitely. It can be either {@code now} to indicate the current time, or a
     * timestamp measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(RegistrationUpdateParams.ExpiresAt expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * If set, the registration stops being active at this time. If not set, the registration will
     * be active indefinitely. It can be either {@code now} to indicate the current time, or a
     * timestamp measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * If set, the registration stops being active at this time. If not set, the registration will
     * be active indefinitely. It can be either {@code now} to indicate the current time, or a
     * timestamp measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(EmptyParam expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RegistrationUpdateParams#extraParams} for the field documentation.
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
     * See {@link RegistrationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  public enum ActiveFrom implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ActiveFrom(String value) {
      this.value = value;
    }
  }

  public enum ExpiresAt implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ExpiresAt(String value) {
      this.value = value;
    }
  }
}
