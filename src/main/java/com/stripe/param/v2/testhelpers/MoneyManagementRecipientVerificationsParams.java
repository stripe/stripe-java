// File generated from our OpenAPI spec
package com.stripe.param.v2.testhelpers;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MoneyManagementRecipientVerificationsParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Expected match level of the RecipientVerification to be created:
   * {@code match}, {@code close_match}, {@code no_match}, {@code unavailable}. For {@code
   * close_match}, the simulated response appends &quot;close_match&quot; to the provided name in
   * match_result_details.matched_name.
   */
  @SerializedName("match_result")
  MatchResult matchResult;

  /** <strong>Required.</strong> ID of the payout method. */
  @SerializedName("payout_method")
  String payoutMethod;

  /**
   * ID of the recipient account. Required if the recipient distinct from the sender. Leave empty if
   * the recipient and sender are the same entity (i.e. for me-to-me payouts).
   */
  @SerializedName("recipient")
  String recipient;

  private MoneyManagementRecipientVerificationsParams(
      Map<String, Object> extraParams,
      MatchResult matchResult,
      String payoutMethod,
      String recipient) {
    this.extraParams = extraParams;
    this.matchResult = matchResult;
    this.payoutMethod = payoutMethod;
    this.recipient = recipient;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private MatchResult matchResult;

    private String payoutMethod;

    private String recipient;

    /** Finalize and obtain parameter instance from this builder. */
    public MoneyManagementRecipientVerificationsParams build() {
      return new MoneyManagementRecipientVerificationsParams(
          this.extraParams, this.matchResult, this.payoutMethod, this.recipient);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MoneyManagementRecipientVerificationsParams#extraParams} for the field documentation.
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
     * See {@link MoneyManagementRecipientVerificationsParams#extraParams} for the field
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
     * <strong>Required.</strong> Expected match level of the RecipientVerification to be created:
     * {@code match}, {@code close_match}, {@code no_match}, {@code unavailable}. For {@code
     * close_match}, the simulated response appends &quot;close_match&quot; to the provided name in
     * match_result_details.matched_name.
     */
    public Builder setMatchResult(
        MoneyManagementRecipientVerificationsParams.MatchResult matchResult) {
      this.matchResult = matchResult;
      return this;
    }

    /** <strong>Required.</strong> ID of the payout method. */
    public Builder setPayoutMethod(String payoutMethod) {
      this.payoutMethod = payoutMethod;
      return this;
    }

    /**
     * ID of the recipient account. Required if the recipient distinct from the sender. Leave empty
     * if the recipient and sender are the same entity (i.e. for me-to-me payouts).
     */
    public Builder setRecipient(String recipient) {
      this.recipient = recipient;
      return this;
    }
  }

  public enum MatchResult implements ApiRequestParams.EnumParam {
    @SerializedName("close_match")
    CLOSE_MATCH("close_match"),

    @SerializedName("match")
    MATCH("match"),

    @SerializedName("no_match")
    NO_MATCH("no_match"),

    @SerializedName("unavailable")
    UNAVAILABLE("unavailable");

    @Getter(onMethod_ = {@Override})
    private final String value;

    MatchResult(String value) {
      this.value = value;
    }
  }
}
