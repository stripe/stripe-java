// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PriceCreateParams extends ApiRequestParams {
  /** Whether the price can be used for new purchases. Defaults to {@code true}. */
  @SerializedName("active")
  Boolean active;

  /**
   * Describes how to compute the price per period. Either {@code per_unit} or {@code tiered}.
   * {@code per_unit} indicates that the fixed amount (specified in {@code unit_amount} or {@code
   * unit_amount_decimal}) will be charged per unit in {@code quantity} (for prices with {@code
   * usage_type=licensed}), or per unit of total usage (for prices with {@code usage_type=metered}).
   * {@code tiered} indicates that the unit pricing will be computed using a tiering strategy as
   * defined using the {@code tiers} and {@code tiers_mode} attributes.
   */
  @SerializedName("billing_scheme")
  BillingScheme billingScheme;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Prices defined in each available currency option. Each key must be a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  Map<String, PriceCreateParams.CurrencyOption> currencyOptions;

  /**
   * When set, provides configuration for the amount to be adjusted by the customer during Checkout
   * Sessions and Payment Links.
   */
  @SerializedName("custom_unit_amount")
  CustomUnitAmount customUnitAmount;

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
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A brief description of the price, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /**
   * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
   * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
   */
  @SerializedName("product")
  String product;

  /** These fields can be used to create a new product that this price will belong to. */
  @SerializedName("product_data")
  ProductData productData;

  /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
  @SerializedName("recurring")
  Recurring recurring;

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
  List<PriceCreateParams.Tier> tiers;

  /**
   * Defines if the tiering price should be {@code graduated} or {@code volume} based. In {@code
   * volume}-based tiering, the maximum quantity within a period determines the per unit price, in
   * {@code graduated} tiering pricing can successively change as the quantity grows.
   */
  @SerializedName("tiers_mode")
  TiersMode tiersMode;

  /**
   * If set to true, will atomically remove the lookup key from the existing price, and assign it to
   * this price.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the billed price.
   * Cannot be combined with {@code tiers}.
   */
  @SerializedName("transform_quantity")
  TransformQuantity transformQuantity;

  /**
   * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how much
   * to charge. One of {@code unit_amount}, {@code unit_amount_decimal}, or {@code
   * custom_unit_amount} is required, unless {@code billing_scheme=tiered}.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with at
   * most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be
   * set.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  private PriceCreateParams(
      Boolean active,
      BillingScheme billingScheme,
      String currency,
      Map<String, PriceCreateParams.CurrencyOption> currencyOptions,
      CustomUnitAmount customUnitAmount,
      List<String> expand,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      String nickname,
      String product,
      ProductData productData,
      Recurring recurring,
      TaxBehavior taxBehavior,
      List<PriceCreateParams.Tier> tiers,
      TiersMode tiersMode,
      Boolean transferLookupKey,
      TransformQuantity transformQuantity,
      Long unitAmount,
      BigDecimal unitAmountDecimal) {
    this.active = active;
    this.billingScheme = billingScheme;
    this.currency = currency;
    this.currencyOptions = currencyOptions;
    this.customUnitAmount = customUnitAmount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.nickname = nickname;
    this.product = product;
    this.productData = productData;
    this.recurring = recurring;
    this.taxBehavior = taxBehavior;
    this.tiers = tiers;
    this.tiersMode = tiersMode;
    this.transferLookupKey = transferLookupKey;
    this.transformQuantity = transformQuantity;
    this.unitAmount = unitAmount;
    this.unitAmountDecimal = unitAmountDecimal;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private BillingScheme billingScheme;

    private String currency;

    private Map<String, PriceCreateParams.CurrencyOption> currencyOptions;

    private CustomUnitAmount customUnitAmount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private String nickname;

    private String product;

    private ProductData productData;

    private Recurring recurring;

    private TaxBehavior taxBehavior;

    private List<PriceCreateParams.Tier> tiers;

    private TiersMode tiersMode;

    private Boolean transferLookupKey;

    private TransformQuantity transformQuantity;

    private Long unitAmount;

    private BigDecimal unitAmountDecimal;

    /** Finalize and obtain parameter instance from this builder. */
    public PriceCreateParams build() {
      return new PriceCreateParams(
          this.active,
          this.billingScheme,
          this.currency,
          this.currencyOptions,
          this.customUnitAmount,
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.nickname,
          this.product,
          this.productData,
          this.recurring,
          this.taxBehavior,
          this.tiers,
          this.tiersMode,
          this.transferLookupKey,
          this.transformQuantity,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /** Whether the price can be used for new purchases. Defaults to {@code true}. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Describes how to compute the price per period. Either {@code per_unit} or {@code tiered}.
     * {@code per_unit} indicates that the fixed amount (specified in {@code unit_amount} or {@code
     * unit_amount_decimal}) will be charged per unit in {@code quantity} (for prices with {@code
     * usage_type=licensed}), or per unit of total usage (for prices with {@code
     * usage_type=metered}). {@code tiered} indicates that the unit pricing will be computed using a
     * tiering strategy as defined using the {@code tiers} and {@code tiers_mode} attributes.
     */
    public Builder setBillingScheme(PriceCreateParams.BillingScheme billingScheme) {
      this.billingScheme = billingScheme;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PriceCreateParams#currencyOptions} for the field documentation.
     */
    public Builder putCurrencyOption(String key, PriceCreateParams.CurrencyOption value) {
      if (this.currencyOptions == null) {
        this.currencyOptions = new HashMap<>();
      }
      this.currencyOptions.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PriceCreateParams#currencyOptions} for the field documentation.
     */
    public Builder putAllCurrencyOption(Map<String, PriceCreateParams.CurrencyOption> map) {
      if (this.currencyOptions == null) {
        this.currencyOptions = new HashMap<>();
      }
      this.currencyOptions.putAll(map);
      return this;
    }

    /**
     * When set, provides configuration for the amount to be adjusted by the customer during
     * Checkout Sessions and Payment Links.
     */
    public Builder setCustomUnitAmount(PriceCreateParams.CustomUnitAmount customUnitAmount) {
      this.customUnitAmount = customUnitAmount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceCreateParams#expand} for the field documentation.
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
     * PriceCreateParams#expand} for the field documentation.
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
     * PriceCreateParams#extraParams} for the field documentation.
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
     * See {@link PriceCreateParams#extraParams} for the field documentation.
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PriceCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PriceCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** A brief description of the price, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
     * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
     */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /** These fields can be used to create a new product that this price will belong to. */
    public Builder setProductData(PriceCreateParams.ProductData productData) {
      this.productData = productData;
      return this;
    }

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    public Builder setRecurring(PriceCreateParams.Recurring recurring) {
      this.recurring = recurring;
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
    public Builder setTaxBehavior(PriceCreateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceCreateParams#tiers} for the field documentation.
     */
    public Builder addTier(PriceCreateParams.Tier element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element);
      return this;
    }

    /**
     * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceCreateParams#tiers} for the field documentation.
     */
    public Builder addAllTier(List<PriceCreateParams.Tier> elements) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.addAll(elements);
      return this;
    }

    /**
     * Defines if the tiering price should be {@code graduated} or {@code volume} based. In {@code
     * volume}-based tiering, the maximum quantity within a period determines the per unit price, in
     * {@code graduated} tiering pricing can successively change as the quantity grows.
     */
    public Builder setTiersMode(PriceCreateParams.TiersMode tiersMode) {
      this.tiersMode = tiersMode;
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

    /**
     * Apply a transformation to the reported usage or set quantity before computing the billed
     * price. Cannot be combined with {@code tiers}.
     */
    public Builder setTransformQuantity(PriceCreateParams.TransformQuantity transformQuantity) {
      this.transformQuantity = transformQuantity;
      return this;
    }

    /**
     * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
     * much to charge. One of {@code unit_amount}, {@code unit_amount_decimal}, or {@code
     * custom_unit_amount} is required, unless {@code billing_scheme=tiered}.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
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
    List<PriceCreateParams.CurrencyOption.Tier> tiers;

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
    BigDecimal unitAmountDecimal;

    private CurrencyOption(
        CustomUnitAmount customUnitAmount,
        Map<String, Object> extraParams,
        TaxBehavior taxBehavior,
        List<PriceCreateParams.CurrencyOption.Tier> tiers,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
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

      private List<PriceCreateParams.CurrencyOption.Tier> tiers;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceCreateParams.CurrencyOption build() {
        return new PriceCreateParams.CurrencyOption(
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
          PriceCreateParams.CurrencyOption.CustomUnitAmount customUnitAmount) {
        this.customUnitAmount = customUnitAmount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.CurrencyOption#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.CurrencyOption#extraParams} for the field documentation.
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
      public Builder setTaxBehavior(PriceCreateParams.CurrencyOption.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * PriceCreateParams.CurrencyOption#tiers} for the field documentation.
       */
      public Builder addTier(PriceCreateParams.CurrencyOption.Tier element) {
        if (this.tiers == null) {
          this.tiers = new ArrayList<>();
        }
        this.tiers.add(element);
        return this;
      }

      /**
       * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PriceCreateParams.CurrencyOption#tiers} for the field documentation.
       */
      public Builder addAllTier(List<PriceCreateParams.CurrencyOption.Tier> elements) {
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
        public PriceCreateParams.CurrencyOption.CustomUnitAmount build() {
          return new PriceCreateParams.CurrencyOption.CustomUnitAmount(
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
         * map. See {@link PriceCreateParams.CurrencyOption.CustomUnitAmount#extraParams} for the
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
         * map. See {@link PriceCreateParams.CurrencyOption.CustomUnitAmount#extraParams} for the
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
      BigDecimal flatAmountDecimal;

      /** The per unit billing amount for each individual unit for which this tier applies. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

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
          BigDecimal flatAmountDecimal,
          Long unitAmount,
          BigDecimal unitAmountDecimal,
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

        private BigDecimal flatAmountDecimal;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        private Object upTo;

        /** Finalize and obtain parameter instance from this builder. */
        public PriceCreateParams.CurrencyOption.Tier build() {
          return new PriceCreateParams.CurrencyOption.Tier(
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
         * map. See {@link PriceCreateParams.CurrencyOption.Tier#extraParams} for the field
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
         * map. See {@link PriceCreateParams.CurrencyOption.Tier#extraParams} for the field
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
         * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a
         * tier is the upper bound of the previous tier adding one. Use {@code inf} to define a
         * fallback tier.
         */
        public Builder setUpTo(PriceCreateParams.CurrencyOption.Tier.UpTo upTo) {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The maximum unit amount the customer can specify for this item. */
    @SerializedName("maximum")
    Long maximum;

    /**
     * The minimum unit amount the customer can specify for this item. Must be at least the minimum
     * charge amount.
     */
    @SerializedName("minimum")
    Long minimum;

    /** The starting unit amount which can be updated by the customer. */
    @SerializedName("preset")
    Long preset;

    private CustomUnitAmount(
        Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum, Long preset) {
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
      public PriceCreateParams.CustomUnitAmount build() {
        return new PriceCreateParams.CustomUnitAmount(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.CustomUnitAmount#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.CustomUnitAmount#extraParams} for the field documentation.
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
  public static class ProductData {
    /** Whether the product is currently available for purchase. Defaults to {@code true}. */
    @SerializedName("active")
    Boolean active;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The identifier for the product. Must be unique. If not provided, an identifier will be
     * randomly generated.
     */
    @SerializedName("id")
    String id;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** <strong>Required.</strong> The product's name, meant to be displayable to the customer. */
    @SerializedName("name")
    String name;

    /**
     * An arbitrary string to be displayed on your customer's credit card or bank statement. While
     * most banks display this information consistently, some may display it incorrectly or not at
     * all.
     *
     * <p>This may be up to 22 characters. The statement description may not include {@code <},
     * {@code >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's
     * statement in capital letters. Non-ASCII characters are automatically stripped.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
    @SerializedName("tax_code")
    String taxCode;

    /**
     * A label that represents units of this product. When set, this will be included in customers'
     * receipts, invoices, Checkout, and the customer portal.
     */
    @SerializedName("unit_label")
    String unitLabel;

    private ProductData(
        Boolean active,
        Map<String, Object> extraParams,
        String id,
        Map<String, String> metadata,
        String name,
        String statementDescriptor,
        String taxCode,
        String unitLabel) {
      this.active = active;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.name = name;
      this.statementDescriptor = statementDescriptor;
      this.taxCode = taxCode;
      this.unitLabel = unitLabel;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean active;

      private Map<String, Object> extraParams;

      private String id;

      private Map<String, String> metadata;

      private String name;

      private String statementDescriptor;

      private String taxCode;

      private String unitLabel;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceCreateParams.ProductData build() {
        return new PriceCreateParams.ProductData(
            this.active,
            this.extraParams,
            this.id,
            this.metadata,
            this.name,
            this.statementDescriptor,
            this.taxCode,
            this.unitLabel);
      }

      /** Whether the product is currently available for purchase. Defaults to {@code true}. */
      public Builder setActive(Boolean active) {
        this.active = active;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.ProductData#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.ProductData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The identifier for the product. Must be unique. If not provided, an identifier will be
       * randomly generated.
       */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.ProductData#metadata} for the field documentation.
       */
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PriceCreateParams.ProductData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The product's name, meant to be displayable to the customer. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * An arbitrary string to be displayed on your customer's credit card or bank statement. While
       * most banks display this information consistently, some may display it incorrectly or not at
       * all.
       *
       * <p>This may be up to 22 characters. The statement description may not include {@code <},
       * {@code >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's
       * statement in capital letters. Non-ASCII characters are automatically stripped.
       */
      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /**
       * A label that represents units of this product. When set, this will be included in
       * customers' receipts, invoices, Checkout, and the customer portal.
       */
      public Builder setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Recurring {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
     * {@code month} or {@code year}.
     */
    @SerializedName("interval")
    Interval interval;

    /**
     * The number of intervals between subscription billings. For example, {@code interval=month}
     * and {@code interval_count=3} bills every 3 months. Maximum of three years interval allowed (3
     * years, 36 months, or 156 weeks).
     */
    @SerializedName("interval_count")
    Long intervalCount;

    /** The meter tracking the usage of a metered price. */
    @SerializedName("meter")
    String meter;

    /**
     * Default number of trial days when subscribing a customer to this price using <a
     * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
     * trial_from_plan=true}</a>.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    /**
     * Configures how the quantity per period should be determined. Can be either {@code metered} or
     * {@code licensed}. {@code licensed} automatically bills the {@code quantity} set when adding
     * it to a subscription. {@code metered} aggregates the total usage based on usage records.
     * Defaults to {@code licensed}.
     */
    @SerializedName("usage_type")
    UsageType usageType;

    private Recurring(
        Map<String, Object> extraParams,
        Interval interval,
        Long intervalCount,
        String meter,
        Long trialPeriodDays,
        UsageType usageType) {
      this.extraParams = extraParams;
      this.interval = interval;
      this.intervalCount = intervalCount;
      this.meter = meter;
      this.trialPeriodDays = trialPeriodDays;
      this.usageType = usageType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Interval interval;

      private Long intervalCount;

      private String meter;

      private Long trialPeriodDays;

      private UsageType usageType;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceCreateParams.Recurring build() {
        return new PriceCreateParams.Recurring(
            this.extraParams,
            this.interval,
            this.intervalCount,
            this.meter,
            this.trialPeriodDays,
            this.usageType);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.Recurring#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.Recurring#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
       * {@code month} or {@code year}.
       */
      public Builder setInterval(PriceCreateParams.Recurring.Interval interval) {
        this.interval = interval;
        return this;
      }

      /**
       * The number of intervals between subscription billings. For example, {@code interval=month}
       * and {@code interval_count=3} bills every 3 months. Maximum of three years interval allowed
       * (3 years, 36 months, or 156 weeks).
       */
      public Builder setIntervalCount(Long intervalCount) {
        this.intervalCount = intervalCount;
        return this;
      }

      /** The meter tracking the usage of a metered price. */
      public Builder setMeter(String meter) {
        this.meter = meter;
        return this;
      }

      /**
       * Default number of trial days when subscribing a customer to this price using <a
       * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
       * trial_from_plan=true}</a>.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }

      /**
       * Configures how the quantity per period should be determined. Can be either {@code metered}
       * or {@code licensed}. {@code licensed} automatically bills the {@code quantity} set when
       * adding it to a subscription. {@code metered} aggregates the total usage based on usage
       * records. Defaults to {@code licensed}.
       */
      public Builder setUsageType(PriceCreateParams.Recurring.UsageType usageType) {
        this.usageType = usageType;
        return this;
      }
    }

    public enum Interval implements ApiRequestParams.EnumParam {
      @SerializedName("day")
      DAY("day"),

      @SerializedName("month")
      MONTH("month"),

      @SerializedName("week")
      WEEK("week"),

      @SerializedName("year")
      YEAR("year");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Interval(String value) {
        this.value = value;
      }
    }

    public enum UsageType implements ApiRequestParams.EnumParam {
      @SerializedName("licensed")
      LICENSED("licensed"),

      @SerializedName("metered")
      METERED("metered");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UsageType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Tier {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The flat billing amount for an entire tier, regardless of the number of units in the tier.
     */
    @SerializedName("flat_amount")
    Long flatAmount;

    /**
     * Same as {@code flat_amount}, but accepts a decimal value representing an integer in the minor
     * units of the currency. Only one of {@code flat_amount} and {@code flat_amount_decimal} can be
     * set.
     */
    @SerializedName("flat_amount_decimal")
    BigDecimal flatAmountDecimal;

    /** The per unit billing amount for each individual unit for which this tier applies. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /**
     * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a tier
     * is the upper bound of the previous tier adding one. Use {@code inf} to define a fallback
     * tier.
     */
    @SerializedName("up_to")
    Object upTo;

    private Tier(
        Map<String, Object> extraParams,
        Long flatAmount,
        BigDecimal flatAmountDecimal,
        Long unitAmount,
        BigDecimal unitAmountDecimal,
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

      private BigDecimal flatAmountDecimal;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      private Object upTo;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceCreateParams.Tier build() {
        return new PriceCreateParams.Tier(
            this.extraParams,
            this.flatAmount,
            this.flatAmountDecimal,
            this.unitAmount,
            this.unitAmountDecimal,
            this.upTo);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.Tier#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.Tier#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The flat billing amount for an entire tier, regardless of the number of units in the tier.
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
       * <strong>Required.</strong> Specifies the upper bound of this tier. The lower bound of a
       * tier is the upper bound of the previous tier adding one. Use {@code inf} to define a
       * fallback tier.
       */
      public Builder setUpTo(PriceCreateParams.Tier.UpTo upTo) {
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformQuantity {
    /** <strong>Required.</strong> Divide usage by this number. */
    @SerializedName("divide_by")
    Long divideBy;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> After division, either round the result {@code up} or {@code
     * down}.
     */
    @SerializedName("round")
    Round round;

    private TransformQuantity(Long divideBy, Map<String, Object> extraParams, Round round) {
      this.divideBy = divideBy;
      this.extraParams = extraParams;
      this.round = round;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long divideBy;

      private Map<String, Object> extraParams;

      private Round round;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceCreateParams.TransformQuantity build() {
        return new PriceCreateParams.TransformQuantity(this.divideBy, this.extraParams, this.round);
      }

      /** <strong>Required.</strong> Divide usage by this number. */
      public Builder setDivideBy(Long divideBy) {
        this.divideBy = divideBy;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceCreateParams.TransformQuantity#extraParams} for the field documentation.
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
       * See {@link PriceCreateParams.TransformQuantity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> After division, either round the result {@code up} or {@code
       * down}.
       */
      public Builder setRound(PriceCreateParams.TransformQuantity.Round round) {
        this.round = round;
        return this;
      }
    }

    public enum Round implements ApiRequestParams.EnumParam {
      @SerializedName("down")
      DOWN("down"),

      @SerializedName("up")
      UP("up");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Round(String value) {
        this.value = value;
      }
    }
  }

  public enum BillingScheme implements ApiRequestParams.EnumParam {
    @SerializedName("per_unit")
    PER_UNIT("per_unit"),

    @SerializedName("tiered")
    TIERED("tiered");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingScheme(String value) {
      this.value = value;
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

  public enum TiersMode implements ApiRequestParams.EnumParam {
    @SerializedName("graduated")
    GRADUATED("graduated"),

    @SerializedName("volume")
    VOLUME("volume");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TiersMode(String value) {
      this.value = value;
    }
  }
}
