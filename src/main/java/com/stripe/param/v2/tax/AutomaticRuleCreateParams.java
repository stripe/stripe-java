// File generated from our OpenAPI spec
package com.stripe.param.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AutomaticRuleCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The BillableItem ID to set automatic Tax configuration for. */
  @SerializedName("billable_item")
  String billableItem;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The TaxCode object to be used for automatic tax calculations. */
  @SerializedName("tax_code")
  String taxCode;

  private AutomaticRuleCreateParams(
      String billableItem, Map<String, Object> extraParams, String taxCode) {
    this.billableItem = billableItem;
    this.extraParams = extraParams;
    this.taxCode = taxCode;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String billableItem;

    private Map<String, Object> extraParams;

    private String taxCode;

    /** Finalize and obtain parameter instance from this builder. */
    public AutomaticRuleCreateParams build() {
      return new AutomaticRuleCreateParams(this.billableItem, this.extraParams, this.taxCode);
    }

    /** <strong>Required.</strong> The BillableItem ID to set automatic Tax configuration for. */
    public Builder setBillableItem(String billableItem) {
      this.billableItem = billableItem;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AutomaticRuleCreateParams#extraParams} for the field documentation.
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
     * See {@link AutomaticRuleCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The TaxCode object to be used for automatic tax calculations. */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }
  }
}
