package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Plan extends ApiResource implements HasId, MetadataStore<Plan> {
  /** Whether the plan is currently available for new subscriptions. */
  @SerializedName("active")
  Boolean active;

  /**
   * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are
   * `sum` for summing up all usage during a period, `last_during_period` for picking the last usage
   * record reported within a period, `last_ever` for picking the last usage record ever (across
   * period bounds) or `max` which picks the usage record with the maximum reported usage during a
   * period. Defaults to `sum`.
   *
   * <p>One of `last_during_period`, `last_ever`, `max`, or `sum`.
   */
  @SerializedName("aggregate_usage")
  String aggregateUsage;

  /** The amount in %s to be charged on the interval specified. */
  @SerializedName("amount")
  Long amount;

  /** Same as `amount`, but contains a decimal value with at most 12 decimal places. */
  @SerializedName("amount_decimal")
  BigDecimal amountDecimal;

  /**
   * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit`
   * indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity`
   * (for plans with `usage_type=licensed`), or per unit of total usage (for plans with
   * `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a
   * tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
   *
   * <p>One of `per_unit`, or `tiered`.
   */
  @SerializedName("billing_scheme")
  String billingScheme;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * One of `day`, `week`, `month` or `year`. The frequency with which a subscription should be
   * billed.
   */
  @SerializedName("interval")
  String interval;

  /**
   * The number of intervals (specified in the `interval` property) between subscription billings.
   * For example, `interval=month` and `interval_count=3` bills every 3 months.
   */
  @SerializedName("interval_count")
  Long intervalCount;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A brief description of the plan, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `plan`.
   */
  @SerializedName("object")
  String object;

  /** The product whose pricing this plan determines. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /**
   * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to
   * `tiered`. See also the documentation for `billing_scheme`.
   */
  @SerializedName("tiers")
  List<Plan.Tier> tiers;

  /**
   * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based
   * tiering, the maximum quantity within a period determines the per unit price, in `graduated`
   * tiering pricing can successively change as the quantity grows.
   *
   * <p>One of `graduated`, or `volume`.
   */
  @SerializedName("tiers_mode")
  String tiersMode;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the billed price.
   * Cannot be combined with `tiers`.
   */
  @SerializedName("transform_usage")
  TransformUsage transformUsage;

  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
   */
  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  /**
   * Configures how the quantity per period should be determined, can be either `metered` or
   * `licensed`. `licensed` will automatically bill the `quantity` set when adding it to a
   * subscription, `metered` will aggregate the total usage based on usage records. Defaults to
   * `licensed`.
   *
   * <p>One of `licensed`, or `metered`.
   */
  @SerializedName("usage_type")
  String usageType;

  /** Get id of expandable `product` object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded `product`. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/plans");
    return ApiResource.requestCollection(url, params, PlanCollection.class, options);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(PlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your plans. */
  public static PlanCollection list(PlanListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/plans");
    return ApiResource.requestCollection(url, params, PlanCollection.class, options);
  }

  /**
   * You can create plans using the API, or in the Stripe <a
   * href="https://dashboard.stripe.com/subscriptions/products">Dashboard</a>.
   */
  public static Plan create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create plans using the API, or in the Stripe <a
   * href="https://dashboard.stripe.com/subscriptions/products">Dashboard</a>.
   */
  public static Plan create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/plans");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Plan.class, options);
  }

  /**
   * You can create plans using the API, or in the Stripe <a
   * href="https://dashboard.stripe.com/subscriptions/products">Dashboard</a>.
   */
  public static Plan create(PlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create plans using the API, or in the Stripe <a
   * href="https://dashboard.stripe.com/subscriptions/products">Dashboard</a>.
   */
  public static Plan create(PlanCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/plans");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Plan.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Plan.class, options);
  }

  /** Retrieves the plan with the given ID. */
  public static Plan retrieve(String plan, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/plans/%s", ApiResource.urlEncodeId(plan)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Plan.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Plan.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Plan.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/plans/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.DELETE, url, params, Plan.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tier extends StripeObject {
    /** Price for the entire tier. */
    @SerializedName("flat_amount")
    Long flatAmount;

    /** Same as `flat_amount`, but contains a decimal value with at most 12 decimal places. */
    @SerializedName("flat_amount_decimal")
    BigDecimal flatAmountDecimal;

    /** Per unit price for units relevant to the tier. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /** Same as `unit_amount`, but contains a decimal value with at most 12 decimal places. */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /** Up to and including to this quantity will be contained in the tier. */
    @SerializedName("up_to")
    Long upTo;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformUsage extends StripeObject {
    /** Divide usage by this number. */
    @SerializedName("divide_by")
    Long divideBy;

    /**
     * After division, either round the result `up` or `down`.
     *
     * <p>One of `down`, or `up`.
     */
    @SerializedName("round")
    String round;
  }
}
