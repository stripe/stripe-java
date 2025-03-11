// File generated from our OpenAPI spec
package com.stripe.param.testhelpers;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TestClockAdvanceParams extends ApiRequestParams {
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
   * <strong>Required.</strong> The time to advance the test clock. Must be after the test clock's
   * current frozen time. Cannot be more than two intervals in the future from the shortest
   * subscription in this test clock. If there are no subscriptions in this test clock, it cannot be
   * more than two years in the future.
   */
  @SerializedName("frozen_time")
  Long frozenTime;

  private TestClockAdvanceParams(
      List<String> expand, Map<String, Object> extraParams, Long frozenTime) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.frozenTime = frozenTime;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long frozenTime;

    /** Finalize and obtain parameter instance from this builder. */
    public TestClockAdvanceParams build() {
      return new TestClockAdvanceParams(this.expand, this.extraParams, this.frozenTime);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TestClockAdvanceParams#expand} for the field documentation.
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
     * TestClockAdvanceParams#expand} for the field documentation.
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
     * TestClockAdvanceParams#extraParams} for the field documentation.
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
     * See {@link TestClockAdvanceParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The time to advance the test clock. Must be after the test clock's
     * current frozen time. Cannot be more than two intervals in the future from the shortest
     * subscription in this test clock. If there are no subscriptions in this test clock, it cannot
     * be more than two years in the future.
     */
    public Builder setFrozenTime(Long frozenTime) {
      this.frozenTime = frozenTime;
      return this;
    }
  }
}
