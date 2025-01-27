// File generated from our OpenAPI spec
package com.stripe.param.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class FinancialAccountCloseParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A different bank account where funds can be deposited/debited in order to get the closing FA's
   * balance to $0.
   */
  @SerializedName("forwarding_settings")
  ForwardingSettings forwardingSettings;

  private FinancialAccountCloseParams(
      List<String> expand, Map<String, Object> extraParams, ForwardingSettings forwardingSettings) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.forwardingSettings = forwardingSettings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private ForwardingSettings forwardingSettings;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountCloseParams build() {
      return new FinancialAccountCloseParams(
          this.expand, this.extraParams, this.forwardingSettings);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountCloseParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountCloseParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
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

    /**
     * A different bank account where funds can be deposited/debited in order to get the closing
     * FA's balance to $0.
     */
    public Builder setForwardingSettings(
        FinancialAccountCloseParams.ForwardingSettings forwardingSettings) {
      this.forwardingSettings = forwardingSettings;
      return this;
    }
  }

  @Getter
  public static class ForwardingSettings {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The financial_account id. */
    @SerializedName("financial_account")
    String financialAccount;

    /** The payment_method or bank account id. This needs to be a verified bank account. */
    @SerializedName("payment_method")
    String paymentMethod;

    /**
     * <strong>Required.</strong> The type of the bank account provided. This can be either
     * &quot;financial_account&quot; or &quot;payment_method&quot;
     */
    @SerializedName("type")
    Type type;

    private ForwardingSettings(
        Map<String, Object> extraParams, String financialAccount, String paymentMethod, Type type) {
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.paymentMethod = paymentMethod;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String financialAccount;

      private String paymentMethod;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountCloseParams.ForwardingSettings build() {
        return new FinancialAccountCloseParams.ForwardingSettings(
            this.extraParams, this.financialAccount, this.paymentMethod, this.type);
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

      /** The financial_account id. */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /** The payment_method or bank account id. This needs to be a verified bank account. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the bank account provided. This can be either
       * &quot;financial_account&quot; or &quot;payment_method&quot;
       */
      public Builder setType(FinancialAccountCloseParams.ForwardingSettings.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("financial_account")
      FINANCIAL_ACCOUNT("financial_account"),

      @SerializedName("payment_method")
      PAYMENT_METHOD("payment_method");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
