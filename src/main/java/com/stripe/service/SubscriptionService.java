// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Discount;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.model.Subscription;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionCancelParams;
import com.stripe.param.SubscriptionCreateParams;
import com.stripe.param.SubscriptionListParams;
import com.stripe.param.SubscriptionMigrateParams;
import com.stripe.param.SubscriptionResumeParams;
import com.stripe.param.SubscriptionRetrieveParams;
import com.stripe.param.SubscriptionSearchParams;
import com.stripe.param.SubscriptionUpdateParams;

public final class SubscriptionService extends ApiService {
  public SubscriptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Cancels a customer’s subscription immediately. The customer won’t be charged again for the
   * subscription. After it’s canceled, you can no longer update the subscription or its <a
   * href="https://stripe.com/metadata">metadata</a>.
   *
   * <p>Any pending invoice items that you’ve created are still charged at the end of the period,
   * unless manually <a href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve
   * set the subscription to cancel at the end of the period, any pending prorations are also left
   * in place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations are removed if {@code invoice_now} and {@code prorate} are both
   * set to true.
   *
   * <p>By default, upon subscription cancellation, Stripe stops automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(String subscriptionExposedId, SubscriptionCancelParams params)
      throws StripeException {
    return cancel(subscriptionExposedId, params, (RequestOptions) null);
  }
  /**
   * Cancels a customer’s subscription immediately. The customer won’t be charged again for the
   * subscription. After it’s canceled, you can no longer update the subscription or its <a
   * href="https://stripe.com/metadata">metadata</a>.
   *
   * <p>Any pending invoice items that you’ve created are still charged at the end of the period,
   * unless manually <a href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve
   * set the subscription to cancel at the end of the period, any pending prorations are also left
   * in place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations are removed if {@code invoice_now} and {@code prorate} are both
   * set to true.
   *
   * <p>By default, upon subscription cancellation, Stripe stops automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    return cancel(subscriptionExposedId, (SubscriptionCancelParams) null, options);
  }
  /**
   * Cancels a customer’s subscription immediately. The customer won’t be charged again for the
   * subscription. After it’s canceled, you can no longer update the subscription or its <a
   * href="https://stripe.com/metadata">metadata</a>.
   *
   * <p>Any pending invoice items that you’ve created are still charged at the end of the period,
   * unless manually <a href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve
   * set the subscription to cancel at the end of the period, any pending prorations are also left
   * in place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations are removed if {@code invoice_now} and {@code prorate} are both
   * set to true.
   *
   * <p>By default, upon subscription cancellation, Stripe stops automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(String subscriptionExposedId) throws StripeException {
    return cancel(subscriptionExposedId, (SubscriptionCancelParams) null, (RequestOptions) null);
  }
  /**
   * Cancels a customer’s subscription immediately. The customer won’t be charged again for the
   * subscription. After it’s canceled, you can no longer update the subscription or its <a
   * href="https://stripe.com/metadata">metadata</a>.
   *
   * <p>Any pending invoice items that you’ve created are still charged at the end of the period,
   * unless manually <a href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve
   * set the subscription to cancel at the end of the period, any pending prorations are also left
   * in place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations are removed if {@code invoice_now} and {@code prorate} are both
   * set to true.
   *
   * <p>By default, upon subscription cancellation, Stripe stops automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(
      String subscriptionExposedId, SubscriptionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
  /** Retrieves the subscription with the given ID. */
  public Subscription retrieve(String subscriptionExposedId, SubscriptionRetrieveParams params)
      throws StripeException {
    return retrieve(subscriptionExposedId, params, (RequestOptions) null);
  }
  /** Retrieves the subscription with the given ID. */
  public Subscription retrieve(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    return retrieve(subscriptionExposedId, (SubscriptionRetrieveParams) null, options);
  }
  /** Retrieves the subscription with the given ID. */
  public Subscription retrieve(String subscriptionExposedId) throws StripeException {
    return retrieve(
        subscriptionExposedId, (SubscriptionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the subscription with the given ID. */
  public Subscription retrieve(
      String subscriptionExposedId, SubscriptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date. Learn about how <a
   * href="https://stripe.com/docs/billing/subscriptions/upgrade-downgrade#immediate-payment">Stripe
   * immediately attempts payment for subscription changes</a>.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(String subscriptionExposedId, SubscriptionUpdateParams params)
      throws StripeException {
    return update(subscriptionExposedId, params, (RequestOptions) null);
  }
  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date. Learn about how <a
   * href="https://stripe.com/docs/billing/subscriptions/upgrade-downgrade#immediate-payment">Stripe
   * immediately attempts payment for subscription changes</a>.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    return update(subscriptionExposedId, (SubscriptionUpdateParams) null, options);
  }
  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date. Learn about how <a
   * href="https://stripe.com/docs/billing/subscriptions/upgrade-downgrade#immediate-payment">Stripe
   * immediately attempts payment for subscription changes</a>.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(String subscriptionExposedId) throws StripeException {
    return update(subscriptionExposedId, (SubscriptionUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date. Learn about how <a
   * href="https://stripe.com/docs/billing/subscriptions/upgrade-downgrade#immediate-payment">Stripe
   * immediately attempts payment for subscription changes</a>.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(
      String subscriptionExposedId, SubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
  /** Removes the currently applied discount on a subscription. */
  public Discount deleteDiscount(String subscriptionExposedId) throws StripeException {
    return deleteDiscount(subscriptionExposedId, (RequestOptions) null);
  }
  /** Removes the currently applied discount on a subscription. */
  public Discount deleteDiscount(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscriptions/%s/discount", ApiResource.urlEncodeId(subscriptionExposedId));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Discount.class);
  }
  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public StripeCollection<Subscription> list(SubscriptionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public StripeCollection<Subscription> list(RequestOptions options) throws StripeException {
    return list((SubscriptionListParams) null, options);
  }
  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public StripeCollection<Subscription> list() throws StripeException {
    return list((SubscriptionListParams) null, (RequestOptions) null);
  }
  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public StripeCollection<Subscription> list(SubscriptionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Subscription>>() {}.getType());
  }
  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public Subscription create(SubscriptionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public Subscription create(RequestOptions options) throws StripeException {
    return create((SubscriptionCreateParams) null, options);
  }
  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public Subscription create() throws StripeException {
    return create((SubscriptionCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public Subscription create(SubscriptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Subscription> search(SubscriptionSearchParams params)
      throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Subscription> search(
      SubscriptionSearchParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscriptions/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeSearchResult<Subscription>>() {}.getType());
  }
  /** Upgrade the billing_mode of an existing subscription. */
  public Subscription migrate(String subscription, SubscriptionMigrateParams params)
      throws StripeException {
    return migrate(subscription, params, (RequestOptions) null);
  }
  /** Upgrade the billing_mode of an existing subscription. */
  public Subscription migrate(
      String subscription, SubscriptionMigrateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s/migrate", ApiResource.urlEncodeId(subscription));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(String subscription, SubscriptionResumeParams params)
      throws StripeException {
    return resume(subscription, params, (RequestOptions) null);
  }
  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(String subscription, RequestOptions options) throws StripeException {
    return resume(subscription, (SubscriptionResumeParams) null, options);
  }
  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(String subscription) throws StripeException {
    return resume(subscription, (SubscriptionResumeParams) null, (RequestOptions) null);
  }
  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(
      String subscription, SubscriptionResumeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s/resume", ApiResource.urlEncodeId(subscription));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Subscription.class);
  }
}
