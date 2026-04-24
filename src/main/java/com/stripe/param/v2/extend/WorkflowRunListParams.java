// File generated from our OpenAPI spec
package com.stripe.param.v2.extend;

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
public class WorkflowRunListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Restrict page size to no more than this number. */
  @SerializedName("limit")
  Long limit;

  /**
   * When retrieving Workflow Runs, include only those with the specified status values. If not
   * specified, all Runs are returned.
   */
  @SerializedName("status")
  List<WorkflowRunListParams.Status> status;

  /**
   * When retrieving Workflow Runs, include only those associated with the Workflows specified. If
   * not specified, all Runs are returned.
   */
  @SerializedName("workflow")
  List<String> workflow;

  private WorkflowRunListParams(
      Map<String, Object> extraParams,
      Long limit,
      List<WorkflowRunListParams.Status> status,
      List<String> workflow) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.status = status;
    this.workflow = workflow;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private List<WorkflowRunListParams.Status> status;

    private List<String> workflow;

    /** Finalize and obtain parameter instance from this builder. */
    public WorkflowRunListParams build() {
      return new WorkflowRunListParams(this.extraParams, this.limit, this.status, this.workflow);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * WorkflowRunListParams#extraParams} for the field documentation.
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
     * See {@link WorkflowRunListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Restrict page size to no more than this number. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `status` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WorkflowRunListParams#status} for the field documentation.
     */
    public Builder addStatus(WorkflowRunListParams.Status element) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.add(element);
      return this;
    }

    /**
     * Add all elements to `status` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WorkflowRunListParams#status} for the field documentation.
     */
    public Builder addAllStatus(List<WorkflowRunListParams.Status> elements) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.addAll(elements);
      return this;
    }

    /**
     * Add an element to `workflow` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WorkflowRunListParams#workflow} for the field documentation.
     */
    public Builder addWorkflow(String element) {
      if (this.workflow == null) {
        this.workflow = new ArrayList<>();
      }
      this.workflow.add(element);
      return this;
    }

    /**
     * Add all elements to `workflow` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * WorkflowRunListParams#workflow} for the field documentation.
     */
    public Builder addAllWorkflow(List<String> elements) {
      if (this.workflow == null) {
        this.workflow = new ArrayList<>();
      }
      this.workflow.addAll(elements);
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("started")
    STARTED("started"),

    @SerializedName("succeeded")
    SUCCEEDED("succeeded");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
