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
public class AccountListParams extends ApiRequestParams {
  /**
   * Filter only accounts that have all of the configurations specified. If omitted, returns all
   * accounts regardless of which configurations they have.
   */
  @SerializedName("applied_configurations")
  List<String> appliedConfigurations;

  /**
   * Filter by whether the account is closed. If omitted, returns only Accounts that are not closed.
   */
  @SerializedName("closed")
  Boolean closed;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The upper limit on the number of accounts returned by the List Account request. */
  @SerializedName("limit")
  Long limit;

  private AccountListParams(
      List<String> appliedConfigurations,
      Boolean closed,
      Map<String, Object> extraParams,
      Long limit) {
    this.appliedConfigurations = appliedConfigurations;
    this.closed = closed;
    this.extraParams = extraParams;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> appliedConfigurations;

    private Boolean closed;

    private Map<String, Object> extraParams;

    private Long limit;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountListParams build() {
      return new AccountListParams(
          this.appliedConfigurations, this.closed, this.extraParams, this.limit);
    }

    /**
     * Add an element to `appliedConfigurations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountListParams#appliedConfigurations} for the field documentation.
     */
    public Builder addAppliedConfiguration(String element) {
      if (this.appliedConfigurations == null) {
        this.appliedConfigurations = new ArrayList<>();
      }
      this.appliedConfigurations.add(element);
      return this;
    }

    /**
     * Add all elements to `appliedConfigurations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountListParams#appliedConfigurations} for the field documentation.
     */
    public Builder addAllAppliedConfiguration(List<String> elements) {
      if (this.appliedConfigurations == null) {
        this.appliedConfigurations = new ArrayList<>();
      }
      this.appliedConfigurations.addAll(elements);
      return this;
    }

    /**
     * Filter by whether the account is closed. If omitted, returns only Accounts that are not
     * closed.
     */
    public Builder setClosed(Boolean closed) {
      this.closed = closed;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountListParams#extraParams} for the field documentation.
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
     * See {@link AccountListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The upper limit on the number of accounts returned by the List Account request. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }
  }
}
