package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CreditNoteCreateParams;
import com.stripe.param.CreditNoteListParams;
import com.stripe.param.CreditNotePreviewParams;
import com.stripe.param.CreditNoteRetrieveParams;
import com.stripe.param.CreditNoteUpdateParams;
import com.stripe.param.CreditNoteVoidCreditNoteParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditNote extends ApiResource implements HasId, MetadataStore<CreditNote> {
  /**
   * The integer amount in **%s** representing the total amount of the credit note, including tax.
   */
  @SerializedName("amount")
  Long amount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** ID of the customer. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Customer balance transaction related to this credit note. */
  @SerializedName("customer_balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CustomerBalanceTransaction> customerBalanceTransaction;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the invoice. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Customer-facing text that appears on the credit note PDF. */
  @SerializedName("memo")
  String memo;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A unique number that identifies this particular credit note and appears on the PDF of the
   * credit note and its associated invoice.
   */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `credit_note`.
   */
  @SerializedName("object")
  String object;

  /** The link to download the PDF of the credit note. */
  @SerializedName("pdf")
  String pdf;

  /**
   * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or
   * `product_unsatisfactory`.
   */
  @SerializedName("reason")
  String reason;

  /** Refund related to this credit note. */
  @SerializedName("refund")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Refund> refund;

  /**
   * Status of this credit note, one of `issued` or `void`. Learn more about [voiding credit
   * notes](https://stripe.com/docs/billing/invoices/credit-notes#voiding).
   */
  @SerializedName("status")
  String status;

  /**
   * Type of this credit note, one of `post_payment` or `pre_payment`. A `pre_payment` credit note
   * means it was issued when the invoice was open. A `post_payment` credit note means it was issued
   * when the invoice was paid.
   */
  @SerializedName("type")
  String type;

  /** The time that the credit note was voided. */
  @SerializedName("voided_at")
  Long voidedAt;

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customerBalanceTransaction` object. */
  public String getCustomerBalanceTransaction() {
    return (this.customerBalanceTransaction != null)
        ? this.customerBalanceTransaction.getId()
        : null;
  }

  public void setCustomerBalanceTransaction(String id) {
    this.customerBalanceTransaction =
        ApiResource.setExpandableFieldId(id, this.customerBalanceTransaction);
  }

  /** Get expanded `customerBalanceTransaction`. */
  public CustomerBalanceTransaction getCustomerBalanceTransactionObject() {
    return (this.customerBalanceTransaction != null)
        ? this.customerBalanceTransaction.getExpanded()
        : null;
  }

  public void setCustomerBalanceTransactionObject(CustomerBalanceTransaction expandableObject) {
    this.customerBalanceTransaction =
        new ExpandableField<CustomerBalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `invoice` object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded `invoice`. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `refund` object. */
  public String getRefund() {
    return (this.refund != null) ? this.refund.getId() : null;
  }

  public void setRefund(String id) {
    this.refund = ApiResource.setExpandableFieldId(id, this.refund);
  }

  /** Get expanded `refund`. */
  public Refund getRefundObject() {
    return (this.refund != null) ? this.refund.getExpanded() : null;
  }

  public void setRefundObject(Refund expandableObject) {
    this.refund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
  }

  /**
   * Issue a credit note to adjust the amount of a finalized invoice. For a <code>status=open</code>
   * invoice, a credit note reduces its <code>amount_due</code>. For a <code>status=paid</code>
   * invoice, a credit note does not affect its <code>amount_due</code>. Instead, it can result in
   * any combination of the following:
   *
   * <ul>
   *   <li>Refund: create a new refund (using <code>refund_amount</code>) or link an existing refund
   *       (using <code>refund</code>).
   *   <li>Customer balance credit: credit the customer’s balance (using <code>credit_amount</code>)
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using <code>out_of_band_amount</code>).
   * </ul>
   *
   * <p>For post-payment credit notes the sum of the refund, credit and outside of Stripe amounts
   * must equal the credit note total.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note will increment the
   * invoice’s <code>pre_payment_credit_notes_amount</code> or <code>
   * post_payment_credit_notes_amount</code> depending on its <code>status</code> at the time of
   * credit note creation.
   */
  public static CreditNote create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Issue a credit note to adjust the amount of a finalized invoice. For a <code>status=open</code>
   * invoice, a credit note reduces its <code>amount_due</code>. For a <code>status=paid</code>
   * invoice, a credit note does not affect its <code>amount_due</code>. Instead, it can result in
   * any combination of the following:
   *
   * <ul>
   *   <li>Refund: create a new refund (using <code>refund_amount</code>) or link an existing refund
   *       (using <code>refund</code>).
   *   <li>Customer balance credit: credit the customer’s balance (using <code>credit_amount</code>)
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using <code>out_of_band_amount</code>).
   * </ul>
   *
   * <p>For post-payment credit notes the sum of the refund, credit and outside of Stripe amounts
   * must equal the credit note total.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note will increment the
   * invoice’s <code>pre_payment_credit_notes_amount</code> or <code>
   * post_payment_credit_notes_amount</code> depending on its <code>status</code> at the time of
   * credit note creation.
   */
  public static CreditNote create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }

  /**
   * Issue a credit note to adjust the amount of a finalized invoice. For a <code>status=open</code>
   * invoice, a credit note reduces its <code>amount_due</code>. For a <code>status=paid</code>
   * invoice, a credit note does not affect its <code>amount_due</code>. Instead, it can result in
   * any combination of the following:
   *
   * <ul>
   *   <li>Refund: create a new refund (using <code>refund_amount</code>) or link an existing refund
   *       (using <code>refund</code>).
   *   <li>Customer balance credit: credit the customer’s balance (using <code>credit_amount</code>)
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using <code>out_of_band_amount</code>).
   * </ul>
   *
   * <p>For post-payment credit notes the sum of the refund, credit and outside of Stripe amounts
   * must equal the credit note total.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note will increment the
   * invoice’s <code>pre_payment_credit_notes_amount</code> or <code>
   * post_payment_credit_notes_amount</code> depending on its <code>status</code> at the time of
   * credit note creation.
   */
  public static CreditNote create(CreditNoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Issue a credit note to adjust the amount of a finalized invoice. For a <code>status=open</code>
   * invoice, a credit note reduces its <code>amount_due</code>. For a <code>status=paid</code>
   * invoice, a credit note does not affect its <code>amount_due</code>. Instead, it can result in
   * any combination of the following:
   *
   * <ul>
   *   <li>Refund: create a new refund (using <code>refund_amount</code>) or link an existing refund
   *       (using <code>refund</code>).
   *   <li>Customer balance credit: credit the customer’s balance (using <code>credit_amount</code>)
   *       which will be automatically applied to their next invoice when it’s finalized.
   *   <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe
   *       (using <code>out_of_band_amount</code>).
   * </ul>
   *
   * <p>For post-payment credit notes the sum of the refund, credit and outside of Stripe amounts
   * must equal the credit note total.
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note will increment the
   * invoice’s <code>pre_payment_credit_notes_amount</code> or <code>
   * post_payment_credit_notes_amount</code> depending on its <code>status</code> at the time of
   * credit note creation.
   */
  public static CreditNote create(CreditNoteCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(Map<String, Object> params) throws StripeException {
    return preview(params, (RequestOptions) null);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes/preview");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CreditNote.class, options);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(CreditNotePreviewParams params) throws StripeException {
    return preview(params, (RequestOptions) null);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(CreditNotePreviewParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes/preview");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CreditNote.class, options);
  }

  /** Retrieves the credit note object with the given identifier. */
  public static CreditNote retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the credit note object with the given identifier. */
  public static CreditNote retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the credit note object with the given identifier. */
  public static CreditNote retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CreditNote.class, options);
  }

  /** Retrieves the credit note object with the given identifier. */
  public static CreditNote retrieve(
      String id, CreditNoteRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CreditNote.class, options);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes");
    return ApiResource.requestCollection(url, params, CreditNoteCollection.class, options);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(CreditNoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(CreditNoteListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/credit_notes");
    return ApiResource.requestCollection(url, params, CreditNoteCollection.class, options);
  }

  /** Updates an existing credit note. */
  @Override
  public CreditNote update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing credit note. */
  @Override
  public CreditNote update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }

  /** Updates an existing credit note. */
  public CreditNote update(CreditNoteUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing credit note. */
  public CreditNote update(CreditNoteUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote() throws StripeException {
    return voidCreditNote((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(RequestOptions options) throws StripeException {
    return voidCreditNote((Map<String, Object>) null, options);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(Map<String, Object> params) throws StripeException {
    return voidCreditNote(params, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/credit_notes/%s/void", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(CreditNoteVoidCreditNoteParams params) throws StripeException {
    return voidCreditNote(params, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(CreditNoteVoidCreditNoteParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/credit_notes/%s/void", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CreditNote.class, options);
  }
}
