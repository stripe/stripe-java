package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceItem extends APIResource implements MetadataStore<InvoiceItem>, HasId {
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
  Integer quantity;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Subscription> subscription;
  String subscriptionItem;
  Long unitAmount;

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerID) {
    this.customer = setExpandableFieldID(customerID, this.customer);
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

  public void setInvoice(String invoiceID) {
    this.invoice = setExpandableFieldID(invoiceID, this.invoice);
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

  public void setSubscription(String subscriptionID) {
    this.subscription = setExpandableFieldID(subscriptionID, this.subscription);
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
  public static InvoiceItem create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an invoice item.
   */
  public static InvoiceItem create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(InvoiceItem.class), params, InvoiceItem.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an invoice item.
   */
  public DeletedInvoiceItem delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete an invoice item.
   */
  public DeletedInvoiceItem delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(InvoiceItem.class, this.id), null,
        DeletedInvoiceItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all invoice items.
   */
  public static InvoiceItemCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all invoice items.
   */
  public static InvoiceItemCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(InvoiceItem.class), params, InvoiceItemCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), null, InvoiceItem.class,
        options);
  }

  /**
   * Retrieve an invoice item.
   */
  public static InvoiceItem retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(InvoiceItem.class, id), params, InvoiceItem.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an invoice item.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update an invoice item.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(InvoiceItem.class, this.id), params,
        InvoiceItem.class, options);
  }
  // </editor-fold>
}
