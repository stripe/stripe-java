// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceLineItemListParams;
import com.stripe.param.InvoiceLineItemUpdateParams;

public final class InvoiceLineItemService extends ApiService {
  public InvoiceLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(String invoice, InvoiceLineItemListParams params)
      throws StripeException {
    return list(invoice, params, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(String invoice, RequestOptions options)
      throws StripeException {
    return list(invoice, (InvoiceLineItemListParams) null, options);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(String invoice) throws StripeException {
    return list(invoice, (InvoiceLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(
      String invoice, InvoiceLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/lines", ApiResource.urlEncodeId(invoice));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<InvoiceLineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(
      String invoice, String lineItemId, InvoiceLineItemUpdateParams params)
      throws StripeException {
    return update(invoice, lineItemId, params, (RequestOptions) null);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(String invoice, String lineItemId, RequestOptions options)
      throws StripeException {
    return update(invoice, lineItemId, (InvoiceLineItemUpdateParams) null, options);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(String invoice, String lineItemId) throws StripeException {
    return update(invoice, lineItemId, (InvoiceLineItemUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(
      String invoice, String lineItemId, InvoiceLineItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoices/%s/lines/%s",
            ApiResource.urlEncodeId(invoice), ApiResource.urlEncodeId(lineItemId));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoiceLineItem.class,
            options,
            ApiMode.V1);
  }
}
