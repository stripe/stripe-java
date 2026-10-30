// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RewardProgramEnrollmentListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return. Default: 10. Valid range: 1-100. */
  @SerializedName("limit")
  Long limit;

  /**
   * Filter by RewardProgram. Omitting this field returns platform-wide enrollments across all
   * RewardPrograms.
   */
  @SerializedName("reward_program")
  String rewardProgram;

  /** Filter by RewardProgramEnrollment status. */
  @SerializedName("status")
  Status status;

  private RewardProgramEnrollmentListParams(
      Map<String, Object> extraParams, Long limit, String rewardProgram, Status status) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.rewardProgram = rewardProgram;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private String rewardProgram;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public RewardProgramEnrollmentListParams build() {
      return new RewardProgramEnrollmentListParams(
          this.extraParams, this.limit, this.rewardProgram, this.status);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RewardProgramEnrollmentListParams#extraParams} for the field documentation.
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
     * See {@link RewardProgramEnrollmentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return. Default: 10. Valid range: 1-100. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Filter by RewardProgram. Omitting this field returns platform-wide enrollments across all
     * RewardPrograms.
     */
    public Builder setRewardProgram(String rewardProgram) {
      this.rewardProgram = rewardProgram;
      return this;
    }

    /** Filter by RewardProgramEnrollment status. */
    public Builder setStatus(RewardProgramEnrollmentListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
