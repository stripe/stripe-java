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
import com.stripe.param.SubscriptionItemCreateParams;
import com.stripe.param.SubscriptionItemDeleteParams;
import com.stripe.param.SubscriptionItemListParams;
import com.stripe.param.SubscriptionItemRetrieveParams;
import com.stripe.param.SubscriptionItemUpdateParams;
import com.stripe.param.SubscriptionItemUsageRecordSummariesParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Subscription items allow you to create customer subscriptions with more than one plan, making it
 * easy to represent complex billing relationships.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionItem extends ApiResource
    implements HasId, MetadataStore<SubscriptionItem> {
  /**
   * Define thresholds at which an invoice will be sent, and the related subscription advanced to a
   * new billing period.
   */
  @SerializedName("billing_thresholds")
  BillingThresholds billingThresholds;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * The discounts applied to the subscription item. Subscription item discounts are applied before
   * subscription discounts. Use {@code expand[]=discounts} to expand each discount.
   */
  @SerializedName("discounts")
  List<ExpandableField<Discount>> discounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code subscription_item}.
   */
  @SerializedName("object")
  String object;

  /**
   * You can now model subscriptions more flexibly using the <a
   * href="https://stripe.com/docs/api#prices">Prices API</a>. It replaces the Plans API and is
   * backwards compatible to simplify your migration.
   *
   * <p>Plans define the base price, currency, and billing cycle for recurring purchases of
   * products. <a href="https://stripe.com/docs/api#products">Products</a> help you track inventory
   * or provisioning, and plans help you track pricing. Different physical goods or levels of
   * service should be represented by products, and pricing options should be represented by plans.
   * This approach lets you change prices without having to change your provisioning scheme.
   *
   * <p>For example, you might have a single &quot;gold&quot; product that has plans for $10/month,
   * $100/year, €9/month, and €90/year.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/billing/subscriptions/set-up-subscription">Set up a
   * subscription</a> and more about <a
   * href="https://stripe.com/docs/products-prices/overview">products and prices</a>.
   */
  @SerializedName("plan")
  Plan plan;

  /**
   * Prices define the unit cost, currency, and (optional) billing cycle for both recurring and
   * one-time purchases of products. <a href="https://stripe.com/docs/api#products">Products</a>
   * help you track inventory or provisioning, and prices help you track payment terms. Different
   * physical goods or levels of service should be represented by products, and pricing options
   * should be represented by prices. This approach lets you change prices without having to change
   * your provisioning scheme.
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
  @SerializedName("price")
  Price price;

  /**
   * The <a href="https://stripe.com/docs/subscriptions/quantities">quantity</a> of the plan to
   * which the customer should be subscribed.
   */
  @SerializedName("quantity")
  Long quantity;

  /** The {@code subscription} this {@code subscription_item} belongs to. */
  @SerializedName("subscription")
  String subscription;

  /**
   * The tax rates which apply to this {@code subscription_item}. When set, the {@code
   * default_tax_rates} on the subscription do not apply to this {@code subscription_item}.
   */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;

  /** Get IDs of expandable {@code discounts} object list. */
  public List<String> getDiscounts() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDiscounts(List<String> ids) {
    if (ids == null) {
      this.discounts = null;
      return;
    }
    if (this.discounts != null
        && this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.discounts =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_items";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, SubscriptionItem.class);
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(SubscriptionItemCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(SubscriptionItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_items";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SubscriptionItem.class);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, SubscriptionItem.class);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(SubscriptionItemDeleteParams params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(SubscriptionItemDeleteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SubscriptionItem.class);
  }

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_items";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SubscriptionItemCollection.class);
  }

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(SubscriptionItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(
      SubscriptionItemListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_items";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SubscriptionItemCollection.class);
  }

  /** Retrieves the subscription item with the given ID. */
  public static SubscriptionItem retrieve(String item) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the subscription item with the given ID. */
  public static SubscriptionItem retrieve(String item, RequestOptions options)
      throws StripeException {
    return retrieve(item, (Map<String, Object>) null, options);
  }

  /** Retrieves the subscription item with the given ID. */
  public static SubscriptionItem retrieve(
      String item, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(item));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SubscriptionItem.class);
  }

  /** Retrieves the subscription item with the given ID. */
  public static SubscriptionItem retrieve(
      String item, SubscriptionItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(item));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SubscriptionItem.class);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  @Override
  public SubscriptionItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  @Override
  public SubscriptionItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, SubscriptionItem.class);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(SubscriptionItemUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(SubscriptionItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SubscriptionItem.class);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries() throws StripeException {
    return usageRecordSummaries((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries(Map<String, Object> params)
      throws StripeException {
    return usageRecordSummaries(params, (RequestOptions) null);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_record_summaries",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, UsageRecordSummaryCollection.class);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries(
      SubscriptionItemUsageRecordSummariesParams params) throws StripeException {
    return usageRecordSummaries(params, (RequestOptions) null);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries(
      SubscriptionItemUsageRecordSummariesParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_record_summaries",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, UsageRecordSummaryCollection.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingThresholds extends StripeObject {
    /** Usage threshold that triggers the subscription to create an invoice. */
    @SerializedName("usage_gte")
    Long usageGte;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(billingThresholds, responseGetter);
    trySetResponseGetter(plan, responseGetter);
    trySetResponseGetter(price, responseGetter);
  }
}
