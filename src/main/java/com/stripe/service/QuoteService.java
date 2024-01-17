// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceLineItem;
import com.stripe.model.Quote;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuoteAcceptParams;
import com.stripe.param.QuoteCancelParams;
import com.stripe.param.QuoteCreateParams;
import com.stripe.param.QuoteFinalizeQuoteParams;
import com.stripe.param.QuoteListParams;
import com.stripe.param.QuoteListPreviewInvoiceLinesParams;
import com.stripe.param.QuoteMarkDraftParams;
import com.stripe.param.QuoteMarkStaleParams;
import com.stripe.param.QuotePdfParams;
import com.stripe.param.QuoteReestimateParams;
import com.stripe.param.QuoteRetrieveParams;
import com.stripe.param.QuoteUpdateParams;
import java.io.InputStream;

public final class QuoteService extends ApiService {
  public QuoteService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your quotes. */
  public StripeCollection<Quote> list(QuoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your quotes. */
  public StripeCollection<Quote> list(RequestOptions options) throws StripeException {
    return list((QuoteListParams) null, options);
  }
  /** Returns a list of your quotes. */
  public StripeCollection<Quote> list() throws StripeException {
    return list((QuoteListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your quotes. */
  public StripeCollection<Quote> list(QuoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Quote>>() {}.getType());
  }
  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public Quote create(QuoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public Quote create(RequestOptions options) throws StripeException {
    return create((QuoteCreateParams) null, options);
  }
  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public Quote create() throws StripeException {
    return create((QuoteCreateParams) null, (RequestOptions) null);
  }
  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public Quote create(QuoteCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** Retrieves the quote with the given ID. */
  public Quote retrieve(String quote, QuoteRetrieveParams params) throws StripeException {
    return retrieve(quote, params, (RequestOptions) null);
  }
  /** Retrieves the quote with the given ID. */
  public Quote retrieve(String quote, RequestOptions options) throws StripeException {
    return retrieve(quote, (QuoteRetrieveParams) null, options);
  }
  /** Retrieves the quote with the given ID. */
  public Quote retrieve(String quote) throws StripeException {
    return retrieve(quote, (QuoteRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the quote with the given ID. */
  public Quote retrieve(String quote, QuoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** A quote models prices and services for a customer. */
  public Quote update(String quote, QuoteUpdateParams params) throws StripeException {
    return update(quote, params, (RequestOptions) null);
  }
  /** A quote models prices and services for a customer. */
  public Quote update(String quote, RequestOptions options) throws StripeException {
    return update(quote, (QuoteUpdateParams) null, options);
  }
  /** A quote models prices and services for a customer. */
  public Quote update(String quote) throws StripeException {
    return update(quote, (QuoteUpdateParams) null, (RequestOptions) null);
  }
  /** A quote models prices and services for a customer. */
  public Quote update(String quote, QuoteUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** Accepts the specified quote. */
  public Quote accept(String quote, QuoteAcceptParams params) throws StripeException {
    return accept(quote, params, (RequestOptions) null);
  }
  /** Accepts the specified quote. */
  public Quote accept(String quote, RequestOptions options) throws StripeException {
    return accept(quote, (QuoteAcceptParams) null, options);
  }
  /** Accepts the specified quote. */
  public Quote accept(String quote) throws StripeException {
    return accept(quote, (QuoteAcceptParams) null, (RequestOptions) null);
  }
  /** Accepts the specified quote. */
  public Quote accept(String quote, QuoteAcceptParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/accept", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** Cancels the quote. */
  public Quote cancel(String quote, QuoteCancelParams params) throws StripeException {
    return cancel(quote, params, (RequestOptions) null);
  }
  /** Cancels the quote. */
  public Quote cancel(String quote, RequestOptions options) throws StripeException {
    return cancel(quote, (QuoteCancelParams) null, options);
  }
  /** Cancels the quote. */
  public Quote cancel(String quote) throws StripeException {
    return cancel(quote, (QuoteCancelParams) null, (RequestOptions) null);
  }
  /** Cancels the quote. */
  public Quote cancel(String quote, QuoteCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/cancel", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** Finalizes the quote. */
  public Quote finalizeQuote(String quote, QuoteFinalizeQuoteParams params) throws StripeException {
    return finalizeQuote(quote, params, (RequestOptions) null);
  }
  /** Finalizes the quote. */
  public Quote finalizeQuote(String quote, RequestOptions options) throws StripeException {
    return finalizeQuote(quote, (QuoteFinalizeQuoteParams) null, options);
  }
  /** Finalizes the quote. */
  public Quote finalizeQuote(String quote) throws StripeException {
    return finalizeQuote(quote, (QuoteFinalizeQuoteParams) null, (RequestOptions) null);
  }
  /** Finalizes the quote. */
  public Quote finalizeQuote(String quote, QuoteFinalizeQuoteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/finalize", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Quote.class);
  }
  /** Converts a stale quote to draft. */
  public Quote markDraft(String quote, QuoteMarkDraftParams params) throws StripeException {
    return markDraft(quote, params, (RequestOptions) null);
  }
  /** Converts a stale quote to draft. */
  public Quote markDraft(String quote, RequestOptions options) throws StripeException {
    return markDraft(quote, (QuoteMarkDraftParams) null, options);
  }
  /** Converts a stale quote to draft. */
  public Quote markDraft(String quote) throws StripeException {
    return markDraft(quote, (QuoteMarkDraftParams) null, (RequestOptions) null);
  }
  /** Converts a stale quote to draft. */
  public Quote markDraft(String quote, QuoteMarkDraftParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/mark_draft", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }
  /** Converts a draft or open quote to stale. */
  public Quote markStale(String quote, QuoteMarkStaleParams params) throws StripeException {
    return markStale(quote, params, (RequestOptions) null);
  }
  /** Converts a draft or open quote to stale. */
  public Quote markStale(String quote, RequestOptions options) throws StripeException {
    return markStale(quote, (QuoteMarkStaleParams) null, options);
  }
  /** Converts a draft or open quote to stale. */
  public Quote markStale(String quote) throws StripeException {
    return markStale(quote, (QuoteMarkStaleParams) null, (RequestOptions) null);
  }
  /** Converts a draft or open quote to stale. */
  public Quote markStale(String quote, QuoteMarkStaleParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/mark_stale", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }
  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(String quote, QuoteReestimateParams params) throws StripeException {
    return reestimate(quote, params, (RequestOptions) null);
  }
  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(String quote, RequestOptions options) throws StripeException {
    return reestimate(quote, (QuoteReestimateParams) null, options);
  }
  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(String quote) throws StripeException {
    return reestimate(quote, (QuoteReestimateParams) null, (RequestOptions) null);
  }
  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(String quote, QuoteReestimateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/reestimate", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }
  /** Download the PDF for a finalized quote. */
  public InputStream pdf(String quote, QuotePdfParams params) throws StripeException {
    return pdf(quote, params, (RequestOptions) null);
  }
  /** Download the PDF for a finalized quote. */
  public InputStream pdf(String quote, RequestOptions options) throws StripeException {
    return pdf(quote, (QuotePdfParams) null, options);
  }
  /** Download the PDF for a finalized quote. */
  public InputStream pdf(String quote) throws StripeException {
    return pdf(quote, (QuotePdfParams) null, (RequestOptions) null);
  }
  /** Download the PDF for a finalized quote. */
  public InputStream pdf(String quote, QuotePdfParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/pdf", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().requestStream(request);
  }
  /** Preview the invoice line items that would be generated by accepting the quote. */
  public StripeCollection<InvoiceLineItem> listPreviewInvoiceLines(
      String quote, String previewInvoice, QuoteListPreviewInvoiceLinesParams params)
      throws StripeException {
    return listPreviewInvoiceLines(quote, previewInvoice, params, (RequestOptions) null);
  }
  /** Preview the invoice line items that would be generated by accepting the quote. */
  public StripeCollection<InvoiceLineItem> listPreviewInvoiceLines(
      String quote, String previewInvoice, RequestOptions options) throws StripeException {
    return listPreviewInvoiceLines(
        quote, previewInvoice, (QuoteListPreviewInvoiceLinesParams) null, options);
  }
  /** Preview the invoice line items that would be generated by accepting the quote. */
  public StripeCollection<InvoiceLineItem> listPreviewInvoiceLines(
      String quote, String previewInvoice) throws StripeException {
    return listPreviewInvoiceLines(
        quote, previewInvoice, (QuoteListPreviewInvoiceLinesParams) null, (RequestOptions) null);
  }
  /** Preview the invoice line items that would be generated by accepting the quote. */
  public StripeCollection<InvoiceLineItem> listPreviewInvoiceLines(
      String quote,
      String previewInvoice,
      QuoteListPreviewInvoiceLinesParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/quotes/%s/preview_invoices/%s/lines",
            ApiResource.urlEncodeId(quote), ApiResource.urlEncodeId(previewInvoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<InvoiceLineItem>>() {}.getType());
  }

  public com.stripe.service.QuoteComputedUpfrontLineItemsService computedUpfrontLineItems() {
    return new com.stripe.service.QuoteComputedUpfrontLineItemsService(this.getResponseGetter());
  }

  public com.stripe.service.QuoteLineItemService lineItems() {
    return new com.stripe.service.QuoteLineItemService(this.getResponseGetter());
  }

  public com.stripe.service.QuoteLineService lines() {
    return new com.stripe.service.QuoteLineService(this.getResponseGetter());
  }

  public com.stripe.service.QuotePreviewInvoiceService previewInvoices() {
    return new com.stripe.service.QuotePreviewInvoiceService(this.getResponseGetter());
  }

  public com.stripe.service.QuotePreviewSubscriptionScheduleService previewSubscriptionSchedules() {
    return new com.stripe.service.QuotePreviewSubscriptionScheduleService(this.getResponseGetter());
  }
}
