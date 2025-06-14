// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CreditNote;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CreditNoteCreateParams;
import com.stripe.param.CreditNoteListParams;
import com.stripe.param.CreditNotePreviewParams;
import com.stripe.param.CreditNoteRetrieveParams;
import com.stripe.param.CreditNoteUpdateParams;
import com.stripe.param.CreditNoteVoidCreditNoteParams;

public final class CreditNoteService extends ApiService {
  public CreditNoteService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of credit notes. */
  public StripeCollection<CreditNote> list(CreditNoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of credit notes. */
  public StripeCollection<CreditNote> list(RequestOptions options) throws StripeException {
    return list((CreditNoteListParams) null, options);
  }
  /** Returns a list of credit notes. */
  public StripeCollection<CreditNote> list() throws StripeException {
    return list((CreditNoteListParams) null, (RequestOptions) null);
  }
  /** Returns a list of credit notes. */
  public StripeCollection<CreditNote> list(CreditNoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<CreditNote>>() {}.getType());
  }
  /**
   * Issue a credit note to adjust the amount of a finalized invoice. A credit note will first
   * reduce the invoice’s {@code amount_remaining} (and {@code amount_due}), but not below zero.
   * This amount is indicated by the credit note’s {@code pre_payment_amount}. The excess amount is
   * indicated by {@code post_payment_amount}, and it can result in any combination of the
   * following:
   *
   * <p>
   *
   * <ul>
   *   <li>Refunds: create a new refund (using {@code refund_amount}) or link existing refunds
   *       (using {@code refunds}).
   *   <li>Customer balance credit: credit the customer’s balance (using {@code credit_amount})
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using {@code out_of_band_amount}).
   * </ul>
   *
   * <p>The sum of refunds, customer balance credits, and outside of Stripe credits must equal the
   * {@code post_payment_amount}.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note may increment the
   * invoice’s {@code pre_payment_credit_notes_amount}, {@code post_payment_credit_notes_amount}, or
   * both, depending on the invoice’s {@code amount_remaining} at the time of credit note creation.
   */
  public CreditNote create(CreditNoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Issue a credit note to adjust the amount of a finalized invoice. A credit note will first
   * reduce the invoice’s {@code amount_remaining} (and {@code amount_due}), but not below zero.
   * This amount is indicated by the credit note’s {@code pre_payment_amount}. The excess amount is
   * indicated by {@code post_payment_amount}, and it can result in any combination of the
   * following:
   *
   * <p>
   *
   * <ul>
   *   <li>Refunds: create a new refund (using {@code refund_amount}) or link existing refunds
   *       (using {@code refunds}).
   *   <li>Customer balance credit: credit the customer’s balance (using {@code credit_amount})
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using {@code out_of_band_amount}).
   * </ul>
   *
   * <p>The sum of refunds, customer balance credits, and outside of Stripe credits must equal the
   * {@code post_payment_amount}.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note may increment the
   * invoice’s {@code pre_payment_credit_notes_amount}, {@code post_payment_credit_notes_amount}, or
   * both, depending on the invoice’s {@code amount_remaining} at the time of credit note creation.
   */
  public CreditNote create(CreditNoteCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditNote.class);
  }
  /** Retrieves the credit note object with the given identifier. */
  public CreditNote retrieve(String id, CreditNoteRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the credit note object with the given identifier. */
  public CreditNote retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CreditNoteRetrieveParams) null, options);
  }
  /** Retrieves the credit note object with the given identifier. */
  public CreditNote retrieve(String id) throws StripeException {
    return retrieve(id, (CreditNoteRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the credit note object with the given identifier. */
  public CreditNote retrieve(String id, CreditNoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditNote.class);
  }
  /** Updates an existing credit note. */
  public CreditNote update(String id, CreditNoteUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an existing credit note. */
  public CreditNote update(String id, RequestOptions options) throws StripeException {
    return update(id, (CreditNoteUpdateParams) null, options);
  }
  /** Updates an existing credit note. */
  public CreditNote update(String id) throws StripeException {
    return update(id, (CreditNoteUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing credit note. */
  public CreditNote update(String id, CreditNoteUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditNote.class);
  }
  /** Get a preview of a credit note without creating it. */
  public CreditNote preview(CreditNotePreviewParams params) throws StripeException {
    return preview(params, (RequestOptions) null);
  }
  /** Get a preview of a credit note without creating it. */
  public CreditNote preview(CreditNotePreviewParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes/preview";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditNote.class);
  }
  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(String id, CreditNoteVoidCreditNoteParams params)
      throws StripeException {
    return voidCreditNote(id, params, (RequestOptions) null);
  }
  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(String id, RequestOptions options) throws StripeException {
    return voidCreditNote(id, (CreditNoteVoidCreditNoteParams) null, options);
  }
  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(String id) throws StripeException {
    return voidCreditNote(id, (CreditNoteVoidCreditNoteParams) null, (RequestOptions) null);
  }
  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(
      String id, CreditNoteVoidCreditNoteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s/void", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditNote.class);
  }

  public com.stripe.service.CreditNoteLineItemService lineItems() {
    return new com.stripe.service.CreditNoteLineItemService(this.getResponseGetter());
  }

  public com.stripe.service.CreditNotePreviewLinesService previewLines() {
    return new com.stripe.service.CreditNotePreviewLinesService(this.getResponseGetter());
  }
}
