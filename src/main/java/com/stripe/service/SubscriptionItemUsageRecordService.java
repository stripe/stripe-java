// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.UsageRecord;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionItemUsageRecordCreateParams;

public final class SubscriptionItemUsageRecordService extends ApiService {
  public SubscriptionItemUsageRecordService(StripeResponseGetter responseGetter) {
    super(responseGetter);
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
  public UsageRecord create(String subscriptionItem, SubscriptionItemUsageRecordCreateParams params)
      throws StripeException {
    return create(subscriptionItem, params, (RequestOptions) null);
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
  public UsageRecord create(
      String subscriptionItem,
      SubscriptionItemUsageRecordCreateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_records", ApiResource.urlEncodeId(subscriptionItem));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, UsageRecord.class);
  }
}
