package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ExternalAccountCollection extends StripeCollection<ExternalAccount> {
  // <editor-fold desc="all">
  @Deprecated
  public ExternalAccountCollection all(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  @Deprecated
  public ExternalAccountCollection all(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return list(params, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  public ExternalAccount create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  public ExternalAccount create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, ExternalAccount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  public ExternalAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  public ExternalAccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, ExternalAccountCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  public ExternalAccount retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  public ExternalAccount retrieve(String id, RequestOptions options) throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.GET, String.format("%s%s/%s",
        Stripe.getApiBase(), this.getUrl(), id), null, ExternalAccount.class, options);
  }
  // </editor-fold>
}
