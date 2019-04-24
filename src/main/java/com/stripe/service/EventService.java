package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.EventCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.EventListParams;
import com.stripe.param.EventRetrieveParams;

public class EventService extends ApiService {
  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a href="/docs/api/events/object">event object</a>
   * <code>api_version</code> attribute (not according to your current Stripe API version or <code>
   * Stripe-Version</code> header).
   */
  public EventCollection list(EventListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a href="/docs/api/events/object">event object</a>
   * <code>api_version</code> attribute (not according to your current Stripe API version or <code>
   * Stripe-Version</code> header).
   */
  public EventCollection list(EventListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/events");
    return requestCollection(url, params, EventCollection.class, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public Event retrieve(String id, EventRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public Event retrieve(String id, EventRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/events/%s", id);
    return request(ApiResource.RequestMethod.GET, url, params, Event.class, options);
  }
}
