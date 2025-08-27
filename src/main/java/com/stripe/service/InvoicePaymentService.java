// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoicePayment;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoicePaymentListParams;
import com.stripe.param.InvoicePaymentRetrieveParams;

public final class InvoicePaymentService extends ApiService {
  public InvoicePaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public StripeCollection<InvoicePayment> list(InvoicePaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public StripeCollection<InvoicePayment> list(RequestOptions options) throws StripeException {
    return list((InvoicePaymentListParams) null, options);
  }
  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public StripeCollection<InvoicePayment> list() throws StripeException {
    return list((InvoicePaymentListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public StripeCollection<InvoicePayment> list(
      InvoicePaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/invoice_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<InvoicePayment>>() {}.getType());
  }
  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String invoicePayment, InvoicePaymentRetrieveParams params)
      throws StripeException {
    return retrieve(invoicePayment, params, (RequestOptions) null);
  }
  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String invoicePayment, RequestOptions options)
      throws StripeException {
    return retrieve(invoicePayment, (InvoicePaymentRetrieveParams) null, options);
  }
  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String invoicePayment) throws StripeException {
    return retrieve(invoicePayment, (InvoicePaymentRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(
      String invoicePayment, InvoicePaymentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoice_payments/%s", ApiResource.urlEncodeId(invoicePayment));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InvoicePayment.class);
  }
}
