// File generated from our OpenAPI spec
package com.stripe.param.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AccountSubscribeParams extends ApiRequestParams {
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

  /**
   * <strong>Required.</strong> The list of account features to which you would like to subscribe.`.
   */
  @SerializedName("features")
  List<AccountSubscribeParams.Feature> features;

  private AccountSubscribeParams(
      List<String> expand,
      Map<String, Object> extraParams,
      List<AccountSubscribeParams.Feature> features) {
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

    private List<AccountSubscribeParams.Feature> features;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountSubscribeParams build() {
      return new AccountSubscribeParams(this.expand, this.extraParams, this.features);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountSubscribeParams#expand} for the field documentation.
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
     * AccountSubscribeParams#expand} for the field documentation.
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
     * AccountSubscribeParams#extraParams} for the field documentation.
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
     * See {@link AccountSubscribeParams#extraParams} for the field documentation.
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
     * AccountSubscribeParams#features} for the field documentation.
     */
    public Builder addFeature(AccountSubscribeParams.Feature element) {
      if (this.features == null) {
        this.features = new ArrayList<>();
      }
      this.features.add(element);
      return this;
    }

    /**
     * Add all elements to `features` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountSubscribeParams#features} for the field documentation.
     */
    public Builder addAllFeature(List<AccountSubscribeParams.Feature> elements) {
      if (this.features == null) {
        this.features = new ArrayList<>();
      }
      this.features.addAll(elements);
      return this;
    }
  }

  public enum Feature implements ApiRequestParams.EnumParam {
    @SerializedName("inferred_balances")
    INFERRED_BALANCES("inferred_balances"),

    @SerializedName("transactions")
    TRANSACTIONS("transactions");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Feature(String value) {
      this.value = value;
    }
  }
}
