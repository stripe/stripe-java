// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Discount;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.model.Subscription;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionCancelParams;
import com.stripe.param.SubscriptionCreateParams;
import com.stripe.param.SubscriptionListParams;
import com.stripe.param.SubscriptionResumeParams;
import com.stripe.param.SubscriptionRetrieveParams;
import com.stripe.param.SubscriptionSearchParams;
import com.stripe.param.SubscriptionUpdateParams;

public final class SubscriptionService extends ApiService {
  public SubscriptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeSearchResult<Subscription>>() {}.getType(),
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Subscription>>() {}.getType(),
            options,
            ApiMode.V1);
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
  public Subscription create(SubscriptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(String subscriptionExposedId, SubscriptionUpdateParams params)
      throws StripeException {
    return update(subscriptionExposedId, params, (RequestOptions) null);
  }
  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    return update(subscriptionExposedId, (SubscriptionUpdateParams) null, options);
  }
  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(String subscriptionExposedId) throws StripeException {
    return update(subscriptionExposedId, (SubscriptionUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(
      String subscriptionExposedId, SubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }
  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
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
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
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
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(String subscriptionExposedId) throws StripeException {
    return cancel(subscriptionExposedId, (SubscriptionCancelParams) null, (RequestOptions) null);
  }
  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            null,
            Discount.class,
            options,
            ApiMode.V1);
  }
}
