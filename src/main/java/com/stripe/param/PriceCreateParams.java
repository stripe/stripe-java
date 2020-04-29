package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PriceCreateParams extends ApiRequestParams {
  /** Whether the price is currently active. Defaults to {@code true}. */
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
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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

  /** A lookup key used to retrieve prices dynamically from a static string. */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to {@code
   * metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A brief description of the price, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /** The ID of the product that this price will belong to. */
  @SerializedName("product")
  String product;

  /** These fields can be used to create a new product that this price will belong to. */
  @SerializedName("product_data")
  ProductData productData;

  /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
  @SerializedName("recurring")
  Recurring recurring;

  /**
   * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be
   * set to {@code tiered}. See also the documentation for {@code billing_scheme}.
   */
  @SerializedName("tiers")
  List<Tier> tiers;

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

  /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
   * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  private PriceCreateParams(
      Boolean active,
      BillingScheme billingScheme,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      String nickname,
      String product,
      ProductData productData,
      Recurring recurring,
      List<Tier> tiers,
      TiersMode tiersMode,
      Boolean transferLookupKey,
      TransformQuantity transformQuantity,
      Long unitAmount,
      BigDecimal unitAmountDecimal) {
    this.active = active;
    this.billingScheme = billingScheme;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.nickname = nickname;
    this.product = product;
    this.productData = productData;
    this.recurring = recurring;
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

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private String nickname;

    private String product;

    private ProductData productData;

    private Recurring recurring;

    private List<Tier> tiers;

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
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.nickname,
          this.product,
          this.productData,
          this.recurring,
          this.tiers,
          this.tiersMode,
          this.transferLookupKey,
          this.transformQuantity,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /** Whether the price is currently active. Defaults to {@code true}. */
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
    public Builder setBillingScheme(BillingScheme billingScheme) {
      this.billingScheme = billingScheme;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
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

    /** A lookup key used to retrieve prices dynamically from a static string. */
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

    /** The ID of the product that this price will belong to. */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /** These fields can be used to create a new product that this price will belong to. */
    public Builder setProductData(ProductData productData) {
      this.productData = productData;
      return this;
    }

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    public Builder setRecurring(Recurring recurring) {
      this.recurring = recurring;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceCreateParams#tiers} for the field documentation.
     */
    public Builder addTier(Tier element) {
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
    public Builder addAllTier(List<Tier> elements) {
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
    public Builder setTiersMode(TiersMode tiersMode) {
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
    public Builder setTransformQuantity(TransformQuantity transformQuantity) {
      this.transformQuantity = transformQuantity;
      return this;
    }

    /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
     * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }
  }

  @Getter
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
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The product's name, meant to be displayable to the customer. Whenever this product is sold
     * via a subscription, name will show up on associated invoice line item descriptions.
     */
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

    /**
     * A label that represents units of this product in Stripe and on customers’ receipts and
     * invoices. When set, this will be included in associated invoice line item descriptions.
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
        String unitLabel) {
      this.active = active;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.name = name;
      this.statementDescriptor = statementDescriptor;
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

      private String unitLabel;

      /** Finalize and obtain parameter instance from this builder. */
      public ProductData build() {
        return new ProductData(
            this.active,
            this.extraParams,
            this.id,
            this.metadata,
            this.name,
            this.statementDescriptor,
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

      /**
       * The product's name, meant to be displayable to the customer. Whenever this product is sold
       * via a subscription, name will show up on associated invoice line item descriptions.
       */
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

      /**
       * A label that represents units of this product in Stripe and on customers’ receipts and
       * invoices. When set, this will be included in associated invoice line item descriptions.
       */
      public Builder setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
      }
    }
  }

  @Getter
  public static class Recurring {
    /**
     * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
     * values are {@code sum} for summing up all usage during a period, {@code last_during_period}
     * for using the last usage record reported within a period, {@code last_ever} for using the
     * last usage record ever (across period bounds) or {@code max} which uses the usage record with
     * the maximum reported usage during a period. Defaults to {@code sum}.
     */
    @SerializedName("aggregate_usage")
    AggregateUsage aggregateUsage;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code year}.
     */
    @SerializedName("interval")
    Interval interval;

    /**
     * The number of intervals between subscription billings. For example, {@code interval=month}
     * and {@code interval_count=3} bills every 3 months. Maximum of one year interval allowed (1
     * year, 12 months, or 52 weeks).
     */
    @SerializedName("interval_count")
    Long intervalCount;

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
        AggregateUsage aggregateUsage,
        Map<String, Object> extraParams,
        Interval interval,
        Long intervalCount,
        Long trialPeriodDays,
        UsageType usageType) {
      this.aggregateUsage = aggregateUsage;
      this.extraParams = extraParams;
      this.interval = interval;
      this.intervalCount = intervalCount;
      this.trialPeriodDays = trialPeriodDays;
      this.usageType = usageType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AggregateUsage aggregateUsage;

      private Map<String, Object> extraParams;

      private Interval interval;

      private Long intervalCount;

      private Long trialPeriodDays;

      private UsageType usageType;

      /** Finalize and obtain parameter instance from this builder. */
      public Recurring build() {
        return new Recurring(
            this.aggregateUsage,
            this.extraParams,
            this.interval,
            this.intervalCount,
            this.trialPeriodDays,
            this.usageType);
      }

      /**
       * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
       * values are {@code sum} for summing up all usage during a period, {@code last_during_period}
       * for using the last usage record reported within a period, {@code last_ever} for using the
       * last usage record ever (across period bounds) or {@code max} which uses the usage record
       * with the maximum reported usage during a period. Defaults to {@code sum}.
       */
      public Builder setAggregateUsage(AggregateUsage aggregateUsage) {
        this.aggregateUsage = aggregateUsage;
        return this;
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
       * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
       * year}.
       */
      public Builder setInterval(Interval interval) {
        this.interval = interval;
        return this;
      }

      /**
       * The number of intervals between subscription billings. For example, {@code interval=month}
       * and {@code interval_count=3} bills every 3 months. Maximum of one year interval allowed (1
       * year, 12 months, or 52 weeks).
       */
      public Builder setIntervalCount(Long intervalCount) {
        this.intervalCount = intervalCount;
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
      public Builder setUsageType(UsageType usageType) {
        this.usageType = usageType;
        return this;
      }
    }

    public enum AggregateUsage implements ApiRequestParams.EnumParam {
      @SerializedName("last_during_period")
      LAST_DURING_PERIOD("last_during_period"),

      @SerializedName("last_ever")
      LAST_EVER("last_ever"),

      @SerializedName("max")
      MAX("max"),

      @SerializedName("sum")
      SUM("sum");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AggregateUsage(String value) {
        this.value = value;
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
     * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
     * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /**
     * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
     * previous tier adding one. Use {@code inf} to define a fallback tier.
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
      public Tier build() {
        return new Tier(
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
       * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
       * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }

      /**
       * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
       * previous tier adding one. Use {@code inf} to define a fallback tier.
       */
      public Builder setUpTo(UpTo upTo) {
        this.upTo = upTo;
        return this;
      }

      /**
       * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
       * previous tier adding one. Use {@code inf} to define a fallback tier.
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
  public static class TransformQuantity {
    /** Divide usage by this number. */
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

    /** After division, either round the result {@code up} or {@code down}. */
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
      public TransformQuantity build() {
        return new TransformQuantity(this.divideBy, this.extraParams, this.round);
      }

      /** Divide usage by this number. */
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

      /** After division, either round the result {@code up} or {@code down}. */
      public Builder setRound(Round round) {
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
