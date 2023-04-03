// File generated from our OpenAPI spec
package com.stripe.param.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RegistrationCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Time at which the Tax Registration becomes active. Measured in
   * seconds since the Unix epoch.
   */
  @SerializedName("active_from")
  Long activeFrom;

  /**
   * <strong>Required.</strong> Two-letter country code (<a
   * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * If set, the Tax Registration stops being active at this time. If not set, the Tax Registration
   * will be active indefinitely. Measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** State, county, province, or region. */
  @SerializedName("state")
  String state;

  /**
   * <strong>Required.</strong> The type of the Tax Registration. See <a
   * href="https://stripe.com/docs/tax/registering">our guide</a> for more information about
   * registration types.
   */
  @SerializedName("type")
  Type type;

  private RegistrationCreateParams(
      Long activeFrom,
      String country,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      String state,
      Type type) {
    this.activeFrom = activeFrom;
    this.country = country;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.state = state;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long activeFrom;

    private String country;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private String state;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public RegistrationCreateParams build() {
      return new RegistrationCreateParams(
          this.activeFrom,
          this.country,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.state,
          this.type);
    }

    /**
     * <strong>Required.</strong> Time at which the Tax Registration becomes active. Measured in
     * seconds since the Unix epoch.
     */
    public Builder setActiveFrom(Long activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * <strong>Required.</strong> Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RegistrationCreateParams#expand} for the field documentation.
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
     * RegistrationCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * If set, the Tax Registration stops being active at this time. If not set, the Tax
     * Registration will be active indefinitely. Measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RegistrationCreateParams#extraParams} for the field documentation.
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
     * See {@link RegistrationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** State, county, province, or region. */
    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    /**
     * <strong>Required.</strong> The type of the Tax Registration. See <a
     * href="https://stripe.com/docs/tax/registering">our guide</a> for more information about
     * registration types.
     */
    public Builder setType(RegistrationCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("domestic_small_seller")
    DOMESTIC_SMALL_SELLER("domestic_small_seller"),

    @SerializedName("ioss")
    IOSS("ioss"),

    @SerializedName("simplified")
    SIMPLIFIED("simplified"),

    @SerializedName("standard")
    STANDARD("standard"),

    @SerializedName("vat_oss_non_union")
    VAT_OSS_NON_UNION("vat_oss_non_union"),

    @SerializedName("vat_oss_union")
    VAT_OSS_UNION("vat_oss_union");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
