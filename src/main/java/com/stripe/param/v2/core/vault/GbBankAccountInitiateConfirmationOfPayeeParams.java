// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class GbBankAccountInitiateConfirmationOfPayeeParams extends ApiRequestParams {
  /**
   * The business type to be checked against. Legal entity information will be used if unspecified.
   */
  @SerializedName("business_type")
  BusinessType businessType;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * The name of the user to be checked against. Legal entity information will be used if
   * unspecified.
   */
  @SerializedName("name")
  String name;

  private GbBankAccountInitiateConfirmationOfPayeeParams(
      BusinessType businessType, Map<String, Object> extraParams, String name) {
    this.businessType = businessType;
    this.extraParams = extraParams;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BusinessType businessType;

    private Map<String, Object> extraParams;

    private String name;

    /** Finalize and obtain parameter instance from this builder. */
    public GbBankAccountInitiateConfirmationOfPayeeParams build() {
      return new GbBankAccountInitiateConfirmationOfPayeeParams(
          this.businessType, this.extraParams, this.name);
    }

    /**
     * The business type to be checked against. Legal entity information will be used if
     * unspecified.
     */
    public Builder setBusinessType(
        GbBankAccountInitiateConfirmationOfPayeeParams.BusinessType businessType) {
      this.businessType = businessType;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GbBankAccountInitiateConfirmationOfPayeeParams#extraParams} for the field documentation.
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
     * See {@link GbBankAccountInitiateConfirmationOfPayeeParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The name of the user to be checked against. Legal entity information will be used if
     * unspecified.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }
  }

  public enum BusinessType implements ApiRequestParams.EnumParam {
    @SerializedName("business")
    BUSINESS("business"),

    @SerializedName("personal")
    PERSONAL("personal");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BusinessType(String value) {
      this.value = value;
    }
  }
}
