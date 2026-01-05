// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PlanCreateParams;
import com.stripe.param.PlanListParams;
import com.stripe.param.PlanRetrieveParams;
import com.stripe.param.PlanUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can now model subscriptions more flexibly using the <a
 * href="https://api.stripe.com#prices">Prices API</a>. It replaces the Plans API and is backwards
 * compatible to simplify your migration.
 *
 * <p>Plans define the base price, currency, and billing cycle for recurring purchases of products.
 * <a href="https://api.stripe.com#products">Products</a> help you track inventory or provisioning,
 * and plans help you track pricing. Different physical goods or levels of service should be
 * represented by products, and pricing options should be represented by plans. This approach lets
 * you change prices without having to change your provisioning scheme.
 *
 * <p>For example, you might have a single &quot;gold&quot; product that has plans for $10/month,
 * $100/year, €9/month, and €90/year.
 *
 * <p>Related guides: <a
 * href="https://docs.stripe.com/billing/subscriptions/set-up-subscription">Set up a
 * subscription</a> and more about <a
 * href="https://docs.stripe.com/products-prices/overview">products and prices</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Plan extends ApiResource implements HasId, MetadataStore<Plan> {
  /** Whether the plan can be used for new purchases. */
  @SerializedName("active")
  Boolean active;

  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if
   * possible. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string
   * with at most 12 decimal places. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("amount_decimal")
  BigDecimal amountDecimal;

  /**
   * Describes how to compute the price per period. Either {@code per_unit} or {@code tiered}.
   * {@code per_unit} indicates that the fixed amount (specified in {@code amount}) will be charged
   * per unit in {@code quantity} (for plans with {@code usage_type=licensed}), or per unit of total
   * usage (for plans with {@code usage_type=metered}). {@code tiered} indicates that the unit
   * pricing will be computed using a tiering strategy as defined using the {@code tiers} and {@code
   * tiers_mode} attributes.
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

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * A custom identifier for this price, such as a SKU number or product code, that can be used to
   * reference records from external systems.
   */
  @SerializedName("external_reference")
  String externalReference;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The meter tracking the usage of a metered price. */
  @SerializedName("meter")
  String meter;

  /** A brief description of the plan, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code plan}.
   */
  @SerializedName("object")
  String object;

  /** The product whose pricing this plan determines. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /**
   * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be
   * set to {@code tiered}. See also the documentation for {@code billing_scheme}.
   */
  @SerializedName("tiers")
  List<Plan.Tier> tiers;

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
  @SerializedName("transform_usage")
  TransformUsage transformUsage;

  /**
   * Default number of trial days when subscribing a customer to this plan using <a
   * href="https://docs.stripe.com/api#create_subscription-trial_from_plan">{@code
   * trial_from_plan=true}</a>.
   */
  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  /**
   * Configures how the quantity per period should be determined. Can be either {@code metered} or
   * {@code licensed}. {@code licensed} automatically bills the {@code quantity} set when adding it
   * to a subscription. {@code metered} aggregates the total usage based on usage records. Defaults
   * to {@code licensed}.
   */
  @SerializedName("usage_type")
  String usageType;

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

  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public static Plan create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public static Plan create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/plans";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public static Plan create(PlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   */
  public static Plan create(PlanCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/plans";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected. */
  public Plan delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Plan.class);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/plans";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PlanCollection.class);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(PlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(PlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/plans";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PlanCollection.class);
  }

  /** Retrieves the plan with the given ID. */
  public static Plan retrieve(String plan) throws StripeException {
    return retrieve(plan, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the plan with the given ID. */
  public static Plan retrieve(String plan, RequestOptions options) throws StripeException {
    return retrieve(plan, (Map<String, Object>) null, options);
  }

  /** Retrieves the plan with the given ID. */
  public static Plan retrieve(String plan, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /** Retrieves the plan with the given ID. */
  public static Plan retrieve(String plan, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  @Override
  public Plan update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  @Override
  public Plan update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Plan.class);
  }

  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(PlanUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified plan by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged. By design, you cannot change a plan’s ID, amount, currency, or
   * billing cycle.
   */
  public Plan update(PlanUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Plan.class);
  }

  /**
   * For more details about Tier, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
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

  /**
   * For more details about TransformUsage, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformUsage extends StripeObject {
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
    trySetResponseGetter(product, responseGetter);
    trySetResponseGetter(transformUsage, responseGetter);
  }
}
