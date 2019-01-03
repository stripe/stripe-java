package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionItem extends ApiResource
    implements HasId, MetadataStore<SubscriptionItem> {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  Plan plan;

  /**
   * The [quantity](/docs/subscriptions/quantities) of the plan to which the customer should be
   * subscribed.
   */
  Long quantity;

  /** The `subscription` this `subscription_item` belongs to. */
  String subscription;

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your subscription items for a given subscription. */
  public static SubscriptionItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_items");
    return requestCollection(url, params, SubscriptionItemCollection.class, options);
  }

  /** Retrieves the invoice item with the given ID. */
  public static SubscriptionItem retrieve(String item) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the invoice item with the given ID. */
  public static SubscriptionItem retrieve(String item, RequestOptions options)
      throws StripeException {
    return retrieve(item, (Map<String, Object>) null, options);
  }

  /** Retrieves the invoice item with the given ID. */
  public static SubscriptionItem retrieve(
      String item, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/subscription_items/%s", item));
    return request(ApiResource.RequestMethod.GET, url, params, SubscriptionItem.class, options);
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public static SubscriptionItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_items");
    return request(ApiResource.RequestMethod.POST, url, params, SubscriptionItem.class, options);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/subscription_items/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, SubscriptionItem.class, options);
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
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/subscription_items/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, SubscriptionItem.class, options);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the billing plan’s month of September).
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
   * subscription billing period (e.g., 15 usage records in the billing plan’s month of September).
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
   * subscription billing period (e.g., 15 usage records in the billing plan’s month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public UsageRecordSummaryCollection usageRecordSummaries(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscription_items/%s/usage_record_summaries", this.getId()));
    return requestCollection(url, params, UsageRecordSummaryCollection.class, options);
  }
}
