package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.math.BigDecimal;
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
  Long attemptCount;
  Boolean attempted;
  Boolean autoAdvance;
  String billing;
  String billingReason;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String currency;
  String customer;
  Long date;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<ExternalAccount> defaultSource;
  Boolean deleted;
  String description;
  Discount discount;
  Long dueDate;
  Long endingBalance;
  Long finalizedAt;
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
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Subscription> subscription;
  Long subscriptionProrationDate;
  Long subtotal;
  Long tax;
  BigDecimal taxPercent;
  Long total;
  Long webhooksDeliveredAt;

  /**
   * The {@code closed} attribute.
   *
   * @deprecated Prefer using the {@code status} attribute instead.
   */
  @Deprecated
  Boolean closed;

  /**
   * The {@code forgiven} attribute.
   *
   * @deprecated Prefer using the {@code status} attribute instead.
   */
  @Deprecated
  Boolean forgiven;

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
    this.charge = new ExpandableField<>(charge.getId(), charge);
  }
  // </editor-fold>

  // <editor-fold desc="defaultSource">
  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String defaultSourceId) {
    this.defaultSource = setExpandableFieldId(defaultSourceId, this.defaultSource);
  }

  public ExternalAccount getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(ExternalAccount c) {
    this.defaultSource = new ExpandableField<>(c.getId(), c);
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
    this.subscription = new ExpandableField<>(subscription.getId(), subscription);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an invoice.
   */
  public static Invoice create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an invoice.
   */
  public static Invoice create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Invoice.class), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an invoice.
   */
  public Invoice delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete an invoice.
   */
  public Invoice delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Invoice.class, this.id), null,
        Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all invoices.
   */
  public static InvoiceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all invoices.
   */
  public static InvoiceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Invoice.class), params, InvoiceCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="finalizeInvoice">
  /**
   * Finalize an invoice.
   */
  public Invoice finalizeInvoice() throws StripeException {
    return this.finalizeInvoice((RequestOptions) null);
  }

  /**
   * Finalize an invoice.
   */
  public Invoice finalizeInvoice(RequestOptions options) throws StripeException {
    return finalizeInvoice(null, options);
  }

  /**
   * Finalize an invoice.
   */
  public Invoice finalizeInvoice(Map<String, Object> params) throws StripeException {
    return this.finalizeInvoice(params, null);
  }

  /**
   * Finalize an invoice.
   */
  public Invoice finalizeInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/finalize",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="markUncollectible">
  /**
   * Mark an invoice as uncollectible.
   */
  public Invoice markUncollectible() throws StripeException {
    return this.markUncollectible((RequestOptions) null);
  }

  /**
   * Mark an invoice as uncollectible.
   */
  public Invoice markUncollectible(RequestOptions options) throws StripeException {
    return markUncollectible(null, options);
  }

  /**
   * Mark an invoice as uncollectible.
   */
  public Invoice markUncollectible(Map<String, Object> params) throws StripeException {
    return this.markUncollectible(params, null);
  }

  /**
   * Mark an invoice as uncollectible.
   */
  public Invoice markUncollectible(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/mark_uncollectible",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="pay">
  /**
   * Pay an invoice.
   */
  public Invoice pay() throws StripeException {
    return this.pay((RequestOptions) null);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(RequestOptions options) throws StripeException {
    return pay(null, options);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(Map<String, Object> params) throws StripeException {
    return this.pay(params, null);
  }

  /**
   * Pay an invoice.
   */
  public Invoice pay(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/pay",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve an invoice.
   */
  public static Invoice retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Invoice.class, id), params, Invoice.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="sendInvoice">
  /**
   * send an invoice.
   */
  public Invoice sendInvoice() throws StripeException {
    return this.sendInvoice((RequestOptions) null);
  }

  /**
   * send an invoice.
   */
  public Invoice sendInvoice(RequestOptions options) throws StripeException {
    return sendInvoice(null, options);
  }

  /**
   * send an invoice.
   */
  public Invoice sendInvoice(Map<String, Object> params) throws StripeException {
    return this.sendInvoice(params, null);
  }

  /**
   * send an invoice.
   */
  public Invoice sendInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/send",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="upcoming">
  /**
   * Retrieve an upcoming invoice.
   */
  public static Invoice upcoming(Map<String, Object> params) throws StripeException {
    return upcoming(params, (RequestOptions) null);
  }

  /**
   * Retrieve an upcoming invoice.
   */
  public static Invoice upcoming(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, String.format("%s/upcoming", classUrl(Invoice.class)), params,
        Invoice.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an invoice.
   */
  @Override
  public Invoice update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update an invoice.
   */
  @Override
  public Invoice update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Invoice.class, this.id), params, Invoice.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="voidInvoice">
  /**
   * void an invoice.
   */
  public Invoice voidInvoice() throws StripeException {
    return this.voidInvoice((RequestOptions) null);
  }

  /**
   * void an invoice.
   */
  public Invoice voidInvoice(RequestOptions options) throws StripeException {
    return voidInvoice(null, options);
  }

  /**
   * void an invoice.
   */
  public Invoice voidInvoice(Map<String, Object> params) throws StripeException {
    return this.voidInvoice(params, null);
  }

  /**
   * void an invoice.
   */
  public Invoice voidInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/void",
        instanceUrl(Invoice.class, this.getId())), params, Invoice.class, options);
  }
  // </editor-fold>
}
