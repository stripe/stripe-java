package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Invoice extends ApiResource implements MetadataStore<Invoice>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amountDue;
  Long amountPaid;
  Long amountRemaining;
  Long applicationFee;
  Integer attemptCount;
  Boolean attempted;
  String billing;
  String billingReason;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Boolean closed;
  Long created;
  String currency;
  String customer;
  Long date;
  String description;
  Discount discount;
  Long dueDate;
  Long endingBalance;
  Boolean forgiven;
  String hostedInvoiceUrl;
  String invoicePdf;
  InvoiceLineItemCollection lines;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  Long nextPaymentAttempt;
  String number;
  Boolean paid;
  Long periodEnd;
  Long periodStart;
  String receiptNumber;
  Long startingBalance;
  String statementDescriptor;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Subscription> subscription;
  Long subscriptionProrationDate;
  Long subtotal;
  Long tax;
  Double taxPercent;
  Long total;
  Long webhooksDeliveredAt;

  // <editor-fold desc="charge">
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeId) {
    this.charge = setExpandableFieldId(chargeId, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge charge) {
    this.charge = new ExpandableField<Charge>(charge.getId(), charge);
  }
  // </editor-fold>

  // <editor-fold desc="subscription">
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String subscriptionId) {
    this.subscription = setExpandableFieldId(subscriptionId, this.subscription);
  }

  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription subscription) {
    this.subscription = new ExpandableField<Subscription>(subscription.getId(), subscription);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an invoice.
   */
  public static Invoice create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an invoice.
   */
  public static Invoice create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, classUrl(Invoice.class), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all invoices.
   */
  public static InvoiceCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all invoices.
   */
  public static InvoiceCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return requestCollection(classUrl(Invoice.class), params, InvoiceCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="pay">
  /**
   * Pay an invoice.
   */
  public Invoice pay() throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return this.pay((RequestOptions) null);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return pay(null, options);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return this.pay(params, null);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return request(RequestMethod.POST, String.format("%s/pay",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Invoice.class, id), null, Invoice.class, options);
  }

  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Invoice.class, id), params, Invoice.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="upcoming">
  /**
   * Retrieve an upcoming invoice.
   */
  public static Invoice upcoming(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return upcoming(params, (RequestOptions) null);
  }

  /**
   * Retrieve an upcoming invoice.
   */
  public static Invoice upcoming(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, String.format("%s/upcoming", classUrl(Invoice.class)), params,
        Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an invoice.
   */
  @Override
  public Invoice update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update an invoice.
   */
  @Override
  public Invoice update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, instanceUrl(Invoice.class, this.id), params, Invoice.class,
        options);
  }
  // </editor-fold>
}
