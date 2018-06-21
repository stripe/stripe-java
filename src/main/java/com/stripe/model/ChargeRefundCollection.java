package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
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
  public Refund create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} instead.
   */
  @Deprecated
  public Refund create(Map<String, Object> params,
             RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
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
  public ChargeRefundCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all charge refunds.
   *
   * @deprecated Prefer using the {@link Refund#list(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public ChargeRefundCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
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
  public Refund retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#retrieve(String, RequestOptions)} method instead.
   */
  @Deprecated
  public Refund retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getUrl(), id);
    return ApiResource.request(ApiResource.RequestMethod.GET, url, null, Refund.class, options);
  }
  // </editor-fold>
}
