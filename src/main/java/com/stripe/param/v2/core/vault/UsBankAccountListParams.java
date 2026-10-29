// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class UsBankAccountListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Optionally set the maximum number of results per page. Defaults to 10. */
  @SerializedName("limit")
  Long limit;

  /** Closed Enum. Optionally filter by verification status. */
  @SerializedName("verification_status")
  VerificationStatus verificationStatus;

  private UsBankAccountListParams(
      Map<String, Object> extraParams, Long limit, VerificationStatus verificationStatus) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.verificationStatus = verificationStatus;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private VerificationStatus verificationStatus;

    /** Finalize and obtain parameter instance from this builder. */
    public UsBankAccountListParams build() {
      return new UsBankAccountListParams(this.extraParams, this.limit, this.verificationStatus);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * UsBankAccountListParams#extraParams} for the field documentation.
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
     * See {@link UsBankAccountListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optionally set the maximum number of results per page. Defaults to 10. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Closed Enum. Optionally filter by verification status. */
    public Builder setVerificationStatus(
        UsBankAccountListParams.VerificationStatus verificationStatus) {
      this.verificationStatus = verificationStatus;
      return this;
    }
  }

  public enum VerificationStatus implements ApiRequestParams.EnumParam {
    @SerializedName("awaiting_verification")
    AWAITING_VERIFICATION("awaiting_verification"),

    @SerializedName("unverified")
    UNVERIFIED("unverified"),

    @SerializedName("verification_failed")
    VERIFICATION_FAILED("verification_failed"),

    @SerializedName("verified")
    VERIFIED("verified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    VerificationStatus(String value) {
      this.value = value;
    }
  }
}
