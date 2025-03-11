// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PriceUpdateParams extends ApiRequestParams {
  /** Whether the price can be used for new purchases. Defaults to {@code true}. */
  @SerializedName("active")
  Boolean active;

  /**
   * Prices defined in each available currency option. Each key must be a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  Object currencyOptions;

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
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** A brief description of the price, hidden from customers. */
  @SerializedName("nickname")
  Object nickname;

  /**
   * Only required if a <a
   * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
   * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
   * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
   * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
   * exclusive}, it cannot be changed.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /**
   * If set to true, will atomically remove the lookup key from the existing price, and assign it to
   * this price.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  private PriceUpdateParams(
      Boolean active,
      Object currencyOptions,
      List<String> expand,
      Map<String, Object> extraParams,
      Object lookupKey,
      Object metadata,
      Object nickname,
      TaxBehavior taxBehavior,
      Boolean transferLookupKey) {
    this.active = active;
    this.currencyOptions = currencyOptions;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.nickname = nickname;
    this.taxBehavior = taxBehavior;
    this.transferLookupKey = transferLookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object currencyOptions;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Object metadata;

    private Object nickname;

    private TaxBehavior taxBehavior;

    private Boolean transferLookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public PriceUpdateParams build() {
      return new PriceUpdateParams(
          this.active,
          this.currencyOptions,
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.nickname,
          this.taxBehavior,
          this.transferLookupKey);
    }

    /** Whether the price can be used for new purchases. Defaults to {@code true}. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PriceUpdateParams#currencyOptions} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putCurrencyOption(String key, PriceUpdateParams.CurrencyOption value) {
      if (this.currencyOptions == null || this.currencyOptions instanceof EmptyParam) {
        this.currencyOptions = new HashMap<String, PriceUpdateParams.CurrencyOption>();
      }
      ((Map<String, PriceUpdateParams.CurrencyOption>) this.currencyOptions).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PriceUpdateParams#currencyOptions} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllCurrencyOption(Map<String, PriceUpdateParams.CurrencyOption> map) {
      if (this.currencyOptions == null || this.currencyOptions instanceof EmptyParam) {
        this.currencyOptions = new HashMap<String, PriceUpdateParams.CurrencyOption>();
      }
      ((Map<String, PriceUpdateParams.CurrencyOption>) this.currencyOptions).putAll(map);
      return this;
    }

    /**
     * Prices defined in each available currency option. Each key must be a three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
     * href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrencyOptions(EmptyParam currencyOptions) {
      this.currencyOptions = currencyOptions;
      return this;
    }

    /**
     * Prices defined in each available currency option. Each key must be a three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
     * href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrencyOptions(
        Map<String, PriceUpdateParams.CurrencyOption> currencyOptions) {
      this.currencyOptions = currencyOptions;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceUpdateParams#expand} for the field documentation.
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
     * PriceUpdateParams#expand} for the field documentation.
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
     * PriceUpdateParams#extraParams} for the field documentation.
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
     * See {@link PriceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
     * characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PriceUpdateParams#metadata} for the field documentation.
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
     * See {@link PriceUpdateParams#metadata} for the field documentation.
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** A brief description of the price, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** A brief description of the price, hidden from customers. */
    public Builder setNickname(EmptyParam nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    public Builder setTaxBehavior(PriceUpdateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * If set to true, will atomically remove the lookup key from the existing price, and assign it
     * to this price.
     */
    public Builder setTransferLookupKey(Boolean transferLookupKey) {
      this.transferLookupKey = transferLookupKey;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyOption {
    /**
     * When set, provides configuration for the amount to be adjusted by the customer during
     * Checkout Sessions and Payment Links.
     */
    @SerializedName("custom_unit_amount")
    CustomUnitAmount customUnitAmount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /**
     * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be
     * set to {@code tiered}. See also the documentation for {@code billing_scheme}.
     */
    @SerializedName("tiers")
    List<PriceUpdateParams.CurrencyOption.Tier> tiers;

    /**
     * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
     * much to charge.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    @SerializedName("unit_amount_decimal")
    Object unitAmountDecimal;

    private CurrencyOption(
        CustomUnitAmount customUnitAmount,
        Map<String, Object> extraParams,
        TaxBehavior taxBehavior,
        List<PriceUpdateParams.CurrencyOption.Tier> tiers,
        Long unitAmount,
        Object unitAmountDecimal) {
      this.customUnitAmount = customUnitAmount;
      this.extraParams = extraParams;
      this.taxBehavior = taxBehavior;
      this.tiers = tiers;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CustomUnitAmount customUnitAmount;

      private Map<String, Object> extraParams;

      private TaxBehavior taxBehavior;

      private List<PriceUpdateParams.CurrencyOption.Tier> tiers;

      private Long unitAmount;

      private Object unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceUpdateParams.CurrencyOption build() {
        return new PriceUpdateParams.CurrencyOption(
            this.customUnitAmount,
            this.extraParams,
            this.taxBehavior,
            this.tiers,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /**
       * When set, provides configuration for the amount to be adjusted by the customer during
       * Checkout Sessions and Payment Links.
       */
      public Builder setCustomUnitAmount(
          PriceUpdateParams.CurrencyOption.CustomUnitAmount customUnitAmount) {
        this.customUnitAmount = customUnitAmount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceUpdateParams.CurrencyOption#extraParams} for the field documentation.
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
       * See {@link PriceUpdateParams.CurrencyOption#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(PriceUpdateParams.CurrencyOption.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * PriceUpdateParams.CurrencyOption#tiers} for the field documentation.
       */
      public Builder addTier(PriceUpdateParams.CurrencyOption.Tier element) {
        if (this.tiers == null) {
          this.tiers = new ArrayList<>();
        }
        this.tiers.add(element);
        return this;
      }

      /**
       * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PriceUpdateParams.CurrencyOption#tiers} for the field documentation.
       */
      public Builder addAllTier(List<PriceUpdateParams.CurrencyOption.Tier> elements) {
        if (this.tiers == null) {
          this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(elements);
        return this;
      }

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomUnitAmount {
      /**
       * <strong>Required.</strong> Pass in {@code true} to enable {@code custom_unit_amount},
       * otherwise omit {@code custom_unit_amount}.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The maximum unit amount the customer can specify for this item. */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum unit amount the customer can specify for this item. Must be at least the
       * minimum charge amount.
       */
      @SerializedName("minimum")
      Long minimum;

      /** The starting unit amount which can be updated by the customer. */
      @SerializedName("preset")
      Long preset;

      private CustomUnitAmount(
          Boolean enabled,
          Map<String, Object> extraParams,
          Long maximum,
          Long minimum,
          Long preset) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.maximum = maximum;
        this.minimum = minimum;
        this.preset = preset;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Long maximum;

        private Long minimum;

        private Long preset;

        /** Finalize and obtain parameter instance from this builder. */
        public PriceUpdateParams.CurrencyOption.CustomUnitAmount build() {
          return new PriceUpdateParams.CurrencyOption.CustomUnitAmount(
              this.enabled, this.extraParams, this.maximum, this.minimum, this.preset);
        }

        /**
         * <strong>Required.</strong> Pass in {@code true} to enable {@code custom_unit_amount},
         * otherwise omit {@code custom_unit_amount}.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PriceUpdateParams.CurrencyOption.CustomUnitAmount#extraParams} for the
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
         * map. See {@link PriceUpdateParams.CurrencyOption.CustomUnitAmount#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The maximum unit amount the customer can specify for this item. */
        public Builder setMaximum(Long maximum) {
          this.maximum = maximum;
          return this;
        }

        /**
         * The minimum unit amount the customer can specify for this item. Must be at least the
         * minimum charge amount.
         */
        public Builder setMinimum(Long minimum) {
          this.minimum = minimum;
          return this;
        }

        /** The starting unit amount which can be updated by the customer. */
        public Builder setPreset(Long preset) {
          this.preset = preset;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Tier {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The flat billing amount for an entire tier, regardless of the number of units in the tier.
       */
      @SerializedName("flat_amount")
      Long flatAmount;

      /**
       * Same as {@code flat_amount}, but accepts a decimal value representing an integer in the
       * minor units of the currency. Only one of {@code flat_amount} and {@code
       * flat_amount_decimal} can be set.
       */
      @SerializedName("flat_amount_decimal")
      Object flatAmountDecimal;

      /** The per unit billing amount for each individual unit for which this tier applies. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      Object unitAmountDecimal;

      /**
       * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a
       * tier is the upper bound of the previous tier adding one. Use {@code inf} to define a
       * fallback tier.
       */
      @SerializedName("up_to")
      Object upTo;

      private Tier(
          Map<String, Object> extraParams,
          Long flatAmount,
          Object flatAmountDecimal,
          Long unitAmount,
          Object unitAmountDecimal,
          Object upTo) {
        this.extraParams = extraParams;
        this.flatAmount = flatAmount;
        this.flatAmountDecimal = flatAmountDecimal;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
        this.upTo = upTo;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long flatAmount;

        private Object flatAmountDecimal;

        private Long unitAmount;

        private Object unitAmountDecimal;

        private Object upTo;

        /** Finalize and obtain parameter instance from this builder. */
        public PriceUpdateParams.CurrencyOption.Tier build() {
          return new PriceUpdateParams.CurrencyOption.Tier(
              this.extraParams,
              this.flatAmount,
              this.flatAmountDecimal,
              this.unitAmount,
              this.unitAmountDecimal,
              this.upTo);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PriceUpdateParams.CurrencyOption.Tier#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PriceUpdateParams.CurrencyOption.Tier#extraParams} for the field
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
         * The flat billing amount for an entire tier, regardless of the number of units in the
         * tier.
         */
        public Builder setFlatAmount(Long flatAmount) {
          this.flatAmount = flatAmount;
          return this;
        }

        /**
         * Same as {@code flat_amount}, but accepts a decimal value representing an integer in the
         * minor units of the currency. Only one of {@code flat_amount} and {@code
         * flat_amount_decimal} can be set.
         */
        public Builder setFlatAmountDecimal(BigDecimal flatAmountDecimal) {
          this.flatAmountDecimal = flatAmountDecimal;
          return this;
        }

        /**
         * Same as {@code flat_amount}, but accepts a decimal value representing an integer in the
         * minor units of the currency. Only one of {@code flat_amount} and {@code
         * flat_amount_decimal} can be set.
         */
        public Builder setFlatAmountDecimal(EmptyParam flatAmountDecimal) {
          this.flatAmountDecimal = flatAmountDecimal;
          return this;
        }

        /** The per unit billing amount for each individual unit for which this tier applies. */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }

        /**
         * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a
         * tier is the upper bound of the previous tier adding one. Use {@code inf} to define a
         * fallback tier.
         */
        public Builder setUpTo(PriceUpdateParams.CurrencyOption.Tier.UpTo upTo) {
          this.upTo = upTo;
          return this;
        }

        /**
         * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a
         * tier is the upper bound of the previous tier adding one. Use {@code inf} to define a
         * fallback tier.
         */
        public Builder setUpTo(Long upTo) {
          this.upTo = upTo;
          return this;
        }
      }

      public enum UpTo implements ApiRequestParams.EnumParam {
        @SerializedName("inf")
        INF("inf");

        @Getter(onMethod_ = {@Override})
        private final String value;

        UpTo(String value) {
          this.value = value;
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
