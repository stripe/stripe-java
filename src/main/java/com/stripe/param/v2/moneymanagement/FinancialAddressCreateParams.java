// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Open Enum. The currency the FinancialAddress should support.
   * Currently, only the {@code usd} and {@code gbp} values are supported.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
   * associated with.
   */
  @SerializedName("financial_account")
  String financialAccount;

  private FinancialAddressCreateParams(
      String currency, Map<String, Object> extraParams, String financialAccount) {
    this.currency = currency;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private Map<String, Object> extraParams;

    private String financialAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressCreateParams build() {
      return new FinancialAddressCreateParams(
          this.currency, this.extraParams, this.financialAccount);
    }

    /**
     * <strong>Required.</strong> Open Enum. The currency the FinancialAddress should support.
     * Currently, only the {@code usd} and {@code gbp} values are supported.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
     * associated with.
     */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }
  }
}
