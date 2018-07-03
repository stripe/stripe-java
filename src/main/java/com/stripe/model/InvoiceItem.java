package com.stripe.model;

import com.stripe.exception.StripeException;
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
public class InvoiceItem extends ApiResource implements MetadataStore<InvoiceItem>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  Long date;
  String description;
  Boolean discountable;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Invoice> invoice;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  InvoiceLineItemPeriod period;
  Plan plan;
  Boolean proration;
  Long quantity;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Subscription> subscription;

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerId) {
    this.customer = setExpandableFieldId(customerId, this.customer);
  }

  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer c) {
    this.customer = new ExpandableField<Customer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="invoice">
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String invoiceId) {
    this.invoice = setExpandableFieldId(invoiceId, this.invoice);
  }

  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice invoice) {
    this.invoice = new ExpandableField<Invoice>(invoice.getId(), invoice);
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
   * Create an invoice item.
   */
  public static InvoiceItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an invoice item.
   */
  public static InvoiceItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(InvoiceItem.class), params, InvoiceItem.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an invoice item.
   */
  public DeletedInvoiceItem delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete an invoice item.
   */
  public DeletedInvoiceItem delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(InvoiceItem.class, this.id), null,
        DeletedInvoiceItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all invoice items.
   */
  public static InvoiceItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all invoice items.
   */
  public static InvoiceItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(InvoiceItem.class), params, InvoiceItemCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(InvoiceItem.class, id), null, InvoiceItem.class,
        options);
  }

  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(InvoiceItem.class, id), params, InvoiceItem.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an invoice item.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update an invoice item.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(InvoiceItem.class, this.id), params,
        InvoiceItem.class, options);
  }
  // </editor-fold>
}
