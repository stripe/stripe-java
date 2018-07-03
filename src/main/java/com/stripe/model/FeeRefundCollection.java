package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class FeeRefundCollection extends StripeCollection<FeeRefund> {
  // <editor-fold desc="create">
  /**
   * Create an application fee refund.
   */
  public FeeRefund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an application fee refund.
   */
  public FeeRefund create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, FeeRefund.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all application fee refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all application fee refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, FeeRefundCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an application fee refund.
   */
  public FeeRefund retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an application fee refund.
   */
  public FeeRefund retrieve(String id, RequestOptions options) throws StripeException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, FeeRefund.class, options);
  }
  // </editor-fold>
}
