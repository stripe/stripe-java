// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CustomerCashBalanceUpdateParams extends ApiRequestParams {
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

  /** A hash of settings for this cash balance. */
  @SerializedName("settings")
  Settings settings;

  private CustomerCashBalanceUpdateParams(
      List<String> expand, Map<String, Object> extraParams, Settings settings) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.settings = settings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Settings settings;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerCashBalanceUpdateParams build() {
      return new CustomerCashBalanceUpdateParams(this.expand, this.extraParams, this.settings);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerCashBalanceUpdateParams#expand} for the field documentation.
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
     * CustomerCashBalanceUpdateParams#expand} for the field documentation.
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
     * CustomerCashBalanceUpdateParams#extraParams} for the field documentation.
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
     * See {@link CustomerCashBalanceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** A hash of settings for this cash balance. */
    public Builder setSettings(CustomerCashBalanceUpdateParams.Settings settings) {
      this.settings = settings;
      return this;
    }
  }

  @Getter
  public static class Settings {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Controls how funds transferred by the customer are applied to payment intents and invoices.
     * Valid options are {@code automatic}, {@code manual}, or {@code merchant_default}. For more
     * information about these reconciliation modes, see <a
     * href="https://stripe.com/docs/payments/customer-balance/reconciliation">Reconciliation</a>.
     */
    @SerializedName("reconciliation_mode")
    ReconciliationMode reconciliationMode;

    private Settings(Map<String, Object> extraParams, ReconciliationMode reconciliationMode) {
      this.extraParams = extraParams;
      this.reconciliationMode = reconciliationMode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private ReconciliationMode reconciliationMode;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerCashBalanceUpdateParams.Settings build() {
        return new CustomerCashBalanceUpdateParams.Settings(
            this.extraParams, this.reconciliationMode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCashBalanceUpdateParams.Settings#extraParams} for the field documentation.
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
       * See {@link CustomerCashBalanceUpdateParams.Settings#extraParams} for the field
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
       * Controls how funds transferred by the customer are applied to payment intents and invoices.
       * Valid options are {@code automatic}, {@code manual}, or {@code merchant_default}. For more
       * information about these reconciliation modes, see <a
       * href="https://stripe.com/docs/payments/customer-balance/reconciliation">Reconciliation</a>.
       */
      public Builder setReconciliationMode(
          CustomerCashBalanceUpdateParams.Settings.ReconciliationMode reconciliationMode) {
        this.reconciliationMode = reconciliationMode;
        return this;
      }
    }

    public enum ReconciliationMode implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("manual")
      MANUAL("manual"),

      @SerializedName("merchant_default")
      MERCHANT_DEFAULT("merchant_default");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ReconciliationMode(String value) {
        this.value = value;
      }
    }
  }
}
