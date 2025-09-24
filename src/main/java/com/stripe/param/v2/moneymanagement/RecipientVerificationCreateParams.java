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
public class RecipientVerificationCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> ID of the payout method. */
  @SerializedName("payout_method")
  String payoutMethod;

  /**
   * ID of the recipient account. Required if the recipient distinct from the sender. Leave empty if
   * the recipient and sender are the same entity (i.e. for me-to-me payouts).
   */
  @SerializedName("recipient")
  String recipient;

  private RecipientVerificationCreateParams(
      Map<String, Object> extraParams, String payoutMethod, String recipient) {
    this.extraParams = extraParams;
    this.payoutMethod = payoutMethod;
    this.recipient = recipient;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String payoutMethod;

    private String recipient;

    /** Finalize and obtain parameter instance from this builder. */
    public RecipientVerificationCreateParams build() {
      return new RecipientVerificationCreateParams(
          this.extraParams, this.payoutMethod, this.recipient);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RecipientVerificationCreateParams#extraParams} for the field documentation.
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
     * See {@link RecipientVerificationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
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
}
