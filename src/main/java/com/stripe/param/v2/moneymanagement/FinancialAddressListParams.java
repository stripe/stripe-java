// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
public class FinancialAddressListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The ID of the FinancialAccount for which FinancialAddresses are to be returned. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Open Enum. A list of fields to reveal in the FinancialAddresses returned. */
  @SerializedName("include")
  List<FinancialAddressListParams.Include> include;

  /** The page limit. */
  @SerializedName("limit")
  Integer limit;

  private FinancialAddressListParams(
      Map<String, Object> extraParams,
      String financialAccount,
      List<FinancialAddressListParams.Include> include,
      Integer limit) {
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.include = include;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String financialAccount;

    private List<FinancialAddressListParams.Include> include;

    private Integer limit;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressListParams build() {
      return new FinancialAddressListParams(
          this.extraParams, this.financialAccount, this.include, this.limit);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressListParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The ID of the FinancialAccount for which FinancialAddresses are to be returned. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAddressListParams#include} for the field documentation.
     */
    public Builder addInclude(FinancialAddressListParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * FinancialAddressListParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<FinancialAddressListParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("credentials.gb_bank_account.account_number")
    CREDENTIALS__GB_BANK_ACCOUNT__ACCOUNT_NUMBER("credentials.gb_bank_account.account_number"),

    @SerializedName("credentials.us_bank_account.account_number")
    CREDENTIALS__US_BANK_ACCOUNT__ACCOUNT_NUMBER("credentials.us_bank_account.account_number");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
