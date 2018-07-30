package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Order extends ApiResource implements HasId, MetadataStore<Order> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long amountReturned;
  String application;
  Long applicationFee;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  String email;
  String externalCouponCode;
  List<OrderItem> items;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  OrderReturnCollection returns;
  String selectedShippingMethod;
  ShippingDetails shipping;
  List<ShippingMethod> shippingMethods;
  String status;
  StatusTransitions statusTransitions;
  Long updated;
  String upstreamId;

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

  public void setCustomerObject(Customer customer) {
    this.customer = new ExpandableField<Customer>(customer.getId(), customer);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an order.
   */
  public static Order create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create an order.
   */
  public static Order create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Order.class), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all orders.
   */
  public static OrderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all orders.
   */
  public static OrderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Order.class), params, OrderCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="pay">
  /**
   * Pay an order.
   */
  public Order pay(Map<String, Object> params) throws StripeException {
    return this.pay(params, null);
  }

  /**
   * Pay an order.
   */
  public Order pay(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, String.format("%s/pay",
        instanceUrl(Order.class, this.getId())), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Order.class, id), null, Order.class, options);
  }

  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Order.class, id), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="returnOrder">
  /**
   * Return an order.
   */
  public OrderReturn returnOrder(Map<String, Object> params) throws StripeException {
    return this.returnOrder(params, null);
  }

  /**
   * Return an order.
   */
  public OrderReturn returnOrder(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/returns",
        instanceUrl(Order.class, this.getId())), params, OrderReturn.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an order.
   */
  @Override
  public Order update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update an order.
   */
  @Override
  public Order update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Order.class, this.id), params, Order.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingMethod extends StripeObject {
    String id;
    Long amount;
    String currency;
    String description;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    Long canceled;
    Long fulfiled;
    Long paid;
    Long returned;
  }
}
