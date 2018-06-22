package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ChargeRefundCollection extends StripeCollection<Refund> {
  // <editor-fold desc="create">
  /**
   * Create a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} instead.
   */
  @Deprecated
  public Refund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} instead.
   */
  @Deprecated
  public Refund create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all charge refunds.
   *
   * @deprecated Prefer using the {@link Refund#list(Map)} method instead.
   */
  @Deprecated
  public ChargeRefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all charge refunds.
   *
   * @deprecated Prefer using the {@link Refund#list(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public ChargeRefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, ChargeRefundCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#retrieve(String)} method instead.
   */
  @Deprecated
  public Refund retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#retrieve(String, RequestOptions)} method instead.
   */
  @Deprecated
  public Refund retrieve(String id, RequestOptions options) throws StripeException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Refund.class, options);
  }
  // </editor-fold>
}
