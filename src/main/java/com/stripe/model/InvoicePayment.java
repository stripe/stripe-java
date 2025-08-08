// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoicePaymentListParams;
import com.stripe.param.InvoicePaymentRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Invoice Payments represent payments made against invoices. Invoice Payments can be accessed in
 * two ways: 1. By expanding the {@code payments} field on the <a
 * href="https://stripe.com/docs/api#invoice">Invoice</a> resource. 2. By using the Invoice Payment
 * retrieve and list endpoints.
 *
 * <p>Invoice Payments include the mapping between payment objects, such as Payment Intent, and
 * Invoices. This resource and its endpoints allows you to easily track if a payment is associated
 * with a specific invoice and monitor the allocation details of the payments.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoicePayment extends ApiResource implements HasId {
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
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public static InvoicePaymentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public static InvoicePaymentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoice_payments";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InvoicePaymentCollection.class);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public static InvoicePaymentCollection list(InvoicePaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public static InvoicePaymentCollection list(
      InvoicePaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/invoice_payments";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InvoicePaymentCollection.class);
  }

  /** Retrieves the invoice payment with the given ID. */
  public static InvoicePayment retrieve(String invoicePayment) throws StripeException {
    return retrieve(invoicePayment, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the invoice payment with the given ID. */
  public static InvoicePayment retrieve(String invoicePayment, RequestOptions options)
      throws StripeException {
    return retrieve(invoicePayment, (Map<String, Object>) null, options);
  }

  /** Retrieves the invoice payment with the given ID. */
  public static InvoicePayment retrieve(
      String invoicePayment, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoice_payments/%s", ApiResource.urlEncodeId(invoicePayment));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InvoicePayment.class);
  }

  /** Retrieves the invoice payment with the given ID. */
  public static InvoicePayment retrieve(
      String invoicePayment, InvoicePaymentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoice_payments/%s", ApiResource.urlEncodeId(invoicePayment));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InvoicePayment.class);
  }

  /**
   * For more details about Payment, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payment extends StripeObject {
    /**
     * ID of the successful charge for this payment when {@code type} is {@code charge}.Note: charge
     * is only surfaced if the charge object is not associated with a payment intent. If the charge
     * object does have a payment intent, the Invoice Payment surfaces the payment intent instead.
     */
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
     * <p>One of {@code charge}, or {@code payment_intent}.
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(payment, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
  }
}
