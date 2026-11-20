// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
public class DisputeListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Filter results by the ID of the FinancialAccount associated with the dispute. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Maximum number of results to return, between 1 and 100. Defaults to 10. */
  @SerializedName("limit")
  Long limit;

  /** Filter results to Disputes with any of the provided statuses. */
  @SerializedName("statuses")
  List<DisputeListParams.Status> statuses;

  /** Filter results by the ID of the disputed money movement. */
  @SerializedName("target")
  String target;

  private DisputeListParams(
      Map<String, Object> extraParams,
      String financialAccount,
      Long limit,
      List<DisputeListParams.Status> statuses,
      String target) {
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.limit = limit;
    this.statuses = statuses;
    this.target = target;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String financialAccount;

    private Long limit;

    private List<DisputeListParams.Status> statuses;

    private String target;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeListParams build() {
      return new DisputeListParams(
          this.extraParams, this.financialAccount, this.limit, this.statuses, this.target);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeListParams#extraParams} for the field documentation.
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
     * See {@link DisputeListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Filter results by the ID of the FinancialAccount associated with the dispute. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** Maximum number of results to return, between 1 and 100. Defaults to 10. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `statuses` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeListParams#statuses} for the field documentation.
     */
    public Builder addStatus(DisputeListParams.Status element) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.add(element);
      return this;
    }

    /**
     * Add all elements to `statuses` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * DisputeListParams#statuses} for the field documentation.
     */
    public Builder addAllStatus(List<DisputeListParams.Status> elements) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.addAll(elements);
      return this;
    }

    /** Filter results by the ID of the disputed money movement. */
    public Builder setTarget(String target) {
      this.target = target;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("lost")
    LOST("lost"),

    @SerializedName("under_review")
    UNDER_REVIEW("under_review"),

    @SerializedName("won")
    WON("won");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
