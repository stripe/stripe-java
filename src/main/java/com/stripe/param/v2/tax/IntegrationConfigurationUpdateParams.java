// File generated from our OpenAPI spec
package com.stripe.param.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class IntegrationConfigurationUpdateParams extends ApiRequestParams {
  /** Configuration for Checkout Sessions automatic tax behavior. */
  @SerializedName("checkout_sessions")
  CheckoutSessions checkoutSessions;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private IntegrationConfigurationUpdateParams(
      CheckoutSessions checkoutSessions, Map<String, Object> extraParams) {
    this.checkoutSessions = checkoutSessions;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CheckoutSessions checkoutSessions;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public IntegrationConfigurationUpdateParams build() {
      return new IntegrationConfigurationUpdateParams(this.checkoutSessions, this.extraParams);
    }

    /** Configuration for Checkout Sessions automatic tax behavior. */
    public Builder setCheckoutSessions(
        IntegrationConfigurationUpdateParams.CheckoutSessions checkoutSessions) {
      this.checkoutSessions = checkoutSessions;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * IntegrationConfigurationUpdateParams#extraParams} for the field documentation.
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
     * See {@link IntegrationConfigurationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CheckoutSessions {
    /**
     * <strong>Required.</strong> Controls the default value of automatic_tax[enabled] on new
     * Checkout Sessions.
     */
    @SerializedName("automatic_tax_default_value")
    AutomaticTaxDefaultValue automaticTaxDefaultValue;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CheckoutSessions(
        AutomaticTaxDefaultValue automaticTaxDefaultValue, Map<String, Object> extraParams) {
      this.automaticTaxDefaultValue = automaticTaxDefaultValue;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AutomaticTaxDefaultValue automaticTaxDefaultValue;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public IntegrationConfigurationUpdateParams.CheckoutSessions build() {
        return new IntegrationConfigurationUpdateParams.CheckoutSessions(
            this.automaticTaxDefaultValue, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Controls the default value of automatic_tax[enabled] on new
       * Checkout Sessions.
       */
      public Builder setAutomaticTaxDefaultValue(
          IntegrationConfigurationUpdateParams.CheckoutSessions.AutomaticTaxDefaultValue
              automaticTaxDefaultValue) {
        this.automaticTaxDefaultValue = automaticTaxDefaultValue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IntegrationConfigurationUpdateParams.CheckoutSessions#extraParams} for the field
       * documentation.
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
       * See {@link IntegrationConfigurationUpdateParams.CheckoutSessions#extraParams} for the field
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

    public enum AutomaticTaxDefaultValue implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled_when_possible")
      ENABLED_WHEN_POSSIBLE("enabled_when_possible");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AutomaticTaxDefaultValue(String value) {
        this.value = value;
      }
    }
  }
}
