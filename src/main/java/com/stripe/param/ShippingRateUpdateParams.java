// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ShippingRateUpdateParams extends ApiRequestParams {
  /** Whether the shipping rate can be used for new purchases. Defaults to {@code true}. */
  @SerializedName("active")
  Boolean active;

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
   * Describes a fixed amount to charge for shipping. Must be present if type is {@code
   * fixed_amount}.
   */
  @SerializedName("fixed_amount")
  FixedAmount fixedAmount;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
   * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  private ShippingRateUpdateParams(
      Boolean active,
      List<String> expand,
      Map<String, Object> extraParams,
      FixedAmount fixedAmount,
      Object metadata,
      TaxBehavior taxBehavior) {
    this.active = active;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fixedAmount = fixedAmount;
    this.metadata = metadata;
    this.taxBehavior = taxBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FixedAmount fixedAmount;

    private Object metadata;

    private TaxBehavior taxBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public ShippingRateUpdateParams build() {
      return new ShippingRateUpdateParams(
          this.active,
          this.expand,
          this.extraParams,
          this.fixedAmount,
          this.metadata,
          this.taxBehavior);
    }

    /** Whether the shipping rate can be used for new purchases. Defaults to {@code true}. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ShippingRateUpdateParams#expand} for the field documentation.
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
     * ShippingRateUpdateParams#expand} for the field documentation.
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
     * ShippingRateUpdateParams#extraParams} for the field documentation.
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
     * See {@link ShippingRateUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Describes a fixed amount to charge for shipping. Must be present if type is {@code
     * fixed_amount}.
     */
    public Builder setFixedAmount(ShippingRateUpdateParams.FixedAmount fixedAmount) {
      this.fixedAmount = fixedAmount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ShippingRateUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ShippingRateUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
     * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
     */
    public Builder setTaxBehavior(ShippingRateUpdateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FixedAmount {
    /**
     * Shipping rates defined in each available currency option. Each key must be a three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
     * href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency_options")
    Map<String, ShippingRateUpdateParams.FixedAmount.CurrencyOption> currencyOptions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private FixedAmount(
        Map<String, ShippingRateUpdateParams.FixedAmount.CurrencyOption> currencyOptions,
        Map<String, Object> extraParams) {
      this.currencyOptions = currencyOptions;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, ShippingRateUpdateParams.FixedAmount.CurrencyOption> currencyOptions;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ShippingRateUpdateParams.FixedAmount build() {
        return new ShippingRateUpdateParams.FixedAmount(this.currencyOptions, this.extraParams);
      }

      /**
       * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ShippingRateUpdateParams.FixedAmount#currencyOptions} for the field
       * documentation.
       */
      public Builder putCurrencyOption(
          String key, ShippingRateUpdateParams.FixedAmount.CurrencyOption value) {
        if (this.currencyOptions == null) {
          this.currencyOptions = new HashMap<>();
        }
        this.currencyOptions.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ShippingRateUpdateParams.FixedAmount#currencyOptions} for the field
       * documentation.
       */
      public Builder putAllCurrencyOption(
          Map<String, ShippingRateUpdateParams.FixedAmount.CurrencyOption> map) {
        if (this.currencyOptions == null) {
          this.currencyOptions = new HashMap<>();
        }
        this.currencyOptions.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ShippingRateUpdateParams.FixedAmount#extraParams} for the field documentation.
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
       * See {@link ShippingRateUpdateParams.FixedAmount#extraParams} for the field documentation.
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
    public static class CurrencyOption {
      /** A non-negative integer in cents representing how much to charge. */
      @SerializedName("amount")
      Long amount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      private CurrencyOption(
          Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
        this.amount = amount;
        this.extraParams = extraParams;
        this.taxBehavior = taxBehavior;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private Map<String, Object> extraParams;

        private TaxBehavior taxBehavior;

        /** Finalize and obtain parameter instance from this builder. */
        public ShippingRateUpdateParams.FixedAmount.CurrencyOption build() {
          return new ShippingRateUpdateParams.FixedAmount.CurrencyOption(
              this.amount, this.extraParams, this.taxBehavior);
        }

        /** A non-negative integer in cents representing how much to charge. */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ShippingRateUpdateParams.FixedAmount.CurrencyOption#extraParams} for the
         * field documentation.
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
         * map. See {@link ShippingRateUpdateParams.FixedAmount.CurrencyOption#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
         * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        public Builder setTaxBehavior(
            ShippingRateUpdateParams.FixedAmount.CurrencyOption.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum TaxBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("exclusive")
    EXCLUSIVE("exclusive"),

    @SerializedName("inclusive")
    INCLUSIVE("inclusive"),

    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxBehavior(String value) {
      this.value = value;
    }
  }
}
