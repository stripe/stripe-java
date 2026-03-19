// File generated from our OpenAPI spec
package com.stripe.param.v2.testhelpers;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressCreditParams extends ApiRequestParams {
  /** <strong>Required.</strong> Object containing the amount value and currency to credit. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Open Enum. The network to use in simulating the funds flow. This
   * will be the reflected in the resulting ReceivedCredit.
   */
  @SerializedName("network")
  Network network;

  /**
   * String explaining funds flow. Use this field to populate the statement descriptor of the
   * ReceivedCredit created as an eventual result of this simulation.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private FinancialAddressCreditParams(
      Amount amount, Map<String, Object> extraParams, Network network, String statementDescriptor) {
    this.amount = amount;
    this.extraParams = extraParams;
    this.network = network;
    this.statementDescriptor = statementDescriptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Map<String, Object> extraParams;

    private Network network;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressCreditParams build() {
      return new FinancialAddressCreditParams(
          this.amount, this.extraParams, this.network, this.statementDescriptor);
    }

    /** <strong>Required.</strong> Object containing the amount value and currency to credit. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressCreditParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressCreditParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Open Enum. The network to use in simulating the funds flow. This
     * will be the reflected in the resulting ReceivedCredit.
     */
    public Builder setNetwork(FinancialAddressCreditParams.Network network) {
      this.network = network;
      return this;
    }

    /**
     * String explaining funds flow. Use this field to populate the statement descriptor of the
     * ReceivedCredit created as an eventual result of this simulation.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  public enum Network implements ApiRequestParams.EnumParam {
    @SerializedName("ach")
    ACH("ach"),

    @SerializedName("fps")
    FPS("fps"),

    @SerializedName("rtp")
    RTP("rtp"),

    @SerializedName("sepa_credit_transfer")
    SEPA_CREDIT_TRANSFER("sepa_credit_transfer"),

    @SerializedName("wire")
    WIRE("wire");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Network(String value) {
      this.value = value;
    }
  }
}
