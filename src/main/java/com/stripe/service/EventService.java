// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.EventListParams;
import com.stripe.param.EventRetrieveParams;

public final class EventService extends ApiService {
  public EventService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public StripeCollection<Event> list(EventListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public StripeCollection<Event> list(RequestOptions options) throws StripeException {
    return list((EventListParams) null, options);
  }
  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public StripeCollection<Event> list() throws StripeException {
    return list((EventListParams) null, (RequestOptions) null);
  }
  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public StripeCollection<Event> list(EventListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/events";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Event>>() {}.getType(),
            options,
            ApiMode.V1);
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
  public Event retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (EventRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public Event retrieve(String id) throws StripeException {
    return retrieve(id, (EventRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public Event retrieve(String id, EventRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/events/%s", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Event.class,
            options,
            ApiMode.V1);
  }
}
