// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.EphemeralKeyCreateParams;
import com.stripe.param.EphemeralKeyDeleteParams;
import java.util.Map;

public final class EphemeralKeyService extends ApiService {
  public EphemeralKeyService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create(EphemeralKeyCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create(RequestOptions options) throws StripeException {
    return create((EphemeralKeyCreateParams) null, options);
  }
  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create() throws StripeException {
    return create((EphemeralKeyCreateParams) null, (RequestOptions) null);
  }
  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    String versionOverride;
    Map<String, Object> paramsMap = ApiRequestParams.paramsToMap(params);

    if (!paramsMap.containsKey("stripe-version")) {
      throw new IllegalArgumentException(
          "`stripe-version` must be explicitly specified in "
              + "`params` as the stripe version of your mobile client.");
    }
    try {
      versionOverride = (String) paramsMap.get("stripe-version");
    } catch (ClassCastException e) {
      throw new IllegalArgumentException(
          "`stripe-version` must be explicitly specified in " + "`params` as a string");
    }
    if (options == null) {
      options = RequestOptions.getDefault();
    }
    // Take "stripe-version" from params and plug it into RequestOptions
    // so it will be sent in the Stripe-Version header
    final RequestOptions overriddenOptions =
        com.stripe.net.RequestOptions.RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                options.toBuilderFullCopy(), versionOverride)
            .build();

    // Remove "stripe-version" from params so that it is not sent in the
    // request body.
    final Map<String, Object> overriddenParams = new java.util.HashMap<String, Object>(paramsMap);
    overriddenParams.remove("stripe-version");

    String path = "/v1/ephemeral_keys";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            overriddenParams,
            EphemeralKey.class,
            overriddenOptions,
            ApiMode.V1);
  }
  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key, EphemeralKeyDeleteParams params) throws StripeException {
    return delete(key, params, (RequestOptions) null);
  }
  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key, RequestOptions options) throws StripeException {
    return delete(key, (EphemeralKeyDeleteParams) null, options);
  }
  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key) throws StripeException {
    return delete(key, (EphemeralKeyDeleteParams) null, (RequestOptions) null);
  }
  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key, EphemeralKeyDeleteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/ephemeral_keys/%s", ApiResource.urlEncodeId(key));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            EphemeralKey.class,
            options,
            ApiMode.V1);
  }
}
