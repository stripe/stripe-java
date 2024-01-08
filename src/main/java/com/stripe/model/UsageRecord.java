// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.UsageRecordCreateOnSubscriptionItemParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Usage records allow you to report customer usage and metrics to Stripe for metered billing of
 * subscription prices.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/subscriptions/metered-billing">Metered
 * billing</a>
 */
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
   * <p>Usage records provide {@code quantity} information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the {@code quantity} values of the usage
   * records within a billing period. You can change this default behavior with the billing plan’s
   * {@code aggregate_usage} <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the {@code quantity}
   * values together. In most cases, this is the desired resolution, however, you can change this
   * behavior with the {@code action} parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(
      String subscriptionItem, Map<String, Object> params) throws StripeException {
    return createOnSubscriptionItem(subscriptionItem, params, (RequestOptions) null);
  }

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide {@code quantity} information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the {@code quantity} values of the usage
   * records within a billing period. You can change this default behavior with the billing plan’s
   * {@code aggregate_usage} <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the {@code quantity}
   * values together. In most cases, this is the desired resolution, however, you can change this
   * behavior with the {@code action} parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(
      String subscriptionItem, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_records", ApiResource.urlEncodeId(subscriptionItem));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            UsageRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide {@code quantity} information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the {@code quantity} values of the usage
   * records within a billing period. You can change this default behavior with the billing plan’s
   * {@code aggregate_usage} <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the {@code quantity}
   * values together. In most cases, this is the desired resolution, however, you can change this
   * behavior with the {@code action} parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(
      String subscriptionItem, UsageRecordCreateOnSubscriptionItemParams params)
      throws StripeException {
    return createOnSubscriptionItem(subscriptionItem, params, (RequestOptions) null);
  }

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide {@code quantity} information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the {@code quantity} values of the usage
   * records within a billing period. You can change this default behavior with the billing plan’s
   * {@code aggregate_usage} <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the {@code quantity}
   * values together. In most cases, this is the desired resolution, however, you can change this
   * behavior with the {@code action} parameter.
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
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_records", ApiResource.urlEncodeId(subscriptionItem));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            UsageRecord.class,
            options,
            ApiMode.V1);
  }
}
