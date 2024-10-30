// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The invoice payment object. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoicePayment extends StripeObject implements HasId {
  /**
   * Excess payment that was received for this invoice and credited to the customer’s {@code
   * invoice_credit_balance}. This field is null until the payment is {@code paid}. Overpayment can
   * happen when you attach more than one PaymentIntent to the invoice, and each of them succeeds.
   * To avoid overpayment, cancel any PaymentIntents that you do not need before attaching more.
   */
  @SerializedName("amount_overpaid")
  Long amountOverpaid;

  /**
   * Amount that was actually paid for this invoice, in cents (or local equivalent). This field is
   * null until the payment is {@code paid}. This amount can be less than the {@code
   * amount_requested} if the PaymentIntent’s {@code amount_received} is not sufficient to pay all
   * of the invoices that it is attached to.
   */
  @SerializedName("amount_paid")
  Long amountPaid;

  /** Amount intended to be paid toward this invoice, in cents (or local equivalent). */
  @SerializedName("amount_requested")
  Long amountRequested;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The invoice that was paid. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /**
   * Stripe automatically creates a default InvoicePayment when the invoice is finalized, and keeps
   * it synchronized with the invoice’s {@code amount_remaining}. The PaymentIntent associated with
   * the default payment can’t be edited or canceled directly.
   */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code invoice_payment}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payment")
  Payment payment;

  /** The status of the payment, one of {@code open}, {@code paid}, or {@code canceled}. */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

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
   * For more details about Payment, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payment extends StripeObject {
    /** ID of the successful charge for this payment when {@code type} is {@code charge}. */
    @SerializedName("charge")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Charge> charge;

    /**
     * ID of the PaymentIntent associated with this payment when {@code type} is {@code
     * payment_intent}. Note: This property is only populated for invoices finalized on or after
     * March 15th, 2019.
     */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /**
     * ID of the PaymentRecord associated with this payment when {@code type} is {@code
     * payment_record}.
     */
    @SerializedName("payment_record")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentRecord> paymentRecord;

    /**
     * Type of payment object associated with this invoice payment.
     *
     * <p>One of {@code charge}, {@code out_of_band_payment}, {@code payment_intent}, or {@code
     * payment_record}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code charge} object. */
    public String getCharge() {
      return (this.charge != null) ? this.charge.getId() : null;
    }

    public void setCharge(String id) {
      this.charge = ApiResource.setExpandableFieldId(id, this.charge);
    }

    /** Get expanded {@code charge}. */
    public Charge getChargeObject() {
      return (this.charge != null) ? this.charge.getExpanded() : null;
    }

    public void setChargeObject(Charge expandableObject) {
      this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code paymentIntent} object. */
    public String getPaymentIntent() {
      return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }

    public void setPaymentIntent(String id) {
      this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }

    /** Get expanded {@code paymentIntent}. */
    public PaymentIntent getPaymentIntentObject() {
      return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }

    public void setPaymentIntentObject(PaymentIntent expandableObject) {
      this.paymentIntent =
          new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code paymentRecord} object. */
    public String getPaymentRecord() {
      return (this.paymentRecord != null) ? this.paymentRecord.getId() : null;
    }

    public void setPaymentRecord(String id) {
      this.paymentRecord = ApiResource.setExpandableFieldId(id, this.paymentRecord);
    }

    /** Get expanded {@code paymentRecord}. */
    public PaymentRecord getPaymentRecordObject() {
      return (this.paymentRecord != null) ? this.paymentRecord.getExpanded() : null;
    }

    public void setPaymentRecordObject(PaymentRecord expandableObject) {
      this.paymentRecord =
          new ExpandableField<PaymentRecord>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time that the payment was canceled. */
    @SerializedName("canceled_at")
    Long canceledAt;

    /** The time that the payment succeeded. */
    @SerializedName("paid_at")
    Long paidAt;
  }
}
