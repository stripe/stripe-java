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
public class FinancialAccountCloseParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The addresses to forward any incoming transactions to. */
  @SerializedName("forwarding_settings")
  ForwardingSettings forwardingSettings;

  private FinancialAccountCloseParams(
      Map<String, Object> extraParams, ForwardingSettings forwardingSettings) {
    this.extraParams = extraParams;
    this.forwardingSettings = forwardingSettings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private ForwardingSettings forwardingSettings;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountCloseParams build() {
      return new FinancialAccountCloseParams(this.extraParams, this.forwardingSettings);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountCloseParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountCloseParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The addresses to forward any incoming transactions to. */
    public Builder setForwardingSettings(
        FinancialAccountCloseParams.ForwardingSettings forwardingSettings) {
      this.forwardingSettings = forwardingSettings;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ForwardingSettings {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The address to send forwarded payments to. */
    @SerializedName("payment_method")
    String paymentMethod;

    /** The address to send forwarded payouts to. */
    @SerializedName("payout_method")
    String payoutMethod;

    private ForwardingSettings(
        Map<String, Object> extraParams, String paymentMethod, String payoutMethod) {
      this.extraParams = extraParams;
      this.paymentMethod = paymentMethod;
      this.payoutMethod = payoutMethod;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String paymentMethod;

      private String payoutMethod;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountCloseParams.ForwardingSettings build() {
        return new FinancialAccountCloseParams.ForwardingSettings(
            this.extraParams, this.paymentMethod, this.payoutMethod);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountCloseParams.ForwardingSettings#extraParams} for the field documentation.
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
       * See {@link FinancialAccountCloseParams.ForwardingSettings#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The address to send forwarded payments to. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /** The address to send forwarded payouts to. */
      public Builder setPayoutMethod(String payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }
    }
  }
}
