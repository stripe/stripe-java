// File generated from our OpenAPI spec
package com.stripe.param.v2.billing.ratecards;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CustomPricingUnitOverageRateCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the custom pricing unit this overage rate applies to. */
  @SerializedName("custom_pricing_unit")
  String customPricingUnit;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> The ID of the one-time item to use for overage line items. */
  @SerializedName("one_time_item")
  String oneTimeItem;

  /**
   * <strong>Required.</strong> The per-unit amount to charge for overages, represented as a decimal
   * string in minor currency units with at most 12 decimal places.
   */
  @SerializedName("unit_amount")
  String unitAmount;

  private CustomPricingUnitOverageRateCreateParams(
      String customPricingUnit,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String oneTimeItem,
      String unitAmount) {
    this.customPricingUnit = customPricingUnit;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.oneTimeItem = oneTimeItem;
    this.unitAmount = unitAmount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customPricingUnit;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String oneTimeItem;

    private String unitAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomPricingUnitOverageRateCreateParams build() {
      return new CustomPricingUnitOverageRateCreateParams(
          this.customPricingUnit,
          this.extraParams,
          this.metadata,
          this.oneTimeItem,
          this.unitAmount);
    }

    /**
     * <strong>Required.</strong> The ID of the custom pricing unit this overage rate applies to.
     */
    public Builder setCustomPricingUnit(String customPricingUnit) {
      this.customPricingUnit = customPricingUnit;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomPricingUnitOverageRateCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomPricingUnitOverageRateCreateParams#extraParams} for the field documentation.
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
     * CustomPricingUnitOverageRateCreateParams#metadata} for the field documentation.
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
     * See {@link CustomPricingUnitOverageRateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The ID of the one-time item to use for overage line items. */
    public Builder setOneTimeItem(String oneTimeItem) {
      this.oneTimeItem = oneTimeItem;
      return this;
    }

    /**
     * <strong>Required.</strong> The per-unit amount to charge for overages, represented as a
     * decimal string in minor currency units with at most 12 decimal places.
     */
    public Builder setUnitAmount(String unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }
  }
}
