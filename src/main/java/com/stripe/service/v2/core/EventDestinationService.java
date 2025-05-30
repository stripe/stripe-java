// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.EventDestination;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.EventDestinationCreateParams;
import com.stripe.param.v2.core.EventDestinationListParams;
import com.stripe.param.v2.core.EventDestinationRetrieveParams;
import com.stripe.param.v2.core.EventDestinationUpdateParams;
import com.stripe.v2.DeletedObject;

public final class EventDestinationService extends ApiService {
  public EventDestinationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all event destinations. */
  public StripeCollection<EventDestination> list(EventDestinationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all event destinations. */
  public StripeCollection<EventDestination> list(RequestOptions options) throws StripeException {
    return list((EventDestinationListParams) null, options);
  }
  /** Lists all event destinations. */
  public StripeCollection<EventDestination> list() throws StripeException {
    return list((EventDestinationListParams) null, (RequestOptions) null);
  }
  /** Lists all event destinations. */
  public StripeCollection<EventDestination> list(
      EventDestinationListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/core/event_destinations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<EventDestination>>() {}.getType());
  }
  /** Create a new event destination. */
  public EventDestination create(EventDestinationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new event destination. */
  public EventDestination create(EventDestinationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/event_destinations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, EventDestination.class);
  }
  /** Delete an event destination. */
  public DeletedObject delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Delete an event destination. */
  public DeletedObject delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/event_destinations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, DeletedObject.class);
  }
  /** Retrieves the details of an event destination. */
  public EventDestination retrieve(String id, EventDestinationRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an event destination. */
  public EventDestination retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (EventDestinationRetrieveParams) null, options);
  }
  /** Retrieves the details of an event destination. */
  public EventDestination retrieve(String id) throws StripeException {
    return retrieve(id, (EventDestinationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an event destination. */
  public EventDestination retrieve(
      String id, EventDestinationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/event_destinations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, EventDestination.class);
  }
  /** Update the details of an event destination. */
  public EventDestination update(String id, EventDestinationUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update the details of an event destination. */
  public EventDestination update(String id, RequestOptions options) throws StripeException {
    return update(id, (EventDestinationUpdateParams) null, options);
  }
  /** Update the details of an event destination. */
  public EventDestination update(String id) throws StripeException {
    return update(id, (EventDestinationUpdateParams) null, (RequestOptions) null);
  }
  /** Update the details of an event destination. */
  public EventDestination update(
      String id, EventDestinationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/event_destinations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, EventDestination.class);
  }
  /** Disable an event destination. */
  public EventDestination disable(String id) throws StripeException {
    return disable(id, (RequestOptions) null);
  }
  /** Disable an event destination. */
  public EventDestination disable(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/core/event_destinations/%s/disable", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, EventDestination.class);
  }
  /** Enable an event destination. */
  public EventDestination enable(String id) throws StripeException {
    return enable(id, (RequestOptions) null);
  }
  /** Enable an event destination. */
  public EventDestination enable(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/core/event_destinations/%s/enable", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, EventDestination.class);
  }
  /** Send a {@code ping} event to an event destination. */
  public Event ping(String id) throws StripeException {
    return ping(id, (RequestOptions) null);
  }
  /** Send a {@code ping} event to an event destination. */
  public Event ping(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/event_destinations/%s/ping", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Event.class);
  }
}
