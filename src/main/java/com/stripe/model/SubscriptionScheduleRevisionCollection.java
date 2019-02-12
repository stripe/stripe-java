package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

public class SubscriptionScheduleRevisionCollection
    extends StripeCollection<SubscriptionScheduleRevision> {
  /** Retrieves the list of subscription schedule revisions for a subscription schedule. */
  public SubscriptionScheduleRevisionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves the list of subscription schedule revisions for a subscription schedule. */
  public SubscriptionScheduleRevisionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(
        url, params, SubscriptionScheduleRevisionCollection.class, options);
  }

  /**
   * Retrieves the details of an existing subscription schedule revision. You only need to supply
   * the unique subscription schedule revision identifier that was returned upon subscription
   * schedule creation or retrieval.
   */
  public SubscriptionScheduleRevision retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing subscription schedule revision. You only need to supply
   * the unique subscription schedule revision identifier that was returned upon subscription
   * schedule creation or retrieval.
   */
  public SubscriptionScheduleRevision retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing subscription schedule revision. You only need to supply
   * the unique subscription schedule revision identifier that was returned upon subscription
   * schedule creation or retrieval.
   */
  public SubscriptionScheduleRevision retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("%s/%s", this.getUrl(), id));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionScheduleRevision.class, options);
  }
}
