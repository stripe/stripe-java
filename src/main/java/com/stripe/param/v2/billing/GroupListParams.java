// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

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
public class GroupListParams extends ApiRequestParams {
  /** Filter billing groups by Customer ID. Mutually exclusive with test_clock. */
  @SerializedName("customer")
  String customer;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The maximum number of results per page. Defaults to 10. */
  @SerializedName("limit")
  Long limit;

  /** Filter billing groups by lookup keys. You can specify up to 10 lookup keys. */
  @SerializedName("lookup_keys")
  List<String> lookupKeys;

  /** Filter billing groups by TestClock ID. Mutually exclusive with customer. */
  @SerializedName("test_clock")
  String testClock;

  private GroupListParams(
      String customer,
      Map<String, Object> extraParams,
      Long limit,
      List<String> lookupKeys,
      String testClock) {
    this.customer = customer;
    this.extraParams = extraParams;
    this.limit = limit;
    this.lookupKeys = lookupKeys;
    this.testClock = testClock;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<String> lookupKeys;

    private String testClock;

    /** Finalize and obtain parameter instance from this builder. */
    public GroupListParams build() {
      return new GroupListParams(
          this.customer, this.extraParams, this.limit, this.lookupKeys, this.testClock);
    }

    /** Filter billing groups by Customer ID. Mutually exclusive with test_clock. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GroupListParams#extraParams} for the field documentation.
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
     * See {@link GroupListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The maximum number of results per page. Defaults to 10. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * GroupListParams#lookupKeys} for the field documentation.
     */
    public Builder addLookupKey(String element) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.add(element);
      return this;
    }

    /**
     * Add all elements to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * GroupListParams#lookupKeys} for the field documentation.
     */
    public Builder addAllLookupKey(List<String> elements) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.addAll(elements);
      return this;
    }

    /** Filter billing groups by TestClock ID. Mutually exclusive with customer. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }
  }
}
