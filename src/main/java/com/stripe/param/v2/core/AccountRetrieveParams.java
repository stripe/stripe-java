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
public class AccountRetrieveParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<AccountRetrieveParams.Include> include;

  private AccountRetrieveParams(
      Map<String, Object> extraParams, List<AccountRetrieveParams.Include> include) {
    this.extraParams = extraParams;
    this.include = include;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<AccountRetrieveParams.Include> include;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountRetrieveParams build() {
      return new AccountRetrieveParams(this.extraParams, this.include);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountRetrieveParams#extraParams} for the field documentation.
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
     * See {@link AccountRetrieveParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountRetrieveParams#include} for the field documentation.
     */
    public Builder addInclude(AccountRetrieveParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountRetrieveParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<AccountRetrieveParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("configuration.card_creator")
    CONFIGURATION__CARD_CREATOR("configuration.card_creator"),

    @SerializedName("configuration.customer")
    CONFIGURATION__CUSTOMER("configuration.customer"),

    @SerializedName("configuration.merchant")
    CONFIGURATION__MERCHANT("configuration.merchant"),

    @SerializedName("configuration.recipient")
    CONFIGURATION__RECIPIENT("configuration.recipient"),

    @SerializedName("configuration.storer")
    CONFIGURATION__STORER("configuration.storer"),

    @SerializedName("defaults")
    DEFAULTS("defaults"),

    @SerializedName("future_requirements")
    FUTURE_REQUIREMENTS("future_requirements"),

    @SerializedName("identity")
    IDENTITY("identity"),

    @SerializedName("requirements")
    REQUIREMENTS("requirements");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
