// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.Event;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.EventListParams;

public final class EventService extends ApiService {
  public EventService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List events, going back up to 30 days. */
  public StripeCollection<Event> list(EventListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List events, going back up to 30 days. */
  public StripeCollection<Event> list(RequestOptions options) throws StripeException {
    return list((EventListParams) null, options);
  }
  /** List events, going back up to 30 days. */
  public StripeCollection<Event> list() throws StripeException {
    return list((EventListParams) null, (RequestOptions) null);
  }
  /** List events, going back up to 30 days. */
  public StripeCollection<Event> list(EventListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/events";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Event>>() {}.getType());
  }
  /** Retrieves the details of an event. */
  public Event retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an event. */
  public Event retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/events/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Event.class);
  }
}
