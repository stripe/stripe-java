package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

public class ExternalAccountSourceCollection extends StripeCollection<ExternalAccountSource> {
  /** List external accounts for an account. */
  public ExternalAccountSourceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountSourceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(
        url, params, ExternalAccountSourceCollection.class, options);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccountSource retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccountSource retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccountSource retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("%s/%s", this.getUrl(), id));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ExternalAccountSource.class, options);
  }

  /** Create an external account for a given account. */
  public ExternalAccountSource create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccountSource create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ExternalAccountSource.class, options);
  }
}
