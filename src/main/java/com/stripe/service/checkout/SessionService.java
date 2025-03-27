// File generated from our OpenAPI spec
package com.stripe.service.checkout;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.checkout.Session;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionExpireParams;
import com.stripe.param.checkout.SessionListParams;
import com.stripe.param.checkout.SessionRetrieveParams;
import com.stripe.param.checkout.SessionUpdateParams;

public final class SessionService extends ApiService {
  public SessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Checkout Sessions. */
  public StripeCollection<Session> list(SessionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Checkout Sessions. */
  public StripeCollection<Session> list(RequestOptions options) throws StripeException {
    return list((SessionListParams) null, options);
  }
  /** Returns a list of Checkout Sessions. */
  public StripeCollection<Session> list() throws StripeException {
    return list((SessionListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Checkout Sessions. */
  public StripeCollection<Session> list(SessionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Session>>() {}.getType());
  }
  /** Creates a Checkout Session object. */
  public Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a Checkout Session object. */
  public Session create(RequestOptions options) throws StripeException {
    return create((SessionCreateParams) null, options);
  }
  /** Creates a Checkout Session object. */
  public Session create() throws StripeException {
    return create((SessionCreateParams) null, (RequestOptions) null);
  }
  /** Creates a Checkout Session object. */
  public Session create(SessionCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/checkout/sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }
  /** Retrieves a Checkout Session object. */
  public Session retrieve(String session, SessionRetrieveParams params) throws StripeException {
    return retrieve(session, params, (RequestOptions) null);
  }
  /** Retrieves a Checkout Session object. */
  public Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (SessionRetrieveParams) null, options);
  }
  /** Retrieves a Checkout Session object. */
  public Session retrieve(String session) throws StripeException {
    return retrieve(session, (SessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Checkout Session object. */
  public Session retrieve(String session, SessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }
  /** Updates a Checkout Session object. */
  public Session update(String session, SessionUpdateParams params) throws StripeException {
    return update(session, params, (RequestOptions) null);
  }
  /** Updates a Checkout Session object. */
  public Session update(String session, RequestOptions options) throws StripeException {
    return update(session, (SessionUpdateParams) null, options);
  }
  /** Updates a Checkout Session object. */
  public Session update(String session) throws StripeException {
    return update(session, (SessionUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a Checkout Session object. */
  public Session update(String session, SessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }
  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(String session, SessionExpireParams params) throws StripeException {
    return expire(session, params, (RequestOptions) null);
  }
  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(String session, RequestOptions options) throws StripeException {
    return expire(session, (SessionExpireParams) null, options);
  }
  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(String session) throws StripeException {
    return expire(session, (SessionExpireParams) null, (RequestOptions) null);
  }
  /**
   * A Checkout Session can be expired when it is in one of these statuses: {@code open}
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the
   * Checkout Session see a message saying the Checkout Session is expired.
   */
  public Session expire(String session, SessionExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/expire", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }

  public com.stripe.service.checkout.SessionLineItemService lineItems() {
    return new com.stripe.service.checkout.SessionLineItemService(this.getResponseGetter());
  }
}
