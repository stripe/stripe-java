// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
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
  public StripeCollection<InvoiceLineItem> list(String id, InvoiceLineItemListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (InvoiceLineItemListParams) null, options);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(String id) throws StripeException {
    return list(id, (InvoiceLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total
   * count of line items and the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(
      String id, InvoiceLineItemListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/invoices/%s/lines", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<InvoiceLineItem>>() {}.getType());
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(String invoiceId, String id, InvoiceLineItemUpdateParams params)
      throws StripeException {
    return update(invoiceId, id, params, (RequestOptions) null);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(String invoiceId, String id, RequestOptions options)
      throws StripeException {
    return update(invoiceId, id, (InvoiceLineItemUpdateParams) null, options);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(String invoiceId, String id) throws StripeException {
    return update(invoiceId, id, (InvoiceLineItemUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(
      String invoiceId, String id, InvoiceLineItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoices/%s/lines/%s",
            ApiResource.urlEncodeId(invoiceId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InvoiceLineItem.class);
  }
  /** Serializes an InvoiceLineItem update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String invoiceId, String id, InvoiceLineItemUpdateParams params) throws StripeException {
    return serializeBatchUpdate(invoiceId, id, params, (RequestOptions) null);
  }
  /** Serializes an InvoiceLineItem update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String invoiceId, String id, InvoiceLineItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("invoice_id", invoiceId);
    pathParams.put("id", id);
    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("path_params", pathParams);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
}
