// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.UsageRecordCreateOnSubscriptionItemParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsageRecord extends ApiResource implements HasId {
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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code usage_record}.
   */
  @SerializedName("object")
  String object;

  /** The usage quantity for the specified date. */
  @SerializedName("quantity")
  Long quantity;

  /** The ID of the subscription item this usage record contains data for. */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /** The timestamp when this usage occurred. */
  @SerializedName("timestamp")
  Long timestamp;

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide <code>quantity</code> information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the <code>quantity</code> values of the
   * usage records within a billing period. You can change this default behavior with the billing
   * plan’s <code>aggregate_usage</code> <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the <code>quantity
   * </code> values together. In most cases, this is the desired resolution, however, you can change
   * this behavior with the <code>action</code> parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(
      String subscriptionItem, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_items/%s/usage_records",
                ApiResource.urlEncodeId(subscriptionItem)));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, UsageRecord.class, options);
  }

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide <code>quantity</code> information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the <code>quantity</code> values of the
   * usage records within a billing period. You can change this default behavior with the billing
   * plan’s <code>aggregate_usage</code> <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the <code>quantity
   * </code> values together. In most cases, this is the desired resolution, however, you can change
   * this behavior with the <code>action</code> parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(
      String subscriptionItem,
      UsageRecordCreateOnSubscriptionItemParams params,
      RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_items/%s/usage_records",
                ApiResource.urlEncodeId(subscriptionItem)));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, UsageRecord.class, options);
  }
}
