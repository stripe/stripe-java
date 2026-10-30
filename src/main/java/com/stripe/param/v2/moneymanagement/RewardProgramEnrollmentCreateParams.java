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
public class RewardProgramEnrollmentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The connected account to enroll into this RewardProgram. */
  @SerializedName("account")
  String account;

  /** <strong>Required.</strong> Issuing-specific per-enrollment configuration. */
  @SerializedName("card_spend")
  CardSpend cardSpend;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The RewardProgram to enroll into. */
  @SerializedName("reward_program")
  String rewardProgram;

  private RewardProgramEnrollmentCreateParams(
      String account, CardSpend cardSpend, Map<String, Object> extraParams, String rewardProgram) {
    this.account = account;
    this.cardSpend = cardSpend;
    this.extraParams = extraParams;
    this.rewardProgram = rewardProgram;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private CardSpend cardSpend;

    private Map<String, Object> extraParams;

    private String rewardProgram;

    /** Finalize and obtain parameter instance from this builder. */
    public RewardProgramEnrollmentCreateParams build() {
      return new RewardProgramEnrollmentCreateParams(
          this.account, this.cardSpend, this.extraParams, this.rewardProgram);
    }

    /** <strong>Required.</strong> The connected account to enroll into this RewardProgram. */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /** <strong>Required.</strong> Issuing-specific per-enrollment configuration. */
    public Builder setCardSpend(RewardProgramEnrollmentCreateParams.CardSpend cardSpend) {
      this.cardSpend = cardSpend;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RewardProgramEnrollmentCreateParams#extraParams} for the field documentation.
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
     * See {@link RewardProgramEnrollmentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The RewardProgram to enroll into. */
    public Builder setRewardProgram(String rewardProgram) {
      this.rewardProgram = rewardProgram;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CardSpend {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The Issuer Program for this connected account. Immutable after
     * creation.
     */
    @SerializedName("issuer_program")
    String issuerProgram;

    private CardSpend(Map<String, Object> extraParams, String issuerProgram) {
      this.extraParams = extraParams;
      this.issuerProgram = issuerProgram;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String issuerProgram;

      /** Finalize and obtain parameter instance from this builder. */
      public RewardProgramEnrollmentCreateParams.CardSpend build() {
        return new RewardProgramEnrollmentCreateParams.CardSpend(
            this.extraParams, this.issuerProgram);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RewardProgramEnrollmentCreateParams.CardSpend#extraParams} for the field documentation.
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
       * See {@link RewardProgramEnrollmentCreateParams.CardSpend#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The Issuer Program for this connected account. Immutable after
       * creation.
       */
      public Builder setIssuerProgram(String issuerProgram) {
        this.issuerProgram = issuerProgram;
        return this;
      }
    }
  }
}
