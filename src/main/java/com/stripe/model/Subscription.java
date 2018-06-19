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
public class Subscription extends APIResource implements MetadataStore<Subscription>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Double applicationFeePercent;
  String billing;
  Long billingCycleAnchor;
  Boolean cancelAtPeriodEnd;
  Long canceledAt;
  Long created;
  Long currentPeriodEnd;
  Long currentPeriodStart;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  Integer daysUntilDue;
  Discount discount;
  Long endedAt;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) SubscriptionItemCollection items;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  Plan plan;
  Integer quantity;
  Long start;
  String status;
  Double taxPercent;
  Long trialEnd;
  Long trialStart;

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

  // <editor-fold desc="items">
  public SubscriptionItemCollection getSubscriptionItems() {
    return items;
  }

  public void setSubscriptionItems(SubscriptionItemCollection items) {
    this.items = items;
  }
  // </editor-fold>

  // <editor-fold desc="cancel">
  /**
   * Cancel a subscription.
   */
  public Subscription cancel(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancel a subscription.
   */
  public Subscription cancel(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Subscription.class, id), params,
        Subscription.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a subscription.
   */
  public static Subscription create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a subscription.
   */
  public static Subscription create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Subscription.class), params, Subscription.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="deleteDiscount">
  /**
   * Delete a subscription discount.
   */
  public void deleteDiscount() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    deleteDiscount((RequestOptions) null);
  }

  /**
   * Delete a subscription discount.
   */
  public void deleteDiscount(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    request(RequestMethod.DELETE, String.format("%s/discount", instanceURL(Subscription.class, id)),
        null, Discount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List subscriptions.
   */
  public static SubscriptionCollection list(Map<String, Object> params)
      throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, null);
  }

  /**
   * List subscriptions.
   */
  public static SubscriptionCollection list(Map<String, Object> params,
                        RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Subscription.class), params, SubscriptionCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a subscription.
   */
  public static Subscription retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a subscription.
   */
  public static Subscription retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Subscription.class, id), null, Subscription.class,
        options);
  }

  /**
   * Retrieve a subscription.
   */
  public static Subscription retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Subscription.class, id), params,
        Subscription.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a subscription.
   */
  @Override
  public Subscription update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a subscription.
   */
  @Override
  public Subscription update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Subscription.class, id), params,
        Subscription.class, options);
  }
  // </editor-fold>
}
