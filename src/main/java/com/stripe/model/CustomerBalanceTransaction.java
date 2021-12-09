// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerBalanceTransactionUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerBalanceTransaction extends ApiResource
    implements HasId, MetadataStore<CustomerBalanceTransaction> {
  /**
   * The amount of the transaction. A negative value is a credit for the customer's balance, and a
   * positive value is a debit to the customer's {@code balance}.
   */
  @SerializedName("amount")
  Long amount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The ID of the credit note (if any) related to the transaction. */
  @SerializedName("credit_note")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CreditNote> creditNote;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer the transaction belongs to. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The customer's {@code balance} after the transaction was applied. A negative value decreases
   * the amount due on the customer's next invoice. A positive value increases the amount due on the
   * customer's next invoice.
   */
  @SerializedName("ending_balance")
  Long endingBalance;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the invoice (if any) related to the transaction. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer_balance_transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * Transaction type: {@code adjustment}, {@code applied_to_invoice}, {@code credit_note}, {@code
   * initial}, {@code invoice_too_large}, {@code invoice_too_small}, {@code
   * unspent_receiver_credit}, or {@code unapplied_from_invoice}. See the <a
   * href="https://stripe.com/docs/billing/customer/balance#types">Customer Balance page</a> to
   * learn more about transaction types.
   *
   * <p>One of {@code adjustment}, {@code applied_to_invoice}, {@code credit_note}, {@code initial},
   * {@code invoice_too_large}, {@code invoice_too_small}, {@code migration}, {@code
   * unapplied_from_invoice}, or {@code unspent_receiver_credit}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code creditNote} object. */
  public String getCreditNote() {
    return (this.creditNote != null) ? this.creditNote.getId() : null;
  }

  public void setCreditNote(String id) {
    this.creditNote = ApiResource.setExpandableFieldId(id, this.creditNote);
  }

  /** Get expanded {@code creditNote}. */
  public CreditNote getCreditNoteObject() {
    return (this.creditNote != null) ? this.creditNote.getExpanded() : null;
  }

  public void setCreditNoteObject(CreditNote expandableObject) {
    this.creditNote = new ExpandableField<CreditNote>(expandableObject.getId(), expandableObject);
  }

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
   * Most credit balance transaction fields are immutable, but you may update its <code>description
   * </code> and <code>metadata</code>.
   */
  @Override
  public CustomerBalanceTransaction update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Most credit balance transaction fields are immutable, but you may update its <code>description
   * </code> and <code>metadata</code>.
   */
  @Override
  public CustomerBalanceTransaction update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/balance_transactions/%s",
                ApiResource.urlEncodeId(this.getCustomer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CustomerBalanceTransaction.class, options);
  }

  /**
   * Most credit balance transaction fields are immutable, but you may update its <code>description
   * </code> and <code>metadata</code>.
   */
  public CustomerBalanceTransaction update(CustomerBalanceTransactionUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Most credit balance transaction fields are immutable, but you may update its <code>description
   * </code> and <code>metadata</code>.
   */
  public CustomerBalanceTransaction update(
      CustomerBalanceTransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/balance_transactions/%s",
                ApiResource.urlEncodeId(this.getCustomer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CustomerBalanceTransaction.class, options);
  }
}
