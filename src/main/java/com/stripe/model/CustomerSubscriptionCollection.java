package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class CustomerSubscriptionCollection extends StripeCollection<Subscription> {
  // <editor-fold desc="create">
  /**
   * Create a subscription.
   *
   * @deprecated Prefer using the {@link Subscription#create(Map)} method instead.
   */
  @Deprecated
  public Subscription create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a subscription.
   *
   * @deprecated Prefer using the {@link Subscription#create(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public Subscription create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, Subscription.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all subscriptions.
   *
   * @deprecated Prefer using the {@link Subscription#list(Map)} method instead.
   */
  @Deprecated
  public CustomerSubscriptionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all subscriptions.
   *
   * @deprecated Prefer using the {@link Subscription#list(Map)} method instead.
   */
  @Deprecated
  public CustomerSubscriptionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.requestCollection(String.format("%s%s", Stripe.getApiBase(), this.getUrl()),
        params, CustomerSubscriptionCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a subscription.
   *
   * @deprecated Prefer using the {@link Subscription#retrieve(String)} method instead.
   */
  @Deprecated
  public Subscription retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a subscription.
   *
   * @deprecated Prefer using the {@link Subscription#retrieve(String)} method instead.
   */
  @Deprecated
  public Subscription retrieve(String id, RequestOptions options) throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.GET, String.format("%s%s/%s",
        Stripe.getApiBase(), this.getUrl(), id), null, Subscription.class, options);
  }
  // </editor-fold>
}
