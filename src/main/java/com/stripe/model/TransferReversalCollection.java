package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class TransferReversalCollection extends StripeCollection<Reversal> {
  // <editor-fold desc="create">
  /**
   * Create a reversal.
   */
  public Reversal create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a reversal.
   */
  public Reversal create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, Reversal.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, TransferReversalCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a reversal.
   */
  public Reversal retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a reversal.
   */
  @Deprecated
  public Reversal retrieve(String id, String apiKey) throws StripeException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Retrieve a reversal.
   */
  public Reversal retrieve(String id, RequestOptions options) throws StripeException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Reversal.class, options);
  }
  // </editor-fold>
}
