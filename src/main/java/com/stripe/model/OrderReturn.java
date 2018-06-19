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
public class OrderReturn extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  String currency;
  List<OrderItem> items;
  Boolean livemode;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Order> order;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Refund> refund;

  // <editor-fold desc="order">
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String orderID) {
    this.order = setExpandableFieldID(orderID, this.order);
  }

  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order order) {
    this.order = new ExpandableField<Order>(order.getId(), order);
  }
  // </editor-fold>

  // <editor-fold desc="refund">
  public String getRefund() {
    return (this.refund != null) ? this.refund.getId() : null;
  }

  public void setRefund(String refundID) {
    this.refund = setExpandableFieldID(refundID, this.refund);
  }

  public Refund getRefundObject() {
    return (this.refund != null) ? this.refund.getExpanded() : null;
  }

  public void setRefundObject(Refund refund) {
    this.refund = new ExpandableField<Refund>(refund.getId(), refund);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all order returns.
   */
  public static OrderReturnCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all order returns.
   */
  public static OrderReturnCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(OrderReturn.class), params, OrderReturnCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an order return.
   */
  public static OrderReturn retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an order return.
   */
  public static OrderReturn retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(OrderReturn.class, id), null, OrderReturn.class,
        options);
  }
  // </editor-fold>
}
