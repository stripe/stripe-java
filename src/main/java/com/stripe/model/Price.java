// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PriceCreateParams;
import com.stripe.param.PriceListParams;
import com.stripe.param.PriceRetrieveParams;
import com.stripe.param.PriceSearchParams;
import com.stripe.param.PriceUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Prices define the unit cost, currency, and (optional) billing cycle for both recurring and
 * one-time purchases of products. <a href="https://stripe.com/docs/api#products">Products</a> help
 * you track inventory or provisioning, and prices help you track payment terms. Different physical
 * goods or levels of service should be represented by products, and pricing options should be
 * represented by prices. This approach lets you change prices without having to change your
 * provisioning scheme.
 *
 * <p>For example, you might have a single &quot;gold&quot; product that has prices for $10/month,
 * $100/year, and €9 once.
 *
 * <p>Related guides: <a
 * href="https://stripe.com/docs/billing/subscriptions/set-up-subscription">Set up a
 * subscription</a>, <a href="https://stripe.com/docs/billing/invoices/create">create an
 * invoice</a>, and more about <a href="https://stripe.com/docs/products-prices/overview">products
 * and prices</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Price extends ApiResource implements HasId, MetadataStore<Price> {
  /** Whether the price can be used for new purchases. */
  @SerializedName("active")
  Boolean active;

  /**
   * Describes how to compute the price per period. Either {@code per_unit} or {@code tiered}.
   * {@code per_unit} indicates that the fixed amount (specified in {@code unit_amount} or {@code
   * unit_amount_decimal}) will be charged per unit in {@code quantity} (for prices with {@code
   * usage_type=licensed}), or per unit of total usage (for prices with {@code usage_type=metered}).
   * {@code tiered} indicates that the unit pricing will be computed using a tiering strategy as
   * defined using the {@code tiers} and {@code tiers_mode} attributes.
   *
   * <p>One of {@code per_unit}, or {@code tiered}.
   */
  @SerializedName("billing_scheme")
  String billingScheme;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Prices defined in each available currency option. Each key must be a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  Map<String, Price.CurrencyOption> currencyOptions;

  /**
   * When set, provides configuration for the amount to be adjusted by the customer during Checkout
   * Sessions and Payment Links.
   */
  @SerializedName("custom_unit_amount")
  CustomUnitAmount customUnitAmount;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Subscriptions using this price will be migrated to use the new referenced price. */
  @SerializedName("migrate_to")
  MigrateTo migrateTo;

  /** A brief description of the price, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code price}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the product this price is associated with. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

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
  String taxBehavior;

  /**
   * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be
   * set to {@code tiered}. See also the documentation for {@code billing_scheme}.
   */
  @SerializedName("tiers")
  List<Price.Tier> tiers;

  /**
   * Defines if the tiering price should be {@code graduated} or {@code volume} based. In {@code
   * volume}-based tiering, the maximum quantity within a period determines the per unit price. In
   * {@code graduated} tiering, pricing can change as the quantity grows.
   *
   * <p>One of {@code graduated}, or {@code volume}.
   */
  @SerializedName("tiers_mode")
  String tiersMode;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount
   * billed. Cannot be combined with {@code tiers}.
   */
  @SerializedName("transform_quantity")
  TransformQuantity transformQuantity;

  /**
   * One of {@code one_time} or {@code recurring} depending on whether the price is for a one-time
   * purchase or a recurring (subscription) purchase.
   */
  @SerializedName("type")
  String type;

  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if
   * possible. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string
   * with at most 12 decimal places. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  /** Get ID of expandable {@code product} object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded {@code product}. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /** Creates a new price for an existing product. The price can be recurring or one-time. */
  public static Price create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new price for an existing product. The price can be recurring or one-time. */
  public static Price create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Price.class,
            options,
            ApiMode.V1);
  }

  /** Creates a new price for an existing product. The price can be recurring or one-time. */
  public static Price create(PriceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new price for an existing product. The price can be recurring or one-time. */
  public static Price create(PriceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Price.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of your active prices. For the list of inactive prices, set {@code active} to
   * false.
   */
  public static PriceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your active prices. For the list of inactive prices, set {@code active} to
   * false.
   */
  public static PriceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            PriceCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of your active prices. For the list of inactive prices, set {@code active} to
   * false.
   */
  public static PriceCollection list(PriceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your active prices. For the list of inactive prices, set {@code active} to
   * false.
   */
  public static PriceCollection list(PriceListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PriceCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the price with the given ID. */
  public static Price retrieve(String price) throws StripeException {
    return retrieve(price, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the price with the given ID. */
  public static Price retrieve(String price, RequestOptions options) throws StripeException {
    return retrieve(price, (Map<String, Object>) null, options);
  }

  /** Retrieves the price with the given ID. */
  public static Price retrieve(String price, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(price));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Price.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the price with the given ID. */
  public static Price retrieve(String price, PriceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(price));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Price.class,
            options,
            ApiMode.V1);
  }

  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static PriceSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static PriceSearchResult search(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices/search";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            PriceSearchResult.class,
            options,
            ApiMode.V1);
  }

  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static PriceSearchResult search(PriceSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static PriceSearchResult search(PriceSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices/search";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PriceSearchResult.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  @Override
  public Price update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  @Override
  public Price update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Price.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(PriceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(PriceUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Price.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyOption extends StripeObject {
    /**
     * When set, provides configuration for the amount to be adjusted by the customer during
     * Checkout Sessions and Payment Links.
     */
    @SerializedName("custom_unit_amount")
    CustomUnitAmount customUnitAmount;

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    String taxBehavior;

    /**
     * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be
     * set to {@code tiered}. See also the documentation for {@code billing_scheme}.
     */
    @SerializedName("tiers")
    List<Price.CurrencyOption.Tier> tiers;

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer
     * if possible. Only set if {@code billing_scheme=per_unit}.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string
     * with at most 12 decimal places. Only set if {@code billing_scheme=per_unit}.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomUnitAmount extends StripeObject {
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
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tier extends StripeObject {
      /** Price for the entire tier. */
      @SerializedName("flat_amount")
      Long flatAmount;

      /**
       * Same as {@code flat_amount}, but contains a decimal value with at most 12 decimal places.
       */
      @SerializedName("flat_amount_decimal")
      BigDecimal flatAmountDecimal;

      /** Per unit price for units relevant to the tier. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but contains a decimal value with at most 12 decimal places.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      /** Up to and including to this quantity will be contained in the tier. */
      @SerializedName("up_to")
      Long upTo;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomUnitAmount extends StripeObject {
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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MigrateTo extends StripeObject {
    /**
     * The behavior controlling at what point in the subscription lifecycle to migrate the price
     *
     * <p>Equal to {@code at_cycle_end}.
     */
    @SerializedName("behavior")
    String behavior;

    /** The unix timestamp after at which subscriptions will start to migrate to the new price. */
    @SerializedName("effective_after")
    Long effectiveAfter;

    /** The id of the price being migrated to. */
    @SerializedName("price")
    String price;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Recurring extends StripeObject {
    /**
     * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
     * values are {@code sum} for summing up all usage during a period, {@code last_during_period}
     * for using the last usage record reported within a period, {@code last_ever} for using the
     * last usage record ever (across period bounds) or {@code max} which uses the usage record with
     * the maximum reported usage during a period. Defaults to {@code sum}.
     *
     * <p>One of {@code last_during_period}, {@code last_ever}, {@code max}, or {@code sum}.
     */
    @SerializedName("aggregate_usage")
    String aggregateUsage;

    /**
     * The frequency at which a subscription is billed. One of {@code day}, {@code week}, {@code
     * month} or {@code year}.
     */
    @SerializedName("interval")
    String interval;

    /**
     * The number of intervals (specified in the {@code interval} attribute) between subscription
     * billings. For example, {@code interval=month} and {@code interval_count=3} bills every 3
     * months.
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
    String usageType;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tier extends StripeObject {
    /** Price for the entire tier. */
    @SerializedName("flat_amount")
    Long flatAmount;

    /** Same as {@code flat_amount}, but contains a decimal value with at most 12 decimal places. */
    @SerializedName("flat_amount_decimal")
    BigDecimal flatAmountDecimal;

    /** Per unit price for units relevant to the tier. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /** Same as {@code unit_amount}, but contains a decimal value with at most 12 decimal places. */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /** Up to and including to this quantity will be contained in the tier. */
    @SerializedName("up_to")
    Long upTo;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformQuantity extends StripeObject {
    /** Divide usage by this number. */
    @SerializedName("divide_by")
    Long divideBy;

    /**
     * After division, either round the result {@code up} or {@code down}.
     *
     * <p>One of {@code down}, or {@code up}.
     */
    @SerializedName("round")
    String round;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customUnitAmount, responseGetter);
    trySetResponseGetter(migrateTo, responseGetter);
    trySetResponseGetter(product, responseGetter);
    trySetResponseGetter(recurring, responseGetter);
    trySetResponseGetter(transformQuantity, responseGetter);
  }
}
