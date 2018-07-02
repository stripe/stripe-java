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
public class Customer extends ApiResource implements MetadataStore<Customer>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long accountBalance;
  String businessVatId;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<ExternalAccount> defaultSource;
  Boolean deleted;
  Boolean delinquent;
  String description;
  Discount discount;
  String email;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  ShippingDetails shipping;
  ExternalAccountCollection sources;
  CustomerSubscriptionCollection subscriptions;

  /**
   * The {@code cards} attribute.
   *
   * @return the {@code cards} attribute
   * @deprecated Prefer using the {@link #sources} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  CustomerCardCollection cards;

  /**
   * The {@code default_card} attribute.
   *
   * @return the {@code default_card} attribute
   * @deprecated Prefer using the {@link #defaultSource} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  String defaultCard;

  /**
   * The {@code next_recurring_charge} attribute.
   *
   * @return the {@code next_recurring_charge} attribute
   * @deprecated Prefer using the {@link Invoice#upcoming} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-03-25">API version 2012-03-25</a>
   */
  @Deprecated
  NextRecurringCharge nextRecurringCharge;

  /**
   * The {@code subscription} attribute.
   *
   * @return the {@code subscription} attribute
   * @deprecated Prefer using the {@link #subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  Subscription subscription;

  /**
   * The {@code trial_end} attribute.
   *
   * @return the {@code trial_end} attribute
   * @deprecated Prefer using the {@link #subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  Long trialEnd;

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
    this.defaultSource = new ExpandableField<ExternalAccount>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a customer.
   */
  public static Customer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a customer.
   */
  public static Customer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Customer.class), params, Customer.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a customer.
   */
  public DeletedCustomer delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a customer.
   */
  public DeletedCustomer delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Customer.class, this.id), null,
        DeletedCustomer.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="deleteDiscount">
  /**
   * Delete a customer discount.
   */
  public void deleteDiscount() throws StripeException {
    deleteDiscount((RequestOptions) null);
  }

  /**
   * Delete a customer discount.
   */
  public void deleteDiscount(RequestOptions options) throws StripeException {
    request(RequestMethod.DELETE, String.format("%s/discount",
        instanceUrl(Customer.class, this.id)), null, Discount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all customers.
   */
  public static CustomerCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all customers.
   */
  public static CustomerCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Customer.class), params, CustomerCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Customer.class, id), null, Customer.class,
        options);
  }

  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Customer.class, id), params, Customer.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a customer.
   */
  @Override
  public Customer update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a customer.
   */
  @Override
  public Customer update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Customer.class, this.id), params,
        Customer.class, options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextRecurringCharge extends StripeObject {
    Long amount;
    String date;
  }
}
