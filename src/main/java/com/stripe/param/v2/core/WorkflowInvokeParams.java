// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class WorkflowInvokeParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Parameters used to invoke the Workflow Run. */
  @SerializedName("input_parameters")
  Map<String, Object> inputParameters;

  private WorkflowInvokeParams(
      Map<String, Object> extraParams, Map<String, Object> inputParameters) {
    this.extraParams = extraParams;
    this.inputParameters = inputParameters;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Map<String, Object> inputParameters;

    /** Finalize and obtain parameter instance from this builder. */
    public WorkflowInvokeParams build() {
      return new WorkflowInvokeParams(this.extraParams, this.inputParameters);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * WorkflowInvokeParams#extraParams} for the field documentation.
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
     * See {@link WorkflowInvokeParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `inputParameters` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link WorkflowInvokeParams#inputParameters} for the field documentation.
     */
    public Builder putInputParameter(String key, Object value) {
      if (this.inputParameters == null) {
        this.inputParameters = new HashMap<>();
      }
      this.inputParameters.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `inputParameters` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link WorkflowInvokeParams#inputParameters} for the field documentation.
     */
    public Builder putAllInputParameter(Map<String, Object> map) {
      if (this.inputParameters == null) {
        this.inputParameters = new HashMap<>();
      }
      this.inputParameters.putAll(map);
      return this;
    }
  }
}
