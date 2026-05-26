// File generated from our OpenAPI spec
package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CustomerEvaluationUpdateParams extends ApiRequestParams {
  /** The ID of a Customer to attach to an entity-less registration evaluation. */
  @SerializedName("customer")
  Object customer;

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

  /** The outcome status of the evaluation: allowed, restricted, or blocked. */
  @SerializedName("status")
  Status status;

  private CustomerEvaluationUpdateParams(
      Object customer, List<String> expand, Map<String, Object> extraParams, Status status) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerEvaluationUpdateParams build() {
      return new CustomerEvaluationUpdateParams(
          this.customer, this.expand, this.extraParams, this.status);
    }

    /** The ID of a Customer to attach to an entity-less registration evaluation. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The ID of a Customer to attach to an entity-less registration evaluation. */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerEvaluationUpdateParams#expand} for the field documentation.
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
     * CustomerEvaluationUpdateParams#expand} for the field documentation.
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
     * CustomerEvaluationUpdateParams#extraParams} for the field documentation.
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
     * See {@link CustomerEvaluationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The outcome status of the evaluation: allowed, restricted, or blocked. */
    public Builder setStatus(CustomerEvaluationUpdateParams.Status status) {
      this.status = status;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("allowed")
    ALLOWED("allowed"),

    @SerializedName("blocked")
    BLOCKED("blocked"),

    @SerializedName("restricted")
    RESTRICTED("restricted");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
