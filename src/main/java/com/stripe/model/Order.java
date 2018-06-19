package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
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
public class Order extends APIResource implements HasId, MetadataStore<Order> {
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

  public void setCharge(String chargeID) {
    this.charge = setExpandableFieldID(chargeID, this.charge);
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

  public void setCustomer(String customerID) {
    this.customer = setExpandableFieldID(customerID, this.customer);
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
  public static Order create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create an order.
   */
  public static Order create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Order.class), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all orders.
   */
  public static OrderCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all orders.
   */
  public static OrderCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Order.class), params, OrderCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="pay">
  /**
   * Pay an order.
   */
  public Order pay(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.pay(params, null);
  }

  /**
   * Pay an order.
   */
  public Order pay(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/pay",
        instanceURL(Order.class, this.getId())), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Order.class, id), null, Order.class, options);
  }

  /**
   * Retrieve an order.
   */
  public static Order retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Order.class, id), params, Order.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="returnOrder">
  /**
   * Return an order.
   */
  public OrderReturn returnOrder(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.returnOrder(params, null);
  }

  /**
   * Return an order.
   */
  public OrderReturn returnOrder(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/returns",
        instanceURL(Order.class, this.getId())), params, OrderReturn.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an order.
   */
  @Override
  public Order update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update an order.
   */
  @Override
  public Order update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Order.class, this.id), params, Order.class,
        options);
  }
  // </editor-fold>
}
