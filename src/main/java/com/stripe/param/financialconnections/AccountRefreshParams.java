// File generated from our OpenAPI spec
package com.stripe.param.financialconnections;

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
public class AccountRefreshParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The list of account features that you would like to refresh. */
  @SerializedName("features")
  List<AccountRefreshParams.Feature> features;

  private AccountRefreshParams(
      List<String> expand,
      Map<String, Object> extraParams,
      List<AccountRefreshParams.Feature> features) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.features = features;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<AccountRefreshParams.Feature> features;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountRefreshParams build() {
      return new AccountRefreshParams(this.expand, this.extraParams, this.features);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountRefreshParams#expand} for the field documentation.
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
     * AccountRefreshParams#expand} for the field documentation.
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
     * AccountRefreshParams#extraParams} for the field documentation.
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
     * See {@link AccountRefreshParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `features` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountRefreshParams#features} for the field documentation.
     */
    public Builder addFeature(AccountRefreshParams.Feature element) {
      if (this.features == null) {
        this.features = new ArrayList<>();
      }
      this.features.add(element);
      return this;
    }

    /**
     * Add all elements to `features` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountRefreshParams#features} for the field documentation.
     */
    public Builder addAllFeature(List<AccountRefreshParams.Feature> elements) {
      if (this.features == null) {
        this.features = new ArrayList<>();
      }
      this.features.addAll(elements);
      return this;
    }
  }

  public enum Feature implements ApiRequestParams.EnumParam {
    @SerializedName("balance")
    BALANCE("balance"),

    @SerializedName("ownership")
    OWNERSHIP("ownership"),

    @SerializedName("transactions")
    TRANSACTIONS("transactions");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Feature(String value) {
      this.value = value;
    }
  }
}
