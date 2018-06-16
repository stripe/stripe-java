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

public class InvoiceLineItemCollection extends StripeCollection<InvoiceLineItem> {
  // <editor-fold desc="all">
  /**
   * Retrieve an invoice's line items.
   *
   * @deprecated Use the {@link #list(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public InvoiceLineItemCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * Retrieve an invoice's line items.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public InvoiceLineItemCollection all(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }

  /**
   * Retrieve an invoice's line items.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public InvoiceLineItemCollection all(Map<String, Object> params,
                     String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * Retrieve an invoice's line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * Retrieve an invoice's line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
    return APIResource.requestCollection(url, params, InvoiceLineItemCollection.class, options);
  }
  // </editor-fold>
}
