// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceAddLinesParams;
import com.stripe.param.InvoiceAttachPaymentParams;
import com.stripe.param.InvoiceCreateParams;
import com.stripe.param.InvoiceCreatePreviewParams;
import com.stripe.param.InvoiceFinalizeInvoiceParams;
import com.stripe.param.InvoiceListParams;
import com.stripe.param.InvoiceMarkUncollectibleParams;
import com.stripe.param.InvoicePayParams;
import com.stripe.param.InvoiceRemoveLinesParams;
import com.stripe.param.InvoiceRetrieveParams;
import com.stripe.param.InvoiceSearchParams;
import com.stripe.param.InvoiceSendInvoiceParams;
import com.stripe.param.InvoiceUpdateLinesParams;
import com.stripe.param.InvoiceUpdateParams;
import com.stripe.param.InvoiceVoidInvoiceParams;

public final class InvoiceService extends ApiService {
  public InvoiceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete(String invoice) throws StripeException {
    return delete(invoice, (RequestOptions) null);
  }
  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete(String invoice, RequestOptions options) throws StripeException {
    String path = String.format("/v1/invoices/%s", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Invoice.class);
  }
  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice, InvoiceRetrieveParams params) throws StripeException {
    return retrieve(invoice, params, (RequestOptions) null);
  }
  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice, RequestOptions options) throws StripeException {
    return retrieve(invoice, (InvoiceRetrieveParams) null, options);
  }
  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice) throws StripeException {
    return retrieve(invoice, (InvoiceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice, InvoiceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as {@code collection_method}, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass {@code auto_advance=false}.
   */
  public Invoice update(String invoice, InvoiceUpdateParams params) throws StripeException {
    return update(invoice, params, (RequestOptions) null);
  }
  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as {@code collection_method}, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass {@code auto_advance=false}.
   */
  public Invoice update(String invoice, RequestOptions options) throws StripeException {
    return update(invoice, (InvoiceUpdateParams) null, options);
  }
  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as {@code collection_method}, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass {@code auto_advance=false}.
   */
  public Invoice update(String invoice) throws StripeException {
    return update(invoice, (InvoiceUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as {@code collection_method}, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass {@code auto_advance=false}.
   */
  public Invoice update(String invoice, InvoiceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public StripeCollection<Invoice> list(InvoiceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public StripeCollection<Invoice> list(RequestOptions options) throws StripeException {
    return list((InvoiceListParams) null, options);
  }
  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public StripeCollection<Invoice> list() throws StripeException {
    return list((InvoiceListParams) null, (RequestOptions) null);
  }
  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public StripeCollection<Invoice> list(InvoiceListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoices";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Invoice>>() {}.getType());
  }
  /**
   * This endpoint creates a draft invoice for a given customer. The invoice remains a draft until
   * you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice, which
   * allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public Invoice create(InvoiceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * This endpoint creates a draft invoice for a given customer. The invoice remains a draft until
   * you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice, which
   * allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public Invoice create(RequestOptions options) throws StripeException {
    return create((InvoiceCreateParams) null, options);
  }
  /**
   * This endpoint creates a draft invoice for a given customer. The invoice remains a draft until
   * you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice, which
   * allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public Invoice create() throws StripeException {
    return create((InvoiceCreateParams) null, (RequestOptions) null);
  }
  /**
   * This endpoint creates a draft invoice for a given customer. The invoice remains a draft until
   * you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice, which
   * allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public Invoice create(InvoiceCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/invoices";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Search for invoices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Invoice> search(InvoiceSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for invoices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Invoice> search(InvoiceSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoices/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeSearchResult<Invoice>>() {}.getType());
  }
  /**
   * Adds multiple line items to an invoice. This is only possible when an invoice is still a draft.
   */
  public Invoice addLines(String invoice, InvoiceAddLinesParams params) throws StripeException {
    return addLines(invoice, params, (RequestOptions) null);
  }
  /**
   * Adds multiple line items to an invoice. This is only possible when an invoice is still a draft.
   */
  public Invoice addLines(String invoice, InvoiceAddLinesParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/add_lines", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Attaches a PaymentIntent or an Out of Band Payment to the invoice, adding it to the list of
   * {@code payments}.
   *
   * <p>For the PaymentIntent, when the PaymentIntent’s status changes to {@code succeeded}, the
   * payment is credited to the invoice, increasing its {@code amount_paid}. When the invoice is
   * fully paid, the invoice’s status becomes {@code paid}.
   *
   * <p>If the PaymentIntent’s status is already {@code succeeded} when it’s attached, it’s credited
   * to the invoice immediately.
   *
   * <p>See: <a href="https://stripe.com/docs/invoicing/partial-payments">Partial payments</a> to
   * learn more.
   */
  public Invoice attachPayment(String invoice, InvoiceAttachPaymentParams params)
      throws StripeException {
    return attachPayment(invoice, params, (RequestOptions) null);
  }
  /**
   * Attaches a PaymentIntent or an Out of Band Payment to the invoice, adding it to the list of
   * {@code payments}.
   *
   * <p>For the PaymentIntent, when the PaymentIntent’s status changes to {@code succeeded}, the
   * payment is credited to the invoice, increasing its {@code amount_paid}. When the invoice is
   * fully paid, the invoice’s status becomes {@code paid}.
   *
   * <p>If the PaymentIntent’s status is already {@code succeeded} when it’s attached, it’s credited
   * to the invoice immediately.
   *
   * <p>See: <a href="https://stripe.com/docs/invoicing/partial-payments">Partial payments</a> to
   * learn more.
   */
  public Invoice attachPayment(String invoice, RequestOptions options) throws StripeException {
    return attachPayment(invoice, (InvoiceAttachPaymentParams) null, options);
  }
  /**
   * Attaches a PaymentIntent or an Out of Band Payment to the invoice, adding it to the list of
   * {@code payments}.
   *
   * <p>For the PaymentIntent, when the PaymentIntent’s status changes to {@code succeeded}, the
   * payment is credited to the invoice, increasing its {@code amount_paid}. When the invoice is
   * fully paid, the invoice’s status becomes {@code paid}.
   *
   * <p>If the PaymentIntent’s status is already {@code succeeded} when it’s attached, it’s credited
   * to the invoice immediately.
   *
   * <p>See: <a href="https://stripe.com/docs/invoicing/partial-payments">Partial payments</a> to
   * learn more.
   */
  public Invoice attachPayment(String invoice) throws StripeException {
    return attachPayment(invoice, (InvoiceAttachPaymentParams) null, (RequestOptions) null);
  }
  /**
   * Attaches a PaymentIntent or an Out of Band Payment to the invoice, adding it to the list of
   * {@code payments}.
   *
   * <p>For the PaymentIntent, when the PaymentIntent’s status changes to {@code succeeded}, the
   * payment is credited to the invoice, increasing its {@code amount_paid}. When the invoice is
   * fully paid, the invoice’s status becomes {@code paid}.
   *
   * <p>If the PaymentIntent’s status is already {@code succeeded} when it’s attached, it’s credited
   * to the invoice immediately.
   *
   * <p>See: <a href="https://stripe.com/docs/invoicing/partial-payments">Partial payments</a> to
   * learn more.
   */
  public Invoice attachPayment(
      String invoice, InvoiceAttachPaymentParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/attach_payment", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(String invoice, InvoiceFinalizeInvoiceParams params)
      throws StripeException {
    return finalizeInvoice(invoice, params, (RequestOptions) null);
  }
  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(String invoice, RequestOptions options) throws StripeException {
    return finalizeInvoice(invoice, (InvoiceFinalizeInvoiceParams) null, options);
  }
  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(String invoice) throws StripeException {
    return finalizeInvoice(invoice, (InvoiceFinalizeInvoiceParams) null, (RequestOptions) null);
  }
  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(
      String invoice, InvoiceFinalizeInvoiceParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/finalize", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(String invoice, InvoiceMarkUncollectibleParams params)
      throws StripeException {
    return markUncollectible(invoice, params, (RequestOptions) null);
  }
  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(String invoice, RequestOptions options) throws StripeException {
    return markUncollectible(invoice, (InvoiceMarkUncollectibleParams) null, options);
  }
  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(String invoice) throws StripeException {
    return markUncollectible(invoice, (InvoiceMarkUncollectibleParams) null, (RequestOptions) null);
  }
  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(
      String invoice, InvoiceMarkUncollectibleParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/invoices/%s/mark_uncollectible", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice, InvoicePayParams params) throws StripeException {
    return pay(invoice, params, (RequestOptions) null);
  }
  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice, RequestOptions options) throws StripeException {
    return pay(invoice, (InvoicePayParams) null, options);
  }
  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice) throws StripeException {
    return pay(invoice, (InvoicePayParams) null, (RequestOptions) null);
  }
  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice, InvoicePayParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/pay", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Removes multiple line items from an invoice. This is only possible when an invoice is still a
   * draft.
   */
  public Invoice removeLines(String invoice, InvoiceRemoveLinesParams params)
      throws StripeException {
    return removeLines(invoice, params, (RequestOptions) null);
  }
  /**
   * Removes multiple line items from an invoice. This is only possible when an invoice is still a
   * draft.
   */
  public Invoice removeLines(
      String invoice, InvoiceRemoveLinesParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/remove_lines", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an {@code
   * invoice.sent} event.
   */
  public Invoice sendInvoice(String invoice, InvoiceSendInvoiceParams params)
      throws StripeException {
    return sendInvoice(invoice, params, (RequestOptions) null);
  }
  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an {@code
   * invoice.sent} event.
   */
  public Invoice sendInvoice(String invoice, RequestOptions options) throws StripeException {
    return sendInvoice(invoice, (InvoiceSendInvoiceParams) null, options);
  }
  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an {@code
   * invoice.sent} event.
   */
  public Invoice sendInvoice(String invoice) throws StripeException {
    return sendInvoice(invoice, (InvoiceSendInvoiceParams) null, (RequestOptions) null);
  }
  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an {@code
   * invoice.sent} event.
   */
  public Invoice sendInvoice(
      String invoice, InvoiceSendInvoiceParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/send", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Updates multiple line items on an invoice. This is only possible when an invoice is still a
   * draft.
   */
  public Invoice updateLines(String invoice, InvoiceUpdateLinesParams params)
      throws StripeException {
    return updateLines(invoice, params, (RequestOptions) null);
  }
  /**
   * Updates multiple line items on an invoice. This is only possible when an invoice is still a
   * draft.
   */
  public Invoice updateLines(
      String invoice, InvoiceUpdateLinesParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/update_lines", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   *
   * <p>Consult with local regulations to determine whether and how an invoice might be amended,
   * canceled, or voided in the jurisdiction you’re doing business in. You might need to <a
   * href="https://stripe.com/docs/api#create_invoice">issue another invoice</a> or <a
   * href="https://stripe.com/docs/api#create_credit_note">credit note</a> instead. Stripe
   * recommends that you consult with your legal counsel for advice specific to your business.
   */
  public Invoice voidInvoice(String invoice, InvoiceVoidInvoiceParams params)
      throws StripeException {
    return voidInvoice(invoice, params, (RequestOptions) null);
  }
  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   *
   * <p>Consult with local regulations to determine whether and how an invoice might be amended,
   * canceled, or voided in the jurisdiction you’re doing business in. You might need to <a
   * href="https://stripe.com/docs/api#create_invoice">issue another invoice</a> or <a
   * href="https://stripe.com/docs/api#create_credit_note">credit note</a> instead. Stripe
   * recommends that you consult with your legal counsel for advice specific to your business.
   */
  public Invoice voidInvoice(String invoice, RequestOptions options) throws StripeException {
    return voidInvoice(invoice, (InvoiceVoidInvoiceParams) null, options);
  }
  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   *
   * <p>Consult with local regulations to determine whether and how an invoice might be amended,
   * canceled, or voided in the jurisdiction you’re doing business in. You might need to <a
   * href="https://stripe.com/docs/api#create_invoice">issue another invoice</a> or <a
   * href="https://stripe.com/docs/api#create_credit_note">credit note</a> instead. Stripe
   * recommends that you consult with your legal counsel for advice specific to your business.
   */
  public Invoice voidInvoice(String invoice) throws StripeException {
    return voidInvoice(invoice, (InvoiceVoidInvoiceParams) null, (RequestOptions) null);
  }
  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   *
   * <p>Consult with local regulations to determine whether and how an invoice might be amended,
   * canceled, or voided in the jurisdiction you’re doing business in. You might need to <a
   * href="https://stripe.com/docs/api#create_invoice">issue another invoice</a> or <a
   * href="https://stripe.com/docs/api#create_credit_note">credit note</a> instead. Stripe
   * recommends that you consult with your legal counsel for advice specific to your business.
   */
  public Invoice voidInvoice(
      String invoice, InvoiceVoidInvoiceParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoices/%s/void", ApiResource.urlEncodeId(invoice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }
  /**
   * At any time, you can preview the upcoming invoice for a subscription or subscription schedule.
   * This will show you all the charges that are pending, including subscription renewal charges,
   * invoice item charges, etc. It will also show you any discounts that are applicable to the
   * invoice.
   *
   * <p>You can also preview the effects of creating or updating a subscription or subscription
   * schedule, including a preview of any prorations that will take place. To ensure that the actual
   * proration is calculated exactly the same as the previewed proration, you should pass the {@code
   * subscription_details.proration_date} parameter when doing the actual subscription update.
   *
   * <p>The recommended way to get only the prorations being previewed on the invoice is to consider
   * line items where {@code parent.subscription_item_details.proration} is {@code true}.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>Note: Currency conversion calculations use the latest exchange rates. Exchange rates may
   * vary between the time of the preview and the time of the actual invoice creation. <a
   * href="https://docs.stripe.com/currencies/conversions">Learn more</a>
   */
  public Invoice createPreview(InvoiceCreatePreviewParams params) throws StripeException {
    return createPreview(params, (RequestOptions) null);
  }
  /**
   * At any time, you can preview the upcoming invoice for a subscription or subscription schedule.
   * This will show you all the charges that are pending, including subscription renewal charges,
   * invoice item charges, etc. It will also show you any discounts that are applicable to the
   * invoice.
   *
   * <p>You can also preview the effects of creating or updating a subscription or subscription
   * schedule, including a preview of any prorations that will take place. To ensure that the actual
   * proration is calculated exactly the same as the previewed proration, you should pass the {@code
   * subscription_details.proration_date} parameter when doing the actual subscription update.
   *
   * <p>The recommended way to get only the prorations being previewed on the invoice is to consider
   * line items where {@code parent.subscription_item_details.proration} is {@code true}.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>Note: Currency conversion calculations use the latest exchange rates. Exchange rates may
   * vary between the time of the preview and the time of the actual invoice creation. <a
   * href="https://docs.stripe.com/currencies/conversions">Learn more</a>
   */
  public Invoice createPreview(RequestOptions options) throws StripeException {
    return createPreview((InvoiceCreatePreviewParams) null, options);
  }
  /**
   * At any time, you can preview the upcoming invoice for a subscription or subscription schedule.
   * This will show you all the charges that are pending, including subscription renewal charges,
   * invoice item charges, etc. It will also show you any discounts that are applicable to the
   * invoice.
   *
   * <p>You can also preview the effects of creating or updating a subscription or subscription
   * schedule, including a preview of any prorations that will take place. To ensure that the actual
   * proration is calculated exactly the same as the previewed proration, you should pass the {@code
   * subscription_details.proration_date} parameter when doing the actual subscription update.
   *
   * <p>The recommended way to get only the prorations being previewed on the invoice is to consider
   * line items where {@code parent.subscription_item_details.proration} is {@code true}.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>Note: Currency conversion calculations use the latest exchange rates. Exchange rates may
   * vary between the time of the preview and the time of the actual invoice creation. <a
   * href="https://docs.stripe.com/currencies/conversions">Learn more</a>
   */
  public Invoice createPreview() throws StripeException {
    return createPreview((InvoiceCreatePreviewParams) null, (RequestOptions) null);
  }
  /**
   * At any time, you can preview the upcoming invoice for a subscription or subscription schedule.
   * This will show you all the charges that are pending, including subscription renewal charges,
   * invoice item charges, etc. It will also show you any discounts that are applicable to the
   * invoice.
   *
   * <p>You can also preview the effects of creating or updating a subscription or subscription
   * schedule, including a preview of any prorations that will take place. To ensure that the actual
   * proration is calculated exactly the same as the previewed proration, you should pass the {@code
   * subscription_details.proration_date} parameter when doing the actual subscription update.
   *
   * <p>The recommended way to get only the prorations being previewed on the invoice is to consider
   * line items where {@code parent.subscription_item_details.proration} is {@code true}.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>Note: Currency conversion calculations use the latest exchange rates. Exchange rates may
   * vary between the time of the preview and the time of the actual invoice creation. <a
   * href="https://docs.stripe.com/currencies/conversions">Learn more</a>
   */
  public Invoice createPreview(InvoiceCreatePreviewParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoices/create_preview";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Invoice.class);
  }

  public com.stripe.service.InvoiceLineItemService lineItems() {
    return new com.stripe.service.InvoiceLineItemService(this.getResponseGetter());
  }
}
