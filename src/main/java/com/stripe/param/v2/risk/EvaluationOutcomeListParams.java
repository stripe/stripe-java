// File generated from our OpenAPI spec
package com.stripe.param.v2.risk;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EvaluationOutcomeListParams extends ApiRequestParams {
  /** <strong>Required.</strong> Account selector for the historical outcomes requested. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results per page. Defaults to 10; use 1 for the latest matching outcome. */
  @SerializedName("limit")
  Long limit;

  /** Evaluation origin to filter by. Omit to match all origins. */
  @SerializedName("origin")
  Origin origin;

  /** Evaluation type to filter by. Omit to match all types. */
  @SerializedName("type")
  Type type;

  private EvaluationOutcomeListParams(
      AccountDetails accountDetails,
      Map<String, Object> extraParams,
      Long limit,
      Origin origin,
      Type type) {
    this.accountDetails = accountDetails;
    this.extraParams = extraParams;
    this.limit = limit;
    this.origin = origin;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountDetails accountDetails;

    private Map<String, Object> extraParams;

    private Long limit;

    private Origin origin;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public EvaluationOutcomeListParams build() {
      return new EvaluationOutcomeListParams(
          this.accountDetails, this.extraParams, this.limit, this.origin, this.type);
    }

    /** <strong>Required.</strong> Account selector for the historical outcomes requested. */
    public Builder setAccountDetails(EvaluationOutcomeListParams.AccountDetails accountDetails) {
      this.accountDetails = accountDetails;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EvaluationOutcomeListParams#extraParams} for the field documentation.
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
     * See {@link EvaluationOutcomeListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Maximum number of results per page. Defaults to 10; use 1 for the latest matching outcome.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Evaluation origin to filter by. Omit to match all origins. */
    public Builder setOrigin(EvaluationOutcomeListParams.Origin origin) {
      this.origin = origin;
      return this;
    }

    /** Evaluation type to filter by. Omit to match all types. */
    public Builder setType(EvaluationOutcomeListParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountDetails {
    /** The v2 account ID to list evaluation outcomes for. */
    @SerializedName("account")
    String account;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AccountDetails(String account, Map<String, Object> extraParams) {
      this.account = account;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public EvaluationOutcomeListParams.AccountDetails build() {
        return new EvaluationOutcomeListParams.AccountDetails(this.account, this.extraParams);
      }

      /** The v2 account ID to list evaluation outcomes for. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EvaluationOutcomeListParams.AccountDetails#extraParams} for the field documentation.
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
       * See {@link EvaluationOutcomeListParams.AccountDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum Origin implements ApiRequestParams.EnumParam {
    @SerializedName("rule_outcome")
    RULE_OUTCOME("rule_outcome"),

    @SerializedName("stripe_recommendation")
    STRIPE_RECOMMENDATION("stripe_recommendation");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Origin(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("delinquency")
    DELINQUENCY("delinquency");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
