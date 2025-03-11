// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ReaderProcessSetupIntentParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> This field indicates whether this payment method can be shown again
   * to its customer in a checkout flow. Stripe products such as Checkout and Elements use this
   * field to determine whether a payment method can be shown as a saved payment method in a
   * checkout flow.
   */
  @SerializedName("allow_redisplay")
  AllowRedisplay allowRedisplay;

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

  /** Configuration overrides. */
  @SerializedName("process_config")
  ProcessConfig processConfig;

  /** <strong>Required.</strong> SetupIntent ID */
  @SerializedName("setup_intent")
  String setupIntent;

  private ReaderProcessSetupIntentParams(
      AllowRedisplay allowRedisplay,
      List<String> expand,
      Map<String, Object> extraParams,
      ProcessConfig processConfig,
      String setupIntent) {
    this.allowRedisplay = allowRedisplay;
    this.expand = expand;
    this.extraParams = extraParams;
    this.processConfig = processConfig;
    this.setupIntent = setupIntent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AllowRedisplay allowRedisplay;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private ProcessConfig processConfig;

    private String setupIntent;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderProcessSetupIntentParams build() {
      return new ReaderProcessSetupIntentParams(
          this.allowRedisplay, this.expand, this.extraParams, this.processConfig, this.setupIntent);
    }

    /**
     * <strong>Required.</strong> This field indicates whether this payment method can be shown
     * again to its customer in a checkout flow. Stripe products such as Checkout and Elements use
     * this field to determine whether a payment method can be shown as a saved payment method in a
     * checkout flow.
     */
    public Builder setAllowRedisplay(ReaderProcessSetupIntentParams.AllowRedisplay allowRedisplay) {
      this.allowRedisplay = allowRedisplay;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderProcessSetupIntentParams#expand} for the field documentation.
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
     * ReaderProcessSetupIntentParams#expand} for the field documentation.
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
     * ReaderProcessSetupIntentParams#extraParams} for the field documentation.
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
     * See {@link ReaderProcessSetupIntentParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Configuration overrides. */
    public Builder setProcessConfig(ReaderProcessSetupIntentParams.ProcessConfig processConfig) {
      this.processConfig = processConfig;
      return this;
    }

    /** <strong>Required.</strong> SetupIntent ID */
    public Builder setSetupIntent(String setupIntent) {
      this.setupIntent = setupIntent;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ProcessConfig {
    /** Enables cancel button on transaction screens. */
    @SerializedName("enable_customer_cancellation")
    Boolean enableCustomerCancellation;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ProcessConfig(Boolean enableCustomerCancellation, Map<String, Object> extraParams) {
      this.enableCustomerCancellation = enableCustomerCancellation;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enableCustomerCancellation;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderProcessSetupIntentParams.ProcessConfig build() {
        return new ReaderProcessSetupIntentParams.ProcessConfig(
            this.enableCustomerCancellation, this.extraParams);
      }

      /** Enables cancel button on transaction screens. */
      public Builder setEnableCustomerCancellation(Boolean enableCustomerCancellation) {
        this.enableCustomerCancellation = enableCustomerCancellation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderProcessSetupIntentParams.ProcessConfig#extraParams} for the field documentation.
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
       * See {@link ReaderProcessSetupIntentParams.ProcessConfig#extraParams} for the field
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

  public enum AllowRedisplay implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("limited")
    LIMITED("limited"),

    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AllowRedisplay(String value) {
      this.value = value;
    }
  }
}
