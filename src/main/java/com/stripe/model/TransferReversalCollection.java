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

public class TransferReversalCollection extends StripeCollection<Reversal> {
  // <editor-fold desc="create">
  /**
   * Create a reversal.
   */
  public Reversal create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a reversal.
   */
  public Reversal create(Map<String, Object> params,
               RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return APIResource.request(APIResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getURL()), params, Reversal.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.requestCollection(url, params, TransferReversalCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a reversal.
   */
  public Reversal retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a reversal.
   */
  @Deprecated
  public Reversal retrieve(String id, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Retrieve a reversal.
   */
  public Reversal retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
    return APIResource.request(APIResource.RequestMethod.GET, url, null, Reversal.class, options);
  }
  // </editor-fold>
}
