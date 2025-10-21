// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.CreditBalanceTransaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CreditNoteCreateParams;
import com.stripe.param.CreditNoteListParams;
import com.stripe.param.CreditNotePreviewParams;
import com.stripe.param.CreditNoteRetrieveParams;
import com.stripe.param.CreditNoteUpdateParams;
import com.stripe.param.CreditNoteVoidCreditNoteParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Issue a credit note to adjust an invoice's amount after the invoice is finalized.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/invoices/credit-notes">Credit
 * notes</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditNote extends ApiResource implements HasId, MetadataStore<CreditNote> {
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit
   * note, including tax.
   */
  @SerializedName("amount")
  Long amount;

  /** This is the sum of all the shipping amounts. */
  @SerializedName("amount_shipping")
  Long amountShipping;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

  /**
   * The integer amount in cents (or local equivalent) representing the total amount of discount
   * that was credited.
   */
  @SerializedName("discount_amount")
  Long discountAmount;

  /** The aggregate amounts calculated per discount for all line items. */
  @SerializedName("discount_amounts")
  List<CreditNote.DiscountAmount> discountAmounts;

  /**
   * The date when this credit note is in effect. Same as {@code created} unless overwritten. When
   * defined, this value replaces the system-generated 'Date of issue' printed on the credit note
   * PDF.
   */
  @SerializedName("effective_at")
  Long effectiveAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the invoice. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /** Line items that make up the credit note. */
  @SerializedName("lines")
  CreditNoteLineItemCollection lines;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Customer-facing text that appears on the credit note PDF. */
  @SerializedName("memo")
  String memo;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
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
   * <p>Equal to {@code credit_note}.
   */
  @SerializedName("object")
  String object;

  /** Amount that was credited outside of Stripe. */
  @SerializedName("out_of_band_amount")
  Long outOfBandAmount;

  /** The link to download the PDF of the credit note. */
  @SerializedName("pdf")
  String pdf;

  /**
   * The amount of the credit note that was refunded to the customer, credited to the customer's
   * balance, credited outside of Stripe, or any combination thereof.
   */
  @SerializedName("post_payment_amount")
  Long postPaymentAmount;

  /**
   * The amount of the credit note by which the invoice's {@code amount_remaining} and {@code
   * amount_due} were reduced.
   */
  @SerializedName("pre_payment_amount")
  Long prePaymentAmount;

  /** The pretax credit amounts (ex: discount, credit grants, etc) for all line items. */
  @SerializedName("pretax_credit_amounts")
  List<CreditNote.PretaxCreditAmount> pretaxCreditAmounts;

  /**
   * Reason for issuing this credit note, one of {@code duplicate}, {@code fraudulent}, {@code
   * order_change}, or {@code product_unsatisfactory}.
   */
  @SerializedName("reason")
  String reason;

  /** Refunds related to this credit note. */
  @SerializedName("refunds")
  List<CreditNote.Refund> refunds;

  /** The details of the cost of shipping, including the ShippingRate applied to the invoice. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /**
   * Status of this credit note, one of {@code issued} or {@code void}. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  @SerializedName("status")
  String status;

  /**
   * The integer amount in cents (or local equivalent) representing the amount of the credit note,
   * excluding exclusive tax and invoice level discounts.
   */
  @SerializedName("subtotal")
  Long subtotal;

  /**
   * The integer amount in cents (or local equivalent) representing the amount of the credit note,
   * excluding all tax and invoice level discounts.
   */
  @SerializedName("subtotal_excluding_tax")
  Long subtotalExcludingTax;

  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit
   * note, including tax and all discount.
   */
  @SerializedName("total")
  Long total;

  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit
   * note, excluding tax, but including discounts.
   */
  @SerializedName("total_excluding_tax")
  Long totalExcludingTax;

  /** The aggregate tax information for all line items. */
  @SerializedName("total_taxes")
  List<CreditNote.TotalTax> totalTaxes;

  /**
   * Type of this credit note, one of {@code pre_payment} or {@code post_payment}. A {@code
   * pre_payment} credit note means it was issued when the invoice was open. A {@code post_payment}
   * credit note means it was issued when the invoice was paid.
   */
  @SerializedName("type")
  String type;

  /** The time that the credit note was voided. */
  @SerializedName("voided_at")
  Long voidedAt;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code customerBalanceTransaction} object. */
  public String getCustomerBalanceTransaction() {
    return (this.customerBalanceTransaction != null)
        ? this.customerBalanceTransaction.getId()
        : null;
  }

  public void setCustomerBalanceTransaction(String id) {
    this.customerBalanceTransaction =
        ApiResource.setExpandableFieldId(id, this.customerBalanceTransaction);
  }

  /** Get expanded {@code customerBalanceTransaction}. */
  public CustomerBalanceTransaction getCustomerBalanceTransactionObject() {
    return (this.customerBalanceTransaction != null)
        ? this.customerBalanceTransaction.getExpanded()
        : null;
  }

  public void setCustomerBalanceTransactionObject(CustomerBalanceTransaction expandableObject) {
    this.customerBalanceTransaction =
        new ExpandableField<CustomerBalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code invoice} object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded {@code invoice}. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
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
  public static CreditNote create(Map<String, Object> params) throws StripeException {
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
  public static CreditNote create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
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
  public static CreditNote create(CreditNoteCreateParams params) throws StripeException {
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
  public static CreditNote create(CreditNoteCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditNoteCollection.class);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(CreditNoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of credit notes. */
  public static CreditNoteCollection list(CreditNoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditNoteCollection.class);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(Map<String, Object> params) throws StripeException {
    return preview(params, (RequestOptions) null);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes/preview";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(CreditNotePreviewParams params) throws StripeException {
    return preview(params, (RequestOptions) null);
  }

  /** Get a preview of a credit note without creating it. */
  public static CreditNote preview(CreditNotePreviewParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/credit_notes/preview";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
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
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
  }

  /** Retrieves the credit note object with the given identifier. */
  public static CreditNote retrieve(
      String id, CreditNoteRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditNote.class);
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
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, CreditNote.class);
  }

  /** Updates an existing credit note. */
  public CreditNote update(CreditNoteUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing credit note. */
  public CreditNote update(CreditNoteUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CreditNote.class);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote() throws StripeException {
    return voidCreditNote((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(RequestOptions options) throws StripeException {
    return voidCreditNote((Map<String, Object>) null, options);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(Map<String, Object> params) throws StripeException {
    return voidCreditNote(params, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s/void", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, CreditNote.class);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(CreditNoteVoidCreditNoteParams params) throws StripeException {
    return voidCreditNote(params, (RequestOptions) null);
  }

  /**
   * Marks a credit note as void. Learn more about <a
   * href="https://stripe.com/docs/billing/invoices/credit-notes#voiding">voiding credit notes</a>.
   */
  public CreditNote voidCreditNote(CreditNoteVoidCreditNoteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s/void", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CreditNote.class);
  }

  /**
   * For more details about DiscountAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DiscountAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the discount. */
    @SerializedName("amount")
    Long amount;

    /** The discount that was applied to get this discount amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about PretaxCreditAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PretaxCreditAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the pretax credit amount. */
    @SerializedName("amount")
    Long amount;

    /** The credit balance transaction that was applied to get this pretax credit amount. */
    @SerializedName("credit_balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<CreditBalanceTransaction> creditBalanceTransaction;

    /** The discount that was applied to get this pretax credit amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /**
     * Type of the pretax credit amount referenced.
     *
     * <p>One of {@code credit_balance_transaction}, or {@code discount}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code creditBalanceTransaction} object. */
    public String getCreditBalanceTransaction() {
      return (this.creditBalanceTransaction != null) ? this.creditBalanceTransaction.getId() : null;
    }

    public void setCreditBalanceTransaction(String id) {
      this.creditBalanceTransaction =
          ApiResource.setExpandableFieldId(id, this.creditBalanceTransaction);
    }

    /** Get expanded {@code creditBalanceTransaction}. */
    public CreditBalanceTransaction getCreditBalanceTransactionObject() {
      return (this.creditBalanceTransaction != null)
          ? this.creditBalanceTransaction.getExpanded()
          : null;
    }

    public void setCreditBalanceTransactionObject(CreditBalanceTransaction expandableObject) {
      this.creditBalanceTransaction =
          new ExpandableField<CreditBalanceTransaction>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Refund, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Refund extends StripeObject {
    /** Amount of the refund that applies to this credit note, in cents (or local equivalent). */
    @SerializedName("amount_refunded")
    Long amountRefunded;

    /** The PaymentRecord refund details associated with this credit note refund. */
    @SerializedName("payment_record_refund")
    PaymentRecordRefund paymentRecordRefund;

    /** ID of the refund. */
    @SerializedName("refund")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<com.stripe.model.Refund> refund;

    /** Type of the refund, one of {@code refund} or {@code payment_record_refund}. */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code refund} object. */
    public String getRefund() {
      return (this.refund != null) ? this.refund.getId() : null;
    }

    public void setRefund(String id) {
      this.refund = ApiResource.setExpandableFieldId(id, this.refund);
    }

    /** Get expanded {@code refund}. */
    public com.stripe.model.Refund getRefundObject() {
      return (this.refund != null) ? this.refund.getExpanded() : null;
    }

    public void setRefundObject(com.stripe.model.Refund expandableObject) {
      this.refund =
          new ExpandableField<com.stripe.model.Refund>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about PaymentRecordRefund, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentRecordRefund extends StripeObject {
      /** ID of the payment record. */
      @SerializedName("payment_record")
      String paymentRecord;

      /** ID of the refund group. */
      @SerializedName("refund_group")
      String refundGroup;
    }
  }

  /**
   * For more details about ShippingCost, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost extends StripeObject {
    /** Total shipping cost before any taxes are applied. */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /** Total tax amount applied due to shipping costs. If no tax was applied, defaults to 0. */
    @SerializedName("amount_tax")
    Long amountTax;

    /** Total shipping cost after taxes are applied. */
    @SerializedName("amount_total")
    Long amountTotal;

    /** The ID of the ShippingRate for this invoice. */
    @SerializedName("shipping_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<ShippingRate> shippingRate;

    /** The taxes applied to the shipping rate. */
    @SerializedName("taxes")
    List<CreditNote.ShippingCost.Tax> taxes;

    /** Get ID of expandable {@code shippingRate} object. */
    public String getShippingRate() {
      return (this.shippingRate != null) ? this.shippingRate.getId() : null;
    }

    public void setShippingRate(String id) {
      this.shippingRate = ApiResource.setExpandableFieldId(id, this.shippingRate);
    }

    /** Get expanded {@code shippingRate}. */
    public ShippingRate getShippingRateObject() {
      return (this.shippingRate != null) ? this.shippingRate.getExpanded() : null;
    }

    public void setShippingRateObject(ShippingRate expandableObject) {
      this.shippingRate =
          new ExpandableField<ShippingRate>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** Amount of tax applied for this rate. */
      @SerializedName("amount")
      Long amount;

      /**
       * Tax rates can be applied to <a
       * href="https://stripe.com/invoicing/taxes/tax-rates">invoices</a>, <a
       * href="https://stripe.com/billing/taxes/tax-rates">subscriptions</a> and <a
       * href="https://stripe.com/payments/checkout/use-manual-tax-rates">Checkout Sessions</a> to
       * collect tax.
       *
       * <p>Related guide: <a href="https://stripe.com/billing/taxes/tax-rates">Tax rates</a>
       */
      @SerializedName("rate")
      TaxRate rate;

      /**
       * The reasoning behind this tax, for example, if the product is tax exempt. The possible
       * values for this field may be extended as new tax rules are supported.
       *
       * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
       * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
       * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
       * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
       * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
       */
      @SerializedName("taxability_reason")
      String taxabilityReason;

      /** The amount on which tax is calculated, in cents (or local equivalent). */
      @SerializedName("taxable_amount")
      Long taxableAmount;
    }
  }

  /**
   * For more details about TotalTax, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalTax extends StripeObject {
    /** The amount of the tax, in cents (or local equivalent). */
    @SerializedName("amount")
    Long amount;

    /**
     * Whether this tax is inclusive or exclusive.
     *
     * <p>One of {@code exclusive}, or {@code inclusive}.
     */
    @SerializedName("tax_behavior")
    String taxBehavior;

    /**
     * Additional details about the tax rate. Only present when {@code type} is {@code
     * tax_rate_details}.
     */
    @SerializedName("tax_rate_details")
    TaxRateDetails taxRateDetails;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values
     * for this field may be extended as new tax rules are supported.
     *
     * <p>One of {@code customer_exempt}, {@code not_available}, {@code not_collecting}, {@code
     * not_subject_to_tax}, {@code not_supported}, {@code portion_product_exempt}, {@code
     * portion_reduced_rated}, {@code portion_standard_rated}, {@code product_exempt}, {@code
     * product_exempt_holiday}, {@code proportionally_rated}, {@code reduced_rated}, {@code
     * reverse_charge}, {@code standard_rated}, {@code taxable_basis_reduced}, or {@code
     * zero_rated}.
     */
    @SerializedName("taxability_reason")
    String taxabilityReason;

    /** The amount on which tax is calculated, in cents (or local equivalent). */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /**
     * The type of tax information.
     *
     * <p>Equal to {@code tax_rate_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about TaxRateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRateDetails extends StripeObject {
      @SerializedName("tax_rate")
      String taxRate;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(customerBalanceTransaction, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(lines, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
  }
}
