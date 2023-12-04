// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceItemCreateParams;
import com.stripe.param.InvoiceItemListParams;
import com.stripe.param.InvoiceItemRetrieveParams;
import com.stripe.param.InvoiceItemUpdateParams;

public final class InvoiceItemService extends ApiService {
  public InvoiceItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public StripeCollection<InvoiceItem> list(InvoiceItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public StripeCollection<InvoiceItem> list(RequestOptions options) throws StripeException {
    return list((InvoiceItemListParams) null, options);
  }
  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public StripeCollection<InvoiceItem> list() throws StripeException {
    return list((InvoiceItemListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public StripeCollection<InvoiceItem> list(InvoiceItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<InvoiceItem>>() {}.getType());
  }
  /**
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public InvoiceItem create(InvoiceItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public InvoiceItem create(InvoiceItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoiceItem.class);
  }
  /** Retrieves the invoice item with the given ID. */
  public InvoiceItem retrieve(String invoiceitem, InvoiceItemRetrieveParams params)
      throws StripeException {
    return retrieve(invoiceitem, params, (RequestOptions) null);
  }
  /** Retrieves the invoice item with the given ID. */
  public InvoiceItem retrieve(String invoiceitem, RequestOptions options) throws StripeException {
    return retrieve(invoiceitem, (InvoiceItemRetrieveParams) null, options);
  }
  /** Retrieves the invoice item with the given ID. */
  public InvoiceItem retrieve(String invoiceitem) throws StripeException {
    return retrieve(invoiceitem, (InvoiceItemRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the invoice item with the given ID. */
  public InvoiceItem retrieve(
      String invoiceitem, InvoiceItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoiceItem.class);
  }
  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(String invoiceitem, InvoiceItemUpdateParams params)
      throws StripeException {
    return update(invoiceitem, params, (RequestOptions) null);
  }
  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(String invoiceitem, RequestOptions options) throws StripeException {
    return update(invoiceitem, (InvoiceItemUpdateParams) null, options);
  }
  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(String invoiceitem) throws StripeException {
    return update(invoiceitem, (InvoiceItemUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(
      String invoiceitem, InvoiceItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoiceItem.class);
  }
  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(String invoiceitem) throws StripeException {
    return delete(invoiceitem, (RequestOptions) null);
  }
  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(String invoiceitem, RequestOptions options) throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return getResponseGetter().request(request, InvoiceItem.class);
  }
}
