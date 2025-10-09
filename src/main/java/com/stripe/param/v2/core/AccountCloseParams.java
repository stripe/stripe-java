// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
public class AccountCloseParams extends ApiRequestParams {
  /**
   * Configurations on the Account to be closed. All configurations on the Account must be passed in
   * for this request to succeed.
   */
  @SerializedName("applied_configurations")
  List<AccountCloseParams.AppliedConfiguration> appliedConfigurations;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private AccountCloseParams(
      List<AccountCloseParams.AppliedConfiguration> appliedConfigurations,
      Map<String, Object> extraParams) {
    this.appliedConfigurations = appliedConfigurations;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<AccountCloseParams.AppliedConfiguration> appliedConfigurations;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountCloseParams build() {
      return new AccountCloseParams(this.appliedConfigurations, this.extraParams);
    }

    /**
     * Add an element to `appliedConfigurations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountCloseParams#appliedConfigurations} for the field documentation.
     */
    public Builder addAppliedConfiguration(AccountCloseParams.AppliedConfiguration element) {
      if (this.appliedConfigurations == null) {
        this.appliedConfigurations = new ArrayList<>();
      }
      this.appliedConfigurations.add(element);
      return this;
    }

    /**
     * Add all elements to `appliedConfigurations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountCloseParams#appliedConfigurations} for the field documentation.
     */
    public Builder addAllAppliedConfiguration(
        List<AccountCloseParams.AppliedConfiguration> elements) {
      if (this.appliedConfigurations == null) {
        this.appliedConfigurations = new ArrayList<>();
      }
      this.appliedConfigurations.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCloseParams#extraParams} for the field documentation.
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
     * See {@link AccountCloseParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  public enum AppliedConfiguration implements ApiRequestParams.EnumParam {
    @SerializedName("card_creator")
    CARD_CREATOR("card_creator"),

    @SerializedName("customer")
    CUSTOMER("customer"),

    @SerializedName("merchant")
    MERCHANT("merchant"),

    @SerializedName("recipient")
    RECIPIENT("recipient"),

    @SerializedName("storer")
    STORER("storer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AppliedConfiguration(String value) {
      this.value = value;
    }
  }
}
