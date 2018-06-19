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
      APIConnectionException, CardException, APIException {
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
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.request(APIResource.RequestMethod.POST, url, params, Refund.class, options);
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
      APIConnectionException, CardException, APIException {
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
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.requestCollection(url, params, ChargeRefundCollection.class, options);
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
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a charge refund.
   *
   * @deprecated Prefer using the {@link Refund#retrieve(String, RequestOptions)} method instead.
   */
  @Deprecated
  public Refund retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
    return APIResource.request(APIResource.RequestMethod.GET, url, null, Refund.class, options);
  }
  // </editor-fold>
}
