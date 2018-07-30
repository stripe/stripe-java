package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class InvoiceLineItemCollection extends StripeCollection<InvoiceLineItem> {
  // <editor-fold desc="list">
  /**
   * Retrieve an invoice's line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * Retrieve an invoice's line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, InvoiceLineItemCollection.class, options);
  }
  // </editor-fold>
}
