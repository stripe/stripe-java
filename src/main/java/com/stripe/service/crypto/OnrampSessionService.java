// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.crypto.OnrampSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.OnrampSessionCheckoutParams;
import com.stripe.param.crypto.OnrampSessionCreateParams;
import com.stripe.param.crypto.OnrampSessionListParams;
import com.stripe.param.crypto.OnrampSessionQuoteParams;
import com.stripe.param.crypto.OnrampSessionRetrieveParams;

public final class OnrampSessionService extends ApiService {
  public OnrampSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public StripeCollection<OnrampSession> list(OnrampSessionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public StripeCollection<OnrampSession> list(RequestOptions options) throws StripeException {
    return list((OnrampSessionListParams) null, options);
  }
  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public StripeCollection<OnrampSession> list() throws StripeException {
    return list((OnrampSessionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public StripeCollection<OnrampSession> list(
      OnrampSessionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OnrampSession>>() {}.getType());
  }
  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public OnrampSession create(OnrampSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public OnrampSession create(RequestOptions options) throws StripeException {
    return create((OnrampSessionCreateParams) null, options);
  }
  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public OnrampSession create() throws StripeException {
    return create((OnrampSessionCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public OnrampSession create(OnrampSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnrampSession.class);
  }
  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public OnrampSession retrieve(String id, OnrampSessionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public OnrampSession retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (OnrampSessionRetrieveParams) null, options);
  }
  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public OnrampSession retrieve(String id) throws StripeException {
    return retrieve(id, (OnrampSessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public OnrampSession retrieve(
      String id, OnrampSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/onramp_sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnrampSession.class);
  }
  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(String id, OnrampSessionCheckoutParams params)
      throws StripeException {
    return checkout(id, params, (RequestOptions) null);
  }
  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(String id, RequestOptions options) throws StripeException {
    return checkout(id, (OnrampSessionCheckoutParams) null, options);
  }
  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(String id) throws StripeException {
    return checkout(id, (OnrampSessionCheckoutParams) null, (RequestOptions) null);
  }
  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(
      String id, OnrampSessionCheckoutParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/crypto/onramp_sessions/%s/checkout", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnrampSession.class);
  }
  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(String id, OnrampSessionQuoteParams params) throws StripeException {
    return quote(id, params, (RequestOptions) null);
  }
  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(String id, RequestOptions options) throws StripeException {
    return quote(id, (OnrampSessionQuoteParams) null, options);
  }
  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(String id) throws StripeException {
    return quote(id, (OnrampSessionQuoteParams) null, (RequestOptions) null);
  }
  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(String id, OnrampSessionQuoteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/onramp_sessions/%s/quote", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnrampSession.class);
  }
}
