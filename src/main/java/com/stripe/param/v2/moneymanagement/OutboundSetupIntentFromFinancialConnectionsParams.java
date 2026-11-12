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
public class OutboundSetupIntentFromFinancialConnectionsParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Used to create a US Bank Account directly from a Financial Connections Account. */
  @SerializedName("financial_connections_account")
  String financialConnectionsAccount;

  /**
   * Used to create a US Bank Account from the internal-only &quot;payment account&quot; associated
   * with a Financial Connections Session. Only useful when the Session completed with manual entry
   * (i.e. there is no Financial Connections Account).
   */
  @SerializedName("financial_connections_session")
  String financialConnectionsSession;

  /**
   * Specify which type of outbound money movement this credential should be set up for (payment |
   * transfer). If not provided, defaults to payment.
   */
  @SerializedName("usage_intent")
  UsageIntent usageIntent;

  private OutboundSetupIntentFromFinancialConnectionsParams(
      Map<String, Object> extraParams,
      String financialConnectionsAccount,
      String financialConnectionsSession,
      UsageIntent usageIntent) {
    this.extraParams = extraParams;
    this.financialConnectionsAccount = financialConnectionsAccount;
    this.financialConnectionsSession = financialConnectionsSession;
    this.usageIntent = usageIntent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String financialConnectionsAccount;

    private String financialConnectionsSession;

    private UsageIntent usageIntent;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundSetupIntentFromFinancialConnectionsParams build() {
      return new OutboundSetupIntentFromFinancialConnectionsParams(
          this.extraParams,
          this.financialConnectionsAccount,
          this.financialConnectionsSession,
          this.usageIntent);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundSetupIntentFromFinancialConnectionsParams#extraParams} for the field documentation.
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
     * See {@link OutboundSetupIntentFromFinancialConnectionsParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Used to create a US Bank Account directly from a Financial Connections Account. */
    public Builder setFinancialConnectionsAccount(String financialConnectionsAccount) {
      this.financialConnectionsAccount = financialConnectionsAccount;
      return this;
    }

    /**
     * Used to create a US Bank Account from the internal-only &quot;payment account&quot;
     * associated with a Financial Connections Session. Only useful when the Session completed with
     * manual entry (i.e. there is no Financial Connections Account).
     */
    public Builder setFinancialConnectionsSession(String financialConnectionsSession) {
      this.financialConnectionsSession = financialConnectionsSession;
      return this;
    }

    /**
     * Specify which type of outbound money movement this credential should be set up for (payment |
     * transfer). If not provided, defaults to payment.
     */
    public Builder setUsageIntent(
        OutboundSetupIntentFromFinancialConnectionsParams.UsageIntent usageIntent) {
      this.usageIntent = usageIntent;
      return this;
    }
  }

  public enum UsageIntent implements ApiRequestParams.EnumParam {
    @SerializedName("payment")
    PAYMENT("payment"),

    @SerializedName("transfer")
    TRANSFER("transfer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    UsageIntent(String value) {
      this.value = value;
    }
  }
}
