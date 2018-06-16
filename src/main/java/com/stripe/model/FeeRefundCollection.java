package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class FeeRefundCollection extends StripeCollection<FeeRefund> {
  // <editor-fold desc="all">
  /**
   * List all application fee refunds.
   *
   * @deprecated Use the {@link #list(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public FeeRefundCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all application fee refunds.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public FeeRefundCollection all(Map<String, Object> params,
                   RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }

  /**
   * List all application fee refunds.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public FeeRefundCollection all(Map<String, Object> params,
                   String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an application fee refund.
   */
  public FeeRefund create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an application fee refund.
   */
  public FeeRefund create(Map<String, Object> params,
              RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return APIResource.request(APIResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getURL()), params, FeeRefund.class, options);
  }

  /**
   * Create an application fee refund.
   *
   * @deprecated Use the {@link #create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public FeeRefund create(Map<String, Object> params,
              String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all application fee refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all application fee refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params,
                  RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.requestCollection(url, params, FeeRefundCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an application fee refund.
   */
  public FeeRefund retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an application fee refund.
   */
  public FeeRefund retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
    return APIResource.request(APIResource.RequestMethod.GET, url, null, FeeRefund.class, options);
  }

  /**
   * Retrieve an application fee refund.
   *
   * @deprecated Use the {@link #retrieve(String, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public FeeRefund retrieve(String id, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>
}
