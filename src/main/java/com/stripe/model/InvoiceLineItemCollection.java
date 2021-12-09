// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.InvoiceLineItemCollectionListParams;
import java.util.Map;

public class InvoiceLineItemCollection extends StripeCollection<InvoiceLineItem> {
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public InvoiceLineItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, InvoiceLineItemCollection.class, options);
  }

  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public InvoiceLineItemCollection list(InvoiceLineItemCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public InvoiceLineItemCollection list(
      InvoiceLineItemCollectionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, InvoiceLineItemCollection.class, options);
  }
}
