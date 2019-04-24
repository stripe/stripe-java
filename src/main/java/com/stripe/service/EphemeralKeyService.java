package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.EphemeralKeyCreateParams;
import com.stripe.param.EphemeralKeyDeleteParams;

public class EphemeralKeyService extends ApiService {
  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create(EphemeralKeyCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a short-lived API key for a given resource. */
  public EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    if (options.getStripeVersionOverride() == null) {
      throw new IllegalArgumentException("`stripeVersionOverride` must be specified in "
          + "RequestOptions with stripe version of your mobile client.");
    }
    String url = resourceUrl("/v1/ephemeral_keys");
    return request(ApiResource.RequestMethod.POST, url, params, EphemeralKey.class, options);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key, EphemeralKeyDeleteParams params) throws StripeException {
    return delete(key, params, (RequestOptions) null);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(String key, EphemeralKeyDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/ephemeral_keys/%s", key);
    return request(ApiResource.RequestMethod.DELETE, url, params, EphemeralKey.class, options);
  }
}
