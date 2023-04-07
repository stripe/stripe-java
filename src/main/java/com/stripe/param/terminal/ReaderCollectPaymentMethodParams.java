// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReaderCollectPaymentMethodParams extends ApiRequestParams {
  /** Configuration overrides. */
  @SerializedName("collect_config")
  CollectConfig collectConfig;

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

  /** <strong>Required.</strong> PaymentIntent ID */
  @SerializedName("payment_intent")
  String paymentIntent;

  private ReaderCollectPaymentMethodParams(
      CollectConfig collectConfig,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentIntent) {
    this.collectConfig = collectConfig;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CollectConfig collectConfig;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentIntent;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderCollectPaymentMethodParams build() {
      return new ReaderCollectPaymentMethodParams(
          this.collectConfig, this.expand, this.extraParams, this.paymentIntent);
    }

    /** Configuration overrides. */
    public Builder setCollectConfig(ReaderCollectPaymentMethodParams.CollectConfig collectConfig) {
      this.collectConfig = collectConfig;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderCollectPaymentMethodParams#expand} for the field documentation.
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
     * ReaderCollectPaymentMethodParams#expand} for the field documentation.
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
     * ReaderCollectPaymentMethodParams#extraParams} for the field documentation.
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
     * See {@link ReaderCollectPaymentMethodParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> PaymentIntent ID */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }
  }

  @Getter
  public static class CollectConfig {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Override showing a tipping selection screen on this transaction. */
    @SerializedName("skip_tipping")
    Boolean skipTipping;

    /** Tipping configuration for this transaction. */
    @SerializedName("tipping")
    Tipping tipping;

    private CollectConfig(Map<String, Object> extraParams, Boolean skipTipping, Tipping tipping) {
      this.extraParams = extraParams;
      this.skipTipping = skipTipping;
      this.tipping = tipping;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Boolean skipTipping;

      private Tipping tipping;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderCollectPaymentMethodParams.CollectConfig build() {
        return new ReaderCollectPaymentMethodParams.CollectConfig(
            this.extraParams, this.skipTipping, this.tipping);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderCollectPaymentMethodParams.CollectConfig#extraParams} for the field documentation.
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
       * See {@link ReaderCollectPaymentMethodParams.CollectConfig#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Override showing a tipping selection screen on this transaction. */
      public Builder setSkipTipping(Boolean skipTipping) {
        this.skipTipping = skipTipping;
        return this;
      }

      /** Tipping configuration for this transaction. */
      public Builder setTipping(ReaderCollectPaymentMethodParams.CollectConfig.Tipping tipping) {
        this.tipping = tipping;
        return this;
      }
    }

    @Getter
    public static class Tipping {
      /**
       * Amount used to calculate tip suggestions on tipping selection screen for this transaction.
       * Must be a positive integer in the smallest currency unit (e.g., 100 cents to represent
       * $1.00 or 100 to represent ¥100, a zero-decimal currency).
       */
      @SerializedName("amount_eligible")
      Long amountEligible;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Tipping(Long amountEligible, Map<String, Object> extraParams) {
        this.amountEligible = amountEligible;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amountEligible;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ReaderCollectPaymentMethodParams.CollectConfig.Tipping build() {
          return new ReaderCollectPaymentMethodParams.CollectConfig.Tipping(
              this.amountEligible, this.extraParams);
        }

        /**
         * Amount used to calculate tip suggestions on tipping selection screen for this
         * transaction. Must be a positive integer in the smallest currency unit (e.g., 100 cents to
         * represent $1.00 or 100 to represent ¥100, a zero-decimal currency).
         */
        public Builder setAmountEligible(Long amountEligible) {
          this.amountEligible = amountEligible;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderCollectPaymentMethodParams.CollectConfig.Tipping#extraParams} for
         * the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderCollectPaymentMethodParams.CollectConfig.Tipping#extraParams} for
         * the field documentation.
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
  }
}
